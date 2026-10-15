package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteDefinirTime2Partida
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteDefinirTime2Partida(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelResumoPartida.b(this.Ma) != null) {
            PainelResumoPartida.d(this.Ma);
        }
    }
}

