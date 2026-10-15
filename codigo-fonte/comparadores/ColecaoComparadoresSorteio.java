package comparadores;

import comparadores.ComparadorJogadorPosicaoForca;
import comparadores.ComparadorEquipeNomeNivel;
import comparadores.ComparadorJogadorForcaE;
import comparadores.ComparadorJogadorFinalizacao;
import comparadores.ComparadorLigaDivisao;
import comparadores.ComparadorJogadorTecnica;
import comparadores.ComparadorClubeNivel;
import comparadores.ComparadorJogadorVelocidade;
import comparadores.ComparadorClubeNome;
import comparadores.ComparadorJogadorPasse;
import comparadores.ComparadorEntidadeNome;
import comparadores.ComparadorJogadorNumeroCamisa;
import comparadores.ComparadorJogadorNome;
import comparadores.ComparadorJogadorAtributoE;
import comparadores.ComparadorJogadorClube;
import comparadores.ComparadorEstadioCapacidade;
import comparadores.ComparadorJogadorCpe;
import comparadores.ComparadorTimeRegiaoGeografica;
import comparadores.ComparadorClubeReputacaoNivel;
import comparadores.ComparadorTimeZonaEstados;
import comparadores.ComparadorMelhoresTerceiros;
import comparadores.ComparadorJogadorValorPasse;
import comparadores.ComparadorJogadorDesenvolvimento;
import comparadores.ComparadorEquipeNivel;
import comparadores.ComparadorJogadorForca2;
import comparadores.ComparadorJogadorAVenda;
import comparadores.ComparadorJogadorGoleiro;
import comparadores.ComparadorJogadorParaEmprestimo;
import comparadores.ComparadorJogadorArmacao;
import comparadores.ComparadorJogadorPais;
import comparadores.ComparadorJogadorDesarme;
import comparadores.ComparadorJogadorSalario;
import comparadores.ComparadorJogadorLado;
import comparadores.ComparadorJogadorGolsCompeticao;
import comparadores.ComparadorJogadorAssistenciasTemporada;
import comparadores.ComparadorJogadorNotaMedia;
import comparadores.ComparadorJogadorIdade2;
import comparadores.ComparadorJogadorGolsClube;
import comparadores.ComparadorEquipeNome;
import comparadores.ComparadorJogadorRankingCompleto;
import comparadores.ComparadorJogadorPosicao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColecaoComparadoresSorteio {
    public static Comparator aaE = new ComparadorEquipeNomeNivel();
    public static Comparator aaF = new ComparadorEquipeNivel();
    public static Comparator aaG = new ComparadorEquipeNome();
    public static Comparator aaH = new ComparadorJogadorCpe();
    public static Comparator aaI = new ComparadorJogadorDesenvolvimento();
    public static Comparator aaJ = new ComparadorJogadorForca2();
    public static Comparator aaK = new ComparadorJogadorGoleiro();
    public static Comparator aaL = new ComparadorJogadorArmacao();
    public static Comparator aaM = new ComparadorJogadorDesarme();
    public static Comparator aaN = new ComparadorJogadorFinalizacao();
    public static Comparator aaO = new ComparadorJogadorTecnica();
    public static Comparator aaP = new ComparadorJogadorVelocidade();
    public static Comparator aaQ = new ComparadorJogadorPasse();
    public static Comparator aaR = new ComparadorJogadorNumeroCamisa();
    public static Comparator aaS = new ComparadorJogadorAtributoE();
    public static Comparator aaT = new ComparadorEstadioCapacidade();
    public static Comparator aaU = new ComparadorTimeRegiaoGeografica();
    public static Comparator aaV = new ComparadorTimeZonaEstados();
    public static Comparator aaW = new ComparadorJogadorValorPasse();
    public static Comparator aaX = new ComparadorJogadorAVenda();
    public static Comparator aaY = new ComparadorJogadorParaEmprestimo();
    public static Comparator cL = new ComparadorJogadorPais();
    public static Comparator aaZ = new ComparadorJogadorSalario();
    public static Comparator aba = new ComparadorJogadorLado();
    public static Comparator abb = new ComparadorJogadorGolsCompeticao();
    public static Comparator abc = new ComparadorJogadorAssistenciasTemporada();
    public static Comparator aab = new ComparadorJogadorNotaMedia();
    public static Comparator VU = new ComparadorJogadorIdade2();
    public static Comparator abd = new ComparadorJogadorGolsClube();
    public static Comparator abe = new ComparadorJogadorRankingCompleto();
    public static Comparator abf = new ComparadorJogadorPosicao();
    public static Comparator abg = new ComparadorJogadorPosicaoForca();
    public static Comparator abh = new ComparadorJogadorForcaE();
    public static Comparator abi = new ComparadorLigaDivisao();
    public static Comparator cN = new ComparadorClubeNivel();
    public static Comparator VS = new ComparadorClubeNome();
    public static Comparator abj = new ComparadorEntidadeNome();
    public static Comparator abk = new ComparadorJogadorNome();
    public static Comparator abl = new ComparadorJogadorClube();
    public static Comparator abm = new ComparadorClubeReputacaoNivel();
    public static Comparator abn = new ComparadorMelhoresTerceiros();

    public static ArrayList ac(int n2, int n3) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n4 = n2;
        while (n4 <= n3) {
            arrayList.add(n4);
            ++n4;
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static ArrayList Ak() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = ColecaoComparadoresSorteio.ac(0, 5);
        ArrayList arrayList3 = ColecaoComparadoresSorteio.ac(6, 11);
        ArrayList arrayList4 = ColecaoComparadoresSorteio.ac(12, 17);
        ArrayList arrayList5 = ColecaoComparadoresSorteio.ac(18, 23);
        int n2 = 0;
        while (n2 < 4) {
            int n3 = 0;
            while (n3 < 6) {
                arrayList.add((Integer)arrayList2.get(n3));
                arrayList.add((Integer)arrayList3.get(n3));
                arrayList.add((Integer)arrayList4.get(n3));
                arrayList.add((Integer)arrayList5.get(n3));
                ++n3;
            }
            ++n2;
        }
        return arrayList;
    }

    public static ArrayList Al() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = ColecaoComparadoresSorteio.ac(0, 1);
        ArrayList arrayList3 = ColecaoComparadoresSorteio.ac(2, 3);
        ArrayList arrayList4 = ColecaoComparadoresSorteio.ac(4, 5);
        ArrayList arrayList5 = ColecaoComparadoresSorteio.ac(6, 7);
        ArrayList arrayList6 = ColecaoComparadoresSorteio.ac(8, 9);
        int n2 = 0;
        while (n2 < 2) {
            arrayList.add((Integer)arrayList2.get(n2));
            arrayList.add((Integer)arrayList3.get(n2));
            arrayList.add((Integer)arrayList4.get(n2));
            arrayList.add((Integer)arrayList5.get(n2));
            arrayList.add((Integer)arrayList6.get(n2));
            ++n2;
        }
        return arrayList;
    }

    public static ArrayList Am() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = ColecaoComparadoresSorteio.ac(0, 1);
        ArrayList arrayList3 = ColecaoComparadoresSorteio.ac(2, 3);
        ArrayList arrayList4 = ColecaoComparadoresSorteio.ac(4, 5);
        ArrayList arrayList5 = ColecaoComparadoresSorteio.ac(6, 7);
        ArrayList arrayList6 = ColecaoComparadoresSorteio.ac(8, 9);
        ArrayList arrayList7 = ColecaoComparadoresSorteio.ac(10, 11);
        int n2 = 0;
        while (n2 < 2) {
            arrayList.add((Integer)arrayList2.get(n2));
            arrayList.add((Integer)arrayList3.get(n2));
            arrayList.add((Integer)arrayList4.get(n2));
            arrayList.add((Integer)arrayList5.get(n2));
            arrayList.add((Integer)arrayList6.get(n2));
            arrayList.add((Integer)arrayList7.get(n2));
            ++n2;
        }
        return arrayList;
    }

    public static ArrayList An() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = ColecaoComparadoresSorteio.ac(0, 4);
        ArrayList arrayList3 = ColecaoComparadoresSorteio.ac(5, 9);
        ArrayList arrayList4 = ColecaoComparadoresSorteio.ac(10, 14);
        ArrayList arrayList5 = ColecaoComparadoresSorteio.ac(15, 19);
        ArrayList arrayList6 = ColecaoComparadoresSorteio.ac(20, 24);
        ArrayList arrayList7 = ColecaoComparadoresSorteio.ac(25, 29);
        int n2 = 0;
        while (n2 < 5) {
            arrayList.add((Integer)arrayList2.get(n2));
            arrayList.add((Integer)arrayList3.get(n2));
            arrayList.add((Integer)arrayList4.get(n2));
            arrayList.add((Integer)arrayList5.get(n2));
            arrayList.add((Integer)arrayList6.get(n2));
            arrayList.add((Integer)arrayList7.get(n2));
            ++n2;
        }
        return arrayList;
    }

    public static ArrayList Ao() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = ColecaoComparadoresSorteio.ac(0, 8);
        ArrayList arrayList3 = ColecaoComparadoresSorteio.ac(9, 17);
        ArrayList arrayList4 = ColecaoComparadoresSorteio.ac(18, 26);
        ArrayList arrayList5 = ColecaoComparadoresSorteio.ac(27, 35);
        ArrayList arrayList6 = ColecaoComparadoresSorteio.ac(36, 44);
        ArrayList arrayList7 = ColecaoComparadoresSorteio.ac(45, 53);
        int n2 = 0;
        while (n2 < 9) {
            arrayList.add((Integer)arrayList2.get(n2));
            arrayList.add((Integer)arrayList3.get(n2));
            arrayList.add((Integer)arrayList4.get(n2));
            arrayList.add((Integer)arrayList5.get(n2));
            arrayList.add((Integer)arrayList6.get(n2));
            arrayList.add((Integer)arrayList7.get(n2));
            ++n2;
        }
        return arrayList;
    }

    public static ArrayList ad(int n2, int n3) {
        int n4 = n2 - 1;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        arrayList2 = ColecaoComparadoresSorteio.ac(0, n4);
        arrayList4 = ColecaoComparadoresSorteio.ac(n2, n2 + n4);
        arrayList3 = ColecaoComparadoresSorteio.ac(2 * n2, 2 * n2 + n4);
        arrayList5 = ColecaoComparadoresSorteio.ac(3 * n2, 3 * n2 + n4);
        int n5 = 0;
        while (n5 < n2) {
            arrayList.add((Integer)arrayList2.get(n5));
            arrayList.add((Integer)arrayList3.get(n5));
            arrayList.add((Integer)arrayList4.get(n5));
            arrayList.add((Integer)arrayList5.get(n5));
            ++n5;
        }
        return arrayList;
    }
}

