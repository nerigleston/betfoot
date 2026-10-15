package telas;

import telas.DialogoGaleriaTrofeusTimeTabela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoTrofeusTimeTabela
implements ActionListener {
    final /* synthetic */ DialogoGaleriaTrofeusTimeTabela Er;

    OuvinteFecharDialogoTrofeusTimeTabela(DialogoGaleriaTrofeusTimeTabela de2) {
        this.Er = de2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoGaleriaTrofeusTimeTabela.a(this.Er).dispose();
    }
}

