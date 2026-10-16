package editor;

import editor.JanelaEditorBetfoot;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

class TabelaListaTimes
extends JTable {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    TabelaListaTimes(JanelaEditorBetfoot n_02, TableModel tableModel) {
        super(tableModel);
        this.Vh = n_02;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n2, int n3) {
        Component component = super.prepareRenderer(tableCellRenderer, n2, n3);
        components.TemaBetfoot.linha(this, component, n2, n3);
        return component;
    }
}

