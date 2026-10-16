package telas;

import telas.PainelCalendarioTime;
import telas.ListenerRejeitarTodosConvites;
import telas.OuvinteRejeitarConvitesTecnico;
import telas.OuvinteAbrirDetalheSelecao;
import telas.OuvinteAbrirTabelaSelecao;
import telas.OuvinteAbrirRetrospectoSelecao;
import telas.OuvinteSelecaoConvitesTecnico;
import telas.DialogoRetrospectoTime;
import tabelas.ModeloTabelaJogadoresDetalhado;
import tabelas.ModeloTabelaListaQuatroColunas;
import tabelas.RendererPosicaoGrupoDivisao;
import tabelas.RenderizadorTabelaJogadoresCompleta;
import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import comparadores.ColecaoComparadoresSorteio;
import components.TemaBetfoot;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PainelConvitesTecnico
extends JPanel {
    private JDialog ub = null;
    private Campeonato Es = null;
    private ModeloTime Em = null;
    private ArrayList Kh = new ArrayList();
    private ArrayList uK = new ArrayList();
    private int w = 0;
    private JButton Ki;
    private JButton HR;
    private JButton Kj;
    private JButton HY;
    private JButton aeN;
    private ButtonGroup Kl;
    private JLabel ug;
    private JLabel uh;
    private JLabel ur;
    private JPanel vd;
    private JScrollPane ut;
    private JScrollPane wi;
    private JToolBar ve;
    private JLabel Fs;
    private JLabel uu;
    private JTable zj;
    private JTable vn;

    public PainelConvitesTecnico(JDialog jDialog, ArrayList arrayList, Campeonato al2, int n2) {
        this.ub = jDialog;
        this.Kh = arrayList;
        this.Es = al2;
        this.w = n2;
        this.mJ();
        this.Fs.setText(this.Es.dS());
        this.Ay();
        this.mH();
        this.AP();
        this.montar();
        if (this.Kh.size() > 0) {
            this.vn.setRowSelectionInterval(0, 0);
        }
    }

    private void AP() {
        if (this.w == 0) {
            this.ug.setText("Convites para ser t\u00e9cnico");
            this.Ki.setText("Assumir time");
            this.uh.setText("Equipe atual");
        }
    }

    public void mH() {
        this.Ki.addActionListener(new ListenerRejeitarTodosConvites(this));
        this.Kj.addActionListener(new OuvinteRejeitarConvitesTecnico(this));
        this.HR.addActionListener(new OuvinteAbrirDetalheSelecao(this));
        this.aeN.addActionListener(new OuvinteAbrirTabelaSelecao(this));
        this.HY.addActionListener(new OuvinteAbrirRetrospectoSelecao(this));
    }

    private void qP() {
        this.HY.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        DialogoRetrospectoTime hw2 = new DialogoRetrospectoTime(jDialog, this.Em);
        jDialog.add(hw2);
        jDialog.setSize(740, 684);
        jDialog.setPreferredSize(new Dimension(740, 684));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HY.setCursor(new Cursor(12));
    }

    private void AA() {
        this.aeN.setCursor(new Cursor(3));
        GerenciadorTelas.a(0, null);
        this.aeN.setCursor(new Cursor(12));
    }

    private void sD() {
        this.HR.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        PainelCalendarioTime l2 = new PainelCalendarioTime(jDialog, this.Em);
        jDialog.add(l2);
        jDialog.setSize(820, 600);
        jDialog.setPreferredSize(new Dimension(820, 600));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HR.setCursor(new Cursor(12));
    }

    private void rT() {
        if (this.w == 0) {
            if (this.Es.fg() != null) {
                this.Es.fg().kE();
            }
            GerenciadorJogo.SR.a(this.Em, this.Em.ka(), this.Es);
            this.ub.dispose();
        } else {
            LigaNacional z2 = GerenciadorJogo.SR.s(this.Em.getPais());
            if (z2 != null && this.Es != null) {
                z2.g(this.Es);
            } else {
                this.ub.dispose();
            }
        }
    }

    private void rW() {
        String string = "";
        ImageIcon imageIcon = null;
        if (this.w == 0) {
            string = this.Em.getNome();
            imageIcon = this.Em.kU();
        } else {
            string = EnumPaises.valueOf("P" + this.Em.getPais()).getNome();
            imageIcon = new ImageIcon(this.getClass().getResource("/aflags/" + this.Em.getPais() + ".png"));
        }
        this.uu.setText(string);
        this.uu.setIcon(imageIcon);
        this.uK.clear();
        this.uK.addAll(this.Em.kc());
        this.nE();
        this.temaTabelas();
        this.previa.repaint();
    }

    private void Ay() {
        ModeloTabelaListaQuatroColunas aT2 = new ModeloTabelaListaQuatroColunas(this.Kh);
        this.vn.setModel(aT2);
        int[] nArray = new int[]{40, 200, 200};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.vn.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.vn.getColumnModel().getColumn(0).setMaxWidth(40);
        this.vn.getColumnModel().getColumn(1).setMaxWidth(200);
        this.vn.getColumnModel().getColumn(2).setMaxWidth(200);
        this.vn.setAutoResizeMode(3);
        this.vn.setRowHeight(20);
        this.vn.setShowGrid(false);
        this.vn.setDefaultRenderer(ModeloTime.class, new RendererPosicaoGrupoDivisao(this.w));
        this.vn.setAutoCreateRowSorter(false);
        this.vn.getTableHeader().setReorderingAllowed(false);
        this.vn.setIntercellSpacing(new Dimension(0, 0));
        this.vn.setCellSelectionEnabled(false);
        this.vn.setSelectionMode(0);
        this.vn.setRowSelectionAllowed(true);
        this.vn.setSelectionBackground(Color.YELLOW);
        this.vn.setFillsViewportHeight(true);
        this.vn.setTableHeader(null);
        this.vn.getSelectionModel().addListSelectionListener(new OuvinteSelecaoConvitesTecnico(this));
    }

    private void nE() {
        ModeloTabelaJogadoresDetalhado u2 = new ModeloTabelaJogadoresDetalhado(this.uK);
        this.zj.setModel(u2);
        int[] nArray = new int[12];
        nArray[0] = 22;
        nArray[1] = 22;
        nArray[2] = 55;
        nArray[3] = 140;
        nArray[4] = 22;
        nArray[5] = 22;
        nArray[6] = 50;
        nArray[7] = 50;
        nArray[8] = 55;
        nArray[9] = 30;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[19];
        nArray3[0] = 20;
        nArray3[1] = 15;
        nArray3[2] = 20;
        nArray3[3] = 130;
        nArray3[4] = 20;
        nArray3[5] = 22;
        nArray3[6] = 22;
        nArray3[7] = 22;
        nArray3[8] = 22;
        nArray3[9] = 22;
        nArray3[10] = 22;
        nArray3[11] = 22;
        nArray3[12] = 50;
        nArray3[13] = 50;
        nArray3[14] = 50;
        nArray3[15] = 20;
        nArray3[16] = 30;
        int[] nArray4 = nArray3;
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            nArray2 = nArray4;
            this.zj.getColumnModel().getColumn(18).setMinWidth(0);
            this.zj.getColumnModel().getColumn(18).setMaxWidth(0);
            this.zj.getColumnModel().getColumn(18).setWidth(0);
            this.zj.getColumnModel().getColumn(19).setMinWidth(0);
            this.zj.getColumnModel().getColumn(19).setMaxWidth(0);
            this.zj.getColumnModel().getColumn(19).setWidth(0);
        } else {
            try {
                this.zj.getColumnModel().getColumn(12).setMinWidth(0);
                this.zj.getColumnModel().getColumn(12).setMaxWidth(0);
                this.zj.getColumnModel().getColumn(12).setWidth(0);
                this.zj.getColumnModel().getColumn(13).setMinWidth(0);
                this.zj.getColumnModel().getColumn(13).setMaxWidth(0);
                this.zj.getColumnModel().getColumn(13).setWidth(0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        int n2 = 0;
        while (n2 < nArray2.length) {
            this.zj.getColumnModel().getColumn(n2).setPreferredWidth(nArray2[n2]);
            ++n2;
        }
        this.zj.setAutoResizeMode(3);
        this.zj.setRowHeight(20);
        this.zj.setShowGrid(false);
        this.zj.setDefaultRenderer(ModeloJogador.class, new RenderizadorTabelaJogadoresCompleta());
        this.zj.setAutoCreateRowSorter(false);
        this.zj.getTableHeader().setReorderingAllowed(false);
        this.zj.setIntercellSpacing(new Dimension(0, 0));
        this.zj.setCellSelectionEnabled(false);
        this.zj.setSelectionMode(0);
        this.zj.setRowSelectionAllowed(true);
        this.zj.setSelectionBackground(Color.YELLOW);
        this.zj.setFillsViewportHeight(true);
        TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(this.zj.getModel());
        this.zj.setRowSorter(tableRowSorter);
        tableRowSorter.setComparator(0, ColecaoComparadoresSorteio.abe);
        tableRowSorter.setComparator(2, ColecaoComparadoresSorteio.cL);
        tableRowSorter.setComparator(3, ColecaoComparadoresSorteio.abk);
        tableRowSorter.setComparator(4, ColecaoComparadoresSorteio.aba);
        if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaJ);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(10, ColecaoComparadoresSorteio.VU);
        } else {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaK);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaM);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaL);
            tableRowSorter.setComparator(8, ColecaoComparadoresSorteio.aaN);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.aaP);
            tableRowSorter.setComparator(10, ColecaoComparadoresSorteio.aaO);
            tableRowSorter.setComparator(11, ColecaoComparadoresSorteio.aaQ);
            tableRowSorter.setComparator(12, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(13, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(15, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(16, ColecaoComparadoresSorteio.VU);
        }
    }

    // ----- Visual no tema -----

    private final Previa previa = new Previa();

    /** Texto de apoio do convite: continente da seleção, ou divisão e país do clube. */
    private String apoio(ModeloTime time) {
        if (time == null) {
            return "";
        }
        if (this.w == 1) {
            try {
                return ConstantesJogo.aeH[time.gg()];
            }
            catch (Exception exception) {
                return "";
            }
        }
        return time.getDivisao() + "ª divisão  ·  " + EnumPaises.valueOf("P" + time.getPais()).getNome();
    }

    private String nome(ModeloTime time) {
        return this.w == 1 ? EnumPaises.valueOf("P" + time.getPais()).getNome() : time.getNome();
    }

    private javax.swing.Icon icone(ModeloTime time, int tamanho) {
        return this.w == 1 ? TemaBetfoot.bandeira(time.getPais(), tamanho) : TemaBetfoot.encaixar(time.kU(), tamanho);
    }

    /** Convite escolhido: bandeira (ou escudo) grande, nome e continente/divisão. */
    private class Previa
    extends javax.swing.JComponent {
        Previa() {
            this.setPreferredSize(new Dimension(280, 170));
        }

        @Override
        protected void paintComponent(java.awt.Graphics graphics) {
            java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            ModeloTime time = PainelConvitesTecnico.this.Em;
            if (time != null) {
                javax.swing.Icon icon = PainelConvitesTecnico.this.icone(time, PainelConvitesTecnico.this.w == 1 ? 56 : 84);
                int y = 8;
                if (icon != null) {
                    icon.paintIcon(this, g, (w - icon.getIconWidth()) / 2, y);
                    y += icon.getIconHeight();
                }
                y += 36;
                g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(26.0f), 0.02f));
                java.awt.FontMetrics fm = g.getFontMetrics();
                String nome = PainelConvitesTecnico.this.nome(time).toUpperCase();
                while (nome.length() > 1 && fm.stringWidth(nome) > w - 16) {
                    nome = nome.substring(0, nome.length() - 2) + "…";
                }
                g.setColor(TemaBetfoot.TEXTO);
                g.drawString(nome, (w - fm.stringWidth(nome)) / 2, y);
                g.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                fm = g.getFontMetrics();
                String apoio = PainelConvitesTecnico.this.apoio(time);
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                g.drawString(apoio, (w - fm.stringWidth(apoio)) / 2, y + 22);
            }
            g.dispose();
        }
    }

    /** Lista de convites: posição, bandeira/escudo e nome, continente/divisão. */
    private class RenderizadorConvites
    extends javax.swing.table.DefaultTableCellRenderer {
        @Override
        public java.awt.Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
            ModeloTime time = (ModeloTime)object;
            this.setIcon(null);
            this.setText("");
            this.setHorizontalAlignment(LEFT);
            this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            if (time == null) {
                return this;
            }
            if (n2 == 0) {
                this.setText(Integer.toString(n + 1));
                this.setFont(TemaBetfoot.display(16.0f));
                this.setHorizontalAlignment(CENTER);
            } else if (n2 == 1) {
                this.setText(PainelConvitesTecnico.this.nome(time));
                this.setIcon(PainelConvitesTecnico.this.icone(time, PainelConvitesTecnico.this.w == 1 ? 14 : 22));
                this.setIconTextGap(10);
            } else if (n2 == 2) {
                this.setText(PainelConvitesTecnico.this.w == 1 ? PainelConvitesTecnico.this.apoio(time) : time.getDivisao() + "ª divisão");
            }
            return this;
        }
    }

    /** Tabelas no tema (depois que o jogo configura modelos e renderizadores). */
    private void temaTabelas() {
        RenderizadorConvites renderizador = new RenderizadorConvites();
        this.vn.setDefaultRenderer(ModeloTime.class, renderizador);
        this.vn.setDefaultRenderer(Object.class, renderizador);
        this.vn.setTableHeader(new javax.swing.table.JTableHeader(this.vn.getColumnModel()));
        TemaBetfoot.tabela(this.vn, this.wi);
        this.vn.setTableHeader(null);
        this.wi.setColumnHeaderView(null);
        int[] larguras = new int[]{44, 220, 150, 10};
        for (int i = 0; i < larguras.length && i < this.vn.getColumnCount(); ++i) {
            this.vn.getColumnModel().getColumn(i).setPreferredWidth(larguras[i]);
            this.vn.getColumnModel().getColumn(i).setMaxWidth(i == 1 ? Integer.MAX_VALUE : larguras[i] + 60);
        }
        TemaBetfoot.tabela(this.zj, this.ut);
        this.zj.setRowHeight(32);
    }

    private static JTable tabelaTema() {
        return new JTable() {
            @Override
            public java.awt.Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
                return TemaBetfoot.linha(this, super.prepareRenderer(tableCellRenderer, n, n2), n, n2);
            }

            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
    }

    private void mJ() {
        this.Kl = new ButtonGroup();
        this.vd = new JPanel();
        this.ug = new JLabel("Convites para técnico de seleção");
        this.Fs = new JLabel();
        this.wi = new JScrollPane();
        this.vn = PainelConvitesTecnico.tabelaTema();
        this.Ki = new JButton();
        this.Kj = new JButton();
        this.ve = new JToolBar();
        this.HR = new JButton();
        this.aeN = new JButton();
        this.HY = new JButton();
        this.ur = new JLabel();
        this.uu = new JLabel();
        this.ut = new JScrollPane();
        this.zj = PainelConvitesTecnico.tabelaTema();
        this.uh = new JLabel("Última convocação");
        this.Ki.setText("Assumir seleção");
        this.wi.setViewportView(this.vn);
        this.ut.setViewportView(this.zj);
        this.setOpaque(false);
    }

    /** Monta o modal (no fim do construtor, quando já se sabe se é convite de seleção ou de clube). */
    private void montar() {
        boolean selecao = this.w == 1;
        this.removeAll();
        this.setLayout(new java.awt.BorderLayout(0, 18));
        this.add((java.awt.Component)TemaBetfoot.topoModal(null, selecao ? "Convites de seleção" : "Convites de clubes", "Para " + this.Es.dS() + "  ·  " + this.Kh.size() + (this.Kh.size() == 1 ? " convite" : " convites") + " recebidos", this.Kj), "North");

        // Convites (lista) e o escolhido (prévia e atalhos).
        TemaBetfoot.Cartao lista = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 12));
        lista.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        lista.add((java.awt.Component)TemaBetfoot.cabecalho("Convites", "Escolha um para ver os detalhes", null), "North");
        this.wi.setPreferredSize(new Dimension(420, 250));
        lista.add((java.awt.Component)this.wi, "Center");
        TemaBetfoot.Cartao escolhido = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        escolhido.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        escolhido.add((java.awt.Component)this.previa, "Center");
        TemaBetfoot.botao(this.HR, TemaBetfoot.Estilo.CHIP, "Calendário", null);
        TemaBetfoot.botao(this.aeN, TemaBetfoot.Estilo.CHIP, "Tabelas", null);
        TemaBetfoot.botao(this.HY, TemaBetfoot.Estilo.CHIP, "Retrospecto", TemaBetfoot.Simbolo.TROFEU);
        this.HR.setToolTipText("Próximos jogos");
        this.aeN.setToolTipText("Tabelas das competições");
        this.HY.setToolTipText("Histórico de resultados");
        this.HY.setMaximumSize(null);
        JPanel atalhos = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 0));
        atalhos.setOpaque(false);
        atalhos.add(this.HR);
        atalhos.add(this.aeN);
        atalhos.add(this.HY);
        escolhido.add((java.awt.Component)atalhos, "South");
        escolhido.setPreferredSize(new Dimension(390, 250));
        JPanel cima = new JPanel(new java.awt.BorderLayout(18, 0));
        cima.setOpaque(false);
        cima.add((java.awt.Component)lista, "Center");
        cima.add((java.awt.Component)escolhido, "East");

        // Última convocação (seleção) ou elenco (clube) do escolhido.
        TemaBetfoot.Cartao elenco = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 12));
        elenco.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        elenco.add((java.awt.Component)TemaBetfoot.cabecalho(selecao ? "Última convocação" : "Elenco atual", "Clique no cabeçalho para ordenar", null), "North");
        this.ut.setPreferredSize(new Dimension(820, 230));
        elenco.add((java.awt.Component)this.ut, "Center");

        JPanel corpo = new JPanel(new java.awt.BorderLayout(0, 18));
        corpo.setOpaque(false);
        corpo.add((java.awt.Component)cima, "North");
        corpo.add((java.awt.Component)elenco, "Center");
        this.add((java.awt.Component)corpo, "Center");

        TemaBetfoot.botao(this.Kj, TemaBetfoot.Estilo.FANTASMA, "Rejeitar todos", TemaBetfoot.Simbolo.VOLTAR);
        this.Kj.setToolTipText("Recusar os convites e voltar (Esc)");
        TemaBetfoot.botao(this.Ki, TemaBetfoot.Estilo.PRIMARIO, selecao ? "Assumir seleção" : "Assumir time", null);
        this.Ki.setIcon(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.APITO, 16, Color.WHITE));
        this.Ki.setToolTipText("Aceitar o convite escolhido");
        this.add((java.awt.Component)TemaBetfoot.rodapeModal(null, this.Kj, this.Ki), "South");
    }

    static /* synthetic */ void a(PainelConvitesTecnico gO2) {
        gO2.rT();
    }

    static /* synthetic */ JDialog b(PainelConvitesTecnico gO2) {
        return gO2.ub;
    }

    static /* synthetic */ void c(PainelConvitesTecnico gO2) {
        gO2.sD();
    }

    static /* synthetic */ void d(PainelConvitesTecnico gO2) {
        gO2.AA();
    }

    static /* synthetic */ void e(PainelConvitesTecnico gO2) {
        gO2.qP();
    }

    static /* synthetic */ JTable f(PainelConvitesTecnico gO2) {
        return gO2.vn;
    }

    static /* synthetic */ ArrayList g(PainelConvitesTecnico gO2) {
        return gO2.Kh;
    }

    static /* synthetic */ void a(PainelConvitesTecnico gO2, ModeloTime ah2) {
        gO2.Em = ah2;
    }

    static /* synthetic */ void h(PainelConvitesTecnico gO2) {
        gO2.rW();
    }
}

