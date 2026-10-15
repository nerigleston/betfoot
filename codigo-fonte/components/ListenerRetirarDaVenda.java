package components;

import components.PainelDetalheJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerRetirarDaVenda
implements ActionListener {
    final /* synthetic */ PainelDetalheJogador Pc;

    ListenerRetirarDaVenda(PainelDetalheJogador m2) {
        this.Pc = m2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Pc.Oy.qR();
    }
}

