package telas;

import components.ItemRankingTime;
import java.util.Comparator;

class ComparadorPontosClube
implements Comparator {
    ComparadorPontosClube() {
    }

    public int a(ItemRankingTime ae2, ItemRankingTime ae3) {
        int n2;
        int n3 = ae2.uy();
        if (n3 != (n2 = ae3.uy())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ItemRankingTime)object, (ItemRankingTime)object2);
    }
}

