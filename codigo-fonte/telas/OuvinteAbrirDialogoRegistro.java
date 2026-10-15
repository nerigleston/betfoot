package telas;

import telas.DialogoRegistroBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAbrirDialogoRegistro
implements ActionListener {
    final /* synthetic */ DialogoRegistroBetfoot El;

    OuvinteAbrirDialogoRegistro(DialogoRegistroBetfoot da2) {
        this.El = da2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoRegistroBetfoot.b(this.El);
    }
}

