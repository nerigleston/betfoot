package b;

import best.a_0;
import best.aq;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class as_0
extends DefaultTableCellRenderer {
    private boolean SP;

    public as_0(boolean bl) {
        this.SP = bl;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.WHITE);
        this.setFont(new Font("Arial", 0, 11));
        this.setHorizontalAlignment(0);
        this.setIcon(null);
        this.setText("");
        a_0 a_02 = (a_0)object;
        if (this.SP) {
            this.setBackground(aq.or);
        }
        if (a_02 != null && a_02.isDone()) {
            if (n3 == 1) {
                if (a_02.b() < 90) {
                    this.setText(a_02.er());
                } else if (a_02.b() == 91) {
                    this.setText("Gols");
                } else if (a_02.b() == 92) {
                    this.setText("Cart\u00f5es");
                } else if (a_02.b() == 95) {
                    this.setText("Contus\u00f5es");
                } else if (a_02.b() == 96) {
                    this.setText("Substitui\u00e7\u00f5es");
                }
            }
            if (a_02.b() > 90) {
                if (n3 == 1) {
                    this.setFont(new Font("Arial", 1, 12));
                    this.setHorizontalAlignment(0);
                    this.setBackground(aq.os);
                }
            } else if (a_02.et() == 0) {
                if (n3 == 0) {
                    this.setIcon(a_02.es());
                } else if (n3 == 1) {
                    this.setHorizontalAlignment(2);
                }
            } else if (a_02.et() == 1) {
                if (n3 == 2) {
                    this.setIcon(a_02.es());
                } else if (n3 == 1) {
                    this.setHorizontalAlignment(4);
                }
            }
        }
        return this;
    }
}

