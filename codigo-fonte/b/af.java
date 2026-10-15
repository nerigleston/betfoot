package b;

import components.w_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class af
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(0);
        super.setVerticalAlignment(1);
        this.setIcon(null);
        this.setText("");
        w_0 w_02 = (w_0)object;
        if (object != null) {
            if (!w_02.to()) {
                if (n3 == 0) {
                    this.setHorizontalAlignment(4);
                    this.setHorizontalTextPosition(2);
                    this.setText(w_02.tR().hc().getNome());
                    this.setIcon(w_02.tR().hc().kU());
                } else if (n3 == 2) {
                    this.setHorizontalAlignment(2);
                    this.setHorizontalTextPosition(4);
                    this.setText(w_02.tR().hd().getNome());
                    this.setIcon(w_02.tR().hd().kU());
                }
                if (n3 == 1) {
                    if (w_02.tR().e()) {
                        String string = "";
                        string = Integer.toString(w_02.tR().hu());
                        String string2 = "";
                        string2 = Integer.toString(w_02.tR().hw());
                        this.setText(String.valueOf(string) + "x" + string2);
                    } else {
                        this.setText("x");
                    }
                }
            } else if (n3 == 0) {
                this.setFont(new Font("Arial", 1, 12));
                this.setText(w_02.sT());
            }
        }
        return this;
    }
}

