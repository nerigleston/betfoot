package telas;

import telas.DialogoNegociacaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarTecnico
implements ActionListener {
    final /* synthetic */ DialogoNegociacaoJogador Da;

    ListenerConfirmarTecnico(DialogoNegociacaoJogador cz_02) {
        this.Da = cz_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoNegociacaoJogador.b(this.Da);
    }
}

