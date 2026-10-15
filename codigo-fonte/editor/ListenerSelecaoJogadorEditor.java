package editor;

import editor.ModeloTabelaJogadores;
import editor.JanelaEditorBetfoot;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoJogadorEditor
implements ListSelectionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerSelecaoJogadorEditor(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && JanelaEditorBetfoot.g(this.Vh).getSelectedRow() >= 0) {
            int n2 = JanelaEditorBetfoot.g(this.Vh).convertRowIndexToModel(JanelaEditorBetfoot.g(this.Vh).getSelectedRow());
            ((ModeloTabelaJogadores)JanelaEditorBetfoot.g(this.Vh).getModel()).et(n2);
        }
    }
}

