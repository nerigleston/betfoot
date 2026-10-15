package telas;

import telas.PainelAcademiaJuniores;
import tabelas.ModeloTabelaJuniores;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class OuvinteSelecaoJuniorAcademia
implements ListSelectionListener {
    final /* synthetic */ PainelAcademiaJuniores FS;

    OuvinteSelecaoJuniorAcademia(PainelAcademiaJuniores ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelAcademiaJuniores.a(this.FS).getSelectedRow() >= 0) {
            int n2 = PainelAcademiaJuniores.a(this.FS).convertRowIndexToModel(PainelAcademiaJuniores.a(this.FS).getSelectedRow());
            ((ModeloTabelaJuniores)PainelAcademiaJuniores.a(this.FS).getModel()).et(n2);
        }
    }
}

