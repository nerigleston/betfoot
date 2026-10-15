package tabelas;

import telas.PainelPartidaAoVivo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaJogosAoVivo
extends AbstractTableModel {
    private String[] Nt = new String[]{"", "", "", "", "", ""};
    private ArrayList vK;
    private PainelPartidaAoVivo GS = null;

    public ModeloTabelaJogosAoVivo(PainelPartidaAoVivo dV2) {
        this.GS = dV2;
        this.vK = dV2.qi();
    }

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return this.vK.size();
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (n2 < this.vK.size()) {
            return this.vK.get(n2);
        }
        return null;
    }

    public Class getColumnClass(int n2) {
        if (this.getValueAt(0, n2) != null) {
            return this.getValueAt(0, n2).getClass();
        }
        return String.class;
    }
}

