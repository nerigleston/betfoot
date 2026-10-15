package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

class OuvinteAbrirTaticasSalvas
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteAbrirTaticasSalvas(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/alpha2.png"));
        this.Bq.oj();
    }
}

