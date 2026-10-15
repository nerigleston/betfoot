package testes;

import editor.LeitorArquivoElencoXml;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirConversor
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerAbrirConversor(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        LeitorArquivoElencoXml.wj();
    }
}

