package nucleo;

import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.RegistroTemporadaTime;
import nucleo.BuscadorTimeDestinoTransferencia;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import competicoes.LigaPontosCorridos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class ProcessadorFimTemporada {
    private static transient ArrayList mT = new ArrayList();

    public static void jO() {
        ProcessadorFimTemporada.jS();
        ProcessadorFimTemporada.jU();
        ProcessadorFimTemporada.jR();
        ProcessadorFimTemporada.jP();
        ProcessadorFimTemporada.jT();
    }

    public static void jP() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.aG().size()) {
            if (((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn() != null) {
                if (!((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().jZ().booleanValue()) {
                    ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).z(false);
                } else {
                    int n3 = 2;
                    while (n3 < ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().kc().size()) {
                        if (((ModeloJogador)((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().kc().get(n3)).fg() == null) {
                            ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().kc().remove(((ModeloJogador)((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().kc().get(n3)).fg());
                        }
                        ++n3;
                    }
                }
            }
            ++n2;
        }
    }

    public static void jQ() {
        GerenciadorJogo.SR.bn().clear();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.L().size()) {
            if (((Campeonato)GerenciadorJogo.SR.L().get(n2)).fg() != null) {
                ((Campeonato)GerenciadorJogo.SR.L().get(n2)).lS();
            }
            ++n2;
        }
        Campeonato al2 = null;
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.L().size()) {
            if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).fg() != null && !((Campeonato)GerenciadorJogo.SR.L().get(n3)).jZ().booleanValue() && ((Campeonato)GerenciadorJogo.SR.L().get(n3)).lR() >= 1) {
                al2 = (Campeonato)GerenciadorJogo.SR.L().get(n3);
                int n4 = 0;
                int n5 = al2.lO().size() - 1;
                while (n5 >= 0) {
                    if (((RegistroTemporadaTime)al2.lO().get(n5)).H() == GerenciadorJogo.SR.H() - 1) {
                        n4 = (int)((float)((RegistroTemporadaTime)al2.lO().get(n5)).cm() * 100.0f / (float)((RegistroTemporadaTime)al2.lO().get(n5)).w());
                        break;
                    }
                    --n5;
                }
                if (new Random().nextInt(90) + 1 > n4) {
                    ((Campeonato)GerenciadorJogo.SR.L().get(n3)).fg().kE();
                }
            }
            ++n3;
        }
    }

    public static void jR() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (!((ModeloTime)GerenciadorJogo.SR.P().get(n2)).jZ().booleanValue()) {
                ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).ku();
            }
            ++n2;
        }
    }

    public static void jS() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.N().size()) {
            int n3 = 0;
            while (n3 < ((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().size()) {
                int n4 = 0;
                while (n4 < ((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().size()) {
                    if (!((ModeloTime)((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().get(n4)).jZ().booleanValue()) {
                        ProcessadorFimTemporada.a((ModeloTime)((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().get(n4), n4, true);
                    }
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    public static void b(LigaPontosCorridos s2) {
        int n2 = 0;
        while (n2 < s2.yK().size()) {
            if (!((ModeloTime)s2.yK().get(n2)).jZ().booleanValue()) {
                ProcessadorFimTemporada.a((ModeloTime)s2.yK().get(n2), n2, true);
            }
            ++n2;
        }
    }

    public static void jT() {
        boolean bl = false;
        ArrayList<ModeloJogador> arrayList = new ArrayList<ModeloJogador>();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            bl = false;
            if (!((ModeloTime)GerenciadorJogo.SR.P().get(n2)).jZ().booleanValue()) {
                if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).gg() != 0 && ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getReputacao() < 5) {
                    bl = true;
                } else if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).gg() == 0 && ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getReputacao() < 4) {
                    bl = true;
                }
            }
            if (bl) {
                int n3 = 0;
                while (n3 < ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kc().size()) {
                    if (((ModeloJogador)((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kc().get(n3)).fi() > 50 && ((ModeloJogador)((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kc().get(n3)).getIdade() < 31 && ((ModeloJogador)((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kc().get(n3)).ff().booleanValue() && new Random().nextInt(100) > 25) {
                        arrayList.add((ModeloJogador)((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kc().get(n3));
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            BuscadorTimeDestinoTransferencia l2 = new BuscadorTimeDestinoTransferencia((ModeloJogador)arrayList.get(n2), ((ModeloJogador)arrayList.get(n2)).fk(), false, true, 2);
            l2.a(false, false);
            if (l2.cK() != null) {
                ((ModeloJogador)arrayList.get(n2)).a(l2.cK(), ((ModeloJogador)arrayList.get(n2)).fk(), false, false, false);
            }
            if (l2.cK() == null) {
                BuscadorTimeDestinoTransferencia l3 = new BuscadorTimeDestinoTransferencia((ModeloJogador)arrayList.get(n2), ((ModeloJogador)arrayList.get(n2)).fk(), false, true, 2);
                l3.k(false);
                if (l3.cK() != null) {
                    ((ModeloJogador)arrayList.get(n2)).a(l3.cK(), ((ModeloJogador)arrayList.get(n2)).fk(), false, false, false);
                }
            }
            ++n2;
        }
    }

    private static void jU() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (!((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kn().booleanValue() && !((ModeloTime)GerenciadorJogo.SR.P().get(n2)).jZ().booleanValue()) {
                ProcessadorFimTemporada.a((ModeloTime)GerenciadorJogo.SR.P().get(n2), n2, false);
            }
            ++n2;
        }
    }

    private static void a(ModeloTime ah2, int n2, boolean bl) {
        int n3 = 0;
        n3 = n2 <= 1 ? 1 : (n2 <= 5 ? 2 : (n2 <= 10 ? 3 : 4));
        int n4 = 0;
        while (n4 < n3) {
            ProcessadorFimTemporada.a(ah2, bl, true);
            ++n4;
        }
        n4 = 0;
        while (n4 < n3) {
            ProcessadorFimTemporada.a(ah2, bl, false);
            ++n4;
        }
    }

    private static void a(ModeloTime ah2, boolean bl, boolean bl2) {
        int n2;
        int n3;
        ModeloJogador f2 = null;
        int[] nArray = ah2.J(true);
        int[] nArray2 = new int[6];
        nArray2[0] = 4;
        nArray2[1] = 5;
        nArray2[2] = 5;
        nArray2[3] = 10;
        nArray2[4] = 8;
        int[] nArray3 = nArray2;
        int[] nArray4 = new int[6];
        nArray4[0] = 3;
        nArray4[1] = 4;
        nArray4[2] = 4;
        nArray4[3] = 8;
        nArray4[4] = 6;
        int[] nArray5 = nArray4;
        int[] nArray6 = new int[6];
        nArray6[0] = 3;
        nArray6[1] = 4;
        nArray6[2] = 4;
        nArray6[3] = 6;
        nArray6[4] = 4;
        int[] nArray7 = nArray6;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n4 = 0;
        while (n4 <= 4) {
            arrayList.add(n4);
            ++n4;
        }
        Collections.shuffle(arrayList);
        n4 = -1;
        if (bl2) {
            n3 = 0;
            while (n3 < arrayList.size()) {
                if (nArray[(Integer)arrayList.get(n3)] >= nArray3[(Integer)arrayList.get(n3)]) {
                    n4 = (Integer)arrayList.get(n3);
                    break;
                }
                ++n3;
            }
            if (n4 == -1) {
                n3 = 0;
                while (n3 < arrayList.size()) {
                    if (nArray[(Integer)arrayList.get(n3)] >= nArray5[(Integer)arrayList.get(n3)]) {
                        n4 = (Integer)arrayList.get(n3);
                        break;
                    }
                    ++n3;
                }
            }
        } else {
            n3 = 0;
            while (n3 < arrayList.size()) {
                if (nArray[(Integer)arrayList.get(n3)] > nArray7[(Integer)arrayList.get(n3)]) {
                    n4 = (Integer)arrayList.get(n3);
                    break;
                }
                ++n3;
            }
        }
        boolean bl4 = false;
        if (new Random().nextInt(100) > 10) {
            bl4 = true;
        }
        if (n4 >= 0) {
            ArrayList<ModeloJogador> arrayList2 = new ArrayList<ModeloJogador>();
            n2 = 0;
            while (n2 < ah2.kc().size()) {
                if (!(((ModeloJogador)ah2.kc().get(n2)).getPosicao() != n4 || ((ModeloJogador)ah2.kc().get(n2)).gl().booleanValue() || ((ModeloJogador)ah2.kc().get(n2)).ff().booleanValue() && ((ModeloJogador)ah2.kc().get(n2)).ff().booleanValue() != bl4)) {
                    arrayList2.add((ModeloJogador)ah2.kc().get(n2));
                }
                ++n2;
            }
            if (arrayList2.size() > 0) {
                Collections.shuffle(arrayList2);
                f2 = (ModeloJogador)arrayList2.get(0);
            }
        }
        if (f2 != null) {
            boolean bl3 = true;
            n2 = 0;
            int n5 = 0;
            if (bl) {
                if (f2.fi() < 40 && new Random().nextInt(100) > 90) {
                    bl3 = false;
                }
            } else {
                bl3 = false;
                if (f2.ff().booleanValue() && new Random().nextInt(100) > 30) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                } else if (f2.fi() >= 90 && new Random().nextInt(100) > 30) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                } else if (f2.fi() >= 80 && f2.fi() < 90 && new Random().nextInt(100) > 35) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                } else if (f2.fi() >= 70 && f2.fi() < 80 && new Random().nextInt(100) > 45) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                } else if (f2.fi() >= 60 && f2.fi() < 70 && new Random().nextInt(100) > 75) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                } else if (f2.fi() < 60 && new Random().nextInt(100) > 95) {
                    bl3 = true;
                    n5 = 1;
                    n2 = 1;
                }
            }
            BuscadorTimeDestinoTransferencia l2 = new BuscadorTimeDestinoTransferencia(f2, f2.fk(), false, true, n5);
            if (bl3) {
                l2.a(false, false);
            } else {
                l2.k(false);
            }
            if (l2.cK() != null) {
                f2.a(l2.cK(), f2.fk(), false, false, false);
            }
        }
    }
}

