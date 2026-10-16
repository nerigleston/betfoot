package editor;

import editor.JanelaTransferenciaJogador;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

class TabelaTimesTransferencia
extends JTable {
    final /* synthetic */ JanelaTransferenciaJogador VN;

    TabelaTimesTransferencia(JanelaTransferenciaJogador ai2, TableModel tableModel) {
        super(tableModel);
        this.VN = ai2;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n2, int n3) {
        Component component = super.prepareRenderer(tableCellRenderer, n2, n3);
        components.TemaBetfoot.linha(this, component, n2, n3);
        return component;
    }
}

