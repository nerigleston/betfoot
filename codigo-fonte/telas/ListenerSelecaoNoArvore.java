package telas;

import telas.DialogoMarcarAmistoso2;
import nucleo.ModeloTime;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class ListenerSelecaoNoArvore
implements TreeSelectionListener {
    final /* synthetic */ DialogoMarcarAmistoso2 uy;

    ListenerSelecaoNoArvore(DialogoMarcarAmistoso2 h3) {
        this.uy = h3;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)DialogoMarcarAmistoso2.c(this.uy).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloTime) {
            ModeloTime ah2 = (ModeloTime)object;
            this.uy.F(ah2);
        }
    }
}

