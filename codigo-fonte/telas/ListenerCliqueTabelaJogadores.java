package telas;

import nucleo.Plataforma;
import telas.PainelPrincipalClube;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

class ListenerCliqueTabelaJogadores
extends MouseAdapter {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerCliqueTabelaJogadores(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = PainelPrincipalClube.c(this.Iz).rowAtPoint(mouseEvent.getPoint());
        int n3 = PainelPrincipalClube.c(this.Iz).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 >= 2) {
            this.Iz.qC();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (Plataforma.isCliqueSecundario(mouseEvent)) {
            Point point = mouseEvent.getPoint();
            int n2 = PainelPrincipalClube.c(this.Iz).rowAtPoint(point);
            ListSelectionModel listSelectionModel = PainelPrincipalClube.c(this.Iz).getSelectionModel();
            listSelectionModel.setSelectionInterval(n2, n2);
        }
    }
}

