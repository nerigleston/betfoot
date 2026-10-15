package telas;

import telas.PainelAcademiaJuniores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharAcademiaJuniores
implements ActionListener {
    final /* synthetic */ PainelAcademiaJuniores FS;

    ListenerFecharAcademiaJuniores(PainelAcademiaJuniores ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelAcademiaJuniores.b(this.FS).dispose();
    }
}

