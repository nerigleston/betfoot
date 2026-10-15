package d;

import d.n_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

class ad_0
extends JTable {
    final /* synthetic */ n_0 Vh;

    ad_0(n_0 n_02, TableModel tableModel) {
        super(tableModel);
        this.Vh = n_02;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n2, int n3) {
        Component component = super.prepareRenderer(tableCellRenderer, n2, n3);
        if (!this.isCellSelected(n2, n3)) {
            if (n2 % 2 == 0 && !this.isCellSelected(n2, n3)) {
                Color color = Color.decode("#f6f7e5");
                component.setBackground(color);
            } else {
                component.setBackground(this.getBackground());
            }
        }
        return component;
    }
}

