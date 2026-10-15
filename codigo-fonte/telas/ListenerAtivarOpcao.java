package telas;

import telas.PainelTesteCampoEscalacao;
import components.PainelCampoEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAtivarOpcao
implements ActionListener {
    final /* synthetic */ PainelTesteCampoEscalacao Ax;

    ListenerAtivarOpcao(PainelTesteCampoEscalacao bu2) {
        this.Ax = bu2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((PainelCampoEscalacao)PainelTesteCampoEscalacao.a(this.Ax)).X(true);
    }
}

