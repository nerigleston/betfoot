package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteComboInativoClassificacaoJogos
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    OuvinteComboInativoClassificacaoJogos(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaClassificacaoJogos.f(this.wT).getSelectedIndex();
    }
}

