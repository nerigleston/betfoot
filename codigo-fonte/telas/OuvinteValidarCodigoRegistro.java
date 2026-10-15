package telas;

import telas.DialogoRegistroBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteValidarCodigoRegistro
implements ActionListener {
    final /* synthetic */ DialogoRegistroBetfoot El;

    OuvinteValidarCodigoRegistro(DialogoRegistroBetfoot da2) {
        this.El = da2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoRegistroBetfoot.c(this.El);
    }
}

