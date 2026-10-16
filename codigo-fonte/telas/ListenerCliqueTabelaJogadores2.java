package telas;

import nucleo.Plataforma;
import telas.TelaGerenciamentoClube;
import nucleo.GerenciadorTelas;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

class ListenerCliqueTabelaJogadores2
extends MouseAdapter {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerCliqueTabelaJogadores2(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = TelaGerenciamentoClube.k(this.MV).rowAtPoint(mouseEvent.getPoint());
        int n3 = TelaGerenciamentoClube.k(this.MV).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 >= 2) {
            GerenciadorTelas.a(TelaGerenciamentoClube.l(this.MV), null);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (Plataforma.isCliqueSecundario(mouseEvent)) {
            Point point = mouseEvent.getPoint();
            int n2 = TelaGerenciamentoClube.k(this.MV).rowAtPoint(point);
            ListSelectionModel listSelectionModel = TelaGerenciamentoClube.k(this.MV).getSelectionModel();
            listSelectionModel.setSelectionInterval(n2, n2);
        }
    }
}

