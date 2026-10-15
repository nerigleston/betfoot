package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbrirRankingTecnicos2
extends MouseAdapter {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirRankingTecnicos2(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaGerenciamentoClube.f(this.MV);
    }
}

