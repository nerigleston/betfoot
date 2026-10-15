package telas;

import telas.DialogoSalvarJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class ListenerConfirmarSalvarJogo
implements ActionListener {
    final /* synthetic */ DialogoSalvarJogo IB;

    ListenerConfirmarSalvarJogo(DialogoSalvarJogo fw_02) {
        this.IB = fw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            DialogoSalvarJogo.a(this.IB);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

