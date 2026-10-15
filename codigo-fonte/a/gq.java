package a;

import static c.a.vL;

import a.gr;
import a.gs;
import a.gt;
import a.gu;
import a.gv;
import best.n_0;
import best.p_0;
import best.s_0;
import c.a;
import components.b_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gq
extends JFrame {
    private JLabel uh;
    private JPanel vd;
    private JLabel afs;
    private JLabel zM;
    private JLabel aft;
    private JLabel afu;
    private JLabel afv;
    private JLabel afw;
    private JLabel afx;

    public gq() {
        try {
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/icon16.png"));
            this.setIconImage(imageIcon.getImage());
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.setTitle("Betfoot");
        this.setUndecorated(true);
        this.mJ();
        this.afu.setIcon(new ImageIcon(this.getClass().getResource("/aiconsj/iconreg.png")));
        this.afu.setCursor(new Cursor(12));
        this.aft.setCursor(new Cursor(12));
        this.afs.setCursor(new Cursor(12));
        this.afx.setCursor(new Cursor(12));
        this.afw.setCursor(new Cursor(12));
        this.mH();
        if (vL()) {
            this.rO();
        }
        this.zM.setIcon(new ImageIcon(this.getClass().getResource("/aiconsj/tela_inicial.jpg")));
    }

    public void mH() {
        this.aft.addMouseListener(new gr(this));
        this.afs.addMouseListener(new gs(this));
        this.afu.addMouseListener(new gt(this));
        this.afx.addMouseListener(new gu(this));
        this.afw.addMouseListener(new gv(this));
    }

    private void pW() {
        n_0.b(this);
        n_0.g("Metal");
        s_0.cX();
    }

    private void rN() {
        n_0.b(this);
        n_0.g("Metal");
        n_0.cV();
        n_0.cW();
        this.setVisible(false);
    }

    private void rO() {
        this.afu.setVisible(false);
        this.uh.setVisible(false);
    }

    private void mi() {
        new a();
        p_0.dd();
        n_0.g("Metal");
        if (n_0.db() == null) {
            new s_0(true);
        } else {
            s_0.aY(0);
        }
        this.dispose();
    }

    private void rP() {
        if (n_0.db() == null) {
            new s_0(false);
            s_0.aY(7);
        } else {
            s_0.aY(7);
        }
        this.dispose();
    }

    private void mJ() {
        this.vd = new JPanel();
        this.afu = new JLabel();
        this.afv = new JLabel();
        this.afx = new JLabel();
        this.aft = new JLabel();
        this.afs = new JLabel();
        this.uh = new JLabel();
        this.afw = new JLabel();
        this.zM = new JLabel();
        this.setDefaultCloseOperation(3);
        this.getContentPane().setLayout(new b_0());
        this.vd.setLayout(new b_0());
        this.afu.setFont(new Font("Tahoma", 0, 19));
        this.afu.setForeground(new Color(255, 255, 255));
        this.afu.setText("REGISTRAR JOGO");
        this.vd.add((Component)this.afu, new components.a(10, 210, 230, 80));
        this.afv.setFont(new Font("Tahoma", 1, 12));
        this.afv.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afv, new components.a(60, 200, 80, 60));
        this.afx.setFont(new Font("Tahoma", 1, 12));
        this.afx.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afx, new components.a(210, 110, 140, 90));
        this.aft.setFont(new Font("Tahoma", 1, 12));
        this.aft.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.aft, new components.a(30, 110, 140, 90));
        this.afs.setFont(new Font("Tahoma", 1, 12));
        this.afs.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afs, new components.a(370, 110, 140, 90));
        this.uh.setFont(new Font("Tahoma", 0, 12));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setHorizontalAlignment(4);
        this.uh.setText("vers\u00e3o n\u00e3o registrada");
        this.vd.add((Component)this.uh, new components.a(310, 30, 150, 20));
        this.afw.setFont(new Font("Tahoma", 1, 12));
        this.afw.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afw, new components.a(420, 260, 80, 30));
        this.zM.setMaximumSize(new Dimension(306, 413));
        this.zM.setMinimumSize(new Dimension(306, 413));
        this.vd.add((Component)this.zM, new components.a(0, 0, 532, 300));
        this.getContentPane().add((Component)this.vd, new components.a(0, 0, 530, 300));
        this.pack();
    }

    static /* synthetic */ JLabel a(gq gq2) {
        return gq2.aft;
    }

    static /* synthetic */ void b(gq gq2) {
        gq2.mi();
    }

    static /* synthetic */ JLabel c(gq gq2) {
        return gq2.afs;
    }

    static /* synthetic */ void d(gq gq2) {
        gq2.rN();
    }

    static /* synthetic */ void e(gq gq2) {
        gq2.rP();
    }

    static /* synthetic */ JLabel f(gq gq2) {
        return gq2.afx;
    }

    static /* synthetic */ void g(gq gq2) {
        gq2.pW();
    }
}

