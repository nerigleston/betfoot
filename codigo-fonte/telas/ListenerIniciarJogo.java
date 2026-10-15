package telas;

import telas.TelaConfiguracoesIniciais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerIniciarJogo
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerIniciarJogo(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaConfiguracoesIniciais.b(this.MA);
    }
}

