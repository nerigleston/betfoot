package telas;

import telas.ListenerSalvarCoresTime;
import telas.ListenerCancelarCoresTime;
import telas.ListenerCliqueSeletorCorTime;
import telas.ListenerCliqueSeletorCorTexto;
import nucleo.ModeloTime;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelCoresTime
extends JPanel {
    private JDialog ub;
    private ModeloTime zu;
    private JButton ud;
    private JButton zn;
    private JLabel ug;
    private JLabel uh;
    private JLabel vx;
    private JLabel zv;
    private JLabel zw;
    private JLabel zx;

    public PainelCoresTime(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.zu = ah2;
        this.mJ();
        this.zx.setText(ah2.getNome());
        this.zw.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.zv.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.zw.setBackground(ah2.kC());
        this.zv.setBackground(ah2.kB());
        this.nI();
        this.mH();
    }

    private void nI() {
        this.zx.setForeground(this.zw.getBackground());
        this.zx.setBackground(this.zv.getBackground());
    }

    private void a(Object object) {
        Color color;
        JLabel jLabel = (JLabel)object;
        Color color2 = jLabel.getBackground();
        Color color3 = this.getBackground();
        if (!color3.equals(color = JColorChooser.showDialog(jLabel, "", color2))) {
            jLabel.setBackground(color);
            this.nI();
        }
    }

    public void mH() {
        this.zn.addActionListener(new ListenerSalvarCoresTime(this));
        this.ud.addActionListener(new ListenerCancelarCoresTime(this));
        this.zw.addMouseListener(new ListenerCliqueSeletorCorTime(this));
        this.zv.addMouseListener(new ListenerCliqueSeletorCorTexto(this));
    }

    private void nH() {
        this.zu.d(this.zw.getBackground());
        this.zu.c(this.zv.getBackground());
    }

    private void mJ() {
        this.zn = new JButton();
        this.ug = new JLabel();
        this.zw = new JLabel();
        this.zv = new JLabel();
        this.uh = new JLabel();
        this.ud = new JButton();
        this.vx = new JLabel();
        this.zx = new JLabel();
        this.setBackground(new Color(241, 241, 227));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.zn.setText("salvar");
        this.add((Component)this.zn, new RestricaoPosicaoLayout(30, 250, 108, 30));
        this.ug.setFont(new Font("Tahoma", 0, 14));
        this.ug.setHorizontalAlignment(0);
        this.ug.setText("Cores do Time");
        this.add((Component)this.ug, new RestricaoPosicaoLayout(30, 20, 250, -1));
        this.zw.setBackground(new Color(255, 0, 102));
        this.zw.setMinimumSize(new Dimension(20, 20));
        this.zw.setCursor(new Cursor(12));
        this.zw.setOpaque(true);
        this.zw.setPreferredSize(new Dimension(20, 20));
        this.add((Component)this.zw, new RestricaoPosicaoLayout(70, 80, 69, 61));
        this.zv.setBackground(new Color(255, 0, 102));
        this.zv.setMinimumSize(new Dimension(20, 20));
        this.zv.setCursor(new Cursor(12));
        this.zv.setOpaque(true);
        this.zv.setPreferredSize(new Dimension(20, 20));
        this.add((Component)this.zv, new RestricaoPosicaoLayout(170, 80, 69, 60));
        this.uh.setText("Cor de Fundo:");
        this.add((Component)this.uh, new RestricaoPosicaoLayout(170, 60, -1, -1));
        this.ud.setText("cancelar");
        this.add((Component)this.ud, new RestricaoPosicaoLayout(160, 250, 108, 30));
        this.vx.setText("Cor de Texto:");
        this.add((Component)this.vx, new RestricaoPosicaoLayout(70, 60, -1, -1));
        this.zx.setBackground(new Color(255, 0, 102));
        this.zx.setFont(new Font("Arial", 0, 12));
        this.zx.setHorizontalAlignment(0);
        this.zx.setText("");
        this.zx.setMinimumSize(new Dimension(20, 20));
        this.zx.setOpaque(true);
        this.zx.setPreferredSize(new Dimension(20, 20));
        this.add((Component)this.zx, new RestricaoPosicaoLayout(30, 160, 240, 60));
    }

    static /* synthetic */ void a(PainelCoresTime bb2) {
        bb2.nH();
    }

    static /* synthetic */ JDialog b(PainelCoresTime bb2) {
        return bb2.ub;
    }

    static /* synthetic */ void a(PainelCoresTime bb2, Object object) {
        bb2.a(object);
    }
}

