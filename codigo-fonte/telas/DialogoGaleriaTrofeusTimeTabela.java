package telas;

import telas.OuvinteFecharDialogoTrofeusTimeTabela;
import tabelas.RenderizadorCelulaImagem;
import tabelas.ModeloTabelaGaleriaTrofeus;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.TituloConquistado;
import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import components.LinhaGaleriaTrofeus;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
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

public class DialogoGaleriaTrofeusTimeTabela
extends JPanel {
    private JDialog ub;
    private ModeloTime Em = null;
    private ArrayList En = new ArrayList();
    private int Eo = 0;
    private int Ep = 0;
    private JButton vm;
    private JScrollPane ut;
    private JLabel vf;
    private JTable Eq;

    public DialogoGaleriaTrofeusTimeTabela(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.Em = ah2;
        this.mJ();
        this.pw();
        this.px();
        this.mH();
        this.vf.setText("Galeria de Trof\u00e9us - " + ah2.getNome());
        this.vf.setIcon(ah2.kU());
        this.setBackground(ah2.kB());
        this.vf.setForeground(ah2.kC());
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
    }

    public int[] pt() {
        int[] nArray = new int[]{this.En.size(), this.Ep};
        return nArray;
    }

    private void mH() {
        this.vm.addActionListener(new OuvinteFecharDialogoTrofeusTimeTabela(this));
    }

    public static void pu() {
        GerenciadorJogo.ey(1920);
    }

    public static void pv() {
    }

    private void pw() {
        ModeloTabelaGaleriaTrofeus y_02 = new ModeloTabelaGaleriaTrofeus(this.En);
        this.Eq.setModel(y_02);
        this.Eq.setTableHeader(null);
        this.Eo = y_02.getColumnCount();
        int n2 = 0;
        while (n2 < y_02.getColumnCount()) {
            this.Eq.getColumnModel().getColumn(n2).setPreferredWidth(150);
            ++n2;
        }
        this.Eq.setAutoResizeMode(3);
        this.Eq.setRowHeight(170);
        this.Eq.setShowGrid(false);
        this.Eq.setDefaultRenderer(LinhaGaleriaTrofeus.class, new RenderizadorCelulaImagem());
        this.Eq.setAutoCreateRowSorter(false);
        this.Eq.setIntercellSpacing(new Dimension(0, 0));
        this.Eq.setCellSelectionEnabled(false);
        this.Eq.setRowSelectionAllowed(false);
        this.Eq.setFillsViewportHeight(true);
    }

    private void px() {
        this.En.clear();
        int[] nArray = new int[12];
        if (this.Em.cT().size() > 0) {
            int n2 = 0;
            while (n2 < this.Em.cT().size()) {
                if (((TituloConquistado)this.Em.cT().get(n2)).b() > 0 && ((TituloConquistado)this.Em.cT().get(n2)).b() < nArray.length) {
                    int n3 = ((TituloConquistado)this.Em.cT().get(n2)).b();
                    nArray[n3] = nArray[n3] + 1;
                }
                ++n2;
            }
            n2 = 1;
            while (n2 < nArray.length) {
                if (nArray[n2] > 0) {
                    if (n2 == 5 || n2 == 2 || n2 == 11) {
                        this.g(n2, -1, nArray[n2]);
                    } else {
                        int[] nArray2 = new int[8];
                        int n4 = 0;
                        while (n4 < this.Em.cT().size()) {
                            if (((TituloConquistado)this.Em.cT().get(n4)).b() == n2 && ((TituloConquistado)this.Em.cT().get(n4)).el() >= 0 && ((TituloConquistado)this.Em.cT().get(n4)).el() < nArray2.length) {
                                int n5 = ((TituloConquistado)this.Em.cT().get(n4)).el();
                                nArray2[n5] = nArray2[n5] + 1;
                            }
                            ++n4;
                        }
                        n4 = 0;
                        while (n4 < nArray2.length) {
                            if (nArray2[n4] > 0) {
                                this.g(n2, n4, nArray2[n4]);
                            }
                            ++n4;
                        }
                    }
                }
                ++n2;
            }
        }
        this.Eq.addNotify();
    }

    private String a(TituloConquistado ao2) {
        String[][] stringArrayArray = new String[][]{{"", ""}, {"tr_nacional", "tr_nacionalgenerico"}, {"tr_copa"}, {"tr_estadualgenerico", "tr_estadualgenerico"}, {"tr_ligacampeoes", "tr_libertadores", "tr_ligacaf", "tr_ligaafc", "tr_ligaconcacaf", "tr_ligaofc"}, {"tr_mundial"}, {"tr_ligaeuropa", "tr_sulamericana"}, {""}, {"tr_recopaeuropa", "tr_recopasulamaericana"}, {"tr_recopaeuropa", "tr_recopasulamaericana"}, {"tr_riosaopaulo", "tr_sulminas", "tr_copanordeste", "tr_copaverde", "tr_nacionalgenerico"}, {"tr_supercopa"}};
        int n2 = ao2.b();
        int n3 = ao2.el();
        String string = "";
        if (n2 == 1) {
            if (n3 == 1) {
                String string2;
                int n4 = -1;
                if (ao2.ct() >= 0) {
                    n4 = GerenciadorJogo.SR.x(ao2.ct()).getPais();
                }
                if (this.w(string2 = String.valueOf(stringArrayArray[1][0]) + "_" + EnumPaises.valueOf("P" + Integer.toString(n4)).jA())) {
                    return string2;
                }
                return stringArrayArray[1][0];
            }
            return stringArrayArray[1][1];
        }
        if (n2 == 2) {
            String string3;
            int n5 = -1;
            if (ao2.ct() >= 0) {
                n5 = GerenciadorJogo.SR.x(ao2.ct()).getPais();
            }
            if (this.w(string3 = String.valueOf(stringArrayArray[2][0]) + "_" + EnumPaises.valueOf("P" + Integer.toString(n5)).jA())) {
                return string3;
            }
            return stringArrayArray[2][0];
        }
        if (n2 == 11) {
            String string4;
            int n6 = -1;
            if (ao2.ct() >= 0) {
                n6 = GerenciadorJogo.SR.x(ao2.ct()).getPais();
            }
            if (this.w(string4 = String.valueOf(stringArrayArray[11][0]) + "_" + EnumPaises.valueOf("P" + Integer.toString(n6)).jA())) {
                return string4;
            }
            return stringArrayArray[11][0];
        }
        if (n2 == 3) {
            if (n3 == 1) {
                String string5;
                int n7 = -1;
                if (ao2.ct() >= 0) {
                    n7 = GerenciadorJogo.SR.x(ao2.ct()).getEstado();
                }
                if (this.w(string5 = "tr_estadual_" + ConstantesJogo.rX[n7])) {
                    return string5;
                }
                return stringArrayArray[3][0];
            }
            return stringArrayArray[3][1];
        }
        if (n2 == 4 || n2 == 6 || n2 == 8) {
            return stringArrayArray[n2][n3];
        }
        if (n2 == 10) {
            String string6 = stringArrayArray[n2][n3];
            if (this.w(string6)) {
                return string6;
            }
            return stringArrayArray[10][4];
        }
        return stringArrayArray[n2][0];
    }

    private boolean w(String string) {
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/trofeus/" + string + ".png");
        return file.exists() && !file.isDirectory();
    }

    private void b(TituloConquistado ao2) {
        LinhaGaleriaTrofeus aj2;
        if (this.En.size() == 0) {
            aj2 = new LinhaGaleriaTrofeus();
            this.En.add(aj2);
            this.Ep = 0;
        } else if (this.Ep >= this.Eo) {
            aj2 = new LinhaGaleriaTrofeus();
            this.En.add(aj2);
            this.Ep = 0;
        }
        int n2 = this.En.size() - 1;
        LinhaGaleriaTrofeus aj3 = (LinhaGaleriaTrofeus)this.En.get(n2);
        aj3.d(ao2.gS().getNome(), this.Ep);
        String string = String.valueOf(System.getProperty("user.dir")) + "/trofeus/" + this.a(ao2) + ".png";
        aj3.e(string, this.Ep);
        int n3 = 0;
        n3 = ao2.b() == 1 || ao2.b() == 3 ? this.L(ao2.b(), ao2.el()) : this.L(ao2.b(), -1);
        aj3.R(n3, this.Ep);
        ++this.Ep;
    }

    private int L(int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        while (n5 < this.Em.cT().size()) {
            if (n3 >= 0) {
                if (((TituloConquistado)this.Em.cT().get(n5)).ct() >= 0 && ((TituloConquistado)this.Em.cT().get(n5)).b() == n2 && ((TituloConquistado)this.Em.cT().get(n5)).el() == n3) {
                    ++n4;
                }
            } else if (((TituloConquistado)this.Em.cT().get(n5)).ct() >= 0 && ((TituloConquistado)this.Em.cT().get(n5)).b() == n2) {
                ++n4;
            }
            ++n5;
        }
        return n4;
    }

    private void g(int n2, int n3, int n4) {
        boolean bl = true;
        if (n2 == 1 || n2 == 3) {
            int[] nArray = new int[EnumPaises.jz()];
            int n5 = 0;
            while (n5 < this.Em.cT().size()) {
                if (((TituloConquistado)this.Em.cT().get(n5)).ct() >= 0 && ((TituloConquistado)this.Em.cT().get(n5)).b() == n2 && ((TituloConquistado)this.Em.cT().get(n5)).el() == n3 && bl) {
                    this.b((TituloConquistado)this.Em.cT().get(n5));
                    bl = false;
                    break;
                }
                ++n5;
            }
        } else {
            int[] nArray = new int[EnumPaises.jz()];
            int n6 = 0;
            while (n6 < this.Em.cT().size()) {
                if (((TituloConquistado)this.Em.cT().get(n6)).ct() >= 0 && ((TituloConquistado)this.Em.cT().get(n6)).b() == n2 && bl) {
                    this.b((TituloConquistado)this.Em.cT().get(n6));
                    bl = false;
                    break;
                }
                ++n6;
            }
        }
    }

    private void mJ() {
        this.vf = new JLabel();
        this.ut = new JScrollPane();
        this.Eq = new JTable();
        this.vm = new JButton();
        this.setBackground(new Color(204, 204, 204));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setText("Galeria de Trofeus");
        this.ut.setViewportView(this.Eq);
        this.vm.setText("X");
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ut, -1, 647, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addComponent(this.vf).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.vm, -2, 51, -2))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.vf).addComponent(this.vm)).addGap(18, 18, 18).addComponent(this.ut, -1, 301, Short.MAX_VALUE).addContainerGap()));
    }

    static /* synthetic */ JDialog a(DialogoGaleriaTrofeusTimeTabela de2) {
        return de2.ub;
    }
}

