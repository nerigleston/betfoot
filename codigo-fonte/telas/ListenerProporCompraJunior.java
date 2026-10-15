package telas;

import telas.PainelAcademiaJuniores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProporCompraJunior
implements ActionListener {
    final /* synthetic */ PainelAcademiaJuniores FS;

    ListenerProporCompraJunior(PainelAcademiaJuniores ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelAcademiaJuniores.c(this.FS);
    }
}

