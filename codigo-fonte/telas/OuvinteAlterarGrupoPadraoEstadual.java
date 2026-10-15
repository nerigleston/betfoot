package telas;

import telas.DialogoConfigCampeonatosEstaduais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlterarGrupoPadraoEstadual
implements ActionListener {
    final /* synthetic */ DialogoConfigCampeonatosEstaduais CX;

    OuvinteAlterarGrupoPadraoEstadual(DialogoConfigCampeonatosEstaduais cw_02) {
        this.CX = cw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setUsaGrupoPadraoEstadual(DialogoConfigCampeonatosEstaduais.a(this.CX).isSelected());
        GerenciadorJogo.vM().setUsaGrupoPadraoEstadual(DialogoConfigCampeonatosEstaduais.a(this.CX).isSelected());
        GerenciadorJogo.vJ();
    }
}

