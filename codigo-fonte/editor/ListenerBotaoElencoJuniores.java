package editor;

import editor.ModeloTabelaJogadores;
import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

class ListenerBotaoElencoJuniores
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerBotaoElencoJuniores(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.c(this.Vh).setIcon(new ImageIcon(this.getClass().getResource("/aicons/greencheck.png")));
        JanelaEditorBetfoot.b(this.Vh).setIcon(null);
        JanelaEditorBetfoot.d(this.Vh).setText("");
        if (JanelaEditorBetfoot.e(this.Vh)) {
            JanelaEditorBetfoot.a(this.Vh, false);
            ModeloTabelaJogadores ap2 = new ModeloTabelaJogadores();
            nucleo.UtilitariosTexto.da().wJ().setModel(ap2);
            nucleo.UtilitariosTexto.da().wH();
            JanelaEditorBetfoot.a(this.Vh, null);
            if (JanelaEditorBetfoot.f(this.Vh).getJuniores().size() > 0) {
                nucleo.UtilitariosTexto.da().wJ().setRowSelectionInterval(0, 0);
            }
            this.Vh.wq();
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        }
    }
}

