package telas;

import telas.TelaConvocacaoSelecao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConvocacaoBotao6
implements ActionListener {
    final /* synthetic */ TelaConvocacaoSelecao zl;

    ListenerConvocacaoBotao6(TelaConvocacaoSelecao aP2) {
        this.zl = aP2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaConvocacaoSelecao.f(this.zl);
    }
}

