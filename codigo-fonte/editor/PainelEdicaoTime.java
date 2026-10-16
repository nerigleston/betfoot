package editor;

import tabelas.RendererListaEstadosBrasil;
import nucleo.ConstantesJogo;
import nucleo.UtilitariosTexto;
import editor.RenderizadorTextoLista;
import editor.ListenerBotaoConfirmarTime;
import editor.ListenerBotaoCancelarTime;
import editor.ListenerComboPaisTime;
import editor.ListenerSeletorCorFundoTime;
import editor.ListenerSeletorCorTextoTime;
import modelos.ModeloTime2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class PainelEdicaoTime
extends JPanel {
    private ModeloTime2 Vn = UtilitariosTexto.da().wI();
    private boolean Ud = true;
    private ArrayList Ue = new ArrayList();
    private static final String Uf = "Nome do time inv\u00e1lido";
    private static final String Vo = "Nome do tecnico inv\u00e1lido";
    private static final String Vp = "Nome do est\u00e1dio inv\u00e1lido";
    private static final String Vq = "Nome do arquivo inv\u00e1lido";
    private static final String Vr = "O est\u00e1dio deve ter entre mil e 120 mil lugares";
    private static final String Vs = "Arquivo j\u00e1 existe, escolha outro nome";
    private JButton uC;
    private JButton Fu;
    private JComboBox Vt;
    private JComboBox Vu;
    private JComboBox Vv;
    private JComboBox ue;
    private JComboBox Vw = new JComboBox();
    private JTextField Vx;
    private JTextField uf;
    private JTextField IA = new JTextField();
    private JTextField Vy;
    private JTextField Vz;
    private JLabel VA = new JLabel();
    private JPanel VB;
    private JLabel VC;
    private JLabel zv;
    private JLabel VD;
    private JLabel zw;
    private JLabel VE;
    private JLabel Cg;
    private JLabel VF;
    private JLabel MM;
    private JLabel Vb;
    private JLabel uF;
    private JLabel MQ;
    private JLabel MR;
    private JLabel Fs;
    private JLabel QU = new JLabel();

    public PainelEdicaoTime() {
        if (UtilitariosTexto.da().wN()) {
            this.QU.setText("Adicionar Time");
            this.Ud = true;
            this.IA.setEnabled(true);
        } else {
            this.QU.setText("Editar Time");
            this.Ud = false;
            this.IA.setEnabled(false);
        }
        this.mJ();
        this.organizar();
    }

    /** Layout novo do modal: grade de duas colunas, rótulos em cima, ações no rodapé. */
    private void organizar() {
        // Nacionalidade do técnico ao lado do nome dele.
        this.Vw.setPreferredSize(null);
        this.Vw.setMinimumSize(null);
        this.Vw.setToolTipText("Nacionalidade do t\u00e9cnico");
        javax.swing.JPanel tecnico = new javax.swing.JPanel(new java.awt.BorderLayout(8, 0));
        tecnico.setOpaque(false);
        tecnico.add((java.awt.Component)this.Vy, "Center");
        tecnico.add((java.awt.Component)this.Vw, "East");
        this.Vw.setPreferredSize(new Dimension(150, this.Vy.getPreferredSize().height));
        javax.swing.JPanel capacidade = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        capacidade.setOpaque(false);
        capacidade.add((java.awt.Component)this.Vz, "Center");
        capacidade.add((java.awt.Component)this.VC, "East");
        javax.swing.JPanel cores = new javax.swing.JPanel(new java.awt.GridLayout(1, 2, 16, 0));
        cores.setOpaque(false);
        cores.add(PainelEdicaoTime.amostra(this.VE, this.zv, "Cor do texto"));
        cores.add(PainelEdicaoTime.amostra(this.VD, this.zw, "Cor de fundo"));
        this.VC.setText("lugares");
        this.uf.setColumns(24);
        components.TemaBetfoot.Formulario f = new components.TemaBetfoot.Formulario();
        f.campo(this.uF, "Nome do time", this.uf);
        f.par(this.MQ, "Pa\u00eds", this.ue, this.MM, "Estado", this.Vt);
        f.par(this.Vb, "N\u00edvel inicial", this.Vu, this.MR, "Reputa\u00e7\u00e3o", this.Vv);
        f.campo(this.Fs, "T\u00e9cnico e nacionalidade", tecnico);
        f.par(this.Cg, "Est\u00e1dio", this.Vx, this.VF, "Capacidade", capacidade);
        f.livre(cores);
        f.campo(this.VA, "Nome do arquivo", this.IA);
        if (!this.IA.isEnabled()) {
            this.IA.setToolTipText("O nome do arquivo s\u00f3 pode ser definido ao criar o time");
        }
        f.montar(this, this.QU, this.Ud ? "Crie um clube novo para usar nas carreiras" : "Ajuste os dados do clube", this.uC, null, this.uC, this.Fu);
    }

    /** Amostra de cor clicável (abre o seletor), com o nome ao lado. */
    private static javax.swing.JPanel amostra(javax.swing.JComponent cor, JLabel rotulo, String string) {
        javax.swing.JPanel p = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        p.setOpaque(false);
        cor.setPreferredSize(new Dimension(48, 36));
        cor.setToolTipText("Clique para escolher a cor");
        p.add((java.awt.Component)cor, "West");
        rotulo.setText(string);
        rotulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rotulo.setFont(components.TemaBetfoot.fonte(java.awt.Font.BOLD, 14.0f));
        rotulo.setForeground(components.TemaBetfoot.TEXTO_SUAVE);
        rotulo.putClientProperty("tema.ok", Boolean.TRUE);
        p.add((java.awt.Component)rotulo, "Center");
        return p;
    }

    private void mJ() {
        this.VB = new JPanel();
        this.uF = new JLabel();
        this.uf = new JTextField();
        this.Fs = new JLabel();
        this.Vy = new JTextField();
        this.Cg = new JLabel();
        this.Vx = new JTextField();
        this.VF = new JLabel();
        this.Vb = new JLabel();
        this.Vu = new JComboBox();
        this.MR = new JLabel();
        this.Vv = new JComboBox();
        this.VC = new JLabel();
        this.MQ = new JLabel();
        this.ue = new JComboBox();
        this.MM = new JLabel();
        this.Vt = new JComboBox();
        this.zv = new JLabel();
        this.VE = new JLabel();
        this.zw = new JLabel();
        this.VD = new JLabel();
        this.IA = new JTextField();
        this.VA = new JLabel();
        this.Fu = new JButton();
        this.uC = new JButton();
        this.Vz = new JTextField();
        this.setBackground(new Color(51, 71, 21));
        this.setPreferredSize(new Dimension(455, 435));
        this.VB.setBackground(new Color(51, 102, 0));
        this.QU.setFont(new Font("Tahoma", 1, 14));
        this.QU.setForeground(new Color(255, 255, 255));
        this.QU.setHorizontalAlignment(0);
        this.uF.setForeground(new Color(255, 255, 255));
        this.uF.setHorizontalAlignment(4);
        this.uF.setText("Nome:");
        this.Fs.setForeground(new Color(255, 255, 255));
        this.Fs.setHorizontalAlignment(4);
        this.Fs.setText("Nome do T\u00e9cnico:");
        this.Cg.setForeground(new Color(255, 255, 255));
        this.Cg.setHorizontalAlignment(4);
        this.Cg.setText("Nome do Est\u00e1dio:");
        this.VF.setForeground(new Color(255, 255, 255));
        this.VF.setHorizontalAlignment(4);
        this.VF.setText("Capacidade:");
        this.Vb.setForeground(new Color(255, 255, 255));
        this.Vb.setHorizontalAlignment(4);
        this.Vb.setText("N\u00edvel inicial:");
        this.MR.setForeground(new Color(255, 255, 255));
        this.MR.setHorizontalAlignment(4);
        this.MR.setText("Reputa\u00e7\u00e3o:");
        this.VC.setForeground(new Color(255, 255, 255));
        this.VC.setHorizontalAlignment(2);
        this.VC.setText("lugares");
        this.MQ.setForeground(new Color(255, 255, 255));
        this.MQ.setHorizontalAlignment(4);
        this.MQ.setText("Pais do time:");
        this.MM.setForeground(new Color(255, 255, 255));
        this.MM.setHorizontalAlignment(4);
        this.MM.setText("Estado:");
        this.zv.setForeground(new Color(255, 255, 255));
        this.zv.setHorizontalAlignment(4);
        this.zv.setText("Cor de Texto:");
        this.VE.setBackground(new Color(0, 102, 102));
        this.VE.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.VE.setOpaque(true);
        this.zw.setForeground(new Color(255, 255, 255));
        this.zw.setHorizontalAlignment(4);
        this.zw.setText("Cor de Fundo:");
        this.VD.setBackground(new Color(0, 102, 102));
        this.VD.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.VD.setOpaque(true);
        this.VA.setForeground(new Color(255, 255, 255));
        this.VA.setHorizontalAlignment(4);
        this.VA.setText("Nome do Arquivo:");
        this.Fu.setText("OK");
        this.uC.setText("Cancelar");
        this.Vw.setMaximumRowCount(15);
        this.Vw.setMinimumSize(new Dimension(28, 25));
        this.Vw.setPreferredSize(new Dimension(28, 25));
        GroupLayout groupLayout = new GroupLayout(this.VB);
        this.VB.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.QU, -1, -1, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.zv, -2, 84, -2).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.uF, -1, -1, Short.MAX_VALUE).addComponent(this.VF, -2, 84, -2).addComponent(this.Cg, -1, -1, Short.MAX_VALUE).addComponent(this.Vb, -2, 84, -2).addComponent(this.MQ, -2, 84, -2).addComponent(this.Fs, -1, -1, Short.MAX_VALUE).addComponent(this.VA, -1, 100, Short.MAX_VALUE))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.ue, -2, 153, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.MM, -2, 60, -2)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.Vz, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.VC, -2, 84, -2)).addComponent(this.Vx, -2, 323, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.VE, -2, 43, -2).addGap(26, 26, 26).addComponent(this.zw, -2, 84, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.VD, -2, 42, -2)).addComponent(this.IA, -2, 323, -2).addComponent(this.Vy, -2, 157, -2)).addGap(0, 0, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Vt, -2, 96, -2).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.uf, -2, 323, -2).addGroup(groupLayout.createSequentialGroup().addComponent(this.Vu, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.MR, -2, 84, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Vv, -2, 150, -2))).addComponent(this.Vw, -2, 153, -2)).addContainerGap(41, Short.MAX_VALUE)))))).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.Fu, -2, 92, -2).addGap(36, 36, 36).addComponent(this.uC, -2, 91, -2).addGap(114, 114, 114)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.QU).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.uf, -2, -1, -2).addComponent(this.uF)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Vy, -2, -1, -2).addComponent(this.Fs).addComponent(this.Vw, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Vx, -2, -1, -2).addComponent(this.Cg)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.VF).addComponent(this.Vz, -2, -1, -2).addComponent(this.VC)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Vu, -2, -1, -2).addComponent(this.Vb).addComponent(this.MR).addComponent(this.Vv, -2, -1, -2)).addGap(14, 14, 14).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.MQ).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.MM).addComponent(this.ue, -2, -1, -2).addComponent(this.Vt, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.zv).addComponent(this.zw).addComponent(this.VE, -1, 25, Short.MAX_VALUE).addComponent(this.VD, -1, -1, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.IA, -2, -1, -2).addComponent(this.VA)).addGap(14, 14, 14).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.uC).addComponent(this.Fu)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.VB, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.VB, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.mH();
        this.mK();
    }

    public void mH() {
        this.Fu.addActionListener(new ListenerBotaoConfirmarTime(this));
        this.uC.addActionListener(new ListenerBotaoCancelarTime(this));
    }

    public void mK() {
        if (!this.Ud) {
            this.uf.setText(this.Vn.getNome());
        } else {
            this.uf.setText("");
        }
        if (!this.Ud) {
            this.Vy.setText(this.Vn.getTecnico());
        } else {
            this.Vy.setText("");
        }
        if (!this.Ud) {
            this.Vx.setText(this.Vn.getEstadio());
        } else {
            this.Vx.setText("");
        }
        if (!this.Ud) {
            this.Vz.setText(Integer.toString(this.Vn.getCapacidade()));
        } else {
            this.Vz.setText("");
        }
        int n2 = 1;
        while (n2 <= 25) {
            this.Vu.addItem(n2);
            ++n2;
        }
        if (!this.Ud) {
            if (this.Vn.getNivel() < 1) {
                this.Vn.setNivel(1);
            }
            if (this.Vn.getNivel() > 25) {
                this.Vn.setNivel(25);
            }
            this.Vu.setSelectedItem(this.Vn.getNivel());
        } else {
            this.Vu.setSelectedItem(15);
        }
        n2 = 0;
        while (n2 < ConstantesJogo.pZ.length) {
            this.Vv.addItem(ConstantesJogo.pZ[n2]);
            ++n2;
        }
        if (!this.Ud) {
            this.Vv.setSelectedIndex(this.Vn.getReputacao());
        } else {
            this.Vv.setSelectedIndex(3);
        }
        n2 = 0;
        while (n2 < nucleo.EnumPaises.jz()) {
            this.Vw.addItem(((nucleo.DadosPais)UtilitariosTexto.cY().get(n2)).getNome());
            ++n2;
        }
        RenderizadorTextoLista a_02 = new RenderizadorTextoLista();
        a_02.setPreferredSize(new Dimension(10, 25));
        this.Vw.setRenderer(a_02);
        this.Vw.setMaximumRowCount(10);
        int n3 = 0;
        while (n3 < nucleo.EnumPaises.jz()) {
            this.ue.addItem(((nucleo.DadosPais)UtilitariosTexto.cY().get(n3)).getNome());
            ++n3;
        }
        if (!this.Ud) {
            this.Vw.setSelectedIndex(UtilitariosTexto.G(this.Vn.getTecNac()));
        } else {
            this.Vw.setSelectedIndex(UtilitariosTexto.G(29));
        }
        RenderizadorTextoLista a_03 = new RenderizadorTextoLista();
        a_03.setPreferredSize(new Dimension(10, 25));
        this.ue.setRenderer(a_03);
        this.ue.setMaximumRowCount(10);
        if (!this.Ud) {
            this.ue.setSelectedIndex(UtilitariosTexto.G(this.Vn.getPais()));
        } else {
            this.ue.setSelectedIndex(UtilitariosTexto.G(29));
        }
        RendererListaEstadosBrasil c_02 = new RendererListaEstadosBrasil();
        c_02.setPreferredSize(new Dimension(10, 20));
        this.Vt.setRenderer(c_02);
        this.Vt.setMaximumRowCount(10);
        int n4 = 0;
        while (n4 < ConstantesJogo.rX.length) {
            this.Vt.addItem(n4);
            ++n4;
        }
        if (UtilitariosTexto.H(this.ue.getSelectedIndex()) == 29) {
            this.Vt.setVisible(true);
            this.MM.setVisible(true);
            if (!this.Ud) {
                this.Vt.setSelectedIndex(this.Vn.getEstado());
            } else {
                this.Vt.setSelectedIndex(18);
            }
        } else {
            this.Vt.setVisible(false);
            this.MM.setVisible(false);
        }
        this.ue.addActionListener(new ListenerComboPaisTime(this));
        if (!this.Ud) {
            this.IA.setDisabledTextColor(Color.green);
            this.IA.setText(this.Vn.getFileRef());
            this.IA.setEditable(false);
        } else {
            this.IA.setText("");
            this.IA.setEnabled(true);
            this.IA.setEditable(true);
        }
        this.VE.setCursor(new Cursor(12));
        this.VD.setCursor(new Cursor(12));
        if (!this.Ud) {
            this.VE.setBackground(this.Vn.getCorT());
            this.VD.setBackground(this.Vn.getCorF());
        } else {
            this.VE.setBackground(Color.BLACK);
            this.VD.setBackground(Color.WHITE);
        }
        this.VE.addMouseListener(new ListenerSeletorCorFundoTime(this));
        this.VD.addMouseListener(new ListenerSeletorCorTextoTime(this));
    }

    public void xc() {
        String string;
        boolean bl = false;
        if (!this.uf.getText().toString().equals("") && this.uf.getText().toString().length() > 2 && this.uf.getText().toString().length() < 30) {
            if (!this.uf.getText().toString().equals(this.Vn.getNome())) {
                bl = true;
                this.Vn.setNome(this.uf.getText().toString());
            }
        } else {
            this.Ue.add(Uf);
        }
        if (!this.Vy.getText().toString().equals("") && this.Vy.getText().toString().length() > 2 && this.Vy.getText().toString().length() < 50) {
            if (!this.Vy.getText().toString().equals(this.Vn.getTecnico())) {
                bl = true;
                this.Vn.setTecnico(this.Vy.getText().toString());
            }
        } else {
            this.Ue.add(Vo);
        }
        if (!this.Vx.getText().toString().equals("") && this.Vx.getText().toString().length() > 2 && this.Vx.getText().toString().length() < 50) {
            if (!this.Vx.getText().toString().equals(this.Vn.getEstadio())) {
                bl = true;
                this.Vn.setEstadio(this.Vx.getText().toString());
            }
        } else {
            this.Ue.add(Vp);
        }
        if (!(string = this.Vz.getText().toString()).equals("") && string.matches("\\d+")) {
            int n2 = Integer.parseInt(string);
            if (n2 >= 1000 && n2 <= 120000) {
                this.Vn.setCapacidade(n2);
                bl = true;
            } else {
                this.Ue.add(Vr);
            }
        } else {
            this.Ue.add(Vr);
        }
        if (((Integer)this.Vu.getSelectedItem()).intValue() != this.Vn.getNivel()) {
            this.Vn.setNivel((Integer)this.Vu.getSelectedItem());
            bl = true;
        }
        if (this.Vv.getSelectedIndex() != this.Vn.getReputacao()) {
            this.Vn.setReputacao(this.Vv.getSelectedIndex());
            bl = true;
        }
        if (this.ue.getSelectedIndex() != UtilitariosTexto.G(this.Vn.getPais())) {
            this.Vn.setPais(UtilitariosTexto.H(this.ue.getSelectedIndex()));
            UtilitariosTexto.a(this.Vn);
            bl = true;
        }
        if (this.Vw.getSelectedIndex() != UtilitariosTexto.G(this.Vn.getTecNac())) {
            this.Vn.setTecNac(UtilitariosTexto.H(this.Vw.getSelectedIndex()));
            bl = true;
        }
        if (UtilitariosTexto.H(this.ue.getSelectedIndex()) == 29 && this.Vt.getSelectedIndex() != this.Vn.getEstado()) {
            this.Vn.setEstado(this.Vt.getSelectedIndex());
            bl = true;
        }
        if (this.VE.getBackground() != this.Vn.getCorT()) {
            this.Vn.setCorT(this.VE.getBackground());
            bl = true;
        }
        if (this.VD.getBackground() != this.Vn.getCorF()) {
            this.Vn.setCorF(this.VD.getBackground());
            bl = true;
        }
        if (bl) {
            UtilitariosTexto.da().wE();
        }
    }

    public void xd() {
        boolean bl = true;
        if (this.uf.getText().toString().equals("") || this.uf.getText().toString().length() < 2 || this.uf.getText().toString().length() > 25) {
            bl = false;
            this.Ue.add(Uf);
        }
        if (this.Vy.getText().toString().equals("") || this.Vy.getText().toString().length() < 2 || this.Vy.getText().toString().length() > 30) {
            bl = false;
            this.Ue.add(Vo);
        }
        if (this.Vx.getText().toString().equals("") || this.Vx.getText().toString().length() < 2 || this.Vx.getText().toString().length() > 30) {
            bl = false;
            this.Ue.add(Vp);
        }
        String string = this.Vz.getText().toString();
        int n2 = 1000;
        if (!string.equals("") && string.matches("\\d+")) {
            n2 = Integer.parseInt(string);
            if (n2 < 1000 || n2 > 120000) {
                bl = false;
                this.Ue.add(Vr);
            }
        } else {
            bl = false;
            this.Ue.add(Vr);
        }
        String string2 = null;
        if (this.IA.getText().toString().equals("") || this.IA.getText().toString().length() < 2 || this.IA.getText().toString().length() > 30) {
            this.Ue.add(Vq);
            bl = false;
        } else {
            string2 = this.IA.getText().toString();
        }
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/teams/" + string2 + ".b18");
        if (file.exists() && !file.isDirectory()) {
            bl = false;
            this.Ue.add(Vs);
        }
        if (bl) {
            ModeloTime2 t2 = new ModeloTime2();
            t2.setNome(this.uf.getText().toString());
            t2.setTecnico(this.Vy.getText().toString());
            t2.setTecNac(UtilitariosTexto.H(this.Vw.getSelectedIndex()));
            t2.setEstadio(this.Vx.getText().toString());
            t2.setPais(UtilitariosTexto.H(this.ue.getSelectedIndex()));
            t2.setCapacidade(n2);
            t2.setNivel((Integer)this.Vu.getSelectedItem());
            t2.setReputacao(this.Vv.getSelectedIndex());
            t2.setId(0);
            if (t2.getPais() == 29) {
                t2.setEstado(this.Vt.getSelectedIndex());
            }
            t2.setCorF(this.VD.getBackground());
            t2.setCorT(this.VE.getBackground());
            t2.setFileRef(this.IA.getText());
            UtilitariosTexto.cZ().add(0, t2);
            UtilitariosTexto.a(t2);
            UtilitariosTexto.da().ah(t2.getNome());
        }
    }

    static /* synthetic */ ArrayList a(PainelEdicaoTime ac2) {
        return ac2.Ue;
    }

    static /* synthetic */ boolean b(PainelEdicaoTime ac2) {
        return ac2.Ud;
    }

    static /* synthetic */ JComboBox c(PainelEdicaoTime ac2) {
        return ac2.ue;
    }

    static /* synthetic */ JComboBox d(PainelEdicaoTime ac2) {
        return ac2.Vt;
    }

    static /* synthetic */ JLabel e(PainelEdicaoTime ac2) {
        return ac2.MM;
    }

    static /* synthetic */ JLabel f(PainelEdicaoTime ac2) {
        return ac2.VE;
    }

    static /* synthetic */ JLabel g(PainelEdicaoTime ac2) {
        return ac2.VD;
    }
}

