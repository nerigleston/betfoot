package components;

import components.PainelFiltroJogadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharFiltroJogador
implements ActionListener {
    final /* synthetic */ PainelFiltroJogadores QR;

    ListenerFecharFiltroJogador(PainelFiltroJogadores o2) {
        this.QR = o2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFiltroJogadores.a(this.QR);
    }
}

