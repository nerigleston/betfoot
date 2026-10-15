package nucleo;

import nucleo.ModeloTime;
import nucleo.EntradaArtilheiro;

public class ItemRankingArtilheirosCarreira {
    private String nome = null;
    private ModeloTime X = null;
    private int g = 0;
    private int T = 0;

    public ItemRankingArtilheirosCarreira(String string, ModeloTime ah2, int n2, int n3) {
        this.nome = string;
        this.X = ah2;
        this.g = n2;
        this.T = n3;
    }

    public ItemRankingArtilheirosCarreira(EntradaArtilheiro c_02) {
        if (c_02.x() != null) {
            this.nome = c_02.x().getNome();
            this.X = c_02.x().fg();
            this.g = c_02.y();
            this.T = c_02.A();
        }
    }

    public String getNome() {
        return this.nome;
    }

    public ModeloTime B() {
        return this.X;
    }

    public void b(ModeloTime ah2) {
        this.X = ah2;
    }

    public int v() {
        return this.g;
    }

    public int w() {
        return this.T;
    }
}

