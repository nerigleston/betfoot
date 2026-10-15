package telas;

import telas.PainelResumoPartida;
import nucleo.ModeloTime;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class OuvinteSelecaoTimeArvorePartida
implements TreeSelectionListener {
    final /* synthetic */ PainelResumoPartida Ma;

    OuvinteSelecaoTimeArvorePartida(PainelResumoPartida hF2) {
        this.Ma = hF2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)PainelResumoPartida.e(this.Ma).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloTime) {
            ModeloTime ah2 = (ModeloTime)object;
            this.Ma.F(ah2);
        }
    }
}

