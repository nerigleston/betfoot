package telas;

import telas.TelaConfiguracoesIniciais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerIniciarJogo2
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerIniciarJogo2(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaConfiguracoesIniciais.j(this.MA);
    }
}

