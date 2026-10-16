package telas;

import telas.DialogoConfigCampeonatosEstaduais;
import telas.DialogoConfigLigas;
import telas.DialogoConfigCompeticoesInternacionais;
import telas.DialogoEscolhaRegionais;
import telas.TelaInicial;
import telas.OuvinteCliqueTabelaLigas;
import telas.OuvinteJogaEstaduais;
import telas.OuvinteJogaRegionais;
import telas.OuvinteSalarioMensal;
import telas.OuvinteSalarioSemanal;
import telas.ListenerUsarGruposCopa2026;
import telas.ListenerHabilidadeIndividualCheck;
import telas.ListenerHabilidadeIndividualCheckSecundario;
import telas.ListenerIniciarJogo;
import telas.OuvinteSelecionarTodasLigas;
import telas.ListenerEditarLigaSelecionada;
import telas.ListenerEditarCampeonatoSelecionado;
import telas.OuvintePreferenciasConfigIniciais;
import telas.OuvinteConfigurarRegionais;
import telas.ListenerJogarInternacionaisClubes;
import telas.ListenerJogarSelecoesCheck;
import telas.ListenerIniciarJogo2;
import tabelas.ModeloTabelaEstadosTimes;
import tabelas.ModeloTabelaSelecaoPais;
import nucleo.ItemSelecaoPais;
import nucleo.ConstantesJogo;
import nucleo.IniciadorCarreira;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import components.TemaBetfoot;
import components.TemaBetfoot.Estilo;
import components.TemaBetfoot.Simbolo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TelaConfiguracoesIniciais
extends JPanel {
    private JFrame Br;
    private JButton Mb;
    private JButton Mc;
    private JButton Md;
    private JButton Me;
    private JButton Bw;
    private JButton Mf;
    private JButton Mg;
    private JCheckBox Mh;
    private JCheckBox afz;
    private JCheckBox Mi;
    private JCheckBox Mj;
    private JCheckBox Mk;
    private JComboBox afA;
    private ButtonGroup Ml;
    private ButtonGroup Mm;
    private JLabel ug;
    private JScrollPane ut;
    private JRadioButton Mu;
    private JRadioButton Mv;
    private JRadioButton Mw;
    private JRadioButton Mx;
    private JScrollPane My;
    private JTable Mz;
    private JTable JG;
    private final JLabel resumoLigas = new JLabel();
    private final JLabel seloEstaduais = new JLabel();

    public TelaConfiguracoesIniciais(JFrame jFrame) {
        this.Br = jFrame;
        this.mJ();
        if (GerenciadorJogo.SR.bF.size() > 0) {
            this.sn();
        }
        this.so();
        this.mH();
        this.sm();
        this.mQ();
    }

    private void mQ() {
        this.afA.addItem("2026");
        this.afA.addItem("2027");
        if (ConstantesJogo.am("anoinicio") == 1) {
            this.afA.setSelectedIndex(1);
        } else {
            this.afA.setSelectedIndex(0);
        }
    }

    private void sm() {
        this.ug.setVisible(false);
    }

    public void sn() {
        ModeloTabelaSelecaoPais p2 = new ModeloTabelaSelecaoPais();
        this.JG.setModel(p2);
        this.JG.getColumnModel().getColumn(0).setPreferredWidth(56);
        this.JG.getColumnModel().getColumn(0).setMaxWidth(64);
        this.JG.getColumnModel().getColumn(1).setPreferredWidth(220);
        this.JG.getColumnModel().getColumn(2).setPreferredWidth(70);
        this.JG.getColumnModel().getColumn(2).setMaxWidth(90);
        this.JG.setAutoResizeMode(3);
        RenderizadorLigas renderizador = new RenderizadorLigas();
        this.JG.setDefaultRenderer(Object.class, renderizador);
        this.JG.setDefaultRenderer(String.class, renderizador);
        this.JG.setDefaultRenderer(Integer.class, renderizador);
        this.JG.setAutoCreateRowSorter(false);
        this.JG.setCellSelectionEnabled(false);
        this.JG.setSelectionMode(0);
        this.JG.setRowSelectionAllowed(true);
        if (GerenciadorJogo.SR.bF.size() > 0) {
            this.JG.setRowSelectionInterval(0, 0);
            int n2 = 0;
            while (n2 < GerenciadorJogo.SR.bF.size()) {
                if (((ItemSelecaoPais)GerenciadorJogo.SR.bF.get(n2)).getPais() == 29) {
                    ((ItemSelecaoPais)GerenciadorJogo.SR.bF.get(n2)).v(true);
                    this.JG.setRowSelectionInterval(n2, n2);
                    break;
                }
                ++n2;
            }
        }
        this.JG.addMouseListener(new OuvinteCliqueTabelaLigas(this));
        // Nome do país marca/desmarca; o lápis (coluna de times) abre a configuração da liga; depois, atualiza o resumo.
        this.JG.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                JTable t = TelaConfiguracoesIniciais.this.JG;
                int linha = t.rowAtPoint(mouseEvent.getPoint());
                int coluna = t.columnAtPoint(mouseEvent.getPoint());
                if (linha >= 0 && mouseEvent.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(mouseEvent)) {
                    if (coluna == 1) {
                        // O nome do país também marca/desmarca (a caixinha é tratada pelo ouvinte original).
                        ((ModeloTabelaSelecaoPais)t.getModel()).ex(t.convertRowIndexToModel(linha));
                    } else if (coluna == 2) {
                        t.setRowSelectionInterval(linha, linha);
                        TelaConfiguracoesIniciais.this.st();
                    }
                }
                SwingUtilities.invokeLater(TelaConfiguracoesIniciais.this::atualizarResumo);
            }
        });
        this.atualizarResumo();
    }

    public void so() {
        ModeloTabelaEstadosTimes l2 = new ModeloTabelaEstadosTimes();
        this.Mz.setModel(l2);
        this.Mz.getColumnModel().getColumn(0).setPreferredWidth(220);
        this.Mz.getColumnModel().getColumn(1).setPreferredWidth(70);
        this.Mz.getColumnModel().getColumn(1).setMaxWidth(90);
        this.Mz.setAutoResizeMode(3);
        RenderizadorEstados renderizador = new RenderizadorEstados();
        this.Mz.setDefaultRenderer(Object.class, renderizador);
        this.Mz.setDefaultRenderer(Integer.class, renderizador);
        this.Mz.setDefaultRenderer(String.class, renderizador);
        this.Mz.setAutoCreateRowSorter(false);
        this.Mz.setCellSelectionEnabled(false);
        this.Mz.setSelectionMode(0);
        this.Mz.setRowSelectionAllowed(true);
        this.Mz.setRowSelectionInterval(0, 0);
    }

    private void oq() {
        this.Bw.setCursor(new Cursor(3));
        if (this.afA.getSelectedIndex() == 1) {
            GerenciadorJogo.SR.I(2027);
            ConstantesJogo.f("anoinicio", 1);
        } else {
            GerenciadorJogo.SR.I(2026);
            ConstantesJogo.f("anoinicio", 0);
        }
        GerenciadorJogo.SR.setJogaEstadual(this.Mi.isSelected());
        GerenciadorJogo.SR.setJogaIntClubes(this.Mj.isSelected());
        GerenciadorJogo.SR.setJogaSelecoesAll(this.Mh.isSelected());
        if (GerenciadorJogo.SR.bj()) {
            IniciadorCarreira.dg();
            GerenciadorTelas.aY(1);
        } else {
            TemaBetfoot.aviso(this, "Nenhuma liga marcada", "Marque pelo menos uma liga nacional para come\u00e7ar a carreira.");
        }
    }

    public void mH() {
        this.Bw.addActionListener(new ListenerIniciarJogo(this));
        this.Mf.addActionListener(new OuvinteSelecionarTodasLigas(this));
        this.Md.addActionListener(new ListenerEditarLigaSelecionada(this));
        this.Mb.addActionListener(new ListenerEditarCampeonatoSelecionado(this));
        this.Mc.addActionListener(new OuvintePreferenciasConfigIniciais(this));
        this.Me.addActionListener(new OuvinteConfigurarRegionais(this));
        this.Mj.setSelected(GerenciadorJogo.SR.isJogaIntClubes());
        this.Mj.addActionListener(new ListenerJogarInternacionaisClubes(this));
        this.Mh.setSelected(GerenciadorJogo.SR.isJogaSelecoesAll());
        this.Mh.addActionListener(new ListenerJogarSelecoesCheck(this));
        this.Mi.setSelected(GerenciadorJogo.SR.isJogaEstadual());
        this.Mi.addActionListener(new OuvinteJogaEstaduais(this));
        this.Mk.setSelected(GerenciadorJogo.SR.isJogaRegionais());
        this.Mk.addActionListener(new OuvinteJogaRegionais(this));
        this.Mm.add(this.Mw);
        this.Mm.add(this.Mx);
        this.Ml.add(this.Mv);
        this.Ml.add(this.Mu);
        if (GerenciadorJogo.SR.isSalarioMensal()) {
            this.Mw.setSelected(true);
            this.Mx.setSelected(false);
        } else {
            this.Mx.setSelected(true);
            this.Mw.setSelected(false);
        }
        this.Mw.addActionListener(new OuvinteSalarioMensal(this));
        this.Mx.addActionListener(new OuvinteSalarioSemanal(this));
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            this.Mv.setSelected(true);
            this.Mu.setSelected(false);
        } else {
            this.Mv.setSelected(false);
            this.Mu.setSelected(true);
        }
        this.afz.setSelected(GerenciadorJogo.SR.isUsarGruposReaisCopa());
        this.afz.addActionListener(new ListenerUsarGruposCopa2026(this));
        this.Mv.addActionListener(new ListenerHabilidadeIndividualCheck(this));
        this.Mu.addActionListener(new ListenerHabilidadeIndividualCheckSecundario(this));
        this.Mg.addActionListener(new ListenerIniciarJogo2(this));
    }

    private void sp() {
        TelaInicial gq2 = new TelaInicial();
        gq2.pack();
        gq2.setSize(529, 321);
        gq2.setLocationRelativeTo(null);
        gq2.setVisible(true);
        GerenciadorTelas.db().setVisible(false);
    }

    public void rv() {
        GerenciadorTelas.a(null);
    }

    public void AS() {
        this.Mc.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.Br);
        DialogoConfigCompeticoesInternacionais do_ = new DialogoConfigCompeticoesInternacionais(jDialog);
        jDialog.add(do_);
        jDialog.setSize(400, 316);
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.pack();
        jDialog.setVisible(true);
        this.Mc.setCursor(new Cursor(12));
    }

    public void sr() {
        JDialog jDialog = TemaBetfoot.dialogo(this);
        DialogoEscolhaRegionais fZ2 = new DialogoEscolhaRegionais(jDialog);
        TemaBetfoot.vestir(jDialog, fZ2);
        jDialog.setVisible(true);
    }

    public void ss() {
        if (this.Mz.getSelectedRow() >= 0) {
            this.Mb.setCursor(new Cursor(3));
            int n2 = this.Mz.getSelectedRow();
            int n3 = GerenciadorJogo.SR.bE[this.Mz.getSelectedRow()];
            JDialog jDialog = TemaBetfoot.dialogo(this);
            DialogoConfigCampeonatosEstaduais cw_02 = new DialogoConfigCampeonatosEstaduais(n2, n3, jDialog);
            TemaBetfoot.vestir(jDialog, cw_02);
            this.Mb.setCursor(new Cursor(12));
            jDialog.setVisible(true);
            this.Mb.setCursor(new Cursor(12));
        }
    }

    public void st() {
        if (this.JG.getSelectedRow() >= 0) {
            this.Md.setCursor(new Cursor(3));
            int n2 = ((ItemSelecaoPais)GerenciadorJogo.SR.bF.get(this.JG.getSelectedRow())).getPais();
            int n3 = ((ItemSelecaoPais)GerenciadorJogo.SR.bF.get(this.JG.getSelectedRow())).iB();
            JDialog jDialog = TemaBetfoot.dialogo(this);
            DialogoConfigLigas dG2 = new DialogoConfigLigas(n2, n3, jDialog);
            TemaBetfoot.vestir(jDialog, dG2);
            this.Md.setCursor(new Cursor(12));
            jDialog.setVisible(true);
            this.Md.setCursor(new Cursor(12));
        }
    }

    /** Ocupa a janela toda (com o fundo do estádio); em janelas pequenas a rolagem do jogo assume. */
    @Override
    public Dimension getPreferredSize() {
        return TemaBetfoot.Tela.tamanho(this, 1180, 700);
    }

    /** "3 ligas · 812 times" no cabeçalho do cartão de ligas. */
    private void atualizarResumo() {
        int ligas = 0;
        int times = 0;
        for (Object object : GerenciadorJogo.SR.bF) {
            ItemSelecaoPais item = (ItemSelecaoPais)object;
            if (item.iC()) {
                ++ligas;
                times += item.iB();
            }
        }
        this.resumoLigas.setText(ligas == 0 ? "NENHUMA LIGA" : ligas + (ligas == 1 ? " LIGA" : " LIGAS") + "  ·  " + times + " TIMES");
        this.resumoLigas.setForeground(ligas == 0 ? TemaBetfoot.VERMELHO : TemaBetfoot.VERDE);
        this.JG.repaint();
    }

    /** Caixa de seleção com uma linha de explicação embaixo. */
    private static JPanel opcao(AbstractButton botao, String dica) {
        JPanel jPanel = new JPanel(new BorderLayout(0, 2));
        jPanel.setOpaque(false);
        jPanel.add((Component)botao, "North");
        if (dica != null) {
            JLabel jLabel = new JLabel(dica);
            jLabel.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
            jLabel.setForeground(TemaBetfoot.TEXTO_FRACO);
            jLabel.setBorder(BorderFactory.createEmptyBorder(0, 26, 0, 0));
            jLabel.putClientProperty("tema.ok", Boolean.TRUE);
            jPanel.add((Component)jLabel, "Center");
        }
        // Só a caixa e a dica: aplicarTema aqui não alcança os botões vizinhos.
        TemaBetfoot.aplicarTema(jPanel);
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, jPanel.getPreferredSize().height));
        return jPanel;
    }

    /** Duas opções lado a lado (rádios) com o rótulo da regra em cima. */
    private static JPanel regra(String titulo, AbstractButton a, AbstractButton b) {
        JPanel jPanel = new JPanel(new BorderLayout(0, 8));
        jPanel.setOpaque(false);
        jPanel.add((Component)TemaBetfoot.rotulo(titulo), "North");
        JPanel linha = new JPanel(new java.awt.GridLayout(1, 2, 12, 0));
        linha.setOpaque(false);
        linha.add(a);
        linha.add(b);
        TemaBetfoot.aplicarTema(linha);
        jPanel.add((Component)linha, "Center");
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, jPanel.getPreferredSize().height));
        return jPanel;
    }

    private static Component espaco(int n) {
        return javax.swing.Box.createVerticalStrut(n);
    }

    /** Tabela no tema: linhas altas, seleção verde com barra à esquerda. */
    private static JTable tabelaTema() {
        return new JTable() {
            @Override
            public Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
                return TemaBetfoot.linha(this, super.prepareRenderer(tableCellRenderer, n, n2), n, n2);
            }

            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
    }

    /** Ligas: marcador de jogar, bandeira + país e número de times. */
    private static class RenderizadorLigas
    extends javax.swing.table.DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
            this.setIcon(null);
            this.setHorizontalAlignment(LEFT);
            this.setIconTextGap(10);
            this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            if (n2 == 0) {
                int marcado = object instanceof Integer ? (Integer)object : 0;
                this.setIcon(TemaBetfoot.marcador(marcado == 1));
                this.setText(null);
                this.setHorizontalAlignment(CENTER);
                this.setToolTipText(marcado == 1 ? "Liga na carreira (clique para tirar)" : "Clique para jogar esta liga");
            } else if (n2 == 1) {
                int pais = Integer.parseInt(String.valueOf(object));
                this.setText(nucleo.EnumPaises.valueOf("P" + pais).getNome());
                this.setIcon(TemaBetfoot.bandeira(pais, 14));
                this.setToolTipText(null);
            } else {
                this.setHorizontalAlignment(RIGHT);
                this.setFont(TemaBetfoot.display(16.0f));
                this.setToolTipText(null);
            }
            return this;
        }
    }

    /**
     * Lista dos estaduais: não tem seleção (todos entram na carreira). A linha sob o mouse acende e mostra o lápis
     * de configurar; sem "Jogar estaduais", a lista fica apagada e não abre nada.
     */
    private class TabelaClicavel
    extends JTable {
        private final java.util.function.IntPredicate marcada;
        private final String dicaMarcar;
        private final String dicaConfigurar;

        /** marcada: linha que entra na carreira (fundo verde); null quando a lista não é de escolha. */
        TabelaClicavel(java.util.function.IntPredicate intPredicate, String string, String string2) {
            this.marcada = intPredicate;
            this.dicaMarcar = string;
            this.dicaConfigurar = string2;
            java.awt.event.MouseAdapter mouseAdapter = new java.awt.event.MouseAdapter() {
                @Override
                public void mouseMoved(java.awt.event.MouseEvent mouseEvent) {
                    int linha = TabelaClicavel.this.isEnabled() ? TabelaClicavel.this.rowAtPoint(mouseEvent.getPoint()) : -1;
                    if (!Integer.valueOf(linha).equals(TabelaClicavel.this.getClientProperty("hover"))) {
                        TabelaClicavel.this.putClientProperty("hover", linha);
                        TabelaClicavel.this.repaint();
                    }
                    TabelaClicavel.this.setCursor(new Cursor(linha >= 0 ? Cursor.HAND_CURSOR : Cursor.DEFAULT_CURSOR));
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent mouseEvent) {
                    TabelaClicavel.this.putClientProperty("hover", -1);
                    TabelaClicavel.this.repaint();
                }
            };
            this.addMouseListener(mouseAdapter);
            this.addMouseMotionListener(mouseAdapter);
            this.setToolTipText("");
        }

        /** Coluna que abre a configuração (a última); nas outras, quando há marcação, o clique marca/desmarca. */
        boolean ehConfigurar(int n) {
            return this.marcada == null || n == this.getColumnCount() - 1;
        }

        @Override
        public String getToolTipText(java.awt.event.MouseEvent mouseEvent) {
            if (!this.isEnabled() || this.rowAtPoint(mouseEvent.getPoint()) < 0) {
                return null;
            }
            return this.ehConfigurar(this.columnAtPoint(mouseEvent.getPoint())) ? this.dicaConfigurar : this.dicaMarcar;
        }

        @Override
        public Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
            Component component = super.prepareRenderer(tableCellRenderer, n, n2);
            boolean emCima = Integer.valueOf(n).equals(this.getClientProperty("hover"));
            boolean dentro = this.marcada != null && this.marcada.test(this.convertRowIndexToModel(n));
            Color fundo = dentro ? new Color(14, 46, 29) : TemaBetfoot.LINHA_IMPAR;
            component.setBackground(emCima ? (dentro ? new Color(19, 58, 37) : new Color(24, 40, 32)) : fundo);
            component.setForeground(!this.isEnabled() ? TemaBetfoot.TEXTO_FRACO : (emCima || dentro ? Color.WHITE : (this.marcada != null ? TemaBetfoot.TEXTO_SUAVE : TemaBetfoot.TEXTO)));
            if (component instanceof JLabel) {
                JLabel l = (JLabel)component;
                l.setBorder(BorderFactory.createEmptyBorder(0, n2 == 0 ? 14 : 6, 0, n2 == 0 ? 6 : 12));
                if (n2 == this.getColumnCount() - 1) {
                    // Lápis sempre à vista (apagado), verde na linha sob o mouse: é ali que se configura.
                    l.setIcon(new TemaBetfoot.IconeVetor(Simbolo.LAPIS, 14, emCima && this.isEnabled() ? TemaBetfoot.VERDE : TemaBetfoot.alfa(TemaBetfoot.TEXTO_FRACO, 0.6)));
                    l.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
                    l.setIconTextGap(12);
                } else {
                    l.setHorizontalTextPosition(javax.swing.SwingConstants.TRAILING);
                }
            }
            return component;
        }

        @Override
        public boolean isCellEditable(int n, int n2) {
            return false;
        }
    }

    /** Estaduais: nome do estado e número de times. */
    private static class RenderizadorEstados
    extends javax.swing.table.DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
            this.setIcon(null);
            if (n2 == 0) {
                this.setText(ConstantesJogo.rY[(Integer)object]);
                this.setHorizontalAlignment(LEFT);
                this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            } else {
                this.setHorizontalAlignment(RIGHT);
                this.setFont(TemaBetfoot.display(16.0f));
            }
            return this;
        }
    }

    private void mJ() {
        this.Mm = new ButtonGroup();
        this.Ml = new ButtonGroup();
        this.ut = new JScrollPane();
        this.JG = new TabelaClicavel(linha -> ((ItemSelecaoPais)GerenciadorJogo.SR.bF.get(linha)).iC(), "Clique para jogar ou tirar esta liga", "Configurar divis\u00f5es, acesso e rebaixamento desta liga");
        this.Mf = new JButton();
        this.Md = new JButton();
        this.Mh = new JCheckBox();
        this.Mj = new JCheckBox();
        this.Mc = new JButton();
        this.afz = new JCheckBox();
        this.Mb = new JButton();
        this.My = new JScrollPane();
        this.Mz = new TabelaClicavel(null, null, "Configurar as divis\u00f5es deste estadual");
        this.Mk = new JCheckBox();
        this.Me = new JButton();
        this.Mi = new JCheckBox();
        this.Mg = new JButton();
        this.Bw = new JButton();
        this.Mw = new JRadioButton("Mensal");
        this.Mx = new JRadioButton("Semanal");
        this.Mu = new JRadioButton("Modo clássico");
        this.Mv = new JRadioButton("Individual");
        this.afA = new JComboBox();
        this.ug = new JLabel();
        this.Mm.add(this.Mw);
        this.Mm.add(this.Mx);
        this.Ml.add(this.Mu);
        this.Ml.add(this.Mv);
        this.Mw.setToolTipText("Salários e finanças contados por mês");
        this.Mx.setToolTipText("Salários e finanças contados por semana");
        this.Mv.setToolTipText("Cada jogador tem a sua força");
        this.Mu.setToolTipText("Força como no Brasfoot clássico");
        this.Mh.setText("Jogar competições de seleções");
        this.Mj.setText("Jogar taças internacionais de clubes");
        this.afz.setText("Usar grupos da Copa do Mundo 2026");
        this.Mi.setText("Jogar estaduais");
        this.Mk.setText("Jogar regionais");
        this.setLayout(new BorderLayout());
        this.setOpaque(false);

        // ---- Ligas nacionais ----
        TemaBetfoot.botao(this.Md, Estilo.SECUNDARIO, "Configurar liga", Simbolo.LAPIS);
        this.Md.setToolTipText("Divisões, rebaixamento e formato da liga selecionada (ou clique duplo)");
        TemaBetfoot.botao(this.Mf, Estilo.CHIP, "Marcar todas", null);
        this.Mf.setToolTipText("Marca ou desmarca todas as ligas");
        this.Mf.addActionListener(actionEvent -> SwingUtilities.invokeLater(this::atualizarResumo));
        this.resumoLigas.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.06f));
        this.ut.setViewportView(this.JG);
        TemaBetfoot.tabela(this.JG, this.ut);
        TemaBetfoot.Cartao ligas = new TemaBetfoot.Cartao(new BorderLayout(0, 14));
        ligas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        ligas.add((Component)TemaBetfoot.cabecalho("Ligas nacionais", "Marque as ligas que você vai jogar", this.resumoLigas), "North");
        ligas.add((Component)this.ut, "Center");
        JPanel acoesLigas = new JPanel(new BorderLayout(12, 0));
        acoesLigas.setOpaque(false);
        acoesLigas.add((Component)this.Mf, "West");
        JLabel dicaLigas = new JLabel("Clique no lápis para configurar as divisões");
        dicaLigas.setIcon(new TemaBetfoot.IconeVetor(Simbolo.LAPIS, 13, TemaBetfoot.TEXTO_FRACO));
        dicaLigas.setIconTextGap(8);
        dicaLigas.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
        dicaLigas.setForeground(TemaBetfoot.TEXTO_FRACO);
        dicaLigas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        acoesLigas.add((Component)dicaLigas, "Center");
        ligas.add((Component)acoesLigas, "South");

        // ---- Estaduais e regionais ----
        TemaBetfoot.botao(this.Mb, Estilo.CHIP, "Configurar", Simbolo.LAPIS);
        this.Mb.setToolTipText("Divisões e formato do estadual selecionado (ou clique duplo)");
        TemaBetfoot.botao(this.Me, Estilo.CHIP, "Configurar", Simbolo.LAPIS);
        this.Me.setToolTipText("Escolher os regionais: Copa do Nordeste, Copa Verde, Sul-Minas, Rio-São Paulo");
        this.My.setViewportView(this.Mz);
        // "Jogar estaduais" é a chave geral: liga ou desliga os 27 de uma vez. A lista só serve para configurar.
        this.seloEstaduais.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.06f));
        this.Mz.setEnabled(false);
        this.seloEstaduais.setText("DESLIGADOS");
        this.seloEstaduais.setForeground(TemaBetfoot.TEXTO_FRACO);
        this.Mi.addItemListener(itemEvent -> {
            this.Mz.setEnabled(this.Mi.isSelected());
            this.seloEstaduais.setText(this.Mi.isSelected() ? "27 ESTADUAIS" : "DESLIGADOS");
            this.seloEstaduais.setForeground(this.Mi.isSelected() ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_FRACO);
            this.Mz.repaint();
        });
        TemaBetfoot.tabela(this.Mz, this.My);
        TemaBetfoot.Cartao estaduais = new TemaBetfoot.Cartao(new BorderLayout(0, 14));
        estaduais.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel topoEstaduais = new JPanel();
        topoEstaduais.setOpaque(false);
        topoEstaduais.setLayout(new javax.swing.BoxLayout(topoEstaduais, 1));
        JPanel cab = TemaBetfoot.cabecalho("Estaduais", "Os 27, com as divisões reais de 2026", this.seloEstaduais);
        cab.setAlignmentX(0.0f);
        topoEstaduais.add(cab);
        topoEstaduais.add(TelaConfiguracoesIniciais.espaco(14));
        topoEstaduais.add(TelaConfiguracoesIniciais.opcao(this.Mi, "Liga ou desliga todos de uma vez, no começo de cada temporada"));
        topoEstaduais.add(TemaBetfoot.divisor());
        JLabel rotuloConfig = TemaBetfoot.rotulo("Configurar um estadual");
        rotuloConfig.setAlignmentX(0.0f);
        topoEstaduais.add(rotuloConfig);
        estaduais.add((Component)topoEstaduais, "North");
        estaduais.add((Component)this.My, "Center");
        JPanel baseEstaduais = new JPanel();
        baseEstaduais.setOpaque(false);
        baseEstaduais.setLayout(new javax.swing.BoxLayout(baseEstaduais, 1));
        JPanel linhaRegional = new JPanel(new BorderLayout(12, 0));
        linhaRegional.setOpaque(false);
        linhaRegional.add((Component)TelaConfiguracoesIniciais.opcao(this.Mk, "Copa do Nordeste, Copa Verde e outros"), "Center");
        JPanel cantoRegional = new JPanel(new BorderLayout());
        cantoRegional.setOpaque(false);
        cantoRegional.add((Component)this.Me, "North");
        linhaRegional.add((Component)cantoRegional, "East");
        linhaRegional.setAlignmentX(0.0f);
        baseEstaduais.add(linhaRegional);
        estaduais.add((Component)baseEstaduais, "South");

        // ---- Competições internacionais ----
        TemaBetfoot.botao(this.Mc, Estilo.CHIP, "Preferências", Simbolo.LAPIS);
        this.Mc.setToolTipText("Quais taças continentais e mundiais entram na carreira");
        TemaBetfoot.Cartao internacionais = new TemaBetfoot.Cartao(new BorderLayout(0, 16));
        internacionais.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        internacionais.add((Component)TemaBetfoot.cabecalho("Internacionais", "Clubes e seleções", this.Mc), "North");
        JPanel opcoesInt = new JPanel();
        opcoesInt.setOpaque(false);
        opcoesInt.setLayout(new javax.swing.BoxLayout(opcoesInt, 1));
        opcoesInt.add(TelaConfiguracoesIniciais.opcao(this.Mj, "Libertadores, Champions, Sul-Americana…"));
        opcoesInt.add(TelaConfiguracoesIniciais.espaco(12));
        opcoesInt.add(TelaConfiguracoesIniciais.opcao(this.Mh, "Copa do Mundo, Copa América, Eurocopa…"));
        opcoesInt.add(TelaConfiguracoesIniciais.espaco(12));
        opcoesInt.add(TelaConfiguracoesIniciais.opcao(this.afz, "Os grupos reais do sorteio, com 48 seleções"));
        internacionais.add((Component)opcoesInt, "Center");

        // ---- Regras da carreira ----
        TemaBetfoot.combo(this.afA);
        this.afA.setToolTipText("Ano em que a carreira começa");
        TemaBetfoot.Cartao regras = new TemaBetfoot.Cartao(new BorderLayout(0, 16));
        regras.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        regras.add((Component)TemaBetfoot.cabecalho("Regras", "Como a carreira funciona", null), "North");
        JPanel opcoesRegras = new JPanel();
        opcoesRegras.setOpaque(false);
        opcoesRegras.setLayout(new javax.swing.BoxLayout(opcoesRegras, 1));
        opcoesRegras.add(TelaConfiguracoesIniciais.regra("Salários", this.Mw, this.Mx));
        opcoesRegras.add(TelaConfiguracoesIniciais.espaco(16));
        opcoesRegras.add(TelaConfiguracoesIniciais.regra("Força dos jogadores", this.Mv, this.Mu));
        opcoesRegras.add(TelaConfiguracoesIniciais.espaco(16));
        JPanel temporada = new JPanel(new BorderLayout(0, 8));
        temporada.setOpaque(false);
        temporada.add((Component)TemaBetfoot.rotulo("Temporada de início"), "North");
        JPanel linhaTemporada = new JPanel(new BorderLayout());
        linhaTemporada.setOpaque(false);
        this.afA.setPreferredSize(new Dimension(150, 40));
        linhaTemporada.add((Component)this.afA, "West");
        temporada.add((Component)linhaTemporada, "Center");
        temporada.setAlignmentX(0.0f);
        temporada.setMaximumSize(new Dimension(Integer.MAX_VALUE, temporada.getPreferredSize().height));
        opcoesRegras.add(temporada);
        regras.add((Component)opcoesRegras, "Center");

        // ---- Colunas ----
        JPanel direita = new JPanel(new BorderLayout(0, 20));
        direita.setOpaque(false);
        direita.add((Component)internacionais, "North");
        direita.add((Component)regras, "Center");
        JPanel colunas = new JPanel(new java.awt.GridLayout(1, 3, 20, 0));
        colunas.setOpaque(false);
        colunas.add(ligas);
        colunas.add(estaduais);
        colunas.add(direita);

        // ---- Rodapé ----
        TemaBetfoot.botao(this.Mg, Estilo.FANTASMA, "Voltar ao início", Simbolo.CASA);
        TemaBetfoot.botao(this.Bw, Estilo.PRIMARIO, "Próximo: técnico e time", null);
        this.Bw.setIcon(new TemaBetfoot.IconeVetor(Simbolo.APITO, 16, Color.WHITE));
        this.Bw.setToolTipText("Escolher o time e criar o técnico (Enter)");
        JPanel rodape = new JPanel(new BorderLayout(16, 0));
        rodape.setOpaque(false);
        rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(16, 0, 0, 0)));
        rodape.add((Component)this.Mg, "West");
        rodape.add((Component)this.Bw, "East");

        JPanel corpo = new JPanel(new BorderLayout(0, 18));
        corpo.setOpaque(false);
        corpo.add((Component)colunas, "Center");
        corpo.add((Component)rodape, "South");

        JPanel topo = new JPanel(new BorderLayout(24, 0));
        topo.setOpaque(false);
        topo.add((Component)new TemaBetfoot.Marca("Novo jogo", "Monte o mundo da sua carreira"), "West");
        JPanel passos = new JPanel(new java.awt.GridBagLayout());
        passos.setOpaque(false);
        passos.add(new TemaBetfoot.Passos(0, "Competições", "Técnico e time"));
        topo.add((Component)passos, "East");

        TemaBetfoot.Fundo fundo = new TemaBetfoot.Fundo(new BorderLayout(0, 22));
        fundo.setBorder(BorderFactory.createEmptyBorder(20, 28, 24, 28));
        fundo.add((Component)topo, "North");
        fundo.add((Component)TemaBetfoot.centralizar(corpo, 1440), "Center");
        this.add((Component)fundo, "Center");

        // Enter avança; clique duplo numa liga/estado abre a configuração.
        this.getInputMap(WHEN_IN_FOCUSED_WINDOW).put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0), "avancar");
        this.getActionMap().put("avancar", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                TelaConfiguracoesIniciais.this.Bw.doClick();
            }
        });
        this.Mz.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                // Um clique abre a configuração do estadual (a lista não é de escolha: todos são jogados).
                int linha = TelaConfiguracoesIniciais.this.Mz.rowAtPoint(mouseEvent.getPoint());
                if (mouseEvent.getClickCount() == 1 && linha >= 0 && SwingUtilities.isLeftMouseButton(mouseEvent) && TelaConfiguracoesIniciais.this.Mz.isEnabled()) {
                    TelaConfiguracoesIniciais.this.Mz.setRowSelectionInterval(linha, linha);
                    TelaConfiguracoesIniciais.this.ss();
                }
            }
        });
    }

    static /* synthetic */ JTable a(TelaConfiguracoesIniciais hU2) {
        return hU2.JG;
    }

    static /* synthetic */ void b(TelaConfiguracoesIniciais hU2) {
        hU2.oq();
    }

    static /* synthetic */ JCheckBox c(TelaConfiguracoesIniciais hU2) {
        return hU2.Mj;
    }

    static /* synthetic */ JCheckBox d(TelaConfiguracoesIniciais hU2) {
        return hU2.Mh;
    }

    static /* synthetic */ JCheckBox e(TelaConfiguracoesIniciais hU2) {
        return hU2.Mi;
    }

    static /* synthetic */ JCheckBox f(TelaConfiguracoesIniciais hU2) {
        return hU2.Mk;
    }

    static /* synthetic */ JRadioButton g(TelaConfiguracoesIniciais hU2) {
        return hU2.Mw;
    }

    static /* synthetic */ JCheckBox h(TelaConfiguracoesIniciais hU2) {
        return hU2.afz;
    }

    static /* synthetic */ JRadioButton i(TelaConfiguracoesIniciais hU2) {
        return hU2.Mv;
    }

    static /* synthetic */ void j(TelaConfiguracoesIniciais hU2) {
        hU2.sp();
    }
}

