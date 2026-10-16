package telas;

import static motor.GerenciadorJogo.SR;

import telas.PainelConfigDivisaoEstadual;
import telas.OuvinteAlterarGrupoPadraoEstadual;
import telas.OuvinteResetarConfigEstadual;
import nucleo.ConstantesJogo;
import nucleo.CarregadorConfigEstadual;
import components.TemaBetfoot;
import javax.swing.JScrollPane;
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
        this.montar(n2);
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

    /** Modal no tema: escudo do estado e título, grupos reais, as 4 divisões com rolagem, Voltar/Salvar. */
    private void montar(int estado) {
        this.removeAll();
        this.setLayout(new java.awt.BorderLayout(0, 18));
        this.setOpaque(false);
        javax.swing.Icon escudo = null;
        java.net.URL url = this.getClass().getResource("/aesticons/" + estado + ".png");
        if (url != null) {
            ImageIcon imageIcon = new ImageIcon(url);
            escudo = new TemaBetfoot.IconeEscalado(imageIcon, Math.round(28.0f * imageIcon.getIconWidth() / Math.max(1, imageIcon.getIconHeight())), 28, 0);
        }
        JButton voltar = TemaBetfoot.botao(new JButton(), TemaBetfoot.Estilo.FANTASMA, "Voltar", TemaBetfoot.Simbolo.VOLTAR);
        voltar.setToolTipText("Fechar sem salvar (Esc)");
        voltar.addActionListener(actionEvent -> this.ub.dispose());
        JPanel topo = new JPanel(new java.awt.BorderLayout(0, 12));
        topo.setOpaque(false);
        topo.add((Component)TemaBetfoot.topoModal(escudo, "Campeonato " + ConstantesJogo.rZ[estado], this.gF + " times  \u00b7  formato de cada divis\u00e3o", voltar), "North");
        JPanel grupos = new JPanel(new java.awt.BorderLayout());
        grupos.setOpaque(false);
        this.CS.setToolTipText("Quando o estadual tem grupos, usa a divis\u00e3o real dos grupos");
        grupos.add((Component)this.CS, "West");
        TemaBetfoot.aplicarTema(grupos);
        topo.add((Component)grupos, "South");
        this.add((Component)topo, "North");
        JPanel divisoes = new JPanel();
        divisoes.setOpaque(false);
        divisoes.setLayout(new javax.swing.BoxLayout(divisoes, 1));
        PainelConfigDivisaoEstadual[] paineis = new PainelConfigDivisaoEstadual[]{this.CT, this.CU, this.CV, this.CW};
        for (int i = 0; i < paineis.length; ++i) {
            if (i > 0) {
                divisoes.add(javax.swing.Box.createVerticalStrut(14));
            }
            divisoes.add(paineis[i]);
        }
        JScrollPane rolagem = new JScrollPane(divisoes);
        TemaBetfoot.rolagem(rolagem);
        rolagem.getViewport().setOpaque(false);
        rolagem.setOpaque(false);
        rolagem.getVerticalScrollBar().setUnitIncrement(24);
        java.awt.Rectangle tela = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        java.awt.Dimension conteudo = divisoes.getPreferredSize();
        rolagem.setPreferredSize(new java.awt.Dimension(Math.max(700, conteudo.width + 16), Math.min(conteudo.height + 4, (int)(tela.height * 0.8) - 220)));
        this.add((Component)rolagem, "Center");
        TemaBetfoot.botao(this.vb, TemaBetfoot.Estilo.PRIMARIO, "Salvar", null);
        this.add((Component)TemaBetfoot.rodapeModal(null, voltar, this.vb), "South");
    }

    private void mJ() {
        this.vf = new JLabel();
        this.BH = new JLabel();
        this.BI = new JLabel();
        this.BJ = new JLabel();
        this.BK = new JLabel();
        this.vb = new JButton();
        this.vc = new JButton();
        this.CS = new JCheckBox("Usar grupos reais quando poss\u00edvel");
        this.CW = new PainelConfigDivisaoEstadual(4, this);
        this.CT = new PainelConfigDivisaoEstadual(1, this);
        this.CU = new PainelConfigDivisaoEstadual(2, this);
        this.CV = new PainelConfigDivisaoEstadual(3, this);
    }

    static /* synthetic */ JCheckBox a(DialogoConfigCampeonatosEstaduais cw_02) {
        return cw_02.CS;
    }
}

