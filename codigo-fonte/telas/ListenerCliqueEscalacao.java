package telas;

import nucleo.Plataforma;
import telas.TelaEscalacao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class ListenerCliqueEscalacao
extends MouseAdapter {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerCliqueEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (Plataforma.isCliqueSecundario(mouseEvent)) {
            TelaEscalacao.a(this.Bq, mouseEvent);
        }
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            TelaEscalacao.b(this.Bq, mouseEvent);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            TelaEscalacao.c(this.Bq, mouseEvent);
        }
    }
}

