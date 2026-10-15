package editor;

import nucleo.ModeloJogador;
import nucleo.ConstantesJogo;
import editor.JanelaEdicaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerComboPosicaoJogador
implements ActionListener {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    ListenerComboPosicaoJogador(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEdicaoJogador.d(this.Ut).removeAllItems();
        JanelaEdicaoJogador.e(this.Ut).removeAllItems();
        int[] nArray = ModeloJogador.at(JanelaEdicaoJogador.f(this.Ut).getSelectedIndex());
        JanelaEdicaoJogador.eH(JanelaEdicaoJogador.f(this.Ut).getSelectedIndex());
        if (JanelaEdicaoJogador.f(this.Ut).getSelectedIndex() == 0) {
            int n2 = 0;
            while (n2 <= 3) {
                JanelaEdicaoJogador.d(this.Ut).addItem(ConstantesJogo.qM[n2]);
                JanelaEdicaoJogador.e(this.Ut).addItem(ConstantesJogo.qM[n2]);
                ++n2;
            }
            JanelaEdicaoJogador.d(this.Ut).setSelectedIndex(nArray[0]);
            JanelaEdicaoJogador.e(this.Ut).setSelectedIndex(nArray[1]);
        } else {
            int n3 = 4;
            while (n3 < ConstantesJogo.qM.length) {
                JanelaEdicaoJogador.d(this.Ut).addItem(ConstantesJogo.qM[n3]);
                JanelaEdicaoJogador.e(this.Ut).addItem(ConstantesJogo.qM[n3]);
                ++n3;
            }
            JanelaEdicaoJogador.d(this.Ut).setSelectedIndex(nArray[0] - 4);
            JanelaEdicaoJogador.e(this.Ut).setSelectedIndex(nArray[1] - 4);
        }
    }
}

