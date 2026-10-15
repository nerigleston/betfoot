package nucleo;

import nucleo.LigaNacional;
import nucleo.CarregadorConfigEstadual;
import java.io.Serializable;

public class FaseCompeticao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome = null;
    private int w = 0;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String string) {
        this.nome = string;
    }

    public int b() {
        return this.w;
    }

    public void a(int n2) {
        this.w = n2;
    }

    public String io() {
        return "";
    }

    public int ip() {
        return -1;
    }

    public LigaNacional iq() {
        return null;
    }

    public CarregadorConfigEstadual ir() {
        return null;
    }

    public String is() {
        return "";
    }
}

