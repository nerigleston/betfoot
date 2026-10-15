package lancador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;

/**
 * Ponto de entrada dos instaladores (.exe, .dmg, .AppImage).
 *
 * O Betfoot lê e grava tudo em System.getProperty("user.dir") (sav/, options.bcf, teams/, conf_*), e a pasta do
 * aplicativo instalado não é gravável. Então os dados que vêm no pacote (jogo.zip, ao lado deste jar) são extraídos
 * para uma pasta do usuário, o user.dir passa a apontar para ela e o jogo (nucleo.LancadorBetfoot) roda no mesmo processo.
 *
 * Numa versão nova do pacote, cada arquivo é atualizado só se o usuário não o alterou (comparando com o hash do que
 * foi copiado antes, em .instalado); sav/ e options.bcf nunca são sobrescritos.
 */
public final class Lancador {
    private static final String NOME = "Betfoot 26-27";
    private static final String REGISTRO = ".instalado";

    public static void main(String[] args) throws Exception {
        Path dados = pastaDoUsuario();
        try {
            Path pacote = Paths.get(Lancador.class.getProtectionDomain().getCodeSource().getLocation().toURI())
                    .getParent().resolve("jogo.zip");
            sincronizar(pacote, dados);
            Path log = dados.resolve("betfoot.log");
            PrintStream saida = new PrintStream(Files.newOutputStream(log), true, "UTF-8");
            System.setOut(saida);
            System.setErr(saida);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível preparar " + dados + "\n\n" + e,
                    NOME, JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        System.setProperty("user.dir", dados.toString());
        Method main = Class.forName("nucleo.LancadorBetfoot").getMethod("main", String[].class);
        main.invoke(null, (Object) args);
    }

    static Path pastaDoUsuario() {
        String os = System.getProperty("os.name").toLowerCase();
        Path home = Paths.get(System.getProperty("user.home"));
        if (os.contains("win")) {
            String appdata = System.getenv("APPDATA");
            return (appdata != null ? Paths.get(appdata) : home.resolve("AppData").resolve("Roaming")).resolve(NOME);
        }
        if (os.contains("mac")) {
            return home.resolve("Library").resolve("Application Support").resolve(NOME);
        }
        String xdg = System.getenv("XDG_DATA_HOME");
        return (xdg != null && !xdg.isEmpty() ? Paths.get(xdg) : home.resolve(".local").resolve("share"))
                .resolve("betfoot-26-27");
    }

    static void sincronizar(Path pacote, Path dados) throws IOException {
        try (ZipFile zip = new ZipFile(pacote.toFile(), StandardCharsets.UTF_8)) {
            ZipEntry versao = zip.getEntry(".versao");
            String nova = versao == null ? "" : new String(ler(zip, versao), StandardCharsets.UTF_8).trim();
            Path registro = dados.resolve(REGISTRO);
            Properties antes = new Properties();
            if (Files.exists(registro)) {
                try (Reader in = Files.newBufferedReader(registro, StandardCharsets.UTF_8)) {
                    antes.load(in);
                }
                if (nova.equals(antes.getProperty(".versao"))) {
                    return;
                }
            }
            Properties depois = new Properties();
            depois.setProperty(".versao", nova);
            for (ZipEntry e : Collections.list(zip.entries())) {
                String rel = e.getName();
                if (e.isDirectory() || rel.equals(".versao")) {
                    continue;
                }
                Path destino = dados.resolve(rel).normalize();
                if (!destino.startsWith(dados)) {
                    continue;
                }
                byte[] novo = ler(zip, e);
                String hash = sha1(novo);
                String anterior = antes.getProperty(rel);
                boolean doUsuario = rel.startsWith("sav/") || rel.equals("options.bcf");
                if (!Files.exists(destino)) {
                    Files.createDirectories(destino.getParent());
                    Files.write(destino, novo);
                } else if (anterior != null && !anterior.equals(sha1(Files.readAllBytes(destino)))) {
                    depois.setProperty(rel, anterior);  // alterado pelo usuário: fica como está
                    continue;
                } else if (!doUsuario && anterior != null && !anterior.equals(hash)) {
                    Files.write(destino, novo);
                }
                depois.setProperty(rel, hash);
            }
            Files.createDirectories(dados);
            try (Writer out = Files.newBufferedWriter(registro, StandardCharsets.UTF_8)) {
                depois.store(out, NOME);
            }
        }
    }

    static byte[] ler(ZipFile zip, ZipEntry e) throws IOException {
        try (InputStream in = zip.getInputStream(e)) {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            for (int n; (n = in.read(buf)) > 0; ) {
                b.write(buf, 0, n);
            }
            return b.toByteArray();
        }
    }

    static String sha1(byte[] dados) {
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b : MessageDigest.getInstance("SHA-1").digest(dados)) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
