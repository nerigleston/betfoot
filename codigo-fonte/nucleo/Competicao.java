package nucleo;

import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.NotaJogador;
import nucleo.LigaNacional;
import nucleo.Calendario;
import nucleo.ModeloTime;
import nucleo.ContagemTime;
import nucleo.ComparadorArtilheiro;
import nucleo.ComparadorNotaJogador;
import nucleo.ComparadorEstatisticaJogador;
import nucleo.ComparadorContagemTime;
import nucleo.EntradaArtilheiro;
import nucleo.DesempenhoJogadorCompeticao;
import nucleo.PartidaCompeticao;
import nucleo.FaseCompeticao;
import nucleo.EstatisticasGeraisCompeticao;
import nucleo.CarregadorConfigEstadual;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCopaNacional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ImageIcon;

public abstract class Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dm = null;
    private int tR = 0;
    private int dz = -1;
    private boolean tS = true;
    private ArrayList tT = new ArrayList();
    private ArrayList tU = new ArrayList();
    private boolean decisaoTerceiroLugar = false;
    private int ei = -1;
    private transient ArrayList tV = new ArrayList();
    private transient EstatisticasGeraisCompeticao tW = null;
    public static Comparator tX = new ComparadorArtilheiro();
    public static Comparator tY = new ComparadorNotaJogador();
    public static Comparator tZ = new ComparadorEstatisticaJogador();
    public static Comparator ua = new ComparadorContagemTime();

    public void clear() {
    }

    public ImageIcon es() {
        return null;
    }

    public String getNome() {
        return this.dm;
    }

    public void setNome(String string) {
        this.dm = string;
    }

    public boolean mm() {
        return this.tS;
    }

    public void N(boolean bl) {
        this.tS = bl;
    }

    public int b() {
        return this.tR;
    }

    public void F(int n2, int n3) {
        this.tR = n2;
        this.dz = n3;
    }

    public ArrayList mn() {
        return this.tT;
    }

    public ModeloTime cS() {
        ModeloTime ah2 = null;
        int n2 = 0;
        while (n2 < this.mn().size()) {
            if (((PartidaCompeticao)this.mn().get(n2)).H() == motor.GerenciadorJogo.SR.H()) {
                ah2 = ((PartidaCompeticao)this.mn().get(n2)).ce();
                return ah2;
            }
            ++n2;
        }
        return null;
    }

    public ModeloTime cv(int n2) {
        ModeloTime ah2 = null;
        int n3 = 0;
        while (n3 < this.mn().size()) {
            if (((PartidaCompeticao)this.mn().get(n3)).H() == n2) {
                ah2 = ((PartidaCompeticao)this.mn().get(n3)).ce();
                return ah2;
            }
            ++n3;
        }
        return null;
    }

    public PartidaCompeticao mo() {
        int n2 = 0;
        while (n2 < this.mn().size()) {
            if (((PartidaCompeticao)this.mn().get(n2)).H() == motor.GerenciadorJogo.SR.H()) {
                return (PartidaCompeticao)this.mn().get(n2);
            }
            ++n2;
        }
        return null;
    }

    public PartidaCompeticao mp() {
        int n2 = 0;
        while (n2 < this.mn().size()) {
            if (((PartidaCompeticao)this.mn().get(n2)).H() == motor.GerenciadorJogo.SR.H() - 1) {
                return (PartidaCompeticao)this.mn().get(n2);
            }
            ++n2;
        }
        return null;
    }

    public EntradaArtilheiro p(ModeloJogador f2) {
        int n2 = 0;
        while (n2 < this.tU.size()) {
            if (((EntradaArtilheiro)this.tU.get(n2)).x() == f2) {
                return (EntradaArtilheiro)this.tU.get(n2);
            }
            ++n2;
        }
        EntradaArtilheiro c_02 = new EntradaArtilheiro(this, f2);
        this.tU.add(c_02);
        return c_02;
    }

    public void q(ModeloJogador f2) {
        int n2 = -1;
        int n3 = 0;
        while (n3 < this.tU.size()) {
            if (((EntradaArtilheiro)this.tU.get(n3)).x() == f2) {
                n2 = n3;
                break;
            }
            ++n3;
        }
        if (n2 >= 0) {
            this.tU.remove(n2);
        }
    }

    public EntradaArtilheiro r(ModeloJogador f2) {
        EntradaArtilheiro c_02 = null;
        int n2 = 0;
        while (n2 < this.tU.size()) {
            if (((EntradaArtilheiro)this.tU.get(n2)).x() == f2) {
                return (EntradaArtilheiro)this.tU.get(n2);
            }
            ++n2;
        }
        return c_02;
    }

    public static long getSerialversionuid() {
        return 1L;
    }

    public boolean mq() {
        return this.decisaoTerceiroLugar;
    }

    public void O(boolean bl) {
        this.decisaoTerceiroLugar = bl;
    }

    public CarregadorConfigEstadual ir() {
        return null;
    }

    public LigaNacional iq() {
        return null;
    }

    public int ip() {
        return -1;
    }

    public void mr() {
        System.out.println("at:" + this.getNome());
    }

    public String P(boolean bl) {
        return "";
    }

    public String is() {
        return this.dm;
    }

    public static ArrayList a(int n2, boolean bl, int n3) {
        int n4;
        ArrayList<Competicao> arrayList = new ArrayList<Competicao>();
        boolean bl2 = false;
        int n5 = 0;
        while (n5 < motor.GerenciadorJogo.SR.R().size()) {
            n4 = 0;
            while (n4 < ((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).t().size()) {
                bl2 = n2 == 3 && n3 == 1 && ((Competicao)((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).t().get(n4)).b() == 9;
                if (!bl2 && !arrayList.contains(((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).t().get(n4)) && ((Competicao)((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).t().get(n4)).cw(n2)) {
                    arrayList.add((Competicao)((Calendario)motor.GerenciadorJogo.SR.R().get(n5)).t().get(n4));
                }
                ++n4;
            }
            ++n5;
        }
        if (n2 == 4) {
            competicoes.CompeticaoCopasRegionais[] fArray = motor.GerenciadorJogo.SR.bV();
            n4 = 0;
            while (n4 < fArray.length) {
                if (fArray[n4] != null) {
                    arrayList.add(fArray[n4]);
                }
                ++n4;
            }
        }
        if (motor.GerenciadorJogo.SR.bk() && n2 == 0) {
            LigaNacional z2 = motor.GerenciadorJogo.SR.o(29);
            Competicao at2 = null;
            int n6 = 0;
            int n7 = 0;
            while (n7 < arrayList.size()) {
                if (arrayList.get(n7) instanceof CompeticaoLigaNacional && ((CompeticaoLigaNacional)arrayList.get(n7)).yg() != null && ((CompeticaoLigaNacional)arrayList.get(n7)).yg().jc() == 29 && ((CompeticaoLigaNacional)arrayList.get(n7)).ip() == 3) {
                    n6 = n7 + 1;
                    break;
                }
                ++n7;
            }
            if (z2.eb().size() == 4 && (at2 = (Competicao)z2.eb().get(z2.eb().size() - 1)) != null) {
                if (!arrayList.contains(at2)) {
                    arrayList.add(n6, at2);
                } else {
                    arrayList.remove(at2);
                    arrayList.add(n6, at2);
                }
            }
            if (z2 != null) {
                if (z2.jq() == null) {
                    z2.a((CompeticaoCopaNacional)null);
                }
                if (!arrayList.contains(z2.jq())) {
                    arrayList.add(z2.jq());
                }
            }
        }
        if (n2 == 3 && bl) {
            if (motor.GerenciadorJogo.SR.aY() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aY())) {
                arrayList.add(motor.GerenciadorJogo.SR.aY());
            }
            if (motor.GerenciadorJogo.SR.ba() != null && !arrayList.contains(motor.GerenciadorJogo.SR.ba())) {
                arrayList.add(motor.GerenciadorJogo.SR.ba());
            }
            if (motor.GerenciadorJogo.SR.aZ() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aZ())) {
                arrayList.add(motor.GerenciadorJogo.SR.aZ());
            }
            if (motor.GerenciadorJogo.SR.be() != null && !arrayList.contains(motor.GerenciadorJogo.SR.be())) {
                arrayList.add(motor.GerenciadorJogo.SR.be());
            }
            if (motor.GerenciadorJogo.SR.bf() != null && !arrayList.contains(motor.GerenciadorJogo.SR.bf())) {
                arrayList.add(motor.GerenciadorJogo.SR.bf());
            }
            if (motor.GerenciadorJogo.SR.bg() != null && !arrayList.contains(motor.GerenciadorJogo.SR.bg())) {
                arrayList.add(motor.GerenciadorJogo.SR.bg());
            }
            if (motor.GerenciadorJogo.SR.bX() != null && !arrayList.contains(motor.GerenciadorJogo.SR.bX())) {
                arrayList.add(motor.GerenciadorJogo.SR.bX());
            }
            if (motor.GerenciadorJogo.SR.yl() != null && !arrayList.contains(motor.GerenciadorJogo.SR.yl())) {
                arrayList.add(motor.GerenciadorJogo.SR.yl());
            }
            if (motor.GerenciadorJogo.SR.sq() != null && !arrayList.contains(motor.GerenciadorJogo.SR.sq())) {
                arrayList.add(motor.GerenciadorJogo.SR.sq());
            }
            if (motor.GerenciadorJogo.SR.ym() != null && !arrayList.contains(motor.GerenciadorJogo.SR.ym())) {
                arrayList.add(motor.GerenciadorJogo.SR.ym());
            }
        }
        if (n2 == 1 && bl) {
            if (motor.GerenciadorJogo.SR.aR() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aR())) {
                arrayList.add(motor.GerenciadorJogo.SR.aR());
            }
            if (motor.GerenciadorJogo.SR.aW() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aW())) {
                arrayList.add(motor.GerenciadorJogo.SR.aW());
            }
            if (motor.GerenciadorJogo.SR.aV() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aV())) {
                arrayList.add(motor.GerenciadorJogo.SR.aV());
            }
        }
        if (n2 == 1 && motor.GerenciadorJogo.SR.aK() != null && !arrayList.contains(motor.GerenciadorJogo.SR.aK())) {
            arrayList.add(motor.GerenciadorJogo.SR.aK());
        }
        return arrayList;
    }

    public boolean cw(int n2) {
        if (n2 == 0) {
            if (this.tR == 1) {
                return true;
            }
            if (this.tR == 2) {
                return true;
            }
            if (!motor.GerenciadorJogo.SR.isJogaIntClubes() && this.tR == 15) {
                return true;
            }
        } else if (n2 == 1) {
            if (this.tR == 4) {
                return true;
            }
            if (this.tR == 5) {
                return true;
            }
            if (this.tR == 6) {
                return true;
            }
            if (this.tR == 8) {
                return true;
            }
            if (this.tR == 12) {
                return true;
            }
            if (this.tR == 15) {
                return true;
            }
        } else if (n2 == 2 ? this.tR == 3 : n2 == 3 && (this.tR == 7 || this.tR == 9 || this.tR == 13 || this.tR == 14)) {
            return true;
        }
        return false;
    }

    public ArrayList ms() {
        return this.tU;
    }

    public void U(ArrayList arrayList) {
        this.tU = arrayList;
    }

    public int mt() {
        return this.tU.size();
    }

    public EntradaArtilheiro mu() {
        this.mv();
        if (this.tU != null && this.tU.size() > 0) {
            return (EntradaArtilheiro)this.tU.get(0);
        }
        return null;
    }

    public void mv() {
        if (this.tU != null && this.tU.size() > 0) {
            int n2 = 0;
            while (n2 < this.tU.size()) {
                DesempenhoJogadorCompeticao h_02;
                if (((EntradaArtilheiro)this.tU.get(n2)).x() != null && (h_02 = ((EntradaArtilheiro)this.tU.get(n2)).x().g(this)) != null) {
                    ((EntradaArtilheiro)this.tU.get(n2)).i(h_02.w());
                }
                ++n2;
            }
            Collections.sort(this.tU, tX);
        }
    }

    public void mw() {
        this.tU.clear();
    }

    public void mx() {
        this.tV.clear();
        this.tW = null;
    }

    public void my() {
        int n2;
        double d2 = 0.0;
        int n3 = 0;
        int n4 = 0;
        ModeloPartida i2 = null;
        int n5 = 3;
        ModeloTime ah2 = null;
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n6 = 0;
        while (n6 < motor.GerenciadorJogo.SR.R().size()) {
            if (((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).e() && ((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().size() > 0) {
                n2 = 0;
                while (n2 < ((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().size()) {
                    if (((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hy() == this) {
                        ++n3;
                        n4 += ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hu();
                        n4 += ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hw();
                        if (((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hu() - ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hw() >= n5) {
                            i2 = (ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2);
                            n5 = ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hu() - ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hw();
                        }
                        if (((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hw() - ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hu() >= n5) {
                            i2 = (ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2);
                            n5 = ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hw() - ((ModeloPartida)((Calendario)motor.GerenciadorJogo.SR.R().get(n6)).h().get(n2)).hu();
                        }
                    }
                    ++n2;
                }
            }
            ++n6;
        }
        if (n3 > 0) {
            d2 = (double)n4 / (double)n3;
        }
        if (this.cS() != null) {
            ah2 = this.cS();
        } else {
            n6 = 0;
            while (n6 < this.mn().size()) {
                if (((PartidaCompeticao)this.mn().get(n6)).H() == motor.GerenciadorJogo.SR.H() - 1) {
                    ah2 = ((PartidaCompeticao)this.mn().get(n6)).ce();
                    break;
                }
                ++n6;
            }
        }
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        n2 = 0;
        while (n2 < this.mn().size()) {
            if (!arrayList.contains(((PartidaCompeticao)this.mn().get(n2)).ce())) {
                arrayList.add(((PartidaCompeticao)this.mn().get(n2)).ce());
            }
            arrayList2.add(((PartidaCompeticao)this.mn().get(n2)).ce());
            ++n2;
        }
        ArrayList<ContagemTime> arrayList3 = null;
        if (arrayList.size() > 0) {
            arrayList3 = new ArrayList<ContagemTime>();
            int n7 = 0;
            while (n7 < arrayList.size()) {
                arrayList3.add(new ContagemTime((ModeloTime)arrayList.get(n7), Collections.frequency(arrayList2, arrayList.get(n7))));
                ++n7;
            }
            Collections.sort(arrayList3, ua);
        }
        this.tW = new EstatisticasGeraisCompeticao(d2, n4, n3, i2, ah2, arrayList3);
    }

    public void mz() {
        ArrayList<NotaJogador> arrayList = new ArrayList<NotaJogador>();
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.O().size()) {
            DesempenhoJogadorCompeticao h_02 = ((ModeloJogador)motor.GerenciadorJogo.SR.O().get(n2)).g(this);
            if (h_02 != null && h_02.F() > 5.0) {
                arrayList.add(new NotaJogador((ModeloJogador)motor.GerenciadorJogo.SR.O().get(n2), h_02.F(), h_02.gZ()));
            }
            ++n2;
        }
        Collections.sort(arrayList, tY);
        if (this.tV == null) {
            this.tV = new ArrayList();
        }
        this.tV.clear();
        if (arrayList.size() >= 4) {
            n2 = 0;
            while (n2 < 5) {
                this.tV.add((NotaJogador)arrayList.get(n2));
                ++n2;
            }
        }
        arrayList.clear();
    }

    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        return stringArray;
    }

    public int gg() {
        return this.dz;
    }

    public int el() {
        return this.dz;
    }

    public int gD() {
        return this.ei;
    }

    public void az(int n2) {
        this.ei = n2;
    }

    public FaseCompeticao[] mB() {
        return null;
    }

    public ArrayList mC() {
        return null;
    }

    public String[] b(FaseCompeticao l_02) {
        return null;
    }

    public ArrayList mD() {
        return this.tV;
    }

    public EstatisticasGeraisCompeticao mE() {
        return this.tW;
    }

    public void a(EstatisticasGeraisCompeticao m2) {
        this.tW = m2;
    }

    public String cx(int n2) {
        return null;
    }

    public int cy(int n2) {
        return 40000;
    }

    public boolean cz(int n2) {
        return false;
    }

    public LigaNacional mF() {
        return null;
    }
}

