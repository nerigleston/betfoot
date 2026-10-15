package telas;

import telas.DialogoGaleriaTrofeusTimeIcones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoTrofeusTimeIcones
implements ActionListener {
    final /* synthetic */ DialogoGaleriaTrofeusTimeIcones Fi;

    OuvinteFecharDialogoTrofeusTimeIcones(DialogoGaleriaTrofeusTimeIcones di2) {
        this.Fi = di2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoGaleriaTrofeusTimeIcones.a(this.Fi).dispose();
    }
}

