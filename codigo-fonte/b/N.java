package b;

import a.ds_0;
import b.o_0;
import best.F;
import best.ah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class N
extends AbstractTableModel {
    private String[] Nt;
    private ArrayList vp;
    private static int SE = 1;
    private ds_0 SM = null;
    public static Comparator KZ = new o_0();

    public N(ah ah2, ds_0 ds_02) {
        this.SM = ds_02;
        this.vp = ah2.ky();
        Collections.sort(this.vp, KZ);
        this.Nt = new String[]{"", "P", "Pais", "Nome", "Idade", "L", "Desenvolvimento", "CPE", "Car", "Valor estimado", "Sal\u00e1rio"};
        int n2 = 0;
        while (n2 < this.vp.size()) {
            ((F)this.vp.get(n2)).a((ImageIcon)null);
            ++n2;
        }
        if (this.vp.size() > 0) {
            this.et(0);
        }
    }

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return this.vp.size();
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (this.vp.size() > 0) {
            return this.vp.get(n2);
        }
        return null;
    }

    @Override
    public String getColumnName(int n2) {
        return this.Nt[n2];
    }

    public Class getColumnClass(int n2) {
        if (this.getValueAt(0, n2) != null) {
            return this.getValueAt(0, n2).getClass();
        }
        return String.class;
    }

    public void et(int n2) {
        this.SM.z((F)this.vp.get(n2));
    }

    public ArrayList uH() {
        return this.vp;
    }

    static /* synthetic */ int vG() {
        return SE;
    }
}

