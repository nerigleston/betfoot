package telas;

import telas.PainelConvitesTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAbrirDetalheSelecao
implements ActionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    OuvinteAbrirDetalheSelecao(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConvitesTecnico.c(this.Kz);
    }
}

