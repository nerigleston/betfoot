package editor;

import tabelas.RendererNomeTime;
import editor.TabelaTimesTransferencia;
import editor.ListenerBotaoCancelarTransferencia;
import editor.ListenerBotaoBuscarTimeTransferencia;
import editor.ListenerSelecaoTimeDestino;
import editor.ListenerBotaoConfirmarTransferencia;
import editor.ModeloTabelaTimes;
import modelos.ModeloTime2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class JanelaTransferenciaJogador
extends JPanel {
    private ModeloTime2 VH = null;
    private JButton uC;
    private JButton VI;
    private JButton VJ;
    private JButton UK;
    private JTextField VK;
    private JScrollPane ut;
    private JScrollPane wi;
    private JLabel zh;
    private JLabel VL;
    private JLabel QU;
    private JTable VM;

    public JanelaTransferenciaJogador() {
        this.mJ();
    }

    private void mJ() {
        this.ut = new JScrollPane();
        this.wi = new JScrollPane();
        this.VM = new JTable();
        this.QU = new JLabel();
        this.VL = new JLabel();
        this.VK = new JTextField();
        this.UK = new JButton();
        this.VJ = new JButton();
        this.zh = new JLabel();
        this.VI = new JButton();
        this.uC = new JButton();
        this.setBackground(new Color(51, 102, 0));
        this.wi.setPreferredSize(new Dimension(316, 202));
        ModeloTabelaTimes ay2 = new ModeloTabelaTimes();
        this.VM = new TabelaTimesTransferencia(this, ay2);
        this.wi.setViewportView(this.VM);
        this.ut.setViewportView(this.wi);
        this.QU.setFont(new Font("Tahoma", 1, 14));
        this.QU.setForeground(new Color(255, 255, 255));
        this.QU.setHorizontalAlignment(0);
        this.QU.setText("Transferir Jogador");
        this.VL.setForeground(new Color(255, 255, 255));
        this.VL.setHorizontalAlignment(4);
        this.VL.setText("Time:");
        this.UK.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon_search.png")));
        this.UK.setToolTipText("");
        this.UK.setCursor(new Cursor(12));
        this.VJ.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon_search.png")));
        this.VJ.setToolTipText("");
        this.VJ.setCursor(new Cursor(12));
        this.zh.setForeground(new Color(255, 255, 255));
        this.zh.setHorizontalAlignment(0);
        this.zh.setText("transferir para:");
        this.VI.setIcon(new ImageIcon(this.getClass().getResource("/aicons/je.png")));
        this.VI.setText("Confirmar");
        this.VI.setToolTipText("");
        this.VI.setCursor(new Cursor(12));
        this.VI.setEnabled(false);
        this.uC.setIcon(new ImageIcon(this.getClass().getResource("/aicons/exit.png")));
        this.uC.setText("Cancelar");
        this.uC.setToolTipText("");
        this.uC.setCursor(new Cursor(12));
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.QU, -2, 308, -2)).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addGap(23, 23, 23).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.ut).addGroup(groupLayout.createSequentialGroup().addComponent(this.VL, -2, 64, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.VK, -2, 176, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.VJ, -2, 39, -2)).addComponent(this.zh, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.VI, -2, 132, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.uC, -2, 132, -2))))).addContainerGap(27, Short.MAX_VALUE)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(0, 159, Short.MAX_VALUE).addComponent(this.UK).addGap(0, 160, Short.MAX_VALUE))));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addComponent(this.QU).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.VK, -2, -1, -2).addComponent(this.VL)).addComponent(this.VJ, -2, 0, Short.MAX_VALUE)).addGap(18, 18, 18).addComponent(this.ut, -2, 323, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.zh).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.VI).addComponent(this.uC)).addContainerGap(26, Short.MAX_VALUE)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(0, 239, Short.MAX_VALUE).addComponent(this.UK).addGap(0, 240, Short.MAX_VALUE))));
        this.mK();
        this.nc();
    }

    public void nc() {
        this.VM.getColumnModel().getColumn(0).setPreferredWidth(200);
        this.VM.getColumnModel().getColumn(1).setPreferredWidth(150);
        this.VM.getColumnModel().getColumn(2).setPreferredWidth(52);
        this.VM.setAutoResizeMode(3);
        this.VM.setShowGrid(false);
        this.VM.setDefaultRenderer(ModeloTime2.class, new RendererNomeTime());
        this.VM.setAutoCreateRowSorter(false);
        this.VM.setCellSelectionEnabled(false);
        this.VM.setSelectionMode(0);
        this.VM.setRowSelectionAllowed(true);
        this.VM.setRowHeight(20);
        this.VM.setIntercellSpacing(new Dimension(0, 0));
        this.VM.getTableHeader().setReorderingAllowed(false);
    }

    public void mK() {
        this.uC.addActionListener(new ListenerBotaoCancelarTransferencia(this));
        this.VJ.addActionListener(new ListenerBotaoBuscarTimeTransferencia(this));
        this.VM.getSelectionModel().addListSelectionListener(new ListenerSelecaoTimeDestino(this));
        this.VI.addActionListener(new ListenerBotaoConfirmarTransferencia(this));
    }

    public JTable xe() {
        return this.VM;
    }

    public ModeloTime2 xf() {
        return this.VH;
    }

    public void e(ModeloTime2 t2) {
        this.VH = t2;
    }

    static /* synthetic */ JTextField a(JanelaTransferenciaJogador ai2) {
        return ai2.VK;
    }

    static /* synthetic */ JTable b(JanelaTransferenciaJogador ai2) {
        return ai2.VM;
    }

    static /* synthetic */ JLabel c(JanelaTransferenciaJogador ai2) {
        return ai2.zh;
    }

    static /* synthetic */ ModeloTime2 d(JanelaTransferenciaJogador ai2) {
        return ai2.VH;
    }

    static /* synthetic */ JButton e(JanelaTransferenciaJogador ai2) {
        return ai2.VI;
    }
}

