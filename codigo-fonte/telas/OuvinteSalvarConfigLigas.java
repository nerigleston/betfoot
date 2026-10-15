package telas;

import telas.DialogoConfigLigas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSalvarConfigLigas
implements ActionListener {
    final /* synthetic */ DialogoConfigLigas Gu;

    OuvinteSalvarConfigLigas(DialogoConfigLigas dG2) {
        this.Gu = dG2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Gu.nH();
    }
}

