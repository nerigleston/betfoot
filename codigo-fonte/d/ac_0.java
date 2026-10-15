package d;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ac_0
implements TableModelListener {
    @Override
    public void tableChanged(TableModelEvent tableModelEvent) {
        int n2 = tableModelEvent.getFirstRow();
        int n3 = tableModelEvent.getColumn();
        TableModel tableModel = (TableModel)tableModelEvent.getSource();
        String string = tableModel.getColumnName(n3);
        Object object = tableModel.getValueAt(n2, n3);
    }
}

