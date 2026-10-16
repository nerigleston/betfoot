package telas;


import telas.OuvinteAbrirJogoTelaInicial;
import telas.OuvinteAbrirEditorTelaInicial;
import telas.OuvinteCarregarJogoTelaInicial;
import telas.OuvinteSairTelaInicial;
import nucleo.UtilitariosTexto;
import nucleo.IniciadorCarreira;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import components.LayoutPosicaoAbsoluta;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial
extends JFrame {
    private JPanel vd;
    private JLabel afs;
    private JLabel zM;
    private JLabel aft;
    private JLabel afv;
    private JLabel afw;
    private JLabel afx;

    public TelaInicial() {
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
        this.aft.setCursor(new Cursor(12));
        this.afs.setCursor(new Cursor(12));
        this.afx.setCursor(new Cursor(12));
        this.afw.setCursor(new Cursor(12));
        this.mH();
        this.zM.setIcon(new ImageIcon(this.getClass().getResource("/aiconsj/tela_inicial.jpg")));
    }

    public void mH() {
        this.aft.addMouseListener(new OuvinteAbrirJogoTelaInicial(this));
        this.afs.addMouseListener(new OuvinteAbrirEditorTelaInicial(this));
        this.afx.addMouseListener(new OuvinteCarregarJogoTelaInicial(this));
        this.afw.addMouseListener(new OuvinteSairTelaInicial(this));
    }

    private void pW() {
        UtilitariosTexto.b(this);
        UtilitariosTexto.g("Metal");
        GerenciadorTelas.cX();
    }

    private void rN() {
        UtilitariosTexto.b(this);
        UtilitariosTexto.g("Metal");
        UtilitariosTexto.cV();
        UtilitariosTexto.cW();
        this.setVisible(false);
    }

    private void mi() {
        new GerenciadorJogo();
        IniciadorCarreira.dd();
        UtilitariosTexto.g("Metal");
        if (UtilitariosTexto.db() == null) {
            new GerenciadorTelas(true);
        } else {
            GerenciadorTelas.aY(0);
        }
        this.dispose();
    }

    private void mJ() {
        this.vd = new JPanel();
        this.afv = new JLabel();
        this.afx = new JLabel();
        this.aft = new JLabel();
        this.afs = new JLabel();
        this.afw = new JLabel();
        this.zM = new JLabel();
        this.setDefaultCloseOperation(3);
        this.getContentPane().setLayout(new LayoutPosicaoAbsoluta());
        this.vd.setLayout(new LayoutPosicaoAbsoluta());
        this.afv.setFont(new Font("Tahoma", 1, 12));
        this.afv.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afv, new components.RestricaoPosicaoLayout(60, 200, 80, 60));
        this.afx.setFont(new Font("Tahoma", 1, 12));
        this.afx.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afx, new components.RestricaoPosicaoLayout(210, 110, 140, 90));
        this.aft.setFont(new Font("Tahoma", 1, 12));
        this.aft.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.aft, new components.RestricaoPosicaoLayout(30, 110, 140, 90));
        this.afs.setFont(new Font("Tahoma", 1, 12));
        this.afs.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afs, new components.RestricaoPosicaoLayout(370, 110, 140, 90));
        this.afw.setFont(new Font("Tahoma", 1, 12));
        this.afw.setForeground(new Color(255, 255, 255));
        this.vd.add((Component)this.afw, new components.RestricaoPosicaoLayout(420, 260, 80, 30));
        this.zM.setMaximumSize(new Dimension(306, 413));
        this.zM.setMinimumSize(new Dimension(306, 413));
        this.vd.add((Component)this.zM, new components.RestricaoPosicaoLayout(0, 0, 532, 300));
        this.getContentPane().add((Component)this.vd, new components.RestricaoPosicaoLayout(0, 0, 530, 300));
        this.pack();
    }

    static /* synthetic */ JLabel a(TelaInicial gq2) {
        return gq2.aft;
    }

    static /* synthetic */ void b(TelaInicial gq2) {
        gq2.mi();
    }

    static /* synthetic */ JLabel c(TelaInicial gq2) {
        return gq2.afs;
    }

    static /* synthetic */ void d(TelaInicial gq2) {
        gq2.rN();
    }

    static /* synthetic */ JLabel f(TelaInicial gq2) {
        return gq2.afx;
    }

    static /* synthetic */ void g(TelaInicial gq2) {
        gq2.pW();
    }
}

