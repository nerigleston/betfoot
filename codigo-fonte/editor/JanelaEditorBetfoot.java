package editor;

import tabelas.RendererNomeTime;
import nucleo.UtilitariosTexto;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorIdioma;
import editor.ListenerSelecaoJogadorEditor;
import editor.ListenerMouseEditarTimeReputacao;
import editor.ListenerMouseEditarTimeTecnico;
import editor.ListenerMouseEditarTimeEstadio;
import editor.ListenerMouseEditarTimeCapacidade;
import editor.ListenerMouseEditarTimeNivel;
import editor.ListenerMouseEditarTimeEstado;
import editor.ListenerBotaoCriarAleatorio;
import editor.ListenerMouseEditarTimePais;
import editor.ListenerMenuAdicionarJogador;
import editor.ListenerMenuEditarJogador;
import editor.PainelEdicaoTime;
import editor.TabelaListaTimes;
import editor.JanelaTransferenciaJogador;
import editor.RenderizadorCelulaJogador;
import editor.ModeloTabelaJogadores;
import editor.ModeloTabelaTimes;
import editor.ListenerMouseTabelaJogadores;
import editor.ListenerMouseDuploCliqueTime;
import editor.ListenerMouseEditarTimeNome;
import editor.JanelaEdicaoJogador;
import editor.ComparadorInteiroDecrescente;
import editor.ListenerMenuDeletarJogador;
import editor.ListenerBotaoJogadoresDuplicados;
import editor.ListenerMenuTransferirJogador;
import editor.ListenerBotaoVazioVoltar;
import editor.ListenerSelecaoTime;
import editor.ListenerBotaoSairJogo;
import editor.ListenerBotaoElencoPrincipal;
import editor.ListenerMouseCabecalhoOrdenacao;
import editor.ListenerBotaoElencoJuniores;
import editor.ListenerBotaoEditarJogador;
import editor.ListenerProcurarTime;
import editor.ListenerBotaoEditarTime;
import editor.ListenerProcurarJogador;
import editor.ListenerApagarTime;
import editor.ListenerMarcarSemEscudo;
import editor.ListenerAbrirDialogoJogador;
import editor.ListenerMarcarSemCamisa;
import editor.ListenerAdicionarJogadorTime;
import editor.ListenerDeletarJogador;
import editor.ListenerVoltarInicio;
import modelos.ModeloJogador2;
import comparadores.ColecaoComparadoresSorteio;
import components.TemaBetfoot;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import sun.java2d.SunGraphicsEnvironment;

public class JanelaEditorBetfoot
extends JFrame {
    private modelos.ModeloTime2 Uu = null;
    private ModeloJogador2 Uv = null;
    private boolean Uc = true;
    public JDialog Uw;
    private boolean Ux = true;
    private boolean Uy = true;
    private boolean Uz = false;
    private JanelaTransferenciaJogador UA;
    Comparator UB = new ComparadorInteiroDecrescente(this);
    private JButton afR;
    private JButton UC;
    private JButton UD;
    private JButton UE;
    private JButton UF;
    private JButton Kc;
    private JButton UG;
    private JButton UH;
    private JButton UI;
    private JButton UJ;
    private JButton UK;
    private JButton BZ;
    private JButton UL;
    private JButton UM;
    private JButton UN;
    private JButton UO;
    private JComboBox Nq;
    private JPanel vd;
    private JPanel we;
    private JPanel wf;
    private JScrollPane ut;
    private JScrollPane wi;
    private JTextField Ej;
    private JTextField Ek;
    private JLabel afS;
    private JLabel UR;
    private JLabel US;
    private JLabel UT;
    private JLabel UU;
    private JLabel Fq;
    private JLabel UV;
    private JLabel UW;
    private JLabel MM;
    private JLabel UX;
    private JLabel UY;
    private JLabel UZ;
    private JLabel Va;
    private JLabel Vb;
    private JLabel Gk;
    private JLabel MQ;
    private JLabel Vc;
    private JLabel Vd;
    private JLabel Ve;
    private JLabel MR;
    private JLabel MS;
    private JLabel Vf;
    private JTable UQ;
    public JTable Vg;
    private TemaBetfoot.FaixaCores faixaTime;
    private JLabel contadorTimes;
    private ArvoreTimes arvoreTimes;

    public JanelaEditorBetfoot() {
        this.Uu = (modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(0);
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/ball.png"));
        this.setIconImage(imageIcon.getImage());
        this.setTitle("Editor Betfoot");
        this.pack();
        GraphicsConfiguration graphicsConfiguration = this.getGraphicsConfiguration();
        Rectangle rectangle = SunGraphicsEnvironment.getUsableBounds(graphicsConfiguration.getDevice());
        this.setMaximizedBounds(new Rectangle(0, 0, rectangle.width, rectangle.height));
        this.setExtendedState((this.getExtendedState() & 6) == 6 ? 0 : 6);
        this.mJ();
        this.Ay();
        this.Ej.setText("");
        this.Ek.setText("");
        this.afS.setText("");
        this.mW();
        this.wx();
        this.wF();
    }

    private void mW() {
        this.Nq.removeAllItems();
        int n2 = 0;
        while (n2 < ConstantesJogo.rH.length) {
            this.Nq.addItem(ConstantesJogo.rH[n2]);
            ++n2;
        }
        this.Nq.setSelectedIndex(0);
    }

    public static String k(int n2, boolean bl) {
        String string = null;
        string = new GerenciadorIdioma().k(n2, bl);
        if (string != null && string.length() != 0) {
            string.isEmpty();
        }
        return string;
    }

    /**
     * Criar aleatório: sorteia um jogador e mostra a prévia num modal (Sortear outro / Cancelar / Adicionar ao
     * elenco). Só entra no elenco se o usuário confirmar.
     */
    public void Bb() {
        boolean cheio = this.Uc ? nucleo.UtilitariosTexto.da().wI().getJogadores().size() >= 30 : nucleo.UtilitariosTexto.da().wI().getJuniores().size() >= 15;
        if (cheio) {
            TemaBetfoot.aviso(this, "Elenco completo", this.Uc ? "O elenco principal j\u00e1 tem 30 jogadores. Remova algu\u00e9m antes de criar outro." : "Os juniores j\u00e1 t\u00eam 15 jogadores. Remova algu\u00e9m antes de criar outro.");
            return;
        }
        while (true) {
            ModeloJogador2 g2 = this.sortearJogador();
            if (g2 == null) {
                return;
            }
            int escolha = TemaBetfoot.escolher(this, "Novo jogador", "Sorteado para " + (this.Uc ? "o elenco principal" : "os juniores") + " de " + this.Uu.getNome(), this.previaJogador(g2), new String[]{"Cancelar", "Sortear outro", "Adicionar ao elenco"}, 2);
            if (escolha == 1) {
                continue;
            }
            if (escolha == 2) {
                this.adicionarSorteado(g2);
            }
            return;
        }
    }

    private ModeloJogador2 sortearJogador() {
        boolean bl2 = new Random().nextInt(5) != 0;
        String string = JanelaEditorBetfoot.k(this.Uu.getPais(), bl2);
        if (string == null || string.length() <= 1) {
            return null;
        }
        int[] nArray = nucleo.ModeloJogador.at(this.Nq.getSelectedIndex());
        ModeloJogador2 g2 = new ModeloJogador2();
        g2.setNome(string);
        g2.setEstrela(false);
        g2.setTopMundial(false);
        g2.setPais(this.Uu.getPais());
        g2.setPosicao(this.Nq.getSelectedIndex());
        g2.setIdade(this.Uc ? new Random().nextInt(20) + 18 : new Random().nextInt(4) + 16);
        g2.setStatus(0);
        g2.setCr1(nArray[0]);
        g2.setCr2(nArray[1]);
        g2.setLado(new Random().nextInt(2));
        g2.setHash(new Random().nextInt(4) + 7);
        return g2;
    }

    private void adicionarSorteado(ModeloJogador2 g2) {
        if (this.Uc) {
            nucleo.UtilitariosTexto.da().wI().getJogadores().add(g2);
        } else {
            nucleo.UtilitariosTexto.da().wI().getJuniores().add(g2);
        }
        ((ModeloTabelaJogadores)nucleo.UtilitariosTexto.da().wJ().getModel()).i(3, true);
        nucleo.UtilitariosTexto.da().wG();
        this.an(g2.getNome());
        this.afS.setText("\u2713  " + g2.getNome() + " entrou no elenco");
        nucleo.UtilitariosTexto.da().wo();
    }

    /** Cartão do jogador sorteado: posição em destaque, nome grande e os dados em colunas. */
    private JComponent previaJogador(ModeloJogador2 g2) {
        JPanel cartao = new JPanel(new java.awt.BorderLayout(20, 0)) {
            @Override
            protected void paintComponent(java.awt.Graphics graphics) {
                java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
                g.setPaint(new java.awt.GradientPaint(0.0f, 0.0f, TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.16), this.getWidth(), this.getHeight(), TemaBetfoot.alfa(Color.WHITE, 0.03)));
                g.fill(new java.awt.geom.RoundRectangle2D.Double(0.0, 0.0, this.getWidth(), this.getHeight(), 20.0, 20.0));
                g.setColor(TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.35));
                g.draw(new java.awt.geom.RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, 20.0, 20.0));
                g.dispose();
            }
        };
        cartao.setOpaque(false);
        cartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 22, 20, 26));
        final String sigla = ConstantesJogo.rH[g2.getPosicao()];
        JComponent posicao = new JComponent() {
            {
                this.setPreferredSize(new Dimension(84, 84));
            }

            @Override
            protected void paintComponent(java.awt.Graphics graphics) {
                java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
                g.setColor(TemaBetfoot.VERDE_BOTAO);
                g.fill(new java.awt.geom.Ellipse2D.Double(2.0, 2.0, 80.0, 80.0));
                g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.25));
                g.draw(new java.awt.geom.Ellipse2D.Double(2.5, 2.5, 79.0, 79.0));
                g.setColor(Color.WHITE);
                g.setFont(TemaBetfoot.display(30.0f));
                String abrev = sigla.length() > 3 ? sigla.substring(0, 3).toUpperCase() : sigla.toUpperCase();
                java.awt.FontMetrics fm = g.getFontMetrics();
                g.drawString(abrev, 42 - fm.stringWidth(abrev) / 2, 42 + fm.getAscent() / 2 - 4);
                g.dispose();
            }
        };
        cartao.add((java.awt.Component)posicao, "West");
        JPanel info = new JPanel();
        info.setOpaque(false);
        info.setLayout(new javax.swing.BoxLayout(info, 1));
        JLabel nome = new JLabel(g2.getNome());
        nome.setFont(TemaBetfoot.display(34.0f));
        nome.setForeground(TemaBetfoot.TEXTO);
        nome.setAlignmentX(0.0f);
        info.add(nome);
        JLabel pos = new JLabel(sigla);
        pos.setFont(TemaBetfoot.fonte(Font.BOLD, 14.0f));
        pos.setForeground(TemaBetfoot.VERDE);
        pos.setAlignmentX(0.0f);
        info.add(pos);
        info.add(javax.swing.Box.createVerticalStrut(16));
        JPanel dados = new JPanel(new java.awt.GridLayout(1, 4, 22, 0));
        dados.setOpaque(false);
        dados.setAlignmentX(0.0f);
        JLabel pais = new JLabel(nucleo.EnumPaises.valueOf("P" + g2.getPais()).getNome(), TemaBetfoot.bandeira(g2.getPais(), 14), 2);
        dados.add(JanelaEditorBetfoot.dado("Idade", new JLabel(g2.getIdade() + " anos")));
        dados.add(JanelaEditorBetfoot.dado("Pa\u00eds", pais));
        dados.add(JanelaEditorBetfoot.dado("Caracter\u00edsticas", new JLabel(ConstantesJogo.qN[g2.getCr1()] + " / " + ConstantesJogo.qN[g2.getCr2()])));
        dados.add(JanelaEditorBetfoot.dado("Lado", new JLabel(ConstantesJogo.rK[g2.getLado()])));
        info.add(dados);
        cartao.add((java.awt.Component)info, "Center");
        JPanel externo = new JPanel(new java.awt.BorderLayout());
        externo.setOpaque(false);
        externo.add((java.awt.Component)cartao, "Center");
        externo.setPreferredSize(new Dimension(660, externo.getPreferredSize().height));
        return externo;
    }

    private static JPanel dado(String legenda, JLabel valor) {
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new javax.swing.BoxLayout(jPanel, 1));
        JLabel l = TemaBetfoot.rotulo(legenda);
        l.setAlignmentX(0.0f);
        valor.setFont(TemaBetfoot.fonte(Font.BOLD, 15.0f));
        valor.setForeground(TemaBetfoot.TEXTO);
        valor.setIconTextGap(6);
        valor.setAlignmentX(0.0f);
        jPanel.add(l);
        jPanel.add(javax.swing.Box.createVerticalStrut(2));
        jPanel.add(valor);
        return jPanel;
    }

    private void b(modelos.ModeloTime2 t2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < t2.getJogadores().size()) {
            if (((ModeloJogador2)t2.getJogadores().get(n4)).getPosicao() == 0) {
                ++n2;
            } else {
                ++n3;
            }
            ++n4;
        }
        if (n2 >= 1 && n3 >= 11) {
            t2.setValid(true);
        } else {
            t2.setValid(false);
        }
        t2.setVid(185);
    }

    public void wo() {
        this.b(this.Uu);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/" + this.Uu.getFileRef() + ".ban");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this.Uu);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.Vg.addNotify();
        this.UQ.addNotify();
    }

    public void c(modelos.ModeloTime2 t2) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        this.b(this.Uu);
        this.b(t2);
        try {
            fileOutputStream = new FileOutputStream(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/" + this.Uu.getFileRef() + ".ban");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this.Uu);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            fileOutputStream = new FileOutputStream(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/" + t2.getFileRef() + ".ban");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t2);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void wp() {
        boolean bl = true;
        if (this.Uc && this.Uu.getJogadores().size() >= 30) {
            bl = false;
        } else if (!this.Uc && this.Uu.getJuniores().size() >= 15) {
            bl = false;
        }
        if (bl) {
            this.aK(true);
            JanelaEdicaoJogador f_02 = new JanelaEdicaoJogador();
            this.Uw = TemaBetfoot.modal(this, f_02);
            this.Uw.setVisible(true);
        }
    }

    public void wq() {
        if (this.Uc) {
            if (this.Uu.getJogadores().size() > 0) {
                this.UZ.setText(String.valueOf(Integer.toString(this.Uu.getJogadores().size())) + "/" + 30);
                this.UY.setText(Integer.toString(this.Uu.getNumeroTitulares()));
            } else {
                this.Uv = null;
                this.UZ.setText("0/30");
                this.UY.setText("0");
            }
        } else if (this.Uu.getJuniores().size() > 0) {
            this.UZ.setText(String.valueOf(Integer.toString(this.Uu.getJuniores().size())) + "/" + 15);
            this.UY.setText(Integer.toString(this.Uu.getNumeroTitularesJuniores()));
        } else {
            this.Uv = null;
            this.UZ.setText("0/15");
            this.UY.setText("0");
        }
    }

    private void wr() {
        int n2 = 0;
        while (n2 < nucleo.UtilitariosTexto.cZ().size()) {
            ((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).setMark(((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).hasDuplicado());
            ++n2;
        }
        this.wv();
        this.Vg.addNotify();
    }

    private void ws() {
        if (!this.Ek.getText().isEmpty()) {
            String string = UtilitariosTexto.f(this.Ek.getText());
            ((ModeloTabelaTimes)this.Vg.getModel()).ak(string);
        }
    }

    private void wt() {
        if (!this.Ej.getText().isEmpty()) {
            String string = UtilitariosTexto.f(this.Ej.getText());
            ((ModeloTabelaTimes)this.Vg.getModel()).ai(string);
        }
    }

    private void wu() {
        int n2 = 0;
        while (n2 < nucleo.UtilitariosTexto.cZ().size()) {
            ((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).setMark(((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).semEscudo());
            ++n2;
        }
        this.wv();
        this.Vg.addNotify();
    }

    private void wv() {
        int n2 = 0;
        while (n2 < nucleo.UtilitariosTexto.cZ().size()) {
            if (((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).isMark()) {
                this.Vg.changeSelection(n2, 0, true, true);
                this.Vg.setRowSelectionInterval(n2, n2);
                break;
            }
            ++n2;
        }
    }

    private void ww() {
        int n2 = 0;
        while (n2 < nucleo.UtilitariosTexto.cZ().size()) {
            ((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).setMark(((modelos.ModeloTime2)nucleo.UtilitariosTexto.cZ().get(n2)).semCamisa());
            ++n2;
        }
        this.wv();
        this.Vg.addNotify();
    }

    private void sp() {
        nucleo.UtilitariosTexto.dc().setVisible(true);
        this.dispose();
    }

    private void wx() {
        this.Kc.addActionListener(new ListenerVoltarInicio(this));
        this.afR.addActionListener(new ListenerBotaoCriarAleatorio(this));
        this.UO.addActionListener(new ListenerBotaoElencoPrincipal(this));
        this.UN.addActionListener(new ListenerBotaoElencoJuniores(this));
        this.UK.addActionListener(new ListenerProcurarTime(this));
        this.UJ.addActionListener(new ListenerProcurarJogador(this));
        this.UM.addActionListener(new ListenerMarcarSemEscudo(this));
        this.UL.addActionListener(new ListenerMarcarSemCamisa(this));
        this.UE.addActionListener(new ListenerBotaoJogadoresDuplicados(this));
        this.Kc.addActionListener(new ListenerBotaoVazioVoltar(this));
        this.BZ.addActionListener(new ListenerBotaoSairJogo(this));
        this.UQ.getTableHeader().addMouseListener(new ListenerMouseCabecalhoOrdenacao(this));
        this.UI.addActionListener(new ListenerBotaoEditarJogador(this));
        this.UF.addActionListener(new ListenerBotaoEditarTime(this));
        this.UD.addActionListener(new ListenerApagarTime(this));
        this.UC.addActionListener(new ListenerAbrirDialogoJogador(this));
        this.UG.addActionListener(new ListenerAdicionarJogadorTime(this));
        this.UH.addActionListener(new ListenerDeletarJogador(this));
        this.UQ.getSelectionModel().addListSelectionListener(new ListenerSelecaoJogadorEditor(this));
        this.UQ.addMouseListener(new ListenerMouseTabelaJogadores(this));
        this.Vg.addMouseListener(new ListenerMouseDuploCliqueTime(this));
        this.Gk.addMouseListener(new ListenerMouseEditarTimeNome(this));
        this.MR.addMouseListener(new ListenerMouseEditarTimeReputacao(this));
        this.MS.addMouseListener(new ListenerMouseEditarTimeTecnico(this));
        this.UV.addMouseListener(new ListenerMouseEditarTimeEstadio(this));
        this.UW.addMouseListener(new ListenerMouseEditarTimeCapacidade(this));
        this.Vb.addMouseListener(new ListenerMouseEditarTimeNivel(this));
        this.MM.addMouseListener(new ListenerMouseEditarTimeEstado(this));
        this.MQ.addMouseListener(new ListenerMouseEditarTimePais(this));
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem jMenuItem = new JMenuItem("Adicionar Jogador");
        jMenuItem.addActionListener(new ListenerMenuAdicionarJogador(this));
        jPopupMenu.add(jMenuItem);
        jPopupMenu.addSeparator();
        JMenuItem jMenuItem2 = new JMenuItem("Editar Jogador");
        jMenuItem2.addActionListener(new ListenerMenuEditarJogador(this));
        jPopupMenu.add(jMenuItem2);
        jPopupMenu.addSeparator();
        JMenuItem jMenuItem3 = new JMenuItem("Deletar Jogador");
        jMenuItem3.addActionListener(new ListenerMenuDeletarJogador(this));
        jPopupMenu.add(jMenuItem3);
        jPopupMenu.addSeparator();
        JMenuItem jMenuItem4 = new JMenuItem("Transferir Jogador");
        jMenuItem4.addActionListener(new ListenerMenuTransferirJogador(this));
        jPopupMenu.add(jMenuItem4);
        this.UQ.setComponentPopupMenu(jPopupMenu);
    }

    public void wy() {
        this.aL(true);
        PainelEdicaoTime ac2 = new PainelEdicaoTime();
        this.Uw = TemaBetfoot.modal(this, ac2);
        this.Uw.setVisible(true);
    }

    public void wz() {
        int n2 = TemaBetfoot.confirmar(this, "Excluir time", "Excluir " + this.Uu.getNome() + "? O arquivo do time ser\u00e1 apagado e carreiras salvas com ele podem apresentar erros.", "Excluir time", true) ? 0 : 1;
        String string = String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/" + this.Uu.getFileRef() + ".ban";
        if (n2 == 0) {
            Path path = Paths.get(string, new String[0]);
            try {
                Files.deleteIfExists(path);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            nucleo.UtilitariosTexto.cZ().remove(this.Uu);
            this.ah(null);
        }
    }

    public void wA() {
        if (this.Uu != null) {
            this.aL(false);
            PainelEdicaoTime ac2 = new PainelEdicaoTime();
            this.Uw = TemaBetfoot.modal(this, ac2);
            this.Uw.setVisible(true);
        }
    }

    public void wB() {
        if (this.UQ.getSelectedRow() >= 0) {
            Object nome = this.UQ.getValueAt(this.UQ.getSelectedRow(), 2);
            if (!TemaBetfoot.confirmar(this, "Remover jogador", "Remover " + nome + " do elenco de " + this.Uu.getNome() + "?", "Remover", true)) {
                return;
            }
            int n2 = this.UQ.convertRowIndexToModel(this.UQ.getSelectedRow());
            ((ModeloTabelaJogadores)this.UQ.getModel()).eI(n2);
            this.UQ.addNotify();
            this.wq();
            this.wo();
        }
    }

    public void wC() {
        if (this.Uv != null) {
            this.aK(false);
            JanelaEdicaoJogador f_02 = new JanelaEdicaoJogador();
            this.Uw = TemaBetfoot.modal(this, f_02);
            this.Uw.setVisible(true);
        }
    }

    public void wD() {
        if (this.Uv != null) {
            this.aK(false);
            this.UA = new JanelaTransferenciaJogador();
            this.Uw = TemaBetfoot.modal(this, this.UA);
            this.Uw.setVisible(true);
        }
    }

    public void b(BufferedImage bufferedImage) {
        long l2 = 0L;
        long l3 = 0L;
        l2 = System.currentTimeMillis();
        int[] nArray = new int[10];
        int[][] nArray2 = new int[bufferedImage.getWidth()][bufferedImage.getHeight()];
        int n2 = 0;
        while (n2 < bufferedImage.getWidth()) {
            int n3 = 0;
            while (n3 < bufferedImage.getHeight()) {
                int n4 = bufferedImage.getRGB(n2, n3);
                float[] fArray = new float[3];
                int n5 = n4 >> 16 & 0xFF;
                int n6 = n4 >> 8 & 0xFF;
                int n7 = n4 & 0xFF;
                double d2 = 0.2126 * (double)n5 + 0.7152 * (double)n6 + 0.0722 * (double)n7;
                Color.RGBtoHSB(n5, n6, n7, fArray);
                if (d2 < 128.0) {
                    nArray[0] = nArray[0] + 1;
                } else {
                    nArray[1] = nArray[1] + 1;
                }
                if ((double)fArray[1] < 0.1 && (double)fArray[2] > 0.9) {
                    nArray[8] = nArray[8] + 1;
                } else if ((double)fArray[2] < 0.1) {
                    nArray[9] = nArray[9] + 1;
                } else {
                    float f2 = fArray[0] * 360.0f;
                    if (f2 >= 0.0f && f2 < 30.0f) {
                        nArray[2] = nArray[2] + 1;
                    } else if (f2 >= 30.0f && f2 < 90.0f) {
                        nArray[3] = nArray[3] + 1;
                    } else if (f2 >= 90.0f && f2 < 150.0f) {
                        nArray[4] = nArray[4] + 1;
                    } else if (f2 >= 150.0f && f2 < 210.0f) {
                        nArray[5] = nArray[5] + 1;
                    } else if (f2 >= 210.0f && f2 < 270.0f) {
                        nArray[6] = nArray[6] + 1;
                    } else if (f2 >= 270.0f && f2 < 330.0f) {
                        nArray[7] = nArray[7] + 1;
                    } else {
                        nArray[2] = nArray[2] + 1;
                    }
                }
                ++n3;
            }
            ++n2;
        }
        l3 = System.currentTimeMillis() - l2;
    }

    public void wE() {
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        Serializable serializable4;
        Object object;
        Color color = this.Uu.getCorT();
        Color color2 = this.Uu.getCorF();
        this.Gk.setText(this.Uu.getNome());
        this.MR.setText(ConstantesJogo.pZ[this.Uu.getReputacao()]);
        this.Vc.setIcon(TemaBetfoot.bandeira(this.Uu.getPais(), 18));
        String string = nucleo.EnumPaises.valueOf("P" + this.Uu.getPais()).getNome();
        this.MQ.setText(string);
        if (this.Uu.getPais() == 29) {
            this.MM.setVisible(true);
            this.UX.setVisible(true);
            object = ConstantesJogo.rY[this.Uu.getEstado()];
            this.MM.setText((String)object);
            serializable4 = new ImageIcon(this.getClass().getResource("/aesticons/" + Integer.toString(this.Uu.getEstado()) + ".png"));
            this.UX.setIcon((Icon)((Object)serializable4));
        } else {
            this.MM.setVisible(false);
            this.UX.setVisible(false);
        }
        this.UV.setText(this.Uu.getEstadio());
        this.UW.setText(String.valueOf(Integer.toString(this.Uu.getCapacidade())) + " lugares");
        this.Vb.setText(Integer.toString(this.Uu.getNivel()));
        this.MS.setText(this.Uu.getTecnico() == null || this.Uu.getTecnico().trim().isEmpty() ? "\u2014" : this.Uu.getTecnico());
        this.faixaTime.cores(color2, color);
        this.wq();
        this.afS.setText("");
        object = null;
        serializable4 = new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/escudos/" + this.Uu.getFileRef() + ".png");
        if (((File)serializable4).exists() && !((File)serializable4).isDirectory()) {
            try {
                object = ImageIO.read(new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/escudos/" + this.Uu.getFileRef() + ".png"));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            serializable3 = new ImageIcon((Image)object);
            this.Fq.setIcon((Icon)((Object)serializable3));
        } else {
            this.Fq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        }
        serializable3 = new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas/" + this.Uu.getFileRef() + ".png");
        if (((File)serializable3).exists() && !((File)serializable4).isDirectory()) {
            try {
                object = ImageIO.read(new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas/" + this.Uu.getFileRef() + ".png"));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.b((BufferedImage)object);
            serializable2 = new ImageIcon((Image)object);
            this.UR.setIcon((Icon)((Object)serializable2));
        } else {
            this.UR.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        }
        serializable2 = new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas2/" + this.Uu.getFileRef() + ".png");
        if (((File)serializable2).exists() && !((File)serializable4).isDirectory()) {
            try {
                object = ImageIO.read(new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas2/" + this.Uu.getFileRef() + ".png"));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            serializable = new ImageIcon((Image)object);
            this.US.setIcon((Icon)((Object)serializable));
            this.b((BufferedImage)object);
        } else {
            this.US.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        }
        serializable = new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas3/" + this.Uu.getFileRef() + ".png");
        if (((File)serializable).exists() && !((File)serializable4).isDirectory()) {
            try {
                object = ImageIO.read(new File(String.valueOf(nucleo.UtilitariosTexto.cK) + "/teams/camisas3/" + this.Uu.getFileRef() + ".png"));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            ImageIcon imageIcon2 = new ImageIcon((Image)object);
            this.UT.setIcon(imageIcon2);
        } else {
            this.UT.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        }
    }

    private void wF() {
        this.Vg.getColumnModel().getColumn(0).setPreferredWidth(200);
        this.Vg.getColumnModel().getColumn(1).setPreferredWidth(140);
        this.Vg.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.Vg.getColumnModel().getColumn(2).setMaxWidth(64);
        this.Vg.setAutoResizeMode(3);
        this.Vg.setShowGrid(false);
        this.Vg.setDefaultRenderer(modelos.ModeloTime2.class, new RendererNomeTime());
        this.Vg.setAutoCreateRowSorter(false);
        this.Vg.getTableHeader().setCursor(new Cursor(12));
        this.Vg.setCellSelectionEnabled(false);
        this.Vg.setSelectionMode(2);
        this.Vg.getSelectionModel().addListSelectionListener(new ListenerSelecaoTime(this));
        this.Vg.setRowSelectionAllowed(true);
        this.Vg.setRowHeight(30);
        this.Vg.setIntercellSpacing(new Dimension(0, 0));
        this.Vg.getTableHeader().setReorderingAllowed(false);
        TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(this.Vg.getModel());
        this.Vg.setRowSorter(tableRowSorter);
        // Ordem: país (alfabética) > série do Brasileirão > nome do time; cliques no cabeçalho continuam valendo.
        final java.text.Collator collator = java.text.Collator.getInstance(new java.util.Locale("pt", "BR"));
        collator.setStrength(java.text.Collator.PRIMARY);
        Comparator<Object> porNome = (a, b) -> collator.compare(((modelos.ModeloTime2)a).getNome(), ((modelos.ModeloTime2)b).getNome());
        Comparator<Object> porPais = (a, b) -> {
            modelos.ModeloTime2 x = (modelos.ModeloTime2)a;
            modelos.ModeloTime2 y = (modelos.ModeloTime2)b;
            int c = collator.compare(JanelaEditorBetfoot.nomePais(x.getPais()), JanelaEditorBetfoot.nomePais(y.getPais()));
            if (c == 0) {
                c = Integer.compare(JanelaEditorBetfoot.ordemSerie(x), JanelaEditorBetfoot.ordemSerie(y));
            }
            return c != 0 ? c : porNome.compare(a, b);
        };
        Comparator<Object> porNivel = (a, b) -> {
            int c = Integer.compare(((modelos.ModeloTime2)b).getNivel(), ((modelos.ModeloTime2)a).getNivel());
            return c != 0 ? c : porNome.compare(a, b);
        };
        tableRowSorter.setComparator(0, porNome);
        tableRowSorter.setComparator(1, porPais);
        tableRowSorter.setComparator(2, porNivel);
        tableRowSorter.setSortKeys(java.util.Arrays.asList(new javax.swing.RowSorter.SortKey(1, javax.swing.SortOrder.ASCENDING)));
        this.ligarArvore();
        TemaBetfoot.tabela(this.Vg, this.ut);
        this.Vg.getModel().addTableModelListener(tableModelEvent -> this.atualizarContador());
        this.atualizarContador();
    }

    public void ah(String string) {
        this.Uc = true;
        this.wO().addNotify();
        this.wO().setRowSelectionInterval(0, 0);
        int n2 = this.Vg.convertRowIndexToModel(this.Vg.getSelectedRow());
        ((ModeloTabelaTimes)this.Vg.getModel()).et(n2);
        ((ModeloTabelaTimes)this.Vg.getModel()).fireTableDataChanged();
        if (string != null) {
            ModeloTabelaTimes ignorado = (ModeloTabelaTimes)this.Vg.getModel();
            ModeloTabelaTimes.eL(0);
            ((ModeloTabelaTimes)this.Vg.getModel()).ai(string);
        }
    }

    public void an(String string) {
        int n2 = 0;
        while (n2 < this.Uu.getJogadores().size()) {
            if (string.length() <= ((ModeloJogador2)this.Uu.getJogadores().get(n2)).getNome().length() && string.equalsIgnoreCase(UtilitariosTexto.f(((ModeloJogador2)this.Uu.getJogadores().get(n2)).getNome()).substring(0, string.length()))) {
                nucleo.UtilitariosTexto.da().wJ().changeSelection(n2, 0, true, true);
                nucleo.UtilitariosTexto.da().wJ().setRowSelectionInterval(n2, n2);
                break;
            }
            ++n2;
        }
    }

    public void wG() {
        this.wJ().addNotify();
        this.wJ().setRowSelectionInterval(0, 0);
        int n2 = this.Vg.convertRowIndexToModel(this.Vg.getSelectedRow());
        ((ModeloTabelaTimes)this.Vg.getModel()).et(n2);
        this.wq();
    }

    public void wH() {
        this.UQ.getColumnModel().getColumn(0).setPreferredWidth(20);
        this.UQ.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.UQ.getColumnModel().getColumn(2).setPreferredWidth(120);
        this.UQ.getColumnModel().getColumn(3).setPreferredWidth(70);
        this.UQ.getColumnModel().getColumn(4).setPreferredWidth(57);
        this.UQ.getColumnModel().getColumn(5).setPreferredWidth(40);
        this.UQ.getColumnModel().getColumn(6).setPreferredWidth(60);
        this.UQ.getColumnModel().getColumn(7).setPreferredWidth(60);
        // Ícone de titular e estrela: colunas estreitas e fixas.
        for (int i = 0; i < 2; ++i) {
            this.UQ.getColumnModel().getColumn(i).setMinWidth(i == 0 ? 40 : 28);
            this.UQ.getColumnModel().getColumn(i).setMaxWidth(i == 0 ? 40 : 28);
        }
        this.UQ.getColumnModel().getColumn(2).setPreferredWidth(220);
        this.UQ.setAutoResizeMode(3);
        this.UQ.setAutoCreateRowSorter(false);
        this.UQ.setShowGrid(false);
        this.UQ.setDefaultRenderer(String.class, new RenderizadorCelulaJogador());
        this.UQ.setDefaultRenderer(Integer.class, new RenderizadorCelulaJogador());
        this.UQ.setDefaultRenderer(Icon.class, new RenderizadorCelulaJogador());
        this.UQ.setDefaultRenderer(ImageIcon.class, new RenderizadorCelulaJogador());
        this.UQ.setDefaultRenderer(Boolean.class, new RenderizadorCelulaJogador());
        this.UQ.setCellSelectionEnabled(false);
        this.UQ.setSelectionMode(0);
        this.UQ.setRowSelectionAllowed(true);
        this.UQ.setRowHeight(30);
        this.UQ.setIntercellSpacing(new Dimension(0, 0));
        this.UQ.getTableHeader().setReorderingAllowed(false);
    }

    public modelos.ModeloTime2 wI() {
        return this.Uu;
    }

    public void d(modelos.ModeloTime2 t2) {
        this.Uu = t2;
    }

    public JTable wJ() {
        return this.UQ;
    }

    public void b(JTable jTable) {
        this.UQ = jTable;
    }

    public boolean wK() {
        return this.Uc;
    }

    public void aJ(boolean bl) {
        this.Uc = bl;
    }

    public ModeloJogador2 wL() {
        return this.Uv;
    }

    public void a(ModeloJogador2 g2) {
        this.Uv = g2;
    }

    public boolean wM() {
        return this.Ux;
    }

    public void aK(boolean bl) {
        this.Ux = bl;
    }

    public boolean wN() {
        return this.Uy;
    }

    public void aL(boolean bl) {
        this.Uy = bl;
    }

    public JTable wO() {
        return this.Vg;
    }

    public JButton wP() {
        return this.UN;
    }

    public JButton wQ() {
        return this.UO;
    }

    public boolean wR() {
        return this.Uz;
    }

    public void aM(boolean bl) {
        this.Uz = bl;
    }

    public JanelaTransferenciaJogador wS() {
        return this.UA;
    }

    private void Ay() {
        ModeloTabelaTimes ay2 = new ModeloTabelaTimes();
        this.Vg = new TabelaListaTimes(this, ay2);
        this.ut.setViewportView(this.Vg);
    }

    private void mJ() {
        this.vd = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        this.wf = new JPanel();
        this.Ve = new JLabel();
        this.Ej = new TemaBetfoot.Campo("Buscar time (digite para filtrar)");
        this.UJ = new JButton();
        this.Vd = new JLabel();
        this.Ek = new TemaBetfoot.Campo("Buscar jogador em todos os times");
        this.UK = new JButton();
        this.Va = new JLabel();
        this.UM = new JButton();
        this.UE = new JButton();
        this.UL = new JButton();
        this.ut = new JScrollPane();
        this.Vg = new JTable();
        this.UC = new JButton();
        this.UF = new JButton();
        this.UD = new JButton();
        this.Kc = new JButton();
        this.BZ = new JButton();
        this.we = new JPanel(new java.awt.BorderLayout(0, 18));
        this.wi = new JScrollPane();
        this.contadorTimes = new JLabel();
        this.Fq = new JLabel() {
            @Override
            public void setIcon(javax.swing.Icon icon) {
                // Escudo maior que o arquivo (60×60), suavizado.
                super.setIcon(icon == null || icon.getIconHeight() <= 0 ? icon : new TemaBetfoot.IconeEscalado(icon, 120 * icon.getIconWidth() / icon.getIconHeight(), 120, 0));
            }
        };
        this.UQ = new JTable() {
            @Override
            public java.awt.Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
                return TemaBetfoot.linha(this, super.prepareRenderer(tableCellRenderer, n, n2), n, n2);
            }
        };
        this.UG = new JButton();
        this.UI = new JButton();
        this.UH = new JButton();
        this.UO = new JButton();
        this.UN = new JButton();
        this.UZ = new JLabel();
        this.UY = new JLabel();
        this.UT = JanelaEditorBetfoot.camisa();
        this.UR = JanelaEditorBetfoot.camisa();
        this.US = JanelaEditorBetfoot.camisa();
        this.Gk = new JLabel();
        this.Vc = new JLabel();
        this.MQ = new JLabel();
        this.UX = new JLabel();
        this.MM = new JLabel();
        this.MR = new JLabel();
        this.Vf = new JLabel();
        this.UV = new JLabel();
        this.UU = new JLabel();
        this.MS = new JLabel();
        this.Vb = new JLabel();
        this.UW = new JLabel();
        this.afR = new JButton();
        this.Nq = new JComboBox();
        this.afS = new TemaBetfoot.Aviso();
        this.faixaTime = new TemaBetfoot.FaixaCores();
        this.setDefaultCloseOperation(3);
        this.setMinimumSize(new Dimension(1240, 760));
        // ---- Botões ----
        TemaBetfoot.botao(this.Kc, TemaBetfoot.Estilo.FANTASMA, "Início", TemaBetfoot.Simbolo.CASA);
        TemaBetfoot.botao(this.BZ, TemaBetfoot.Estilo.SECUNDARIO, "Sair do jogo", TemaBetfoot.Simbolo.SAIR);
        TemaBetfoot.botao(this.UC, TemaBetfoot.Estilo.PRIMARIO, "Novo time", TemaBetfoot.Simbolo.MAIS);
        TemaBetfoot.botao(this.UF, TemaBetfoot.Estilo.SECUNDARIO, "Editar time", TemaBetfoot.Simbolo.LAPIS);
        TemaBetfoot.botao(this.UD, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.LIXEIRA);
        this.UC.setToolTipText("Criar um time novo");
        this.UF.setToolTipText("Editar nome, cores, estádio e dados do time  (" + JanelaEditorBetfoot.atalho("E") + ")");
        this.UD.setToolTipText("Excluir este time");
        TemaBetfoot.botao(this.UM, TemaBetfoot.Estilo.CHIP, "Sem escudo", null);
        TemaBetfoot.botao(this.UL, TemaBetfoot.Estilo.CHIP, "Sem camisa", null);
        TemaBetfoot.botao(this.UE, TemaBetfoot.Estilo.CHIP, "Duplicados", null);
        this.UM.setToolTipText("Destaca em vermelho os times sem escudo");
        this.UL.setToolTipText("Destaca em vermelho os times sem camisas");
        this.UE.setToolTipText("Destaca em vermelho os times com jogadores repetidos");
        TemaBetfoot.botao(this.UG, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.JOGADOR_MAIS);
        TemaBetfoot.botao(this.UI, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.JOGADOR_LAPIS);
        TemaBetfoot.botao(this.UH, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.JOGADOR_MENOS);
        this.UG.setToolTipText("Adicionar jogador  (" + JanelaEditorBetfoot.atalho("N") + ")");
        this.UI.setToolTipText("Editar jogador selecionado  (Enter)");
        this.UH.setToolTipText("Remover jogador selecionado  (Delete)");
        TemaBetfoot.botao(this.afR, TemaBetfoot.Estilo.PRIMARIO, "Criar aleatório", TemaBetfoot.Simbolo.DADO);
        this.afR.setToolTipText("Sorteia um jogador na posição escolhida e mostra antes de adicionar  (" + JanelaEditorBetfoot.atalho("R") + ")");
        TemaBetfoot.botao(this.UO, TemaBetfoot.Estilo.ABA, "Principal", null);
        TemaBetfoot.botao(this.UN, TemaBetfoot.Estilo.ABA, "Juniores", null);
        this.UO.putClientProperty("simbolo", TemaBetfoot.Simbolo.PESSOA);
        this.UN.putClientProperty("simbolo", TemaBetfoot.Simbolo.PESSOAS);
        this.UO.setIcon(new ImageIcon(this.getClass().getResource("/aicons/greencheck.png")));
        this.UO.setToolTipText("Elenco principal (até 30)");
        this.UN.setToolTipText("Juniores (até 15)");
        this.Nq.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        TemaBetfoot.combo(this.Nq);
        this.Nq.setToolTipText("Posição do jogador sorteado");
        JButton ajuda = TemaBetfoot.botao(new JButton(), TemaBetfoot.Estilo.ICONE, "?", null);
        ajuda.setFont(TemaBetfoot.display(18.0f));
        ajuda.setToolTipText("Atalhos e dicas");
        ajuda.addActionListener(actionEvent -> this.mostrarAtalhos());
        // ---- Tabelas ----
        this.Vg.setModel(new DefaultTableModel(new Object[][]{new Object[4], new Object[4], new Object[4], new Object[4]}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.ut.setViewportView(this.Vg);
        this.UQ.setModel(new DefaultTableModel(new Object[][]{new Object[4], new Object[4], new Object[4], new Object[4]}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.wi.setViewportView(this.UQ);
        TemaBetfoot.tabela(this.UQ, this.wi);
        // ---- Dados do time (clicáveis para editar) ----
        this.Fq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.Fq.setCursor(new Cursor(12));
        this.Fq.setName("labescudo");
        this.Fq.setToolTipText("Escudo do time");
        this.Gk.setFont(TemaBetfoot.display(52.0f));
        this.Gk.setText("Nome do Time");
        this.Vc.setIcon(new ImageIcon(this.getClass().getResource("/aicons/paisVazio.png")));
        this.UX.setIcon(new ImageIcon(this.getClass().getResource("/aicons/paisVazio.png")));
        this.Vf.setIcon(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.ESTADIO, 20, TemaBetfoot.VERDE));
        this.UU.setIcon(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.APITO, 20, TemaBetfoot.VERDE));
        this.MQ.setText("pais");
        this.MM.setText("estado");
        this.MR.setText("reputação");
        this.UV.setText("estádio");
        this.MS.setText("técnico");
        this.UW.setText("lugares");
        this.Vb.setText("20");
        for (JLabel jLabel : new JLabel[]{this.MQ, this.MM, this.UV, this.MS, this.UW, this.Vb}) {
            jLabel.setFont(TemaBetfoot.fonte(Font.BOLD, 16.0f));
        }
        this.MR.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.08f));
        for (JLabel jLabel : new JLabel[]{this.Gk, this.MQ, this.MM, this.MR, this.UV, this.MS, this.UW, this.Vb}) {
            JanelaEditorBetfoot.editavel(jLabel);
        }
        this.MR.setForeground(TemaBetfoot.VERDE);
        this.UT.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        this.UR.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        this.US.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisaVazia.png")));
        this.UR.setToolTipText("Uniforme 1");
        this.US.setToolTipText("Uniforme 2");
        this.UT.setToolTipText("Uniforme 3");
        this.UZ.setText("25/30");
        this.UY.setText("25");
        this.afS.setText("");
        // ---- Topo: logo oficial, busca global de jogador, navegação ----
        JPanel topo = new JPanel(new java.awt.BorderLayout(24, 0));
        topo.setOpaque(false);
        topo.add((java.awt.Component)new TemaBetfoot.Marca("Editor de Times", "Times, elencos e uniformes do seu Betfoot"), "West");
        JPanel buscaGlobal = TemaBetfoot.caixaBusca(this.Ek, this.UJ);
        buscaGlobal.setPreferredSize(new Dimension(380, 44));
        this.Ek.setToolTipText("Enter busca; Enter de novo vai para o próximo jogador com esse nome  (" + JanelaEditorBetfoot.atalho("⇧F") + ")");
        JPanel buscaCentro = new JPanel(new java.awt.GridBagLayout());
        buscaCentro.setOpaque(false);
        buscaCentro.add(buscaGlobal);
        topo.add((java.awt.Component)buscaCentro, "Center");
        topo.add((java.awt.Component)JanelaEditorBetfoot.linha(10, ajuda, this.Kc, this.BZ), "East");
        // ---- Coluna da esquerda: times ----
        JPanel cabecalhoTimes = new JPanel();
        cabecalhoTimes.setOpaque(false);
        cabecalhoTimes.setLayout(new javax.swing.BoxLayout(cabecalhoTimes, 1));
        JPanel tituloTimes = new JPanel(new java.awt.BorderLayout());
        tituloTimes.setOpaque(false);
        tituloTimes.add((java.awt.Component)TemaBetfoot.titulo("Times"), "West");
        this.contadorTimes.setFont(TemaBetfoot.display(20.0f));
        this.contadorTimes.setForeground(TemaBetfoot.VERDE);
        tituloTimes.add((java.awt.Component)this.contadorTimes, "East");
        cabecalhoTimes.add(JanelaEditorBetfoot.esticar(tituloTimes));
        cabecalhoTimes.add(javax.swing.Box.createVerticalStrut(12));
        this.Ej.setToolTipText("Enter busca; Enter de novo vai para o próximo  (" + JanelaEditorBetfoot.atalho("F") + ")");
        cabecalhoTimes.add(JanelaEditorBetfoot.esticar(TemaBetfoot.caixaBusca(this.Ej, this.UK)));
        cabecalhoTimes.add(javax.swing.Box.createVerticalStrut(12));
        JPanel destaque = new JPanel(new java.awt.BorderLayout(10, 0));
        destaque.setOpaque(false);
        JLabel rotuloDestaque = TemaBetfoot.rotulo("Destacar");
        rotuloDestaque.setToolTipText("Pinta de vermelho, na lista, os times com o problema escolhido");
        destaque.add((java.awt.Component)rotuloDestaque, "West");
        destaque.add((java.awt.Component)JanelaEditorBetfoot.linha(6, this.UM, this.UL, this.UE), "Center");
        cabecalhoTimes.add(JanelaEditorBetfoot.esticar(destaque));
        this.vd.add((java.awt.Component)cabecalhoTimes, "North");
        this.arvoreTimes = new ArvoreTimes();
        this.vd.add((java.awt.Component)this.arvoreTimes, "Center");
        JPanel rodapeTimes = new JPanel(new java.awt.BorderLayout());
        rodapeTimes.setOpaque(false);
        rodapeTimes.add((java.awt.Component)this.UC, "Center");
        this.vd.add((java.awt.Component)rodapeTimes, "South");
        this.vd.setPreferredSize(new Dimension(400, 600));
        // ---- Destaque do time selecionado (cores do time ao fundo) ----
        this.faixaTime.setPreferredSize(new Dimension(64, 4));
        this.faixaTime.setMaximumSize(new Dimension(64, 4));
        this.faixaTime.setAlignmentX(0.0f);
        final TemaBetfoot.FaixaCores cores = this.faixaTime;
        TemaBetfoot.Cartao destaqueTime = new TemaBetfoot.Cartao(new java.awt.BorderLayout(28, 0)) {
            @Override
            protected void paintComponent(java.awt.Graphics graphics) {
                super.paintComponent(graphics);
                java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
                g.clip(new java.awt.geom.RoundRectangle2D.Double(0.0, 0.0, this.getWidth(), this.getHeight(), 36.0, 36.0));
                // Brilho com a cor principal do time atrás do escudo.
                Color viva = cores.corViva();
                g.setPaint(new java.awt.RadialGradientPaint(103.0f, this.getHeight() / 2.0f, 150.0f, new float[]{0.0f, 1.0f}, new Color[]{TemaBetfoot.alfa(viva, 0.22), TemaBetfoot.alfa(viva, 0.0)}));
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
                g.dispose();
            }
        };
        destaqueTime.setBorder(javax.swing.BorderFactory.createEmptyBorder(22, 28, 22, 28));
        JPanel escudo = new JPanel(new java.awt.GridBagLayout());
        escudo.setOpaque(false);
        escudo.setPreferredSize(new Dimension(150, 150));
        escudo.add(this.Fq);
        destaqueTime.add((java.awt.Component)escudo, "West");
        JPanel dados = new JPanel();
        dados.setOpaque(false);
        dados.setLayout(new javax.swing.BoxLayout(dados, 1));
        dados.add(JanelaEditorBetfoot.esticar(JanelaEditorBetfoot.linha(10, TemaBetfoot.rotulo("Time selecionado"), new JLabel(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.TROFEU, 14, TemaBetfoot.VERDE)), this.MR)));
        dados.add(JanelaEditorBetfoot.esticar(this.Gk));
        dados.add(javax.swing.Box.createVerticalStrut(2));
        dados.add(this.faixaTime);
        dados.add(javax.swing.Box.createVerticalStrut(18));
        final JPanel blocoEstado = JanelaEditorBetfoot.estatistica(this.UX, this.MM, "Estado");
        final java.awt.Component divisorEstado = JanelaEditorBetfoot.divisor();
        this.MM.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent componentEvent) {
                blocoEstado.setVisible(true);
                divisorEstado.setVisible(true);
            }

            @Override
            public void componentHidden(java.awt.event.ComponentEvent componentEvent) {
                blocoEstado.setVisible(false);
                divisorEstado.setVisible(false);
            }
        });
        JLabel iconeNivel = new JLabel(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.NIVEL, 20, TemaBetfoot.VERDE));
        JLabel iconeCapacidade = new JLabel(new TemaBetfoot.IconeVetor(TemaBetfoot.Simbolo.PESSOAS, 20, TemaBetfoot.VERDE));
        JPanel blocoPais = JanelaEditorBetfoot.estatistica(this.Vc, this.MQ, "País");
        blocoPais.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 18));
        dados.add(JanelaEditorBetfoot.esticar(JanelaEditorBetfoot.linha(0, blocoPais, JanelaEditorBetfoot.divisor(), blocoEstado, divisorEstado, JanelaEditorBetfoot.estatistica(iconeNivel, this.Vb, "Nível"), JanelaEditorBetfoot.divisor(), JanelaEditorBetfoot.estatistica(this.Vf, this.UV, "Estádio"), JanelaEditorBetfoot.divisor(), JanelaEditorBetfoot.estatistica(iconeCapacidade, this.UW, "Capacidade"), JanelaEditorBetfoot.divisor(), JanelaEditorBetfoot.estatistica(this.UU, this.MS, "Técnico"))));
        JPanel dadosCentro = new JPanel(new java.awt.GridBagLayout());
        dadosCentro.setOpaque(false);
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.weightx = 1.0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        dadosCentro.add((java.awt.Component)dados, gbc);
        destaqueTime.add((java.awt.Component)dadosCentro, "Center");
        JPanel lateral = new JPanel();
        lateral.setOpaque(false);
        lateral.setLayout(new javax.swing.BoxLayout(lateral, 1));
        JPanel uniformes = JanelaEditorBetfoot.linha(2, this.UR, this.US, this.UT);
        uniformes.setAlignmentX(1.0f);
        JPanel acoesTime = JanelaEditorBetfoot.linha(8, this.UF, this.UD);
        acoesTime.setAlignmentX(1.0f);
        lateral.add(javax.swing.Box.createVerticalGlue());
        lateral.add(uniformes);
        lateral.add(javax.swing.Box.createVerticalStrut(14));
        lateral.add(acoesTime);
        lateral.add(javax.swing.Box.createVerticalGlue());
        destaqueTime.add((java.awt.Component)lateral, "East");
        this.we.setOpaque(false);
        this.we.add((java.awt.Component)destaqueTime, "North");
        // ---- Elenco ----
        TemaBetfoot.Cartao elenco = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        elenco.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 18, 16, 18));
        JPanel barraElenco = new JPanel(new java.awt.BorderLayout(16, 0));
        barraElenco.setOpaque(false);
        barraElenco.add((java.awt.Component)JanelaEditorBetfoot.linha(4, this.UO, this.UN), "West");
        TemaBetfoot.Medidor medidor = new TemaBetfoot.Medidor(this.UZ, this.UY);
        barraElenco.add((java.awt.Component)medidor, "East");
        elenco.add((java.awt.Component)barraElenco, "North");
        elenco.add((java.awt.Component)this.wi, "Center");
        JPanel barraAcoes = new JPanel(new java.awt.BorderLayout(12, 0));
        barraAcoes.setOpaque(false);
        barraAcoes.add((java.awt.Component)JanelaEditorBetfoot.linha(8, this.UG, this.UI, this.UH), "West");
        barraAcoes.add((java.awt.Component)this.afS, "Center");
        barraAcoes.add((java.awt.Component)JanelaEditorBetfoot.linha(10, this.Nq, this.afR), "East");
        elenco.add((java.awt.Component)barraAcoes, "South");
        this.we.add((java.awt.Component)elenco, "Center");
        // ---- Janela ----
        JPanel corpo = new JPanel(new java.awt.BorderLayout(20, 0));
        corpo.setOpaque(false);
        corpo.add((java.awt.Component)this.vd, "West");
        corpo.add((java.awt.Component)this.we, "Center");
        TemaBetfoot.Fundo fundo = new TemaBetfoot.Fundo(new java.awt.BorderLayout(0, 20));
        fundo.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 28, 24, 28));
        fundo.add((java.awt.Component)topo, "North");
        fundo.add((java.awt.Component)corpo, "Center");
        this.setContentPane(fundo);
        this.atalhos(fundo);
        this.pack();
    }

    private static String atalho(String string) {
        boolean mac = System.getProperty("os.name", "").toLowerCase().contains("mac");
        return (mac ? "⌘" : "Ctrl+") + string;
    }

    /** Atalhos de teclado do editor (Ctrl no Windows/Linux, Cmd no macOS). */
    private void atalhos(JComponent jComponent) {
        int menu = java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx();
        javax.swing.InputMap im = jComponent.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        javax.swing.ActionMap am = jComponent.getActionMap();
        Object[][] mapa = new Object[][]{
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, menu), (Runnable)() -> this.Ej.requestFocusInWindow()},
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, menu | java.awt.event.InputEvent.SHIFT_DOWN_MASK), (Runnable)() -> this.Ek.requestFocusInWindow()},
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, menu), (Runnable)() -> this.UG.doClick()},
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, menu), (Runnable)() -> this.UF.doClick()},
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, menu), (Runnable)() -> this.afR.doClick()},
            {javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0), (Runnable)() -> this.mostrarAtalhos()}
        };
        for (int i = 0; i < mapa.length; ++i) {
            final Runnable r = (Runnable)mapa[i][1];
            im.put((javax.swing.KeyStroke)mapa[i][0], "atalho" + i);
            am.put("atalho" + i, new javax.swing.AbstractAction() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                    r.run();
                }
            });
        }
        // Na tabela do elenco: Enter edita e Delete/Backspace remove o jogador selecionado.
        javax.swing.InputMap tabela = this.UQ.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        tabela.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0), "editarJogador");
        tabela.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0), "removerJogador");
        tabela.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0), "removerJogador");
        this.UQ.getActionMap().put("editarJogador", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                JanelaEditorBetfoot.this.UI.doClick();
            }
        });
        this.UQ.getActionMap().put("removerJogador", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                JanelaEditorBetfoot.this.UH.doClick();
            }
        });
    }

    private void mostrarAtalhos() {
        String[][] linhas = new String[][]{
            {JanelaEditorBetfoot.atalho("F"), "Buscar time"},
            {JanelaEditorBetfoot.atalho("⇧F"), "Buscar jogador em todos os times"},
            {"Enter", "Na busca: próximo resultado · No elenco: editar jogador"},
            {"Delete", "Remover o jogador selecionado"},
            {JanelaEditorBetfoot.atalho("N"), "Adicionar jogador"},
            {JanelaEditorBetfoot.atalho("R"), "Criar jogador aleatório"},
            {JanelaEditorBetfoot.atalho("E"), "Editar o time"},
            {"Clique", "Em nome, estádio, nível… do time para editar direto"},
            {"Esc", "Fechar janelas e cancelar"}
        };
        JPanel lista = new JPanel(new java.awt.GridBagLayout());
        lista.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.anchor = java.awt.GridBagConstraints.WEST;
        c.insets = new java.awt.Insets(5, 0, 5, 18);
        for (int i = 0; i < linhas.length; ++i) {
            c.gridy = i;
            c.gridx = 0;
            JLabel tecla = new JLabel(linhas[i][0]);
            tecla.setFont(TemaBetfoot.display(16.0f));
            tecla.setForeground(TemaBetfoot.VERDE);
            lista.add((java.awt.Component)tecla, c);
            c.gridx = 1;
            JLabel desc = new JLabel(linhas[i][1]);
            desc.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            desc.setForeground(TemaBetfoot.TEXTO);
            lista.add((java.awt.Component)desc, c);
        }
        TemaBetfoot.escolher(this, "Atalhos e dicas", "Faça tudo sem tirar a mão do teclado", lista, new String[]{"Fechar"}, 0);
    }

    /** Linha horizontal de componentes, centralizados na vertical. */
    private static JPanel linha(int n, java.awt.Component ... componentArray) {
        JPanel jPanel = new JPanel(new java.awt.FlowLayout(0, 0, 0));
        jPanel.setOpaque(false);
        for (int i = 0; i < componentArray.length; ++i) {
            if (i > 0 && n > 0) {
                jPanel.add(javax.swing.Box.createHorizontalStrut(n));
            }
            jPanel.add(componentArray[i]);
        }
        JPanel externo = new JPanel(new java.awt.BorderLayout());
        externo.setOpaque(false);
        externo.add((java.awt.Component)jPanel, "West");
        return externo;
    }

    /** Dado do time: ícone num quadradinho, valor em negrito e legenda embaixo. */
    private static JPanel estatistica(JLabel icone, JLabel valor, String string) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(10, 0));
        jPanel.setOpaque(false);
        jPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 16, 0, 16));
        jPanel.add((java.awt.Component)icone, "West");
        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new javax.swing.BoxLayout(textos, 1));
        textos.add(javax.swing.Box.createVerticalGlue());
        valor.setAlignmentX(0.0f);
        textos.add(valor);
        JLabel legenda = TemaBetfoot.rotulo(string);
        legenda.setAlignmentX(0.0f);
        textos.add(legenda);
        textos.add(javax.swing.Box.createVerticalGlue());
        jPanel.add((java.awt.Component)textos, "Center");
        return jPanel;
    }

    private static java.awt.Component divisor() {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(TemaBetfoot.alfa(Color.WHITE, 0.12));
        jPanel.setPreferredSize(new Dimension(1, 34));
        return jPanel;
    }

    /** Camisa do time, 1,5× maior que o arquivo. */
    private static JLabel camisa() {
        return new JLabel() {
            @Override
            public void setIcon(javax.swing.Icon icon) {
                super.setIcon(TemaBetfoot.IconeEscalado.escalar(icon, 1.5));
            }
        };
    }

    private static String nomePais(int n) {
        try {
            return nucleo.EnumPaises.valueOf("P" + n).getNome();
        }
        catch (Exception exception) {
            return "";
        }
    }

    /** Série A..D = 1..4; fora das séries vai para o fim. */
    private static int ordemSerie(modelos.ModeloTime2 t2) {
        if (t2.getPais() != 29) {
            return 9;
        }
        int s = nucleo.DivisoesIniciais.serieNacional(t2.getFileRef());
        return s == 0 ? 9 : s;
    }

    /**
     * Liga a árvore País > Liga > Times à tabela de times do jogo (que continua existindo, escondida): escolher
     * na árvore seleciona na tabela, e o que o jogo selecionar (busca, novo time, exclusão) aparece na árvore.
     */
    private void ligarArvore() {
        this.arvoreTimes.construir(nucleo.UtilitariosTexto.cZ(), null);
        this.arvoreTimes.aoSelecionar(t2 -> {
            int modelo = nucleo.UtilitariosTexto.cZ().indexOf(t2);
            if (modelo < 0) {
                return;
            }
            int vista = this.Vg.convertRowIndexToView(modelo);
            if (vista >= 0) {
                this.Vg.setRowSelectionInterval(vista, vista);
            }
        });
        this.arvoreTimes.aoAbrir(() -> this.UF.doClick());
        // Busca de time ao digitar: a lista mostra só os times encontrados.
        final javax.swing.Timer digitando = new javax.swing.Timer(140, actionEvent -> this.arvoreTimes.buscar(this.Ej.getText()));
        digitando.setRepeats(false);
        this.Ej.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent documentEvent) {
                digitando.restart();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent documentEvent) {
                digitando.restart();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent documentEvent) {
                digitando.restart();
            }
        });
        this.arvoreTimes.aoLimparBusca(() -> this.Ej.setText(""));
        // Só pula para a liga do time quando a seleção vem de uma busca ou de um time novo; na abertura e nas
        // exclusões a lista fica na página em que está.
        final boolean[] irParaTime = new boolean[1];
        for (JButton jButton : new JButton[]{this.UK, this.UJ, this.UC}) {
            jButton.addActionListener(actionEvent -> irParaTime[0] = true);
        }
        this.Vg.getSelectionModel().addListSelectionListener(evento -> {
            if (!evento.getValueIsAdjusting() && irParaTime[0]) {
                javax.swing.SwingUtilities.invokeLater(() -> {
                    irParaTime[0] = false;
                    this.arvoreTimes.selecionar(this.Uu);
                });
            }
        });
        // Times criados, apagados ou renomeados: remonta a árvore.
        this.Vg.getModel().addTableModelListener(evento -> javax.swing.SwingUtilities.invokeLater(() -> {
            if (this.Uu != null) {
                ArvoreTimes.esquecerEscudo(this.Uu);
            }
            this.arvoreTimes.construir(nucleo.UtilitariosTexto.cZ(), this.Uu);
            this.atualizarContador();
        }));
        // Botões "Destacar": depois que o jogo marca os times, atualiza os vermelhos da árvore.
        for (JButton jButton : new JButton[]{this.UM, this.UL, this.UE}) {
            jButton.addActionListener(actionEvent -> javax.swing.SwingUtilities.invokeLater(() -> this.arvoreTimes.atualizarMarcas()));
        }
    }

    private void atualizarContador() {
        int n = nucleo.UtilitariosTexto.cZ().size();
        this.contadorTimes.setText(n + (n == 1 ? " time" : " times"));
    }

    /** Ícone + texto (ex.: bandeira e país), lado a lado. */
    private static JPanel par(JLabel jLabel, JLabel jLabel2) {
        JPanel jPanel = new JPanel(new java.awt.FlowLayout(0, 6, 0));
        jPanel.setOpaque(false);
        jPanel.add(jLabel);
        jPanel.add(jLabel2);
        return jPanel;
    }

    private static <C extends javax.swing.JComponent> C esticar(C c) {
        c.setAlignmentX(0.0f);
        c.setMaximumSize(new Dimension(Integer.MAX_VALUE, c.getPreferredSize().height));
        return c;
    }

    /** Rótulo que abre a edição ao clicar: mãozinha, dica e verde no hover. */
    private static void editavel(final JLabel jLabel) {
        jLabel.setForeground(TemaBetfoot.TEXTO);
        jLabel.setCursor(new Cursor(12));
        jLabel.setToolTipText("Clique para editar");
        jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            private Color antes;

            @Override
            public void mouseEntered(java.awt.event.MouseEvent mouseEvent) {
                this.antes = jLabel.getForeground();
                jLabel.setForeground(TemaBetfoot.VERDE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent mouseEvent) {
                if (this.antes != null) {
                    jLabel.setForeground(this.antes);
                }
            }
        });
    }

    static /* synthetic */ void a(JanelaEditorBetfoot n_02) {
        n_02.sp();
    }

    static /* synthetic */ JButton b(JanelaEditorBetfoot n_02) {
        return n_02.UO;
    }

    static /* synthetic */ JButton c(JanelaEditorBetfoot n_02) {
        return n_02.UN;
    }

    static /* synthetic */ JLabel d(JanelaEditorBetfoot n_02) {
        return n_02.afS;
    }

    static /* synthetic */ boolean e(JanelaEditorBetfoot n_02) {
        return n_02.Uc;
    }

    static /* synthetic */ void a(JanelaEditorBetfoot n_02, boolean bl) {
        n_02.Uc = bl;
    }

    static /* synthetic */ modelos.ModeloTime2 f(JanelaEditorBetfoot n_02) {
        return n_02.Uu;
    }

    static /* synthetic */ JTable g(JanelaEditorBetfoot n_02) {
        return n_02.UQ;
    }

    static /* synthetic */ void a(JanelaEditorBetfoot n_02, ModeloJogador2 g2) {
        n_02.Uv = g2;
    }

    static /* synthetic */ void h(JanelaEditorBetfoot n_02) {
        n_02.wt();
    }

    static /* synthetic */ void i(JanelaEditorBetfoot n_02) {
        n_02.ws();
    }

    static /* synthetic */ void j(JanelaEditorBetfoot n_02) {
        n_02.wu();
    }

    static /* synthetic */ void k(JanelaEditorBetfoot n_02) {
        n_02.ww();
    }

    static /* synthetic */ void l(JanelaEditorBetfoot n_02) {
        n_02.wr();
    }

    static /* synthetic */ JLabel m(JanelaEditorBetfoot n_02) {
        return n_02.UY;
    }
}

