package components;

import nucleo.ModeloTime;

public class ItemRankingClubeCompeticao {
    private ModeloTime cg = null;
    private int w = 0;
    private int[] Re = new int[3];
    private int Rf;

    public ModeloTime fg() {
        return this.cg;
    }

    public void n(ModeloTime ah2) {
        this.cg = ah2;
    }

    public int b() {
        return this.w;
    }

    public void a(int n2) {
        this.w = n2;
    }

    public int uy() {
        return this.Re[0];
    }

    public int uz() {
        return this.Re[1];
    }

    public int uA() {
        return this.Re[2];
    }

    public void dQ(int n2) {
        this.Re[0] = n2;
    }

    public int[] uB() {
        return this.Re;
    }

    public void m(int[] nArray) {
        this.Re = nArray;
    }

    public int uC() {
        return this.Rf;
    }

    public void dR(int n2) {
        this.Rf = n2;
    }
}

