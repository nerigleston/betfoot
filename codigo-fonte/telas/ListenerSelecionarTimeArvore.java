package telas;

import telas.TelaGerenciamentoClube;
import nucleo.ModeloTime;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class ListenerSelecionarTimeArvore
implements TreeSelectionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerSelecionarTimeArvore(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)TelaGerenciamentoClube.j(this.MV).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloTime) {
            ModeloTime ah2 = (ModeloTime)object;
            this.MV.F(ah2);
        }
    }
}

