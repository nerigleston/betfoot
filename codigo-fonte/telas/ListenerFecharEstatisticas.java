package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharEstatisticas
implements ActionListener {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerFecharEstatisticas(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEstatisticasCompeticao.a(this.yi).dispose();
    }
}

