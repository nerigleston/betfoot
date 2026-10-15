package editor;

import editor.ModeloTabelaTimes;
import editor.JanelaEditorTabela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoRemoverTime
implements ActionListener {
    final /* synthetic */ JanelaEditorTabela Vm;

    ListenerBotaoRemoverTime(JanelaEditorTabela x_02) {
        this.Vm = x_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n2 = this.Vm.table.getSelectedRow();
        ((ModeloTabelaTimes)this.Vm.table.getModel()).removeRow(n2);
        this.Vm.table.addNotify();
    }
}

