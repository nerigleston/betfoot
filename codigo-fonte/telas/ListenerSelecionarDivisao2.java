package telas;

import telas.PainelConfiguracaoNovoJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecionarDivisao2
implements ActionListener {
    final /* synthetic */ PainelConfiguracaoNovoJogo BP;

    ListenerSelecionarDivisao2(PainelConfiguracaoNovoJogo bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.BP.cW(2);
    }
}

