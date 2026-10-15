package components;

import components.PainelFiltroJogadores;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ListenerSliderAtributosFiltro
implements ChangeListener {
    final /* synthetic */ PainelFiltroJogadores QR;

    ListenerSliderAtributosFiltro(PainelFiltroJogadores o2) {
        this.QR = o2;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.QR.um();
    }
}

