package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoChaveamento
implements ActionListener {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerSelecaoChaveamento(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaChaveamentoCopa.d(this.wq).getSelectedIndex() >= 0) {
            TelaChaveamentoCopa.c(this.wq, TelaChaveamentoCopa.d(this.wq).getSelectedIndex());
        }
    }
}

