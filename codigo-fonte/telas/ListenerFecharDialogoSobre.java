package telas;

import telas.PainelSobre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoSobre
implements ActionListener {
    final /* synthetic */ PainelSobre Nz;

    ListenerFecharDialogoSobre(PainelSobre jp_02) {
        this.Nz = jp_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelSobre.a(this.Nz).dispose();
    }
}

