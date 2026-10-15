package telas;

import telas.DialogoNegociacaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoTecnico
implements ActionListener {
    final /* synthetic */ DialogoNegociacaoJogador Da;

    ListenerFecharDialogoTecnico(DialogoNegociacaoJogador cz_02) {
        this.Da = cz_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoNegociacaoJogador.a(this.Da).dispose();
    }
}

