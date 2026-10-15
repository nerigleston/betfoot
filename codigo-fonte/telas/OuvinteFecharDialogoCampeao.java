package telas;

import telas.DialogoCampeaoCompeticao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteFecharDialogoCampeao
extends MouseAdapter {
    final /* synthetic */ DialogoCampeaoCompeticao aeK;

    OuvinteFecharDialogoCampeao(DialogoCampeaoCompeticao dJ2) {
        this.aeK = dJ2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        DialogoCampeaoCompeticao.a(this.aeK).dispose();
    }
}

