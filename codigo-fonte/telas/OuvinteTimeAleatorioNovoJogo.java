package telas;

import telas.PainelConfiguracaoNovoJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTimeAleatorioNovoJogo
implements ActionListener {
    final /* synthetic */ PainelConfiguracaoNovoJogo BP;

    OuvinteTimeAleatorioNovoJogo(PainelConfiguracaoNovoJogo bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConfiguracaoNovoJogo.a(this.BP);
    }
}

