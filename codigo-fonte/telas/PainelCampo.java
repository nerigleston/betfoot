package telas;

import telas.ListenerOcultarSubPainelCampo;
import telas.ListenerMostrarSubPainelCampo;
import telas.ListenerArrastePainelCampo;
import telas.OuvinteArrastePainelCampo;
import components.PainelFundoAlpha;
import components.PainelFundoAlphaNivel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelCampo
extends JPanel {
    private int JX = 1;
    int As;
    int At;
    int Au;
    int Av;
    private JButton vb;
    private JButton vc;
    private JPanel xb;
    private JPanel JY;

    public PainelCampo() {
        this.mJ();
        this.vb.addActionListener(new ListenerOcultarSubPainelCampo(this));
        this.vc.addActionListener(new ListenerMostrarSubPainelCampo(this));
        this.JY.setVisible(false);
        this.mH();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/campo.png"));
        Image image = imageIcon.getImage();
        super.paintComponent(graphics);
        graphics.drawImage(image, 0, 0, null);
    }

    public void af(boolean bl) {
        this.JY.setVisible(bl);
    }

    public void mH() {
        this.xb.addMouseListener(new ListenerArrastePainelCampo(this));
        this.xb.addMouseMotionListener(new OuvinteArrastePainelCampo(this));
    }

    private void e(MouseEvent mouseEvent) {
        this.As = mouseEvent.getX();
        this.At = mouseEvent.getY();
        this.Au = this.As;
        this.Av = this.At;
        this.JY.setVisible(true);
    }

    private void f(MouseEvent mouseEvent) {
        this.Au = mouseEvent.getX();
        this.Av = mouseEvent.getY();
    }

    private void g(MouseEvent mouseEvent) {
        this.As = mouseEvent.getX();
        this.At = mouseEvent.getY();
        this.JY.setVisible(false);
        this.rM();
    }

    public void rM() {
        this.xb.setVisible(false);
        this.xb = new PainelFundoAlphaNivel(3);
        this.xb.setVisible(true);
    }

    private void mJ() {
        this.xb = new PainelFundoAlphaNivel(2);
        this.JY = new PainelFundoAlpha();
        this.vc = new JButton();
        this.vb = new JButton();
        this.JY.setOpaque(false);
        this.xb.setOpaque(false);
        GroupLayout groupLayout = new GroupLayout(this.JY);
        this.JY.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 512, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 662, Short.MAX_VALUE));
        this.xb.setBackground(new Color(0, 153, 153));
        GroupLayout groupLayout2 = new GroupLayout(this.xb);
        this.xb.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 512, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 662, Short.MAX_VALUE));
        this.vc.setText("jButton2");
        this.vb.setText("jButton1");
        GroupLayout groupLayout3 = new GroupLayout(this);
        this.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.xb, -1, -1, Short.MAX_VALUE).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGap(147, 147, 147).addComponent(this.vb).addGap(72, 72, 72).addComponent(this.vc).addContainerGap(147, Short.MAX_VALUE))).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.JY, -1, -1, Short.MAX_VALUE)));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.xb, -1, -1, Short.MAX_VALUE).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGap(319, 319, 319).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.vc).addComponent(this.vb)).addContainerGap(320, Short.MAX_VALUE))).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.JY, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE)));
    }

    static /* synthetic */ JPanel a(PainelCampo gl_02) {
        return gl_02.xb;
    }

    static /* synthetic */ void a(PainelCampo gl_02, MouseEvent mouseEvent) {
        gl_02.f(mouseEvent);
    }

    static /* synthetic */ void b(PainelCampo gl_02, MouseEvent mouseEvent) {
        gl_02.g(mouseEvent);
    }

    static /* synthetic */ void c(PainelCampo gl_02, MouseEvent mouseEvent) {
        gl_02.e(mouseEvent);
    }
}

