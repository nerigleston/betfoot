package telas;

import telas.TelaConvocacaoSelecao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConvocacaoBotao4
implements ActionListener {
    final /* synthetic */ TelaConvocacaoSelecao zl;

    ListenerConvocacaoBotao4(TelaConvocacaoSelecao aP2) {
        this.zl = aP2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaConvocacaoSelecao.d(this.zl);
    }
}

