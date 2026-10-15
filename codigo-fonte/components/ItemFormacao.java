package components;

import nucleo.FaseCompeticao;

public class ItemFormacao {
    private FaseCompeticao[] Pw;
    private String Px;

    public ItemFormacao(FaseCompeticao[] l_0Array, String string) {
        this.Pw = l_0Array;
        this.Px = string;
    }

    public FaseCompeticao[] tY() {
        return this.Pw;
    }

    public String tZ() {
        return this.Px;
    }

    public void M(String string) {
        this.Px = string;
    }
}

