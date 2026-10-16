package nucleo;

import telas.TelaConvocacaoSelecao;
import telas.TelaEstatisticasCompeticao;
import telas.PainelDemissoesRodada;
import telas.PainelConfiguracaoNovoJogo;
import telas.PainelFimTemporada;
import telas.DialogoMarcarAmistoso;
import telas.DialogoCampeaoCompeticao;
import telas.PainelPartidaAoVivo;
import telas.DialogoGaleriaTrofeusTecnico;
import telas.DialogoGaleriaTrofeusTimeIcones;
import telas.PainelHistoricoCarreiraJogador;
import telas.DialogoDemissaoTecnico;
import telas.DialogoCarregarJogoSalvo;
import telas.PainelFichaJogador;
import telas.PainelPrincipalClube;
import telas.DialogoOpcoes;
import telas.PainelCentralEmpregos;
import telas.PainelConvitesTecnico;
import telas.DialogoMarcarAmistoso2;
import telas.PainelResumoPartida;
import telas.TelaConfiguracoesIniciais;
import telas.PainelPartidaAoVivo2;
import telas.PainelAguardeProcesso;
import telas.TelaGerenciamentoClube;
import telas.TelaMelhoresTemporada;
import telas.TelaCriarTorneioAmistoso;
import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import telas.TelaClassificacaoJogos;
import nucleo.Competicao;
import nucleo.UtilitariosTexto;
import components.PainelFundoTelaModo;
import competicoes.CompeticaoLigaNacional;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import sun.java2d.SunGraphicsEnvironment;

public class GerenciadorTelas {
    private static JScrollPane gH;
    private static PainelFundoTelaModo gI;
    private static JFrame cC;
    private static boolean gJ;
    private static TelaConfiguracoesIniciais gK;
    private static PainelConfiguracaoNovoJogo gL;
    private static PainelPartidaAoVivo gM;
    private static PainelPrincipalClube gN;
    private static PainelPartidaAoVivo2 gP;
    private static PainelFimTemporada gQ;
    private static PainelFichaJogador gR;
    private static TelaCriarTorneioAmistoso Jn;
    private static int gS;
    private static int gT;
    private static JDialog gU;

    static {
        cC = new JFrame();
        gJ = false;
        gS = 0;
        gT = 0;
        gU = null;
    }

    public GerenciadorTelas(boolean bl) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/ball.png"));
        cC.setIconImage(imageIcon.getImage());
        cC.setTitle("Betfoot");
        gI = new PainelFundoTelaModo(null, 0);
        GraphicsConfiguration graphicsConfiguration = cC.getGraphicsConfiguration();
        Rectangle rectangle = SunGraphicsEnvironment.getUsableBounds(graphicsConfiguration.getDevice());
        cC.setMaximizedBounds(new Rectangle(0, 0, rectangle.width, rectangle.height));
        System.out.println("screen size:" + rectangle.width + "  " + rectangle.height);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n2 = (int)dimension.getWidth();
        int n3 = (int)dimension.getHeight();
        System.out.println("screen size:" + n2 + "  " + n3);
        gS = rectangle.width;
        gT = rectangle.height;
        cC.setExtendedState((cC.getExtendedState() & 6) == 6 ? 0 : 6);
        cC.setUndecorated(true);
        cC.setDefaultCloseOperation(3);
        cC.setLayout(new BorderLayout());
        if (gS <= 1020 || gT <= 700) {
            gJ = true;
        }
        if (bl) {
            gK = new TelaConfiguracoesIniciais(cC);
            gI.add((Component)gK, "Center");
            gI.setBackground(new Color(36, 91, 45));
            if (gJ) {
                gH = new JScrollPane();
                cC.add((Component)gH, "Center");
                gH.setViewportView(gI);
            } else {
                cC.add((Component)gI, "Center");
            }
        }
        UtilitariosTexto.a(cC);
        cC.pack();
        cC.setVisible(true);
    }

    public static JPanel aY(int n2) {
        gI = null;
        gI = n2 == 8 ? new PainelFundoTelaModo(null, 0) : new PainelFundoTelaModo(null, 0);
        gI.setBackground(new Color(36, 91, 45));
        if (n2 == 0) {
            gK = new TelaConfiguracoesIniciais(cC);
            gI.add((Component)gK, "Center");
            gI.setBackground(new Color(36, 91, 45));
        } else if (n2 == 1) {
            gL = new PainelConfiguracaoNovoJogo(cC);
            gI.add((Component)gL, "Center");
        } else if (n2 == 2) {
            gM = null;
            gP = null;
            gN = new PainelPrincipalClube(cC);
            gN.setPreferredSize(new Dimension(gS, gT));
            gI.add((Component)gN, "Center");
        } else if (n2 == 3) {
            gK = new TelaConfiguracoesIniciais(cC);
            gI.add((Component)gK, "Center");
        } else if (n2 == 4) {
            gM = null;
            gM = new PainelPartidaAoVivo(cC, gT);
            gM.setPreferredSize(new Dimension(1024, gT));
            gI.add((Component)gM, "Center");
        } else if (n2 == 5) {
            gP = null;
            gP = new PainelPartidaAoVivo2(cC);
            gP.setPreferredSize(new Dimension(1024, 748));
            gI.add((Component)gP, "Center");
        } else if (n2 == 6) {
            gQ = null;
            gQ = new PainelFimTemporada(cC);
            gQ.setPreferredSize(new Dimension(1024, 718));
            gI.add((Component)gQ, "Center");
        } else if (n2 == 8) {
            gR = new PainelFichaJogador(cC);
            gR.setPreferredSize(new Dimension(941, 718));
            gI.add((Component)gR, "Center");
        } else if (n2 == 10) {
            Jn = new TelaCriarTorneioAmistoso(cC);
            Jn.setPreferredSize(new Dimension(742, 577));
            gI.add((Component)Jn, "Center");
        }
        GerenciadorTelas.aZ(n2);
        if (n2 == 4) {
            return gM;
        }
        if (n2 == 5) {
            return gP;
        }
        return null;
    }

    private static void aZ(int n2) {
        cC.getContentPane().removeAll();
        if (gJ) {
            gH = new JScrollPane();
            cC.add((Component)gH, "Center");
            gH.setViewportView(gI);
        } else {
            cC.add((Component)gI, "Center");
        }
        cC.revalidate();
        cC.repaint();
        if (n2 == 1 && gL != null) {
            gL.on();
        }
        if (n2 == 2 && gN != null) {
            gN.on();
        }
        if (n2 == 5 && gP != null) {
            gP.on();
        }
        cC.setVisible(true);
    }

    public static TelaConfiguracoesIniciais iE() {
        return gK;
    }

    public static PainelPrincipalClube iF() {
        return gN;
    }

    public static JFrame db() {
        return cC;
    }

    public static void a(ModeloTime ah2, Competicao at2, int n2) {
        JDialog jDialog = new JDialog(cC);
        DialogoCampeaoCompeticao dJ2 = new DialogoCampeaoCompeticao(jDialog, ah2, at2, n2);
        jDialog.add(dJ2);
        jDialog.setSize(306, 413);
        jDialog.setPreferredSize(new Dimension(306, 413));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(ArrayList arrayList, nucleo.Campeonato al2, int n2) {
        JDialog jDialog = new JDialog(cC);
        PainelConvitesTecnico gO2 = new PainelConvitesTecnico(jDialog, arrayList, al2, n2);
        jDialog.add(gO2);
        jDialog.setSize(774, 724);
        jDialog.setPreferredSize(new Dimension(774, 724));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void l(nucleo.Campeonato al2) {
        JDialog jDialog = new JDialog(cC);
        PainelCentralEmpregos gE2 = new PainelCentralEmpregos(jDialog, al2);
        jDialog.add(gE2);
        jDialog.setSize(711, 670);
        jDialog.setPreferredSize(new Dimension(711, 670));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void K(ArrayList arrayList) {
        JDialog jDialog = new JDialog(cC);
        PainelDemissoesRodada bl_02 = new PainelDemissoesRodada(jDialog, arrayList);
        jDialog.add(bl_02);
        jDialog.setSize(608, 304);
        jDialog.setPreferredSize(new Dimension(608, 304));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(nucleo.Campeonato al2, nucleo.Campeonato al3, ModeloTime ah2, int n2) {
        JDialog jDialog = new JDialog(cC);
        DialogoDemissaoTecnico dm2 = new DialogoDemissaoTecnico(jDialog, al2, al3, ah2, n2);
        jDialog.add(dm2);
        jDialog.setSize(475, 282);
        jDialog.setPreferredSize(new Dimension(475, 282));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void cX() {
        DialogoCarregarJogoSalvo.abrir();
    }

    public static void a(String string, boolean bl) {
        JDialog jDialog;
        gU = jDialog = new JDialog();
        PainelAguardeProcesso hz2 = new PainelAguardeProcesso(jDialog, string, bl);
        jDialog.add(hz2);
        jDialog.setSize(353, 103);
        jDialog.setPreferredSize(new Dimension(353, 103));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void iG() {
        JDialog jDialog = new JDialog(cC);
        PainelResumoPartida hF2 = new PainelResumoPartida(jDialog);
        jDialog.add(hF2);
        jDialog.setSize(799, 664);
        jDialog.setPreferredSize(new Dimension(799, 664));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(ModeloTime ah2, boolean bl) {
        JDialog jDialog = new JDialog(cC);
        TelaConvocacaoSelecao aP2 = new TelaConvocacaoSelecao(jDialog, ah2, bl);
        jDialog.add(aP2);
        jDialog.setSize(948, 706);
        jDialog.setPreferredSize(new Dimension(948, 706));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(ModeloJogador f2, JDialog jDialog) {
        JDialog jDialog2 = new JDialog(cC);
        PainelHistoricoCarreiraJogador dk_02 = new PainelHistoricoCarreiraJogador(jDialog2, f2);
        jDialog2.add(dk_02);
        jDialog2.setSize(786, 600);
        jDialog2.setPreferredSize(new Dimension(786, 600));
        jDialog2.setModal(true);
        jDialog2.setResizable(false);
        jDialog2.setLocationRelativeTo(null);
        jDialog2.setUndecorated(true);
        jDialog2.setVisible(true);
    }

    public static void v(ModeloTime ah2) {
        JDialog jDialog = new JDialog(cC);
        DialogoGaleriaTrofeusTimeIcones di2 = new DialogoGaleriaTrofeusTimeIcones(jDialog, ah2);
        jDialog.add(di2);
        int n2 = 886;
        int n3 = 762;
        int n4 = di2.pG();
        if (n4 < 5) {
            n3 = 219;
        } else if (n4 < 9) {
            n3 = 399;
        } else if (n4 < 13) {
            n3 = 579;
        }
        jDialog.setSize(n2, n3);
        jDialog.setPreferredSize(new Dimension(n2, n3));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(int n2, Competicao at2) {
        JDialog jDialog = new JDialog(cC);
        TelaEstatisticasCompeticao ay_02 = new TelaEstatisticasCompeticao(jDialog, at2);
        jDialog.add(ay_02);
        jDialog.setSize(833, 735);
        jDialog.setPreferredSize(new Dimension(833, 735));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void b(int n2, Competicao at2) {
        JDialog jDialog = new JDialog(cC);
        TelaClassificacaoJogos al2 = new TelaClassificacaoJogos(jDialog, n2, at2);
        jDialog.add(al2);
        int n3 = gT;
        if (n3 > 800) {
            n3 = 800;
        }
        jDialog.setSize(883, n3);
        jDialog.setPreferredSize(new Dimension(883, n3));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void e(nucleo.Campeonato al2) {
        JDialog jDialog = new JDialog(cC);
        DialogoGaleriaTrofeusTecnico dg_02 = new DialogoGaleriaTrofeusTecnico(jDialog, al2);
        jDialog.add(dg_02);
        jDialog.setSize(971, 646);
        jDialog.setPreferredSize(new Dimension(971, 646));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(CompeticaoLigaNacional b_02, LigaNacional z2, int n2) {
        JDialog jDialog = new JDialog(cC);
        TelaMelhoresTemporada iu_02 = new TelaMelhoresTemporada(jDialog, b_02, z2, n2);
        jDialog.add(iu_02);
        jDialog.setSize(372, 657);
        jDialog.setPreferredSize(new Dimension(372, 657));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(JTable jTable) {
        JDialog jDialog = components.TemaBetfoot.dialogo(cC);
        DialogoOpcoes fB2 = new DialogoOpcoes(jDialog, jTable);
        components.TemaBetfoot.vestir(jDialog, fB2);
        jDialog.setVisible(true);
    }

    public static void w(ModeloTime ah2) {
        JDialog jDialog = new JDialog(cC);
        DialogoMarcarAmistoso2 h3 = new DialogoMarcarAmistoso2(jDialog, ah2);
        jDialog.add(h3);
        jDialog.setSize(565, 575);
        jDialog.setPreferredSize(new Dimension(565, 575));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void x(ModeloTime ah2) {
        JDialog jDialog = new JDialog(cC);
        DialogoMarcarAmistoso d2 = new DialogoMarcarAmistoso(jDialog, ah2);
        jDialog.add(d2);
        jDialog.setSize(565, 575);
        jDialog.setPreferredSize(new Dimension(565, 575));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static void a(ModeloTime ah2, ModeloTime ah3, boolean bl) {
        GraphicsConfiguration graphicsConfiguration = cC.getGraphicsConfiguration();
        Rectangle rectangle = SunGraphicsEnvironment.getUsableBounds(graphicsConfiguration.getDevice());
        cC.setMaximizedBounds(new Rectangle(0, 0, rectangle.width, rectangle.height));
        gS = rectangle.width;
        gT = rectangle.height;
        int n2 = 1024;
        int n3 = 718;
        if (gS >= 1366) {
            n2 = 1200;
        }
        if (gT >= 768) {
            n3 = 740;
        }
        JDialog jDialog = new JDialog(cC);
        TelaGerenciamentoClube iA2 = new TelaGerenciamentoClube(jDialog, ah2, ah3, bl);
        jDialog.add(iA2);
        jDialog.setSize(n2, n3);
        jDialog.setPreferredSize(new Dimension(n2, n3));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public static JDialog iH() {
        return gU;
    }

    public static boolean iI() {
        return gJ;
    }
}

