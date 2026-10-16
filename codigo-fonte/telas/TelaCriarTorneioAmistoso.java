package telas;

import telas.ListenerAtualizarParticipantesTorneio;
import telas.OuvinteVazioNomeTorneio;
import telas.OuvinteVazioSedeTorneio;
import telas.ListenerIniciarTorneio;
import telas.ListenerCancelarTorneio;
import telas.ListenerRemoverParticipanteTorneio;
import telas.ListenerAdicionarParticipanteTorneio;
import telas.ListenerMoverParticipanteCima;
import telas.ListenerMoverParticipanteBaixo;
import telas.ListenerMudarFormulaTorneio;
import telas.ListenerSelecionarTimeArvoreTorneio;
import tabelas.ModeloTabelaListaQuatroColunas;
import tabelas.RendererPosicaoGrupoDivisao;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import comparadores.ColecaoComparadoresSorteio;
import components.TemaBetfoot;
import components.TemaBetfoot.Estilo;
import components.TemaBetfoot.Simbolo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TelaCriarTorneioAmistoso
extends JPanel {
    private ModeloTime ul = null;
    private ModeloTime zY = null;
    private ArrayList afC = new ArrayList();
    private ArrayList um = new ArrayList();
    private int nTimes = 8;
    private int[] afD = new int[]{8, 4, 6};
    private JButton yV;
    private JButton afE;
    private JButton uC;
    private JButton Bw;
    private JButton yZ;
    private JButton afF;
    private JCheckBox CS;
    private JComboBox afG;
    private JTextField Nr;
    private JTextField afH;
    private JLabel ug;
    private JLabel a_;
    private JLabel us;
    private JLabel vx;
    private JLabel vy;
    private JLabel vz;
    private JScrollPane ut;
    private JScrollPane wi;
    private JLabel zh;
    private JLabel uu;
    private JPanel uv;
    private JTable vn;
    private JTree uw;

    public TelaCriarTorneioAmistoso(JFrame jFrame) {
        this.ul = (ModeloTime)GerenciadorJogo.SR.aN().get(0);
        this.afC.add(this.ul);
        this.mJ();
        this.mW();
        this.Ay();
        this.mH();
        this.mM();
        this.temaParticipantes();
        TemaBetfoot.combo(this.afG);
        this.zh.setText("");
        this.pO();
        this.AT();
    }

    private void Ay() {
        ModeloTabelaListaQuatroColunas aT2 = new ModeloTabelaListaQuatroColunas(this.afC);
        this.vn.setModel(aT2);
        int[] nArray = new int[]{40, 300, 100};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.vn.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.vn.getColumnModel().getColumn(0).setMaxWidth(40);
        this.vn.getColumnModel().getColumn(1).setMaxWidth(300);
        this.vn.getColumnModel().getColumn(2).setMaxWidth(100);
        this.vn.setAutoResizeMode(3);
        this.vn.setRowHeight(20);
        this.vn.setShowGrid(false);
        this.vn.setDefaultRenderer(ModeloTime.class, new RendererPosicaoGrupoDivisao(2));
        this.vn.setAutoCreateRowSorter(false);
        this.vn.setIntercellSpacing(new Dimension(0, 0));
        this.vn.setCellSelectionEnabled(false);
        this.vn.setSelectionMode(0);
        this.vn.setRowSelectionAllowed(true);
        this.vn.setSelectionBackground(Color.YELLOW);
        this.vn.setFillsViewportHeight(true);
        this.vn.setTableHeader(null);
    }

    public void mH() {
        this.CS.addActionListener(new ListenerAtualizarParticipantesTorneio(this));
        this.Bw.addActionListener(new ListenerIniciarTorneio(this));
        this.uC.addActionListener(new ListenerCancelarTorneio(this));
        this.yZ.addActionListener(new ListenerRemoverParticipanteTorneio(this));
        this.yV.addActionListener(new ListenerAdicionarParticipanteTorneio(this));
        this.afF.addActionListener(new ListenerMoverParticipanteCima(this));
        this.afE.addActionListener(new ListenerMoverParticipanteBaixo(this));
    }

    private void fz(int n2) {
        int n3 = this.vn.getSelectedRow();
        if (n3 >= 0) {
            if (n2 == -1) {
                if (n3 - 1 >= 0) {
                    Collections.swap(this.afC, n3, n3 - 1);
                    this.vn.setRowSelectionInterval(n3 - 1, n3 - 1);
                }
            } else if (n2 == 0 && n3 + 1 < this.afC.size()) {
                Collections.swap(this.afC, n3, n3 + 1);
                this.vn.setRowSelectionInterval(n3 + 1, n3 + 1);
            }
        }
        this.pO();
        this.atualizarParticipantes();
    }

    private void nA() {
        if (this.zY != null && this.afC.size() < this.nTimes && !this.afC.contains(this.zY)) {
            this.afC.add(this.zY);
            this.atualizarParticipantes();
            this.pO();
        }
    }

    private void pO() {
        this.vz.setText(this.afC.size() + " / " + this.nTimes);
        this.vz.setForeground(this.afC.size() == this.nTimes ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_SUAVE);
        int n2 = 0;
        while (n2 < this.afC.size()) {
            if (n2 < this.nTimes) {
                if (this.nTimes == 4 || this.nTimes == 8) {
                    if (n2 < 4) {
                        ((ModeloTime)this.afC.get(n2)).fr(0);
                    } else {
                        ((ModeloTime)this.afC.get(n2)).fr(1);
                    }
                } else {
                    ((ModeloTime)this.afC.get(n2)).fr(0);
                }
                if (this.CS.isSelected()) {
                    ((ModeloTime)this.afC.get(n2)).fr(2);
                }
            } else {
                ((ModeloTime)this.afC.get(n2)).fr(-1);
            }
            ++n2;
        }
        this.atualizarParticipantes();
    }

    private void nB() {
        if (this.vn.getSelectedRow() >= 0 && this.vn.getSelectedRow() < this.afC.size() && this.afC.get(this.vn.getSelectedRow()) != this.ul) {
            this.afC.remove(this.afC.get(this.vn.getSelectedRow()));
            this.atualizarParticipantes();
            this.pO();
        }
    }

    private void mW() {
        this.afG.addItem("2 grupos de 4, semi e final");
        this.afG.addItem("1 grupo de 4, final");
        this.afG.addItem("1 grupo de 6");
        this.afG.setSelectedIndex(0);
        this.afG.addActionListener(new ListenerMudarFormulaTorneio(this));
    }

    private void AT() {
        this.nTimes = this.afD[this.afG.getSelectedIndex()];
        this.pO();
        this.zh.setText("");
        this.atualizarParticipantes();
    }

    private void pn() {
        if (this.afC.size() == this.afD[this.afG.getSelectedIndex()]) {
            this.AU();
        } else {
            this.zh.setText("O torneio precisa de " + this.afD[this.afG.getSelectedIndex()] + " times");
        }
    }

    private void AU() {
        String string = "Torneio Amistoso";
        String string2 = "Juazeiro";
        if (!this.Nr.getText().toString().isEmpty() && this.Nr.getText().toString().length() < 50) {
            string = this.Nr.getText();
        }
        if (!this.afH.getText().toString().isEmpty() && this.afH.getText().toString().length() < 50) {
            string2 = this.afH.getText();
        }
        if (GerenciadorJogo.SR.yn() != null) {
            GerenciadorJogo.SR.yn().a(this.afC, this.afG.getSelectedIndex(), string, string2, this.CS.isSelected());
        }
        this.Bw.setCursor(new Cursor(3));
        GerenciadorJogo.SR.az();
        GerenciadorJogo.SR.V();
    }

    private void AV() {
        this.Bw.setCursor(new Cursor(3));
        GerenciadorJogo.SR.az();
        GerenciadorJogo.SR.V();
    }

    private void mM() {
        this.uw.getSelectionModel().setSelectionMode(1);
        this.uw.addTreeSelectionListener(new ListenerSelecionarTimeArvoreTorneio(this));
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (!((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kn().booleanValue()) {
                this.um.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
                Collections.sort(this.um, ColecaoComparadoresSorteio.VS);
            }
            ++n2;
        }
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Times");
        this.a(defaultMutableTreeNode);
        this.uw.setModel(new DefaultTreeModel(defaultMutableTreeNode));
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        DefaultMutableTreeNode defaultMutableTreeNode2 = null;
        DefaultMutableTreeNode defaultMutableTreeNode3 = null;
        DefaultMutableTreeNode defaultMutableTreeNode4 = null;
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.N().size()) {
            defaultMutableTreeNode2 = new DefaultMutableTreeNode(((LigaNacional)GerenciadorJogo.SR.N().get(n2)).jp());
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            int n3 = 0;
            while (n3 < ((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().size()) {
                if (((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().size() > 0) {
                    defaultMutableTreeNode3 = new DefaultMutableTreeNode(((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).getNome());
                    defaultMutableTreeNode2.add(defaultMutableTreeNode3);
                    int n4 = 0;
                    while (n4 < ((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().size()) {
                        defaultMutableTreeNode4 = new DefaultMutableTreeNode(((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().get(n4));
                        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
                        ++n4;
                    }
                }
                ++n3;
            }
            if (((LigaNacional)GerenciadorJogo.SR.N().get(n2)).ek().size() > 0) {
                defaultMutableTreeNode3 = new DefaultMutableTreeNode("Regionais");
                defaultMutableTreeNode2.add(defaultMutableTreeNode3);
                n3 = 0;
                while (n3 < ((LigaNacional)GerenciadorJogo.SR.N().get(n2)).ek().size()) {
                    defaultMutableTreeNode4 = new DefaultMutableTreeNode(((LigaNacional)GerenciadorJogo.SR.N().get(n2)).ek().get(n3));
                    defaultMutableTreeNode3.add(defaultMutableTreeNode4);
                    ++n3;
                }
            }
            ++n2;
        }
        if (this.um.size() > 0) {
            defaultMutableTreeNode2 = new DefaultMutableTreeNode("Internacionais");
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            n2 = 0;
            while (n2 < this.um.size()) {
                defaultMutableTreeNode4 = new DefaultMutableTreeNode(this.um.get(n2));
                defaultMutableTreeNode2.add(defaultMutableTreeNode4);
                ++n2;
            }
        }
    }

    /** Ocupa a janela toda (com o fundo do estádio); em janelas pequenas a rolagem do jogo assume. */
    @Override
    public Dimension getPreferredSize() {
        return TemaBetfoot.Tela.tamanho(this, 1100, 680);
    }

    /** Ícone da bandeira de um país pelo nome (os nós de país da árvore guardam só o nome). */
    private static javax.swing.Icon bandeira(String string) {
        try {
            javax.swing.Icon icon = ((nucleo.DadosPais)nucleo.UtilitariosTexto.cY().get(nucleo.UtilitariosTexto.h(string))).jD();
            if (icon instanceof ImageIcon && ((ImageIcon)icon).getDescription() != null) {
                java.util.regex.Matcher m = java.util.regex.Pattern.compile("/aflags/(\\d+)\\.png").matcher(((ImageIcon)icon).getDescription());
                if (m.find()) {
                    return TemaBetfoot.bandeira(Integer.parseInt(m.group(1)), 14);
                }
            }
            return icon;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /** Seta do nó da árvore (para a direita fechado, para baixo aberto). */
    private static javax.swing.Icon seta(final boolean aberta) {
        return new javax.swing.Icon() {
            @Override
            public void paintIcon(Component component, java.awt.Graphics graphics, int x, int y) {
                java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                g.setStroke(new java.awt.BasicStroke(1.6f, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND));
                java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();
                if (aberta) {
                    p.moveTo(x + 2, y + 4);
                    p.lineTo(x + 6, y + 8);
                    p.lineTo(x + 10, y + 4);
                } else {
                    p.moveTo(x + 4, y + 2);
                    p.lineTo(x + 8, y + 6);
                    p.lineTo(x + 4, y + 10);
                }
                g.draw(p);
                g.dispose();
            }

            @Override
            public int getIconWidth() {
                return 12;
            }

            @Override
            public int getIconHeight() {
                return 12;
            }
        };
    }

    /** Árvore no tema: país com bandeira, divisões em caixa alta, times com escudo. */
    private static class RenderizadorArvore
    extends javax.swing.tree.DefaultTreeCellRenderer {
        RenderizadorArvore() {
            this.setBackgroundNonSelectionColor(TemaBetfoot.LINHA_IMPAR);
            this.setBackgroundSelectionColor(TemaBetfoot.VERDE_SELECAO);
            this.setBorderSelectionColor(null);
            this.setTextNonSelectionColor(TemaBetfoot.TEXTO);
            this.setTextSelectionColor(Color.WHITE);
        }

        @Override
        public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n, boolean bl4) {
            super.getTreeCellRendererComponent(jTree, object, bl, bl2, bl3, n, false);
            Object valor = ((DefaultMutableTreeNode)object).getUserObject();
            int nivel = ((DefaultMutableTreeNode)object).getLevel();
            this.setIconTextGap(10);
            this.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 10));
            if (valor instanceof ModeloTime) {
                this.setText(((ModeloTime)valor).getNome());
                this.setIcon(TemaBetfoot.encaixar(((ModeloTime)valor).kU(), 22));
                this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            } else if (nivel == 1) {
                this.setText(String.valueOf(valor));
                this.setIcon("Internacionais".equals(valor) ? new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.MAPA, 14, TemaBetfoot.TEXTO_SUAVE) : TelaCriarTorneioAmistoso.bandeira(String.valueOf(valor)));
                this.setFont(TemaBetfoot.fonte(Font.BOLD, 14.0f));
            } else {
                this.setText(String.valueOf(valor).toUpperCase());
                this.setIcon(null);
                this.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.06f));
                if (!bl) {
                    this.setForeground(TemaBetfoot.TEXTO_SUAVE);
                }
            }
            return this;
        }
    }

    private static String sem(String string) {
        return java.text.Normalizer.normalize(string, java.text.Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
    }

    /** Busca: vai para o próximo time cujo nome contém o texto (sem acento), abrindo os grupos até ele. */
    private void buscar(String string) {
        String alvo = TelaCriarTorneioAmistoso.sem(string.trim());
        if (alvo.isEmpty()) {
            return;
        }
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)this.uw.getModel().getRoot();
        java.util.List<DefaultMutableTreeNode> achados = new ArrayList<DefaultMutableTreeNode>();
        java.util.Enumeration<?> e = raiz.depthFirstEnumeration();
        while (e.hasMoreElements()) {
            DefaultMutableTreeNode no = (DefaultMutableTreeNode)e.nextElement();
            if (no.getUserObject() instanceof ModeloTime && TelaCriarTorneioAmistoso.sem(((ModeloTime)no.getUserObject()).getNome()).contains(alvo)) {
                achados.add(no);
            }
        }
        if (achados.isEmpty()) {
            this.zh.setText("Nenhum time com \"" + string.trim() + "\"");
            return;
        }
        this.zh.setText("");
        DefaultMutableTreeNode atual = (DefaultMutableTreeNode)this.uw.getLastSelectedPathComponent();
        int i = atual == null ? -1 : achados.indexOf(atual);
        javax.swing.tree.TreePath caminho = new javax.swing.tree.TreePath(achados.get((i + 1) % achados.size()).getPath());
        this.uw.setSelectionPath(caminho);
        this.uw.scrollPathToVisible(caminho);
    }

    /** Participantes: posição, escudo e nome, grupo; o seu time leva o selo "Seu time" e não sai da lista. */
    private class RenderizadorParticipantes
    extends javax.swing.table.DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
            ModeloTime time = (ModeloTime)object;
            this.setIcon(null);
            this.setText("");
            this.setToolTipText(null);
            this.setHorizontalAlignment(LEFT);
            this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            if (time == null) {
                return this;
            }
            boolean fora = time.Au() < 0;
            if (n2 == 0) {
                this.setText(Integer.toString(n + 1));
                this.setFont(TemaBetfoot.display(16.0f));
                this.setHorizontalAlignment(CENTER);
            } else if (n2 == 1) {
                this.setText(time.getNome());
                this.setIcon(TemaBetfoot.encaixar(time.kU(), 24));
                this.setIconTextGap(10);
            } else if (n2 == 2) {
                this.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.06f));
                this.setText(fora ? "FICA DE FORA" : (time.Au() == 0 ? "GRUPO A" : (time.Au() == 1 ? "GRUPO B" : (TelaCriarTorneioAmistoso.this.CS.isSelected() ? "SORTEIO" : ""))));
            } else if (n2 == 3) {
                this.setHorizontalAlignment(CENTER);
                if (time == TelaCriarTorneioAmistoso.this.ul) {
                    this.setFont(TemaBetfoot.espacada(TemaBetfoot.display(12.0f), 0.06f));
                    this.setText("SEU TIME");
                } else {
                    this.setIcon(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.LIXEIRA, 14, TemaBetfoot.alfa(TemaBetfoot.VERMELHO, 0.8)));
                    this.setToolTipText("Tirar do torneio");
                }
            }
            if (fora) {
                this.setForeground(TemaBetfoot.VERMELHO);
            } else if (n2 == 2 || n2 == 0 || n2 == 3 && time == TelaCriarTorneioAmistoso.this.ul) {
                this.setForeground(n2 == 3 ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_SUAVE);
            }
            return this;
        }
    }

    private void temaParticipantes() {
        RenderizadorParticipantes renderizador = new RenderizadorParticipantes();
        this.vn.setDefaultRenderer(ModeloTime.class, renderizador);
        this.vn.setDefaultRenderer(Object.class, renderizador);
        this.vn.setTableHeader(new javax.swing.table.JTableHeader(this.vn.getColumnModel()));
        TemaBetfoot.tabela(this.vn, this.wi);
        this.vn.setTableHeader(null);
        this.wi.setColumnHeaderView(null);
        int[] larguras = new int[]{44, 240, 120, 90};
        for (int i = 0; i < larguras.length; ++i) {
            this.vn.getColumnModel().getColumn(i).setPreferredWidth(larguras[i]);
            this.vn.getColumnModel().getColumn(i).setMaxWidth(i == 1 ? Integer.MAX_VALUE : larguras[i] + 30);
        }
        this.vn.setRowHeight(40);
        this.vn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                int linha = TelaCriarTorneioAmistoso.this.vn.rowAtPoint(mouseEvent.getPoint());
                if (linha >= 0 && TelaCriarTorneioAmistoso.this.vn.columnAtPoint(mouseEvent.getPoint()) == 3) {
                    TelaCriarTorneioAmistoso.this.vn.setRowSelectionInterval(linha, linha);
                    TelaCriarTorneioAmistoso.this.nB();
                }
            }
        });
    }

    /** Avisa a tabela de participantes que a lista mudou (addNotify não avisa e deixava linhas velhas na tela). */
    private void atualizarParticipantes() {
        int selecionada = this.vn.getSelectedRow();
        ((javax.swing.table.AbstractTableModel)this.vn.getModel()).fireTableDataChanged();
        if (selecionada >= 0 && selecionada < this.vn.getRowCount()) {
            this.vn.setRowSelectionInterval(selecionada, selecionada);
        }
        this.vn.revalidate();
        this.vn.repaint();
    }

    private static JPanel campo(String rotulo, Component component) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(0, 8));
        jPanel.setOpaque(false);
        jPanel.add((Component)TemaBetfoot.rotulo(rotulo), "North");
        jPanel.add(component, "Center");
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, jPanel.getPreferredSize().height));
        return jPanel;
    }

    private void voltar() {
        if (!TemaBetfoot.confirmar(this, "Voltar ao técnico e time?", "O técnico e o time escolhidos serão refeitos. As competições marcadas continuam.", "Voltar", false)) {
            return;
        }
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        PainelConfiguracaoNovoJogo.voltarParaTecnico();
    }

    private void mJ() {
        this.uu = new JLabel();
        this.uv = new JPanel();
        this.a_ = new JLabel();
        this.us = new JLabel();
        this.afG = new JComboBox();
        this.Bw = new JButton();
        this.ut = new JScrollPane();
        this.uw = new JTree(new DefaultTreeModel(new DefaultMutableTreeNode("Times")));
        this.vx = new JLabel();
        this.Nr = new JTextField("Torneio Amistoso");
        this.vy = new JLabel();
        this.wi = new JScrollPane();
        this.vn = new JTable() {
            @Override
            public Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
                Component component = super.prepareRenderer(tableCellRenderer, n, n2);
                Color frente = component.getForeground();
                TemaBetfoot.linha(this, component, n, n2);
                if (!this.isRowSelected(n)) {
                    component.setForeground(frente);
                }
                return component;
            }

            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
        this.yV = new JButton();
        this.yZ = new JButton();
        this.vz = new JLabel();
        this.zh = new JLabel();
        this.afH = new JTextField("Juazeiro");
        this.afF = new JButton();
        this.CS = new JCheckBox("Sortear grupos");
        this.afE = new JButton();
        this.uC = new JButton();
        this.ug = new JLabel();
        this.Nr.addActionListener(new OuvinteVazioNomeTorneio(this));
        this.afH.addActionListener(new OuvinteVazioSedeTorneio(this));
        this.setLayout(new java.awt.BorderLayout());
        this.setOpaque(false);

        // ---- Times (árvore com busca) ----
        this.uw.setRootVisible(false);
        this.uw.setShowsRootHandles(true);
        this.uw.putClientProperty("JTree.lineStyle", "None");
        this.uw.setRowHeight(34);
        this.uw.setBackground(TemaBetfoot.LINHA_IMPAR);
        this.uw.setCellRenderer(new RenderizadorArvore());
        if (this.uw.getUI() instanceof javax.swing.plaf.basic.BasicTreeUI) {
            javax.swing.plaf.basic.BasicTreeUI ui = (javax.swing.plaf.basic.BasicTreeUI)this.uw.getUI();
            ui.setExpandedIcon(TelaCriarTorneioAmistoso.seta(true));
            ui.setCollapsedIcon(TelaCriarTorneioAmistoso.seta(false));
            ui.setLeftChildIndent(8);
            ui.setRightChildIndent(14);
        }
        this.uw.setToolTipText("Clique duplo num time para adicionar");
        this.uw.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                javax.swing.tree.TreePath caminho = TelaCriarTorneioAmistoso.this.uw.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                if (mouseEvent.getClickCount() == 2 && caminho != null && ((DefaultMutableTreeNode)caminho.getLastPathComponent()).getUserObject() instanceof ModeloTime) {
                    TelaCriarTorneioAmistoso.this.yV.doClick();
                }
            }
        });
        this.ut.setViewportView(this.uw);
        TemaBetfoot.rolagem(this.ut);
        final JTextField busca = new TemaBetfoot.Campo("Buscar time");
        JButton lupa = new JButton();
        lupa.addActionListener(actionEvent -> this.buscar(busca.getText()));
        busca.setToolTipText("Enter vai para o próximo time com esse nome");
        TemaBetfoot.Cartao times = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        times.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel topoTimes = new JPanel(new java.awt.BorderLayout(0, 12));
        topoTimes.setOpaque(false);
        topoTimes.add((Component)TemaBetfoot.cabecalho("Times", "Clique duplo para adicionar", null), "North");
        topoTimes.add((Component)TemaBetfoot.caixaBusca(busca, lupa), "South");
        times.add((Component)topoTimes, "North");
        times.add((Component)this.ut, "Center");
        TemaBetfoot.botao(this.yV, Estilo.SECUNDARIO, "Adicionar", Simbolo.AVANCAR);
        this.yV.setToolTipText("Adicionar o time selecionado ao torneio");
        this.yV.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JPanel baseTimes = new JPanel(new java.awt.BorderLayout());
        baseTimes.setOpaque(false);
        baseTimes.add((Component)this.yV, "East");
        times.add((Component)baseTimes, "South");

        // ---- Participantes ----
        this.vz.setFont(TemaBetfoot.espacada(TemaBetfoot.display(16.0f), 0.06f));
        this.wi.setViewportView(this.vn);
        TemaBetfoot.rolagem(this.wi);
        TemaBetfoot.Cartao participantes = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        participantes.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        participantes.add((Component)TemaBetfoot.cabecalho("Participantes", "A ordem define os grupos; mude com as setas", this.vz), "North");
        participantes.add((Component)this.wi, "Center");
        TemaBetfoot.botao(this.afF, Estilo.CHIP, "Subir", Simbolo.SUBIR);
        TemaBetfoot.botao(this.afE, Estilo.CHIP, "Descer", Simbolo.DESCER);
        TemaBetfoot.botao(this.yZ, Estilo.CHIP, "Remover", Simbolo.LIXEIRA);
        this.yZ.setToolTipText("Tirar o time selecionado (o seu time não sai)");
        JPanel acoes = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        acoes.setOpaque(false);
        acoes.add(this.afF);
        acoes.add(javax.swing.Box.createHorizontalStrut(8));
        acoes.add(this.afE);
        JPanel baseParticipantes = new JPanel(new java.awt.BorderLayout());
        baseParticipantes.setOpaque(false);
        baseParticipantes.add((Component)acoes, "West");
        baseParticipantes.add((Component)this.yZ, "East");
        participantes.add((Component)baseParticipantes, "South");

        // ---- Torneio ----
        // Campos juntos no topo; o aviso de receita embaixo.
        TemaBetfoot.Cartao torneio = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 16));
        torneio.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        torneio.add((Component)TemaBetfoot.cabecalho("Torneio", "Nome, sede e fórmula", null), "North");
        JPanel campos = new JPanel();
        campos.setOpaque(false);
        campos.setLayout(new javax.swing.BoxLayout(campos, 1));
        campos.setAlignmentX(0.0f);
        campos.add(TelaCriarTorneioAmistoso.campo("Nome do torneio", this.Nr));
        campos.add(javax.swing.Box.createVerticalStrut(14));
        this.afH.setToolTipText("Cidade que recebe os jogos");
        campos.add(TelaCriarTorneioAmistoso.campo("Sede", this.afH));
        campos.add(javax.swing.Box.createVerticalStrut(14));
        this.afG.setPreferredSize(new Dimension(220, 40));
        campos.add(TelaCriarTorneioAmistoso.campo("Fórmula", this.afG));
        campos.add(javax.swing.Box.createVerticalStrut(14));
        JPanel sorteio = new JPanel(new java.awt.BorderLayout(0, 2));
        sorteio.setOpaque(false);
        sorteio.add((Component)this.CS, "North");
        JLabel dicaSorteio = new JLabel("Os grupos são sorteados, sem seguir a ordem");
        dicaSorteio.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
        dicaSorteio.setForeground(TemaBetfoot.TEXTO_FRACO);
        dicaSorteio.setBorder(BorderFactory.createEmptyBorder(0, 26, 0, 0));
        dicaSorteio.putClientProperty("tema.ok", Boolean.TRUE);
        sorteio.add((Component)dicaSorteio, "Center");
        sorteio.setAlignmentX(0.0f);
        campos.add(sorteio);
        TemaBetfoot.aplicarTema(campos);
        this.Nr.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        this.afH.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        JPanel topoCampos = new JPanel(new java.awt.BorderLayout());
        topoCampos.setOpaque(false);
        topoCampos.add((Component)campos, "North");
        torneio.add((Component)topoCampos, "Center");
        JPanel baseTorneio = new JPanel(new java.awt.BorderLayout());
        baseTorneio.setOpaque(false);
        baseTorneio.add((Component)TemaBetfoot.divisor(), "North");
        this.ug.setText("<html>Jogos em centros de treinamento: não geram receita para os times.</html>");
        this.ug.setIcon(new TemaBetfoot.IconeVetor(Simbolo.ESTADIO, 16, TemaBetfoot.TEXTO_FRACO));
        this.ug.setIconTextGap(10);
        this.ug.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        this.ug.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
        this.ug.setForeground(TemaBetfoot.TEXTO_SUAVE);
        baseTorneio.add((Component)this.ug, "Center");
        torneio.add((Component)baseTorneio, "South");

        JPanel colunas = new JPanel(new java.awt.GridBagLayout());
        colunas.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.fill = java.awt.GridBagConstraints.BOTH;
        c.weighty = 1.0;
        c.gridy = 0;
        c.gridx = 0;
        c.weightx = 1.0;
        c.insets = new java.awt.Insets(0, 0, 0, 20);
        times.setPreferredSize(new Dimension(340, 400));
        colunas.add((Component)times, c);
        c.gridx = 1;
        c.weightx = 1.2;
        participantes.setPreferredSize(new Dimension(400, 400));
        colunas.add((Component)participantes, c);
        c.gridx = 2;
        c.weightx = 0.0;
        c.insets = new java.awt.Insets(0, 0, 0, 0);
        torneio.setPreferredSize(new Dimension(330, 400));
        colunas.add((Component)torneio, c);

        // ---- Rodapé ----
        JButton voltar = TemaBetfoot.botao(new JButton(), Estilo.FANTASMA, "Voltar", Simbolo.VOLTAR);
        voltar.setToolTipText("Voltar para técnico e time");
        voltar.addActionListener(actionEvent -> this.voltar());
        TemaBetfoot.botao(this.uC, Estilo.SECUNDARIO, "Pular torneio", null);
        this.uC.setToolTipText("Começar a carreira sem torneio amistoso");
        TemaBetfoot.botao(this.Bw, Estilo.PRIMARIO, "Iniciar torneio", null);
        this.Bw.setIcon(new TemaBetfoot.IconeVetor(Simbolo.APITO, 16, Color.WHITE));
        this.zh.setFont(TemaBetfoot.fonte(Font.BOLD, 13.0f));
        this.zh.setForeground(TemaBetfoot.VERMELHO);
        JPanel direita = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 12, 0));
        direita.setOpaque(false);
        direita.add(this.zh);
        direita.add(this.uC);
        direita.add(this.Bw);
        JPanel rodape = new JPanel(new java.awt.BorderLayout(16, 0));
        rodape.setOpaque(false);
        rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(16, 0, 0, 0)));
        rodape.add((Component)voltar, "West");
        rodape.add((Component)direita, "East");

        JPanel corpo = new JPanel(new java.awt.BorderLayout(0, 18));
        corpo.setOpaque(false);
        corpo.add((Component)colunas, "Center");
        corpo.add((Component)rodape, "South");
        JPanel topo = new JPanel(new java.awt.BorderLayout(24, 0));
        topo.setOpaque(false);
        topo.add((Component)new TemaBetfoot.Marca("Torneio amistoso", "Pré-temporada com os times que você escolher"), "West");
        JPanel passos = new JPanel(new java.awt.GridBagLayout());
        passos.setOpaque(false);
        passos.add(new TemaBetfoot.Passos(2, "Competições", "Técnico e time", "Amistoso"));
        topo.add((Component)passos, "East");
        TemaBetfoot.Fundo fundo = new TemaBetfoot.Fundo(new java.awt.BorderLayout(0, 22));
        fundo.setBorder(BorderFactory.createEmptyBorder(20, 28, 24, 28));
        fundo.add((Component)topo, "North");
        fundo.add((Component)TemaBetfoot.centralizar(corpo, 1320), "Center");
        this.add((Component)fundo, "Center");
    }

    private void d(ActionEvent actionEvent) {
    }

    private void e(ActionEvent actionEvent) {
    }

    static /* synthetic */ void a(TelaCriarTorneioAmistoso jH2) {
        jH2.pO();
    }

    static /* synthetic */ void b(TelaCriarTorneioAmistoso jH2) {
        jH2.pn();
    }

    static /* synthetic */ void c(TelaCriarTorneioAmistoso jH2) {
        jH2.AV();
    }

    static /* synthetic */ void d(TelaCriarTorneioAmistoso jH2) {
        jH2.nB();
    }

    static /* synthetic */ void e(TelaCriarTorneioAmistoso jH2) {
        jH2.nA();
    }

    static /* synthetic */ void a(TelaCriarTorneioAmistoso jH2, int n2) {
        jH2.fz(n2);
    }

    static /* synthetic */ void f(TelaCriarTorneioAmistoso jH2) {
        jH2.AT();
    }

    static /* synthetic */ JTree g(TelaCriarTorneioAmistoso jH2) {
        return jH2.uw;
    }

    static /* synthetic */ void a(TelaCriarTorneioAmistoso jH2, ModeloTime ah2) {
        jH2.zY = ah2;
    }

    static /* synthetic */ void a(TelaCriarTorneioAmistoso jH2, ActionEvent actionEvent) {
        jH2.d(actionEvent);
    }

    static /* synthetic */ void b(TelaCriarTorneioAmistoso jH2, ActionEvent actionEvent) {
        jH2.e(actionEvent);
    }
}

