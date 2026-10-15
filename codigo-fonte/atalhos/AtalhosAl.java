package atalhos;

import java.util.ArrayList;

/*
 * a.al não consegue nomear estes tipos: no pacote a, as classes a.b e a.f escondem
 * os pacotes b e f, e os nomes simples (a_0, b_0, l_0, d, e) já estão ocupados por
 * outros imports do arquivo.
 */
public final class AtalhosAl {
    private AtalhosAl() {
    }

    public static boolean ehA_0(Object object) {
        return object instanceof competicoes.CompeticaoMundialDeClubes;
    }

    public static boolean ehD(Object object) {
        return object instanceof competicoes.CompeticaoCopaAmerica;
    }

    public static boolean ehE(Object object) {
        return object instanceof competicoes.CompeticaoCopaAsia;
    }

    public static tabelas.RenderizadorTabelaChaveamento novoB_0() {
        return new tabelas.RenderizadorTabelaChaveamento();
    }

    public static tabelas.ModeloTabelaListaJogos novoL_0(ArrayList arrayList) {
        return new tabelas.ModeloTabelaListaJogos(arrayList);
    }
}
