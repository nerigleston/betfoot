package components;

import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import motor.GerenciadorJogo;
import java.io.Serializable;
import java.util.ArrayList;

public class ModeloRegistroJogador
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int RU = 0;
    private int RV = 0;
    private String RW = "";
    private String RX = "";
    private String data = "";
    boolean RY = false;
    boolean RZ = false;
    String Sa = "";
    String Sb = "";
    int oq = -1;
    int Sc = -1;
    int Sd = -1;
    boolean Se;

    public ModeloRegistroJogador() {
    }

    public ModeloRegistroJogador(boolean bl, int n2, ModeloTime ah2, ModeloJogador f2, Campeonato al2, int n3, int n4, String string, String string2) {
        this.a(al2, n3, n4, string, string2);
        if (f2 != null) {
            this.Sa = f2.getNome();
            this.oq = (int)Math.round((double)f2.fj() * 0.1);
            this.RZ = bl;
            this.Sc = n2;
        }
    }

    public ModeloRegistroJogador(Campeonato al2, int n2, int n3, String string, String string2) {
        this.a(al2, n2, n3, string, string2);
    }

    private void a(Campeonato al2, int n2, int n3, String string, String string2) {
        this.RU = n2;
        this.RV = n3;
        this.RW = string;
        this.RX = string2;
        this.data = GerenciadorJogo.SR.T();
        if (al2 != null) {
            if (al2.lQ() == null) {
                al2.T(new ArrayList());
            }
            al2.lQ().add(this);
        }
    }

    public int vm() {
        return this.RU;
    }

    public void en(int n2) {
        this.RU = n2;
    }

    public int vn() {
        return this.RV;
    }

    public void eo(int n2) {
        this.RV = n2;
    }

    public boolean vo() {
        return this.RY;
    }

    public void aF(boolean bl) {
        this.RY = bl;
    }

    public String getData() {
        return this.data;
    }

    public String vp() {
        return this.RW;
    }

    public String vq() {
        return this.RX;
    }

    public boolean vr() {
        return this.RZ;
    }

    public void aG(boolean bl) {
        this.RZ = bl;
    }

    public String vs() {
        return this.Sa;
    }

    public void X(String string) {
        this.Sa = string;
    }

    public int lY() {
        return this.oq;
    }

    public void cq(int n2) {
        this.oq = n2;
    }

    public int vt() {
        return this.Sc;
    }

    public void ep(int n2) {
        this.Sc = n2;
    }

    public int vu() {
        return this.Sd;
    }

    public void eq(int n2) {
        this.Sd = n2;
    }

    public boolean vv() {
        return this.Se;
    }

    public void aH(boolean bl) {
        this.Se = bl;
    }

    public String vw() {
        return this.Sb;
    }

    public void Y(String string) {
        this.Sb = string;
    }
}

