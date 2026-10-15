package telas;

import telas.PainelLideresAssistencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFiltroPaisLideresAssistencias
implements ActionListener {
    final /* synthetic */ PainelLideresAssistencias vo;

    OuvinteFiltroPaisLideresAssistencias(PainelLideresAssistencias y_02) {
        this.vo = y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelLideresAssistencias.a(this.vo);
    }
}

