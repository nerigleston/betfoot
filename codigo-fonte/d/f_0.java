package d;

import best.F;
import best.ac;
import best.ad;
import best.aq;
import best.n_0;
import d.a_0;
import d.ap;
import d.g_0;
import d.h_0;
import d.i_0;
import d.j_0;
import d.k_0;
import d.l_0;
import d.m_0;
import e.g;
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

public class f_0
extends JPanel {
    private g Ub = n_0.da().wL();
    private boolean Uc = n_0.da().wK();
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

    public f_0() {
        if (n_0.da().wM()) {
            this.ug.setText("Adicionar Jogador");
            this.Ud = true;
        } else {
            this.ug.setText("Editar Jogador");
            this.Ud = false;
            this.Ul.setVisible(false);
        }
        this.mJ();
        this.mY();
    }

    private void mY() {
        this.a(this);
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
        jComponent.getActionMap().put("st", new g_0(this));
        jComponent.getActionMap().put("esc", new h_0(this));
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
            this.Ul.setSelected(n_0.da().wR());
            this.Ul.addItemListener(new i_0(this));
        }
        this.Qv.setMaximumRowCount(10);
        this.Qw.setMaximumRowCount(10);
        int n2 = 0;
        while (n2 < ac.jz()) {
            this.ue.addItem(((ad)n_0.cY().get(n2)).getNome());
            ++n2;
        }
        a_0 a_02 = new a_0();
        a_02.setPreferredSize(new Dimension(10, 25));
        this.ue.setRenderer(a_02);
        this.ue.setMaximumRowCount(10);
        if (!this.Ud) {
            this.ue.setSelectedIndex(n_0.G(this.Ub.getPais()));
        } else {
            this.ue.setSelectedIndex(n_0.G(n_0.da().wI().getPais()));
        }
        int n3 = 0;
        while (n3 < aq.rH.length) {
            this.Nq.addItem(aq.rH[n3]);
            ++n3;
        }
        if (!this.Ud) {
            this.Nq.setSelectedIndex(this.Ub.getPosicao());
        } else {
            this.Nq.setSelectedIndex(Uk);
        }
        this.Nq.addActionListener(new j_0(this));
        n3 = 0;
        while (n3 < aq.rK.length) {
            this.Qx.addItem(aq.rK[n3]);
            ++n3;
        }
        if (!this.Ud) {
            this.Qx.setSelectedIndex(this.Ub.getLado());
        }
        if (this.Nq.getSelectedIndex() == 0) {
            n3 = 0;
            while (n3 <= 3) {
                this.Qv.addItem(aq.qM[n3]);
                this.Qw.addItem(aq.qM[n3]);
                ++n3;
            }
            if (!this.Ud) {
                this.Qv.setSelectedIndex(this.Ub.getCr1());
                this.Qw.setSelectedIndex(this.Ub.getCr2());
            }
        } else {
            n3 = 4;
            while (n3 < aq.qM.length) {
                this.Qv.addItem(aq.qM[n3]);
                this.Qw.addItem(aq.qM[n3]);
                ++n3;
            }
            if (!this.Ud) {
                this.Qv.setSelectedIndex(this.Ub.getCr1() - 4);
                this.Qw.setSelectedIndex(this.Ub.getCr2() - 4);
            }
        }
        if (this.Ud) {
            int[] nArray = F.at(this.Nq.getSelectedIndex());
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
        this.Us.addChangeListener(new k_0(this));
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
            if (this.Qt.isSelected() && n_0.da().wI().getReputacao() < 4) {
                this.Ue.add(Uj);
            } else {
                this.Ub.setTopMundial(this.Qt.isSelected());
                bl = true;
            }
        }
        if (this.ue.getSelectedIndex() != n_0.G(this.Ub.getPais())) {
            this.Ub.setPais(n_0.H(this.ue.getSelectedIndex()));
            bl = true;
        }
        if (this.Qx.getSelectedIndex() != this.Ub.getLado()) {
            this.Ub.setLado(this.Qx.getSelectedIndex());
            bl = true;
        }
        if (bl) {
            n_0.da().wo();
        }
    }

    private void wl() {
        this.Ue.clear();
        if (!this.Ud) {
            this.wk();
        } else {
            this.wn();
        }
        if (this.Ue.size() == 0) {
            if (!this.Ud) {
                n_0.da().Uw.dispose();
            } else if (this.Ul.isSelected()) {
                if (this.Uc) {
                    n_0.da().Uw.dispose();
                    if (n_0.da().wI().getJogadores().size() < 30) {
                        n_0.da().wp();
                    }
                } else {
                    n_0.da().Uw.dispose();
                    if (n_0.da().wI().getJuniores().size() < 15) {
                        n_0.da().wp();
                    }
                }
            } else {
                n_0.da().Uw.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, this.Ue.get(0), "", 0);
        }
    }

    public void mH() {
        this.Fu.addActionListener(new l_0(this));
        this.uC.addActionListener(new m_0(this));
    }

    private void wm() {
        n_0.da().Uw.dispose();
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
        } else if (this.Qt.isSelected() && n_0.da().wI().getReputacao() < 4) {
            this.Ue.add(Uj);
            bl = false;
        }
        if (bl) {
            g g2 = new g();
            g2.setNome(this.uf.getText().toString());
            g2.setIdade(this.Us.getValue());
            g2.setEstrela(this.Qs.isSelected());
            g2.setPais(n_0.H(this.ue.getSelectedIndex()));
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
                if (n_0.da().wI().getJogadores().size() < 30) {
                    n_0.da().wI().getJogadores().add(g2);
                    ((ap)n_0.da().wJ().getModel()).i(3, true);
                    n_0.da().wG();
                } else {
                    this.Ue.add(Ui);
                }
            } else if (n_0.da().wI().getJuniores().size() < 15) {
                n_0.da().wI().getJuniores().add(g2);
                ((ap)n_0.da().wJ().getModel()).i(3, true);
                n_0.da().wG();
            } else {
                this.Ue.add(Ui);
            }
            n_0.da().wo();
        }
    }

    static /* synthetic */ void a(f_0 f_02) {
        f_02.wl();
    }

    static /* synthetic */ void b(f_0 f_02) {
        f_02.wm();
    }

    static /* synthetic */ JCheckBox c(f_0 f_02) {
        return f_02.Ul;
    }

    static /* synthetic */ JComboBox d(f_0 f_02) {
        return f_02.Qv;
    }

    static /* synthetic */ JComboBox e(f_0 f_02) {
        return f_02.Qw;
    }

    static /* synthetic */ JComboBox f(f_0 f_02) {
        return f_02.Nq;
    }

    static /* synthetic */ void eH(int n2) {
        Uk = n2;
    }

    static /* synthetic */ JLabel g(f_0 f_02) {
        return f_02.Up;
    }

    static /* synthetic */ JSlider h(f_0 f_02) {
        return f_02.Us;
    }
}

