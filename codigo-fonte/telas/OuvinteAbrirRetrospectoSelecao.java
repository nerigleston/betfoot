package telas;

import telas.PainelConvitesTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAbrirRetrospectoSelecao
implements ActionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    OuvinteAbrirRetrospectoSelecao(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConvitesTecnico.e(this.Kz);
    }
}

