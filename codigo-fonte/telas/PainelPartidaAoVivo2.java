package telas;

import telas.PainelPartidaAoVivo;
import telas.PainelFichaJogador;
import telas.PainelPrincipalClube;
import telas.ComparadorJogadorPosicaoCampo;
import telas.OuvinteTimeDaRodadaPartida;
import telas.OuvinteEncerrarPartida;
import telas.TarefaCronometroPartida;
import telas.AcaoAtalhoContinuarPartida;
import telas.AcaoTeclaLinhaAcimaPartida;
import telas.AcaoTeclaLinhaAbaixoPartida;
import telas.OuvinteSelecaoTimePartida;
import telas.OuvinteContinuarPartida;
import telas.OuvinteEstatisticasPartidaAoVivo;
import telas.OuvinteOpcoesPartidaAoVivo;
import tabelas.ModeloTabelaHistoricoCompeticoes;
import tabelas.RenderizadorTabelaLancesPartida;
import tabelas.RenderizadorListaPaises;
import tabelas.RenderizadorTabelaEventosPartida;
import tabelas.ModeloTabelaEventosPartida;
import nucleo.BalancoFinanceiro;
import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.SorteadorJogadorAleatorio;
import nucleo.LigaNacional;
import nucleo.EventoPartida;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.Competicao;
import nucleo.AgrupadorCompeticoesRodada;
import nucleo.GerenciadorTelas;
import nucleo.CarregadorConfigEstadual;
import motor.GerenciadorJogo;
import components.LayoutPosicaoAbsoluta;
import components.LinhaJogadorPartidaAoVivo;
import components.ItemPlacarPartidaAoVivo;
import components.LinhaPartidaComTextos;
import competicoes.CompeticaoCampeonatoEstadual;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.KeyStroke;

public class PainelPartidaAoVivo2
extends JPanel {
    private JFrame Br;
    private ArrayList cP = new ArrayList();
    private ArrayList cQ = new ArrayList();
    private ArrayList KM = new ArrayList();
    private ArrayList KN = new ArrayList();
    private ArrayList vK = new ArrayList();
    private ArrayList KO = new ArrayList();
    private ArrayList KP = new ArrayList();
    private ArrayList KQ = new ArrayList();
    private int w;
    private LigaNacional KR = null;
    private ModeloPartida KS = null;
    private static int KT = 0;
    private static Timer Dk;
    private JPanel xb = null;
    private int xh = 0;
    private int xi = 0;
    private ArrayList KU = new ArrayList();
    private int KV = -1;
    private Color KW = new Color(211, 191, 22);
    private Color KX = new Color(228, 227, 227);
    private ModeloPartida KY = null;
    public static Comparator KZ;
    private JButton HS;
    private JButton La;
    private JButton zK;
    private JButton Lb;
    private JButton Lc;
    private JComboBox va;
    private JLabel uh;
    private JLabel a_;
    private JLabel ur;
    private JLabel us;
    private JPanel vd;
    private JScrollPane ut;
    private JScrollPane wi;
    private JScrollPane zf;
    private JScrollPane zg;
    private JLabel Ld;
    private JLabel Le;
    private JLabel Lf;
    private JLabel Lg;
    private JLabel Fq;
    private JLabel yu;
    private JLabel Cg;
    private JLabel Lh;
    private JLabel Li;
    private JLabel Lj;
    private JLabel Lk;
    private JLabel Ll;
    private JLabel Lm;
    private JLabel Ln;
    private JLabel Lo;
    private JLabel Dy;
    private JLabel Dz;
    private JLabel Lp;
    private JLabel Lq;
    private JLabel zO;
    private JLabel zP;
    private JTable DG;
    private JTable Lr;
    private JTable Ls;

    static {
        KZ = new ComparadorJogadorPosicaoCampo();
    }

    public void oR() {
        Dk = new Timer();
        Dk.schedule((TimerTask)new TarefaCronometroPartida(this), 0L);
    }

    public PainelPartidaAoVivo2(JFrame jFrame) {
        this.Br = jFrame;
        this.mJ();
        this.rY();
        this.rX();
        this.mH();
        this.rZ();
        this.ut.setBorder(BorderFactory.createEmptyBorder());
        this.zf.setBorder(BorderFactory.createEmptyBorder());
        this.zg.setBorder(BorderFactory.createEmptyBorder());
        this.mY();
        this.sd();
        if (GerenciadorJogo.SR.bD()) {
            this.oR();
        }
    }

    private void mY() {
        this.a((JComponent)this);
        this.a(this.zK);
        this.a(this.wi);
        this.a(this.va);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "st");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("st", new AcaoAtalhoContinuarPartida(this));
    }

    private void b(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(38, 0), "upLinha");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("upLinha", new AcaoTeclaLinhaAcimaPartida(this));
    }

    private void c(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(40, 0), "downLinha");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("downLinha", new AcaoTeclaLinhaAbaixoPartida(this));
    }

    private void nt() {
        this.KU.clear();
        this.xb = new JPanel(new LayoutPosicaoAbsoluta());
        this.xh = 0;
        this.xi = 0;
        this.a(this.xb);
        this.b(this.xb);
        this.c(this.xb);
    }

    private void a(ItemPlacarPartidaAoVivo u_02) {
        int n2 = 0;
        components.PainelPlacarPartida v_02 = new components.PainelPlacarPartida(u_02, this);
        this.xb.add((Component)v_02, new components.RestricaoPosicaoLayout(0, this.xh, 295, 26));
        if (u_02.tR() != null) {
            this.KU.add(v_02);
        }
        this.xh = this.xh + 27 + n2;
    }

    public void on() {
        this.zK.requestFocusInWindow();
    }

    private void rX() {
        ModeloTabelaHistoricoCompeticoes j2 = new ModeloTabelaHistoricoCompeticoes(this.KP);
        this.Lr.setModel(j2);
        this.Lr.setTableHeader(null);
        int[] nArray = new int[]{180, 20, 25};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.Lr.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.Lr.setAutoResizeMode(3);
        this.Lr.setRowHeight(20);
        this.Lr.setShowGrid(false);
        this.Lr.setDefaultRenderer(LinhaJogadorPartidaAoVivo.class, new RenderizadorTabelaLancesPartida());
        this.Lr.setAutoCreateRowSorter(false);
        this.Lr.setCellSelectionEnabled(false);
        this.Lr.setRowSelectionAllowed(false);
        this.Lr.setBackground(this.getBackground());
        this.Lr.setFillsViewportHeight(true);
        ModeloTabelaHistoricoCompeticoes j3 = new ModeloTabelaHistoricoCompeticoes(this.KQ);
        this.Ls.setModel(j3);
        this.Ls.setTableHeader(null);
        int n3 = 0;
        while (n3 < nArray.length) {
            this.Ls.getColumnModel().getColumn(n3).setPreferredWidth(nArray[n3]);
            ++n3;
        }
        this.Ls.setAutoResizeMode(3);
        this.Ls.setRowHeight(20);
        this.Ls.setShowGrid(false);
        this.Ls.setDefaultRenderer(LinhaJogadorPartidaAoVivo.class, new RenderizadorTabelaLancesPartida());
        this.Ls.setAutoCreateRowSorter(false);
        this.Ls.setCellSelectionEnabled(false);
        this.Ls.setRowSelectionAllowed(false);
        this.Ls.setBackground(this.getBackground());
        this.Ls.setFillsViewportHeight(true);
    }

    private void rY() {
        ModeloTabelaEventosPartida v_02 = new ModeloTabelaEventosPartida(this.KO);
        this.DG.setModel(v_02);
        this.DG.setTableHeader(null);
        int[] nArray = new int[]{20, 180, 20};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.DG.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.DG.setAutoResizeMode(3);
        this.DG.setRowHeight(20);
        this.DG.setShowGrid(false);
        this.DG.setDefaultRenderer(EventoPartida.class, new RenderizadorTabelaEventosPartida(true));
        this.DG.setAutoCreateRowSorter(false);
        this.DG.setCellSelectionEnabled(false);
        this.DG.setRowSelectionAllowed(false);
        this.DG.setBackground(this.getBackground());
        this.DG.setFillsViewportHeight(true);
    }

    private void nx() {
        this.zK.setCursor(new Cursor(3));
        if (GerenciadorJogo.SR.isUsaSons()) {
            PainelPartidaAoVivo.qb();
        }
        boolean bl = false;
        PainelPrincipalClube.aQ(false);
        if (GerenciadorJogo.SR.isVerLeiloes() && this.KS != null && (this.w == 1 || this.w == 3 || this.w == 10)) {
            ArrayList<SorteadorJogadorAleatorio> arrayList = new ArrayList<SorteadorJogadorAleatorio>();
            int n2 = new Random().nextInt(4);
            int n3 = 0;
            while (n3 < n2) {
                SorteadorJogadorAleatorio n4 = new SorteadorJogadorAleatorio();
                if (n4.iA() != null) {
                    arrayList.add(n4);
                }
                ++n3;
            }
            PainelFichaJogador.X(arrayList);
            if (arrayList.size() > 0 && GerenciadorJogo.SR.cd()) {
                bl = true;
            }
        }
        if (bl) {
            GerenciadorTelas.aY(8);
        } else {
            GerenciadorJogo.SR.ax();
        }
    }

    private void mH() {
        this.va.addActionListener(new OuvinteSelecaoTimePartida(this));
        this.zK.addActionListener(new OuvinteContinuarPartida(this));
        this.HS.addActionListener(new OuvinteEstatisticasPartidaAoVivo(this));
        this.La.addActionListener(new OuvinteOpcoesPartidaAoVivo(this));
        this.Lc.addActionListener(new OuvinteTimeDaRodadaPartida(this));
        this.Lb.addActionListener(new OuvinteEncerrarPartida(this));
    }

    private void qV() {
        Competicao at2 = null;
        if (this.KY != null) {
            at2 = this.KY.hy();
        }
        this.HS.setCursor(new Cursor(3));
        GerenciadorTelas.a(this.w, at2);
        this.HS.setCursor(new Cursor(12));
    }

    public void rr() {
        ModeloTime ah2 = null;
        if (GerenciadorJogo.SR.aN().size() > 0) {
            ah2 = (ModeloTime)GerenciadorJogo.SR.aN().get(0);
        }
        if (ah2 != null && ah2.jZ().booleanValue()) {
            String string = ah2.ka().dS();
            int n2 = -1;
            n2 = JOptionPane.showConfirmDialog(this.Br, String.valueOf(string) + " deseja ser demitido do " + ah2.getNome(), "Pedido de demiss\u00e3o", 0);
            if (n2 == 0) {
                Campeonato al2 = ah2.ka();
                Campeonato al3 = ah2.kE();
                GerenciadorTelas.a(al2, al3, ah2, 0);
            }
        }
    }

    private void cC(int n2) {
        if (this.KN.size() > 0) {
            if (this.w == 1) {
                this.e((LigaNacional)this.KN.get(n2));
            }
        } else if (this.KM.size() > 0) {
            if (this.w == 3) {
                this.a((CarregadorConfigEstadual)this.KM.get(n2));
            }
        } else if (this.cQ.size() > 0) {
            this.x((Competicao)this.cQ.get(n2));
        }
        this.f(0, true);
    }

    private void rZ() {
        RenderizadorListaPaises ak_02 = new RenderizadorListaPaises();
        this.va.setPreferredSize(new Dimension(10, 25));
        this.va.setRenderer(ak_02);
        this.va.setMaximumRowCount(24);
        this.w = 0;
        this.cP.clear();
        this.cP.addAll(((nucleo.Calendario)GerenciadorJogo.SR.R().get(GerenciadorJogo.SR.J())).t());
        KT = 0;
        if (this.cP.size() > 0) {
            if (((Competicao)this.cP.get(0)).b() == 1) {
                this.pB();
                KT = 1;
                this.w = 1;
            } else if (((Competicao)this.cP.get(0)).b() == 3) {
                this.sb();
                this.w = 3;
            } else {
                this.w = ((Competicao)this.cP.get(0)).b();
                this.sa();
            }
        }
    }

    private void sa() {
        int n2;
        this.cQ.clear();
        int n3 = 0;
        while (n3 < this.cP.size()) {
            this.va.addItem(this.cP.get(n3));
            this.cQ.add((Competicao)this.cP.get(n3));
            ++n3;
        }
        n3 = 0;
        int n4 = AgrupadorCompeticoesRodada.dL();
        if (n4 >= 0 && n4 < this.cQ.size()) {
            n3 = n4;
        }
        if (this.w == 2) {
            n2 = 0;
            while (n2 < this.cQ.size()) {
                if (this.cQ.get(n2) == AgrupadorCompeticoesRodada.dN()) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
        }
        if (this.w == 4) {
            n2 = 0;
            while (n2 < this.cQ.size()) {
                if (((Competicao)this.cQ.get(n2)).gg() == AgrupadorCompeticoesRodada.dL()) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
        }
        try {
            this.va.setSelectedIndex(n3);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.x((Competicao)this.cQ.get(n3));
    }

    public void x(Competicao at2) {
        this.nt();
        boolean bl = true;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).hy() == at2) {
                ItemPlacarPartidaAoVivo u_02;
                n2 = -1;
                if (n2 != n3) {
                    bl = true;
                }
                if (bl) {
                    u_02 = new ItemPlacarPartidaAoVivo();
                    u_02.D(((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).ij());
                    this.a(u_02);
                    bl = false;
                    n3 = n2;
                }
                u_02 = new ItemPlacarPartidaAoVivo();
                u_02.n((ModeloPartida)GerenciadorJogo.SR.S().get(n4));
                this.a(u_02);
            }
            ++n4;
        }
        JViewport jViewport = this.wi.getViewport();
        jViewport.setView(this.xb);
    }

    private void sb() {
        int n2;
        this.KM.clear();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.aE().size()) {
            n2 = 0;
            while (n2 < this.cP.size()) {
                if (((Competicao)this.cP.get(n2)).ir() == GerenciadorJogo.SR.aE().get(n3) && !this.cQ.contains(GerenciadorJogo.SR.aE().get(n3))) {
                    this.va.addItem(GerenciadorJogo.SR.aE().get(n3));
                    this.KM.add((CarregadorConfigEstadual)GerenciadorJogo.SR.aE().get(n3));
                }
                ++n2;
            }
            ++n3;
        }
        n3 = AgrupadorCompeticoesRodada.dL();
        n2 = this.KM.size() - 1;
        if (n3 >= 0) {
            int n4 = 0;
            while (n4 < this.KM.size()) {
                if (((CarregadorConfigEstadual)this.KM.get(n4)).getEstado() == n3) {
                    n2 = n4;
                    break;
                }
                ++n4;
            }
        }
        this.va.setSelectedIndex(n2);
        this.a((CarregadorConfigEstadual)this.KM.get(n2));
    }

    private void pB() {
        int n2;
        this.KN.clear();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.N().size()) {
            n2 = 0;
            while (n2 < this.cP.size()) {
                if (((Competicao)this.cP.get(n2)).iq() == GerenciadorJogo.SR.N().get(n3) && !this.KN.contains(GerenciadorJogo.SR.N().get(n3))) {
                    try {
                        this.va.addItem(GerenciadorJogo.SR.N().get(n3));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.KN.add((LigaNacional)GerenciadorJogo.SR.N().get(n3));
                }
                ++n2;
            }
            ++n3;
        }
        n3 = AgrupadorCompeticoesRodada.dL();
        n2 = this.KN.size() - 1;
        if (n3 >= 0) {
            int n4 = 0;
            while (n4 < this.KN.size()) {
                if (((LigaNacional)this.KN.get(n4)).jc() == n3) {
                    n2 = n4;
                    this.KR = (LigaNacional)this.KN.get(n4);
                    break;
                }
                ++n4;
            }
        }
        try {
            this.va.setSelectedIndex(n2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.e((LigaNacional)this.KN.get(n2));
    }

    public void a(CarregadorConfigEstadual w2) {
        this.nt();
        boolean bl = true;
        int n2 = 0;
        int n3 = 0;
        ArrayList<ModeloPartida> arrayList = new ArrayList<ModeloPartida>();
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).hy() instanceof CompeticaoCampeonatoEstadual && ((CompeticaoCampeonatoEstadual)((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).hy()).yj() == w2) {
                arrayList.add((ModeloPartida)GerenciadorJogo.SR.S().get(n4));
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < arrayList.size()) {
            ItemPlacarPartidaAoVivo u_02;
            n2 = ((ModeloPartida)arrayList.get(n4)).hy().ip();
            if (n2 != n3) {
                bl = true;
            }
            if (bl) {
                u_02 = new ItemPlacarPartidaAoVivo();
                u_02.D(((ModeloPartida)arrayList.get(n4)).ij());
                this.a(u_02);
                bl = false;
                n3 = n2;
            }
            u_02 = new ItemPlacarPartidaAoVivo();
            u_02.n((ModeloPartida)arrayList.get(n4));
            this.a(u_02);
            ++n4;
        }
        JViewport jViewport = this.wi.getViewport();
        jViewport.setView(this.xb);
    }

    private int sc() {
        int n2 = 0;
        while (n2 < this.vK.size()) {
            if (((LinhaPartidaComTextos)this.vK.get(n2)).tR() != null && (((LinhaPartidaComTextos)this.vK.get(n2)).tR().hc().jZ().booleanValue() || ((LinhaPartidaComTextos)this.vK.get(n2)).tR().hd().jZ().booleanValue())) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public void dz(int n2) {
        int n3 = 0;
        n3 = n2 == 0 ? this.KV + 1 : this.KV - 1;
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= this.KU.size()) {
            n3 = this.KU.size() - 1;
        }
        this.f(n3, true);
        this.se();
    }

    public void f(int n2, boolean bl) {
        int n3 = n2;
        while (n3 < this.KU.size()) {
            if (((components.PainelPlacarPartida)this.KU.get(n3)).tR() != null) {
                if (bl) {
                    this.i(((components.PainelPlacarPartida)this.KU.get(n3)).tR());
                }
                if (this.KV >= 0 && this.KV < this.KU.size()) {
                    ((components.PainelPlacarPartida)this.KU.get(this.KV)).e(this.KX);
                }
                ((components.PainelPlacarPartida)this.KU.get(n3)).e(this.KW);
                this.KV = n3;
                break;
            }
            ++n3;
        }
    }

    public void a(components.PainelPlacarPartida v_02, ModeloPartida i2) {
        this.xb.requestFocusInWindow();
        if (this.KV >= 0 && this.KV < this.KU.size()) {
            ((components.PainelPlacarPartida)this.KU.get(this.KV)).e(this.KX);
        }
        int n2 = 0;
        while (n2 < this.KU.size()) {
            if (v_02 == this.KU.get(n2)) {
                this.KV = n2;
                break;
            }
            ++n2;
        }
        if (i2 != null) {
            this.i(i2);
        }
        v_02.e(this.KW);
    }

    public void e(LigaNacional z2) {
        this.nt();
        boolean bl = true;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).hy().iq() == z2) {
                ItemPlacarPartidaAoVivo u_02;
                n2 = ((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).hy().ip();
                if (n2 != n3) {
                    bl = true;
                }
                if (bl) {
                    bl = false;
                    n3 = n2;
                    u_02 = new ItemPlacarPartidaAoVivo();
                    u_02.D(((ModeloPartida)GerenciadorJogo.SR.S().get(n4)).ij());
                    this.a(u_02);
                }
                u_02 = new ItemPlacarPartidaAoVivo();
                u_02.n((ModeloPartida)GerenciadorJogo.SR.S().get(n4));
                this.a(u_02);
            }
            ++n4;
        }
        JViewport jViewport = this.wi.getViewport();
        jViewport.setView(this.xb);
    }

    public void sd() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hc().jZ().booleanValue() || ((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hd().jZ().booleanValue()) {
                this.KS = (ModeloPartida)GerenciadorJogo.SR.S().get(n2);
                break;
            }
            ++n2;
        }
        if (this.KS != null) {
            n2 = -1;
            int n3 = 0;
            while (n3 < this.cQ.size()) {
                if (this.cQ.get(n3) == this.KS.hy()) {
                    n2 = n3;
                    break;
                }
                ++n3;
            }
            if (n2 >= 0 && n2 < this.va.getItemCount()) {
                this.va.setSelectedIndex(n2);
            }
            this.i(this.KS);
        } else {
            this.i(((components.PainelPlacarPartida)this.KU.get(0)).tR());
        }
        n2 = 0;
        while (n2 < this.KU.size()) {
            if (((components.PainelPlacarPartida)this.KU.get(n2)).tR() != null && ((components.PainelPlacarPartida)this.KU.get(n2)).tR() == this.KS) {
                this.f(n2, false);
                this.se();
                break;
            }
            this.f(0, false);
            ++n2;
        }
    }

    private void se() {
        Point point = this.wi.getViewport().getViewPosition();
        point.y = this.KV * 26;
        this.wi.getViewport().setViewPosition(point);
    }

    public void i(ModeloPartida i2) {
        if (i2 != null && i2 != this.KY) {
            this.KY = i2;
            this.zO.setForeground(i2.hc().kC());
            this.zO.setBackground(i2.hc().kB());
            this.zP.setForeground(i2.hd().kC());
            this.zP.setBackground(i2.hd().kB());
            if (i2.ev() != null) {
                this.Cg.setText(i2.ev().dS());
                this.Dz.setText(BalancoFinanceiro.a(i2.hN(), 0));
                this.Dy.setText(Integer.toString(i2.hU()));
                this.Dy.setToolTipText(i2.hV());
            } else if (i2.il() != null) {
                this.Cg.setText(i2.il().dS());
                this.Dz.setText(BalancoFinanceiro.a(i2.hN(), 0));
                this.Dy.setText(Integer.toString(i2.hU()));
                this.Dy.setToolTipText(i2.hV());
            } else {
                if (i2.ik() != null) {
                    this.Cg.setText(i2.ik());
                } else if (i2.hc().lp()) {
                    this.Cg.setText(i2.hc().getNome());
                }
                this.Dz.setText("n/i");
                this.Dy.setText("n/i");
            }
            int[] nArray = i2.hQ();
            if (nArray[0] >= 0 && nArray[1] >= 0) {
                this.Ll.setText("P:" + Integer.toString(nArray[0]) + "x" + Integer.toString(nArray[1]));
            } else {
                this.Ll.setText("");
            }
            this.Lm.setText(String.valueOf(i2.hu()) + " x " + i2.hw());
            this.zO.setText(String.valueOf(i2.hc().getNome()) + " ");
            this.zP.setText(" " + i2.hd().getNome());
            if (i2.hc().jY() != null) {
                this.Fq.setIcon(i2.hc().kP());
            } else {
                this.Fq.setIcon(i2.hc().K(true));
            }
            if (i2.hd().jY() != null) {
                this.yu.setIcon(i2.hd().kP());
            } else {
                this.yu.setIcon(i2.hd().K(true));
            }
            this.k(i2);
            this.a(i2, 1);
            this.a(i2, 2);
            this.Lr.addNotify();
            this.Ls.addNotify();
            this.j(i2);
        }
    }

    private void j(ModeloPartida i2) {
        this.KO.clear();
        ArrayList<EventoPartida> arrayList = null;
        ArrayList<EventoPartida> arrayList2 = null;
        Object var4_4 = null;
        ArrayList<EventoPartida> arrayList3 = null;
        int n2 = 0;
        while (n2 < i2.hE().size()) {
            ((EventoPartida)i2.hE().get(n2)).p(true);
            ++n2;
        }
        n2 = 0;
        while (n2 < i2.hE().size()) {
            if (((EventoPartida)i2.hE().get(n2)).b() == 1) {
                if (arrayList == null) {
                    arrayList = new ArrayList<EventoPartida>();
                }
                arrayList.add((EventoPartida)i2.hE().get(n2));
            } else if (((EventoPartida)i2.hE().get(n2)).b() >= 2 && ((EventoPartida)i2.hE().get(n2)).b() <= 4) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<EventoPartida>();
                }
                arrayList2.add((EventoPartida)i2.hE().get(n2));
            } else if (((EventoPartida)i2.hE().get(n2)).b() == 5) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<EventoPartida>();
                }
                arrayList3.add((EventoPartida)i2.hE().get(n2));
            }
            ++n2;
        }
        if (arrayList != null) {
            this.KO.add(new EventoPartida(91, true));
            this.KO.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.KO.add(new EventoPartida(92, true));
            this.KO.addAll(arrayList2);
        }
        if (arrayList3 != null) {
            this.KO.add(new EventoPartida(95, true));
            this.KO.addAll(arrayList3);
        }
        this.DG.addNotify();
    }

    private void k(ModeloPartida i2) {
        this.Ln.setText(Integer.toString(i2.hz()[0]));
        this.Lo.setText(Integer.toString(i2.hz()[1]));
        this.Lp.setText(Integer.toString(i2.hA()[0]));
        this.Lq.setText(Integer.toString(i2.hA()[1]));
        this.Lh.setText(String.valueOf(Integer.toString(i2.hZ()[0])) + "(" + Integer.toString(i2.ia()[0]) + ")");
        this.Li.setText(String.valueOf(Integer.toString(i2.hZ()[1])) + "(" + Integer.toString(i2.ia()[1]) + ")");
        this.Le.setText(Integer.toString(i2.hB()[0]));
        this.Lf.setText(Integer.toString(i2.hB()[1]));
        this.Lj.setText(Integer.toString(i2.hC()[0]));
        this.Lk.setText(Integer.toString(i2.hC()[1]));
    }

    private void a(ModeloPartida i2, int n2) {
        LinhaJogadorPartidaAoVivo i3;
        ModeloTime ah2;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (n2 == 1) {
            arrayList2 = this.KP;
            arrayList = i2.hl();
            ah2 = i2.hc();
        } else {
            arrayList2 = this.KQ;
            arrayList = i2.hm();
            ah2 = i2.hd();
        }
        arrayList2.clear();
        int n3 = 0;
        while (n3 < arrayList.size()) {
            i3 = new LinhaJogadorPartidaAoVivo();
            i3.h((ModeloJogador)arrayList.get(n3));
            arrayList2.add(i3);
            ++n3;
        }
        Collections.sort(arrayList2, KZ);
        LinhaJogadorPartidaAoVivo i4 = new LinhaJogadorPartidaAoVivo();
        i4.an(true);
        arrayList2.add(i4);
        i3 = new LinhaJogadorPartidaAoVivo();
        i3.ao(true);
        arrayList2.add(i3);
        int n4 = 0;
        while (n4 < i2.hE().size()) {
            if (((EventoPartida)i2.hE().get(n4)).b() == 6 && ((EventoPartida)i2.hE().get(n4)).cu() == ah2) {
                LinhaJogadorPartidaAoVivo i5 = new LinhaJogadorPartidaAoVivo();
                i5.h(((EventoPartida)i2.hE().get(n4)).ep());
                i5.ap(true);
                i5.K(((EventoPartida)i2.hE().get(n4)).eq());
                arrayList2.add(i5);
                LinhaJogadorPartidaAoVivo i6 = new LinhaJogadorPartidaAoVivo();
                i6.h(((EventoPartida)i2.hE().get(n4)).eo());
                i6.aq(true);
                arrayList2.add(i6);
            }
            ++n4;
        }
    }

    private int a(ArrayList arrayList, ModeloJogador f2) {
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (((LinhaJogadorPartidaAoVivo)arrayList.get(n2)).fb().equals(f2)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static String h(ModeloPartida i2) {
        String string = null;
        if (i2.hy().b() == 3) {
            string = String.valueOf(i2.hy().getNome()) + " " + i2.hy().ip();
        }
        return string;
    }

    public static int sf() {
        return KT;
    }

    private void mJ() {
        this.va = new JComboBox();
        this.wi = new JScrollPane();
        this.zf = new JScrollPane();
        this.Lr = new JTable();
        this.zg = new JScrollPane();
        this.Ls = new JTable();
        this.zK = new JButton();
        this.Ll = new JLabel();
        this.Lm = new JLabel();
        this.uh = new JLabel();
        this.a_ = new JLabel();
        this.ur = new JLabel();
        this.us = new JLabel();
        this.Lo = new JLabel();
        this.Ln = new JLabel();
        this.Lp = new JLabel();
        this.Lq = new JLabel();
        this.Li = new JLabel();
        this.Lh = new JLabel();
        this.Lf = new JLabel();
        this.Le = new JLabel();
        this.Lg = new JLabel();
        this.Lk = new JLabel();
        this.Lj = new JLabel();
        this.ut = new JScrollPane();
        this.DG = new JTable();
        this.zO = new JLabel();
        this.Cg = new JLabel();
        this.zP = new JLabel();
        this.Dz = new JLabel();
        this.Dy = new JLabel();
        this.Fq = new JLabel();
        this.yu = new JLabel();
        this.Lb = new JButton();
        this.La = new JButton();
        this.HS = new JButton();
        this.Lc = new JButton();
        this.Ld = new JLabel();
        this.setBackground(new Color(12, 54, 77));
        this.setPreferredSize(new Dimension(1024, 735));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.add((Component)this.va, new components.RestricaoPosicaoLayout(19, 20, 300, 30));
        this.wi.setHorizontalScrollBarPolicy(31);
        this.add((Component)this.wi, new components.RestricaoPosicaoLayout(19, 60, 300, 585));
        this.zf.setViewportView(this.Lr);
        this.add((Component)this.zf, new components.RestricaoPosicaoLayout(330, 150, 230, 490));
        this.zg.setViewportView(this.Ls);
        this.add((Component)this.zg, new components.RestricaoPosicaoLayout(778, 150, 230, 490));
        this.zK.setText("Continuar >>");
        this.add((Component)this.zK, new components.RestricaoPosicaoLayout(870, 670, 140, 40));
        this.Ll.setForeground(new Color(255, 255, 255));
        this.Ll.setHorizontalAlignment(0);
        this.Ll.setText("");
        this.add((Component)this.Ll, new components.RestricaoPosicaoLayout(610, 70, 120, -1));
        this.Lm.setFont(new Font("Tahoma", 1, 24));
        this.Lm.setForeground(new Color(255, 255, 255));
        this.Lm.setHorizontalAlignment(0);
        this.Lm.setText("0 x 0");
        this.add((Component)this.Lm, new components.RestricaoPosicaoLayout(550, 30, 250, -1));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setHorizontalAlignment(0);
        this.uh.setText("finaliza\u00e7\u00f5es");
        this.add((Component)this.uh, new components.RestricaoPosicaoLayout(610, 542, 110, -1));
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setHorizontalAlignment(0);
        this.a_.setText("erros passes");
        this.add((Component)this.a_, new components.RestricaoPosicaoLayout(620, 620, 90, -1));
        this.ur.setForeground(new Color(255, 255, 255));
        this.ur.setHorizontalAlignment(0);
        this.ur.setText("posse de bola");
        this.add((Component)this.ur, new components.RestricaoPosicaoLayout(620, 514, 90, -1));
        this.us.setForeground(new Color(255, 255, 255));
        this.us.setHorizontalAlignment(0);
        this.us.setText("no gol (fora)");
        this.add((Component)this.us, new components.RestricaoPosicaoLayout(610, 568, 100, -1));
        this.Lo.setForeground(new Color(255, 255, 255));
        this.Lo.setText("58%");
        this.Lo.setToolTipText("");
        this.add((Component)this.Lo, new components.RestricaoPosicaoLayout(722, 514, 30, -1));
        this.Ln.setForeground(new Color(255, 255, 255));
        this.Ln.setHorizontalAlignment(0);
        this.Ln.setText("58%");
        this.Ln.setToolTipText("");
        this.add((Component)this.Ln, new components.RestricaoPosicaoLayout(580, 513, -1, -1));
        this.Lp.setForeground(new Color(255, 255, 255));
        this.Lp.setHorizontalAlignment(0);
        this.Lp.setText("12");
        this.Lp.setToolTipText("");
        this.add((Component)this.Lp, new components.RestricaoPosicaoLayout(580, 542, 20, -1));
        this.Lq.setForeground(new Color(255, 255, 255));
        this.Lq.setHorizontalAlignment(0);
        this.Lq.setText("12");
        this.Lq.setToolTipText("");
        this.add((Component)this.Lq, new components.RestricaoPosicaoLayout(722, 542, 30, -1));
        this.Li.setForeground(new Color(255, 255, 255));
        this.Li.setHorizontalAlignment(0);
        this.Li.setText("12(10)");
        this.Li.setToolTipText("");
        this.add((Component)this.Li, new components.RestricaoPosicaoLayout(720, 568, -1, -1));
        this.Lh.setForeground(new Color(255, 255, 255));
        this.Lh.setText("12(10)");
        this.Lh.setToolTipText("");
        this.add((Component)this.Lh, new components.RestricaoPosicaoLayout(576, 568, -1, -1));
        this.Lf.setForeground(new Color(255, 255, 255));
        this.Lf.setHorizontalAlignment(0);
        this.Lf.setText("1");
        this.Lf.setToolTipText("");
        this.add((Component)this.Lf, new components.RestricaoPosicaoLayout(720, 596, 30, -1));
        this.Le.setForeground(new Color(255, 255, 255));
        this.Le.setHorizontalAlignment(0);
        this.Le.setText("2");
        this.Le.setToolTipText("");
        this.add((Component)this.Le, new components.RestricaoPosicaoLayout(580, 596, 20, -1));
        this.Lg.setForeground(new Color(255, 255, 255));
        this.Lg.setHorizontalAlignment(0);
        this.Lg.setText("desarmes");
        this.add((Component)this.Lg, new components.RestricaoPosicaoLayout(610, 596, 110, -1));
        this.Lk.setForeground(new Color(255, 255, 255));
        this.Lk.setHorizontalAlignment(0);
        this.Lk.setText("12");
        this.Lk.setToolTipText("");
        this.add((Component)this.Lk, new components.RestricaoPosicaoLayout(722, 620, 30, -1));
        this.Lj.setForeground(new Color(255, 255, 255));
        this.Lj.setHorizontalAlignment(0);
        this.Lj.setText("12");
        this.Lj.setToolTipText("");
        this.add((Component)this.Lj, new components.RestricaoPosicaoLayout(580, 620, 20, -1));
        this.ut.setBorder(null);
        this.ut.setViewportView(this.DG);
        this.add((Component)this.ut, new components.RestricaoPosicaoLayout(570, 180, 196, 320));
        this.zO.setBackground(new Color(0, 51, 204));
        this.zO.setFont(new Font("Tahoma", 1, 14));
        this.zO.setForeground(new Color(255, 255, 255));
        this.zO.setHorizontalAlignment(4);
        this.zO.setText("");
        this.zO.setOpaque(true);
        this.add((Component)this.zO, new components.RestricaoPosicaoLayout(330, 120, 230, 30));
        this.Cg.setForeground(new Color(255, 255, 255));
        this.Cg.setText("");
        this.add((Component)this.Cg, new components.RestricaoPosicaoLayout(620, 120, 130, -1));
        this.zP.setBackground(new Color(153, 0, 0));
        this.zP.setFont(new Font("Tahoma", 1, 14));
        this.zP.setForeground(new Color(255, 255, 255));
        this.zP.setHorizontalAlignment(2);
        this.zP.setText("");
        this.zP.setOpaque(true);
        this.add((Component)this.zP, new components.RestricaoPosicaoLayout(778, 120, 230, 30));
        this.Dz.setForeground(new Color(255, 255, 255));
        this.Dz.setText("");
        this.add((Component)this.Dz, new components.RestricaoPosicaoLayout(690, 150, 60, -1));
        this.Dy.setForeground(new Color(255, 255, 255));
        this.Dy.setText("120 236");
        this.add((Component)this.Dy, new components.RestricaoPosicaoLayout(620, 150, 50, -1));
        this.Fq.setHorizontalAlignment(4);
        this.add((Component)this.Fq, new components.RestricaoPosicaoLayout(450, 20, 60, 60));
        this.add((Component)this.yu, new components.RestricaoPosicaoLayout(830, 20, 60, 60));
        this.Lb.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconfire.png")));
        this.add((Component)this.Lb, new components.RestricaoPosicaoLayout(210, 670, 50, 40));
        this.La.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconsetup.png")));
        this.add((Component)this.La, new components.RestricaoPosicaoLayout(30, 670, 50, 40));
        this.HS.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon04.png")));
        this.add((Component)this.HS, new components.RestricaoPosicaoLayout(90, 670, 50, 40));
        this.Lc.setIcon(new ImageIcon(this.getClass().getResource("/aicons/player_shirt_green.png")));
        this.add((Component)this.Lc, new components.RestricaoPosicaoLayout(150, 670, 50, 40));
        this.Ld.setHorizontalAlignment(4);
        this.Ld.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/results04.png")));
        this.Ld.setMaximumSize(new Dimension(60, 60));
        this.Ld.setMinimumSize(new Dimension(60, 60));
        this.Ld.setPreferredSize(new Dimension(60, 60));
        this.add((Component)this.Ld, new components.RestricaoPosicaoLayout(0, 0, 1024, 750));
    }

    static /* synthetic */ Timer ph() {
        return Dk;
    }

    static /* synthetic */ void a(PainelPartidaAoVivo2 hk_02) {
        hk_02.nx();
    }

    static /* synthetic */ JComboBox b(PainelPartidaAoVivo2 hk_02) {
        return hk_02.va;
    }

    static /* synthetic */ void a(PainelPartidaAoVivo2 hk_02, int n2) {
        hk_02.cC(n2);
    }

    static /* synthetic */ void c(PainelPartidaAoVivo2 hk_02) {
        hk_02.qV();
    }

    static /* synthetic */ JButton d(PainelPartidaAoVivo2 hk_02) {
        return hk_02.La;
    }

    static /* synthetic */ JButton e(PainelPartidaAoVivo2 hk_02) {
        return hk_02.Lc;
    }

    static /* synthetic */ LigaNacional f(PainelPartidaAoVivo2 hk_02) {
        return hk_02.KR;
    }
}

