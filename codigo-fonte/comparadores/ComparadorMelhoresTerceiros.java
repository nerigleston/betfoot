package comparadores;

import nucleo.ModeloTime;
import competicoes.LigaPontosCorridos;
import java.util.Comparator;

class ComparadorMelhoresTerceiros
implements Comparator {
    ComparadorMelhoresTerceiros() {
    }

    public int c(ModeloTime ah2, ModeloTime ah3) {
        int[] nArray = ah2.d(LigaPontosCorridos.Zl);
        int[] nArray2 = ah3.d(LigaPontosCorridos.Zl);
        int n2 = nArray[0];
        int n3 = nArray2[0];
        int n4 = nArray[2];
        int n5 = nArray2[2];
        int n6 = nArray[7];
        int n7 = nArray2[7];
        int n8 = nArray[5];
        int n9 = nArray2[5];
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        if (n6 != n7) {
            return n7 - n6;
        }
        if (n8 != n9) {
            return n9 - n8;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ModeloTime)object, (ModeloTime)object2);
    }
}

