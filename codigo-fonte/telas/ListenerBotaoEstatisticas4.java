package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoEstatisticas4
implements ActionListener {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerBotaoEstatisticas4(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEstatisticasCompeticao.b(this.yi, 4);
    }
}

