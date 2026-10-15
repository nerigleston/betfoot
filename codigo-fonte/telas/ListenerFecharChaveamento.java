package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharChaveamento
implements ActionListener {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerFecharChaveamento(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaChaveamentoCopa.a(this.wq).dispose();
    }
}

