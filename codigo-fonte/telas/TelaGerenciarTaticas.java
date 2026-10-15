package telas;

import telas.TelaEscalacao;
import telas.ListenerSalvarTatica;
import telas.ListenerCarregarTatica;
import telas.ListenerApagarTatica;
import nucleo.ModeloTime;
import components.TaticaSalva;
import components.GeradorIconeJogador;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class TelaGerenciarTaticas
extends JPanel {
    private JDialog ub;
    private ModeloTime zu;
    private TelaEscalacao AG;
    private JButton vb;
    private JButton vc;
    private JButton GP;
    private JComboBox Bf;
    private JLabel ug;
    private JLabel uh;
    private JLabel a_;
    private JTextField Ej;

    public TelaGerenciarTaticas(TelaEscalacao bz2, JDialog jDialog, ModeloTime ah2) {
        this.zu = ah2;
        this.ub = jDialog;
        this.AG = bz2;
        this.mJ();
        this.mH();
        this.su();
    }

    public void su() {
        int n2 = 0;
        while (n2 < this.zu.kV().size()) {
            int[] nArray = new int[3];
            nArray[0] = -1;
            int[] nArray2 = nArray;
            int n3 = 0;
            while (n3 < ((TaticaSalva)this.zu.kV().get(n2)).uI().size()) {
                if ((Integer)((TaticaSalva)this.zu.kV().get(n2)).uI().get(n3) <= 9) {
                    nArray2[0] = nArray2[0] + 1;
                } else if ((Integer)((TaticaSalva)this.zu.kV().get(n2)).uI().get(n3) <= 17) {
                    nArray2[1] = nArray2[1] + 1;
                } else if ((Integer)((TaticaSalva)this.zu.kV().get(n2)).uI().get(n3) <= 25) {
                    nArray2[2] = nArray2[2] + 1;
                }
                ++n3;
            }
            this.Bf.addItem(String.valueOf(((TaticaSalva)this.zu.kV().get(n2)).getNome()) + " (" + Integer.toString(nArray2[0]) + "-" + Integer.toString(nArray2[1]) + "-" + Integer.toString(nArray2[2]) + ")");
            ++n2;
        }
    }

    public void mH() {
        this.GP.addActionListener(new ListenerSalvarTatica(this));
        this.vb.addActionListener(new ListenerCarregarTatica(this));
        this.vc.addActionListener(new ListenerApagarTatica(this));
    }

    private void sv() {
        if (this.Bf.getItemCount() > 0) {
            int n2 = this.Bf.getSelectedIndex();
            TaticaSalva ag2 = (TaticaSalva)this.zu.kV().get(n2);
            this.zu.kV().remove(ag2);
            this.Bf.removeAllItems();
            this.su();
        }
    }

    private void sw() {
        if (this.Bf.getItemCount() > 0) {
            int n2 = this.Bf.getSelectedIndex();
            TaticaSalva ag2 = (TaticaSalva)this.zu.kV().get(n2);
            if (ag2 != null) {
                this.AG.a(ag2, true);
                this.ub.dispose();
            }
        }
    }

    private void sx() {
        if (!this.Ej.getText().isEmpty()) {
            TaticaSalva ag2 = new TaticaSalva();
            int[] nArray = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            int n2 = 0;
            while (n2 < 37) {
                if (((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x() != null) {
                    ag2.uH().add(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x());
                    ag2.uI().add(n2);
                } else if (((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).vf() != null) {
                    ag2.uH().add(null);
                    ag2.uI().add(n2);
                }
                ++n2;
            }
            int[] nArray2 = new int[3];
            nArray2[0] = -1;
            int[] nArray3 = nArray2;
            int n3 = 0;
            int n4 = 0;
            while (n4 < ag2.uI().size()) {
                if (n3 < nArray.length) {
                    nArray[n3] = (Integer)ag2.uI().get(n4);
                    ++n3;
                }
                if ((Integer)ag2.uI().get(n4) <= 9) {
                    nArray3[0] = nArray3[0] + 1;
                } else if ((Integer)ag2.uI().get(n4) <= 17) {
                    nArray3[1] = nArray3[1] + 1;
                } else if ((Integer)ag2.uI().get(n4) <= 25) {
                    nArray3[2] = nArray3[2] + 1;
                }
                ++n4;
            }
            int[] nArray4 = new int[]{1, 2, 6, 8, 9, 11, 13, 14, 15, 16, 23};
            int[] nArray5 = new int[]{1, 2, 6, 8, 9, 10, 11, 13, 15, 17, 20};
            String string = String.valueOf(Integer.toString(nArray3[0])) + "-" + Integer.toString(nArray3[1]) + "-" + Integer.toString(nArray3[2]);
            if (Arrays.equals(nArray4, nArray)) {
                string = "4-2-3-1";
            } else if (Arrays.equals(nArray5, nArray)) {
                string = "4-2-3-1 Alas";
            }
            ag2.setNome(this.Ej.getText().toString());
            this.Bf.addItem(String.valueOf(this.Ej.getText().toString()) + " (" + string + ")");
            this.zu.kV().add(ag2);
        }
    }

    private void mJ() {
        this.ug = new JLabel();
        this.Bf = new JComboBox();
        this.vb = new JButton();
        this.vc = new JButton();
        this.uh = new JLabel();
        this.a_ = new JLabel();
        this.Ej = new JTextField();
        this.GP = new JButton();
        this.setBackground(new Color(104, 120, 100));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setText("T\u00e1ticas salvas:");
        this.vb.setIcon(new ImageIcon(this.getClass().getResource("/aicons/loadt.png")));
        this.vb.setText("Carregar");
        this.vc.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icondel.png")));
        this.vc.setText("Apagar");
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setText("Salvar t\u00e1tica atual");
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setText("Nome:");
        this.GP.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconadd.png")));
        this.GP.setText("salvar");
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(29, 29, 29).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.ug, -2, 160, -2).addGroup(groupLayout.createSequentialGroup().addComponent(this.vb, -2, 117, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.vc, -2, 117, -2)).addComponent(this.Bf, GroupLayout.Alignment.TRAILING, -2, 256, -2).addGroup(groupLayout.createSequentialGroup().addComponent(this.a_, -2, 42, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Ej)).addComponent(this.uh, -2, 247, -2)).addComponent(this.GP, -2, 103, -2)).addContainerGap(30, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.ug).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Bf, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.vb, -1, -1, Short.MAX_VALUE).addComponent(this.vc, -1, -1, Short.MAX_VALUE)).addGap(23, 23, 23).addComponent(this.uh).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a_).addComponent(this.Ej, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.GP).addContainerGap(21, Short.MAX_VALUE)));
    }

    static /* synthetic */ void a(TelaGerenciarTaticas il_02) {
        il_02.sx();
    }

    static /* synthetic */ void b(TelaGerenciarTaticas il_02) {
        il_02.sw();
    }

    static /* synthetic */ void c(TelaGerenciarTaticas il_02) {
        il_02.sv();
    }
}

