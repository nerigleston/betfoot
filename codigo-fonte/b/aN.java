package b;

import best.a;
import components.x_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class aN
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        x_0 x_02 = (x_0)object;
        if (x_02 != null && x_02.tR() != null && x_02.tR().hc() != null && x_02.tR().hd() != null) {
            if (n3 == 0) {
                if (x_02.tR() != null) {
                    this.setText(((a)c.a.SR.R().get(x_02.tR().hM())).f());
                }
            } else if (n3 == 1) {
                super.setHorizontalTextPosition(4);
                this.setHorizontalAlignment(2);
                this.setText(x_02.tR().hc().getNome());
                this.setIcon(x_02.tR().hc().kU());
            } else if (n3 == 3) {
                super.setHorizontalTextPosition(2);
                this.setHorizontalAlignment(4);
                this.setText(x_02.tR().hd().getNome());
                this.setIcon(x_02.tR().hd().kU());
            } else if (n3 == 2) {
                String string = "";
                string = Integer.toString(x_02.tR().hu());
                String string2 = "";
                string2 = Integer.toString(x_02.tR().hw());
                this.setText(String.valueOf(string) + "x" + string2);
            } else if (n3 == 4) {
                this.setHorizontalAlignment(0);
                this.setFont(new Font("Helvetica", 1, 12));
                if (x_02.C() < 5.0) {
                    super.setForeground(new Color(120, 7, 31));
                } else if (x_02.C() > 7.0) {
                    super.setForeground(new Color(56, 121, 12));
                }
                if (x_02.C() < 2.0) {
                    this.setText("sn");
                } else if (x_02.C() < 10.0) {
                    this.setText(String.format("%.1f", x_02.C()));
                } else if (x_02.C() == 10.0) {
                    this.setText("10");
                }
            }
        }
        return this;
    }
}

