package editor;

import nucleo.UtilitariosTexto;
import editor.PainelEdicaoTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoCancelarTime
implements ActionListener {
    final /* synthetic */ PainelEdicaoTime VG;

    ListenerBotaoCancelarTime(PainelEdicaoTime ac2) {
        this.VG = ac2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UtilitariosTexto.da().Uw.dispose();
    }
}

