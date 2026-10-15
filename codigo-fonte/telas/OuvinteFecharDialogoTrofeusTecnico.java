package telas;

import telas.DialogoGaleriaTrofeusTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoTrofeusTecnico
implements ActionListener {
    final /* synthetic */ DialogoGaleriaTrofeusTecnico EP;

    OuvinteFecharDialogoTrofeusTecnico(DialogoGaleriaTrofeusTecnico dg_02) {
        this.EP = dg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoGaleriaTrofeusTecnico.a(this.EP).dispose();
    }
}

