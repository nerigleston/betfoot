package telas;

import telas.PainelCampo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class OuvinteArrastePainelCampo
extends MouseMotionAdapter {
    final /* synthetic */ PainelCampo JZ;

    OuvinteArrastePainelCampo(PainelCampo gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        PainelCampo.c(this.JZ, mouseEvent);
    }
}

