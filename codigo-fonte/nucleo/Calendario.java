package nucleo;

import static comparadores.ColecaoComparadoresSorteio.cN;

import nucleo.ModeloPartida;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorTelas;
import nucleo.CarregadorConfigEstadual;
import competicoes.CompeticaoMundialDeClubes;
import competicoes.CompeticaoLigaNacional;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Calendario
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Calendar p = Calendar.getInstance();
    private ArrayList q = new ArrayList();
    private ArrayList r = new ArrayList();
    private ArrayList s = new ArrayList();
    private ArrayList t = new ArrayList();
    private ArrayList u = new ArrayList();
    private boolean v = false;
    private int w = 0;
    static final int DOM = 1;
    static final int z = 2;
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    static final int D = 6;
    static final int F = 7;
    static final int G = 1;
    static final int H = 2;
    static final int I = 3;
    static final int J = 4;
    static final int K = 5;
    static final int L = 6;
    static final int ht = 12;
    static final int M = 7;
    static final int N = 8;
    static final int O = 9;
    static final int P = 10;
    static final int Q = 11;
    static final int hx = 13;
    static final int ov = 14;
    static final int R = 100;
    static final int S = 200;
    static final int ow = 15;

    public void clear() {
        int n2 = 0;
        while (n2 < this.s.size()) {
            ((ModeloPartida)this.s.get(n2)).clear();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.u.size()) {
            ((Competicao)this.u.get(n2)).clear();
            ++n2;
        }
        this.s.clear();
        this.t.clear();
        this.u.clear();
    }

    public Calendar a() {
        return this.p;
    }

    public void a(int n2, int n3, int n4) {
        this.p.set(n2, n3, n4);
    }

    public int b() {
        return this.w;
    }

    public void a(int n2) {
        this.w = n2;
    }

    public static ArrayList b(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 0;
        while (n3 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n3)).b() == n2) {
                arrayList.add(n3);
            }
            ++n3;
        }
        return arrayList;
    }

    public static ArrayList c(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 0;
        while (n3 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n3)).a().get(7) == n2) {
                arrayList.add(n3);
            }
            ++n3;
        }
        return arrayList;
    }

    public int c() {
        return this.p.get(2);
    }

    public static ArrayList d() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n2)).a().get(5) == 2) {
                arrayList.add(n2);
            }
            ++n2;
        }
        return arrayList;
    }

    public static int d(int n2) {
        int n3 = motor.GerenciadorJogo.SR.R().size() - 1;
        while (n3 >= 0) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n3)).b() == n2) {
                return n3;
            }
            --n3;
        }
        return -1;
    }

    public static int e(int n2) {
        int n3 = 0;
        while (n3 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n3)).b() == n2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int a(int n2, int n3) {
        int n4 = 1;
        int n5 = 0;
        while (n5 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).b() == n2 && n4 == n3) {
                return n5;
            }
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).b() == n2) {
                ++n4;
            }
            ++n5;
        }
        return -1;
    }

    public static ArrayList a(int n2, boolean bl) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 0;
        if (bl) {
            n3 = 2;
        }
        int n4 = 0;
        while (n4 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n4)).b() == n2 && !((Calendario)motor.GerenciadorJogo.SR.R().get(n4)).e()) {
                if (n3 <= 0) {
                    arrayList.add(n4);
                }
                if (n3 > 0) {
                    --n3;
                }
            }
            ++n4;
        }
        return arrayList;
    }

    public boolean e() {
        return this.v;
    }

    public void a(boolean bl) {
        this.v = bl;
    }

    public String f() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String string = simpleDateFormat.format(this.a().getTime());
        return string;
    }

    public static String a(Calendar calendar) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(calendar.getTime());
    }

    public static String a(Date date) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(date.getTime());
    }

    public static String a(long l2) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(l2);
    }

    private static void b(int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = motor.GerenciadorJogo.SR.R().size() - 1;
        while (n6 > 0) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).b() > 0) {
                n5 = n6;
                break;
            }
            --n6;
        }
        if (n5 < motor.GerenciadorJogo.SR.J()) {
            n5 = motor.GerenciadorJogo.SR.J();
        }
        n6 = n5;
        while (n6 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).b() == 0 && ((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).a().get(7) == n2) {
                n4 = n6;
                break;
            }
            ++n6;
        }
        if (n4 > 0) {
            ((Calendario)motor.GerenciadorJogo.SR.R().get(n4)).a(n3);
        }
    }

    public static void g() {
        Calendario.b(1, 100);
        Calendario.b(2, 15);
        Calendario.b(3, 15);
        Calendario.b(4, 10);
        Calendario.b(5, 10);
        Calendario.b(6, 15);
        Calendario.b(7, 10);
        Calendario.b(1, 10);
        Calendario.b(2, 10);
        Calendario.b(3, 10);
        Calendario.b(4, 10);
        Calendario.b(5, 10);
        Calendario.b(6, 15);
        Calendario.b(7, 10);
        Calendario.b(1, 15);
        Calendario.b(2, 10);
        Calendario.b(3, 100);
        Calendario.b(4, 10);
        Calendario.b(5, 100);
        Calendario.b(6, 10);
        Calendario.b(7, 100);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 3);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 3);
        Calendario.b(7, 11);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 3);
        Calendario.b(7, 200);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 3);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 3);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(4, 4);
        Calendario.b(5, 3);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 4);
        Calendario.b(1, 3);
        Calendario.b(3, 3);
        Calendario.b(5, 4);
        Calendario.b(1, 3);
        Calendario.b(3, 4);
        Calendario.b(4, 4);
        Calendario.b(5, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 100);
        Calendario.b(4, 4);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 200);
        Calendario.b(4, 4);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 4);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 14);
        Calendario.b(4, 4);
        Calendario.b(5, 14);
        Calendario.b(6, 12);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 14);
        Calendario.b(3, 2);
        Calendario.b(5, 4);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(4, 2);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(1, 1);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 4);
        Calendario.b(5, 12);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(3, 2);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(6, 14);
        Calendario.b(1, 1);
        Calendario.b(2, 14);
        Calendario.b(3, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(7, 14);
        Calendario.b(1, 1);
        Calendario.b(3, 4);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 2);
        Calendario.b(5, 12);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 12);
        Calendario.b(3, 2);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 4);
        Calendario.b(4, 6);
        Calendario.b(5, 7);
        Calendario.b(7, 7);
        Calendario.b(2, 7);
        Calendario.b(4, 7);
        Calendario.b(6, 7);
        Calendario.b(1, 7);
        Calendario.b(4, 7);
        Calendario.b(1, 7);
        Calendario.b(4, 1);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 13);
        Calendario.b(3, 4);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(7, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(6, 9);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 13);
        Calendario.b(4, 4);
        Calendario.b(5, 9);
        Calendario.b(6, 12);
        Calendario.b(7, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 4);
        Calendario.b(4, 4);
        Calendario.b(5, 1);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 14);
        Calendario.b(3, 2);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(6, 14);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 2);
        Calendario.b(4, 4);
        Calendario.b(5, 6);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 12);
        Calendario.b(4, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 12);
        Calendario.b(4, 2);
        Calendario.b(2, 14);
        Calendario.b(6, 12);
        Calendario.b(7, 14);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(4, 2);
        Calendario.b(5, 6);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 8);
        Calendario.b(4, 12);
        Calendario.b(5, 1);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(3, 8);
        Calendario.b(4, 6);
        Calendario.b(5, 1);
        Calendario.b(6, 12);
        Calendario.b(7, 200);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 6);
        Calendario.b(4, 6);
        Calendario.b(5, 1);
        Calendario.b(6, 9);
        Calendario.b(1, 1);
        Calendario.b(2, 9);
        Calendario.b(3, 100);
        Calendario.b(4, 6);
        Calendario.b(5, 1);
        Calendario.b(6, 12);
        Calendario.b(1, 1);
        Calendario.b(2, 12);
        Calendario.b(3, 1);
        Calendario.b(4, 9);
        Calendario.b(5, 1);
        Calendario.b(6, 12);
        Calendario.b(7, 1);
        Calendario.b(1, 1);
        Calendario.b(2, 1);
        Calendario.b(3, 1);
        Calendario.b(4, 1);
        Calendario.b(5, 1);
        Calendario.b(6, 1);
        Calendario.b(7, 1);
        Calendario.b(1, 1);
        Calendario.b(2, 1);
        Calendario.b(3, 1);
        Calendario.b(4, 1);
        Calendario.b(5, 1);
        Calendario.b(6, 5);
        Calendario.b(7, 5);
        Calendario.b(2, 5);
    }

    public ArrayList h() {
        return this.s;
    }

    public int i() {
        if (this.s.size() > 0) {
            return ((ModeloPartida)this.s.get(0)).hy().b();
        }
        return 0;
    }

    public void a(ModeloPartida i2) {
        this.s.add(i2);
    }

    public ArrayList j() {
        return this.t;
    }

    public void a(FaseCompeticao l_02) {
        if (!this.t.contains(l_02)) {
            this.t.add(l_02);
        }
    }

    public void a(Competicao at2) {
        if (!this.u.contains(at2)) {
            this.u.add(at2);
        }
    }

    public static void b(int n2, int n3, int n4) {
        String string = null;
        if (n3 == 1) {
            string = "cw";
        } else if (n3 == 2) {
            string = "ds";
        } else if (n3 == 3) {
            string = "aj";
        } else if (n3 == 4) {
            string = "cD";
        } else if (n3 == 5) {
            string = "dJ";
        } else if (n3 == 6) {
            string = "cS";
        } else if (n3 == 7) {
            string = "cO";
        } else if (n3 == 8) {
            string = "cSempregado";
        } else if (n3 == 9) {
            string = "cPromocao";
        } else if (n3 == 10) {
            string = "criaMataMataAscenso";
        } else if (n3 == 11) {
            string = "criaplayOffRebaixamento";
        }
        if (n4 == 0) {
            Calendario a2 = (Calendario)motor.GerenciadorJogo.SR.R().get(n2);
            a2.q.add(string);
        } else {
            Calendario a3 = (Calendario)motor.GerenciadorJogo.SR.R().get(n2);
            a3.r.add(string);
        }
    }

    public void f(int n2) {
        String string = "cw";
        String string2 = "ds";
        String string3 = "aj";
        String string4 = "cD";
        String string5 = "dJ";
        String string6 = "cS";
        String string7 = "cO";
        String string8 = "cSempregado";
        String string9 = "cPromocao";
        String string10 = "criaMataMataAscenso";
        String string11 = "criaplayOffRebaixamento";
        ArrayList arrayList = n2 == 0 ? this.q : this.r;
        if (arrayList.size() > 0) {
            int n3 = 0;
            while (n3 < arrayList.size()) {
                if (string.equals(arrayList.get(n3))) {
                    this.p();
                } else if (string2.equals(arrayList.get(n3))) {
                    this.n();
                } else if (string3.equals(arrayList.get(n3))) {
                    motor.GerenciadorJogo.SR.aT();
                } else if (string4.equals(arrayList.get(n3))) {
                    if (motor.GerenciadorJogo.SR.bk()) {
                        this.m();
                    } else if (motor.GerenciadorJogo.SR.X()) {
                        this.l();
                    }
                } else if (string5.equals(arrayList.get(n3))) {
                    this.o();
                } else if (string6.equals(arrayList.get(n3))) {
                    this.b(false);
                } else if (string7.equals(arrayList.get(n3))) {
                    this.k();
                } else if (string8.equals(arrayList.get(n3))) {
                    this.b(true);
                } else if (string9.equals(arrayList.get(n3))) {
                    motor.GerenciadorJogo.afQ.zw();
                } else {
                    string11.equals(arrayList.get(n3));
                }
                ++n3;
            }
        }
        arrayList.clear();
    }

    private void k() {
        if (motor.GerenciadorJogo.SR.isJogaSelecoesAll()) {
            int n2 = 0;
            while (n2 < motor.GerenciadorJogo.SR.M().size()) {
                if (((Campeonato)motor.GerenciadorJogo.SR.M().get(n2)).jo() != null) {
                    GerenciadorTelas.a(((Campeonato)motor.GerenciadorJogo.SR.M().get(n2)).jo().ka().jo(), true);
                }
                ++n2;
            }
        }
    }

    private void b(boolean bl) {
        if (motor.GerenciadorJogo.SR.isJogaSelecoesAll()) {
            int n2 = 0;
            while (n2 < motor.GerenciadorJogo.SR.M().size()) {
                ArrayList arrayList;
                if (!bl) {
                    if (((Campeonato)motor.GerenciadorJogo.SR.M().get(n2)).jZ().booleanValue() && ((Campeonato)motor.GerenciadorJogo.SR.M().get(n2)).jo() == null) {
                        arrayList = motor.GerenciadorJogo.afQ.a((Campeonato)motor.GerenciadorJogo.SR.M().get(n2), bl);
                        if (!motor.GerenciadorJogo.SR.bD() && arrayList != null && arrayList.size() > 0) {
                            GerenciadorTelas.a(arrayList, (Campeonato)motor.GerenciadorJogo.SR.M().get(n2), 1);
                        }
                    }
                } else if (((Campeonato)motor.GerenciadorJogo.SR.M().get(n2)).jZ().booleanValue()) {
                    arrayList = motor.GerenciadorJogo.afQ.a((Campeonato)motor.GerenciadorJogo.SR.M().get(n2), bl);
                    if (!motor.GerenciadorJogo.SR.bD() && arrayList != null && arrayList.size() > 0) {
                        GerenciadorTelas.a(arrayList, (Campeonato)motor.GerenciadorJogo.SR.M().get(n2), 1);
                    }
                }
                ++n2;
            }
        }
    }

    public void l() {
        LigaNacional z2 = motor.GerenciadorJogo.SR.o(29);
        if (z2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(z2.jg());
            Collections.sort(arrayList, cN);
            z2.a(arrayList, false, "criaCopaBRAposRegionais");
        }
    }

    public void m() {
        LigaNacional z2 = motor.GerenciadorJogo.SR.o(29);
        if (z2 != null && motor.GerenciadorJogo.SR.bk() && z2.eb().size() == 4) {
            LigaPontosCorridos s2 = ((CompeticaoLigaNacional)z2.eb().get(z2.eb().size() - 1)).yi();
            ArrayList arrayList = null;
            if (s2 != null) {
                s2.aN(false);
                int n2 = ((CompeticaoLigaNacional)z2.eb().get(z2.eb().size() - 1)).yi().getnTimes();
                arrayList = nucleo.CarregadorConfigEstadual.Q(n2);
                if (arrayList != null && n2 == arrayList.size()) {
                    s2.yK().addAll(arrayList);
                    z2.ek().removeAll(arrayList);
                    s2.aN(false);
                    s2.setDivisao(4);
                    s2.yI();
                    s2.yH();
                }
            }
            ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
            int n3 = 0;
            int n4 = 0;
            while (n4 <= 2) {
                int n5 = 0;
                while (n5 < ((CompeticaoLigaNacional)z2.eb().get(n4)).yi().yK().size()) {
                    arrayList2.add((ModeloTime)((CompeticaoLigaNacional)z2.eb().get(n4)).yi().yK().get(n5));
                    ++n3;
                    ++n5;
                }
                ++n4;
            }
            arrayList = nucleo.CarregadorConfigEstadual.eh();
            n4 = 0;
            while (n4 < arrayList.size()) {
                if (!arrayList2.contains(arrayList.get(n4))) {
                    arrayList2.add((ModeloTime)arrayList.get(n4));
                }
                ++n4;
            }
            z2.a(arrayList2, false, "criaSerieDCopa");
        }
        motor.GerenciadorJogo.SR.bx().clear();
    }

    public void n() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.aN().size()) {
            if (((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).bY(this.c())) {
                ((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).kJ();
            }
            ++n2;
        }
    }

    public void o() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.aN().size()) {
            if (((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).kL() != null && ((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).kL().eQ() > 0) {
                ((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).w(((ModeloTime)motor.GerenciadorJogo.SR.aN().get(n2)).kL().eQ(), 4);
            }
            ++n2;
        }
    }

    public void p() {
        CompeticaoMundialDeClubes a_02 = motor.GerenciadorJogo.SR.aR();
        a_02.zC();
    }

    public void K() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.N().size()) {
            ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n2)).K();
            ++n2;
        }
    }

    public static void q() {
        int n2;
        if (motor.GerenciadorJogo.SR.isJogaSelecoesAll()) {
            int n3;
            int n4;
            int n5;
            int n6;
            if (motor.GerenciadorJogo.SR.isJogaEstadual() && (n2 = Calendario.a(3, 4)) > 0) {
                Calendario.b(n2, 6, 1);
            }
            if ((n2 = Calendario.a(1, 1)) > 0) {
                Calendario.b(n2, 8, 1);
            }
            if ((n6 = Calendario.e(7)) > 0) {
                Calendario.b(n6, 6, 1);
            }
            if ((n5 = Calendario.e(7)) > 0) {
                Calendario.b(n5, 7, 1);
            }
            if ((n4 = Calendario.a(1, 12)) > 0) {
                Calendario.b(n4, 6, 1);
            }
            if ((n3 = Calendario.a(1, 18)) > 0) {
                Calendario.b(n3, 6, 1);
            }
        }
        if ((n2 = Calendario.a(1, 20)) > 0) {
            Calendario.b(n2, 9, 1);
        }
    }

    public ArrayList r() {
        return this.q;
    }

    public ArrayList s() {
        return this.r;
    }

    public ArrayList t() {
        return this.u;
    }

    public boolean a(ModeloTime ah2) {
        int n2 = 0;
        while (n2 < this.s.size()) {
            if (((ModeloPartida)this.s.get(n2)).hc() == ah2 || ((ModeloPartida)this.s.get(n2)).hd() == ah2) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static void aD() {
        String string = "";
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n2)).b() > 0) {
                if (string.equals(((Calendario)motor.GerenciadorJogo.SR.R().get(n2)).f())) {
                    System.out.println("erro de data: " + n2);
                }
                string = ((Calendario)motor.GerenciadorJogo.SR.R().get(n2)).f();
            }
            ++n2;
        }
    }

    public static void u() {
        int n2 = 0;
        n2 = 0;
        ArrayList arrayList = Calendario.b(100);
        int n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Amistoso Clube:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList = Calendario.b(200);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Amistoso Sele\u00e7\u00e3o:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList = Calendario.b(3);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Estadual:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(10);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Regional:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(11);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("SuperCopa:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(1);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Nacional:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(4);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Int1:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(2);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Copa:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(7);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Selecoes:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(6);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("INT2:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(8);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Recopa:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(12);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("INT3:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(5);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Mundial:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(9);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Elimin:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(13);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Finalissima:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(14);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Liga Nacoes:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
    }
}

