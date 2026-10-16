package telas;

import telas.OuvinteAlterarSistemaDisputaDivisao;
import telas.DialogoConfigCampeonatosEstaduais;
import nucleo.ConstantesJogo;
import est.ConfigEstadualType;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelConfigDivisaoEstadual
extends JPanel {
    private int CF = 0;
    private DialogoConfigCampeonatosEstaduais CG = null;
    private ConfigEstadualType CH = null;
    private JCheckBox CI;
    private JComboBox CJ;
    private JComboBox CK;
    private JComboBox CL;
    private JComboBox CM;
    private JLabel CN;

    public PainelConfigDivisaoEstadual(int n2, DialogoConfigCampeonatosEstaduais cw_02) {
        this.CF = n2;
        this.CG = cw_02;
        this.mJ();
        this.CM.setMaximumRowCount(12);
        int n3 = 0;
        while (n3 < ConstantesJogo.sN.length) {
            this.CM.addItem(ConstantesJogo.sN[n3]);
            ++n3;
        }
        this.CM.addActionListener(new OuvinteAlterarSistemaDisputaDivisao(this));
    }

    public void nH() {
        this.CH.setFormula(this.CM.getSelectedIndex());
        if (this.CI.isSelected()) {
            this.CH.setDesempate(0);
        } else {
            this.CH.setDesempate(1);
        }
        if (this.CJ.isVisible()) {
            this.CH.setFinaisIdaVoltaComIndex(0, this.CJ.getSelectedIndex() + 1);
        }
        if (this.CK.isVisible()) {
            this.CH.setFinaisIdaVoltaComIndex(1, this.CK.getSelectedIndex() + 1);
        }
        if (this.CL.isVisible()) {
            this.CH.setFinaisIdaVoltaComIndex(2, this.CL.getSelectedIndex() + 1);
        }
    }

    public void a(ConfigEstadualType configEstadualType) {
        this.CH = configEstadualType;
        this.CM.setSelectedIndex(this.CH.getFormula());
        if (this.CH.getDesempate() == 0) {
            this.CI.setSelected(true);
        } else {
            this.CI.setSelected(false);
        }
        this.a(this.CH.getFormula(), ConstantesJogo.sL[this.CH.getFormula()][2], this.CH);
    }

    private void da(int n2) {
        this.a(n2, ConstantesJogo.sL[n2][2], null);
    }

    private void a(int n2, int n3, ConfigEstadualType configEstadualType) {
        if (7 == n2 || 10 == n2) {
            n3 = 8;
        }
        if (n3 == 2) {
            this.a(this.CJ, "f");
            this.CK.setVisible(false);
            this.CL.setVisible(false);
        } else if (n3 == 4) {
            this.a(this.CJ, "s");
            this.a(this.CK, "f");
            this.CK.setVisible(true);
            this.CL.setVisible(false);
        } else if (n3 == 8) {
            this.a(this.CJ, "q");
            this.a(this.CK, "s");
            this.a(this.CL, "f");
            this.CK.setVisible(true);
            this.CL.setVisible(true);
        }
        if (configEstadualType != null) {
            if (configEstadualType.getFinaisIdaVoltaFormatado()[0]) {
                this.CJ.setSelectedIndex(1);
            }
            if (n3 >= 4 && configEstadualType.getFinaisIdaVoltaFormatado()[1]) {
                this.CK.setSelectedIndex(1);
            }
            if (n3 == 8 && configEstadualType.getFinaisIdaVoltaFormatado()[2]) {
                this.CL.setSelectedIndex(1);
            }
        } else {
            this.CJ.setSelectedIndex(1);
            if (n3 >= 4) {
                this.CK.setSelectedIndex(1);
            }
            if (n3 == 8) {
                this.CL.setSelectedIndex(1);
            }
        }
    }

    private void a(JComboBox jComboBox, String string) {
        jComboBox.removeAllItems();
        if (string.equals("q")) {
            jComboBox.addItem("Quartas: 1 jogo");
            jComboBox.addItem("Quartas: 2 jogos");
        } else if (string.equals("s")) {
            jComboBox.addItem("Semifinal: 1 jogo");
            jComboBox.addItem("Semifinal: 2 jogos");
        } else if (string.equals("f")) {
            jComboBox.addItem("Final: 1 jogo");
            jComboBox.addItem("Final: 2 jogos");
        }
    }

    /** Situação da divisão: 1 normal, 2 faltam times para a 1ª divisão, 3 times não chegam até esta divisão. */
    private int estado = 1;
    private final JLabel aviso = new JLabel();

    public void db(int n2) {
        this.estado = n2;
        this.aviso.setVisible(n2 != 1);
        if (n2 == 2) {
            this.aviso.setText("FALTAM TIMES NO ESTADO");
            this.aviso.setForeground(components.TemaBetfoot.VERMELHO);
        } else if (n2 == 3) {
            this.aviso.setText("TIMES INSUFICIENTES");
            this.aviso.setForeground(components.TemaBetfoot.TEXTO_FRACO);
        }
        this.aviso.setToolTipText("O estado n\u00e3o tem times suficientes para esta divis\u00e3o");
        this.repaint();
    }

    @Override
    protected void paintComponent(java.awt.Graphics graphics) {
        java.awt.Graphics2D g = components.TemaBetfoot.suave(graphics);
        java.awt.geom.RoundRectangle2D.Double forma = new java.awt.geom.RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, 22.0, 22.0);
        g.setColor(this.estado == 3 ? new Color(12, 20, 16) : new Color(15, 28, 22));
        g.fill(forma);
        g.setColor(this.estado == 2 ? components.TemaBetfoot.alfa(components.TemaBetfoot.VERMELHO, 0.7) : components.TemaBetfoot.alfa(Color.WHITE, this.estado == 3 ? 0.05 : 0.1));
        g.draw(forma);
        g.dispose();
    }

    /** Rótulo em cima do campo; se o campo some, o rótulo some junto. */
    private static JPanel celula(JLabel jLabel, String string, final Component component) {
        final JPanel jPanel = new JPanel(new java.awt.BorderLayout(0, 6));
        jPanel.setOpaque(false);
        if (string != null) {
            jPanel.add((Component)components.TemaBetfoot.rotuloCampo(jLabel, string), "North");
        }
        jPanel.add(component, "Center");
        component.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent componentEvent) {
                jPanel.setVisible(true);
            }

            @Override
            public void componentHidden(java.awt.event.ComponentEvent componentEvent) {
                jPanel.setVisible(false);
            }
        });
        return jPanel;
    }

    private void mJ() {
        this.CN = new JLabel();
        this.CL = new JComboBox();
        this.CI = new JCheckBox("Desempate nos p\u00eanaltis");
        this.CM = new JComboBox();
        this.CJ = new JComboBox();
        this.CK = new JComboBox();
        this.setOpaque(false);
        this.setLayout(new java.awt.BorderLayout(0, 14));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(18, 22, 20, 22));
        JPanel topo = new JPanel(new java.awt.BorderLayout(14, 0));
        JLabel titulo = new JLabel(this.CF + "\u00aa DIVIS\u00c3O");
        titulo.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(20.0f), 0.04f));
        titulo.setForeground(components.TemaBetfoot.TEXTO);
        titulo.putClientProperty("tema.ok", Boolean.TRUE);
        topo.add((Component)titulo, "West");
        this.aviso.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(13.0f), 0.06f));
        this.aviso.putClientProperty("tema.ok", Boolean.TRUE);
        this.aviso.setVisible(false);
        topo.add((Component)this.aviso, "East");
        this.add((Component)topo, "North");
        // Sistema de disputa e desempate em cima; o formato do mata-mata (1 ou 2 jogos por fase) embaixo.
        JPanel corpo = new JPanel(new java.awt.BorderLayout(0, 14));
        JPanel linha1 = new JPanel(new java.awt.BorderLayout(18, 0));
        this.CM.setPreferredSize(new java.awt.Dimension(320, 40));
        linha1.add((Component)PainelConfigDivisaoEstadual.celula(this.CN, "Sistema de disputa", this.CM), "Center");
        JPanel desempate = new JPanel(new java.awt.BorderLayout());
        desempate.add((Component)this.CI, "South");
        linha1.add((Component)desempate, "East");
        corpo.add((Component)linha1, "North");
        JPanel fases = new JPanel(new java.awt.GridLayout(1, 3, 12, 0));
        for (JComboBox jComboBox : new JComboBox[]{this.CJ, this.CK, this.CL}) {
            jComboBox.setPreferredSize(new java.awt.Dimension(170, 40));
            fases.add(PainelConfigDivisaoEstadual.celula(null, null, jComboBox));
        }
        JPanel mataMata = new JPanel(new java.awt.BorderLayout(0, 6));
        mataMata.add((Component)components.TemaBetfoot.rotuloCampo(new JLabel(), "Mata-mata"), "North");
        mataMata.add((Component)fases, "Center");
        corpo.add((Component)mataMata, "Center");
        this.add((Component)corpo, "Center");
        components.TemaBetfoot.aplicarTema(this);
    }

    static /* synthetic */ JComboBox a(PainelConfigDivisaoEstadual cu_02) {
        return cu_02.CM;
    }

    static /* synthetic */ void a(PainelConfigDivisaoEstadual cu_02, int n2) {
        cu_02.da(n2);
    }

    static /* synthetic */ DialogoConfigCampeonatosEstaduais b(PainelConfigDivisaoEstadual cu_02) {
        return cu_02.CG;
    }

    static /* synthetic */ int c(PainelConfigDivisaoEstadual cu_02) {
        return cu_02.CF;
    }
}

