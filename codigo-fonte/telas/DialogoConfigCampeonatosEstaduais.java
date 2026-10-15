package telas;

import static motor.GerenciadorJogo.SR;

import telas.PainelConfigDivisaoEstadual;
import telas.OuvinteAlterarGrupoPadraoEstadual;
import telas.OuvinteResetarConfigEstadual;
import nucleo.ConstantesJogo;
import nucleo.CarregadorConfigEstadual;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import est.ConfigEstadualType;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoConfigCampeonatosEstaduais
extends JPanel {
    private ArrayList du = new ArrayList();
    private int dr;
    private int gF;
    private ConfigEstadualType[] CP = new ConfigEstadualType[5];
    private int[] CQ = new int[5];
    private JDialog ub = null;
    private boolean CR = false;
    private JCheckBox CS;
    private JButton vb;
    private JButton vc;
    private JLabel BH;
    private JLabel BI;
    private JLabel BJ;
    private JLabel BK;
    private JLabel vf;
    private PainelConfigDivisaoEstadual CT;
    private PainelConfigDivisaoEstadual CU;
    private PainelConfigDivisaoEstadual CV;
    private PainelConfigDivisaoEstadual CW;

    public DialogoConfigCampeonatosEstaduais(int n2, int n3, JDialog jDialog) {
        this.dr = n2;
        this.ub = jDialog;
        this.mJ();
        this.CS.setSelected(SR.isUsaGrupoPadraoEstadual());
        this.CS.addActionListener(new OuvinteAlterarGrupoPadraoEstadual(this));
        this.vb.addActionListener(new OuvinteResetarConfigEstadual(this));
        this.vc.setVisible(false);
        this.gF = n3;
        String string = "Campeonato " + ConstantesJogo.rZ[n2] + " - " + Integer.toString(this.gF) + " times";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aesticons/" + n2 + ".png"));
        this.vf.setText(string);
        this.vf.setIcon(imageIcon);
        CarregadorConfigEstadual.ef();
        int n4 = 0;
        while (n4 < CarregadorConfigEstadual.eg().size()) {
            if (((ConfigEstadualType)CarregadorConfigEstadual.eg().get(n4)).getId() == n2) {
                this.du.add((ConfigEstadualType)CarregadorConfigEstadual.eg().get(n4));
            }
            ++n4;
        }
        n4 = 0;
        while (n4 <= 4) {
            this.CP[n4] = null;
            ++n4;
        }
        if (this.du.size() > 0) {
            n4 = 1;
            while (n4 <= 4) {
                int n5 = 0;
                while (n5 < this.du.size()) {
                    if (((ConfigEstadualType)this.du.get(n5)).getDivisao() == n4) {
                        this.CP[n4] = (ConfigEstadualType)this.du.get(n5);
                    }
                    ++n5;
                }
                ++n4;
            }
        }
        n4 = 1;
        while (n4 <= 4) {
            if (this.CP[n4] == null) {
                ConfigEstadualType configEstadualType = new ConfigEstadualType(n2, n4);
                CarregadorConfigEstadual.eg().add(configEstadualType);
                this.CP[n4] = configEstadualType;
            }
            ++n4;
        }
        this.du.clear();
        n4 = 1;
        while (n4 <= 4) {
            this.CQ[n4] = this.CP[n4].getnTimes();
            ++n4;
        }
        this.CT.a(this.CP[1]);
        this.CU.a(this.CP[2]);
        this.CV.a(this.CP[3]);
        this.CW.a(this.CP[4]);
        this.oJ();
    }

    public void oJ() {
        if (this.gF >= this.CQ[1]) {
            this.CT.db(1);
        } else {
            this.CT.db(2);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2]) {
            this.CU.db(1);
        } else {
            this.CU.db(3);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2] + this.CQ[3]) {
            this.CV.db(1);
        } else {
            this.CV.db(3);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2] + this.CQ[3] + this.CQ[4]) {
            this.CW.db(1);
        } else {
            this.CW.db(3);
        }
    }

    public void J(int n2, int n3) {
        this.CQ[n2] = n3;
    }

    public void nH() {
        this.CR = false;
        this.CT.nH();
        this.CU.nH();
        this.CV.nH();
        this.CW.nH();
        if (!this.CR) {
            CarregadorConfigEstadual.P(this.dr);
            this.ub.dispose();
        }
    }

    public void Z(boolean bl) {
        this.CR = bl;
    }

    public int getEstado() {
        return this.dr;
    }

    private void mJ() {
        this.vf = new JLabel();
        this.BH = new JLabel();
        this.BI = new JLabel();
        this.BJ = new JLabel();
        this.BK = new JLabel();
        this.vb = new JButton();
        this.vc = new JButton();
        this.CS = new JCheckBox();
        this.CW = new PainelConfigDivisaoEstadual(4, this);
        this.CT = new PainelConfigDivisaoEstadual(1, this);
        this.CU = new PainelConfigDivisaoEstadual(2, this);
        this.CV = new PainelConfigDivisaoEstadual(3, this);
        this.setBackground(new Color(226, 228, 228));
        this.setToolTipText("");
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setForeground(new Color(36, 104, 43));
        this.vf.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.vf.setText("Configurar Ligas - Brasil - 120 times");
        this.add((Component)this.vf, new RestricaoPosicaoLayout(36, 11, 380, -1));
        this.BH.setBackground(new Color(255, 255, 255));
        this.BH.setForeground(new Color(36, 104, 43));
        this.BH.setText("1\u00aa divis\u00e3o");
        this.add((Component)this.BH, new RestricaoPosicaoLayout(36, 43, -1, -1));
        this.BI.setBackground(new Color(255, 255, 255));
        this.BI.setForeground(new Color(36, 104, 43));
        this.BI.setText("2\u00aa divis\u00e3o");
        this.add((Component)this.BI, new RestricaoPosicaoLayout(40, 160, -1, -1));
        this.BJ.setBackground(new Color(255, 255, 255));
        this.BJ.setForeground(new Color(36, 104, 43));
        this.BJ.setText("3\u00aa divis\u00e3o");
        this.add((Component)this.BJ, new RestricaoPosicaoLayout(40, 290, -1, -1));
        this.BK.setBackground(new Color(255, 255, 255));
        this.BK.setForeground(new Color(36, 104, 43));
        this.BK.setText("4\u00aa divis\u00e3o");
        this.add((Component)this.BK, new RestricaoPosicaoLayout(40, 430, -1, -1));
        this.vb.setFont(new Font("Tahoma", 0, 12));
        this.vb.setText("Salvar");
        this.vb.setToolTipText("");
        this.add((Component)this.vb, new RestricaoPosicaoLayout(510, 560, 121, 30));
        this.vc.setFont(new Font("Tahoma", 0, 12));
        this.vc.setText("Resetar tudo");
        this.vc.setToolTipText("");
        this.vc.setCursor(new Cursor(12));
        this.add((Component)this.vc, new RestricaoPosicaoLayout(370, 560, 120, 30));
        this.CS.setText("Usar grupos reais se poss\u00edvel");
        this.add((Component)this.CS, new RestricaoPosicaoLayout(430, 10, 200, -1));
        this.add((Component)this.CW, new RestricaoPosicaoLayout(40, 450, 590, 90));
        this.add((Component)this.CT, new RestricaoPosicaoLayout(40, 60, 590, 90));
        this.add((Component)this.CU, new RestricaoPosicaoLayout(40, 180, 590, 90));
        this.add((Component)this.CV, new RestricaoPosicaoLayout(40, 320, 590, 90));
    }

    static /* synthetic */ JCheckBox a(DialogoConfigCampeonatosEstaduais cw_02) {
        return cw_02.CS;
    }
}

