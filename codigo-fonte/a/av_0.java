package a;

import a.al;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class av_0
implements ActionListener {
    final /* synthetic */ al wT;

    av_0(al al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        al.b(this.wT).dispose();
    }
}

