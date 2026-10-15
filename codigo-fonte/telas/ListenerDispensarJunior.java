package telas;

import telas.PainelAcademiaJuniores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerDispensarJunior
implements ActionListener {
    final /* synthetic */ PainelAcademiaJuniores FS;

    ListenerDispensarJunior(PainelAcademiaJuniores ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.FS.pM();
    }
}

