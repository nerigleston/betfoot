package telas;

import telas.TelaConvocacaoSelecao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteResetarFiltrosConvocacao
implements ActionListener {
    final /* synthetic */ TelaConvocacaoSelecao zl;

    OuvinteResetarFiltrosConvocacao(TelaConvocacaoSelecao aP2) {
        this.zl = aP2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaConvocacaoSelecao.g(this.zl).rR();
    }
}

