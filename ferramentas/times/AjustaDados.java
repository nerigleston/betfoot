import java.io.*;
import java.nio.file.*;
import java.util.*;

/* Ajustes nos dados do jogo com as classes do bf26-27.jar (mesmos nomes serializados).
 *   nivel <arquivo.ban> <nivel>              muda o nível de um time
 *   ces <modelo.ces> <saida.ces> <idEstado> <formulaDiv1> <formulaDiv2>   grava a configuração de um estadual */
public class AjustaDados {
    public static void main(String[] a) throws Exception {
        if (a[0].equals("nivel")) {
            e.t t = (e.t) ler(a[1]);
            int antes = t.getNivel(); t.setNivel(Integer.parseInt(a[2])); gravar(a[1], t);
            System.out.println(a[1] + ": nível " + antes + " -> " + a[2]);
        } else if (a[0].equals("ces")) {
            est.ArrayLigaEType arr = (est.ArrayLigaEType) ler(a[1]);
            int id = Integer.parseInt(a[3]), f1 = Integer.parseInt(a[4]), f2 = Integer.parseInt(a[5]);
            for (Object o : arr.a) {
                est.ConfigEstadualType c = (est.ConfigEstadualType) o;
                campo(c, "id", id);   // setFormula carrega tabelas que dependem do idioma do jogo: grava o campo direto
                if (c.getDivisao() == 1) campo(c, "formula", f1);
                if (c.getDivisao() == 2) campo(c, "formula", f2);
            }
            gravar(a[2], arr);
            System.out.println(a[2] + ": estado " + id + " div1=" + f1 + " div2=" + f2);
        }
    }
    static void campo(Object o, String nome, int valor) throws Exception {
        java.lang.reflect.Field f = o.getClass().getDeclaredField(nome); f.setAccessible(true); f.setInt(o, valor);
    }
    static Object ler(String f) throws Exception { try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) { return in.readObject(); } }
    static void gravar(String f, Object o) throws Exception { try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) { out.writeObject(o); } }
}
