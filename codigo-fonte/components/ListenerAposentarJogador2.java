package components;

import components.PainelDetalheJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAposentarJogador2
implements ActionListener {
    final /* synthetic */ PainelDetalheJogador Pc;

    ListenerAposentarJogador2(PainelDetalheJogador m2) {
        this.Pc = m2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Pc.Oy.qW();
    }
}

