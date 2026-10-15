package telas;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.vM;

import telas.RenderizadorPaisLista;
import telas.ListenerTrocarDivisaoTimeIdeal;
import telas.ListenerTrocarLigaTimeIdeal;
import telas.ListenerFecharDialogoPremios;
import nucleo.LigaNacional;
import nucleo.ConstantesJogo;
import components.RestricaoPosicaoLayout;
import components.PainelRolagemTabela;
import competicoes.CompeticaoLigaNacional;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoMelhoresPorPosicao
extends JPanel {
    private JDialog ub;
    private LigaNacional vt = null;
    private CompeticaoLigaNacional vu = null;
    private JButton vm;
    private JComboBox vv;
    private JComboBox ue;
    private JLabel ug;
    private JLabel vw;
    private JLabel uh;
    private JLabel a_;
    private JLabel ur;
    private JLabel us;
    private JLabel vx;
    private JLabel vy;
    private JLabel vz;
    private JLabel vA;
    private PainelRolagemTabela vB;
    private PainelRolagemTabela vC;
    private PainelRolagemTabela vD;
    private PainelRolagemTabela vE;
    private PainelRolagemTabela vF;
    private PainelRolagemTabela vG;
    private PainelRolagemTabela vH;
    private PainelRolagemTabela vI;

    public DialogoMelhoresPorPosicao(JDialog jDialog, CompeticaoLigaNacional b_02, LigaNacional z2) {
        this.ub = jDialog;
        this.vu = b_02;
        this.vt = z2;
        this.mK();
        this.mJ();
        this.mH();
        this.mW();
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
    }

    private void mK() {
        this.vu.zL();
        this.vB = new PainelRolagemTabela(this.vu.fj(0));
        this.vC = new PainelRolagemTabela(this.vu.fj(1));
        this.vD = new PainelRolagemTabela(this.vu.fj(2));
        this.vE = new PainelRolagemTabela(this.vu.fj(3));
        this.vF = new PainelRolagemTabela(this.vu.fj(6));
        this.vG = new PainelRolagemTabela(this.vu.fj(5));
        this.vH = new PainelRolagemTabela(this.vu.zG());
        this.vI = new PainelRolagemTabela(this.vu.fj(4));
    }

    public void mW() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            this.ue.addItem(((LigaNacional)SR.N().get(n3)).jp());
            if (this.vt == SR.N().get(n3)) {
                n2 = n3;
            }
            ++n3;
        }
        RenderizadorPaisLista aJ2 = new RenderizadorPaisLista();
        aJ2.setPreferredSize(new Dimension(12, 25));
        this.ue.setRenderer(aJ2);
        this.ue.setMaximumRowCount(12);
        this.ue.setSelectedIndex(n2);
        int n4 = 0;
        while (n4 < this.vt.eb().size()) {
            this.vv.addItem(String.valueOf(Integer.toString(n4 + 1)) + "\u00aa divis\u00e3o");
            ++n4;
        }
        if (this.vu != null && this.vu.yi().getDivisao() < this.vv.getItemCount()) {
            this.vv.setSelectedIndex(this.vu.yi().getDivisao() - 1);
        }
        this.vv.addActionListener(new ListenerTrocarDivisaoTimeIdeal(this));
        this.ue.addActionListener(new ListenerTrocarLigaTimeIdeal(this));
    }

    private void mU() {
        this.vt = (LigaNacional)SR.N().get(this.ue.getSelectedIndex());
        this.vv.removeAllItems();
        int n2 = 0;
        while (n2 < this.vt.eb().size()) {
            this.vv.addItem(String.valueOf(Integer.toString(n2 + 1)) + "\u00aa divis\u00e3o");
            ++n2;
        }
        this.vv.setSelectedIndex(0);
    }

    private void mX() {
        if (this.vv.getSelectedIndex() < this.vt.eb().size()) {
            this.vu = (CompeticaoLigaNacional)this.vt.eb().get(this.vv.getSelectedIndex());
        }
        this.vu.zL();
        this.vB.ac(this.vu.fj(0));
        this.vC.ac(this.vu.fj(1));
        this.vD.ac(this.vu.fj(2));
        this.vE.ac(this.vu.fj(3));
        this.vF.ac(this.vu.fj(6));
        this.vG.ac(this.vu.fj(5));
        this.vH.ac(this.vu.zG());
        this.vI.ac(this.vu.fj(4));
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharDialogoPremios(this));
    }

    private void mJ() {
        this.ug = new JLabel();
        this.uh = new JLabel();
        this.a_ = new JLabel();
        this.ur = new JLabel();
        this.us = new JLabel();
        this.vx = new JLabel();
        this.vy = new JLabel();
        this.vz = new JLabel();
        this.vA = new JLabel();
        this.vw = new JLabel();
        this.vm = new JButton();
        this.vv = new JComboBox();
        this.ue = new JComboBox();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setBackground(new Color(104, 120, 100));
        this.setLayout(new components.LayoutPosicaoAbsoluta());
        this.ug.setBackground(new Color(0, 0, 0));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setHorizontalAlignment(0);
        this.ug.setText("Goleiro");
        this.ug.setOpaque(true);
        this.add((Component)this.ug, new RestricaoPosicaoLayout(10, 12, 325, 22));
        this.add((Component)this.vB, new RestricaoPosicaoLayout(10, 40, 325, 180));
        this.add((Component)this.vC, new RestricaoPosicaoLayout(10, 266, 325, 180));
        this.uh.setBackground(new Color(0, 0, 0));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setHorizontalAlignment(0);
        this.uh.setText("Lateral Direito");
        this.uh.setOpaque(true);
        this.add((Component)this.uh, new RestricaoPosicaoLayout(10, 238, 325, 22));
        this.add((Component)this.vD, new RestricaoPosicaoLayout(10, 485, 325, 180));
        this.a_.setBackground(new Color(0, 0, 0));
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setHorizontalAlignment(0);
        this.a_.setText("Zagueiro");
        this.a_.setOpaque(true);
        this.add((Component)this.a_, new RestricaoPosicaoLayout(10, 457, 325, 22));
        this.add((Component)this.vE, new RestricaoPosicaoLayout(345, 485, 325, 180));
        this.ur.setBackground(new Color(0, 0, 0));
        this.ur.setForeground(new Color(255, 255, 255));
        this.ur.setHorizontalAlignment(0);
        this.ur.setText("Meia Ofensivo");
        this.ur.setOpaque(true);
        this.add((Component)this.ur, new RestricaoPosicaoLayout(345, 457, 325, 22));
        this.add((Component)this.vF, new RestricaoPosicaoLayout(345, 266, 325, 180));
        this.us.setBackground(new Color(0, 0, 0));
        this.us.setForeground(new Color(255, 255, 255));
        this.us.setHorizontalAlignment(0);
        this.us.setText("Volante");
        this.us.setOpaque(true);
        this.add((Component)this.us, new RestricaoPosicaoLayout(345, 238, 325, 22));
        this.add((Component)this.vG, new RestricaoPosicaoLayout(345, 40, 325, 180));
        this.vx.setBackground(new Color(0, 0, 0));
        this.vx.setForeground(new Color(255, 255, 255));
        this.vx.setHorizontalAlignment(0);
        this.vx.setText("Lateral Esquerdo");
        this.vx.setOpaque(true);
        this.add((Component)this.vx, new RestricaoPosicaoLayout(345, 12, 325, 22));
        this.vy.setBackground(new Color(255, 204, 0));
        this.vy.setHorizontalAlignment(0);
        this.vy.setText("Bola de Ouro");
        this.vy.setOpaque(true);
        this.add((Component)this.vy, new RestricaoPosicaoLayout(680, 457, 325, 22));
        this.add((Component)this.vH, new RestricaoPosicaoLayout(680, 485, 325, 180));
        this.add((Component)this.vI, new RestricaoPosicaoLayout(680, 266, 325, 180));
        this.vz.setBackground(new Color(0, 0, 0));
        this.vz.setForeground(new Color(255, 255, 255));
        this.vz.setHorizontalAlignment(0);
        this.vz.setText("Atacante");
        this.vz.setOpaque(true);
        this.add((Component)this.vz, new RestricaoPosicaoLayout(680, 238, 325, 22));
        this.add((Component)this.vA, new RestricaoPosicaoLayout(688, 12, 317, -1));
        this.vw.setIcon(new ImageIcon(this.getClass().getResource("/aicons/bolaouro.png")));
        this.add((Component)this.vw, new RestricaoPosicaoLayout(770, 20, 150, 120));
        this.vm.setText("X");
        this.add((Component)this.vm, new RestricaoPosicaoLayout(950, 20, 50, -1));
        this.add((Component)this.vv, new RestricaoPosicaoLayout(770, 190, 160, -1));
        this.add((Component)this.ue, new RestricaoPosicaoLayout(770, 160, 160, -1));
    }

    static /* synthetic */ JComboBox a(DialogoMelhoresPorPosicao h_02) {
        return h_02.vv;
    }

    static /* synthetic */ void b(DialogoMelhoresPorPosicao h_02) {
        h_02.mX();
    }

    static /* synthetic */ void c(DialogoMelhoresPorPosicao h_02) {
        h_02.mU();
    }

    static /* synthetic */ JDialog d(DialogoMelhoresPorPosicao h_02) {
        return h_02.ub;
    }
}

