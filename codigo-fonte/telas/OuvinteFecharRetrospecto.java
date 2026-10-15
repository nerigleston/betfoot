package telas;

import telas.DialogoRetrospectoTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharRetrospecto
implements ActionListener {
    final /* synthetic */ DialogoRetrospectoTime Ly;

    OuvinteFecharRetrospecto(DialogoRetrospectoTime hw2) {
        this.Ly = hw2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoRetrospectoTime.a(this.Ly).dispose();
    }
}

