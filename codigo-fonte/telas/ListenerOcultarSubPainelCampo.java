package telas;

import telas.PainelCampo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOcultarSubPainelCampo
implements ActionListener {
    final /* synthetic */ PainelCampo JZ;

    ListenerOcultarSubPainelCampo(PainelCampo gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCampo.a(this.JZ).setVisible(false);
    }
}

