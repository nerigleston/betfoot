import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/* Gera arquivos .ban (classes e.t/e.g do bf26-27.jar) a partir de especificações TSV.
 * Uso: java -cp bf26-27.jar:. GeraTime <modelo.ban> <pasta-saida> <spec.tsv>...
 * Linha T: fileRef, nome, estado, nivel, estadio, capacidade, tecnico, cor1, cor2
 * Linha P: nome, pais, idade, posicao, status, cr1, cr2, lado, hash, tid */
public class GeraTime {
    public static void main(String[] a) throws Exception {
        e.t modelo;
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(a[0])))) { modelo = (e.t) in.readObject(); }
        Path saida = Paths.get(a[1]);
        for (int k = 2; k < a.length; k++) {
            e.t t = null; ArrayList<e.g> js = new ArrayList<>();
            for (String l : Files.readAllLines(Paths.get(a[k]), StandardCharsets.UTF_8)) {
                String[] c = l.split("\t", -1);
                if (c[0].equals("T")) {
                    t = new e.t();
                    t.setValid(modelo.isValid()); t.setId(0); t.setPais(29); t.setReputacao(0); t.setCorBase(modelo.getCorBase());
                    t.setTecNac(29); t.setTid(0); t.setSid(0); t.setAid(0); t.setVid(modelo.getVid());
                    t.setFileRef(c[1]); t.setNome(c[2]); t.setEstado(Integer.parseInt(c[3])); t.setNivel(Integer.parseInt(c[4]));
                    t.setEstadio(c[5]); t.setCapacidade(Integer.parseInt(c[6])); t.setTecnico(c[7]); t.setCor1(c[8]); t.setCor2(c[9]);
                } else if (c[0].equals("P")) {
                    e.g j = new e.g();
                    j.setNome(c[1]); j.setPais(Integer.parseInt(c[2])); j.setIdade(Integer.parseInt(c[3])); j.setPosicao(Integer.parseInt(c[4]));
                    j.setStatus(Integer.parseInt(c[5])); j.setCr1(Integer.parseInt(c[6])); j.setCr2(Integer.parseInt(c[7])); j.setLado(Integer.parseInt(c[8]));
                    j.setHash(Integer.parseInt(c[9])); j.setTid(Integer.parseInt(c[10])); j.setSid(0); j.setAid(0); j.setEstrela(false); j.setTopMundial(false);
                    js.add(j);
                }
            }
            t.setJogadores(js); t.setJuniores(new ArrayList<>());
            Path f = saida.resolve(t.getFileRef() + ".ban");
            try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(f)))) { out.writeObject(t); }
            System.out.println("gerado " + f.getFileName() + " (" + js.size() + " jogadores)");
        }
    }
}
