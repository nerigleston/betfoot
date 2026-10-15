package telas;

import telas.DialogoDemissaoTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoDemissao
implements ActionListener {
    final /* synthetic */ DialogoDemissaoTecnico Ft;

    OuvinteFecharDialogoDemissao(DialogoDemissaoTecnico dm2) {
        this.Ft = dm2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoDemissaoTecnico.a(this.Ft).dispose();
    }
}

