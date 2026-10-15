package telas;

import telas.PainelCampo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarSubPainelCampo
implements ActionListener {
    final /* synthetic */ PainelCampo JZ;

    ListenerMostrarSubPainelCampo(PainelCampo gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCampo.a(this.JZ).setVisible(true);
    }
}

