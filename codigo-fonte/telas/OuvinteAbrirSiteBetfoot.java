package telas;

import telas.DialogoRegistroBetfoot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteAbrirSiteBetfoot
extends MouseAdapter {
    final /* synthetic */ DialogoRegistroBetfoot El;

    OuvinteAbrirSiteBetfoot(DialogoRegistroBetfoot da2) {
        this.El = da2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        DialogoRegistroBetfoot.a(this.El);
    }
}

