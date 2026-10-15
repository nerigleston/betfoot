package telas;

import telas.PainelConvitesTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAbrirTabelaSelecao
implements ActionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    OuvinteAbrirTabelaSelecao(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConvitesTecnico.d(this.Kz);
    }
}

