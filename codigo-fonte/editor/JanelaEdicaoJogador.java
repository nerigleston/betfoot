package editor;

import nucleo.ModeloJogador;
import nucleo.EnumPaises;
import nucleo.DadosPais;
import nucleo.ConstantesJogo;
import nucleo.UtilitariosTexto;
import editor.RenderizadorTextoLista;
import editor.ModeloTabelaJogadores;
import editor.AcaoConfirmarJogador;
import editor.AcaoCancelarJogador;
import editor.ListenerContinuarAdicionando;
import editor.ListenerComboPosicaoJogador;
import editor.ListenerSliderCaracteristica;
import editor.ListenerBotaoConfirmarJogador;
import editor.ListenerBotaoCancelarJogador;
import modelos.ModeloJogador2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;

public class JanelaEdicaoJogador
extends JPanel {
    private ModeloJogador2 Ub = UtilitariosTexto.da().wL();
    private boolean Uc = UtilitariosTexto.da().wK();
    private boolean Ud = true;
    private ArrayList Ue = new ArrayList();
    private static final String Uf = "Nome inv\u00e1lido";
    private static final String Ug = "Nome muito curto";
    private static final String Uh = "Nome muito longo";
    private static final String Ui = "Limite de jogadores alcan\u00e7ado";
    private static final String Uj = "Reputa\u00e7\u00e3o n\u00e3o permite Top Mundial neste time";
    private static int Uk = 0;
    private JButton uC;
    private JButton Fu;
    private JCheckBox Qs;
    private JCheckBox Ul = new JCheckBox();
    private JComboBox Qv;
    private JComboBox Qw;
    private JComboBox ue;
    private JComboBox Nq;
    private JTextField uf;
    private JComboBox Qx;
    private JLabel ug = new JLabel();
    private JLabel Um;
    private JLabel Un;
    private JLabel Uo;
    private JLabel Up;
    private JLabel Uq;
    private JLabel uF;
    private JLabel MQ;
    private JLabel Ur;
    private JSlider Us;
    private JPanel vd;
    private JCheckBox Qt;

    public JanelaEdicaoJogador() {
        if (UtilitariosTexto.da().wM()) {
            this.ug.setText("Adicionar Jogador");
            this.Ud = true;
        } else {
            this.ug.setText("Editar Jogador");
            this.Ud = false;
            this.Ul.setVisible(false);
        }
        this.mJ();
        this.mY();
        this.organizar();
    }

    /** Layout novo do modal: grade de duas colunas, rótulos em cima, ações no rodapé. */
    private void organizar() {
        javax.swing.JPanel idade = new javax.swing.JPanel(new java.awt.BorderLayout(14, 0));
        idade.setOpaque(false);
        idade.add((java.awt.Component)this.Us, "Center");
        this.Up.setFont(components.TemaBetfoot.display(26.0f));
        this.Up.setForeground(components.TemaBetfoot.VERDE);
        this.Up.putClientProperty("tema.ok", Boolean.TRUE);
        this.Up.setPreferredSize(new Dimension(44, 30));
        idade.add((java.awt.Component)this.Up, "East");
        javax.swing.JPanel destaques = new javax.swing.JPanel(new java.awt.FlowLayout(0, 0, 0));
        destaques.setOpaque(false);
        destaques.add(this.Qs);
        destaques.add(javax.swing.Box.createHorizontalStrut(24));
        destaques.add(this.Qt);
        this.Qs.setToolTipText("Jogador estrela do time");
        this.Qt.setToolTipText("Entre os melhores do mundo");
        this.uf.setColumns(24);
        components.TemaBetfoot.Formulario f = new components.TemaBetfoot.Formulario();
        f.campo(this.uF, "Nome", this.uf);
        f.par(this.Ur, "Posi\u00e7\u00e3o", this.Nq, this.Uq, "Lado", this.Qx);
        f.par(this.MQ, "Pa\u00eds", this.ue, this.Uo, "Idade", idade);
        f.par(this.Um, "Caracter\u00edstica 1", this.Qv, this.Un, "Caracter\u00edstica 2", this.Qw);
        f.livre(destaques);
        this.Ul.setText("Continuar adicionando");
        this.Ul.setToolTipText("Depois de salvar, abre de novo para cadastrar o pr\u00f3ximo");
        f.montar(this, this.ug, this.Ud ? "Cadastre um jogador no elenco" : "Ajuste os dados do jogador", this.uC, this.Ul, this.uC, this.Fu);
    }

    private void mY() {
        this.a((JComponent)this);
        this.a(this.uf);
        this.a(this.Nq);
        this.a(this.Qx);
        this.a(this.ue);
        this.a(this.Qv);
        this.a(this.Qw);
        this.a(this.Us);
        this.a(this.Qs);
        this.a(this.Qt);
        this.a(this.Ul);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "st");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(27, 0), "esc");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("st", new AcaoConfirmarJogador(this));
        jComponent.getActionMap().put("esc", new AcaoCancelarJogador(this));
    }

    private void mJ() {
        this.vd = new JPanel();
        this.uF = new JLabel();
        this.uf = new JTextField();
        this.Ur = new JLabel();
        this.ue = new JComboBox();
        this.Uq = new JLabel();
        this.Qx = new JComboBox();
        this.MQ = new JLabel();
        this.Nq = new JComboBox();
        this.Um = new JLabel();
        this.Qv = new JComboBox();
        this.Un = new JLabel();
        this.Qw = new JComboBox();
        this.Uo = new JLabel();
        this.Us = new JSlider();
        this.Up = new JLabel();
        this.Fu = new JButton();
        this.uC = new JButton();
        this.Qs = new JCheckBox();
        this.Qt = new JCheckBox();
        this.Qt.setBackground(new Color(51, 153, 0));
        this.Qt.setForeground(new Color(255, 255, 255));
        this.Qt.setText("Top Mundial");
        this.setBackground(new Color(51, 102, 0));
        this.vd.setBackground(new Color(51, 153, 0));
        this.ug.setFont(new Font("Tahoma", 1, 14));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setHorizontalAlignment(0);
        this.uF.setForeground(new Color(255, 255, 255));
        this.uF.setHorizontalAlignment(4);
        this.uF.setText("Nome:");
        this.Ur.setForeground(new Color(255, 255, 255));
        this.Ur.setHorizontalAlignment(4);
        this.Ur.setText("Posi\u00e7\u00e3o:");
        this.Uq.setForeground(new Color(255, 255, 255));
        this.Uq.setHorizontalAlignment(4);
        this.Uq.setText("Lado:");
        this.MQ.setForeground(new Color(255, 255, 255));
        this.MQ.setHorizontalAlignment(4);
        this.MQ.setText("Pais:");
        this.Um.setForeground(new Color(255, 255, 255));
        this.Um.setHorizontalAlignment(4);
        this.Um.setText("Caract:");
        this.Un.setForeground(new Color(255, 255, 255));
        this.Un.setHorizontalAlignment(4);
        this.Un.setText("Caract:");
        this.Uo.setForeground(new Color(255, 255, 255));
        this.Uo.setHorizontalAlignment(4);
        this.Uo.setText("Idade:");
        this.Up.setForeground(new Color(255, 255, 255));
        this.Up.setHorizontalAlignment(2);
        this.Up.setText("25");
        this.Fu.setText("OK");
        this.uC.setText("Cancelar");
        this.Qs.setBackground(new Color(51, 153, 0));
        this.Qs.setForeground(new Color(255, 255, 255));
        this.Qs.setText("Estrela");
        this.Ul.setBackground(new Color(51, 153, 0));
        this.Ul.setForeground(new Color(255, 255, 153));
        this.Ul.setText("Continuar adicionando");
        GroupLayout groupLayout = new GroupLayout(this.vd);
        this.vd.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(119, 119, 119).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Qs, -2, 91, -2).addComponent(this.Fu, -2, 92, -2)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.uC, -2, 91, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Ul)).addComponent(this.Qt, -2, 121, -2))).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ug, -2, 448, -2).addGroup(groupLayout.createSequentialGroup().addComponent(this.Uo, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Us, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Up, -2, 41, -2))))).addContainerGap(-1, Short.MAX_VALUE)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout.createSequentialGroup().addComponent(this.Ur, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Nq, -2, 98, -2).addGap(23, 23, 23).addComponent(this.Uq, -2, 71, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Qx, 0, -1, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addComponent(this.MQ, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ue, -2, 123, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.uF, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.uf, -2, 302, -2))).addGroup(groupLayout.createSequentialGroup().addGap(13, 13, 13).addComponent(this.Um, -2, 87, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Qv, -2, 96, -2).addGap(18, 18, 18).addComponent(this.Un, -2, 71, -2).addGap(18, 18, 18).addComponent(this.Qw, -2, 96, -2))).addContainerGap(46, Short.MAX_VALUE))));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addComponent(this.ug).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Uo, GroupLayout.Alignment.TRAILING).addComponent(this.Us, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.Up, GroupLayout.Alignment.TRAILING)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Qs).addComponent(this.Qt)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Fu).addComponent(this.uC).addComponent(this.Ul)).addGap(26, 26, 26)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(47, 47, 47).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.uf, -2, -1, -2).addComponent(this.uF)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Ur).addComponent(this.Uq).addComponent(this.Qx, -2, -1, -2).addComponent(this.Nq, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ue, -2, -1, -2).addComponent(this.MQ)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Um).addComponent(this.Qv, -2, -1, -2).addComponent(this.Un).addComponent(this.Qw, -2, -1, -2)).addContainerGap(144, Short.MAX_VALUE))));
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.vd, -2, -1, -2).addContainerGap(12, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.vd, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.mK();
        this.mH();
    }

    public void mK() {
        if (this.Ud) {
            this.Ul.setSelected(UtilitariosTexto.da().wR());
            this.Ul.addItemListener(new ListenerContinuarAdicionando(this));
        }
        this.Qv.setMaximumRowCount(10);
        this.Qw.setMaximumRowCount(10);
        int n2 = 0;
        while (n2 < EnumPaises.jz()) {
            this.ue.addItem(((DadosPais)UtilitariosTexto.cY().get(n2)).getNome());
            ++n2;
        }
        RenderizadorTextoLista a_02 = new RenderizadorTextoLista();
        a_02.setPreferredSize(new Dimension(10, 25));
        this.ue.setRenderer(a_02);
        this.ue.setMaximumRowCount(10);
        if (!this.Ud) {
            this.ue.setSelectedIndex(UtilitariosTexto.G(this.Ub.getPais()));
        } else {
            this.ue.setSelectedIndex(UtilitariosTexto.G(UtilitariosTexto.da().wI().getPais()));
        }
        int n3 = 0;
        while (n3 < ConstantesJogo.rH.length) {
            this.Nq.addItem(ConstantesJogo.rH[n3]);
            ++n3;
        }
        if (!this.Ud) {
            this.Nq.setSelectedIndex(this.Ub.getPosicao());
        } else {
            this.Nq.setSelectedIndex(Uk);
        }
        this.Nq.addActionListener(new ListenerComboPosicaoJogador(this));
        n3 = 0;
        while (n3 < ConstantesJogo.rK.length) {
            this.Qx.addItem(ConstantesJogo.rK[n3]);
            ++n3;
        }
        if (!this.Ud) {
            this.Qx.setSelectedIndex(this.Ub.getLado());
        }
        if (this.Nq.getSelectedIndex() == 0) {
            n3 = 0;
            while (n3 <= 3) {
                this.Qv.addItem(ConstantesJogo.qM[n3]);
                this.Qw.addItem(ConstantesJogo.qM[n3]);
                ++n3;
            }
            if (!this.Ud) {
                this.Qv.setSelectedIndex(this.Ub.getCr1());
                this.Qw.setSelectedIndex(this.Ub.getCr2());
            }
        } else {
            n3 = 4;
            while (n3 < ConstantesJogo.qM.length) {
                this.Qv.addItem(ConstantesJogo.qM[n3]);
                this.Qw.addItem(ConstantesJogo.qM[n3]);
                ++n3;
            }
            if (!this.Ud) {
                this.Qv.setSelectedIndex(this.Ub.getCr1() - 4);
                this.Qw.setSelectedIndex(this.Ub.getCr2() - 4);
            }
        }
        if (this.Ud) {
            int[] nArray = ModeloJogador.at(this.Nq.getSelectedIndex());
            if (this.Nq.getSelectedIndex() == 0) {
                this.Qv.setSelectedIndex(nArray[0]);
                this.Qw.setSelectedIndex(nArray[1]);
            } else {
                this.Qv.setSelectedIndex(nArray[0] - 4);
                this.Qw.setSelectedIndex(nArray[1] - 4);
            }
        }
        if (!this.Ud) {
            this.Us.setValue(this.Ub.getIdade());
        } else {
            this.Us.setValue(20);
        }
        if (this.Uc) {
            this.Us.setMinimum(16);
            this.Us.setMaximum(48);
        } else {
            this.Us.setMinimum(16);
            this.Us.setMaximum(20);
        }
        this.Us.addChangeListener(new ListenerSliderCaracteristica(this));
        this.Up.setText(Integer.toString(this.Us.getValue()));
        if (!this.Ud) {
            this.uf.setText(this.Ub.getNome());
        } else {
            this.uf.setText("");
        }
        if (!this.Ud) {
            this.Qs.setSelected(this.Ub.isEstrela());
        } else {
            this.Qs.setSelected(false);
        }
        if (!this.Ud) {
            this.Qt.setSelected(this.Ub.isTopMundial());
        } else {
            this.Qt.setSelected(false);
        }
    }

    public void wk() {
        boolean bl = false;
        if (this.uf.getText().toString().equals("")) {
            this.Ue.add(Uf);
        } else if (this.uf.getText().toString().length() < 2) {
            this.Ue.add(Ug);
        } else if (this.uf.getText().toString().length() > 30) {
            this.Ue.add(Uh);
        } else if (!this.uf.getText().toString().equals(this.Ub.getNome())) {
            bl = true;
            this.Ub.setNome(this.uf.getText().toString());
        }
        if (this.Nq.getSelectedIndex() != this.Ub.getPosicao()) {
            this.Ub.setPosicao(this.Nq.getSelectedIndex());
            bl = true;
        }
        int n2 = 0;
        if (this.Nq.getSelectedIndex() != 0) {
            n2 = 4;
        }
        if (this.Qv.getSelectedIndex() + n2 != this.Ub.getCr1()) {
            this.Ub.setCr1(this.Qv.getSelectedIndex() + n2);
            bl = true;
        }
        if (this.Qw.getSelectedIndex() + n2 != this.Ub.getCr2()) {
            this.Ub.setCr2(this.Qw.getSelectedIndex() + n2);
            bl = true;
        }
        if (this.Us.getValue() != this.Ub.getIdade()) {
            this.Ub.setIdade(this.Us.getValue());
            bl = true;
        }
        if (this.Qs.isSelected() != this.Ub.isEstrela()) {
            this.Ub.setEstrela(this.Qs.isSelected());
            bl = true;
        }
        if (this.Qt.isSelected() != this.Ub.isTopMundial()) {
            if (this.Qt.isSelected() && UtilitariosTexto.da().wI().getReputacao() < 4) {
                this.Ue.add(Uj);
            } else {
                this.Ub.setTopMundial(this.Qt.isSelected());
                bl = true;
            }
        }
        if (this.ue.getSelectedIndex() != UtilitariosTexto.G(this.Ub.getPais())) {
            this.Ub.setPais(UtilitariosTexto.H(this.ue.getSelectedIndex()));
            bl = true;
        }
        if (this.Qx.getSelectedIndex() != this.Ub.getLado()) {
            this.Ub.setLado(this.Qx.getSelectedIndex());
            bl = true;
        }
        if (bl) {
            UtilitariosTexto.da().wo();
        }
    }

    private void wl() {
        // Edição de jogador existente: confirma antes de gravar.
        if (!UtilitariosTexto.da().wM() && !components.TemaBetfoot.confirmar(UtilitariosTexto.da().Uw, "Salvar altera\u00e7\u00f5es", "Salvar as altera\u00e7\u00f5es em " + this.uf.getText() + "?", "Salvar", false)) {
            return;
        }
        this.Ue.clear();
        if (!this.Ud) {
            this.wk();
        } else {
            this.wn();
        }
        if (this.Ue.size() == 0) {
            if (!this.Ud) {
                UtilitariosTexto.da().Uw.dispose();
            } else if (this.Ul.isSelected()) {
                if (this.Uc) {
                    UtilitariosTexto.da().Uw.dispose();
                    if (UtilitariosTexto.da().wI().getJogadores().size() < 30) {
                        UtilitariosTexto.da().wp();
                    }
                } else {
                    UtilitariosTexto.da().Uw.dispose();
                    if (UtilitariosTexto.da().wI().getJuniores().size() < 15) {
                        UtilitariosTexto.da().wp();
                    }
                }
            } else {
                UtilitariosTexto.da().Uw.dispose();
            }
        } else {
            components.TemaBetfoot.aviso(UtilitariosTexto.da().Uw, "Confira os dados", String.valueOf(this.Ue.get(0)));
        }
    }

    public void mH() {
        this.Fu.addActionListener(new ListenerBotaoConfirmarJogador(this));
        this.uC.addActionListener(new ListenerBotaoCancelarJogador(this));
    }

    private void wm() {
        UtilitariosTexto.da().Uw.dispose();
    }

    public void wn() {
        boolean bl = true;
        if (this.uf.getText().toString().equals("")) {
            bl = false;
            this.Ue.add(Uf);
        } else if (this.uf.getText().toString().length() < 2) {
            bl = false;
            this.Ue.add(Ug);
        } else if (this.uf.getText().toString().length() > 30) {
            bl = false;
            this.Ue.add(Uh);
        } else if (this.Qt.isSelected() && UtilitariosTexto.da().wI().getReputacao() < 4) {
            this.Ue.add(Uj);
            bl = false;
        }
        if (bl) {
            ModeloJogador2 g2 = new ModeloJogador2();
            g2.setNome(this.uf.getText().toString());
            g2.setIdade(this.Us.getValue());
            g2.setEstrela(this.Qs.isSelected());
            g2.setPais(UtilitariosTexto.H(this.ue.getSelectedIndex()));
            g2.setPosicao(this.Nq.getSelectedIndex());
            g2.setStatus(0);
            if (g2.getPosicao() == 0) {
                g2.setCr1(this.Qv.getSelectedIndex());
                g2.setCr2(this.Qw.getSelectedIndex());
            } else {
                g2.setCr1(this.Qv.getSelectedIndex() + 4);
                g2.setCr2(this.Qw.getSelectedIndex() + 4);
            }
            g2.setLado(this.Qx.getSelectedIndex());
            g2.setHash(new Random().nextInt(10) + 1);
            if (this.Uc) {
                if (UtilitariosTexto.da().wI().getJogadores().size() < 30) {
                    UtilitariosTexto.da().wI().getJogadores().add(g2);
                    ((ModeloTabelaJogadores)UtilitariosTexto.da().wJ().getModel()).i(3, true);
                    UtilitariosTexto.da().wG();
                } else {
                    this.Ue.add(Ui);
                }
            } else if (UtilitariosTexto.da().wI().getJuniores().size() < 15) {
                UtilitariosTexto.da().wI().getJuniores().add(g2);
                ((ModeloTabelaJogadores)UtilitariosTexto.da().wJ().getModel()).i(3, true);
                UtilitariosTexto.da().wG();
            } else {
                this.Ue.add(Ui);
            }
            UtilitariosTexto.da().wo();
        }
    }

    static /* synthetic */ void a(JanelaEdicaoJogador f_02) {
        f_02.wl();
    }

    static /* synthetic */ void b(JanelaEdicaoJogador f_02) {
        f_02.wm();
    }

    static /* synthetic */ JCheckBox c(JanelaEdicaoJogador f_02) {
        return f_02.Ul;
    }

    static /* synthetic */ JComboBox d(JanelaEdicaoJogador f_02) {
        return f_02.Qv;
    }

    static /* synthetic */ JComboBox e(JanelaEdicaoJogador f_02) {
        return f_02.Qw;
    }

    static /* synthetic */ JComboBox f(JanelaEdicaoJogador f_02) {
        return f_02.Nq;
    }

    static /* synthetic */ void eH(int n2) {
        Uk = n2;
    }

    static /* synthetic */ JLabel g(JanelaEdicaoJogador f_02) {
        return f_02.Up;
    }

    static /* synthetic */ JSlider h(JanelaEdicaoJogador f_02) {
        return f_02.Us;
    }
}

