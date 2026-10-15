package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbaChaveamento2
implements ActionListener {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerAbaChaveamento2(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaChaveamentoCopa.d(this.wq, 2);
    }
}

