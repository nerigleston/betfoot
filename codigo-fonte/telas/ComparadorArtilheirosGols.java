package telas;

import nucleo.ItemRankingArtilheirosCarreira;
import java.util.Comparator;

class ComparadorArtilheirosGols
implements Comparator {
    ComparadorArtilheirosGols() {
    }

    public int a(ItemRankingArtilheirosCarreira d_02, ItemRankingArtilheirosCarreira d_03) {
        int n2 = d_02.v();
        int n3 = d_03.v();
        int n4 = d_02.w();
        int n5 = d_03.w();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ItemRankingArtilheirosCarreira)object, (ItemRankingArtilheirosCarreira)object2);
    }
}

