package telas;

import telas.DialogoConfigLigas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoConfigLigas
implements ActionListener {
    final /* synthetic */ DialogoConfigLigas Gu;

    OuvinteFecharDialogoConfigLigas(DialogoConfigLigas dG2) {
        this.Gu = dG2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoConfigLigas.a(this.Gu).dispose();
    }
}

