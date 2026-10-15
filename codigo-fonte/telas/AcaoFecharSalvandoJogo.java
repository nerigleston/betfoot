package telas;

import telas.PainelAguardeProcesso;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoFecharSalvandoJogo
extends AbstractAction {
    final /* synthetic */ PainelAguardeProcesso LA;

    AcaoFecharSalvandoJogo(PainelAguardeProcesso hz2) {
        this.LA = hz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelAguardeProcesso.a(this.LA).dispose();
    }
}

