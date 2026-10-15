package telas;

import telas.DialogoConfigCompeticoesInternacionais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteConfirmarCompeticoesInternacionais
implements ActionListener {
    final /* synthetic */ DialogoConfigCompeticoesInternacionais FF;

    OuvinteConfirmarCompeticoesInternacionais(DialogoConfigCompeticoesInternacionais do_) {
        this.FF = do_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.FF.nH();
    }
}

