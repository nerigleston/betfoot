package components;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.PartidaCompeticao;
import motor.GerenciadorJogo;

public class ItemHistoricoCampeao {
    private int ae;
    private int RN = -1;
    private int V;
    private ModeloTime RO = null;
    private ModeloTime RP = null;
    private ModeloTime RQ = null;
    private String RR = "";
    private Campeonato RS = null;
    private boolean Or;
    private LigaNacional RT = null;
    private boolean afN = false;

    public ItemHistoricoCampeao(PartidaCompeticao i_02, int n2, int n3) {
        this.RN = n2;
        if (i_02 != null) {
            this.ae = i_02.H();
            this.RO = i_02.ce();
            this.RP = i_02.cf();
            this.RQ = i_02.ch();
            this.RR = i_02.cg();
            this.RS = i_02.ci();
            this.V = i_02.y();
        } else {
            this.RT = GerenciadorJogo.SR.o(n2);
            this.Or = true;
        }
    }

    public Campeonato ci() {
        return this.RS;
    }

    public ModeloTime ce() {
        return this.RO;
    }

    public ModeloTime cf() {
        return this.RP;
    }

    public String cg() {
        return this.RR;
    }

    public ModeloTime ch() {
        return this.RQ;
    }

    public int H() {
        return this.ae;
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public int y() {
        return this.V;
    }

    public void ek(int n2) {
        this.V = n2;
    }

    public boolean tt() {
        return this.Or;
    }

    public void ar(boolean bl) {
        this.Or = bl;
    }

    public int vk() {
        return this.RN;
    }

    public void el(int n2) {
        this.RN = n2;
    }

    public LigaNacional vl() {
        return this.RT;
    }

    public void f(LigaNacional z2) {
        this.RT = z2;
    }
}

