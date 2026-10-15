package telas;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.vM;

import telas.ListenerFecharPainelEmprestimos;
import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import components.PainelCancelarEmprestimo;
import components.ModeloOfertaJogador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;

public class PainelEmprestimosJogadores
extends JPanel {
    private ModeloTime zu = null;
    private ModeloTime Af = null;
    private ModeloJogador yK = null;
    private JDialog ub;
    private static boolean Ag = false;
    private JPanel xb = null;
    private JPanel Ah = null;
    private ArrayList Ai = new ArrayList();
    private ArrayList Aj = new ArrayList();
    private int xh = 0;
    private int xi = 0;
    private int Ak = 0;
    private int Al = 0;
    private JButton Am;
    private JLabel uh;
    private JLabel a_;
    private JScrollPane ut;
    private JScrollPane wi;
    private JLabel An;
    private JLabel Ao;
    private JTable Ap;
    private JTable Aq;

    public PainelEmprestimosJogadores(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.Af = ah2;
        Ag = false;
        this.mJ();
        this.mH();
        this.nS();
        this.nT();
        this.nW();
        this.mG();
    }

    private void nt() {
        this.Ai.clear();
        this.xb = new JPanel(new LayoutPosicaoAbsoluta());
        this.xh = 0;
        this.xi = 0;
    }

    private void nR() {
        this.Aj.clear();
        this.Ah = new JPanel(new LayoutPosicaoAbsoluta());
        this.Ak = 0;
        this.Al = 0;
    }

    public void nS() {
        this.nt();
        this.nU();
        ArrayList arrayList = SR.e(this.Af);
        int n2 = 0;
        while (n2 < arrayList.size()) {
            this.Ai.add((ModeloOfertaJogador)arrayList.get(n2));
            this.a((ModeloOfertaJogador)arrayList.get(n2));
            ++n2;
        }
        JViewport jViewport = this.ut.getViewport();
        jViewport.setView(this.xb);
    }

    public void nT() {
        this.nR();
        this.nV();
        ArrayList arrayList = SR.f(this.Af);
        int n2 = 0;
        while (n2 < arrayList.size()) {
            this.Aj.add((ModeloOfertaJogador)arrayList.get(n2));
            this.b((ModeloOfertaJogador)arrayList.get(n2));
            ++n2;
        }
        JViewport jViewport = this.wi.getViewport();
        jViewport.setView(this.Ah);
    }

    private void nU() {
        PainelCancelarEmprestimo h_02 = new PainelCancelarEmprestimo(2, this, null);
        this.xb.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
        this.xb.add((Component)h_02, new RestricaoPosicaoLayout(0, this.xh, 690, 36));
        this.xh += 36;
    }

    private void a(ModeloOfertaJogador t_02) {
        int n2 = 0;
        PainelCancelarEmprestimo h_02 = new PainelCancelarEmprestimo(1, this, t_02);
        this.xb.add((Component)h_02, new RestricaoPosicaoLayout(0, this.xh, 690, 36));
        this.xh = this.xh + 36 + n2;
    }

    private void nV() {
        PainelCancelarEmprestimo h_02 = new PainelCancelarEmprestimo(3, this, null);
        this.Ah.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
        this.Ah.add((Component)h_02, new RestricaoPosicaoLayout(0, this.Ak, 690, 36));
        this.Ak += 36;
    }

    private void b(ModeloOfertaJogador t_02) {
        PainelCancelarEmprestimo h_02 = new PainelCancelarEmprestimo(4, this, t_02);
        this.Ah.add((Component)h_02, new RestricaoPosicaoLayout(0, this.Ak, 690, 36));
        this.Ak += 36;
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(vM().getCorTema(), 2));
        this.ut.setBorder(BorderFactory.createEmptyBorder());
        this.wi.setBorder(BorderFactory.createEmptyBorder());
    }

    public void mH() {
        this.Am.addActionListener(new ListenerFecharPainelEmprestimos(this));
    }

    public void a(ModeloOfertaJogador t_02, int n2) {
        if (t_02.tN()) {
            Ag = true;
            SR.d(t_02.x());
            if (n2 == 1) {
                this.nS();
            } else {
                this.nT();
            }
            this.nW();
        } else {
            JOptionPane.showMessageDialog(this.ub, "N\u00e3o h\u00e1 vagas no time de origem", "", 2);
        }
    }

    private void nW() {
        this.An.setText("vagas dispon\u00edveis: " + Integer.toString(this.Ai.size()) + "/" + Integer.toString(4));
        this.Ao.setText("limite de empr\u00e9stimos: " + Integer.toString(this.Aj.size()) + "/" + Integer.toString(10));
    }

    private void mJ() {
        this.ut = new JScrollPane();
        this.Ap = new JTable();
        this.uh = new JLabel();
        this.wi = new JScrollPane();
        this.Aq = new JTable();
        this.a_ = new JLabel();
        this.Ao = new JLabel();
        this.Am = new JButton();
        this.An = new JLabel();
        this.setBackground(new Color(0, 68, 105));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setPreferredSize(new Dimension(797, 740));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.ut.setBackground(new Color(204, 204, 204));
        this.ut.setHorizontalScrollBarPolicy(31);
        this.ut.setViewportView(this.Ap);
        this.add((Component)this.ut, new RestricaoPosicaoLayout(23, 48, 690, 180));
        this.uh.setFont(new Font("Tahoma", 1, 14));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setText("Seus jogadores emprestados em outros times");
        this.add((Component)this.uh, new RestricaoPosicaoLayout(28, 267, 380, -1));
        this.wi.setBackground(new Color(204, 204, 204));
        this.wi.setHorizontalScrollBarPolicy(31);
        this.wi.setViewportView(this.Aq);
        this.add((Component)this.wi, new RestricaoPosicaoLayout(23, 290, 690, 280));
        this.a_.setFont(new Font("Tahoma", 1, 14));
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setText("Jogadores emprestados no seu time");
        this.add((Component)this.a_, new RestricaoPosicaoLayout(28, 25, 360, -1));
        this.Ao.setFont(new Font("Tahoma", 1, 12));
        this.Ao.setForeground(new Color(255, 255, 153));
        this.Ao.setHorizontalAlignment(4);
        this.Ao.setText("limite de empr\u00e9stimos: 0/10");
        this.add((Component)this.Ao, new RestricaoPosicaoLayout(520, 270, 190, -1));
        this.Am.setText("X");
        this.add((Component)this.Am, new RestricaoPosicaoLayout(660, 10, 50, -1));
        this.An.setFont(new Font("Tahoma", 1, 12));
        this.An.setForeground(new Color(255, 255, 153));
        this.An.setText("vagas dispon\u00edveis: 0/4");
        this.add((Component)this.An, new RestricaoPosicaoLayout(510, 28, 140, -1));
    }

    public static boolean nX() {
        return Ag;
    }

    static /* synthetic */ JDialog a(PainelEmprestimosJogadores bs_02) {
        return bs_02.ub;
    }
}

