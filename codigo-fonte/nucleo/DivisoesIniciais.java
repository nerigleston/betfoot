package nucleo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * Divisões reais de início de carreira. Sem estas listas o jogo decide a divisão de cada clube só pelo nível
 * (os mais fortes na 1ª divisão), o que não reproduz o calendário real: um clube pode estar na Série C nacional e
 * na 2ª divisão do estadual, abaixo de outro que não disputa nenhuma série nacional.
 *
 * Arquivos (na pasta de dados do jogo), uma linha por clube: "<divisão>\t<arquivo do time>" (o resto da linha é
 * comentário; linhas com # são ignoradas):
 *   conf_ligas_nacionais/divisoes.txt   divisão 1..4 = Séries A..D do Brasileirão
 *   conf_estadual/divisoes.txt          divisão 1..2 = 1ª e 2ª divisão do estadual
 * Os clubes listados entram na ordem das divisões; os não listados vêm depois, pelo nível, como antes.
 */
public final class DivisoesIniciais {
    private static Map<String, Integer> nacional;
    private static Map<String, Integer> estadual;

    private DivisoesIniciais() {
    }

    public static void ordenarNacional(ArrayList lista, Comparator porNivel) {
        if (nacional == null) {
            nacional = ler("conf_ligas_nacionais/divisoes.txt");
        }
        ordenar(lista, nacional, porNivel);
    }

    public static void ordenarEstadual(ArrayList lista, Comparator porNivel) {
        if (estadual == null) {
            estadual = ler("conf_estadual/divisoes.txt");
        }
        ordenar(lista, estadual, porNivel);
    }

    /** Série do Brasileirão (1=A..4=D) do time pelo arquivo, ou 0 se não estiver em nenhuma. */
    public static int serieNacional(String arquivo) {
        if (nacional == null) {
            nacional = ler("conf_ligas_nacionais/divisoes.txt");
        }
        return nacional.getOrDefault(arquivo, 0);
    }

    /** Divisão do estadual (1 ou 2) do time pelo arquivo, ou 0 se não estiver em nenhuma. */
    public static int divisaoEstadual(String arquivo) {
        if (estadual == null) {
            estadual = ler("conf_estadual/divisoes.txt");
        }
        return estadual.getOrDefault(arquivo, 0);
    }

    private static void ordenar(ArrayList lista, Map<String, Integer> divisoes, Comparator porNivel) {
        Collections.sort(lista, porNivel);
        if (divisoes.isEmpty()) {
            return;
        }
        Collections.sort(lista, Comparator.comparingInt(t -> divisoes.getOrDefault(((ModeloTime) t).jY(), Integer.MAX_VALUE)));
    }

    private static Map<String, Integer> ler(String arquivo) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        Path caminho = Paths.get(System.getProperty("user.dir"), arquivo);
        if (!Files.exists(caminho)) {
            return mapa;
        }
        try {
            for (String linha : Files.readAllLines(caminho, StandardCharsets.UTF_8)) {
                String[] campos = linha.trim().split("\t");
                if (campos.length < 2 || campos[0].startsWith("#")) {
                    continue;
                }
                mapa.put(campos[1].trim(), Integer.parseInt(campos[0].trim()));
            }
        }
        catch (IOException | NumberFormatException exception) {
            exception.printStackTrace();
            mapa.clear();
        }
        return mapa;
    }
}
