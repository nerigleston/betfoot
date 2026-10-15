package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoEstatisticas3
implements ActionListener {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerBotaoEstatisticas3(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEstatisticasCompeticao.b(this.yi, 3);
    }
}

