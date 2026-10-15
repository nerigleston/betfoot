package telas;

import telas.PainelPrincipalClube;
import nucleo.GerenciadorTelas;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerAtalhoOpcoes
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAtalhoOpcoes(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorTelas.a(PainelPrincipalClube.c(this.Iz));
    }
}

