package telas;

import telas.PainelCentralMensagens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharCentralMensagens
implements ActionListener {
    final /* synthetic */ PainelCentralMensagens Ae;

    ListenerFecharCentralMensagens(PainelCentralMensagens bn_02) {
        this.Ae = bn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCentralMensagens.a(this.Ae).dispose();
    }
}

