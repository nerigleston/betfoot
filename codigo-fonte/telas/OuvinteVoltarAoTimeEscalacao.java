package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

class OuvinteVoltarAoTimeEscalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteVoltarAoTimeEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/alpha3.png"));
        TelaEscalacao.b(this.Bq, true);
        TelaEscalacao.i(this.Bq).dispose();
    }
}

