package telas;

import telas.TelaConfiguracoesIniciais;
import tabelas.ModeloTabelaSelecaoPais;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteCliqueTabelaLigas
extends MouseAdapter {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvinteCliqueTabelaLigas(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = TelaConfiguracoesIniciais.a(this.MA).rowAtPoint(mouseEvent.getPoint());
        int n3 = TelaConfiguracoesIniciais.a(this.MA).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 == 1 && n3 == 0) {
            int n5 = TelaConfiguracoesIniciais.a(this.MA).convertRowIndexToModel(n2);
            ((ModeloTabelaSelecaoPais)TelaConfiguracoesIniciais.a(this.MA).getModel()).ex(n5);
            TelaConfiguracoesIniciais.a(this.MA).addNotify();
        }
    }
}

