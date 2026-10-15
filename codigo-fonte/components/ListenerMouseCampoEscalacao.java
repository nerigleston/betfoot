package components;

import components.PainelCampoEscalacao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerMouseCampoEscalacao
extends MouseAdapter {
    final /* synthetic */ PainelCampoEscalacao QX;

    ListenerMouseCampoEscalacao(PainelCampoEscalacao y_02) {
        this.QX = y_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        PainelCampoEscalacao.a(this.QX, mouseEvent);
    }
}

