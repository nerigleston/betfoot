package competicoes;

import nucleo.ModeloPartida;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.CarregadorConfigEstadual;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.util.ArrayList;

public class ChaveMataMata
extends FaseCompeticao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos nS = null;
    private Competicao YY = null;
    private int tR;
    private ArrayList ZF = new ArrayList();
    private int ZG = 0;
    private int Zf = 0;
    private int ZH;
    private transient int ZI = 0;
    private transient int ZJ = 0;
    private boolean[] ZK = new boolean[]{true, true, true, true, true, true, true};
    private int Zg = -1;
    boolean ZL = true;

    public ChaveMataMata() {
    }

    public ChaveMataMata(LigaPontosCorridos s2, int n2, int n3, int n4, boolean[] blArray, Competicao at2, int n5) {
        this.YY = at2;
        this.nS = s2;
        this.tR = n3;
        this.Zg = n5;
        this.ZK = blArray;
        this.setNome(at2.getNome());
        if (n4 > 0) {
            this.ZG = n4 - 1;
            this.ZL = false;
        } else {
            int n6 = 1;
            if (this.Zg == 2029) {
                n6 = 7;
            } else if (n2 == 128) {
                n6 = 7;
            } else if (n2 == 64) {
                n6 = 6;
            } else if (n2 == 32) {
                n6 = 5;
            } else if (n2 == 16) {
                n6 = 4;
            } else if (n2 == 8) {
                n6 = 3;
            } else if (n2 == 4) {
                n6 = 2;
            } else if (n2 == 2) {
                n6 = 1;
            }
            this.ZG = n6 - 1;
        }
        this.Zf = 0;
        this.ZH = 1;
    }

    @Override
    public int b() {
        return this.tR;
    }

    public int zb() {
        return this.Zf;
    }

    public void fe(int n2) {
        this.Zf = n2;
    }

    public ArrayList zp() {
        return this.ZF;
    }

    public void ak(ArrayList arrayList) {
        this.ZF = arrayList;
    }

    public int zq() {
        return this.ZG;
    }

    public void ff(int n2) {
        this.ZG = n2 - 1;
    }

    public int zr() {
        return this.ZH;
    }

    public void fg(int n2) {
        this.ZH = n2;
    }

    public void pO() {
        this.ZI = this.Zf;
        this.ZJ = this.ZH;
        boolean bl = ((GeradorChaveMataMata)this.zp().get(this.Zf)).hO();
        if (this.ZH == 1 && !bl) {
            this.zs();
        } else if (this.ZH == 2) {
            this.zs();
        } else {
            this.ZH = 2;
        }
    }

    public void zs() {
        this.ZI = this.Zf;
        this.ZJ = this.ZH;
        if (this.Zg == 2029) {
            this.zx();
        } else if (this.Zf == this.ZG) {
            this.zx();
        } else {
            ((GeradorChaveMataMata)this.zp().get(this.Zf)).b(false, false);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this, ((GeradorChaveMataMata)this.zp().get(this.Zf)).zY(), this.Zf + 1, this.ZK[this.Zf + 1], 0, 0, this.tR, ((GeradorChaveMataMata)this.zp().get(this.Zf)).zZ());
            ++this.Zf;
            this.ZH = 1;
        }
    }

    public void BH() {
        ++this.Zf;
        this.ZH = 1;
    }

    public int[] o(ModeloPartida i2) {
        int[] nArray = new int[]{-1, -1};
        nArray = ((GeradorChaveMataMata)this.zp().get(this.Zf)).o(i2);
        return nArray;
    }

    public ArrayList zt() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = this.ZF.size() - 1;
        while (n2 >= 0) {
            if (((GeradorChaveMataMata)this.ZF.get(n2)).zW().size() == 2) {
                int n3 = 0;
                while (n3 <= 1) {
                    if (!((GeradorChaveMataMata)this.ZF.get(n2)).zY().contains(((ModeloPartida)((GeradorChaveMataMata)this.ZF.get(n2)).zW().get(n3)).hc())) {
                        arrayList.add(((ModeloPartida)((GeradorChaveMataMata)this.ZF.get(n2)).zW().get(n3)).hc());
                    }
                    if (!((GeradorChaveMataMata)this.ZF.get(n2)).zY().contains(((ModeloPartida)((GeradorChaveMataMata)this.ZF.get(n2)).zW().get(n3)).hd())) {
                        arrayList.add(((ModeloPartida)((GeradorChaveMataMata)this.ZF.get(n2)).zW().get(n3)).hd());
                    }
                    ++n3;
                }
            }
            --n2;
        }
        return arrayList;
    }

    public boolean zu() {
        return ((GeradorChaveMataMata)this.zp().get(this.Zf)).hO();
    }

    public int BI() {
        return ((GeradorChaveMataMata)this.zp().get(this.Zf)).ze();
    }

    public boolean fh(int n2) {
        if (n2 >= 0 && n2 < this.zp().size()) {
            return ((GeradorChaveMataMata)this.zp().get(n2)).hO();
        }
        return false;
    }

    public boolean zv() {
        return ((GeradorChaveMataMata)this.zp().get(this.Zf)).zZ();
    }

    public void zx() {
        ((GeradorChaveMataMata)this.zp().get(this.Zf)).b(this.ZL, true);
    }

    public FaseCompeticao zy() {
        return this.nS;
    }

    public void f(LigaPontosCorridos s2) {
        this.nS = s2;
    }

    public int zf() {
        return this.Zg;
    }

    public void fc(int n2) {
        this.Zg = n2;
    }

    public Competicao yT() {
        return this.YY;
    }

    @Override
    public LigaNacional iq() {
        if (this.nS != null) {
            return this.nS.iq();
        }
        return null;
    }

    @Override
    public CarregadorConfigEstadual ir() {
        if (this.nS != null) {
            return this.nS.ir();
        }
        return null;
    }

    @Override
    public int ip() {
        if (this.nS != null) {
            return this.nS.ip();
        }
        return -1;
    }

    @Override
    public String io() {
        String string = "";
        String[] stringArray = this.YY.b(this);
        if (stringArray == null) {
            stringArray = this.zB();
        }
        if (this.ZG == 7) {
            this.ZG = 6;
        }
        int n2 = stringArray.length - 1 - this.ZG;
        int n3 = this.ZH;
        string = stringArray[n2 + this.Zf];
        if (this.ZG == 0 && this.Zf == 0 && (this.tR == 4 || this.tR == 5)) {
            string = stringArray[0];
        }
        if (this.ZG == 1 && this.Zf == 0 && this.tR == 4) {
            string = "Preliminar R1";
        }
        if (this.ZG == 1 && this.Zf == 1 && this.tR == 4) {
            string = "Preliminar R2";
        }
        if (this.fh(this.Zf)) {
            return String.valueOf(string) + " - " + Integer.toString(n3) + "\u00ba jogo";
        }
        return string;
    }

    @Override
    public String getNome() {
        if (this.nS != null) {
            return this.nS.getNome();
        }
        if (this.YY != null) {
            return this.YY.getNome();
        }
        return null;
    }

    @Override
    public String is() {
        if (this.nS != null) {
            return this.nS.is();
        }
        return null;
    }

    public boolean[] zz() {
        return this.ZK;
    }

    public boolean zA() {
        return this.nS != null && this.tR == 3 && this.nS instanceof LigaPontosCorridos && this.nS.zd() == 1;
    }

    public boolean U(ModeloTime ah2) {
        int n2 = this.zp().size() - 1;
        while (n2 >= 0) {
            int n3 = 0;
            while (n3 < ((GeradorChaveMataMata)this.zp().get(n2)).zW().size()) {
                if (((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n2)).zW().get(n3)).hc() == ah2 || ((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n2)).zW().get(n3)).hd() == ah2) {
                    return true;
                }
                ++n3;
            }
            --n2;
        }
        return false;
    }

    public void z(Competicao at2) {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        int n3 = 1;
        int n4 = this.zp().size() - 1;
        while (n4 >= 0) {
            int n5 = 0;
            while (n5 < ((GeradorChaveMataMata)this.zp().get(n4)).zW().size()) {
                ModeloTime ah2 = null;
                ModeloTime ah3 = null;
                if (((GeradorChaveMataMata)this.zp().get(n4)).zY().contains(((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hc())) {
                    ah2 = ((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hc();
                    ah3 = ((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hd();
                } else if (((GeradorChaveMataMata)this.zp().get(n4)).zY().contains(((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hd())) {
                    ah2 = ((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hd();
                    ah3 = ((ModeloPartida)((GeradorChaveMataMata)this.zp().get(n4)).zW().get(n5)).hc();
                }
                if (!arrayList.contains(ah2)) {
                    arrayList.add(ah2);
                    ah2.a(at2, n3, n2);
                    ++n3;
                }
                if (!arrayList.contains(ah3)) {
                    arrayList.add(ah3);
                    ah3.a(at2, n3, n2);
                    ++n3;
                }
                ++n5;
            }
            ++n2;
            --n4;
        }
    }

    public String[] zB() {
        if (this.zf() == 1068) {
            return ConstantesJogo.pX;
        }
        if (this.zf() == 6006) {
            return ConstantesJogo.abY;
        }
        if (this.ZG == 6) {
            return ConstantesJogo.px;
        }
        if (this.ZG == 5) {
            return ConstantesJogo.py;
        }
        if (this.ZG == 4) {
            return ConstantesJogo.pz;
        }
        if (this.ZG == 3) {
            return ConstantesJogo.pA;
        }
        if (this.ZG == 2) {
            return ConstantesJogo.pB;
        }
        if (this.ZG == 1) {
            return ConstantesJogo.pC;
        }
        if (this.ZG == 0) {
            return ConstantesJogo.pD;
        }
        return ConstantesJogo.ps;
    }
}

