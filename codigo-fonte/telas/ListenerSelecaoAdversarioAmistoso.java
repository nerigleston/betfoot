package telas;

import telas.DialogoMarcarAmistoso;
import nucleo.ModeloTime;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class ListenerSelecaoAdversarioAmistoso
implements TreeSelectionListener {
    final /* synthetic */ DialogoMarcarAmistoso ux;

    ListenerSelecaoAdversarioAmistoso(DialogoMarcarAmistoso d2) {
        this.ux = d2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)DialogoMarcarAmistoso.c(this.ux).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloTime) {
            ModeloTime ah2 = (ModeloTime)object;
            this.ux.F(ah2);
        }
    }
}

