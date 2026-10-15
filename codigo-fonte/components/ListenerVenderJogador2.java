package components;

import components.PainelDetalheJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerVenderJogador2
implements ActionListener {
    final /* synthetic */ PainelDetalheJogador Pc;

    ListenerVenderJogador2(PainelDetalheJogador m2) {
        this.Pc = m2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Pc.Oy.qX();
    }
}

