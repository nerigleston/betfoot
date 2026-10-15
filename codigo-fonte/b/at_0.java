package b;

import best.C;
import components.j_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class at_0
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        j_0 j_02 = (j_0)object;
        if (j_02 != null) {
            if (j_02.isBold()) {
                this.setFont(new Font("Tahoma", 1, 11));
            }
            if (n3 == 0) {
                this.setHorizontalAlignment(4);
                this.setText(j_02.sT());
            } else if (n3 == 1 && !j_02.tt()) {
                this.setText(C.c(j_02.ts()));
            }
        }
        return this;
    }
}

