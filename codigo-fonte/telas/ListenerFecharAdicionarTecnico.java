package telas;

import telas.TelaAdicionarTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharAdicionarTecnico
implements ActionListener {
    final /* synthetic */ TelaAdicionarTecnico uj;

    ListenerFecharAdicionarTecnico(TelaAdicionarTecnico a2) {
        this.uj = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaAdicionarTecnico.a(this.uj).dispose();
    }
}

