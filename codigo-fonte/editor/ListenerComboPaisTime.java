package editor;

import nucleo.UtilitariosTexto;
import editor.PainelEdicaoTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerComboPaisTime
implements ActionListener {
    final /* synthetic */ PainelEdicaoTime VG;

    ListenerComboPaisTime(PainelEdicaoTime ac2) {
        this.VG = ac2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (UtilitariosTexto.H(PainelEdicaoTime.c(this.VG).getSelectedIndex()) == 29) {
            PainelEdicaoTime.d(this.VG).setVisible(true);
            PainelEdicaoTime.e(this.VG).setVisible(true);
        } else {
            PainelEdicaoTime.d(this.VG).setVisible(false);
            PainelEdicaoTime.e(this.VG).setVisible(false);
        }
    }
}

