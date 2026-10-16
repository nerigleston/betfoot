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
        // Edição de time existente: confirma antes de gravar.
        if (!UtilitariosTexto.da().wN() && !components.TemaBetfoot.confirmar(UtilitariosTexto.da().Uw, "Salvar altera\u00e7\u00f5es", "Salvar as altera\u00e7\u00f5es em " + UtilitariosTexto.da().wI().getNome() + "?", "Salvar", false)) {
            return;
        }
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
            components.TemaBetfoot.aviso(UtilitariosTexto.da().Uw, "Confira os dados", String.valueOf(PainelEdicaoTime.a(this.VG).get(0)));
        }
    }
}

