package b;

import c.a;
import components.ac_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class av_0
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        ac_0 ac_02 = (ac_0)object;
        if (ac_02 != null) {
            if (n3 == 0) {
                this.setIcon(ac_02.vC());
                this.setText(ac_02.vB());
            } else if (n3 == 1) {
                this.setIcon(ac_02.cu().kU());
                this.setText(ac_02.cu().getNome());
            } else if (n3 == 2) {
                this.setText(Integer.toString(ac_02.H() + a.SR.iU()));
            }
        }
        return this;
    }
}

