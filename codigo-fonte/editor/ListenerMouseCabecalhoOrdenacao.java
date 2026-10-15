package editor;

import editor.ModeloTabelaJogadores;
import editor.JanelaEditorBetfoot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerMouseCabecalhoOrdenacao
extends MouseAdapter {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMouseCabecalhoOrdenacao(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = JanelaEditorBetfoot.g(this.Vh).columnAtPoint(mouseEvent.getPoint());
        String string = JanelaEditorBetfoot.g(this.Vh).getColumnName(n2);
        if (n2 == 0) {
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).i(0, false);
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        } else if (n2 == 2) {
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).i(2, false);
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        } else if (n2 == 3) {
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).i(3, false);
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        } else if (n2 == 5) {
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).i(5, false);
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        }
    }
}

