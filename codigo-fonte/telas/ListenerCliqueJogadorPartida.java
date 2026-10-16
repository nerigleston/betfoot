package telas;

import nucleo.Plataforma;
import telas.PainelTaticaPartida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class ListenerCliqueJogadorPartida
extends MouseAdapter {
    final /* synthetic */ PainelTaticaPartida DI;

    ListenerCliqueJogadorPartida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (Plataforma.isCliqueSecundario(mouseEvent)) {
            PainelTaticaPartida.a(this.DI, mouseEvent);
        }
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            PainelTaticaPartida.b(this.DI, mouseEvent);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            PainelTaticaPartida.a(this.DI, mouseEvent, 0);
        }
    }
}

