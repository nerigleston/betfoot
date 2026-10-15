package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAvancarPartida1
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteAvancarPartida1(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelResumoPartida.b(this.Ma, 1);
    }
}

