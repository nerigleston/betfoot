package d;

import d.x_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

class z_0
extends JTable {
    final /* synthetic */ x_0 Vm;

    z_0(x_0 x_02, TableModel tableModel) {
        super(tableModel);
        this.Vm = x_02;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n2, int n3) {
        Component component = super.prepareRenderer(tableCellRenderer, n2, n3);
        if (!this.isCellSelected(n2, n3)) {
            if (n2 % 2 == 0 && !this.isCellSelected(n2, n3)) {
                component.setBackground(Color.LIGHT_GRAY);
            } else {
                component.setBackground(this.getBackground());
            }
        }
        return component;
    }
}

