package telas;

import telas.ListenerConfirmarRegionais;
import motor.GerenciadorJogo;
import components.TemaBetfoot;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoEscolhaRegionais
extends JPanel {
    private JDialog ub = null;
    private JButton Fu;
    private JCheckBox JI;
    private JCheckBox JJ;
    private JCheckBox JK;
    private JCheckBox JL;
    private JCheckBox JM;
    private JLabel vf;

    public DialogoEscolhaRegionais(JDialog jDialog) {
        this.ub = jDialog;
        this.mJ();
        boolean[] blArray = GerenciadorJogo.SR.getJogaRegionaisTodos();
        blArray = GerenciadorJogo.SR.getJogaRegionaisTodos();
        this.JJ.setSelected(blArray[0]);
        this.JK.setSelected(blArray[1]);
        this.JL.setSelected(blArray[2]);
        this.JM.setSelected(blArray[3]);
        this.JI.setSelected(GerenciadorJogo.vM().isConviteRegionais());
        this.Fu.addActionListener(new ListenerConfirmarRegionais(this));
    }

    public void nH() {
        boolean[] blArray = new boolean[]{this.JJ.isSelected(), this.JK.isSelected(), this.JL.isSelected(), this.JM.isSelected()};
        GerenciadorJogo.SR.setJogaRegionaisTodos(blArray);
        GerenciadorJogo.vM().setJogaRegionaisTodos(blArray);
        GerenciadorJogo.vM().setConviteRegionais(this.JI.isSelected());
        GerenciadorJogo.vJ();
        this.ub.dispose();
    }

    /** Caixa de seleção com uma linha de explicação embaixo. */
    private static JPanel opcao(JCheckBox jCheckBox, String dica) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(0, 2));
        jPanel.setOpaque(false);
        jPanel.add((java.awt.Component)jCheckBox, "North");
        JLabel jLabel = new JLabel(dica);
        jLabel.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
        jLabel.setForeground(TemaBetfoot.TEXTO_FRACO);
        jLabel.setBorder(BorderFactory.createEmptyBorder(0, 26, 0, 0));
        jLabel.putClientProperty("tema.ok", Boolean.TRUE);
        jPanel.add((java.awt.Component)jLabel, "Center");
        return jPanel;
    }

    private void mJ() {
        this.vf = new JLabel();
        this.JJ = new JCheckBox("Rio-S\u00e3o Paulo");
        this.JK = new JCheckBox("Sul-Minas");
        this.Fu = new JButton();
        this.JL = new JCheckBox("Copa do Nordeste");
        this.JM = new JCheckBox("Copa Verde");
        this.JI = new JCheckBox("Sempre ser convidado para os regionais");
        this.setOpaque(false);
        this.setLayout(new java.awt.BorderLayout(0, 22));
        JButton voltar = TemaBetfoot.botao(new JButton(), TemaBetfoot.Estilo.FANTASMA, "Voltar", TemaBetfoot.Simbolo.VOLTAR);
        voltar.setToolTipText("Fechar sem salvar (Esc)");
        voltar.addActionListener(actionEvent -> this.ub.dispose());
        this.add((java.awt.Component)TemaBetfoot.topoModal(null, "Regionais", "Quais copas regionais entram na carreira", voltar), "North");
        JPanel copas = new JPanel(new java.awt.GridLayout(2, 2, 28, 18));
        copas.setOpaque(false);
        copas.add(DialogoEscolhaRegionais.opcao(this.JJ, "Clubes do Rio de Janeiro e de S\u00e3o Paulo"));
        copas.add(DialogoEscolhaRegionais.opcao(this.JK, "Clubes do Sul e de Minas Gerais"));
        copas.add(DialogoEscolhaRegionais.opcao(this.JL, "Clubes dos estados do Nordeste"));
        copas.add(DialogoEscolhaRegionais.opcao(this.JM, "Norte, Centro-Oeste e Esp\u00edrito Santo"));
        JPanel corpo = new JPanel();
        corpo.setOpaque(false);
        corpo.setLayout(new javax.swing.BoxLayout(corpo, 1));
        copas.setAlignmentX(0.0f);
        corpo.add(copas);
        javax.swing.JComponent divisor = TemaBetfoot.divisor();
        corpo.add(javax.swing.Box.createVerticalStrut(6));
        corpo.add(divisor);
        corpo.add(javax.swing.Box.createVerticalStrut(6));
        JPanel convite = DialogoEscolhaRegionais.opcao(this.JI, "Seu time \u00e9 chamado mesmo sem vaga pelo estadual");
        convite.setAlignmentX(0.0f);
        corpo.add(convite);
        TemaBetfoot.aplicarTema(corpo);
        this.add((java.awt.Component)corpo, "Center");
        TemaBetfoot.botao(this.Fu, TemaBetfoot.Estilo.PRIMARIO, "Salvar", null);
        this.add((java.awt.Component)TemaBetfoot.rodapeModal(null, voltar, this.Fu), "South");
        this.setPreferredSize(new java.awt.Dimension(620, this.getPreferredSize().height));
    }
}
