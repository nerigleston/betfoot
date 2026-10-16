package telas;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.vJ;
import static motor.GerenciadorJogo.vM;

import telas.OuvinteSalvarConfigLigas;
import telas.PainelConfigFormatoLiga;
import telas.OuvinteFecharDialogoConfigLigas;
import nucleo.EnumPaises;
import nucleo.DadosPais;
import nucleo.IniciadorCarreira;
import components.TemaBetfoot;
import est.ConfigLigaType;
import java.awt.Dimension;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DialogoConfigLigas
extends JPanel {
    private ArrayList du = new ArrayList();
    private int pais;
    private int gF;
    private ConfigLigaType[] Go = new ConfigLigaType[5];
    private int[] CQ = new int[5];
    private JDialog ub = null;
    private JButton uC;
    private JCheckBox Gp;
    private JButton vb;
    private JLabel ug;
    private JLabel uh;
    private JLabel a_;
    private JLabel ur;
    private JScrollPane ut;
    private JLabel vf;
    private PainelConfigFormatoLiga Gq;
    private PainelConfigFormatoLiga Gr;
    private PainelConfigFormatoLiga Gs;
    private PainelConfigFormatoLiga Gt;

    public DialogoConfigLigas(int n2, int n3, JDialog jDialog) {
        this.pais = n2;
        this.ub = jDialog;
        this.mJ();
        this.vb.addActionListener(new OuvinteSalvarConfigLigas(this));
        this.uC.addActionListener(new OuvinteFecharDialogoConfigLigas(this));
        this.gF = n3;
        int n4 = 0;
        while (n4 < SR.bG.size()) {
            if (((ConfigLigaType)SR.bG.get(n4)).getPais() == n2) {
                this.du.add((ConfigLigaType)SR.bG.get(n4));
            }
            ++n4;
        }
        n4 = 0;
        while (n4 <= 4) {
            this.Go[n4] = null;
            ++n4;
        }
        if (this.du.size() > 0) {
            n4 = 1;
            while (n4 <= 4) {
                int n5 = 0;
                while (n5 < this.du.size()) {
                    if (((ConfigLigaType)this.du.get(n5)).getDivisao() == n4) {
                        this.Go[n4] = (ConfigLigaType)this.du.get(n5);
                    }
                    ++n5;
                }
                ++n4;
            }
        }
        n4 = 1;
        while (n4 <= 4) {
            if (this.Go[n4] == null) {
                ConfigLigaType configLigaType = new ConfigLigaType();
                configLigaType.setnTimes(20);
                configLigaType.setnRebaixados(4);
                configLigaType.setPais(n2);
                configLigaType.setDivisao(n4);
                configLigaType.setFormula(0);
                configLigaType.setNome2(DadosPais.br(n2));
                SR.bG.add(configLigaType);
                this.Go[n4] = configLigaType;
                configLigaType.setRebaixadosDireto(4);
                configLigaType.setVagasSobemPeloMataMata(0);
                configLigaType.setVersaoArquivo(22);
            }
            ++n4;
        }
        this.du.clear();
        n4 = 1;
        while (n4 <= 4) {
            this.CQ[n4] = this.Go[n4].getnTimes();
            ++n4;
        }
        if (this.pais != 29) {
            this.Gp.setVisible(false);
        } else {
            this.Gp.setVisible(true);
            if (vM().isNovoFormatoCopa()) {
                this.Gp.setSelected(true);
            } else {
                this.Gp.setSelected(false);
            }
        }
        this.Gq.a(this.Go[1], this.Go[2]);
        this.Gr.a(this.Go[2], this.Go[3]);
        this.Gs.a(this.Go[3], this.Go[4]);
        this.Gt.a(this.Go[4], null);
        this.oJ();
        this.montar(n2);
    }

    public void nH() {
        this.Gq.nH();
        this.Gr.nH();
        this.Gs.nH();
        this.Gt.nH();
        IniciadorCarreira.a(this.Go, this.pais);
        if (this.pais == 29) {
            vM().setNovoFormatoCopa(this.Gp.isSelected());
            vJ();
        }
        this.ub.dispose();
    }

    public void oJ() {
        if (this.gF >= this.CQ[1]) {
            this.Gq.db(1);
        } else {
            this.Gq.db(2);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2]) {
            this.Gr.db(1);
        } else {
            this.Gr.db(3);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2] + this.CQ[3]) {
            this.Gs.db(1);
        } else {
            this.Gs.db(3);
        }
        if (this.gF >= this.CQ[1] + this.CQ[2] + this.CQ[3] + this.CQ[4]) {
            this.Gt.db(1);
        } else {
            this.Gt.db(3);
        }
    }

    public void J(int n2, int n3) {
        this.CQ[n2] = n3;
    }

    public void af(int n2, int n3) {
        if (n2 == 1) {
            this.Gr.fv(n3);
            this.Gr.aP(false);
        } else if (n2 == 2) {
            this.Gs.fv(n3);
            this.Gs.aP(false);
        } else if (n2 == 3) {
            this.Gt.fv(n3);
            this.Gt.aP(false);
        }
    }

    /** Monta o modal no tema: bandeira e título, a opção da Copa do Brasil, as 4 divisões com rolagem, Voltar/Salvar. */
    private void montar(int pais) {
        this.removeAll();
        this.setLayout(new java.awt.BorderLayout(0, 18));
        this.setOpaque(false);
        JPanel topo = new JPanel(new java.awt.BorderLayout(0, 12));
        topo.setOpaque(false);
        topo.add((Component)TemaBetfoot.topoModal(TemaBetfoot.bandeira(pais, 26), "Configurar ligas", EnumPaises.valueOf("P" + pais).getNome() + "  \u00b7  " + this.gF + " times  \u00b7  divis\u00f5es, acesso e rebaixamento", this.uC), "North");
        if (this.Gp.isVisible()) {
            this.Gp.setToolTipText("Copa do Brasil no formato atual (com mais clubes)");
            JPanel copa = new JPanel(new java.awt.BorderLayout());
            copa.setOpaque(false);
            copa.add((Component)this.Gp, "West");
            TemaBetfoot.aplicarTema(copa);
            topo.add((Component)copa, "South");
        }
        this.add((Component)topo, "North");
        JPanel divisoes = new JPanel();
        divisoes.setOpaque(false);
        divisoes.setLayout(new javax.swing.BoxLayout(divisoes, 1));
        PainelConfigFormatoLiga[] paineis = new PainelConfigFormatoLiga[]{this.Gq, this.Gr, this.Gs, this.Gt};
        for (int i = 0; i < paineis.length; ++i) {
            if (i > 0) {
                divisoes.add(javax.swing.Box.createVerticalStrut(14));
            }
            divisoes.add(paineis[i]);
        }
        this.ut = new JScrollPane(divisoes);
        TemaBetfoot.rolagem(this.ut);
        this.ut.getViewport().setOpaque(false);
        this.ut.setOpaque(false);
        this.ut.getVerticalScrollBar().setUnitIncrement(24);
        // Cabe na tela: até ~80% da altura; o resto rola.
        java.awt.Rectangle tela = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        Dimension conteudo = divisoes.getPreferredSize();
        this.ut.setPreferredSize(new Dimension(Math.max(940, conteudo.width + 16), Math.min(conteudo.height + 4, (int)(tela.height * 0.8) - 220)));
        this.add((Component)this.ut, "Center");
        TemaBetfoot.botao(this.uC, TemaBetfoot.Estilo.FANTASMA, "Voltar", TemaBetfoot.Simbolo.VOLTAR);
        this.uC.setToolTipText("Fechar sem salvar (Esc)");
        TemaBetfoot.botao(this.vb, TemaBetfoot.Estilo.PRIMARIO, "Salvar", null);
        this.add((Component)TemaBetfoot.rodapeModal(null, this.uC, this.vb), "South");
    }

    private void mJ() {
        this.vf = new JLabel();
        this.vb = new JButton();
        this.uC = new JButton();
        this.Gp = new JCheckBox("Usar novo formato na Copa do Brasil");
        this.Gq = new PainelConfigFormatoLiga(1, this);
        this.Gr = new PainelConfigFormatoLiga(2, this);
        this.Gs = new PainelConfigFormatoLiga(3, this);
        this.Gt = new PainelConfigFormatoLiga(4, this);
        this.ug = new JLabel();
        this.uh = new JLabel();
        this.a_ = new JLabel();
        this.ur = new JLabel();
        this.ut = new JScrollPane();
    }

    static /* synthetic */ JDialog a(DialogoConfigLigas dG2) {
        return dG2.ub;
    }
}

