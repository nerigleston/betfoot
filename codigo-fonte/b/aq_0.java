package b;

import best.u_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class aq_0
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        u_0 u_02 = (u_0)object;
        if (u_02 != null) {
            if (n3 == 0) {
                this.setText(u_02.f());
            } else if (n3 == 1) {
                if (u_02.ct() >= 0) {
                    this.setText(u_02.dR());
                }
            } else if (n3 == 2) {
                if (u_02.dP() != null) {
                    this.setText(u_02.dP().dS());
                }
            } else if (n3 == 3 && u_02.dO() != null) {
                this.setText(u_02.dO().dS());
            }
        }
        return this;
    }
}

