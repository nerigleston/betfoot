package telas;

import telas.DialogoCarregarJogoSalvo;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class OuvinteSelecaoArquivoSalvo
implements ListSelectionListener {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    OuvinteSelecaoArquivoSalvo(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && DialogoCarregarJogoSalvo.e(this.GR).getSelectedRow() >= 0) {
            int n2 = DialogoCarregarJogoSalvo.e(this.GR).convertRowIndexToModel(DialogoCarregarJogoSalvo.e(this.GR).getSelectedRow());
            DialogoCarregarJogoSalvo.a(this.GR, (String)DialogoCarregarJogoSalvo.f(this.GR).get(n2));
            DialogoCarregarJogoSalvo.g(this.GR);
        }
    }
}

