package telas;

import telas.PainelNumeracaoElenco;
import nucleo.ModeloJogador;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class OuvinteSelecaoJogadorElenco
implements TreeSelectionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteSelecaoJogadorElenco(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)PainelNumeracaoElenco.f(this.BW).getLastSelectedPathComponent();
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        if (defaultMutableTreeNode.isLeaf() && object instanceof ModeloJogador) {
            ModeloJogador f2 = (ModeloJogador)object;
            PainelNumeracaoElenco.a(this.BW, f2);
        }
    }
}

