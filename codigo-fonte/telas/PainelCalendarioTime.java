package telas;

import telas.AcaoFecharCalendario;
import telas.ListenerSelecaoCalendario;
import telas.ListenerFecharCalendario;
import telas.ListenerDuploCliqueCalendario;
import telas.ListenerSelecaoLinhaCalendario;
import telas.PainelEstatisticasPartida;
import tabelas.RenderizadorTabelaPartidasResultado;
import tabelas.RenderizadorListaNome;
import tabelas.ModeloTabelaPartidas;
import nucleo.ModeloPartida;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import motor.GerenciadorJogo;
import components.ItemPartidaAoVivo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;

public class PainelCalendarioTime
extends JPanel {
    private JDialog ub;
    private ArrayList vK = new ArrayList();
    private ArrayList vL = new ArrayList();
    private ModeloTime uk = null;
    private ArrayList u = new ArrayList();
    private static ModeloPartida vM = null;
    private JButton vm;
    private JComboBox va;
    private JScrollPane ut;
    private JLabel vf;
    private JTable vN;

    public PainelCalendarioTime(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.uk = ah2;
        this.mJ();
        this.mH();
        this.mK();
        this.na();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.mY();
        this.mG();
        this.Aw();
    }

    private void Aw() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < this.vL.size()) {
            if (!((ModeloPartida)this.vL.get(n3)).e()) {
                n2 = n3;
                break;
            }
            ++n3;
        }
        if (n2 < this.vN.getRowCount()) {
            this.vN.setRowSelectionInterval(n2, n2);
            if (n2 > 12) {
                JViewport jViewport = (JViewport)this.vN.getParent();
                Rectangle rectangle = this.vN.getCellRect(n2 - 5, 0, true);
                Point point = jViewport.getViewPosition();
                rectangle.setLocation(rectangle.x - point.x, rectangle.y - point.y);
                this.vN.scrollRectToVisible(rectangle);
            }
        } else if (this.vN.getRowCount() > 0) {
            this.vN.setRowSelectionInterval(0, 0);
        }
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
    }

    private void mY() {
        this.a(this.vN);
        this.a(this.va);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(27, 0), "esc");
        jComponent.getActionMap().put("esc", new AcaoFecharCalendario(this));
    }

    private void mK() {
        this.vf.setText("Calend\u00e1rio - " + this.uk.getNome());
        this.vf.setIcon(this.uk.kU());
        RenderizadorListaNome ai2 = new RenderizadorListaNome();
        this.va.setPreferredSize(new Dimension(10, 25));
        this.va.setRenderer(ai2);
        this.va.setMaximumRowCount(12);
        this.va.addActionListener(new ListenerSelecaoCalendario(this));
        this.u.clear();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.R().size()) {
            int n3 = 0;
            while (n3 < ((nucleo.Calendario)GerenciadorJogo.SR.R().get(n2)).h().size()) {
                if (((ModeloPartida)((nucleo.Calendario)GerenciadorJogo.SR.R().get(n2)).h().get(n3)).hc() == this.uk || ((ModeloPartida)((nucleo.Calendario)GerenciadorJogo.SR.R().get(n2)).h().get(n3)).hd() == this.uk) {
                    this.vK.add((ModeloPartida)((nucleo.Calendario)GerenciadorJogo.SR.R().get(n2)).h().get(n3));
                }
                ++n3;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.vK.size()) {
            if (!this.u.contains(((ModeloPartida)this.vK.get(n2)).hy())) {
                this.u.add(((ModeloPartida)this.vK.get(n2)).hy());
            }
            ++n2;
        }
        this.va.addItem("Mostrar todos");
        n2 = 0;
        while (n2 < this.u.size()) {
            this.va.addItem(this.u.get(n2));
            ++n2;
        }
        this.vL.clear();
        this.vL.addAll(this.vK);
    }

    private void cC(int n2) {
        if (n2 == 0) {
            this.vL.clear();
            this.vL.addAll(this.vK);
        } else if (n2 > 0) {
            this.vL.clear();
            Competicao at2 = (Competicao)this.va.getSelectedItem();
            int n3 = 0;
            while (n3 < this.vK.size()) {
                if (((ModeloPartida)this.vK.get(n3)).hy() == at2) {
                    this.vL.add((ModeloPartida)this.vK.get(n3));
                }
                ++n3;
            }
        }
        this.vN.addNotify();
        this.Aw();
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharCalendario(this));
        this.vN.addMouseListener(new ListenerDuploCliqueCalendario(this));
    }

    public void mZ() {
        if (vM != null && vM.e()) {
            ItemPartidaAoVivo v2 = new ItemPartidaAoVivo();
            v2.n(vM);
            JDialog jDialog = new JDialog(this.ub);
            PainelEstatisticasPartida dq2 = new PainelEstatisticasPartida(jDialog, v2);
            jDialog.add(dq2);
            jDialog.setSize(937, 642);
            jDialog.setPreferredSize(new Dimension(937, 642));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
        }
    }

    public void na() {
        ModeloTabelaPartidas i_02 = new ModeloTabelaPartidas(this.vL);
        this.vN.setModel(i_02);
        int[] nArray = new int[]{90, 135, 60, 135, 170, 80, 80};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.vN.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.vN.setAutoResizeMode(3);
        this.vN.setRowHeight(20);
        this.vN.setShowGrid(false);
        this.vN.setDefaultRenderer(ModeloPartida.class, new RenderizadorTabelaPartidasResultado());
        this.vN.setAutoCreateRowSorter(false);
        this.vN.getTableHeader().setReorderingAllowed(false);
        this.vN.setIntercellSpacing(new Dimension(0, 0));
        this.vN.setCellSelectionEnabled(false);
        this.vN.setSelectionMode(0);
        this.vN.setRowSelectionAllowed(true);
        this.vN.setBackground(Color.BLACK);
        this.vN.setSelectionBackground(new Color(2, 37, 51));
        this.vN.setShowHorizontalLines(true);
        this.vN.setGridColor(Color.BLACK);
        this.vN.setFillsViewportHeight(true);
        this.vN.setRowHeight(30);
        this.vN.getSelectionModel().addListSelectionListener(new ListenerSelecaoLinhaCalendario(this));
    }

    private void f(ModeloPartida i2) {
        vM = i2;
    }

    private void mJ() {
        this.vf = new JLabel();
        this.ut = new JScrollPane();
        this.vN = new JTable();
        this.vm = new JButton();
        this.va = new JComboBox();
        this.setBackground(new Color(0, 51, 0));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setPreferredSize(new Dimension(820, 602));
        this.setVerifyInputWhenFocusTarget(false);
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setForeground(new Color(255, 255, 255));
        this.vf.setText("Calend\u00e1rio - Cruzeiro");
        this.ut.setViewportView(this.vN);
        this.vm.setText("X");
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(36, 36, 36).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.ut, -2, 751, -2).addGroup(groupLayout.createSequentialGroup().addComponent(this.vf, -2, 328, -2).addGap(81, 81, 81).addComponent(this.va, -2, 216, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.vm, -2, 56, -2))).addContainerGap(31, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(21, 21, 21).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.va).addComponent(this.vm, -2, 30, -2)).addComponent(this.vf)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ut, -2, 510, -2).addGap(28, 28, 28)));
    }

    static /* synthetic */ JDialog a(PainelCalendarioTime l2) {
        return l2.ub;
    }

    static /* synthetic */ JComboBox b(PainelCalendarioTime l2) {
        return l2.va;
    }

    static /* synthetic */ void a(PainelCalendarioTime l2, int n2) {
        l2.cC(n2);
    }

    static /* synthetic */ JTable c(PainelCalendarioTime l2) {
        return l2.vN;
    }

    static /* synthetic */ void a(PainelCalendarioTime l2, ModeloPartida i2) {
        l2.f(i2);
    }
}

