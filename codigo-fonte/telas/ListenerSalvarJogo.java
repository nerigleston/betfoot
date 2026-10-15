package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class ListenerSalvarJogo
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerSalvarJogo(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Iz.ru();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

