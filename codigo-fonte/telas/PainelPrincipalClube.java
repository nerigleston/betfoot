package telas;

import nucleo.Plataforma;
import java.io.IOException;
import telas.PainelCalendarioTime;
import telas.TelaCampeoes;
import telas.PainelResumoTemporada;
import telas.PainelCoresTime;
import telas.PainelCentralMensagens;
import telas.PainelEmprestimosJogadores;
import telas.TelaEscalacao;
import telas.PainelFinancas;
import telas.PainelNumeracaoElenco;
import telas.DialogoExpansaoEstadio;
import telas.PainelAcademiaJuniores;
import telas.PainelFichaJogador;
import telas.ListenerAbrirTabelas;
import telas.ListenerMostrarMenuHistoria;
import telas.ListenerAbrirEstadio;
import telas.ListenerAbrirEscalarTime;
import telas.ListenerAtalhoTabelas;
import telas.ListenerAbrirAcademiaJuniores;
import telas.ListenerAbrirListaTimes;
import telas.ListenerAtalhoEscalarTime;
import telas.ListenerProcurar;
import telas.ListenerAtalhoJogosAmistosos;
import telas.ListenerAbrirTreino;
import telas.AcaoAtalhoArtilheiros;
import telas.ListenerAbrirFinancas;
import telas.AcaoAtalhoCampeoes;
import telas.ListenerAbrirCentralMensagens;
import telas.ListenerSelecaoLinhaJogador;
import telas.ListenerAbrirComparativoTimes;
import telas.ListenerCliqueTabelaJogadores;
import telas.ListenerAbrirTimeAdversarioNome;
import telas.ListenerProporContrato;
import telas.ListenerAbrirTimeAdversarioEscudo;
import telas.ListenerVenderJogador;
import telas.AcaoAtalhoFinancas;
import telas.ListenerAposentarJogador;
import telas.ListenerAbrirCoresTela;
import telas.ListenerEscolherNumeroJogador;
import telas.ListenerAbrirGaleriaTrofeus;
import telas.ListenerHistoricoJogador;
import telas.ListenerAbrirRetrospectoTime;
import telas.ListenerAtalhoSalvarJogo;
import telas.ListenerAbrirJogadoresEmprestados;
import telas.ListenerCancelarEmprestimo;
import telas.ListenerAbrirJogosDoTime;
import telas.ListenerComprarJogador;
import telas.ListenerAbrirJogosAmistosos;
import telas.ListenerAlternarEmprestimo;
import telas.ListenerAbrirCentralEmpregos;
import telas.ListenerMostrarMenuOpcoes;
import telas.ListenerAbrirJogosAmistososSelecao;
import telas.ListenerMostrarMenuAgenda;
import telas.ListenerAbrirCalendarioSelecao;
import telas.ListenerMostrarMenuSelecao;
import telas.ListenerConvocarSelecao;
import telas.ListenerMostrarMenuTecnicos;
import telas.ListenerAtalhoOpcoes;
import telas.ListenerDemitirSelecao;
import telas.ListenerSalvarJogo;
import telas.OuvinteMenuPreferencias;
import telas.ListenerDemitirTecnico;
import telas.ListenerSairJogo;
import telas.OuvinteMenuSobre;
import telas.ListenerAbrirRankingTecnicos;
import telas.ListenerAbrirTecnicosHumanos;
import telas.OuvinteMenuUltimasTrocasTecnicos;
import telas.OuvinteMenuTrofeusTecnico;
import telas.AcaoAtalhoCalendarioTime;
import telas.ListenerAbrirCampeoes;
import telas.ListenerAbrirRankingClubes;
import telas.ListenerAbrirRankingSelecoes;
import telas.ListenerAbrirArtilheiros;
import telas.ListenerAbrirLideresAssistencias;
import telas.OuvinteMenuGaleriaTrofeus;
import telas.OuvinteMenuTimeDaRodada;
import telas.OuvinteMenuTimeDoAno;
import telas.ListenerAbrirAcademiaJuniores2;
import telas.AcaoAtalhoBuscarJogadores;
import telas.AcaoAtalhoGerenciarClube;
import telas.DialogoSalvarJogo;
import telas.DialogoNovoContrato;
import telas.PainelRankingTecnicos;
import telas.PainelBuscaJogadores;
import telas.DialogoMelhoresPorPosicao;
import telas.PainelRankingClubes;
import telas.PainelUltimasMovimentacoes;
import telas.DialogoRetrospectoTime;
import telas.TelaTreinoJogador;
import telas.TelaTecnicosHumanos;
import telas.ListenerAbrirMelhoresPorDivisao;
import telas.ListenerAbrirTrocasTecnicos;
import telas.TelaVenderJogador;
import telas.DialogoAposentadoriaJogador;
import telas.PainelNegociacaoJogador;
import telas.PainelSobre;
import telas.OuvinteMenuHistoricoConfrontos;
import telas.OuvinteVazioBotaoAgenda;
import telas.OuvinteVazioBotaoEscalarTime;
import telas.PainelRankingSelecoes;
import telas.PainelMelhoresArtilheiros;
import telas.PainelLideresAssistencias;
import tabelas.FabricaComponentesTabela;
import tabelas.ModeloTabelaElencoTime;
import nucleo.BalancoFinanceiro;
import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.SorteadorJogadorAleatorio;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.Competicao;
import nucleo.EstadoCarreira;
import nucleo.LancadorBetfoot;
import nucleo.BuscadorTimeDestinoTransferencia;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import components.ModeloRegistroJogador;
import components.PainelDetalheJogador;
import components.ModeloOfertaJogador;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PainelPrincipalClube
extends JPanel {
    private ModeloTime zu = null;
    private ModeloJogador uz = null;
    private ModeloTime Hv = null;
    private ModeloPartida bv = null;
    private int AT = 0;
    private boolean Hw = false;
    private JPopupMenu Hx = new JPopupMenu();
    private JPopupMenu afi = new JPopupMenu();
    final JPopupMenu Hy = new JPopupMenu();
    final JPopupMenu Hz = new JPopupMenu();
    final JPopupMenu HA = new JPopupMenu();
    final JPopupMenu HB = new JPopupMenu();
    JMenuItem HC = new JMenuItem("Propor contrato");
    JMenuItem HD = new JMenuItem("Vender Jogador");
    JMenuItem HE = new JMenuItem("Aposentar Jogador");
    JMenuItem HF = new JMenuItem("Escolher n\u00famero");
    JMenuItem HG = new JMenuItem("Hist\u00f3rico do jogador");
    JMenuItem HH = new JMenuItem("Cancelar empr\u00e9stimo");
    JMenuItem HI = new JMenuItem("Comprar jogador");
    JMenuItem HJ = new JMenuItem("P\u00f4r para empr\u00e9stimo");
    private JFrame Br;
    private int tR = 0;
    private boolean yp = false;
    private boolean HK = false;
    private static boolean afj = false;
    private static boolean afk = false;
    private static double HL = 0.1;
    private static Color HM = null;
    private static boolean HN = false;
    private static Competicao HO = null;
    private static boolean HP = false;
    private static int HQ = 0;
    private JButton HR;
    private JButton HS;
    private JButton HT;
    private JButton HU;
    private JButton HV;
    private JButton HW;
    private JButton HX;
    private JButton yY;
    private JButton HY;
    private JButton afl;
    private JButton HZ;
    private JButton Ia;
    private JButton Ib;
    private JButton Ic;
    private JButton Id;
    private JButton Ie;
    private PainelDetalheJogador If;
    private JLabel ug;
    private JLabel Bj;
    private JLabel vw;
    private JLabel zb;
    private JLabel ze;
    private JLabel Ef;
    private JLabel Eg;
    private JLabel Eh;
    private JLabel uh;
    private JLabel a_;
    private JLabel ur;
    private JLabel us;
    private JLabel vz;
    private JPanel wf;
    private JProgressBar Hf;
    private JProgressBar Ig;
    private JToolBar.Separator Ih;
    private JToolBar.Separator Ii;
    private JToolBar.Separator Ij;
    private JToolBar.Separator Ik;
    private JToolBar.Separator Il;
    private JToolBar.Separator OD;
    private JToolBar.Separator Im;
    private JToolBar.Separator In;
    private JToolBar.Separator Io;
    private JToolBar.Separator Ip;
    private JToolBar.Separator Iq;
    private JToolBar.Separator Ir;
    private JToolBar.Separator Is;
    private JToolBar.Separator It;
    private JToolBar.Separator Iu;
    private JToolBar ve;
    private JToolBar Iv;
    private JLabel Fq;
    private JLabel yt;
    private JLabel Iw;
    private JScrollPane Ix;
    private JTable Iy;

    public ModeloTime qp() {
        return this.zu;
    }

    public static double qq() {
        return HL;
    }

    public PainelPrincipalClube(JFrame jFrame) {
        this.Br = jFrame;
        this.zu = EstadoCarreira.B();
        UIManager.put("ProgressBar.selectionForeground", this.zu.kC());
        UIManager.put("ProgressBar.selectionBackground", Color.black);
        this.bv = GerenciadorJogo.SR.bl();
        this.tR = this.bv.hy().b();
        HM = this.zu.kB();
        if (this.bv != null) {
            if (this.bv.hc() == this.zu) {
                this.Hv = this.bv.hd();
                this.AT = 0;
            } else {
                this.Hv = this.bv.hc();
                this.AT = 1;
            }
            if (this.tR == 7) {
                this.HK = true;
                this.yp = true;
            }
            this.Hw = this.bv.ic();
        }
        this.zu.ka().jo();
        if (this.zu.ka().jo() == this.zu) {
            this.yp = true;
        }
        if (this.yp) {
            int n2 = 0;
            while (n2 < this.zu.kc().size()) {
                ((ModeloJogador)this.zu.kc().get(n2)).b((JProgressBar)null);
                ++n2;
            }
        }
        HN = this.yp;
        this.ry();
        this.mJ();
        this.rz();
        Float f2 = Float.valueOf(0.2f);
        this.qs();
        this.qz();
        if (!this.yp) {
            this.qr();
        }
        if (this.yp) {
            this.Ie.setVisible(false);
            this.HY.setVisible(false);
            this.Ic.setVisible(false);
        }
        this.qv();
        this.qA();
        this.qB();
        this.AL();
        this.AM();
        this.rb();
        this.qD();
        this.mH();
        if (!GerenciadorJogo.SR.isHabilidadeIndividual() || this.yp) {
            this.Id.setVisible(false);
        }
        if (this.yp) {
            this.Iw.setVisible(false);
            this.ze.setVisible(false);
            this.HW.setVisible(false);
            this.HV.setVisible(false);
            this.ur.setVisible(false);
            this.us.setVisible(false);
            this.Hf.setVisible(false);
            this.Ig.setVisible(false);
        }
        this.mY();
        this.Eh.setVisible(false);
        if (!HP) {
            if (HQ > 10) {
                HP = true;
                LancadorBetfoot.ml();
            } else {
                ++HQ;
            }
        }
    }

    private void mY() {
        this.a((JComponent)this);
        this.a(this.Iy);
        this.a(this.HU);
        this.a(this.ve);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "enter");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(32, 0), "enter");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 113, "f2");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 114, "f3");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 115, "f4");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 117, "f6");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 116, "ctrlt");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 118, "f7");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 119, "f8");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 120, "f9");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 121, "f10");
        Plataforma.registrarTeclaF(jComponent.getInputMap(), 122, "f11");
        jComponent.getInputMap().put(Plataforma.atalho(84), "ctrlt");
        jComponent.getInputMap().put(Plataforma.atalho(70), "ctrlf");
        if (Plataforma.MAC) {
            jComponent.getInputMap().put(Plataforma.atalho(83), "f2");
            jComponent.getInputMap().put(Plataforma.atalho(44), "f3");
        }
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("enter", new ListenerAtalhoEscalarTime(this));
        jComponent.getActionMap().put("f2", new ListenerAtalhoSalvarJogo(this));
        jComponent.getActionMap().put("ctrlt", new ListenerAtalhoTabelas(this));
        jComponent.getActionMap().put("ctrlf", new AcaoAtalhoFinancas(this));
        jComponent.getActionMap().put("f3", new ListenerAtalhoOpcoes(this));
        jComponent.getActionMap().put("f4", new AcaoAtalhoCalendarioTime(this));
        jComponent.getActionMap().put("f6", new ListenerAbrirAcademiaJuniores2(this));
        jComponent.getActionMap().put("f7", new AcaoAtalhoBuscarJogadores(this));
        jComponent.getActionMap().put("f8", new AcaoAtalhoGerenciarClube(this));
        jComponent.getActionMap().put("f9", new ListenerAtalhoJogosAmistosos(this));
        jComponent.getActionMap().put("f10", new AcaoAtalhoArtilheiros(this));
        jComponent.getActionMap().put("f11", new AcaoAtalhoCampeoes(this));
    }

    public boolean ac(boolean bl) {
        int n2;
        int n3;
        ArrayList<ModeloJogador> arrayList = null;
        arrayList = new ArrayList<ModeloJogador>();
        if (bl && (n3 = this.zu.kr()) <= 0) {
            return false;
        }
        n3 = -1;
        if (!bl) {
            n2 = 0;
            while (n2 < this.zu.kc().size()) {
                if (!((ModeloJogador)this.zu.kc().get(n2)).gl().booleanValue()) {
                    arrayList.add((ModeloJogador)this.zu.kc().get(n2));
                }
                ++n2;
            }
            Collections.shuffle(arrayList);
            n3 = new Random().nextInt(arrayList.size());
        } else {
            n2 = 0;
            while (n2 < this.zu.kc().size()) {
                if (!((ModeloJogador)this.zu.kc().get(n2)).gl().booleanValue() && ((ModeloJogador)this.zu.kc().get(n2)).fz().booleanValue()) {
                    arrayList.add((ModeloJogador)this.zu.kc().get(n2));
                }
                ++n2;
            }
            Collections.shuffle(arrayList);
            n3 = new Random().nextInt(arrayList.size());
        }
        ModeloJogador f2 = null;
        f2 = (ModeloJogador)arrayList.get(n3);
        if (f2 != null) {
            BuscadorTimeDestinoTransferencia l2 = new BuscadorTimeDestinoTransferencia(f2, f2.fk(), true, true, 0);
            ModeloTime ah2 = l2.a(true, bl);
            int n4 = (int)((long)f2.fk() + Math.round((double)f2.fk() * 0.3));
            if (ah2 != null) {
                JDialog jDialog = new JDialog(this.Br);
                PainelNegociacaoJogador jm_02 = new PainelNegociacaoJogador(jDialog, f2, ah2, n4, bl);
                jDialog.add(jm_02);
                jDialog.setSize(403, 440);
                jDialog.setPreferredSize(new Dimension(403, 440));
                jDialog.setModal(true);
                jDialog.setResizable(false);
                jDialog.setLocationRelativeTo(null);
                jDialog.setUndecorated(true);
                jDialog.setVisible(true);
                if (PainelNegociacaoJogador.sO()) {
                    this.qI();
                    this.qJ();
                    this.pK();
                    this.qH();
                }
            }
        }
        return true;
    }

    private void qr() {
        block9: {
            int n2;
            block8: {
                n2 = 0;
                while (n2 < this.zu.kc().size()) {
                    ((ModeloJogador)this.zu.kc().get(n2)).aB(((ModeloJogador)this.zu.kc().get(n2)).fR());
                    ++n2;
                }
                if (GerenciadorJogo.SR.isAutoRenovaContrato()) {
                    n2 = 0;
                    while (n2 < this.zu.kc().size()) {
                        if (((ModeloJogador)this.zu.kc().get(n2)).fR() <= 0) {
                            ((ModeloJogador)this.zu.kc().get(n2)).a(180L, true);
                        }
                        ++n2;
                    }
                }
                if (GerenciadorJogo.SR.getAvisoTerminoContrato() != 1 || GerenciadorJogo.SR.isAutoRenovaContrato()) break block8;
                n2 = 0;
                while (n2 < this.zu.kc().size()) {
                    if (((ModeloJogador)this.zu.kc().get(n2)).fR() <= 0) {
                        new ModeloRegistroJogador(this.zu.ka(), 17, 67, ((ModeloJogador)this.zu.kc().get(n2)).getNome(), "");
                    }
                    ++n2;
                }
                break block9;
            }
            if (GerenciadorJogo.SR.getAvisoTerminoContrato() != 2) break block9;
            n2 = 0;
            while (n2 < this.zu.kc().size()) {
                if (!((ModeloJogador)this.zu.kc().get(n2)).gQ() && ((ModeloJogador)this.zu.kc().get(n2)).fR() < 31) {
                    ((ModeloJogador)this.zu.kc().get(n2)).r(true);
                    new ModeloRegistroJogador(this.zu.ka(), 16, 66, ((ModeloJogador)this.zu.kc().get(n2)).getNome(), "");
                }
                ++n2;
            }
        }
    }

    private void qs() {
        HL = 0.1;
        if (new Random().nextInt(100) > 80) {
            HL = 0.15;
        }
    }

    public void s(ModeloJogador f2) {
        this.uz = f2;
        this.qt();
    }

    private void qt() {
        if (this.uz != null && this.bv != null) {
            String string;
            Competicao at2 = this.bv.hy();
            PainelPrincipalClube.w(at2);
            this.If.a(this.uz, this.bv, at2, this.yp);
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aflags/" + this.uz.getPais() + ".png"));
            String string2 = "";
            String string3 = this.uz.fQ();
            String string4 = "Contrato at\u00e9:";
            if (this.uz.gl().booleanValue()) {
                string4 = "Emprestado at\u00e9:";
            }
            if (this.uz.fP() && this.uz.fo() > ((nucleo.Calendario)GerenciadorJogo.SR.R().get(GerenciadorJogo.SR.J())).a().getTime().getTime()) {
                string2 = "Fim contus\u00e3o: " + nucleo.Calendario.a(this.uz.fo());
            }
            int[] nArray = this.uz.e(this.bv.hy());
            int[] nArray2 = new int[6];
            nArray2 = this.uz.gw();
            if (nArray == null) {
                nArray = new int[2];
            }
            String string5 = "";
            if (this.uz.c(at2)) {
                string = "";
                if (nArray[0] >= 3) {
                    string = "3 cart\u00f5es amarelos";
                }
                if (nArray[1] == 1) {
                    string = "1 jogo";
                } else if (nArray[1] > 1) {
                    string = String.valueOf(Integer.toString(nArray[1])) + " jogos";
                }
                string5 = "Suspenso " + string;
            }
            string = "<html>\n<body><p style=\\\"padding:5; font-size:12\\\">\n<b>For\u00e7a:</b>&nbsp;" + Integer.toString(this.uz.fi()) + "&nbsp;&nbsp;&nbsp;";
            if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
                string = "<html>\n<body><p style=\\\"padding:5; font-size:12\\\"><b>Goleiro:</b> " + Integer.toString(this.uz.gK()) + " <b>Desarme:</b> " + Integer.toString(this.uz.gN()) + " <b>Passe:</b> " + Integer.toString(this.uz.gM()) + " <br><br><b>Arma\u00e7\u00e3o:</b> " + Integer.toString(this.uz.gO()) + " <b>Finaliza\u00e7\u00e3o:</b> " + Integer.toString(this.uz.gP()) + "<br><br><b>Velocidade:</b> " + Integer.toString(this.uz.gJ()) + " <b>T\u00e9cnica:</b> " + Integer.toString(this.uz.gL());
            }
            if (this.yp) {
                string4 = "";
                string3 = "";
            }
            String string6 = String.valueOf(string) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:12\\\">\n" + "<b>Jogos:" + "</b>&nbsp;" + Integer.toString(nArray2[0]) + "&nbsp;&nbsp;&nbsp;" + "<b>Gols:" + "</b>" + Integer.toString(nArray2[1]) + "&nbsp;&nbsp;&nbsp;" + "<b><br><br>" + "<b>Assist\u00eancias:" + "</b>" + Integer.toString(nArray2[5]) + "&nbsp;&nbsp;&nbsp;" + "<b>" + "&nbsp;&nbsp;&nbsp;" + "</b><br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n<b>Valor:" + "</b>&nbsp;" + BalancoFinanceiro.c(this.uz.fk()) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:12\\\">\n<b>" + "Sal\u00e1rio:" + "</b>&nbsp;" + BalancoFinanceiro.c(this.uz.fj()) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:12\\\">\n" + "<b>" + string2 + " " + string5 + "<br><b>" + string4 + " " + string3 + "<b></b>&nbsp; <br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n" + "<b><br>\n</p>\n</body></html>\n";
            this.If.h(2, true);
            this.If.h(3, true);
            this.If.h(4, true);
            this.HC.setEnabled(true);
            this.HD.setEnabled(true);
            if (this.uz.getIdade() > 32) {
                this.If.h(4, true);
                this.HE.setEnabled(true);
            } else {
                this.If.h(4, false);
                this.HE.setEnabled(false);
            }
            if (this.uz.gl().booleanValue() || this.yp) {
                this.If.h(1, false);
                this.If.h(2, false);
                this.If.h(3, false);
                this.If.h(4, false);
                this.HC.setEnabled(false);
                this.HD.setEnabled(false);
                this.HE.setEnabled(false);
                this.HH.setEnabled(true);
                this.HI.setEnabled(true);
                this.HJ.setEnabled(false);
            } else {
                this.HH.setEnabled(false);
                this.HI.setEnabled(false);
                this.HJ.setEnabled(true);
                if (this.uz.fz().booleanValue()) {
                    this.HJ.setText("N\u00e3o p\u00f4r para empr\u00e9stimo");
                } else {
                    this.HJ.setText("P\u00f4r para empr\u00e9stimo");
                }
            }
            if (this.yp) {
                this.HH.setEnabled(false);
                this.HI.setEnabled(false);
            }
            if (this.uz.ft().booleanValue()) {
                this.If.h(1, true);
                this.If.g(1, true);
            } else {
                this.If.h(1, false);
                this.If.g(1, false);
            }
        }
    }

    private void qu() {
        this.setBackground(this.zu.kB());
        UIManager.put("ProgressBar.selectionForeground", this.zu.kC());
        UIManager.put("ProgressBar.selectionBackground", Color.black);
        HM = this.zu.kB();
        this.wf.setBackground(this.zu.kB());
        this.Hf.setForeground(this.zu.kB());
        this.Ig.setForeground(this.zu.kB());
        this.Hf.setBorder(BorderFactory.createLineBorder(this.zu.kC(), 1));
        this.Ig.setBorder(BorderFactory.createLineBorder(this.zu.kC(), 1));
        this.Iv.setBackground(this.qp().kB());
        this.a_.setForeground(this.zu.kC());
        this.uh.setForeground(this.zu.kC());
        this.ur.setForeground(this.zu.kC());
        this.us.setForeground(this.zu.kC());
        this.vz.setForeground(this.zu.kB());
        this.vz.setBackground(this.zu.kC());
        this.vw.setForeground(this.zu.kC());
        this.Bj.setForeground(this.zu.kC());
        this.ug.setForeground(this.zu.kC());
        this.Ef.setForeground(this.zu.kC());
        this.Iw.setForeground(this.zu.kC());
        this.ze.setForeground(this.zu.kC());
        this.Eh.setForeground(this.zu.kC());
        this.If.setBorder(BorderFactory.createLineBorder(this.zu.kC()));
        this.If.oJ();
        this.Hf.setValue(this.zu.ka().lL());
        this.Ig.setValue(this.zu.ka().lM());
    }

    public void qv() {
        String string;
        this.qu();
        this.ur.setFont(new Font("Tahoma", 1, 11));
        this.us.setFont(new Font("Tahoma", 1, 11));
        if (this.bv.hy() != null) {
            string = "";
            if (this.bv.ht() instanceof LigaPontosCorridos && ((LigaPontosCorridos)this.bv.ht()).zb() > 1) {
                int n2 = 0;
                n2 = ((LigaPontosCorridos)this.bv.ht()).Q(this.zu);
                if (n2 > 0) {
                    string = " - " + Integer.toString(n2) + "\u00ba lugar";
                }
            }
            this.Bj.setText(this.bv.hI());
            if (this.bv.hy() != null && this.bv.ht() != null && this.bv.hy().b() == 1 && this.bv.ht() instanceof ChaveMataMata) {
                if (((ChaveMataMata)this.bv.ht()).zf() == 1099) {
                    this.Bj.setText("Mata Mata Ascenso - " + this.bv.hJ()[1]);
                } else if (((ChaveMataMata)this.bv.ht()).zf() == 1098) {
                    this.Bj.setText("Playoff rebaixamento - " + this.bv.hJ()[1]);
                }
            }
            this.uh.setText(String.valueOf(this.bv.hy().getNome()) + string);
        } else {
            this.uh.setText("");
            this.Bj.setText("");
        }
        this.ug.setText(this.zu.getNome());
        this.a_.setText(this.zu.ka().dS());
        this.ze.setText("Mensagens");
        this.Hf.setValue(this.zu.ka().lL());
        this.Ig.setValue(this.zu.ka().lM());
        this.Eg.setText(GerenciadorJogo.SR.T());
        if (!this.yp) {
            this.Fq.setIcon(this.zu.kP());
        } else {
            this.Fq.setIcon(this.zu.K(true));
        }
        this.vw.setIcon(null);
        string = "";
        if (this.Hw) {
            string = " - cl\u00e1ssico";
        }
        if (this.Hv != null) {
            String string2 = "";
            if (this.bv.ht() instanceof LigaPontosCorridos && ((LigaPontosCorridos)this.bv.ht()).zb() > 1) {
                int n3 = 0;
                n3 = ((LigaPontosCorridos)this.bv.ht()).Q(this.Hv);
                if (n3 > 0) {
                    string2 = "(" + Integer.toString(n3) + "\u00ba)";
                }
            }
            String string3 = " - Casa";
            if (this.AT == 1) {
                string3 = " - Fora";
            }
            if (!this.yp) {
                this.yt.setIcon(this.Hv.kP());
            } else {
                this.yt.setIcon(this.Hv.K(true));
            }
            if (this.bv.ev() == null) {
                string3 = !this.yp ? " (campo neutro)" : "";
            }
            this.vw.setText(String.valueOf(this.Hv.getNome()) + " " + string2);
            this.vz.setText("Pr\u00f3ximo Jogo" + string3 + string);
        }
        this.qy();
        this.qw();
        this.qJ();
    }

    private void qw() {
        int n2 = 0;
        this.ze.setText("");
        if (this.zu.ka().lQ() != null) {
            int n3 = 0;
            while (n3 < this.zu.ka().lQ().size()) {
                if (!((ModeloRegistroJogador)this.zu.ka().lQ().get(n3)).vo()) {
                    ++n2;
                }
                ++n3;
            }
            String string = "Sem novas mensagens";
            if (n2 == 1) {
                string = "1 mensagens n\u00e3o lida";
            } else if (n2 > 1) {
                string = String.valueOf(Integer.toString(n2)) + " mensagens n\u00e3o lidas";
            }
            string = Integer.toString(n2);
            this.ze.setText(string);
        }
    }

    private void qx() {
        this.Iw.setText(BalancoFinanceiro.c(this.zu.kb()));
    }

    private void qy() {
        if (GerenciadorJogo.SR.bs() != null) {
            String string = this.AT == 0 ? "C - " : "F - ";
            GerenciadorJogo.SR.bs().setTc(this.zu.ka().dS());
            GerenciadorJogo.SR.bs().setN(this.zu.getNome());
            GerenciadorJogo.SR.bs().setA(GerenciadorJogo.SR.H() + GerenciadorJogo.SR.iU());
            GerenciadorJogo.SR.bs().setI(String.valueOf(string) + this.Hv.getNome() + " - " + this.Bj.getText());
        }
    }

    public void pK() {
        if (!this.yp) {
            this.Ef.setText(String.valueOf(Integer.toString(this.zu.kc().size())) + "/" + Integer.toString(35));
        } else {
            this.Ef.setText(Integer.toString(this.zu.kc().size()));
        }
    }

    public void qz() {
        this.Iw.setCursor(new Cursor(12));
    }

    public void qA() {
        ModeloTabelaElencoTime q_02 = new ModeloTabelaElencoTime(this.zu, this);
        this.Iy.setModel(q_02);
        int[] nArray = new int[]{20, 20, 20, 110, 20, 20, 60, 50, 50, 20, 45, 22, 20, 20, 25};
        int[] nArray2 = new int[]{20, 20, 20, 110, 20, 20, 20, 20, 20, 20, 20, 20, 60, 50, 50, 20, 45, 22, 20, 20, 25};
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            nArray = nArray2;
        }
        int n2 = 0;
        while (n2 < nArray.length) {
            this.Iy.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.Iy.getColumnModel().getColumn(0).setMaxWidth(20);
        this.Iy.getColumnModel().getColumn(1).setMaxWidth(20);
        this.Iy.getColumnModel().getColumn(2).setMaxWidth(40);
        n2 = 3;
        while (n2 < nArray.length) {
            this.Iy.getColumnModel().getColumn(n2).setMaxWidth(nArray[n2] + 15);
            ++n2;
        }
        this.Iy.setAutoResizeMode(3);
        this.Iy.setRowHeight(20);
        this.Iy.setShowGrid(false);
        this.Iy.setDefaultRenderer(ModeloJogador.class, new FabricaComponentesTabela());
        this.Iy.setAutoCreateRowSorter(false);
        this.Iy.getTableHeader().setReorderingAllowed(false);
        this.Iy.setRowHeight(20);
        this.Iy.setCellSelectionEnabled(false);
        this.Iy.setSelectionMode(0);
        this.Iy.setRowSelectionAllowed(true);
        this.Iy.setSelectionBackground(Color.YELLOW);
        this.Iy.setFillsViewportHeight(true);
        if (this.Iy.getRowCount() > 0) {
            this.Iy.setRowSelectionInterval(0, 0);
        }
        TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(this.Iy.getModel());
        this.Iy.setRowSorter(tableRowSorter);
        tableRowSorter.setComparator(0, ColecaoComparadoresSorteio.aaR);
        tableRowSorter.setComparator(1, ColecaoComparadoresSorteio.abe);
        tableRowSorter.setComparator(3, ColecaoComparadoresSorteio.abk);
        tableRowSorter.setComparator(4, ColecaoComparadoresSorteio.aba);
        if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaJ);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaS);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(8, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.abb);
            tableRowSorter.setComparator(11, ColecaoComparadoresSorteio.VU);
            tableRowSorter.setComparator(12, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(13, ColecaoComparadoresSorteio.abc);
            tableRowSorter.setComparator(14, ColecaoComparadoresSorteio.aab);
        } else {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaK);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaM);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaL);
            tableRowSorter.setComparator(8, ColecaoComparadoresSorteio.aaN);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.aaP);
            tableRowSorter.setComparator(10, ColecaoComparadoresSorteio.aaO);
            tableRowSorter.setComparator(11, ColecaoComparadoresSorteio.aaQ);
            tableRowSorter.setComparator(12, ColecaoComparadoresSorteio.aaS);
            tableRowSorter.setComparator(13, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(14, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(15, ColecaoComparadoresSorteio.abb);
            tableRowSorter.setComparator(17, ColecaoComparadoresSorteio.VU);
            tableRowSorter.setComparator(18, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(19, ColecaoComparadoresSorteio.abc);
            tableRowSorter.setComparator(20, ColecaoComparadoresSorteio.aab);
        }
    }

    private void qB() {
        this.Iy.getSelectionModel().addListSelectionListener(new ListenerSelecaoLinhaJogador(this));
        this.Iy.addMouseListener(new ListenerCliqueTabelaJogadores(this));
    }

    public void qC() {
        this.setCursor(new Cursor(3));
        GerenciadorTelas.a(this.uz, null);
        this.setCursor(new Cursor(12));
    }

    public void qD() {
        this.HC.addActionListener(new ListenerProporContrato(this));
        this.HB.add(this.HC);
        this.HB.addSeparator();
        this.HD.addActionListener(new ListenerVenderJogador(this));
        this.HB.add(this.HD);
        this.HE.addActionListener(new ListenerAposentarJogador(this));
        this.HB.add(this.HE);
        this.HB.addSeparator();
        this.HF.addActionListener(new ListenerEscolherNumeroJogador(this));
        this.HB.add(this.HF);
        this.HB.addSeparator();
        this.HG.addActionListener(new ListenerHistoricoJogador(this));
        this.HB.add(this.HG);
        this.HB.addSeparator();
        this.HH.addActionListener(new ListenerCancelarEmprestimo(this));
        this.HB.add(this.HH);
        this.HI.addActionListener(new ListenerComprarJogador(this));
        this.HB.add(this.HI);
        this.HB.addSeparator();
        this.HJ.addActionListener(new ListenerAlternarEmprestimo(this));
        this.HB.add(this.HJ);
        this.Iy.setComponentPopupMenu(this.HB);
    }

    private void qE() {
        if (this.uz.fz().booleanValue()) {
            this.uz.g(false);
            this.qt();
        } else {
            ArrayList arrayList = GerenciadorJogo.SR.f(this.zu);
            int n2 = 0;
            if (arrayList != null) {
                n2 = arrayList.size();
            }
            if (n2 + this.zu.kr() < 10) {
                this.uz.g(true);
                this.qt();
            } else {
                JOptionPane.showMessageDialog(null, "Limite de jogadores emprest\u00e1veis \u00e9 de " + Integer.toString(10), "Limite de emprestados", 2);
            }
        }
    }

    private void qF() {
        if (this.uz != null && this.uz.gl().booleanValue() && this.zu.kb() >= (long)this.uz.fk()) {
            int n2 = -1;
            n2 = JOptionPane.showConfirmDialog(this, "Deseja comprar o jogador " + this.uz.getNome() + "?", "Confirmar", 0);
            if (n2 == 0) {
                ModeloTime ah2 = null;
                ModeloOfertaJogador t_02 = null;
                int n3 = 0;
                while (n3 < GerenciadorJogo.SR.bt().size()) {
                    if (((ModeloOfertaJogador)GerenciadorJogo.SR.bt().get(n3)).x() == this.uz) {
                        ah2 = ((ModeloOfertaJogador)GerenciadorJogo.SR.bt().get(n3)).tP();
                        t_02 = (ModeloOfertaJogador)GerenciadorJogo.SR.bt().get(n3);
                        break;
                    }
                    ++n3;
                }
                GerenciadorJogo.SR.d(this.uz);
                this.uz.r(ah2);
                this.uz.a(this.zu, this.uz.fk(), false, false, false);
                this.qJ();
                this.qI();
                this.qH();
            }
        }
    }

    private void qG() {
        ModeloOfertaJogador t_02 = GerenciadorJogo.SR.e(this.uz);
        if (t_02 != null) {
            int n2 = -1;
            n2 = JOptionPane.showConfirmDialog(this, "Deseja cancelar o empr\u00e9stimo do jogador " + this.uz.getNome() + "?", "Confirmar", 0);
            if (n2 == 0) {
                if (t_02.tN()) {
                    GerenciadorJogo.SR.d(t_02.x());
                    this.pK();
                    this.qI();
                    this.qH();
                } else {
                    JOptionPane.showMessageDialog(this.Br, "N\u00e3o h\u00e1 vagas no time de origem", "", 2);
                }
            }
        }
    }

    private void qH() {
        this.qt();
        this.Iy.addNotify();
    }

    private void qI() {
        ((ModeloTabelaElencoTime)this.Iy.getModel()).fireTableDataChanged();
        if (this.Iy.getRowCount() > 0) {
            this.Iy.setRowSelectionInterval(0, 0);
        } else {
            this.uz = null;
        }
    }

    private void qJ() {
        this.pK();
        this.qx();
        this.qL();
        Collections.sort(this.zu.kc(), ColecaoComparadoresSorteio.abe);
    }

    private void qK() {
        int n2 = 0;
        while (n2 < this.zu.kc().size()) {
            ((ModeloJogador)this.zu.kc().get(n2)).b((JProgressBar)null);
            ++n2;
        }
    }

    private void qL() {
        int n2 = 0;
        while (n2 < this.zu.kc().size()) {
            if (this.tR != 0) {
                ((ModeloJogador)this.zu.kc().get(n2)).ax(((ModeloJogador)this.zu.kc().get(n2)).d(this.bv.hy()));
            }
            ++n2;
        }
    }

    private void qM() {
        JDialog jDialog = new JDialog(this.Br);
        PainelNumeracaoElenco ce2 = new PainelNumeracaoElenco(jDialog, this.zu);
        jDialog.add(ce2);
        jDialog.setSize(570, 433);
        jDialog.setPreferredSize(new Dimension(570, 433));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.pack();
        jDialog.setVisible(true);
        this.Iy.addNotify();
    }

    private void AI() {
        GerenciadorTelas.l(this.zu.ka());
        if (afk) {
            this.Hx = new JPopupMenu();
            this.AL();
            this.afi = new JPopupMenu();
            this.AM();
            afk = false;
        }
    }

    private void AJ() {
        boolean bl = true;
        if (GerenciadorJogo.SR.isJogaSelecoesAll()) {
            int n2 = 0;
            while (n2 < GerenciadorJogo.SR.M().size()) {
                ArrayList arrayList;
                if (!bl) {
                    if (((Campeonato)GerenciadorJogo.SR.M().get(n2)).jZ().booleanValue() && ((Campeonato)GerenciadorJogo.SR.M().get(n2)).jo() == null) {
                        arrayList = GerenciadorJogo.afQ.a((Campeonato)GerenciadorJogo.SR.M().get(n2), bl);
                        if (!GerenciadorJogo.SR.bD() && arrayList != null && arrayList.size() > 0) {
                            GerenciadorTelas.a(arrayList, (Campeonato)GerenciadorJogo.SR.M().get(n2), 1);
                        }
                    }
                } else if (((Campeonato)GerenciadorJogo.SR.M().get(n2)).jZ().booleanValue()) {
                    arrayList = GerenciadorJogo.afQ.a((Campeonato)GerenciadorJogo.SR.M().get(n2), bl);
                    if (!GerenciadorJogo.SR.bD() && arrayList != null && arrayList.size() > 0) {
                        GerenciadorTelas.a(arrayList, (Campeonato)GerenciadorJogo.SR.M().get(n2), 1);
                    }
                }
                ++n2;
            }
        }
    }

    public void mH() {
        this.HX.addActionListener(new ListenerMostrarMenuOpcoes(this));
        this.HR.addActionListener(new ListenerMostrarMenuAgenda(this));
        this.afl.addActionListener(new ListenerMostrarMenuSelecao(this));
        this.Ia.addActionListener(new ListenerMostrarMenuTecnicos(this));
        this.HZ.addActionListener(new ListenerMostrarMenuHistoria(this));
        this.HV.addActionListener(new ListenerAbrirEstadio(this));
        this.HU.addActionListener(new ListenerAbrirEscalarTime(this));
        this.HW.addActionListener(new ListenerAbrirAcademiaJuniores(this));
        this.Ib.addActionListener(new ListenerAbrirListaTimes(this));
        this.HS.addActionListener(new ListenerAbrirTabelas(this));
        this.yY.addActionListener(new ListenerProcurar(this));
        this.Id.addActionListener(new ListenerAbrirTreino(this));
        this.Iw.addMouseListener(new ListenerAbrirFinancas(this));
        this.ze.addMouseListener(new ListenerAbrirCentralMensagens(this));
        this.zb.addMouseListener(new ListenerAbrirComparativoTimes(this));
        this.vw.addMouseListener(new ListenerAbrirTimeAdversarioNome(this));
        this.yt.addMouseListener(new ListenerAbrirTimeAdversarioEscudo(this));
        this.HT.addActionListener(new ListenerAbrirCoresTela(this));
        this.Ie.addActionListener(new ListenerAbrirGaleriaTrofeus(this));
        this.HY.addActionListener(new ListenerAbrirRetrospectoTime(this));
        this.Ic.addActionListener(new ListenerAbrirJogadoresEmprestados(this));
    }

    public void AK() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.aG().size()) {
            int n3 = ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).As().AW();
            if (n3 > 0) {
                System.out.println(String.valueOf(((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jp()) + ":" + n3);
            }
            ++n2;
        }
    }

    private void qN() {
        Object object;
        long l2 = 0L;
        long l3 = 0L;
        l2 = System.currentTimeMillis();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n2 = 0;
        while (n2 < 5) {
            object = new SorteadorJogadorAleatorio();
            String string = "";
            if (((SorteadorJogadorAleatorio)object).iA() != null) {
                string = ((SorteadorJogadorAleatorio)object).iA().getNome();
            }
            String string2 = "";
            if (((SorteadorJogadorAleatorio)object).iz() != null) {
                string2 = ((SorteadorJogadorAleatorio)object).iz().getNome();
            }
            System.out.println("Leilao: " + string + " " + string2);
            if (((SorteadorJogadorAleatorio)object).iA() != null) {
                arrayList.add(object);
            }
            ++n2;
        }
        l3 = System.currentTimeMillis() - l2;
        PainelFichaJogador.X(arrayList);
        JDialog jDialog = new JDialog(this.Br);
        object = new PainelFichaJogador(jDialog);
        jDialog.add((Component)object);
        jDialog.setSize(941, 718);
        jDialog.setPreferredSize(new Dimension(941, 718));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    private void qO() {
        this.HY.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.Br);
        PainelEmprestimosJogadores bs_02 = new PainelEmprestimosJogadores(jDialog, this.zu);
        jDialog.add(bs_02);
        jDialog.setSize(737, 600);
        jDialog.setPreferredSize(new Dimension(737, 600));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HY.setCursor(new Cursor(12));
        if (PainelEmprestimosJogadores.nX()) {
            this.qI();
            this.qJ();
            this.qH();
        }
    }

    private void qP() {
        this.HY.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.Br);
        DialogoRetrospectoTime hw2 = new DialogoRetrospectoTime(jDialog, this.zu);
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

    private void qQ() {
        Color color = this.zu.kB();
        Color color2 = this.zu.kC();
        JDialog jDialog = new JDialog(this.Br);
        PainelCoresTime bb2 = new PainelCoresTime(jDialog, this.zu);
        jDialog.add(bb2);
        jDialog.setSize(308, 315);
        jDialog.setPreferredSize(new Dimension(308, 315));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        if (color != this.zu.kB() || color2 != this.zu.kC()) {
            this.qK();
            this.qu();
            this.Iy.addNotify();
        }
    }

    public void qR() {
        this.uz.c(false);
        this.uz.fm();
        this.Iy.addNotify();
        this.If.g(1, false);
    }

    public void qS() {
        JDialog jDialog = new JDialog(this.Br);
        DialogoNovoContrato fy_02 = new DialogoNovoContrato(jDialog, this.uz);
        jDialog.add(fy_02);
        jDialog.setSize(357, 330);
        jDialog.setPreferredSize(new Dimension(357, 330));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.Iy.addNotify();
        this.qt();
    }

    private void qT() {
        ModeloTime ah2 = this.zu;
        if (this.yp) {
            ah2 = this.zu.ka().fg();
        }
        if (ah2 != null) {
            this.Iw.setCursor(new Cursor(3));
            JDialog jDialog = new JDialog(this.Br);
            PainelFinancas cW2 = new PainelFinancas(jDialog, ah2);
            jDialog.add(cW2);
            jDialog.setSize(398, 637);
            jDialog.setPreferredSize(new Dimension(398, 637));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
            this.Iw.setCursor(new Cursor(12));
            this.qx();
        }
    }

    private void qU() {
        ModeloTime ah2 = this.zu;
        if (this.yp) {
            ah2 = this.zu.ka().fg();
        }
        if (ah2 != null) {
            JDialog jDialog = new JDialog(this.Br);
            TelaTreinoJogador iQ2 = new TelaTreinoJogador(jDialog, ah2);
            jDialog.add(iQ2);
            jDialog.setSize(409, 252);
            jDialog.setPreferredSize(new Dimension(409, 252));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
        }
    }

    private void dn(int n2) {
        int n3 = this.zu.kc().size();
        JDialog jDialog = new JDialog(this.Br);
        PainelBuscaJogadores gx_02 = new PainelBuscaJogadores(jDialog, this.zu, this.yp, n2);
        int n4 = 820;
        int n5 = 620;
        if (n2 == 2) {
            n4 = 840;
            n5 = 670;
        }
        jDialog.add(gx_02);
        jDialog.setSize(n4, n5);
        jDialog.setPreferredSize(new Dimension(n4, n5));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        if (n3 != this.zu.kc().size()) {
            this.qI();
            this.qJ();
            this.qH();
        }
    }

    public void on() {
        this.Iy.requestFocusInWindow();
    }

    private void qV() {
        Competicao at2 = this.bv.hy();
        GerenciadorTelas.a(this.tR, at2);
    }

    public void qW() {
        if (this.uz != null) {
            JDialog jDialog = new JDialog(this.Br);
            DialogoAposentadoriaJogador ji_02 = new DialogoAposentadoriaJogador(jDialog, this.zu, this.uz);
            jDialog.add(ji_02);
            jDialog.setSize(402, 374);
            jDialog.setPreferredSize(new Dimension(402, 374));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
            if (DialogoAposentadoriaJogador.nX()) {
                this.qI();
                this.qJ();
                this.qH();
            }
        }
    }

    public void qX() {
        if (this.uz != null) {
            JDialog jDialog = new JDialog(this.Br);
            TelaVenderJogador jc2 = new TelaVenderJogador(jDialog, this.uz);
            jDialog.add(jc2);
            jDialog.setSize(395, 420);
            jDialog.setPreferredSize(new Dimension(395, 420));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
            if (TelaVenderJogador.sN()) {
                this.qI();
                this.qJ();
                this.pK();
                this.qH();
            } else if (this.uz.ft().booleanValue()) {
                this.If.h(1, true);
                this.If.g(1, true);
                this.Iy.addNotify();
            }
        }
    }

    public void qY() {
        JDialog jDialog = new JDialog(this.Br);
        PainelAcademiaJuniores ds_02 = new PainelAcademiaJuniores(jDialog, this.zu, this.zu);
        jDialog.add(ds_02);
        jDialog.setSize(763, 568);
        jDialog.setPreferredSize(new Dimension(763, 568));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        if (PainelAcademiaJuniores.nX()) {
            this.qI();
            this.qJ();
            this.qH();
        }
        UIManager.put("ProgressBar.selectionForeground", this.zu.kC());
        UIManager.put("ProgressBar.selectionBackground", Color.black);
    }

    public void qZ() {
        this.HU.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.Br);
        TelaEscalacao bz2 = new TelaEscalacao(jDialog, this.zu, GerenciadorJogo.SR.bl(), this.yp);
        if (!GerenciadorTelas.iI()) {
            jDialog.add(bz2);
        } else {
            JScrollPane jScrollPane = new JScrollPane();
            jScrollPane.setViewportView(bz2);
            jDialog.add(jScrollPane);
        }
        jDialog.setSize(1024, 748);
        jDialog.setPreferredSize(new Dimension(1024, 748));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HU.setCursor(new Cursor(12));
    }

    public void ra() {
        if (!this.yp) {
            JDialog jDialog = new JDialog(this.Br);
            DialogoExpansaoEstadio cl_02 = new DialogoExpansaoEstadio(jDialog, this.zu.ev(), this.tR, this.zu);
            jDialog.add(cl_02);
            jDialog.setSize(598, 328);
            jDialog.setPreferredSize(new Dimension(598, 328));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
            this.qx();
        }
    }

    public void AL() {
        JMenuItem jMenuItem = new JMenuItem("Jogos do seu time");
        jMenuItem.addActionListener(new ListenerAbrirJogosDoTime(this));
        jMenuItem.setAccelerator(Plataforma.teclaF(115));
        this.Hx.add(jMenuItem);
        this.Hx.addSeparator();
        JMenuItem jMenuItem2 = new JMenuItem("Jogos Amistosos");
        jMenuItem2.addActionListener(new ListenerAbrirJogosAmistosos(this));
        jMenuItem2.setAccelerator(Plataforma.teclaF(120));
        this.Hx.add(jMenuItem2);
        this.Hx.addSeparator();
        JMenuItem jMenuItem3 = new JMenuItem("Central de Empregos");
        jMenuItem3.addActionListener(new ListenerAbrirCentralEmpregos(this));
        this.Hx.add(jMenuItem3);
        if (this.HK || afj) {
            jMenuItem3.setEnabled(false);
        }
    }

    public void AM() {
        JMenuItem jMenuItem = new JMenuItem("Jogos Amistosos Sele\u00e7\u00e3o");
        jMenuItem.addActionListener(new ListenerAbrirJogosAmistososSelecao(this));
        this.afi.add(jMenuItem);
        this.afi.addSeparator();
        JMenuItem jMenuItem2 = new JMenuItem("Calend\u00e1rio da sele\u00e7\u00e3o");
        jMenuItem2.addActionListener(new ListenerAbrirCalendarioSelecao(this));
        this.afi.add(jMenuItem2);
        this.afi.addSeparator();
        if (this.qp().ka().jo() == null) {
            jMenuItem.setEnabled(false);
            jMenuItem2.setEnabled(false);
        }
        JMenuItem jMenuItem3 = new JMenuItem("Convocar Sele\u00e7\u00e3o");
        jMenuItem3.addActionListener(new ListenerConvocarSelecao(this));
        this.afi.add(jMenuItem3);
        this.afi.addSeparator();
        JMenuItem jMenuItem4 = new JMenuItem("Pedir demiss\u00e3o da sele\u00e7\u00e3o");
        jMenuItem4.addActionListener(new ListenerDemitirSelecao(this));
        this.afi.add(jMenuItem4);
        if (this.qp().ka().jo() == null || this.HK) {
            jMenuItem3.setEnabled(false);
            jMenuItem4.setEnabled(false);
        }
        if (this.qp().ka().jo() != null) {
            this.afl.setVisible(true);
            this.afl.setIcon(components.TemaBetfoot.bandeira(this.qp().ka().jo().getPais(), 18));
            this.afl.setRolloverIcon(this.afl.getIcon());
        } else {
            this.afl.setVisible(false);
        }
    }

    public void rb() {
        JMenuItem jMenuItem;
        JMenuItem jMenuItem2;
        JMenuItem jMenuItem3 = new JMenuItem("Salvar jogo");
        jMenuItem3.addActionListener(new ListenerSalvarJogo(this));
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/save1.png"));
        jMenuItem3.setIcon(imageIcon);
        jMenuItem3.setAccelerator(Plataforma.MAC ? Plataforma.atalho(83) : KeyStroke.getKeyStroke(113, 0));
        this.Hy.add(jMenuItem3);
        this.Hy.addSeparator();
        JMenuItem jMenuItem4 = new JMenuItem("Prefer\u00eancias");
        jMenuItem4.addActionListener(new OuvinteMenuPreferencias(this));
        ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("/aicons/iconsetup.png"));
        jMenuItem4.setIcon(imageIcon2);
        jMenuItem4.setAccelerator(Plataforma.MAC ? Plataforma.atalho(44) : KeyStroke.getKeyStroke(114, 0));
        this.Hy.add(jMenuItem4);
        this.Hy.addSeparator();
        JMenuItem jMenuItem5 = new JMenuItem("Pedir demiss\u00e3o");
        jMenuItem5.addActionListener(new ListenerDemitirTecnico(this));
        ImageIcon imageIcon3 = new ImageIcon(this.getClass().getResource("/aicons/iconfire.png"));
        jMenuItem5.setIcon(imageIcon3);
        this.Hy.add(jMenuItem5);
        this.Hy.addSeparator();
        JMenuItem jMenuItem6 = new JMenuItem("Sair do jogo");
        jMenuItem6.addActionListener(new ListenerSairJogo(this));
        this.Hy.add(jMenuItem6);
        this.Hy.addSeparator();
        JMenuItem jMenuItem7 = new JMenuItem("Sobre o Betfoot");
        jMenuItem7.addActionListener(new OuvinteMenuSobre(this));
        this.Hy.add(jMenuItem7);
        JMenuItem jMenuItem8 = new JMenuItem("Ranking de t\u00e9cnicos");
        jMenuItem8.addActionListener(new ListenerAbrirRankingTecnicos(this));
        this.Hz.add(jMenuItem8);
        this.Hz.addSeparator();
        JMenuItem jMenuItem9 = new JMenuItem("Adicionar/remover t\u00e9cnicos");
        jMenuItem9.addActionListener(new ListenerAbrirTecnicosHumanos(this));
        this.Hz.add(jMenuItem9);
        this.Hz.addSeparator();
        JMenuItem jMenuItem10 = new JMenuItem("\u00daltimas trocas de t\u00e9cnicos");
        jMenuItem10.addActionListener(new OuvinteMenuUltimasTrocasTecnicos(this));
        this.Hz.add(jMenuItem10);
        this.Hz.addSeparator();
        JMenuItem jMenuItem11 = new JMenuItem("Trof\u00e9us do T\u00e9cnico");
        jMenuItem11.addActionListener(new OuvinteMenuTrofeusTecnico(this));
        this.Hz.add(jMenuItem11);
        JMenuItem jMenuItem12 = new JMenuItem("Campe\u00f5es");
        jMenuItem12.addActionListener(new ListenerAbrirCampeoes(this));
        jMenuItem12.setAccelerator(Plataforma.teclaF(121));
        this.HA.add(jMenuItem12);
        this.HA.addSeparator();
        JMenuItem jMenuItem13 = new JMenuItem("Ranking Clubes");
        jMenuItem13.addActionListener(new ListenerAbrirRankingClubes(this));
        this.HA.add(jMenuItem13);
        this.HA.addSeparator();
        if (GerenciadorJogo.SR.isJogaSelecoesAll()) {
            jMenuItem2 = new JMenuItem("Ranking Sele\u00e7\u00f5es");
            jMenuItem2.addActionListener(new ListenerAbrirRankingSelecoes(this));
            this.HA.add(jMenuItem2);
            this.HA.addSeparator();
        }
        jMenuItem2 = new JMenuItem("Artilheiros");
        jMenuItem2.addActionListener(new ListenerAbrirArtilheiros(this));
        jMenuItem2.setAccelerator(Plataforma.teclaF(122));
        this.HA.add(jMenuItem2);
        this.HA.addSeparator();
        JMenuItem jMenuItem14 = new JMenuItem("L\u00edderes de Assist\u00eancias");
        jMenuItem14.addActionListener(new ListenerAbrirLideresAssistencias(this));
        this.HA.add(jMenuItem14);
        this.HA.addSeparator();
        if (!this.yp) {
            jMenuItem = new JMenuItem("Galeria de Trof\u00e9us");
            jMenuItem.addActionListener(new OuvinteMenuGaleriaTrofeus(this));
            this.HA.add(jMenuItem);
            this.HA.addSeparator();
        }
        if (!this.yp) {
            jMenuItem = new JMenuItem("Time da Rodada");
            jMenuItem.addActionListener(new OuvinteMenuTimeDaRodada(this));
            this.HA.add(jMenuItem);
            this.HA.addSeparator();
            JMenuItem jMenuItem15 = new JMenuItem("Time do Ano");
            jMenuItem15.addActionListener(new OuvinteMenuTimeDoAno(this));
            this.HA.add(jMenuItem15);
            this.HA.addSeparator();
            JMenuItem jMenuItem16 = new JMenuItem("Bola de Ouro");
            jMenuItem16.addActionListener(new ListenerAbrirMelhoresPorDivisao(this));
            this.HA.add(jMenuItem16);
            this.HA.addSeparator();
            JMenuItem jMenuItem17 = new JMenuItem("Transfer\u00eancias de Jogadores");
            jMenuItem17.addActionListener(new ListenerAbrirTrocasTecnicos(this));
            this.HA.add(jMenuItem17);
            this.HA.addSeparator();
        }
        jMenuItem = new JMenuItem("Hist\u00f3rico de confrontos");
        jMenuItem.addActionListener(new OuvinteMenuHistoricoConfrontos(this));
        this.HA.add(jMenuItem);
    }

    private void rc() {
        ModeloTime ah2 = this.zu.ka().jo();
        if (ah2 != null) {
            GerenciadorTelas.a(ah2, false);
            this.qA();
            if (this.Iy.getRowCount() > 0) {
                this.Iy.setRowSelectionInterval(0, 0);
            }
            this.pK();
            this.qH();
        }
    }

    private void rd() {
        GerenciadorTelas.cX();
    }

    public void G(ModeloTime ah2) {
        int n2 = this.zu.kc().size();
        ModeloTime ah3 = this.zu;
        if (this.yp) {
            ah3 = this.zu.ka().fg();
        } else if (ah2 != null) {
            ah3 = ah2;
        }
        if (ah3 != null) {
            GerenciadorTelas.a(ah3, this.zu, this.yp);
        }
        if (n2 != this.zu.kc().size()) {
            this.qI();
            this.qJ();
            this.qH();
        }
    }

    public void ad(boolean bl) {
        ModeloTime ah2 = null;
        ah2 = !bl ? this.zu.ka().fg() : this.zu.ka().jo();
        if (ah2 != null) {
            JDialog jDialog = new JDialog(this.Br);
            PainelCalendarioTime l2 = new PainelCalendarioTime(jDialog, ah2);
            jDialog.add(l2);
            jDialog.setSize(820, 600);
            jDialog.setPreferredSize(new Dimension(820, 600));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setUndecorated(true);
            jDialog.setVisible(true);
        }
    }

    public void re() {
        ModeloTime ah2 = this.zu.ka().fg();
        if (ah2 != null) {
            GerenciadorTelas.w(this.zu.ka().fg());
        }
        this.qx();
    }

    public void rf() {
        ModeloTime ah2 = this.zu.ka().jo();
        if (ah2 != null) {
            GerenciadorTelas.x(ah2);
        }
    }

    public void rg() {
        JDialog jDialog = new JDialog(this.Br);
        DialogoMelhoresPorPosicao h_02 = new DialogoMelhoresPorPosicao(jDialog, this.zu.kF(), GerenciadorJogo.SR.o(this.zu.getPais()));
        jDialog.add(h_02);
        jDialog.setSize(1020, 680);
        jDialog.setPreferredSize(new Dimension(1020, 680));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void do_1(int n2) {
        GerenciadorTelas.a(this.zu.kF(), GerenciadorJogo.SR.o(this.zu.getPais()), n2);
    }

    public void rh() {
        ModeloTime ah2 = this.zu;
        JDialog jDialog = new JDialog(this.Br);
        PainelResumoTemporada al_02 = new PainelResumoTemporada(jDialog, ah2, this.Hv, this.yp);
        jDialog.add(al_02);
        jDialog.setSize(617, 456);
        jDialog.setPreferredSize(new Dimension(617, 456));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void dp(int n2) {
        JDialog jDialog = new JDialog(this.Br);
        PainelUltimasMovimentacoes hc_02 = new PainelUltimasMovimentacoes(jDialog, this.zu, n2);
        jDialog.add(hc_02);
        jDialog.setSize(695, 500);
        jDialog.setPreferredSize(new Dimension(695, 500));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void ri() {
        JDialog jDialog = new JDialog(this.Br);
        PainelRankingClubes hc2 = new PainelRankingClubes(jDialog, this.zu);
        jDialog.add(hc2);
        jDialog.setSize(825, 602);
        jDialog.setPreferredSize(new Dimension(825, 602));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void AN() {
        JDialog jDialog = new JDialog(this.Br);
        PainelRankingSelecoes jv2 = new PainelRankingSelecoes(jDialog, this.zu);
        jDialog.add(jv2);
        jDialog.setSize(432, 666);
        jDialog.setPreferredSize(new Dimension(432, 666));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void rj() {
        JDialog jDialog = new JDialog(this.Br);
        PainelLideresAssistencias y_02 = new PainelLideresAssistencias(jDialog, this.zu);
        jDialog.add(y_02);
        jDialog.setSize(596, 608);
        jDialog.setPreferredSize(new Dimension(596, 608));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void rk() {
        JDialog jDialog = new JDialog(this.Br);
        PainelMelhoresArtilheiros o_02 = new PainelMelhoresArtilheiros(jDialog);
        jDialog.add(o_02);
        jDialog.setSize(758, 616);
        jDialog.setPreferredSize(new Dimension(758, 616));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void rl() {
        JDialog jDialog = new JDialog(this.Br);
        TelaCampeoes r2 = new TelaCampeoes(jDialog);
        jDialog.add(r2);
        jDialog.setSize(848, 628);
        jDialog.setPreferredSize(new Dimension(848, 628));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void rm() {
        JDialog jDialog = new JDialog(this.Br);
        PainelCentralMensagens bn_02 = new PainelCentralMensagens(jDialog, this.zu.ka().lQ(), this.zu);
        jDialog.add(bn_02);
        jDialog.setSize(894, 391);
        jDialog.setPreferredSize(new Dimension(894, 391));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.qw();
    }

    public void rn() {
        JDialog jDialog = new JDialog(this.Br);
        TelaTecnicosHumanos ip_02 = new TelaTecnicosHumanos(jDialog);
        jDialog.add(ip_02);
        jDialog.setSize(487, 422);
        jDialog.setPreferredSize(new Dimension(487, 422));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public void ro() {
        JDialog jDialog = new JDialog(this.Br);
        PainelRankingTecnicos gX2 = new PainelRankingTecnicos(jDialog, this.zu.ka());
        jDialog.add(gX2);
        jDialog.setSize(880, 663);
        jDialog.setPreferredSize(new Dimension(880, 663));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public boolean rp() {
        GerenciadorJogo.SR.ad();
        JDialog jDialog = new JDialog(this.Br);
        PainelSobre jp_02 = new PainelSobre(jDialog);
        jDialog.add(jp_02);
        jDialog.setSize(496, 185);
        jDialog.setPreferredSize(new Dimension(496, 185));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        return true;
    }

    public void rq() {
        System.exit(0);
    }

    public void rr() {
        if (this.yp) {
            this.rs();
        } else {
            int n2 = -1;
            n2 = JOptionPane.showConfirmDialog(this.Br, "Deseja realmente ser demitido?", "Confirma\u00e7\u00e3o", 0);
            if (n2 == 0) {
                Campeonato al2 = this.zu.ka();
                Campeonato al3 = this.zu.kE();
                if (al3 == null) {
                    JOptionPane.showMessageDialog(null, "A diretoria ainda n\u00e3o achou um t\u00e9cnico a sua altura. Tente se demitir em outro momento.", "Demiss\u00e3o recusada", 2);
                } else {
                    GerenciadorTelas.a(al2, al3, this.zu, 0);
                    GerenciadorJogo.SR.g(true);
                    GerenciadorJogo.SR.ap();
                }
            }
        }
    }

    public void rs() {
        int n2 = -1;
        n2 = JOptionPane.showConfirmDialog(this.Br, "Deseja realmente ser demitido da sele\u00e7\u00e3o?", "Confirma\u00e7\u00e3o", 0);
        if (n2 == 0) {
            LigaNacional z2;
            int n3 = -1;
            if (this.zu.ka().jo() != null) {
                n3 = this.zu.ka().jo().getPais();
            }
            if ((z2 = GerenciadorJogo.SR.s(n3)) != null) {
                Campeonato al2 = this.zu.ka();
                Campeonato al3 = z2.ji();
                z2.z(false);
                al2.z(null);
                z2.jo().h(null);
                z2.jo().k(false);
                z2.g(al3);
                afk = false;
                afj = false;
                this.afi = new JPopupMenu();
                this.AM();
                if (this.yp) {
                    GerenciadorTelas.a(al2, al3, this.zu, 0);
                    GerenciadorJogo.SR.ap();
                }
            }
        }
    }

    public void rt() {
        if (GerenciadorJogo.SR.br() == null) {
            JDialog jDialog = new JDialog(this.Br);
            DialogoSalvarJogo fw_02 = new DialogoSalvarJogo(jDialog);
            jDialog.add(fw_02);
            jDialog.setSize(494, 192);
            jDialog.setPreferredSize(new Dimension(494, 192));
            jDialog.setModal(true);
            jDialog.setResizable(false);
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
        }
    }

    public void ru() throws IOException {
        if (GerenciadorJogo.SR.br() == null) {
            this.rt();
        }
        if (GerenciadorJogo.SR.br() != null) {
            this.Br.setCursor(new Cursor(3));
            GerenciadorTelas.a("", false);
            this.Br.setCursor(new Cursor(12));
        }
    }

    public void rv() {
        GerenciadorTelas.a(this.Iy);
    }

    private void rw() {
        GerenciadorTelas.v(this.zu);
    }

    private void rx() {
        if (this.zu.ka() != null) {
            GerenciadorTelas.e(this.zu.ka());
        }
    }

    private void ry() {
    }

    private void rz() {
        this.ve.setBorder(BorderFactory.createEmptyBorder(6, 18, 6, 18));
        this.HT.setToolTipText("Cores da tela");
        this.Ie.setToolTipText("Galeria de trof\u00e9us");
        this.HY.setToolTipText("Retrospecto do time");
        this.Ic.setToolTipText("Jogadores emprestados");
    }

    public static Color rA() {
        return HM;
    }

    public boolean rB() {
        return this.yp;
    }

    public static boolean rC() {
        return HN;
    }

    public static void ae(boolean bl) {
        HN = bl;
    }

    public static Competicao rD() {
        return HO;
    }

    public static void w(Competicao at2) {
        HO = at2;
    }

    public static void aQ(boolean bl) {
        afj = bl;
    }

    public static void aR(boolean bl) {
        afk = bl;
    }

    private void mJ() {
        this.wf = new JPanel();
        this.ur = new JLabel();
        this.Hf = new JProgressBar();
        this.us = new JLabel();
        this.Ig = new JProgressBar();
        this.a_ = new JLabel();
        this.vz = new JLabel();
        this.yt = new JLabel();
        this.zb = new JLabel();
        this.vw = new JLabel();
        this.Bj = new JLabel();
        this.uh = new JLabel();
        this.Fq = new JLabel();
        this.ug = new JLabel();
        this.Iw = new JLabel();
        this.ze = new JLabel();
        this.Ix = new JScrollPane();
        this.Iy = new JTable();
        this.ve = new components.TemaBetfoot.BarraTopo();
        this.Io = new JToolBar.Separator();
        this.Ih = new JToolBar.Separator();
        this.HR = new JButton();
        this.Is = new JToolBar.Separator();
        this.Ij = new JToolBar.Separator();
        this.afl = new JButton();
        this.OD = new JToolBar.Separator();
        this.HS = new JButton();
        this.In = new JToolBar.Separator();
        this.HV = new JButton();
        this.Ik = new JToolBar.Separator();
        this.HW = new JButton();
        this.Iu = new JToolBar.Separator();
        this.Ib = new JButton();
        this.Il = new JToolBar.Separator();
        this.Id = new JButton();
        this.Im = new JToolBar.Separator();
        this.yY = new JButton();
        this.It = new JToolBar.Separator();
        this.Ia = new JButton();
        this.Ip = new JToolBar.Separator();
        this.HZ = new JButton();
        this.Iq = new JToolBar.Separator();
        this.HX = new JButton();
        this.Ir = new JToolBar.Separator();
        this.Eh = new JLabel();
        this.Ii = new JToolBar.Separator();
        this.Eg = new JLabel();
        this.HU = new JButton();
        this.If = new PainelDetalheJogador(this);
        this.Ef = new JLabel();
        this.Iv = new JToolBar();
        this.HT = new JButton();
        this.Ie = new JButton();
        this.HY = new JButton();
        this.Ic = new JButton();
        this.setBackground(new Color(0, 51, 51));
        this.wf.setBackground(new Color(226, 226, 217));
        this.ur.setHorizontalAlignment(2);
        this.ur.setText("Confian\u00e7a diretoria:");
        this.Hf.setToolTipText("");
        this.Hf.setValue(30);
        this.Hf.setStringPainted(true);
        this.us.setHorizontalAlignment(2);
        this.us.setText("Confian\u00e7a torcida:");
        this.Ig.setForeground(new Color(0, 51, 51));
        this.Ig.setValue(55);
        this.Ig.setStringPainted(true);
        this.a_.setFont(new Font("Tahoma", 1, 11));
        this.a_.setHorizontalAlignment(2);
        this.a_.setText("Emmanuel dos Santos");
        this.vz.setBackground(new Color(0, 0, 0));
        this.vz.setFont(new Font("Tahoma", 1, 11));
        this.vz.setForeground(new Color(255, 255, 255));
        this.vz.setHorizontalAlignment(2);
        this.vz.setText("Pr\u00f3ximo jogo");
        this.vz.setOpaque(true);
        this.yt.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.zb.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconretrospecto.png")));
        this.zb.setCursor(new Cursor(12));
        this.vw.setFont(new Font("Tahoma", 0, 12));
        this.vw.setText("Red Bull Bragantino");
        this.Bj.setFont(new Font("Tahoma", 0, 12));
        this.Bj.setText("1\u00aa divis\u00e3o - 9\u00ba colocado");
        this.uh.setFont(new Font("Tahoma", 0, 12));
        this.uh.setText("1\u00aa divis\u00e3o - 9\u00ba colocado");
        this.Fq.setBackground(new Color(232, 236, 235));
        this.Fq.setHorizontalAlignment(0);
        this.Fq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.ug.setFont(new Font("Tahoma", 1, 14));
        this.ug.setText("Borussia Dortmund");
        this.Iw.setHorizontalAlignment(2);
        this.Iw.setIcon(new ImageIcon(this.getClass().getResource("/aicons/n03.png")));
        this.Iw.setText("5 milh\u00f5es 200 mil");
        this.Iw.setCursor(new Cursor(12));
        this.ze.setHorizontalAlignment(2);
        this.ze.setIcon(new ImageIcon(this.getClass().getResource("/aicons/n04.png")));
        this.ze.setText("5");
        this.ze.setCursor(new Cursor(12));
        GroupLayout groupLayout = new GroupLayout(this.wf);
        this.wf.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.Fq, -2, 60, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ug, -1, -1, Short.MAX_VALUE).addComponent(this.a_, -1, -1, Short.MAX_VALUE))).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Iw, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ze, -2, 49, -2)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup().addComponent(this.yt, -2, 60, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Bj, -1, -1, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addComponent(this.vw, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.zb)))).addComponent(this.uh, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Hf, -2, 1, Short.MAX_VALUE).addComponent(this.ur, -1, 119, Short.MAX_VALUE)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(this.us, -2, 123, -2)).addComponent(this.Ig, -2, 1, Short.MAX_VALUE))).addComponent(this.vz, GroupLayout.Alignment.LEADING, -2, 260, -2)).addGap(20, 20, 20)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.ug, -2, 23, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a_)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Fq, -2, 60, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Iw, -2, 21, -2).addComponent(this.ze, -2, 23, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.uh).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ur).addComponent(this.us)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Hf, -2, -1, -2).addComponent(this.Ig, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.vz, -2, 27, -2).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.yt, -2, 60, -2)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.vw, -2, 19, -2).addComponent(this.zb, -2, 39, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Bj))).addGap(13, 13, 13)));
        this.Iy.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.Ix.setViewportView(this.Iy);
        this.ve.setBackground(new Color(0, 0, 0));
        this.ve.setFloatable(false);
        this.ve.setRollover(true);
        this.ve.setFont(new Font("Tahoma", 0, 12));
        this.ve.add(this.Io);
        this.ve.add(this.Ih);
        this.HR.setForeground(new Color(255, 255, 255));
        this.HR.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon02.png")));
        this.HR.setText("Agenda");
        this.HR.setBorderPainted(false);
        this.HR.setContentAreaFilled(false);
        this.HR.setFocusable(false);
        this.HR.setHorizontalTextPosition(0);
        this.HR.setVerticalTextPosition(3);
        this.HR.addActionListener(new OuvinteVazioBotaoAgenda(this));
        this.ve.add(this.HR);
        this.ve.add(this.Is);
        this.Ij.setMaximumSize(new Dimension(12, Short.MAX_VALUE));
        this.ve.add(this.Ij);
        this.afl.setForeground(new Color(255, 255, 255));
        this.afl.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon04.png")));
        this.afl.setText("Sele\u00e7\u00e3o");
        this.afl.setBorderPainted(false);
        this.afl.setContentAreaFilled(false);
        this.afl.setFocusable(false);
        this.afl.setHorizontalTextPosition(0);
        this.afl.setVerticalTextPosition(3);
        this.ve.add(this.afl);
        this.OD.setMaximumSize(new Dimension(12, Short.MAX_VALUE));
        this.ve.add(this.OD);
        this.HS.setForeground(new Color(255, 255, 255));
        this.HS.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon04.png")));
        this.HS.setText("Tabelas");
        this.HS.setBorderPainted(false);
        this.HS.setContentAreaFilled(false);
        this.HS.setFocusable(false);
        this.HS.setHorizontalTextPosition(0);
        this.HS.setVerticalTextPosition(3);
        this.ve.add(this.HS);
        this.ve.add(this.In);
        this.HV.setForeground(new Color(255, 255, 255));
        this.HV.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon05.png")));
        this.HV.setText("Est\u00e1dio");
        this.HV.setBorderPainted(false);
        this.HV.setContentAreaFilled(false);
        this.HV.setFocusable(false);
        this.HV.setHorizontalTextPosition(0);
        this.HV.setVerticalTextPosition(3);
        this.ve.add(this.HV);
        this.ve.add(this.Ik);
        this.HW.setForeground(new Color(255, 255, 255));
        this.HW.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon09.png")));
        this.HW.setText("Juniores");
        this.HW.setBorderPainted(false);
        this.HW.setContentAreaFilled(false);
        this.HW.setFocusable(false);
        this.HW.setHorizontalTextPosition(0);
        this.HW.setVerticalTextPosition(3);
        this.ve.add(this.HW);
        this.ve.add(this.Iu);
        this.Ib.setForeground(new Color(255, 255, 255));
        this.Ib.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon06.png")));
        this.Ib.setText("Times");
        this.Ib.setBorderPainted(false);
        this.Ib.setContentAreaFilled(false);
        this.Ib.setFocusable(false);
        this.Ib.setHorizontalTextPosition(0);
        this.Ib.setVerticalTextPosition(3);
        this.ve.add(this.Ib);
        this.ve.add(this.Il);
        this.Id.setForeground(new Color(255, 255, 255));
        this.Id.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon03.png")));
        this.Id.setText("Treino");
        this.Id.setBorderPainted(false);
        this.Id.setContentAreaFilled(false);
        this.Id.setFocusable(false);
        this.Id.setHorizontalTextPosition(0);
        this.Id.setVerticalTextPosition(3);
        this.ve.add(this.Id);
        this.ve.add(this.Im);
        this.yY.setForeground(new Color(255, 255, 255));
        this.yY.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon07.png")));
        this.yY.setText("Procura");
        this.yY.setBorderPainted(false);
        this.yY.setContentAreaFilled(false);
        this.yY.setFocusable(false);
        this.yY.setHorizontalTextPosition(0);
        this.yY.setVerticalTextPosition(3);
        this.ve.add(this.yY);
        this.ve.add(this.It);
        this.Ia.setForeground(new Color(255, 255, 255));
        this.Ia.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon08.png")));
        this.Ia.setText("T\u00e9cnicos");
        this.Ia.setBorderPainted(false);
        this.Ia.setContentAreaFilled(false);
        this.Ia.setFocusable(false);
        this.Ia.setHorizontalTextPosition(0);
        this.Ia.setVerticalTextPosition(3);
        this.ve.add(this.Ia);
        this.ve.add(this.Ip);
        this.HZ.setForeground(new Color(255, 255, 255));
        this.HZ.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconhistoria.png")));
        this.HZ.setText("Hist\u00f3ria");
        this.HZ.setBorderPainted(false);
        this.HZ.setContentAreaFilled(false);
        this.HZ.setFocusable(false);
        this.HZ.setHorizontalTextPosition(0);
        this.HZ.setVerticalTextPosition(3);
        this.ve.add(this.HZ);
        this.ve.add(this.Iq);
        this.HX.setForeground(new Color(255, 255, 255));
        this.HX.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon01.png")));
        this.HX.setText("Op\u00e7\u00f5es");
        this.HX.setBorderPainted(false);
        this.HX.setContentAreaFilled(false);
        this.HX.setFocusable(false);
        this.HX.setHorizontalTextPosition(0);
        this.HX.setVerticalTextPosition(3);
        this.ve.add(this.HX);
        this.ve.add(this.Ir);
        this.Eh.setFont(new Font("Tahoma", 1, 11));
        this.Eh.setForeground(new Color(255, 255, 255));
        this.Eh.setText("Registre sua c\u00f3pia, clique aqui - www.betfoot.com");
        this.ve.add(this.Eh);
        this.ve.add(this.Ii);
        this.Eg.setFont(new Font("Tahoma", 1, 11));
        this.Eg.setForeground(new Color(255, 255, 255));
        this.Eg.setText("12/04/1972");
        this.ve.add(this.Eg);
        this.HU.setIcon(new ImageIcon(this.getClass().getResource("/aicons/tactics.png")));
        this.HU.setText("Escalar Time");
        this.HU.addActionListener(new OuvinteVazioBotaoEscalarTime(this));
        this.If.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.Ef.setForeground(new Color(255, 255, 255));
        this.Ef.setHorizontalAlignment(4);
        this.Ef.setIcon(new ImageIcon(this.getClass().getResource("/aicons/ic_small_player.png")));
        this.Ef.setText("25");
        this.Ef.setCursor(new Cursor(12));
        this.Iv.setBackground(new Color(204, 204, 0));
        this.Iv.setRollover(true);
        this.Iv.setBorderPainted(false);
        this.HT.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconcolorpicker.png")));
        this.HT.setBorderPainted(false);
        this.HT.setFocusable(false);
        this.HT.setHorizontalTextPosition(0);
        this.HT.setOpaque(false);
        this.HT.setVerticalTextPosition(3);
        this.Iv.add(this.HT);
        this.Ie.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon10.png")));
        this.Ie.setBorderPainted(false);
        this.Ie.setFocusable(false);
        this.Ie.setHorizontalTextPosition(0);
        this.Ie.setOpaque(false);
        this.Ie.setVerticalTextPosition(3);
        this.Iv.add(this.Ie);
        this.HY.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon11.png")));
        this.HY.setBorderPainted(false);
        this.HY.setFocusable(false);
        this.HY.setHorizontalTextPosition(0);
        this.HY.setMaximumSize(new Dimension(41, 41));
        this.HY.setOpaque(false);
        this.HY.setVerticalTextPosition(3);
        this.Iv.add(this.HY);
        this.Ic.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconemprestados.png")));
        this.Ic.setBorderPainted(false);
        this.Ic.setFocusable(false);
        this.Ic.setHorizontalTextPosition(0);
        this.Ic.setOpaque(false);
        this.Ic.setVerticalTextPosition(3);
        this.Iv.add(this.Ic);
        this.temaBarra();
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ve, -1, 1024, Short.MAX_VALUE).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout2.createSequentialGroup().addComponent(this.Iv, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.Ef, -2, 53, -2)).addComponent(this.HU, -1, 290, Short.MAX_VALUE).addComponent(this.If, -1, -1, Short.MAX_VALUE)).addComponent(this.wf, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Ix).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.ve, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.wf, -2, -1, -2).addGap(18, 18, 18).addComponent(this.HU, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.If, -2, 236, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Iv, -2, -1, -2).addComponent(this.Ef))).addComponent(this.Ix)).addGap(22, 22, 22)));
    }

    /** Barra do topo no tema: logo, botões com ícones vetoriais e a data à direita. */
    private void temaBarra() {
        java.awt.Color cor = components.TemaBetfoot.TEXTO_SUAVE;
        Object[][] botoes = new Object[][]{
            {this.HR, "Agenda", components.TemaBetfoot.Simbolo.CALENDARIO},
            {this.afl, "Sele\u00e7\u00e3o", components.TemaBetfoot.Simbolo.BANDEIRA},
            {this.HS, "Tabelas", components.TemaBetfoot.Simbolo.TABELA},
            {this.HV, "Est\u00e1dio", components.TemaBetfoot.Simbolo.ESTADIO},
            {this.HW, "Juniores", components.TemaBetfoot.Simbolo.PESSOA},
            {this.Ib, "Times", components.TemaBetfoot.Simbolo.CAMISA},
            {this.Id, "Treino", components.TemaBetfoot.Simbolo.CONE},
            {this.yY, "Procura", components.TemaBetfoot.Simbolo.LUPA},
            {this.Ia, "T\u00e9cnicos", components.TemaBetfoot.Simbolo.APITO},
            {this.HZ, "Hist\u00f3ria", components.TemaBetfoot.Simbolo.TROFEU},
            {this.HX, "Op\u00e7\u00f5es", components.TemaBetfoot.Simbolo.ENGRENAGEM}};
        for (Object[] b : botoes) {
            components.TemaBetfoot.botaoMenu((JButton)b[0], (String)b[1], new components.TemaBetfoot.IconeVetor((components.TemaBetfoot.Simbolo)b[2], 22, cor));
        }
        for (JToolBar.Separator separador : new JToolBar.Separator[]{this.Io, this.Ih, this.Is, this.Ij, this.OD, this.In, this.Ik, this.Iu, this.Il, this.Im, this.It, this.Ip, this.Iq, this.Ir, this.Ii}) {
            separador.setSeparatorSize(new Dimension(2, 2));
            separador.setVisible(false);
        }
        this.ve.add((java.awt.Component)components.TemaBetfoot.logoBarra(), 0);
        // Data à direita, numa pílula.
        int indice = this.ve.getComponentIndex(this.Eh);
        this.ve.add(javax.swing.Box.createHorizontalGlue(), Math.max(0, indice));
        this.Eg.setFont(components.TemaBetfoot.espacada(components.TemaBetfoot.display(17.0f), 0.04f));
        this.Eg.setForeground(components.TemaBetfoot.TEXTO);
        this.Eg.setIcon(new components.TemaBetfoot.IconeVetor(components.TemaBetfoot.Simbolo.CALENDARIO, 18, components.TemaBetfoot.VERDE));
        this.Eg.setIconTextGap(10);
        this.Eg.setBorder(new javax.swing.border.AbstractBorder() {
            @Override
            public void paintBorder(java.awt.Component component, java.awt.Graphics graphics, int x, int y, int w, int h) {
                java.awt.Graphics2D g = components.TemaBetfoot.suave(graphics);
                java.awt.geom.RoundRectangle2D.Double forma = new java.awt.geom.RoundRectangle2D.Double(x + 0.5, y + 0.5, w - 1, h - 1, h, h);
                g.setColor(components.TemaBetfoot.alfa(java.awt.Color.WHITE, 0.06));
                g.fill(forma);
                g.setColor(components.TemaBetfoot.alfa(java.awt.Color.WHITE, 0.14));
                g.draw(forma);
                g.dispose();
            }

            @Override
            public java.awt.Insets getBorderInsets(java.awt.Component component) {
                return new java.awt.Insets(8, 16, 8, 18);
            }
        });
    }

    private void a(ActionEvent actionEvent) {
    }

    private void c(ActionEvent actionEvent) {
    }

    static /* synthetic */ void a(PainelPrincipalClube eg_02) {
        eg_02.qV();
    }

    static /* synthetic */ void b(PainelPrincipalClube eg_02) {
        eg_02.qT();
    }

    static /* synthetic */ JTable c(PainelPrincipalClube eg_02) {
        return eg_02.Iy;
    }

    static /* synthetic */ void a(PainelPrincipalClube eg_02, int n2) {
        eg_02.dn(n2);
    }

    static /* synthetic */ void d(PainelPrincipalClube eg_02) {
        eg_02.qM();
    }

    static /* synthetic */ void e(PainelPrincipalClube eg_02) {
        eg_02.qG();
    }

    static /* synthetic */ void f(PainelPrincipalClube eg_02) {
        eg_02.qF();
    }

    static /* synthetic */ void g(PainelPrincipalClube eg_02) {
        eg_02.qE();
    }

    static /* synthetic */ JButton h(PainelPrincipalClube eg_02) {
        return eg_02.HX;
    }

    static /* synthetic */ JPopupMenu i(PainelPrincipalClube eg_02) {
        return eg_02.Hx;
    }

    static /* synthetic */ JButton j(PainelPrincipalClube eg_02) {
        return eg_02.HR;
    }

    static /* synthetic */ JPopupMenu k(PainelPrincipalClube eg_02) {
        return eg_02.afi;
    }

    static /* synthetic */ JButton l(PainelPrincipalClube eg_02) {
        return eg_02.afl;
    }

    static /* synthetic */ JButton m(PainelPrincipalClube eg_02) {
        return eg_02.Ia;
    }

    static /* synthetic */ JButton n(PainelPrincipalClube eg_02) {
        return eg_02.HZ;
    }

    static /* synthetic */ void o(PainelPrincipalClube eg_02) {
        eg_02.qU();
    }

    static /* synthetic */ ModeloTime p(PainelPrincipalClube eg_02) {
        return eg_02.Hv;
    }

    static /* synthetic */ void q(PainelPrincipalClube eg_02) {
        eg_02.qQ();
    }

    static /* synthetic */ void r(PainelPrincipalClube eg_02) {
        eg_02.rw();
    }

    static /* synthetic */ void s(PainelPrincipalClube eg_02) {
        eg_02.qP();
    }

    static /* synthetic */ void t(PainelPrincipalClube eg_02) {
        eg_02.qO();
    }

    static /* synthetic */ void u(PainelPrincipalClube eg_02) {
        eg_02.AI();
    }

    static /* synthetic */ void v(PainelPrincipalClube eg_02) {
        eg_02.rc();
    }

    static /* synthetic */ void w(PainelPrincipalClube eg_02) {
        eg_02.rx();
    }

    static /* synthetic */ void a(PainelPrincipalClube eg_02, ActionEvent actionEvent) {
        eg_02.c(actionEvent);
    }

    static /* synthetic */ void b(PainelPrincipalClube eg_02, ActionEvent actionEvent) {
        eg_02.a(actionEvent);
    }
}

