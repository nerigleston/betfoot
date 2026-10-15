package editor;

import nucleo.UtilitariosTexto;
import editor.PainelEdicaoTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class ListenerBotaoConfirmarTime
implements ActionListener {
    final /* synthetic */ PainelEdicaoTime VG;

    ListenerBotaoConfirmarTime(PainelEdicaoTime ac2) {
        this.VG = ac2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelEdicaoTime.a(this.VG).clear();
        if (!PainelEdicaoTime.b(this.VG)) {
            this.VG.xc();
        } else {
            this.VG.xd();
        }
        if (PainelEdicaoTime.a(this.VG).size() == 0) {
            UtilitariosTexto.da().wo();
            UtilitariosTexto.da().Uw.dispose();
        } else {
            JOptionPane.showMessageDialog(null, PainelEdicaoTime.a(this.VG).get(0), "", 0);
        }
    }
}

