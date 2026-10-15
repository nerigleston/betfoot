package components;

import nucleo.ModeloTime;
import java.awt.Color;
import java.util.ArrayList;

public class LinhaTabelaClassificacao {
    private ModeloTime cg = null;
    private String info;
    private boolean NM;
    private Color NN = null;
    private int[] NO;
    private String NP = "";
    private int NQ = 0;
    private boolean NR = false;
    private ModeloTime NS = null;
    private boolean NT = false;
    private int w = 0;

    public LinhaTabelaClassificacao() {
    }

    public LinhaTabelaClassificacao(boolean bl, String string) {
        this.NT = bl;
        this.NP = string;
    }

    public LinhaTabelaClassificacao(ModeloTime ah2) {
        this.NS = ah2;
    }

    public ModeloTime fg() {
        return this.cg;
    }

    public void n(ModeloTime ah2) {
        this.cg = ah2;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String string) {
        this.info = string;
    }

    public Color getCorF() {
        return this.NN;
    }

    public void setCorF(Color color) {
        this.NN = color;
    }

    public int[] ta() {
        return this.NO;
    }

    public void l(int[] nArray) {
        this.NO = nArray;
    }

    public boolean tb() {
        return this.NM;
    }

    public void ak(boolean bl) {
        this.NM = bl;
    }

    public String tc() {
        return this.NP;
    }

    public void J(String string) {
        this.NP = string;
    }

    public int td() {
        return this.NQ;
    }

    public void dF(int n2) {
        this.NQ = n2;
    }

    public static ArrayList a(int n2, int n3, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<LinhaTabelaClassificacao> arrayList3 = new ArrayList<LinhaTabelaClassificacao>();
        int[] nArray = new int[8];
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (n6 < n2) {
            LinhaTabelaClassificacao e2 = new LinhaTabelaClassificacao();
            if (arrayList2 == null || n5 >= arrayList2.size()) {
                e2.setInfo("Grupo " + Integer.toString(n6 + 1));
            } else {
                e2.setInfo("Grupo " + (String)arrayList2.get(n5));
            }
            ++n5;
            e2.ak(true);
            arrayList3.add(e2);
            LinhaTabelaClassificacao e3 = new LinhaTabelaClassificacao();
            e3.setInfo("topo");
            arrayList3.add(e3);
            int n7 = 0;
            while (n7 < n3) {
                LinhaTabelaClassificacao e4 = new LinhaTabelaClassificacao();
                e4.n(null);
                if (arrayList == null || n4 >= arrayList.size()) {
                    e4.setInfo("Time " + Integer.toString(n7 + 1));
                } else {
                    e4.setInfo((String)arrayList.get(n4));
                }
                e4.l(nArray);
                e4.al(true);
                arrayList3.add(e4);
                ++n4;
                ++n7;
            }
            ++n6;
        }
        return arrayList3;
    }

    public boolean te() {
        return this.NR;
    }

    public void al(boolean bl) {
        this.NR = bl;
    }

    public ModeloTime tf() {
        return this.NS;
    }

    public void H(ModeloTime ah2) {
        this.NS = ah2;
    }

    public boolean tg() {
        return this.NT;
    }

    public void am(boolean bl) {
        this.NT = bl;
    }

    public int b() {
        return this.w;
    }

    public void a(int n2) {
        this.w = n2;
    }
}

