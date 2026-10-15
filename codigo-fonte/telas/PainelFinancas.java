package telas;

import telas.ListenerFecharPainelFinancas;
import telas.ListenerPegarEmprestimo;
import telas.ListenerPagarEmprestimo;
import tabelas.RenderizadorTabelaFinancas;
import tabelas.ModeloTabelaFinancas;
import nucleo.BalancoFinanceiro;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import components.LinhaDemonstrativoFinanceiro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

public class PainelFinancas
extends JPanel {
    private JDialog ub;
    private ModeloTime uk = null;
    private ArrayList DW = new ArrayList();
    private JButton vm;
    private JButton DX;
    private JButton DY;
    private JLabel ug;
    private JLabel uh;
    private JPanel vd;
    private JScrollPane ut;
    private JLabel DZ;
    private JLabel Ea;
    private JLabel Eb;
    private JLabel Ec;
    private JTable Ed;

    public PainelFinancas(JDialog jDialog, ModeloTime ah2) {
        this.uk = ah2;
        this.ub = jDialog;
        this.mJ();
        this.mH();
        this.ug.setIcon(ah2.kU());
        this.pp();
        this.pq();
        this.po();
        this.ug.setText("Finan\u00e7as - " + String.valueOf(GerenciadorJogo.SR.H() + GerenciadorJogo.SR.iU()));
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
    }

    private void po() {
        String string = "Total de sal\u00e1rios por m\u00eas: ";
        if (!GerenciadorJogo.SR.isSalarioMensal()) {
            string = "Total de sal\u00e1rios por semana: ";
        }
        this.Ec.setText(String.valueOf(string) + BalancoFinanceiro.c(this.uk.kK()));
        this.DZ.setText("Dinheiro em caixa: " + BalancoFinanceiro.c(this.uk.kb()));
        this.Ea.setText("Valor j\u00e1 emprestado: " + BalancoFinanceiro.c(this.uk.kL().eN()));
        this.Eb.setText("Juros mensais: " + BalancoFinanceiro.c(this.uk.kL().eQ()));
    }

    private void pp() {
        BalancoFinanceiro c2 = this.uk.kL();
        if (c2 != null) {
            LinhaDemonstrativoFinanceiro j_02 = new LinhaDemonstrativoFinanceiro();
            j_02.ar(true);
            j_02.D("Receitas");
            j_02.as(true);
            this.DW.add(j_02);
            LinhaDemonstrativoFinanceiro j_03 = new LinhaDemonstrativoFinanceiro();
            j_03.D("Ingressos:");
            j_03.g(c2.eE());
            this.DW.add(j_03);
            LinhaDemonstrativoFinanceiro j_04 = new LinhaDemonstrativoFinanceiro();
            j_04.D("Venda de Jogadores:");
            j_04.g(c2.eG());
            this.DW.add(j_04);
            LinhaDemonstrativoFinanceiro j_05 = new LinhaDemonstrativoFinanceiro();
            j_05.D("Pr\u00eamios:");
            j_05.g(c2.eF());
            this.DW.add(j_05);
            LinhaDemonstrativoFinanceiro j_06 = new LinhaDemonstrativoFinanceiro();
            j_06.D("Patrocinio/S\u00f3cio torcedor:");
            j_06.g(c2.eH());
            this.DW.add(j_06);
            LinhaDemonstrativoFinanceiro j_07 = new LinhaDemonstrativoFinanceiro();
            j_07.D("Multas/outros:");
            j_07.g(c2.eR());
            this.DW.add(j_07);
            LinhaDemonstrativoFinanceiro j_08 = new LinhaDemonstrativoFinanceiro();
            j_08.D("Total de receitas:");
            j_08.as(true);
            j_08.g(c2.ez());
            this.DW.add(j_08);
            LinhaDemonstrativoFinanceiro j_09 = new LinhaDemonstrativoFinanceiro();
            j_09.ar(true);
            j_09.D("Despesas");
            j_09.as(true);
            this.DW.add(j_09);
            LinhaDemonstrativoFinanceiro j_010 = new LinhaDemonstrativoFinanceiro();
            j_010.D("Compras de jogadores:");
            j_010.g(c2.eJ());
            this.DW.add(j_010);
            LinhaDemonstrativoFinanceiro j_011 = new LinhaDemonstrativoFinanceiro();
            j_011.D("Est\u00e1dio:");
            j_011.g(c2.eI());
            this.DW.add(j_011);
            LinhaDemonstrativoFinanceiro j_012 = new LinhaDemonstrativoFinanceiro();
            j_012.D("Sal\u00e1rios:");
            j_012.g(c2.eO());
            this.DW.add(j_012);
            LinhaDemonstrativoFinanceiro j_013 = new LinhaDemonstrativoFinanceiro();
            j_013.D("Juros de empr\u00e9stimo:");
            j_013.g(c2.eK());
            this.DW.add(j_013);
            LinhaDemonstrativoFinanceiro j_014 = new LinhaDemonstrativoFinanceiro();
            j_014.D("Multa de rescis\u00e3o:");
            j_014.g(c2.eM());
            this.DW.add(j_014);
            LinhaDemonstrativoFinanceiro j_015 = new LinhaDemonstrativoFinanceiro();
            j_015.D("Diversos:");
            j_015.g(c2.eL());
            this.DW.add(j_015);
            LinhaDemonstrativoFinanceiro j_016 = new LinhaDemonstrativoFinanceiro();
            j_016.D("Total de despesas:");
            j_016.as(true);
            j_016.g(c2.eB());
            this.DW.add(j_016);
            LinhaDemonstrativoFinanceiro j_017 = new LinhaDemonstrativoFinanceiro();
            j_017.D("Saldo:");
            j_017.as(true);
            j_017.g(c2.eC());
            this.DW.add(j_017);
        }
    }

    private void mH() {
        this.vm.addActionListener(new ListenerFecharPainelFinancas(this));
        this.DY.addActionListener(new ListenerPegarEmprestimo(this));
        this.DX.addActionListener(new ListenerPagarEmprestimo(this));
    }

    private void df(int n2) {
        if (n2 == 1) {
            if (!this.uk.kL().m(this.uk)) {
                this.uh.setText("Empr\u00e9stimo banc\u00e1rio - limite m\u00e1ximo alcan\u00e7ado");
            }
        } else if (n2 == -1) {
            this.uk.kL().l(this.uk);
        }
        this.po();
    }

    private void pq() {
        ModeloTabelaFinancas x_02 = new ModeloTabelaFinancas(this.DW);
        this.Ed.setModel(x_02);
        this.Ed.setTableHeader(null);
        int[] nArray = new int[]{100, 100};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.Ed.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.Ed.setAutoResizeMode(3);
        this.Ed.setRowHeight(20);
        this.Ed.setShowGrid(false);
        this.Ed.setDefaultRenderer(LinhaDemonstrativoFinanceiro.class, new RenderizadorTabelaFinancas());
        this.Ed.setAutoCreateRowSorter(false);
        this.Ed.setIntercellSpacing(new Dimension(0, 0));
        this.Ed.setCellSelectionEnabled(false);
        this.Ed.setSelectionMode(0);
        this.Ed.setRowSelectionAllowed(false);
        this.Ed.setSelectionBackground(Color.YELLOW);
        this.Ed.setFillsViewportHeight(true);
    }

    private void mJ() {
        this.ug = new JLabel();
        this.vm = new JButton();
        this.ut = new JScrollPane();
        this.Ed = new JTable();
        this.vd = new JPanel();
        this.uh = new JLabel();
        this.Ea = new JLabel();
        this.Eb = new JLabel();
        this.DY = new JButton();
        this.DX = new JButton();
        this.Ec = new JLabel();
        this.DZ = new JLabel();
        this.setBackground(new Color(44, 53, 49));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ug.setFont(new Font("Tahoma", 1, 12));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setText("Finan\u00e7as");
        this.vm.setText("X");
        this.ut.setViewportView(this.Ed);
        this.vd.setBackground(new Color(104, 120, 100));
        this.uh.setFont(new Font("Tahoma", 1, 12));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setText("Empr\u00e9stimo banc\u00e1rio");
        this.Ea.setForeground(new Color(255, 255, 255));
        this.Ea.setText("Valor j\u00e1 emprestado:");
        this.Eb.setForeground(new Color(255, 255, 255));
        this.Eb.setText("Juros mensais:");
        this.DY.setText("Pegar 500 mil");
        this.DX.setText("Pagar 500 mil");
        GroupLayout groupLayout = new GroupLayout(this.vd);
        this.vd.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.DY, -2, 145, -2).addGap(18, 18, 18).addComponent(this.DX, -2, 145, -2).addGap(0, 0, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.uh, -1, -1, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Ea, -1, -1, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Eb, -1, -1, Short.MAX_VALUE))).addGap(25, 25, 25)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(14, Short.MAX_VALUE).addComponent(this.uh).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Ea).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Eb).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DY).addComponent(this.DX)).addGap(18, 18, 18)));
        this.Ec.setForeground(new Color(255, 255, 255));
        this.Ec.setText("Sal\u00e1ro mensal:");
        this.DZ.setForeground(new Color(255, 255, 255));
        this.DZ.setText("Dinheiro em caixa:");
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addGap(20, 20, 20).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.DZ, -1, -1, Short.MAX_VALUE).addComponent(this.Ec, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.vd, -1, -1, Short.MAX_VALUE).addGroup(groupLayout2.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(this.ut, -2, 354, -2)).addGroup(groupLayout2.createSequentialGroup().addComponent(this.ug, -1, -1, Short.MAX_VALUE).addGap(18, 18, 18).addComponent(this.vm, -2, 49, -2))).addGap(24, 24, 24)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ug).addComponent(this.vm)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ut, -2, 347, -2).addGap(18, 18, 18).addComponent(this.Ec).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DZ).addGap(18, 18, 18).addComponent(this.vd, -2, -1, -2).addContainerGap(18, Short.MAX_VALUE)));
    }

    static /* synthetic */ JDialog a(PainelFinancas cW2) {
        return cW2.ub;
    }

    static /* synthetic */ void a(PainelFinancas cW2, int n2) {
        cW2.df(n2);
    }
}

