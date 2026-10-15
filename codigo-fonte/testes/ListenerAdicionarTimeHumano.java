package testes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAdicionarTimeHumano
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerAdicionarTimeHumano(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ModeloTime ah2 = (ModeloTime)((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(0)).eb().get(0)).yi().yK().get(0);
        ah2.k(true);
        ah2.ka().k(true);
        GerenciadorJogo.SR.M().add(ah2.ka());
        GerenciadorJogo.SR.aN().add(ah2);
        JanelaMenuTeste.a(this.Xb, ah2);
    }
}

