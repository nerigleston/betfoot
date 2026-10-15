package components;

import components.PainelDetalheJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerEstatisticasJogador
implements ActionListener {
    final /* synthetic */ PainelDetalheJogador Pc;

    ListenerEstatisticasJogador(PainelDetalheJogador m2) {
        this.Pc = m2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Pc.Oy.qC();
    }
}

