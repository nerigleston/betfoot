package telas;

import telas.PainelAcademiaJuniores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerPromoverJunior
implements ActionListener {
    final /* synthetic */ PainelAcademiaJuniores FS;

    ListenerPromoverJunior(PainelAcademiaJuniores ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.FS.pN();
    }
}

