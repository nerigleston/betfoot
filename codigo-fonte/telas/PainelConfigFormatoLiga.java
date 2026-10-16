package telas;

import telas.DialogoConfigLigas;
import telas.OuvinteAplicarFormatoLiga;
import telas.OuvinteAlterarParametroFormatoLiga;
import telas.OuvinteAlterarNumeroRebaixados;
import telas.OuvinteAtualizarFormatoDivisao;
import telas.OuvinteTipoFormatoDivisao;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import est.ConfigLigaType;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelConfigFormatoLiga
extends JPanel {
    private static final long serialVersionUID = 1L;
    private static String[] Gv = new String[]{"Sem mata-mata", "Oit./Quar./semi/final", "Quartas/semi/final", "Semi/Final", "Final", "2 grupos de 4 e Final"};
    private static String[] Gw = new String[]{"sem grupos", "2 grupos de 10", "2 grupos de 12", "8 grupos de 5", "2 grupos de 20"};
    private int divisao = 0;
    private DialogoConfigLigas Gx = null;
    private ConfigLigaType aeQ = null;
    private ConfigLigaType aeR = null;
    private int[] aeS = new int[]{1, 2, 3, 4};
    private int[] aeT = new int[]{1, 2, 3, 4};
    private int aeU = 0;
    private JCheckBox Gz;
    private JCheckBox CI;
    private JCheckBox aeV;
    private JCheckBox aeW;
    private JCheckBox aeX;
    private JComboBox GA;
    private JComboBox GB;
    private JComboBox aeY;
    private JComboBox aeZ;
    private JComboBox afa;
    private JComboBox GD;
    private JTextField GE;
    private JTextField GF;
    private JLabel afb;
    private JLabel GG;
    private JLabel GH;
    private JLabel uF;
    private JLabel afc;
    private JLabel Mp;
    private JLabel afd;
    private JLabel afe;
    private JLabel aff;
    private JLabel afg;
    private JLabel afh;
    private JLabel GJ;

    public PainelConfigFormatoLiga(int n2, DialogoConfigLigas dG2) {
        this.divisao = n2;
        this.Gx = dG2;
        this.mJ();
        int[] nArray = new int[]{8, 10, 12, 14, 16, 18, 20, 22, 24, 25, 26, 28, 30, 36, 40, 48, 64};
        int[] nArray2 = new int[]{8, 10, 12, 14, 16, 18, 20, 22, 24, 25, 26, 28, 30, 36, 40, 48, 64, 68};
        if (this.divisao == 4) {
            nArray = nArray2;
        }
        this.GD.setMaximumRowCount(nArray.length);
        int n3 = 0;
        while (n3 < nArray.length) {
            this.GD.addItem(nArray[n3]);
            ++n3;
        }
        n3 = 0;
        while (n3 < this.aeS.length) {
            this.aeY.addItem(this.aeS[n3]);
            ++n3;
        }
        this.GD.addActionListener(new OuvinteAplicarFormatoLiga(this));
        this.GA.addActionListener(new OuvinteAlterarParametroFormatoLiga(this));
        this.aeY.addActionListener(new OuvinteAlterarNumeroRebaixados(this));
        this.aeZ.addActionListener(new OuvinteAtualizarFormatoDivisao(this));
        this.afa.addActionListener(new OuvinteTipoFormatoDivisao(this));
        if (this.divisao == 1) {
            this.afh.setText("SOBEM: 0");
            this.afh.setVisible(false);
            this.aeU = 0;
            this.afa.setEnabled(false);
            this.fw(0);
            this.c(false, false);
            this.aff.setVisible(false);
            this.afa.setVisible(false);
        }
    }

    private void AE() {
        this.AH();
    }

    private void AF() {
        this.Gx.af(this.divisao, this.aeS[this.aeY.getSelectedIndex()]);
        this.aeZ.removeAllItems();
        int n2 = 0;
        while (n2 < this.aeS[this.aeY.getSelectedIndex()]) {
            this.aeZ.addItem(this.aeT[n2]);
            ++n2;
        }
        this.aeZ.setSelectedIndex(this.aeZ.getItemCount() - 1);
    }

    public void fv(int n2) {
        this.afh.setText(n2 + (n2 == 1 ? " SOBE" : " SOBEM"));
        this.aeU = n2;
    }

    public void aP(boolean bl) {
        this.afa.removeAllItems();
        if (this.aeU == 1) {
            this.afa.addItem(0);
            this.AG();
        } else if (this.aeU == 2) {
            this.afa.addItem(0);
            this.afa.addItem(1);
            this.AG();
        } else if (this.aeU == 3 || this.aeU == 4) {
            this.afa.addItem(0);
            this.afa.addItem(1);
            this.afa.addItem(2);
            this.AG();
        }
        if (bl) {
            this.afa.setSelectedItem(this.aeQ.getVagasSobemPeloMataMata());
        } else {
            this.afa.setSelectedItem(0);
            this.AG();
        }
    }

    public void AG() {
        if (this.afa.getSelectedItem() != null) {
            if ((Integer)this.afa.getSelectedItem() == 0) {
                this.c(false, false);
            } else if ((Integer)this.afa.getSelectedItem() == 1) {
                this.c(true, true);
            } else if ((Integer)this.afa.getSelectedItem() == 2) {
                this.c(false, true);
            }
        }
    }

    public void fw(int n2) {
    }

    public void AH() {
        int n2 = 0;
        if (this.aeY.getSelectedIndex() >= 0 && this.aeZ.getSelectedIndex() >= 0) {
            n2 = this.aeS[this.aeY.getSelectedIndex()] - this.aeT[this.aeZ.getSelectedIndex()];
        }
        this.afd.setText("Playoff com a divis\u00e3o de baixo: " + n2);
    }

    public void c(boolean bl, boolean bl2) {
        this.afg.setVisible(bl2);
        this.aeW.setVisible(bl2);
        this.afb.setVisible(bl);
        this.aeX.setVisible(bl);
        if (bl) {
            this.afg.setText("Semifinal");
        } else {
            this.afg.setText("Final");
        }
    }

    public void a(ConfigLigaType configLigaType, ConfigLigaType configLigaType2) {
        int n2;
        this.b(configLigaType);
        this.GE.setText(configLigaType.getNome2());
        if (this.GE.getText().isEmpty()) {
            configLigaType.setNome2("Campeonato");
        }
        this.GF.setText(configLigaType.getNomeDivisao());
        if (this.GF.getText().isEmpty() || this.GF.getText() == "") {
            configLigaType.setNomeDivisao(String.valueOf(configLigaType.getDivisao()) + "\u00aa divis\u00e3o");
        }
        this.dh(configLigaType.getnTimes());
        this.di(configLigaType.getnTimes());
        if (configLigaType.getnTimes() == 8 || configLigaType.getnTimes() == 10 || configLigaType.getnTimes() == 12 || configLigaType.getnTimes() == 14) {
            if (configLigaType.getFormula() == 0) {
                if (configLigaType.getnTimes() == 8) {
                    this.GA.setSelectedItem("4");
                } else if (configLigaType.getnTimes() == 10) {
                    this.GA.setSelectedItem("4");
                } else if (configLigaType.getnTimes() == 12) {
                    this.GA.setSelectedItem("3");
                } else if (configLigaType.getnTimes() == 14) {
                    this.GA.setSelectedItem("3");
                }
            } else {
                this.GA.setSelectedItem(Integer.toString(configLigaType.getFormula()));
            }
            n2 = configLigaType.getNumeroTimesMataMata();
            if (n2 == 8) {
                this.GB.setSelectedItem(Gv[2]);
            } else if (n2 == 4) {
                this.GB.setSelectedItem(Gv[3]);
            } else if (n2 == 2) {
                this.GB.setSelectedItem(Gv[4]);
            } else {
                this.GB.setSelectedIndex(0);
            }
        } else {
            this.O(configLigaType.getnGrupos(), configLigaType.getNumeroTimesMataMata());
        }
        if (configLigaType.getnRebaixados() < 1 && configLigaType.getnRebaixados() > 4) {
            configLigaType.setnRebaixados(2);
        }
        this.aeY.setSelectedItem(configLigaType.getnRebaixados());
        this.aeZ.removeAllItems();
        n2 = 0;
        while (n2 < configLigaType.getnRebaixados()) {
            this.aeZ.addItem(this.aeT[n2]);
            ++n2;
        }
        if (configLigaType.getRebaixadosDireto() == 0) {
            this.aeZ.setSelectedItem(configLigaType.getnRebaixados());
        } else {
            this.aeZ.setSelectedItem(configLigaType.getRebaixadosDireto());
        }
        this.aP(true);
        if (configLigaType.getDuasVoltasMataMataSobe() != null) {
            boolean[] blArray = configLigaType.getDuasVoltasMataMataSobe();
            this.aeW.setSelected(blArray[0]);
            this.aeX.setSelected(blArray[1]);
        }
        if (configLigaType.getDuasVoltasplayoffReb() != null) {
            this.aeV.setSelected(configLigaType.getDuasVoltasplayoffReb()[0]);
        }
        boolean[] blArray = configLigaType.getDuasVoltasMataMata();
        this.Gz.setSelected(blArray[0]);
        if (configLigaType.getDesempate() == 0) {
            this.CI.setSelected(true);
        } else {
            this.CI.setSelected(false);
        }
        this.AH();
    }

    public void db(int n2) {
        this.estado = n2;
        this.aviso.setVisible(n2 != 1);
        if (n2 == 2) {
            this.aviso.setText("FALTAM TIMES NO PA\u00cdS");
            this.aviso.setForeground(components.TemaBetfoot.VERMELHO);
            this.aviso.setToolTipText("O pa\u00eds n\u00e3o tem times suficientes para esta divis\u00e3o");
        } else if (n2 == 3) {
            this.aviso.setText("TIMES INSUFICIENTES");
            this.aviso.setForeground(components.TemaBetfoot.TEXTO_FRACO);
            this.aviso.setToolTipText("Os times do pa\u00eds n\u00e3o chegam at\u00e9 esta divis\u00e3o com essa configura\u00e7\u00e3o");
        }
        this.repaint();
    }

    public void O(int n2, int n3) {
        if (n2 == 0) {
            this.GA.setSelectedIndex(0);
        } else if (n2 == 2) {
            this.GA.setSelectedIndex(1);
        } else if (n2 == 8) {
            this.GA.setSelectedIndex(0);
        } else if (n2 == 12) {
            this.GA.setSelectedIndex(0);
        }
        if (n2 == 8) {
            this.GB.setSelectedIndex(0);
        } else if (n2 == 12) {
            this.GB.setSelectedIndex(0);
        } else if (n2 > 0) {
            if (n3 == 4) {
                this.GB.setSelectedItem(Gv[2]);
            } else if (n3 == 2) {
                this.GB.setSelectedItem(Gv[3]);
            } else if (n3 == 1) {
                this.GB.setSelectedItem(Gv[4]);
            } else if (n3 == 1020) {
                this.GB.setSelectedItem(Gv[5]);
            } else {
                this.GB.setSelectedIndex(0);
            }
        } else if (n3 == 8) {
            this.GB.setSelectedItem(Gv[2]);
        } else if (n3 == 4) {
            this.GB.setSelectedItem(Gv[3]);
        } else if (n3 == 2) {
            this.GB.setSelectedItem(Gv[4]);
        } else if (n3 == 1020) {
            this.GB.setSelectedItem(Gv[5]);
        } else {
            this.GB.setSelectedIndex(0);
        }
    }

    public void dh(int n2) {
        this.GD.setSelectedItem(n2);
    }

    public void b(ConfigLigaType configLigaType) {
        this.aeQ = configLigaType;
    }

    public void nH() {
        int n2 = 0;
        int[] nArray = new int[]{8, 10, 12, 14, 16, 18, 20, 22, 24, 25, 26, 28, 30, 36, 40, 48, 64, 68};
        n2 = nArray[this.GD.getSelectedIndex()];
        this.aeQ.setVersaoArquivo(22);
        this.aeQ.setnTimes(n2);
        this.aeQ.setnRebaixados(this.aeS[this.aeY.getSelectedIndex()]);
        this.aeQ.setRebaixadosDireto(this.aeT[this.aeZ.getSelectedIndex()]);
        this.aeQ.setMelhoresTerceiros(false);
        boolean[] blArray = new boolean[2];
        if (this.aeW.isVisible()) {
            blArray[0] = this.aeW.isSelected();
        }
        if (this.aeX.isVisible()) {
            blArray[1] = this.aeX.isSelected();
        }
        this.aeQ.setIdaVoltaMMSobe(blArray[0], blArray[1]);
        if (this.aeV.isVisible()) {
            this.aeQ.setDuasVoltasplayoffReb(this.aeV.isSelected());
        }
        if (this.divisao > 1) {
            this.aeQ.setVagasSobemPeloMataMata((Integer)this.afa.getSelectedItem());
        }
        this.aeQ.setnGrupos(0);
        if (this.aeQ.getnTimes() == 20 || this.aeQ.getnTimes() == 24) {
            if (this.GA.getSelectedIndex() == 1) {
                this.aeQ.setnGrupos(2);
            }
        } else if (this.aeQ.getnTimes() == 40) {
            this.aeQ.setnGrupos(8);
            if (this.GA.getSelectedIndex() == 1) {
                this.aeQ.setnGrupos(2);
            }
        } else if (this.aeQ.getnTimes() == 48) {
            this.aeQ.setnGrupos(12);
        } else if (this.aeQ.getnTimes() == 64) {
            this.aeQ.setnGrupos(8);
        } else if (this.aeQ.getnTimes() == 68) {
            this.aeQ.setnGrupos(8);
        }
        this.aeQ.setFormula(0);
        if (this.aeQ.getnTimes() == 8 || this.aeQ.getnTimes() == 10 || this.aeQ.getnTimes() == 12 || this.aeQ.getnTimes() == 14) {
            if (this.GA.getSelectedItem().equals("4")) {
                this.aeQ.setFormula(4);
            } else if (this.GA.getSelectedItem().equals("3")) {
                this.aeQ.setFormula(3);
            } else if (this.GA.getSelectedItem().equals("2")) {
                this.aeQ.setFormula(2);
            }
        }
        if (this.aeQ.getnTimes() == 30) {
            this.aeQ.setDoisTurnos(false);
        }
        this.aeQ.setNumeroTimesMataMata(0);
        int[] nArray2 = new int[6];
        nArray2[1] = 16;
        nArray2[2] = 8;
        nArray2[3] = 4;
        nArray2[4] = 2;
        nArray2[5] = 1020;
        int[] nArray3 = nArray2;
        int n3 = 0;
        while (n3 < Gv.length) {
            if (this.GB.getSelectedItem().equals(Gv[n3])) {
                this.aeQ.setNumeroTimesMataMata(nArray3[n3]);
            }
            ++n3;
        }
        if (this.aeQ.getnGrupos() > 0) {
            if (this.aeQ.getNumeroTimesMataMata() == 0) {
                this.aeQ.setNumeroTimesMataMata(2);
            }
            if (this.aeQ.getNumeroTimesMataMata() < 1000) {
                this.aeQ.setNumeroTimesMataMata(this.aeQ.getNumeroTimesMataMata() / this.aeQ.getnGrupos());
            }
            if (this.aeQ.getnTimes() == 20 && this.aeQ.getnGrupos() == 2) {
                this.aeQ.setRebaixadoPeloGrupo(true);
                if (this.aeQ.getnRebaixados() == 1 || this.aeQ.getnRebaixados() == 3) {
                    this.aeQ.setnRebaixados(4);
                }
            }
            if (this.aeQ.getnTimes() == 40 && this.aeQ.getnGrupos() == 8) {
                this.aeQ.setRebaixadoPeloGrupo(false);
            }
            if (this.aeQ.getnTimes() == 48 && this.aeQ.getnGrupos() == 12) {
                this.aeQ.setRebaixadoPeloGrupo(false);
                this.aeQ.setNumeroTimesMataMata(2);
                this.aeQ.setMelhoresTerceiros(true);
            } else if (this.aeQ.getnTimes() == 64 && this.aeQ.getnGrupos() == 8) {
                this.aeQ.setRebaixadoPeloGrupo(false);
                this.aeQ.setNumeroTimesMataMata(4);
                this.aeQ.setDoisTurnos(true);
            } else if (this.aeQ.getnTimes() == 68 && this.aeQ.getnGrupos() == 8) {
                this.aeQ.setRebaixadoPeloGrupo(false);
                this.aeQ.setNumeroTimesMataMata(4);
                this.aeQ.setMelhoresTerceiros(false);
            }
        }
        boolean[] blArray2 = new boolean[]{true, true, true, true, true, true, true};
        boolean[] blArray3 = new boolean[7];
        if (this.Gz.isSelected()) {
            this.aeQ.setDuasVoltasMataMata(blArray2);
        } else {
            this.aeQ.setDuasVoltasMataMata(blArray3);
        }
        if (this.aeQ.getnTimes() > 22 && this.aeQ.getnTimes() < 25) {
            this.aeQ.setDuasVoltasMataMata(blArray3);
        }
        if (this.aeQ.getnTimes() == 24 && this.GA.getSelectedIndex() == 1 && this.Gz.isSelected()) {
            this.aeQ.setDuasVoltasMataMata(blArray2);
        }
        if (this.aeQ.getnTimes() == 40 || this.aeQ.getnTimes() == 48 || this.aeQ.getnTimes() == 68) {
            this.aeQ.setDuasVoltasMataMata(blArray2);
        }
        if (!this.Gz.isSelected()) {
            this.aeQ.setDuasVoltasMataMata(blArray3);
        }
        if (!this.CI.isSelected()) {
            this.aeQ.setDesempate(1);
        } else if (this.CI.isSelected()) {
            this.aeQ.setDesempate(0);
        }
        if (!this.GE.getText().toString().equals("")) {
            this.aeQ.setNome2(this.GE.getText().toString());
        }
        this.aeQ.setNomeDivisao(this.GF.getText().toString());
    }

    public void di(int n2) {
        this.GA.setVisible(true);
        this.GG.setVisible(true);
        this.GG.setText("Grupos");
        this.GA.removeAllItems();
        if (n2 == 20) {
            this.GA.addItem(Gw[0]);
            this.GA.addItem(Gw[1]);
        } else if (n2 == 24) {
            this.GA.addItem(Gw[0]);
            this.GA.addItem(Gw[2]);
        } else if (n2 == 40) {
            this.GA.addItem(Gw[3]);
            this.GA.addItem(Gw[4]);
        } else if (n2 == 48) {
            this.GA.addItem("12 grupos de 4");
        } else if (n2 == 64) {
            this.GA.addItem("8 grupos de 8");
        } else if (n2 == 68) {
            this.GA.addItem("Seletiva/8 grupos de 8");
        } else {
            this.GA.addItem(Gw[0]);
            this.GA.setVisible(false);
            this.GG.setVisible(false);
        }
        if (n2 == 8 || n2 == 10 || n2 == 12 || n2 == 14) {
            this.d(n2, true);
        } else {
            this.d(n2, false);
        }
        if (n2 < 20) {
            this.aeY.setSelectedIndex(0);
        } else {
            this.aeY.setSelectedIndex(1);
        }
        if (n2 == 8 || n2 == 10 || n2 == 12 || n2 == 14) {
            this.GA.setVisible(true);
            this.GG.setVisible(true);
            this.GA.removeAllItems();
            this.GG.setText("Turnos");
            if (n2 == 10) {
                this.GA.addItem("2");
                this.GA.addItem("3");
                this.GA.addItem("4");
                this.GA.setSelectedItem("4");
            } else if (n2 == 12 || n2 == 14) {
                this.GA.addItem("2");
                this.GA.addItem("3");
                this.GA.setSelectedItem("3");
            } else if (n2 == 8) {
                this.GA.addItem("4");
            }
            this.d(n2, true);
        }
    }

    private void d(int n2, boolean bl) {
        this.GB.removeAllItems();
        if (n2 <= 10 || n2 == 12 || n2 == 14) {
            this.GB.addItem(Gv[0]);
            this.GB.addItem(Gv[2]);
            this.GB.addItem(Gv[3]);
            this.GB.addItem(Gv[4]);
        } else if (n2 <= 20 || n2 == 30 || n2 == 25 || n2 == 26 || n2 == 28 || n2 == 36) {
            boolean bl2 = false;
            if (this.GA.getSelectedItem() != null && this.GA.getSelectedItem().equals(Gw[0])) {
                this.GB.addItem(Gv[0]);
                bl2 = true;
            }
            if (bl) {
                this.GB.addItem(Gv[0]);
            }
            this.GB.addItem(Gv[2]);
            this.GB.addItem(Gv[3]);
            this.GB.addItem(Gv[4]);
            if (n2 == 20) {
                this.GB.addItem(Gv[5]);
            }
        } else if (n2 == 22) {
            this.GB.addItem(Gv[0]);
            this.GB.addItem(Gv[2]);
            this.GB.addItem(Gv[3]);
            this.GB.addItem(Gv[4]);
        } else if (n2 == 24) {
            if (this.GA.getSelectedItem() != null && this.GA.getSelectedItem().equals(Gw[0])) {
                this.GB.addItem(Gv[0]);
            } else {
                this.GB.addItem(Gv[2]);
                this.GB.addItem(Gv[3]);
                this.GB.addItem(Gv[4]);
            }
        } else if (n2 == 40) {
            if (this.GA.getSelectedItem() != null && this.GA.getSelectedItem().equals(Gw[4])) {
                this.GB.addItem(Gv[3]);
                this.GB.addItem(Gv[4]);
            } else {
                this.GB.addItem(Gv[1]);
            }
        } else if (n2 == 48 || n2 == 64 || n2 == 68) {
            this.GB.addItem("32 classificados");
        } else {
            this.GB.addItem(Gv[0]);
        }
    }

    /** Situação da divisão (db): 1 normal, 2 faltam times para a 1ª divisão, 3 times não bastam para esta divisão. */
    private int estado = 1;
    private final JLabel aviso = new JLabel();

    /** Rótulo em cima do campo; se o campo some (setVisible), o rótulo some junto. */
    private static JPanel celula(JLabel jLabel, String string, final Component component) {
        final JPanel jPanel = new JPanel(new java.awt.BorderLayout(0, 6));
        jPanel.setOpaque(false);
        if (jLabel != null) {
            components.TemaBetfoot.rotuloCampo(jLabel, string);
            jPanel.add((Component)jLabel, "North");
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

    private static java.awt.GridBagConstraints pos(int x, int y, int largura, double peso) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = largura;
        c.weightx = peso;
        c.fill = java.awt.GridBagConstraints.HORIZONTAL;
        c.anchor = java.awt.GridBagConstraints.NORTHWEST;
        c.insets = new java.awt.Insets(0, 0, 14, x + largura < 3 ? 12 : 0);
        return c;
    }

    private static JLabel texto(JLabel jLabel) {
        jLabel.setFont(components.TemaBetfoot.fonte(Font.PLAIN, 13.0f));
        jLabel.setForeground(components.TemaBetfoot.TEXTO_SUAVE);
        jLabel.setOpaque(false);
        jLabel.putClientProperty("tema.ok", Boolean.TRUE);
        return jLabel;
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

    private void mJ() {
        this.GE = new JTextField();
        this.aeY = new JComboBox();
        this.uF = new JLabel();
        this.GF = new JTextField();
        this.GJ = new JLabel();
        this.GD = new JComboBox();
        this.GG = new JLabel() {
            @Override
            public void setText(String string) {
                super.setText(string == null ? null : string.toUpperCase());
            }
        };
        this.GA = new JComboBox();
        this.GH = new JLabel();
        this.aeX = new JCheckBox("Ida e volta");
        this.CI = new JCheckBox("Desempate nos pênaltis");
        this.afc = new JLabel();
        this.Mp = new JLabel();
        this.afd = new JLabel();
        this.afb = new JLabel();
        this.afa = new JComboBox();
        this.afe = new JLabel();
        this.aeZ = new JComboBox();
        this.afh = new JLabel();
        this.GB = new JComboBox();
        this.Gz = new JCheckBox("Mata-mata em dois jogos");
        this.aeW = new JCheckBox("Ida e volta");
        this.aff = new JLabel();
        this.aeV = new JCheckBox("Ida e volta");
        this.afg = new JLabel() {
            @Override
            public void setText(String string) {
                super.setText(string == null ? null : string.toUpperCase());
            }
        };
        this.setOpaque(false);
        this.setLayout(new java.awt.BorderLayout(0, 16));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(18, 22, 8, 22));

        // Topo: número da divisão, o que sobe e o aviso de times insuficientes.
        JPanel topo = new JPanel(new java.awt.BorderLayout(14, 0));
        JLabel titulo = new JLabel(this.divisao + "ª DIVISÃO");
        titulo.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(20.0f), 0.04f));
        titulo.setForeground(components.TemaBetfoot.TEXTO);
        titulo.putClientProperty("tema.ok", Boolean.TRUE);
        topo.add((Component)titulo, "West");
        JPanel selos = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 14, 0));
        this.aviso.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(13.0f), 0.06f));
        this.aviso.putClientProperty("tema.ok", Boolean.TRUE);
        this.aviso.setVisible(false);
        selos.add(this.aviso);
        this.afh.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(14.0f), 0.06f));
        this.afh.setForeground(components.TemaBetfoot.VERDE);
        this.afh.setOpaque(false);
        this.afh.putClientProperty("tema.ok", Boolean.TRUE);
        this.afh.setToolTipText("Quantos times desta divisão sobem para a de cima");
        selos.add(this.afh);
        topo.add((Component)selos, "East");
        this.add((Component)topo, "North");

        // Esquerda: o campeonato. Direita: acesso e rebaixamento.
        JPanel campeonato = new JPanel(new java.awt.GridBagLayout());
        this.GE.setColumns(12);
        this.GF.setColumns(12);
        campeonato.add((Component)PainelConfigFormatoLiga.celula(this.afc, "Campeonato", this.GE), PainelConfigFormatoLiga.pos(0, 0, 2, 1.0));
        campeonato.add((Component)PainelConfigFormatoLiga.celula(this.uF, "Nome da divisão", this.GF), PainelConfigFormatoLiga.pos(2, 0, 1, 1.0));
        this.GD.setPreferredSize(new Dimension(96, 40));
        campeonato.add((Component)PainelConfigFormatoLiga.celula(this.GJ, "Times", this.GD), PainelConfigFormatoLiga.pos(0, 1, 1, 0.0));
        campeonato.add((Component)PainelConfigFormatoLiga.celula(this.GG, "Grupos", this.GA), PainelConfigFormatoLiga.pos(1, 1, 2, 1.0));
        campeonato.add((Component)PainelConfigFormatoLiga.celula(this.GH, "Mata-mata", this.GB), PainelConfigFormatoLiga.pos(0, 2, 3, 1.0));
        JPanel marcas = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        marcas.add(this.Gz);
        marcas.add(javax.swing.Box.createHorizontalStrut(18));
        marcas.add(this.CI);
        campeonato.add((Component)marcas, PainelConfigFormatoLiga.pos(0, 3, 3, 1.0));

        JPanel acesso = new JPanel(new java.awt.GridBagLayout());
        this.afa.setPreferredSize(new Dimension(96, 40));
        acesso.add((Component)PainelConfigFormatoLiga.celula(this.aff, "Vagas pelo mata-mata", this.afa), PainelConfigFormatoLiga.pos(0, 0, 1, 0.0));
        acesso.add((Component)PainelConfigFormatoLiga.celula(this.afg, "Final", this.aeW), PainelConfigFormatoLiga.pos(1, 0, 1, 0.0));
        acesso.add((Component)PainelConfigFormatoLiga.celula(this.afb, "Final", this.aeX), PainelConfigFormatoLiga.pos(2, 0, 1, 0.0));
        this.aeY.setPreferredSize(new Dimension(96, 40));
        this.aeZ.setPreferredSize(new Dimension(96, 40));
        acesso.add((Component)PainelConfigFormatoLiga.celula(this.Mp, "Rebaixados", this.aeY), PainelConfigFormatoLiga.pos(0, 1, 1, 0.0));
        acesso.add((Component)PainelConfigFormatoLiga.celula(this.afe, "Direto", this.aeZ), PainelConfigFormatoLiga.pos(1, 1, 1, 0.0));
        this.Mp.setToolTipText("Quantos times desta divisão descem");
        this.afe.setToolTipText("Quantos descem direto; os outros disputam playoff com a divisão de baixo");
        JPanel playoff = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        playoff.add(PainelConfigFormatoLiga.texto(this.afd));
        playoff.add(javax.swing.Box.createHorizontalStrut(16));
        playoff.add(this.aeV);
        this.aeV.setToolTipText("Playoff de rebaixamento em ida e volta");
        acesso.add((Component)playoff, PainelConfigFormatoLiga.pos(0, 2, 3, 1.0));

        // Sobra de espaço vai para baixo/direita: os campos ficam alinhados no topo.
        for (JPanel grade : new JPanel[]{campeonato, acesso}) {
            java.awt.GridBagConstraints resto = PainelConfigFormatoLiga.pos(3, 9, 1, 1.0);
            resto.weighty = 1.0;
            grade.add((Component)javax.swing.Box.createGlue(), resto);
        }
        JPanel colunas = new JPanel(new java.awt.GridLayout(1, 2, 28, 0));
        colunas.add(campeonato);
        colunas.add(acesso);
        this.add((Component)colunas, "Center");
        components.TemaBetfoot.aplicarTema(this);
    }

    static /* synthetic */ JComboBox a(PainelConfigFormatoLiga dK2) {
        return dK2.GD;
    }

    static /* synthetic */ DialogoConfigLigas b(PainelConfigFormatoLiga dK2) {
        return dK2.Gx;
    }

    static /* synthetic */ int c(PainelConfigFormatoLiga dK2) {
        return dK2.divisao;
    }

    static /* synthetic */ void a(PainelConfigFormatoLiga dK2, int n2, boolean bl) {
        dK2.d(n2, bl);
    }

    static /* synthetic */ void d(PainelConfigFormatoLiga dK2) {
        dK2.AF();
    }

    static /* synthetic */ void e(PainelConfigFormatoLiga dK2) {
        dK2.AE();
    }
}

