package components;

import a.hk_0;
import best.I;
import components.W;
import components.a;
import components.b_0;
import components.u_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class v_0
extends JPanel {
    hk_0 QS = null;
    I zz = null;
    private MouseAdapter QT;
    private JLabel Lm;
    private JLabel zO;
    private JLabel zP;
    private JLabel QU;

    public v_0(u_0 u_02, hk_0 hk_02) {
        this.QS = hk_02;
        this.zz = u_02.tR();
        if (u_02.tR() != null) {
            this.mJ();
            this.mH();
            this.b(u_02);
        } else {
            this.ui();
            this.QU.setText(u_02.sT());
        }
    }

    private void mH() {
        this.QT = new W(this);
        this.zO.addMouseListener(this.QT);
        this.zP.addMouseListener(this.QT);
        this.Lm.addMouseListener(this.QT);
    }

    private void us() {
        this.QS.a(this, this.zz);
    }

    public void e(Color color) {
        this.setBackground(color);
    }

    private void b(u_0 u_02) {
        this.zO.setText(u_02.tR().hc().getNome());
        this.zO.setIcon(u_02.tR().hc().kU());
        this.zP.setText(u_02.tR().hd().getNome());
        this.zP.setIcon(u_02.tR().hd().kU());
        this.Lm.setText(String.valueOf(u_02.tR().hu()) + " x " + u_02.tR().hw() + " ");
    }

    private void mJ() {
        this.zO = new JLabel();
        this.Lm = new JLabel();
        this.zP = new JLabel();
        this.setBackground(new Color(228, 227, 227));
        this.setPreferredSize(new Dimension(295, 25));
        this.setLayout(new b_0());
        this.zO.setFont(new Font("Arial", 0, 12));
        this.zO.setHorizontalAlignment(4);
        this.zO.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.zO.setText("");
        this.zO.setHorizontalTextPosition(2);
        this.add((Component)this.zO, new a(0, 0, 128, 25));
        this.Lm.setBackground(new Color(0, 0, 0));
        this.Lm.setFont(new Font("Arial", 0, 12));
        this.Lm.setHorizontalAlignment(0);
        this.Lm.setText("0 x 0");
        this.add((Component)this.Lm, new a(129, 0, 40, 25));
        this.zP.setFont(new Font("Arial", 0, 12));
        this.zP.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.zP.setText("");
        this.add((Component)this.zP, new a(169, 0, 128, 25));
    }

    private void ui() {
        this.QU = new JLabel();
        this.setBackground(new Color(0, 102, 153));
        this.setPreferredSize(new Dimension(295, 25));
        this.setLayout(new b_0());
        this.QU.setFont(new Font("Arial", 1, 12));
        this.QU.setForeground(new Color(255, 255, 255));
        this.QU.setHorizontalAlignment(0);
        this.QU.setText("");
        this.add((Component)this.QU, new a(-3, 0, 300, 25));
    }

    public I tR() {
        return this.zz;
    }

    static /* synthetic */ void a(v_0 v_02) {
        v_02.us();
    }
}

