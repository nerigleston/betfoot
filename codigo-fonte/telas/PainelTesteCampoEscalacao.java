package telas;

import telas.ListenerDesativarOpcao;
import telas.ListenerAtivarOpcao;
import telas.ListenerPressionarSoltarPainel;
import telas.ListenerArrastoPainel;
import components.PainelCampoEscalacao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelTesteCampoEscalacao
extends JPanel {
    int As;
    int At;
    int Au;
    int Av;
    private JButton vb;
    private JButton vc;
    private JPanel Aw;

    public PainelTesteCampoEscalacao() {
        this.mJ();
        this.vb.addActionListener(new ListenerDesativarOpcao(this));
        this.vc.addActionListener(new ListenerAtivarOpcao(this));
    }

    public void nY() {
        this.Aw.addMouseListener(new ListenerPressionarSoltarPainel(this));
        this.Aw.addMouseMotionListener(new ListenerArrastoPainel(this));
    }

    private void a(MouseEvent mouseEvent) {
        this.As = mouseEvent.getX();
        this.At = mouseEvent.getY();
        this.Au = this.As;
        this.Av = this.At;
    }

    private void b(MouseEvent mouseEvent) {
        this.Au = mouseEvent.getX();
        this.Av = mouseEvent.getY();
    }

    private void c(MouseEvent mouseEvent) {
        this.As = mouseEvent.getX();
        this.At = mouseEvent.getY();
    }

    private void mJ() {
        this.Aw = new PainelCampoEscalacao();
        this.vb = new JButton();
        this.vc = new JButton();
        this.setBackground(new Color(51, 102, 0));
        this.vb.setText("jButton1");
        this.vc.setText("jButton2");
        this.Aw.setPreferredSize(new Dimension(512, 662));
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.Aw, -2, -1, -2).addGap(74, 74, 74).addComponent(this.vb).addGap(83, 83, 83).addComponent(this.vc).addGap(0, 85, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.vb).addComponent(this.vc)).addComponent(this.Aw, -2, -1, -2)).addGap(0, 38, Short.MAX_VALUE)));
    }

    static /* synthetic */ JPanel a(PainelTesteCampoEscalacao bu2) {
        return bu2.Aw;
    }

    static /* synthetic */ void a(PainelTesteCampoEscalacao bu2, MouseEvent mouseEvent) {
        bu2.b(mouseEvent);
    }

    static /* synthetic */ void b(PainelTesteCampoEscalacao bu2, MouseEvent mouseEvent) {
        bu2.c(mouseEvent);
    }

    static /* synthetic */ void c(PainelTesteCampoEscalacao bu2, MouseEvent mouseEvent) {
        bu2.a(mouseEvent);
    }
}

