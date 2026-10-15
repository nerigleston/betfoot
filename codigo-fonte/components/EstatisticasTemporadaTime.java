package components;

import nucleo.ModeloTime;
import motor.GerenciadorJogo;

public class EstatisticasTemporadaTime {
    private boolean Or = false;
    private int ae = 0;
    private ModeloTime cg = null;
    private int T = 0;
    private int bX = 0;
    private int d = 0;
    private int nK = 0;
    private int nL = 0;
    private String Rg = "";
    private String Rh = "";
    private String Px = "";
    private boolean nP = false;
    private boolean nQ = false;
    private int nO = -1;
    private boolean nR = false;

    public boolean tt() {
        return this.Or;
    }

    public void ar(boolean bl) {
        this.Or = bl;
    }

    public int H() {
        return this.ae;
    }

    public String uD() {
        return Integer.toString(this.ae + GerenciadorJogo.SR.iU());
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public ModeloTime fg() {
        return this.cg;
    }

    public void n(ModeloTime ah2) {
        this.cg = ah2;
    }

    public int w() {
        return this.T;
    }

    public void h(int n2) {
        this.T = n2;
    }

    public int cm() {
        return this.bX;
    }

    public void dS(int n2) {
        this.bX = n2;
    }

    public int co() {
        return this.d;
    }

    public void dT(int n2) {
        this.d = n2;
    }

    public int ls() {
        return this.nK;
    }

    public void dU(int n2) {
        this.nK = n2;
    }

    public int lt() {
        return this.nL;
    }

    public void dV(int n2) {
        this.nL = n2;
    }

    public String uE() {
        return this.Rg;
    }

    public void T(String string) {
        this.Rg = string;
    }

    public int uF() {
        return this.T - (this.bX + this.d);
    }

    public String uG() {
        return this.Rh;
    }

    public void U(String string) {
        this.Rh = string;
    }

    public String tZ() {
        return this.Px;
    }

    public void M(String string) {
        this.Px = string;
    }

    public boolean lx() {
        return this.nP;
    }

    public void aB(boolean bl) {
        this.nP = bl;
    }

    public boolean ly() {
        return this.nQ;
    }

    public void aC(boolean bl) {
        this.nQ = bl;
    }

    public int lw() {
        return this.nO;
    }

    public void ce(int n2) {
        this.nO = n2;
    }

    public boolean lz() {
        return this.nR;
    }

    public void aD(boolean bl) {
        this.nR = bl;
    }
}

