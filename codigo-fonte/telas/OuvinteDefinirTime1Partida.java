package telas;

import telas.PainelResumoPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteDefinirTime1Partida
implements ActionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteDefinirTime1Partida(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelResumoPartida.b(this.Ma) != null) {
            PainelResumoPartida.c(this.Ma);
        }
    }
}

