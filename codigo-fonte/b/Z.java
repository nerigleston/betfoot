package b;

import best.d_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Z
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        d_0 d_02 = (d_0)object;
        if (n3 == 1) {
            this.setText(d_02.getNome());
        } else if (n3 == 2) {
            if (d_02.B() != null) {
                this.setText(d_02.B().getNome());
            }
        } else if (n3 == 3) {
            this.setText(Integer.toString(d_02.v()));
        } else if (n3 == 4) {
            this.setText(Integer.toString(d_02.w()));
        }
        return this;
    }
}

