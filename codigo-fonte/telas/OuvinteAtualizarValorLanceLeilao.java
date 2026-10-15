package telas;

import telas.PainelFichaJogador;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class OuvinteAtualizarValorLanceLeilao
implements DocumentListener {
    final /* synthetic */ PainelFichaJogador Gn;

    OuvinteAtualizarValorLanceLeilao(PainelFichaJogador dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        PainelFichaJogador.e(this.Gn);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        PainelFichaJogador.e(this.Gn);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        PainelFichaJogador.e(this.Gn);
    }
}

