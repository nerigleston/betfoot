package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;

class es
extends AbstractAction {
    final /* synthetic */ eg_0 Iz;

    es(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Iz.ru();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

