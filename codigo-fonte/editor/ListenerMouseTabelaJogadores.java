package editor;

import editor.ModeloTabelaJogadores;
import editor.JanelaEditorBetfoot;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

class ListenerMouseTabelaJogadores
extends MouseAdapter {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMouseTabelaJogadores(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = JanelaEditorBetfoot.g(this.Vh).rowAtPoint(mouseEvent.getPoint());
        int n3 = JanelaEditorBetfoot.g(this.Vh).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 == 1 && n3 == 0) {
            int n5 = JanelaEditorBetfoot.e(this.Vh) ? JanelaEditorBetfoot.f(this.Vh).getNumeroTitulares() : JanelaEditorBetfoot.f(this.Vh).getNumeroTitularesJuniores();
            int n6 = JanelaEditorBetfoot.g(this.Vh).convertRowIndexToModel(n2);
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).Z(n6, n5);
            this.Vh.wo();
            JanelaEditorBetfoot.g(this.Vh).addNotify();
            if (JanelaEditorBetfoot.e(this.Vh)) {
                JanelaEditorBetfoot.m(this.Vh).setText(Integer.toString(JanelaEditorBetfoot.f(this.Vh).getNumeroTitulares()));
            } else {
                JanelaEditorBetfoot.m(this.Vh).setText(Integer.toString(JanelaEditorBetfoot.f(this.Vh).getNumeroTitularesJuniores()));
            }
        } else if (n4 >= 2) {
            this.Vh.wC();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            Point point = mouseEvent.getPoint();
            int n2 = JanelaEditorBetfoot.g(this.Vh).rowAtPoint(point);
            ListSelectionModel listSelectionModel = JanelaEditorBetfoot.g(this.Vh).getSelectionModel();
            listSelectionModel.setSelectionInterval(n2, n2);
        }
    }
}

