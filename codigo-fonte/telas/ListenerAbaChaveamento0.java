package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbaChaveamento0
implements ActionListener {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerAbaChaveamento0(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaChaveamentoCopa.d(this.wq, 0);
    }
}

