package telas;

import telas.DialogoOpcoes;
import tabelas.ModeloTabelaPaises;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerCliqueTabelaLigas
extends MouseAdapter {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerCliqueTabelaLigas(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = DialogoOpcoes.e(this.JH).rowAtPoint(mouseEvent.getPoint());
        int n3 = DialogoOpcoes.e(this.JH).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 == 1 && n3 == 0) {
            int n5 = DialogoOpcoes.e(this.JH).convertRowIndexToModel(n2);
            ((ModeloTabelaPaises)DialogoOpcoes.e(this.JH).getModel()).ex(n5);
            DialogoOpcoes.e(this.JH).addNotify();
        }
    }
}

