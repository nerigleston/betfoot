package telas;

import telas.TelaConfiguracoesIniciais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvintePreferenciasConfigIniciais
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvintePreferenciasConfigIniciais(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.MA.rv();
    }
}

