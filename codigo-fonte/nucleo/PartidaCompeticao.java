package nucleo;

import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.Competicao;
import nucleo.EntradaArtilheiro;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import java.io.Serializable;

public class PartidaCompeticao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int ae;
    private int bQ = -1;
    private int bR = -1;
    private String bS = null;
    private int bT = -1;
    private int V;
    private int bU = -1;
    private int bV = -1;

    public PartidaCompeticao() {
    }

    public PartidaCompeticao(Competicao at2, FaseCompeticao l_02, ModeloTime ah2, ModeloTime ah3) {
        this.ae = GerenciadorJogo.SR.H();
        if (ah2 != null) {
            this.bQ = ah2.lk();
        }
        if (ah2 != null && ah2.ka() != null) {
            this.bU = ah2.ka().lT();
        }
        if (ah3 != null) {
            this.bR = ah3.lk();
        }
        if (ah3 != null && ah3.ka() != null) {
            this.bV = ah3.ka().lT();
        }
        int n2 = 0;
        EntradaArtilheiro c_02 = null;
        c_02 = at2.mu();
        at2.mn().add(this);
        if (at2 != null) {
            at2.mr();
            n2 = at2.b();
        }
        if (c_02 != null) {
            ModeloJogador f2 = c_02.x();
            this.V = c_02.y();
            if (f2 != null) {
                this.bS = f2.getNome();
            }
            if (f2 != null && f2.fg() != null) {
                this.bT = f2.fg().lk();
            }
            if (l_02 != null && l_02.b() == 1 && l_02.ip() == 1) {
                c_02.x().a(true);
            }
        }
        if (ah2 != null && ah2.jZ().booleanValue() && at2 != null) {
            GerenciadorTelas.a(ah2, at2, n2);
        }
        if (n2 == 1 && at2 instanceof CompeticaoLigaNacional) {
            ((CompeticaoLigaNacional)at2).BQ();
        }
    }

    public int H() {
        return this.ae;
    }

    public ModeloTime ce() {
        if (this.bQ >= 0) {
            return GerenciadorJogo.SR.x(this.bQ);
        }
        return null;
    }

    public ModeloTime cf() {
        if (this.bR >= 0) {
            return GerenciadorJogo.SR.x(this.bR);
        }
        return null;
    }

    public String cg() {
        return this.bS;
    }

    public ModeloTime ch() {
        if (this.bT >= 0) {
            return GerenciadorJogo.SR.x(this.bT);
        }
        return null;
    }

    public int y() {
        return this.V;
    }

    public Campeonato ci() {
        if (this.bU == -1) {
            return null;
        }
        return GerenciadorJogo.SR.y(this.bU);
    }

    public Campeonato cj() {
        if (this.bV == -1) {
            return null;
        }
        return GerenciadorJogo.SR.y(this.bV);
    }
}

