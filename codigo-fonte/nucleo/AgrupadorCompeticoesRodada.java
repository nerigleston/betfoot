package nucleo;

import telas.PainelPartidaAoVivo;
import nucleo.ModeloPartida;
import nucleo.LigaNacional;
import nucleo.Calendario;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.Competicao;
import nucleo.GerenciadorTelas;
import nucleo.CarregadorConfigEstadual;
import components.GrupoCompeticoesRodada;
import competicoes.CompeticaoLigaNacional;
import competicoes.ChaveMataMata;
import java.util.ArrayList;
import javax.swing.JPanel;

public abstract class AgrupadorCompeticoesRodada {
    private static ArrayList cP = new ArrayList();
    private static ArrayList cQ = new ArrayList();
    private static JPanel cR = null;
    private static ArrayList cS = new ArrayList();
    private static CarregadorConfigEstadual cT = null;
    private static int cU = -1;
    private static int cV = -1;
    private static Competicao cW = null;

    public static boolean dw() {
        boolean bl = false;
        int n2 = -1;
        int n3 = -1;
        boolean[] blArray = motor.GerenciadorJogo.SR.getVerJint();
        int n4 = 0;
        while (n4 < motor.GerenciadorJogo.SR.S().size()) {
            if (n2 == -1) {
                n2 = ((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hy().b();
                n3 = ((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hy().el();
            }
            if (((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hc().jZ().booleanValue() || ((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hd().jZ().booleanValue()) {
                bl = true;
                break;
            }
            ++n4;
        }
        if (!bl) {
            if (n2 == 0) {
                return false;
            }
            n4 = motor.GerenciadorJogo.SR.ae(n2, n3);
            if (n4 < blArray.length) {
                return blArray[n4];
            }
        }
        return true;
    }

    public static boolean b(Competicao at2) {
        int n2 = at2.b();
        int n3 = at2.gg();
        boolean[] blArray = motor.GerenciadorJogo.SR.getVerJint();
        int n4 = 0;
        while (n4 < motor.GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hy() == at2 && (((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hc().jZ().booleanValue() || ((ModeloPartida)motor.GerenciadorJogo.SR.S().get(n4)).hd().jZ().booleanValue())) {
                return true;
            }
            ++n4;
        }
        if (n2 == 0) {
            return false;
        }
        n4 = motor.GerenciadorJogo.SR.ae(n2, n3);
        if (n4 < blArray.length) {
            return blArray[n4];
        }
        return true;
    }

    public static void dx() {
        cS.clear();
        cU = -1;
        cV = -1;
        cW = null;
        cP.clear();
        cP.addAll(((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).t());
        if (cP.size() > 0) {
            if (motor.GerenciadorJogo.SR.bs) {
                cR = GerenciadorTelas.aY(4);
            }
            if (((Competicao)cP.get(0)).b() == 1) {
                AgrupadorCompeticoesRodada.dI();
            } else if (((Competicao)cP.get(0)).b() == 2) {
                AgrupadorCompeticoesRodada.dF();
            } else if (((Competicao)cP.get(0)).b() == 3) {
                AgrupadorCompeticoesRodada.dE();
            } else if (((Competicao)cP.get(0)).b() == 7) {
                AgrupadorCompeticoesRodada.dA();
            } else if (((Competicao)cP.get(0)).b() == 8) {
                AgrupadorCompeticoesRodada.dz();
            } else if (((Competicao)cP.get(0)).b() == 9) {
                AgrupadorCompeticoesRodada.dC();
            } else if (((Competicao)cP.get(0)).b() == 10) {
                AgrupadorCompeticoesRodada.dD();
            } else if (((Competicao)cP.get(0)).b() == 11) {
                AgrupadorCompeticoesRodada.dB();
            } else {
                AgrupadorCompeticoesRodada.dy();
            }
        }
    }

    public static void dy() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < cP.size()) {
            cQ.clear();
            if (AgrupadorCompeticoesRodada.b((Competicao)cP.get(n3))) {
                cQ.add((Competicao)cP.get(n3));
                if (cQ.size() > 0) {
                    GrupoCompeticoesRodada a_02 = new GrupoCompeticoesRodada();
                    a_02.ub().addAll(cQ);
                    a_02.av(true);
                    cS.add(a_02);
                    cU = n2++;
                }
            }
            ++n3;
        }
        AgrupadorCompeticoesRodada.dJ();
    }

    public static void dz() {
        cQ.clear();
        int n2 = 0;
        while (n2 < cP.size()) {
            cQ.add((Competicao)cP.get(n2));
            ++n2;
        }
        ((PainelPartidaAoVivo)cR).Y(cQ);
    }

    public static void dA() {
        cQ.clear();
        int n2 = 0;
        while (n2 < cP.size()) {
            cQ.add((Competicao)cP.get(n2));
            ++n2;
        }
        ((PainelPartidaAoVivo)cR).Y(cQ);
    }

    public static void dB() {
        cQ.clear();
        int n2 = 0;
        while (n2 < cP.size()) {
            cQ.add((Competicao)cP.get(n2));
            ++n2;
        }
        ((PainelPartidaAoVivo)cR).Y(cQ);
    }

    public static void dC() {
        cQ.clear();
        int n2 = 0;
        while (n2 < cP.size()) {
            cQ.add((Competicao)cP.get(n2));
            ++n2;
        }
        ((PainelPartidaAoVivo)cR).Y(cQ);
    }

    public static void dD() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.bV().length) {
            int n3 = 0;
            while (n3 < cP.size()) {
                if (cP.get(n3) == motor.GerenciadorJogo.SR.bV()[n2] && !cQ.contains(cP.get(n3))) {
                    cQ.add((Competicao)cP.get(n3));
                }
                ++n3;
            }
            ++n2;
        }
        ((PainelPartidaAoVivo)cR).Y(cQ);
    }

    public static void dE() {
        cQ.clear();
        if (motor.GerenciadorJogo.SR.isVerEstaduaisAgrupados()) {
            int n2 = 0;
            while (n2 < motor.GerenciadorJogo.SR.aE().size()) {
                int n3 = 0;
                while (n3 < cP.size()) {
                    if (((Competicao)cP.get(n3)).ir() == motor.GerenciadorJogo.SR.aE().get(n2)) {
                        cQ.add((Competicao)cP.get(n3));
                    }
                    ++n3;
                }
                ++n2;
            }
            ((PainelPartidaAoVivo)cR).Y(cQ);
        } else {
            int n4 = 0;
            while (n4 < motor.GerenciadorJogo.SR.aE().size()) {
                if (((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n4)).ei() && ((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n4)).ej()) {
                    cQ.clear();
                    cU = ((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n4)).getEstado();
                    int n5 = 0;
                    while (n5 < cP.size()) {
                        if (((Competicao)cP.get(n5)).ir() == motor.GerenciadorJogo.SR.aE().get(n4)) {
                            cQ.add((Competicao)cP.get(n5));
                        }
                        ++n5;
                    }
                    if (cQ.size() > 0) {
                        GrupoCompeticoesRodada a_02 = new GrupoCompeticoesRodada();
                        a_02.ub().addAll(cQ);
                        a_02.av(true);
                        cS.add(a_02);
                    }
                }
                ++n4;
            }
            if (cQ.size() == 0) {
                int[] nArray = new int[]{motor.GerenciadorJogo.SR.by(), 25, 18, 22, 17, 10};
                boolean bl = false;
                int n6 = 0;
                while (n6 < nArray.length) {
                    int n7 = motor.GerenciadorJogo.SR.aE().size() - 1;
                    while (n7 >= 0) {
                        if (((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n7)).getEstado() == nArray[n6] && ((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n7)).ej()) {
                            cU = ((CarregadorConfigEstadual)motor.GerenciadorJogo.SR.aE().get(n7)).getEstado();
                            bl = true;
                            cQ.clear();
                            int n8 = 0;
                            while (n8 < cP.size()) {
                                if (((Competicao)cP.get(n8)).ir() == motor.GerenciadorJogo.SR.aE().get(n7)) {
                                    cQ.add((Competicao)cP.get(n8));
                                }
                                ++n8;
                            }
                            if (cQ.size() > 0) {
                                GrupoCompeticoesRodada a_03 = new GrupoCompeticoesRodada();
                                a_03.ub().addAll(cQ);
                                a_03.av(true);
                                cS.add(a_03);
                            }
                        }
                        --n7;
                    }
                    if (bl) break;
                    ++n6;
                }
            }
            AgrupadorCompeticoesRodada.dJ();
        }
    }

    public static void dF() {
        int n2;
        int n3;
        boolean bl = false;
        cQ.clear();
        if (bl) {
            n3 = 0;
            while (n3 < motor.GerenciadorJogo.SR.N().size()) {
                n2 = 0;
                while (n2 < cP.size()) {
                    if (((Competicao)cP.get(n2)).iq() == motor.GerenciadorJogo.SR.N().get(n3)) {
                        cQ.add((Competicao)cP.get(n2));
                    }
                    ++n2;
                }
                ++n3;
            }
            ((PainelPartidaAoVivo)cR).Y(cQ);
        }
        if (!bl) {
            n3 = 0;
            while (n3 < motor.GerenciadorJogo.SR.N().size()) {
                n2 = 0;
                if (((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).ju() && ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).jv()) {
                    n2 = 1;
                }
                if (n2 != 0) {
                    cQ.clear();
                    int n4 = 0;
                    while (n4 < cP.size()) {
                        cW = (Competicao)cP.get(n4);
                        if (cP.get(n4) == ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).jq()) {
                            cQ.add((Competicao)cP.get(n4));
                        }
                        ++n4;
                    }
                    if (cQ.size() > 0) {
                        GrupoCompeticoesRodada a_02 = new GrupoCompeticoesRodada();
                        a_02.ub().addAll(cQ);
                        a_02.av(true);
                        cS.add(a_02);
                    }
                }
                ++n3;
            }
            if (cQ.size() == 0) {
                n3 = motor.GerenciadorJogo.SR.bA();
                n2 = 0;
                int n5 = motor.GerenciadorJogo.SR.N().size() - 1;
                while (n5 >= 0) {
                    if (((LigaNacional)motor.GerenciadorJogo.SR.N().get(n5)).jc() == n3 && ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n5)).jv()) {
                        n2 = 1;
                        cQ.clear();
                        int n6 = 0;
                        while (n6 < cP.size()) {
                            cW = (Competicao)cP.get(n6);
                            if (cP.get(n6) == ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n5)).jq()) {
                                cQ.add((Competicao)cP.get(n6));
                            }
                            ++n6;
                        }
                        if (cQ.size() <= 0) break;
                        GrupoCompeticoesRodada a_03 = new GrupoCompeticoesRodada();
                        a_03.ub().addAll(cQ);
                        a_03.av(true);
                        cS.add(a_03);
                        break;
                    }
                    --n5;
                }
            }
            AgrupadorCompeticoesRodada.dJ();
        }
    }

    public static boolean dG() {
        int n2 = 0;
        while (n2 < ((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().size()) {
            competicoes.LigaPontosCorridos s2 = null;
            Competicao at2 = null;
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().get(n2) instanceof competicoes.LigaPontosCorridos) {
                s2 = (competicoes.LigaPontosCorridos)((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().get(n2);
            } else if (((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().get(n2) instanceof ChaveMataMata && (s2 = (competicoes.LigaPontosCorridos)((ChaveMataMata)((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().get(n2)).zy()) == null && (at2 = ((ChaveMataMata)((Calendario)motor.GerenciadorJogo.SR.R().get(motor.GerenciadorJogo.SR.J())).j().get(n2)).yT()) instanceof CompeticaoLigaNacional) {
                s2 = ((CompeticaoLigaNacional)at2).yi();
            }
            if (s2 != null && s2.ei()) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean d(int n2, int n3) {
        boolean bl = false;
        String[] stringArray = new String[]{"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
        Integer[][] integerArrayArray = new Integer[][]{{18, 25}, {10, 17, 22, 23}, {1, 4, 5, 9, 14, 15, 16, 19, 24}, {0, 2, 3, 6, 7, 8, 11, 12, 13, 20, 21, 26}};
        int n4 = 0;
        while (n4 < integerArrayArray[n3].length) {
            if (integerArrayArray[n3][n4] == n2) {
                bl = true;
            }
            ++n4;
        }
        return bl;
    }

    public static boolean dH() {
        boolean bl = false;
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.bV().length) {
            if (motor.GerenciadorJogo.SR.bV()[n2] != null) {
                int n3 = 0;
                while (n3 < motor.GerenciadorJogo.SR.M().size()) {
                    ModeloTime ah2 = ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).fg();
                    if (ah2 != null && ah2.getPais() == 29 && AgrupadorCompeticoesRodada.d(ah2.getEstado(), n2)) {
                        bl = true;
                    } else if (ah2 == null && !motor.GerenciadorJogo.SR.isIgnoraEstadual() && ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF() != null && ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF().getPais() == 29 && AgrupadorCompeticoesRodada.d(((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF().getEstado(), n2)) {
                        bl = true;
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        return bl;
    }

    public static boolean J(int n2) {
        boolean bl = false;
        boolean bl2 = true;
        int n3 = 0;
        while (n3 < motor.GerenciadorJogo.SR.M().size()) {
            ModeloTime ah2 = ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).fg();
            if (ah2 != null && ah2.getPais() == 29) {
                bl = true;
                if (ah2.getEstado() != 18) {
                    bl2 = false;
                }
            } else if (ah2 == null && ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF() != null && ((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF().getPais() == 29) {
                bl = true;
                if (((Campeonato)motor.GerenciadorJogo.SR.M().get(n3)).lF().getEstado() != 18) {
                    bl2 = false;
                }
            }
            ++n3;
        }
        return bl;
    }

    public static void dI() {
        int n2;
        int n3;
        boolean bl = false;
        cQ.clear();
        if (bl) {
            n3 = 0;
            while (n3 < motor.GerenciadorJogo.SR.N().size()) {
                n2 = 0;
                while (n2 < cP.size()) {
                    if (((Competicao)cP.get(n2)).iq() == motor.GerenciadorJogo.SR.N().get(n3)) {
                        cQ.add((Competicao)cP.get(n2));
                    }
                    ++n2;
                }
                ++n3;
            }
            ((PainelPartidaAoVivo)cR).Y(cQ);
        }
        if (!bl) {
            n3 = 0;
            while (n3 < motor.GerenciadorJogo.SR.N().size()) {
                n2 = 0;
                if ((((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).ei() || ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).jr()) && ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).ej()) {
                    n2 = 1;
                }
                if (n2 != 0) {
                    cU = ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n3)).jc();
                    cQ.clear();
                    int n4 = 0;
                    while (n4 < cP.size()) {
                        if (((Competicao)cP.get(n4)).iq() == motor.GerenciadorJogo.SR.N().get(n3)) {
                            cQ.add((Competicao)cP.get(n4));
                        }
                        ++n4;
                    }
                    if (cQ.size() > 0) {
                        GrupoCompeticoesRodada a_02 = new GrupoCompeticoesRodada();
                        a_02.ub().addAll(cQ);
                        a_02.av(true);
                        cS.add(a_02);
                    }
                }
                ++n3;
            }
            if (cQ.size() == 0) {
                int[] nArray = new int[]{motor.GerenciadorJogo.SR.bz()};
                n2 = 0;
                int n5 = 0;
                while (n5 < nArray.length) {
                    int n6 = motor.GerenciadorJogo.SR.N().size() - 1;
                    while (n6 >= 0) {
                        if (((LigaNacional)motor.GerenciadorJogo.SR.N().get(n6)).jc() == nArray[n5] && ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n6)).ej()) {
                            cU = ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n6)).jc();
                            n2 = 1;
                            cQ.clear();
                            int n7 = 0;
                            while (n7 < cP.size()) {
                                if (((Competicao)cP.get(n7)).iq() == motor.GerenciadorJogo.SR.N().get(n6)) {
                                    cQ.add((Competicao)cP.get(n7));
                                }
                                ++n7;
                            }
                            if (cQ.size() > 0) {
                                GrupoCompeticoesRodada a_03 = new GrupoCompeticoesRodada();
                                a_03.ub().addAll(cQ);
                                a_03.av(true);
                                cS.add(a_03);
                            }
                        }
                        --n6;
                    }
                    if (n2 != 0) break;
                    ++n5;
                }
            }
            AgrupadorCompeticoesRodada.dJ();
        }
    }

    public static void dJ() {
        int n2 = AgrupadorCompeticoesRodada.dK();
        if (n2 >= 0) {
            ((GrupoCompeticoesRodada)cS.get(n2)).av(false);
            ((PainelPartidaAoVivo)cR).Y(((GrupoCompeticoesRodada)cS.get(n2)).ub());
        } else {
            ((PainelPartidaAoVivo)AgrupadorCompeticoesRodada.cR).GO = null;
            cR = null;
            motor.GerenciadorJogo.SR.at();
        }
    }

    public static int dK() {
        int n2 = 0;
        while (n2 < cS.size()) {
            if (((GrupoCompeticoesRodada)cS.get(n2)).uc()) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static int dL() {
        return cU;
    }

    public static int dM() {
        return cV;
    }

    public static void L(int n2) {
        cV = n2;
    }

    public static Competicao dN() {
        return cW;
    }
}

