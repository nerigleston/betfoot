package telas;

import telas.TelaAdicionarTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteConfirmarAdicionarTecnico
implements ActionListener {
    final /* synthetic */ TelaAdicionarTecnico uj;

    OuvinteConfirmarAdicionarTecnico(TelaAdicionarTecnico a2) {
        this.uj = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaAdicionarTecnico.b(this.uj);
    }
}

