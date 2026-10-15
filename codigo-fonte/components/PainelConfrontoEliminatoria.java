package components;

import nucleo.EnumPaises;
import nucleo.ModeloTime;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import components.ModeloConfronto;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelConfrontoEliminatoria
extends JPanel {
    private JLabel Sp;
    private JLabel Sq;
    private JLabel Sr;
    private JLabel Ss;
    private JLabel St;
    private JLabel zR;
    private JLabel Su;

    public PainelConfrontoEliminatoria(ModeloConfronto d2, ArrayList arrayList) {
        ModeloTime ah2 = null;
        ah2 = arrayList.contains(d2.sP().hc()) ? d2.sP().hc() : d2.sP().hd();
        if (d2.sQ() != null) {
            this.mJ();
        } else {
            this.vx();
        }
        if (d2.sP() != null) {
            this.Sp.setText(d2.sP().hc().getNome());
            this.Sp.setIcon(d2.sP().hc().kU());
            this.Sq.setText(d2.sP().hd().getNome());
            this.Sq.setIcon(d2.sP().hd().kU());
            if (d2.b() == 4 || d2.b() == 6 || d2.b() == 12) {
                this.Sp.setToolTipText(EnumPaises.bl(d2.sP().hc().getPais()));
                this.Sq.setToolTipText(EnumPaises.bl(d2.sP().hd().getPais()));
            }
            if (d2.sP().e()) {
                this.St.setText(d2.sP().t(false));
            }
        }
        if (d2.sQ() != null) {
            this.Sr.setText(d2.sQ().hc().getNome());
            this.Sr.setIcon(d2.sQ().hc().kU());
            this.Ss.setText(d2.sQ().hd().getNome());
            this.Ss.setIcon(d2.sQ().hd().kU());
            if (d2.b() == 4 || d2.b() == 6 || d2.b() == 12) {
                this.Sr.setToolTipText(EnumPaises.bl(d2.sQ().hc().getPais()));
                this.Ss.setToolTipText(EnumPaises.bl(d2.sQ().hd().getPais()));
            }
            if (d2.sQ().e()) {
                this.zR.setText(d2.sQ().t(false));
            }
        }
        if (d2.sQ() == null && d2.sP().e()) {
            int[] nArray = d2.sP().hQ();
            if (nArray[0] >= 0 || nArray[1] >= 0) {
                this.Su.setText("P:" + d2.sP().u(false));
            }
            if (ah2 == d2.sP().hc()) {
                this.Sp.setFont(new Font("Arial", 1, 12));
            } else {
                this.Sq.setFont(new Font("Arial", 1, 12));
            }
        } else if (d2.sQ() != null && d2.sQ().e()) {
            int[] nArray = d2.sQ().hQ();
            if (nArray[0] >= 0 || nArray[1] >= 0) {
                this.Su.setText("P:" + d2.sQ().u(false));
            }
            if (ah2 == d2.sP().hc()) {
                this.Sp.setFont(new Font("Arial", 1, 12));
            } else {
                this.Sq.setFont(new Font("Arial", 1, 12));
            }
            if (ah2 == d2.sQ().hc()) {
                this.Sr.setFont(new Font("Arial", 1, 12));
            } else {
                this.Ss.setFont(new Font("Arial", 1, 12));
            }
        }
    }

    private void mJ() {
        this.Sq = new JLabel();
        this.Ss = new JLabel();
        this.Sp = new JLabel();
        this.Sr = new JLabel();
        this.zR = new JLabel();
        this.Su = new JLabel();
        this.St = new JLabel();
        this.setBackground(new Color(228, 227, 227));
        this.setPreferredSize(new Dimension(480, 25));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.Sq.setFont(new Font("Arial", 0, 12));
        this.Sq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Sq.setText("Jorge Wilstermann");
        this.add((Component)this.Sq, new RestricaoPosicaoLayout(260, 0, 170, 25));
        this.Ss.setFont(new Font("Arial", 0, 12));
        this.Ss.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Ss.setText("Mamelodi Sundowns");
        this.add((Component)this.Ss, new RestricaoPosicaoLayout(260, 28, 164, 25));
        this.Sp.setFont(new Font("Arial", 0, 12));
        this.Sp.setHorizontalAlignment(4);
        this.Sp.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Sp.setText("Mamelodi Sundowns");
        this.Sp.setHorizontalTextPosition(2);
        this.add((Component)this.Sp, new RestricaoPosicaoLayout(10, 0, 180, 25));
        this.Sr.setFont(new Font("Arial", 0, 12));
        this.Sr.setHorizontalAlignment(4);
        this.Sr.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Sr.setText("Jorge Wilstermann");
        this.Sr.setHorizontalTextPosition(2);
        this.add((Component)this.Sr, new RestricaoPosicaoLayout(10, 28, 180, 25));
        this.zR.setFont(new Font("Arial", 0, 12));
        this.zR.setHorizontalAlignment(0);
        this.zR.setText("x");
        this.add((Component)this.zR, new RestricaoPosicaoLayout(200, 30, 50, 20));
        this.Su.setFont(new Font("Arial", 0, 12));
        this.Su.setHorizontalAlignment(0);
        this.add((Component)this.Su, new RestricaoPosicaoLayout(420, 33, 50, 15));
        this.St.setFont(new Font("Arial", 0, 12));
        this.St.setHorizontalAlignment(0);
        this.St.setText("x");
        this.add((Component)this.St, new RestricaoPosicaoLayout(200, 2, 50, 20));
    }

    private void vx() {
        this.Sq = new JLabel();
        this.Sp = new JLabel();
        this.Su = new JLabel();
        this.St = new JLabel();
        this.setBackground(new Color(228, 227, 227));
        this.setPreferredSize(new Dimension(480, 25));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.Sq.setFont(new Font("Arial", 0, 12));
        this.Sq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Sq.setText("");
        this.add((Component)this.Sq, new RestricaoPosicaoLayout(260, 0, 164, 25));
        this.Sp.setFont(new Font("Arial", 0, 12));
        this.Sp.setHorizontalAlignment(4);
        this.Sp.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.Sp.setText("");
        this.Sp.setHorizontalTextPosition(2);
        this.add((Component)this.Sp, new RestricaoPosicaoLayout(10, 0, 180, 25));
        this.Su.setFont(new Font("Arial", 0, 12));
        this.Su.setHorizontalAlignment(0);
        this.add((Component)this.Su, new RestricaoPosicaoLayout(420, 0, 50, 25));
        this.St.setFont(new Font("Arial", 0, 12));
        this.St.setHorizontalAlignment(0);
        this.St.setText("x");
        this.add((Component)this.St, new RestricaoPosicaoLayout(200, 2, 50, 20));
    }
}

