package tabelas;

import motor.GerenciadorJogo;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaEstadosTimes
extends AbstractTableModel {
    private String[] Nt = new String[]{"Estado", "Times"};

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return GerenciadorJogo.SR.bE.length;
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (n3 == 0) {
            return n2;
        }
        if (n3 == 1) {
            return GerenciadorJogo.SR.bE[n2];
        }
        return null;
    }

    @Override
    public String getColumnName(int n2) {
        return this.Nt[n2];
    }

    public Class getColumnClass(int n2) {
        return this.getValueAt(0, n2).getClass();
    }
}

