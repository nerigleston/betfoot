import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Empacota os dados do jogo (pasta jogo/) num zip que o Betfoot extrai para a pasta do usuário.
 *
 * Num zip os nomes vão em UTF-8: alguns arquivos de teams/ têm caracteres de uso privado (ex.: "cracvia_pl.ban",
 * referenciados assim dentro dos próprios .ban), que o WiX do instalador do Windows não aceita como nome de arquivo.
 *
 *   java empacotamento/Dados.java jogo build/pacote/entrada/jogo.zip <versão>
 */
public class Dados {
    public static void main(String[] args) throws IOException {
        Path raiz = Paths.get(args[0]);
        List<Path> arquivos;
        try (Stream<Path> s = Files.walk(raiz)) {
            arquivos = s.filter(Files::isRegularFile).filter(p -> incluir(raiz.relativize(p))).sorted()
                    .collect(Collectors.toList());
        }
        try (OutputStream out = Files.newOutputStream(Paths.get(args[1]));
             ZipOutputStream zip = new ZipOutputStream(out, StandardCharsets.UTF_8)) {
            zip.putNextEntry(new ZipEntry(".versao"));
            zip.write(args[2].getBytes(StandardCharsets.UTF_8));
            for (Path p : arquivos) {
                zip.putNextEntry(new ZipEntry(raiz.relativize(p).toString().replace('\\', '/')));
                Files.copy(p, zip);
            }
        }
        System.out.println(args[1] + ": " + arquivos.size() + " arquivos");
    }

    static boolean incluir(Path rel) {
        String topo = rel.getName(0).toString();
        if (topo.equals(".betfoot") || topo.equals("$PLUGINSDIR") || topo.equals("bf26-27.jar")) {
            return false;
        }
        for (Path parte : rel) {
            String n = parte.toString();
            if (n.startsWith("._") || n.equals(".DS_Store")) {
                return false;
            }
        }
        String nome = rel.getFileName().toString();
        return !nome.endsWith(".command") && !nome.endsWith(".original");
    }
}
