package telas;

import telas.TelaEstatisticasCompeticao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbaEstatisticas2
extends MouseAdapter {
    final /* synthetic */ TelaEstatisticasCompeticao yi;

    ListenerAbaEstatisticas2(TelaEstatisticasCompeticao ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaEstatisticasCompeticao.a(this.yi, 2);
    }
}

