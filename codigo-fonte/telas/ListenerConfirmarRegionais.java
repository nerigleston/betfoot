package telas;

import telas.DialogoEscolhaRegionais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarRegionais
implements ActionListener {
    final /* synthetic */ DialogoEscolhaRegionais JN;

    ListenerConfirmarRegionais(DialogoEscolhaRegionais fZ2) {
        this.JN = fZ2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.JN.nH();
    }
}

