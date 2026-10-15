package testes;

import nucleo.GerenciadorTelas;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTesteAbrirRegistro
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    OuvinteTesteAbrirRegistro(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new GerenciadorTelas(false);
        GerenciadorTelas.aY(7);
    }
}

