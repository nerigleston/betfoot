package components;

import components.PainelFiltroJogadores;
import components.SliderEstilizado;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ListenerSliderFaixaFiltroC
implements ChangeListener {
    final /* synthetic */ PainelFiltroJogadores QR;

    ListenerSliderFaixaFiltroC(PainelFiltroJogadores o2) {
        this.QR = o2;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        SliderEstilizado aa2 = (SliderEstilizado)changeEvent.getSource();
        this.QR.um();
    }
}

