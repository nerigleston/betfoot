package telas;

import telas.PainelConfiguracaoNovoJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAdicionarTecnicoHumano
implements ActionListener {
    final /* synthetic */ PainelConfiguracaoNovoJogo BP;

    ListenerAdicionarTecnicoHumano(PainelConfiguracaoNovoJogo bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.BP.os();
    }
}

