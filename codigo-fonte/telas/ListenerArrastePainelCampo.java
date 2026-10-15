package telas;

import telas.PainelCampo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerArrastePainelCampo
extends MouseAdapter {
    final /* synthetic */ PainelCampo JZ;

    ListenerArrastePainelCampo(PainelCampo gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        PainelCampo.a(this.JZ, mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        PainelCampo.b(this.JZ, mouseEvent);
    }
}

