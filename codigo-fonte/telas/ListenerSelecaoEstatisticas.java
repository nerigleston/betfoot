package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ListenerSelecaoEstatisticas
implements ItemListener {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerSelecaoEstatisticas(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getStateChange() == 1 && !this.yi.wZ) {
            TelaEstatisticasCompeticao.d(this.yi, TelaEstatisticasCompeticao.c(this.yi).getSelectedIndex());
        }
    }
}

