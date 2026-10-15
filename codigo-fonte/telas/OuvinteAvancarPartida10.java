package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAvancarPartida10
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteAvancarPartida10(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelResumoPartida.b(this.Ma, 10);
    }
}

