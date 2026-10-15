package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaSerializavel
extends ArrayList
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList aaD = null;

    public ArrayList Ae() {
        return this.aaD;
    }

    public ListaSerializavel(ArrayList arrayList) {
        this.aaD = arrayList;
    }
}

