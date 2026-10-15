package components;

import components.PainelFiltroJogadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharFiltroJogadorAlt
implements ActionListener {
    final /* synthetic */ PainelFiltroJogadores QR;

    ListenerFecharFiltroJogadorAlt(PainelFiltroJogadores o2) {
        this.QR = o2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFiltroJogadores.a(this.QR);
    }
}

