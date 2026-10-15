package telas;

import telas.PainelConfiguracaoNovoJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAdicionarOutroTecnicoNovoJogo
implements ActionListener {
    final /* synthetic */ PainelConfiguracaoNovoJogo BP;

    OuvinteAdicionarOutroTecnicoNovoJogo(PainelConfiguracaoNovoJogo bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConfiguracaoNovoJogo.b(this.BP);
    }
}

