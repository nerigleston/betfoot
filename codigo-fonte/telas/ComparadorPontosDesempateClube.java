package telas;

import components.ItemRankingTime;
import java.util.Comparator;

class ComparadorPontosDesempateClube
implements Comparator {
    ComparadorPontosDesempateClube() {
    }

    public int a(ItemRankingTime ae2, ItemRankingTime ae3) {
        int n2 = ae2.uy();
        int n3 = ae3.uy();
        int n4 = ae2.uA();
        int n5 = ae3.uA();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ItemRankingTime)object, (ItemRankingTime)object2);
    }
}

