package telas;

import telas.TelaCriarTorneioAmistoso;
import nucleo.ModeloTime;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class ListenerSelecionarTimeArvoreTorneio
implements TreeSelectionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerSelecionarTimeArvoreTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)TelaCriarTorneioAmistoso.g(this.afI).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloTime) {
            ModeloTime ah2 = (ModeloTime)object;
            TelaCriarTorneioAmistoso.a(this.afI, ah2);
        }
    }
}

