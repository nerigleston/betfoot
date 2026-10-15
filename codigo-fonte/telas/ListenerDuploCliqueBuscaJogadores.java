package telas;

import telas.PainelBuscaJogadores;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerDuploCliqueBuscaJogadores
extends MouseAdapter {
    final /* synthetic */ PainelBuscaJogadores Kg;

    ListenerDuploCliqueBuscaJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = PainelBuscaJogadores.c(this.Kg).rowAtPoint(mouseEvent.getPoint());
        int n3 = PainelBuscaJogadores.c(this.Kg).columnAtPoint(mouseEvent.getPoint());
        if (mouseEvent.getClickCount() == 2) {
            this.Kg.rQ();
        }
    }
}

