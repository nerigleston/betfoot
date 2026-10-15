package testes;

import motor.GerenciadorJogo;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSimularAnos
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerSimularAnos(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n2 = 0;
        int n3 = 1;
        JanelaMenuTeste.a(this.Xb);
        GerenciadorJogo.SR.aO(true);
        while (GerenciadorJogo.SR.H() < 1 || !((nucleo.Calendario)GerenciadorJogo.SR.R().get(342)).e() && !GerenciadorJogo.SR.bN) {
            n2 = GerenciadorJogo.SR.H();
            if (n3 != n2) {
                n3 = n2;
                System.out.println("ano: " + Integer.toString(n2));
            }
            GerenciadorJogo.SR.V();
        }
        System.out.println("done");
    }
}

