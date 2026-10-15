package components;

import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import components.ListenerMouseCampoEscalacao;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PainelCampoEscalacao
extends JPanel {
    int As;
    int At;
    int Au;
    int Av;
    private JLabel ug;
    private JLabel uh;
    private JLabel a_;
    private JLayeredPane MH;

    public PainelCampoEscalacao() {
        this.mJ();
    }

    public void X(boolean bl) {
        this.uh.setVisible(bl);
    }

    private void mJ() {
        this.MH = new JLayeredPane();
        this.a_ = new JLabel();
        this.uh = new JLabel();
        this.ug = new JLabel();
        this.setPreferredSize(new Dimension(512, 662));
        this.MH.addMouseListener(new ListenerMouseCampoEscalacao(this));
        this.MH.setLayout(new LayoutPosicaoAbsoluta());
        this.a_.setIcon(new ImageIcon(this.getClass().getResource("/aicons/alpha2.png")));
        this.a_.setToolTipText("");
        this.MH.add((Component)this.a_, new RestricaoPosicaoLayout(0, 0, 510, 660));
        this.MH.setLayer(this.a_, JLayeredPane.DRAG_LAYER);
        this.uh.setIcon(new ImageIcon(this.getClass().getResource("/aicons/alpha.png")));
        this.MH.add((Component)this.uh, new RestricaoPosicaoLayout(0, 0, 510, 660));
        this.MH.setLayer(this.uh, JLayeredPane.POPUP_LAYER);
        this.ug.setIcon(new ImageIcon(this.getClass().getResource("/aicons/campo.png")));
        this.MH.add((Component)this.ug, new RestricaoPosicaoLayout(0, 0, -1, -1));
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.MH));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.MH));
    }

    private void h(MouseEvent mouseEvent) {
    }

    static /* synthetic */ void a(PainelCampoEscalacao y_02, MouseEvent mouseEvent) {
        y_02.h(mouseEvent);
    }
}

