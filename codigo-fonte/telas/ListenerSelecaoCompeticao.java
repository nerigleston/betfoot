package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoCompeticao
implements ActionListener {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerSelecaoCompeticao(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaEstatisticasCompeticao.b(this.yi).getSelectedIndex() >= 0 && !this.yi.xa) {
            TelaEstatisticasCompeticao.c(this.yi, TelaEstatisticasCompeticao.b(this.yi).getSelectedIndex());
        }
    }
}

