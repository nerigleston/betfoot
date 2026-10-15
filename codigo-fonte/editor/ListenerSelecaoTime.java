package editor;

import editor.ModeloTabelaTimes;
import editor.JanelaEditorBetfoot;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoTime
implements ListSelectionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerSelecaoTime(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && this.Vh.Vg.getSelectedRow() >= 0) {
            JanelaEditorBetfoot.a(this.Vh, true);
            int n2 = this.Vh.Vg.convertRowIndexToModel(this.Vh.Vg.getSelectedRow());
            ((ModeloTabelaTimes)this.Vh.Vg.getModel()).et(n2);
            JanelaEditorBetfoot.g(this.Vh).addNotify();
        }
    }
}

