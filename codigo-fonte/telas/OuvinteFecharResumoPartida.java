package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharResumoPartida
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteFecharResumoPartida(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelResumoPartida.a(this.Ma).dispose();
    }
}

