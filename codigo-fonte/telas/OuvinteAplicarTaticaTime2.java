package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAplicarTaticaTime2
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteAplicarTaticaTime2(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelResumoPartida.b(this.Ma) != null) {
            PainelResumoPartida.a(this.Ma, 2);
        }
    }
}

