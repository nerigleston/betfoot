package testes;

import nucleo.UtilitariosTexto;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTesteAbrirEditor
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    OuvinteTesteAbrirEditor(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UtilitariosTexto.cV();
        UtilitariosTexto.cW();
        JanelaMenuTeste.b(this.Xb).setVisible(false);
    }
}

