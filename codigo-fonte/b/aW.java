package b;

import components.ae_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class aW
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        ae_0 ae_02 = (ae_0)object;
        if (ae_02 != null) {
            this.setText(ae_02.sT());
        }
        return this;
    }
}

