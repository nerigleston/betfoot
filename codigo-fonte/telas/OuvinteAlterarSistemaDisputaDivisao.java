package telas;

import telas.PainelConfigDivisaoEstadual;
import nucleo.ConstantesJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlterarSistemaDisputaDivisao
implements ActionListener {
    final /* synthetic */ PainelConfigDivisaoEstadual CO;

    OuvinteAlterarSistemaDisputaDivisao(PainelConfigDivisaoEstadual cu_02) {
        this.CO = cu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n2 = ConstantesJogo.sL[PainelConfigDivisaoEstadual.a(this.CO).getSelectedIndex()][0];
        PainelConfigDivisaoEstadual.a(this.CO, PainelConfigDivisaoEstadual.a(this.CO).getSelectedIndex());
        PainelConfigDivisaoEstadual.b(this.CO).J(PainelConfigDivisaoEstadual.c(this.CO), n2);
        PainelConfigDivisaoEstadual.b(this.CO).oJ();
    }
}

