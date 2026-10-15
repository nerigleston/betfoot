package components;

import telas.PainelEmprestimosJogadores;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorTelas;
import components.OuvinteCancelarEmprestimo;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import components.ListenerConfirmarCancelamento;
import components.ModeloOfertaJogador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PainelCancelarEmprestimo
extends JPanel {
    PainelEmprestimosJogadores Qj = null;
    ModeloOfertaJogador Qk;
    int w = -1;
    private JButton Ql;
    private JButton Qm;
    private JLabel Qn;
    private JLabel uF;
    private JLabel zO;

    public PainelCancelarEmprestimo(int n2, PainelEmprestimosJogadores bs_02, ModeloOfertaJogador t_02) {
        this.Qj = bs_02;
        this.Qk = t_02;
        this.w = n2;
        if (n2 == 1) {
            this.mJ();
            this.uF.setText(String.valueOf(ConstantesJogo.rI[t_02.x().getPosicao()]) + " - " + t_02.x().getNome());
            this.Qn.setText(nucleo.Calendario.a(t_02.tO()));
            if (t_02.tP() != null) {
                this.zO.setText(t_02.tP().getNome());
                this.zO.setIcon(t_02.tP().kU());
            }
            this.mH();
        } else if (n2 == 4) {
            this.ui();
            this.mJ();
            this.uF.setText(String.valueOf(ConstantesJogo.rI[t_02.x().getPosicao()]) + " - " + t_02.x().getNome());
            this.Qn.setText(nucleo.Calendario.a(t_02.tO()));
            if (t_02.x().fg() != null) {
                this.zO.setText(t_02.x().fg().getNome());
                this.zO.setIcon(t_02.x().fg().kU());
            }
            this.mH();
        } else if (n2 == 2 || n2 == 3) {
            this.ui();
            if (n2 == 3) {
                this.zO.setText("Jogando no time");
            }
        }
    }

    private void mH() {
        this.Ql.addActionListener(new ListenerConfirmarCancelamento(this));
        this.Qm.addActionListener(new OuvinteCancelarEmprestimo(this));
    }

    private void uh() {
        this.setCursor(new Cursor(3));
        GerenciadorTelas.a(this.Qk.x(), null);
        this.setCursor(new Cursor(12));
    }

    private void qG() {
        int n2 = -1;
        n2 = JOptionPane.showConfirmDialog(this.Qj, "Deseja cancelar o empr\u00e9stimo do jogador " + this.Qk.x().getNome() + "?", "Confirmar", 0);
        if (n2 == 0) {
            this.Qj.a(this.Qk, this.w);
        }
    }

    private void mJ() {
        this.Qn = new JLabel();
        this.uF = new JLabel();
        this.Qm = new JButton();
        this.Ql = new JButton();
        this.zO = new JLabel();
        this.setBackground(new Color(228, 227, 227));
        this.setPreferredSize(new Dimension(690, 36));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.Qn.setFont(new Font("Arial", 1, 12));
        this.Qn.setText("Fase Qualificat\u00f3ria R1");
        this.add((Component)this.Qn, new RestricaoPosicaoLayout(380, 0, 160, 40));
        this.uF.setFont(new Font("Arial", 1, 12));
        this.uF.setText("Jo\u00e3o da Silva");
        this.add((Component)this.uF, new RestricaoPosicaoLayout(10, 0, 150, 40));
        this.Qm.setIcon(new ImageIcon(this.getClass().getResource("/aeicons/r_eli.png")));
        this.add((Component)this.Qm, new RestricaoPosicaoLayout(615, 5, -1, 25));
        this.Ql.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon22small.png")));
        this.add((Component)this.Ql, new RestricaoPosicaoLayout(550, 5, -1, 25));
        this.zO.setFont(new Font("Arial", 1, 12));
        this.zO.setText("Fase Qualificat\u00f3ria R1");
        this.add((Component)this.zO, new RestricaoPosicaoLayout(170, 0, 190, 40));
    }

    private void ui() {
        this.Qn = new JLabel();
        this.uF = new JLabel();
        this.zO = new JLabel();
        this.setBackground(new Color(0, 0, 0));
        this.setPreferredSize(new Dimension(690, 36));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.Qn.setFont(new Font("Arial", 1, 12));
        this.Qn.setForeground(new Color(255, 255, 255));
        this.Qn.setText("Data fim do empr\u00e9stimo");
        this.add((Component)this.Qn, new RestricaoPosicaoLayout(380, 0, 160, 40));
        this.uF.setFont(new Font("Arial", 1, 12));
        this.uF.setForeground(new Color(255, 255, 255));
        this.uF.setText("Jogador");
        this.add((Component)this.uF, new RestricaoPosicaoLayout(10, 0, 150, 40));
        this.zO.setFont(new Font("Arial", 1, 12));
        this.zO.setForeground(new Color(255, 255, 255));
        this.zO.setText("Time a que pertence");
        this.add((Component)this.zO, new RestricaoPosicaoLayout(170, 0, 190, 40));
    }

    static /* synthetic */ void a(PainelCancelarEmprestimo h_02) {
        h_02.uh();
    }

    static /* synthetic */ void b(PainelCancelarEmprestimo h_02) {
        h_02.qG();
    }
}

