package nucleo;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.afQ;
import static motor.GerenciadorJogo.vM;

import telas.PainelFimTemporada;
import nucleo.ObraEstadioPendente;
import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.ItemSelecaoPais;
import nucleo.LigaNacional;
import nucleo.Calendario;
import nucleo.ProcessadorFimTemporada;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.RegistroTransferenciaJogador;
import nucleo.Competicao;
import nucleo.ComparadorCampeonato;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import nucleo.IniciadorCarreira;
import nucleo.AgrupadorCompeticoesRodada;
import nucleo.GerenciadorTelas;
import nucleo.CarregadorConfigEstadual;
import components.ProcessoLeilaoJogador;
import components.ModeloRegistroJogador;
import components.ModeloOfertaJogador;
import configuracao.InfoArquivoSalvoType;
import competicoes.CompeticaoSulAmericana;
import competicoes.CompeticaoTorneioAmistoso;
import competicoes.CompeticaoLigaDasNacoesUefa;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCopaAfrica;
import competicoes.CompeticaoCopaAmerica;
import competicoes.CompeticaoRecopaEuropeia;
import competicoes.CompeticaoCopaAsia;
import competicoes.CompeticaoRecopaSulAmericana;
import competicoes.CompeticaoCopaOceania;
import competicoes.CompeticaoCopaOuro;
import competicoes.CompeticaoEliminatoriasAfrica;
import competicoes.CompeticaoEliminatoriasRepescagem;
import competicoes.CompeticaoConferenceLeague;
import competicoes.CompeticaoEliminatoriasConcacaf;
import competicoes.CompeticaoFinalissima;
import competicoes.CompeticaoEliminatoriasOceania;
import competicoes.CompeticaoLigaDasNacoesConcacaf;
import competicoes.CompeticaoCampeonatoEstadual;
import competicoes.CompeticaoEurocopa;
import competicoes.CompeticaoCopaDoMundo;
import competicoes.CompeticaoLibertadores;
import competicoes.CompeticaoLigaAfricana;
import competicoes.CompeticaoLigaAsiatica;
import competicoes.CompeticaoChampionsLeague;
import competicoes.CompeticaoLigaEuropa;
import competicoes.CompeticaoLigaOceania;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;

public class EstadoCarreira
implements Serializable {
    private static final long serialVersionUID = 1L;
    private InfoArquivoSalvoType ad = new InfoArquivoSalvoType();
    private int ae = 1;
    private int rM = 2026;
    private int af = 1;
    private ArrayList ag = new ArrayList();
    private ArrayList ah = new ArrayList();
    private ArrayList ai = new ArrayList();
    private ArrayList aj = new ArrayList();
    private ArrayList ak = new ArrayList();
    private ArrayList al = new ArrayList();
    private ArrayList am = new ArrayList();
    private ArrayList an = null;
    private ArrayList ao = new ArrayList();
    private ArrayList ap = new ArrayList();
    private ArrayList aq = new ArrayList();
    private ArrayList ar = new ArrayList();
    private ArrayList as = new ArrayList();
    private ArrayList at = new ArrayList();
    private ArrayList au = new ArrayList();
    private ArrayList av = new ArrayList();
    private ArrayList aw = new ArrayList();
    private ArrayList ax = new ArrayList();
    private ArrayList ay = new ArrayList();
    private ArrayList az = new ArrayList();
    private competicoes.CompeticaoMundialDeClubes aA = null;
    private CompeticaoChampionsLeague aB = null;
    private CompeticaoLibertadores aC = null;
    private CompeticaoLigaAfricana aD = null;
    private CompeticaoLigaAsiatica aE = null;
    private competicoes.CompeticaoLigaConcacaf aF = null;
    private CompeticaoLigaOceania aG = null;
    private competicoes.CompeticaoAmistoso aH = new competicoes.CompeticaoAmistoso();
    private CompeticaoTorneioAmistoso Gy = new CompeticaoTorneioAmistoso();
    private CompeticaoRecopaSulAmericana aI = null;
    private CompeticaoRecopaEuropeia aJ = null;
    private CompeticaoCopaDoMundo aK = null;
    private CompeticaoLigaDasNacoesUefa GC = null;
    private CompeticaoLigaDasNacoesConcacaf GI = null;
    private CompeticaoFinalissima IX = null;
    private CompeticaoEliminatoriasOceania aL = null;
    private competicoes.CompeticaoEliminatoriasEurocopa aM = null;
    private CompeticaoEliminatoriasAfrica aN = null;
    private CompeticaoEliminatoriasRepescagem aO = null;
    private competicoes.CompeticaoRepescagemIntercontinental aP = null;
    private CompeticaoEliminatoriasConcacaf aQ = null;
    private CompeticaoCopaAmerica aR = null;
    private CompeticaoEurocopa aS = null;
    private CompeticaoCopaAfrica aT = null;
    private CompeticaoCopaAsia aU = null;
    private CompeticaoCopaOuro aV = null;
    private CompeticaoCopaOceania aW = null;
    private CompeticaoLigaEuropa aX = null;
    private CompeticaoConferenceLeague IY = null;
    private CompeticaoSulAmericana aY = null;
    private competicoes.CompeticaoCopasRegionais[] aZ = new competicoes.CompeticaoCopasRegionais[4];
    private boolean[] jogaRegionaisTodos;
    private boolean jogaRegionais;
    private boolean jogaEstadual;
    private boolean usaGrupoPadraoEstadual;
    private boolean jogaIntClubes;
    private boolean ba;
    private boolean bb;
    private boolean salarioMensal;
    private boolean habilidadeIndividual;
    private boolean jogaIntano1;
    private boolean gruposIntPadrao;
    private boolean jogaSelecoesAll;
    private boolean[] verJint;
    private boolean bc;
    private boolean bd;
    private int be;
    private int bf;
    private int bg;
    private int bh;
    private int autoSalvar;
    private int velocidade;
    private int velocidadeNH;
    private int verDecisaoPenNaoHumano;
    private int verMudancaTecnicos;
    private int verJanelaSubs;
    private int avisoTerminoContrato;
    private boolean ignoraEstadual;
    private boolean autoRenovaContrato;
    private boolean usaCorPlacar;
    private int corPlacar;
    private boolean usaSons;
    private boolean negritoCasa;
    private boolean usaCoresLista;
    private transient Color[] coresLista;
    private boolean verEstaduaisAgrupados;
    private boolean ignoraLigas;
    private boolean bi;
    private boolean verLeiloes;
    private String bj;
    public boolean bk;
    private int bl;
    private int bm;
    private int bn;
    private int IZ;
    private int bo;
    private int bp;
    private int bq;
    private int br;
    private int Ja;
    private int Jb;
    public boolean bs;
    private int bt;
    private ArrayList bu;
    private static transient ModeloTime X = null;
    private static transient ModeloPartida bv = null;
    private transient ArrayList bw;
    public transient ArrayList bx;
    public transient ArrayList by;
    public transient ArrayList bz;
    public transient ArrayList bA;
    public transient ArrayList bB;
    public transient ArrayList bC;
    public transient int[] bD;
    public transient int[] bE;
    public transient ArrayList bF;
    public transient ArrayList bG;
    public transient boolean bH;
    public transient boolean bI;
    public transient int bJ;
    public transient boolean bK;
    public transient boolean bL;
    public transient boolean bM;
    public transient boolean bN;
    public transient boolean Jc;
    public static Comparator bO = new ComparadorCampeonato();
    private String[] bP;

    public EstadoCarreira() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        this.jogaRegionaisTodos = blArray;
        this.jogaRegionais = true;
        this.jogaEstadual = true;
        this.usaGrupoPadraoEstadual = true;
        this.jogaIntClubes = true;
        this.ba = false;
        this.bb = false;
        this.salarioMensal = true;
        this.habilidadeIndividual = true;
        this.jogaIntano1 = true;
        this.gruposIntPadrao = true;
        this.jogaSelecoesAll = true;
        boolean[] blArray2 = new boolean[21];
        blArray2[0] = true;
        blArray2[1] = true;
        blArray2[6] = true;
        blArray2[7] = true;
        blArray2[8] = true;
        blArray2[9] = true;
        blArray2[10] = true;
        blArray2[11] = true;
        blArray2[12] = true;
        blArray2[13] = true;
        blArray2[14] = true;
        blArray2[16] = true;
        blArray2[17] = true;
        blArray2[18] = true;
        blArray2[19] = true;
        blArray2[20] = true;
        this.verJint = blArray2;
        this.bc = false;
        this.bd = true;
        this.be = -1;
        this.bf = -1;
        this.bg = -1;
        this.bh = 0;
        this.autoSalvar = 0;
        this.velocidade = 3;
        this.velocidadeNH = 4;
        this.verDecisaoPenNaoHumano = 0;
        this.verMudancaTecnicos = 1;
        this.verJanelaSubs = 1;
        this.avisoTerminoContrato = 0;
        this.ignoraEstadual = true;
        this.autoRenovaContrato = true;
        this.usaCorPlacar = true;
        this.corPlacar = 0;
        this.usaSons = true;
        this.negritoCasa = true;
        this.usaCoresLista = true;
        this.coresLista = null;
        this.verEstaduaisAgrupados = false;
        this.ignoraLigas = true;
        this.bi = false;
        this.verLeiloes = false;
        this.bj = null;
        this.bk = false;
        this.bl = 1;
        this.bm = 3;
        this.bn = 3;
        this.IZ = 4;
        this.bo = 2;
        this.bp = 2;
        this.bq = 4;
        this.br = 2;
        this.Ja = 2;
        this.Jb = 1;
        this.bs = true;
        this.bt = -1;
        this.bu = new ArrayList();
        this.bw = new ArrayList();
        this.bx = null;
        this.by = null;
        this.bz = null;
        this.bA = null;
        this.bB = null;
        this.bH = false;
        this.bI = false;
        this.bJ = 0;
        this.bK = false;
        this.bL = false;
        this.bM = false;
        this.bN = false;
        this.Jc = false;
        this.bP = new String[]{"#949449", "#B3B364", "#C0C081", "#D1D1A3", "#DEDE9E"};
        if (vM() != null) {
            this.setVerJint(vM().getVerJint());
            this.setJogaIntano1(vM().isJogaIntano1());
            this.setGruposIntPadrao(vM().isGruposIntPadrao());
            this.setJogaIntClubes(vM().isJogaIntClubes());
            this.setJogaSelecoesAll(vM().isJogaSelecoesAll());
            this.setJogaEstadual(vM().isJogaEstadual());
            this.setJogaRegionais(vM().isJogaRegionais());
            this.setSalarioMensal(vM().isSalarioMensal());
            this.setHabilidadeIndividual(vM().isHabilidadeIndividual());
            this.setIgnoraEstadual(vM().isIgnoraEstadual());
            this.setUsaGrupoPadraoEstadual(vM().isUsaGrupoPadraoEstadual());
            this.setAutoSalvar(vM().getAutoSalvar());
            this.setVelocidade(vM().getVelocidade());
            this.setVelocidadeNH(vM().getVelocidadeNH());
            this.setVerDecisaoPenNaoHumano(vM().getVerDecisaoPenNaoHumano());
            this.setVerMudancaTecnicos(vM().getVerMudancaTecnicos());
            this.setVerJanelaSubs(vM().getVerJanelaSubs());
            this.setAvisoTerminoContrato(vM().getAvisoTerminoContrato());
            this.setIgnoraLigas(vM().isIgnoraLigas());
            this.setAutoRenovaContrato(vM().isAutoRenovaContrato());
            this.setUsaCorPlacar(vM().isUsaCorPlacar());
            this.setCorPlacar(vM().getCorPlacar());
            this.setUsaSons(vM().isUsaSons());
            this.setUsaCoresLista(vM().isUsaCoresLista());
            this.setCoresLista(vM().getCoresLista());
            this.setNegritoCasa(vM().isNegritoCasa());
            this.setVerEstaduaisAgrupados(vM().isVerEstaduaisAgrupados());
            this.setUsarGruposReaisCopa(vM().isUsarGruposReaisCopa());
            this.setJogaRegionaisTodos(vM().getJogaRegionaisTodos());
            this.setVerLeiloes(vM().isVerLeiloes());
        }
        this.G();
    }

    public void G() {
        this.bx = new ArrayList();
        this.by = new ArrayList();
        this.bz = new ArrayList();
        this.bA = new ArrayList();
        this.bB = new ArrayList();
    }

    public int H() {
        return this.ae;
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public void I() {
        ++this.ae;
    }

    public int J() {
        return this.af;
    }

    public void l(int n2) {
        this.af = n2;
    }

    public ArrayList L() {
        return this.al;
    }

    public void a(ArrayList arrayList) {
        this.al = arrayList;
    }

    public ArrayList M() {
        return this.am;
    }

    public void b(ArrayList arrayList) {
        this.am = arrayList;
    }

    public ArrayList N() {
        return this.ao;
    }

    public void a(LigaNacional z2) {
        this.ao.add(z2);
    }

    public ArrayList O() {
        return this.ag;
    }

    public void c(ArrayList arrayList) {
        this.ag = arrayList;
    }

    public ArrayList P() {
        return this.aj;
    }

    public void d(ArrayList arrayList) {
        this.aj = arrayList;
    }

    public void c(ModeloTime ah2) {
        this.aj.add(ah2);
    }

    public void b(ModeloJogador f2) {
        this.ag.add(f2);
    }

    public void c(ModeloJogador f2) {
        this.ah.add(f2);
    }

    public void a(Calendario a2) {
        this.as.add(a2);
    }

    public ArrayList Q() {
        return this.ah;
    }

    public void e(ArrayList arrayList) {
        this.ah = arrayList;
    }

    public void a(Campeonato al2) {
        this.al.add(al2);
    }

    public void b(Campeonato al2) {
        this.am.add(al2);
    }

    public ArrayList R() {
        return this.as;
    }

    public ArrayList S() {
        return ((Calendario)this.as.get(this.af)).h();
    }

    public ArrayList m(int n2) {
        if (n2 < this.as.size()) {
            return ((Calendario)this.as.get(n2)).h();
        }
        return null;
    }

    public String T() {
        return ((Calendario)this.as.get(this.af)).f();
    }

    private static boolean U() {
        return true;
    }

    public void V() {
        if (!this.bk) {
            this.ap();
        } else {
            this.aa();
        }
    }

    public int iU() {
        return SR.op() - 1;
    }

    private void W() {
        ArrayList<RegistroTransferenciaJogador> arrayList = new ArrayList<RegistroTransferenciaJogador>();
        int n2 = 0;
        while (n2 < SR.bo().size()) {
            if (((RegistroTransferenciaJogador)SR.bo().get(n2)).getY() + 10 < this.iU()) {
                arrayList.add((RegistroTransferenciaJogador)SR.bo().get(n2));
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            SR.bo().remove(arrayList.get(n2));
            ++n2;
        }
    }

    public boolean X() {
        return SR.isJogaRegionais();
    }

    private void Y() {
        LigaNacional z2 = null;
        int n2 = 0;
        while (n2 < SR.N().size()) {
            if (((LigaNacional)SR.N().get(n2)).jc() == 29) {
                z2 = (LigaNacional)SR.N().get(n2);
            }
            ++n2;
        }
        if (z2 != null) {
            z2.y(true);
        }
    }

    private void Z() {
        if (this.ar == null || this.ar.size() == 0) {
            int n2 = 0;
            while (n2 < SR.N().size()) {
                ModeloTime ah2 = null;
                ModeloTime ah3 = null;
                ah2 = ((LigaNacional)SR.N().get(n2)).jq().cv(SR.H() - 1);
                ModeloTime[] ahArray = ((LigaNacional)SR.N().get(n2)).bk(SR.H() - 1);
                if (ahArray != null) {
                    ah3 = ah2 != ahArray[0] ? ahArray[0] : ahArray[1];
                }
                competicoes.CompeticaoSupercopa i2 = new competicoes.CompeticaoSupercopa(((LigaNacional)SR.N().get(n2)).jc());
                SR.ar.add(i2);
                i2.Ab();
                ++n2;
            }
        } else {
            int n3 = 0;
            while (n3 < SR.bW().size()) {
                ((competicoes.CompeticaoSupercopa)SR.bW().get(n3)).Ab();
                ((competicoes.CompeticaoSupercopa)SR.bW().get(n3)).mw();
                ++n3;
            }
        }
    }

    private void aa() {
        int n2 = 0;
        while (n2 < SR.aN().size()) {
            ((ModeloTime)SR.aN().get(n2)).kI();
            ++n2;
        }
        if (this.jogaIntClubes) {
            this.ai();
        }
        if (this.jogaSelecoesAll) {
            this.jw();
        }
        this.ah();
        this.ag();
        this.iZ();
        if (this.jogaIntClubes) {
            this.ae();
        }
        this.Y();
        this.Z();
        this.am();
        this.ak();
        if (SR.jogaRegionais) {
            this.aj();
        }
        if ((SR.bk() || SR.X()) && (n2 = Calendario.e(1)) > 0) {
            Calendario.b(n2, 4, 1);
        }
        Calendario.q();
        this.af();
        if (SR.H() >= 5) {
            this.W();
        }
        afQ.zi();
        afQ.zj();
        nucleo.ProcessadorFimTemporada.jO();
        nucleo.ProcessadorFimTemporada.jQ();
        if (SR.isJogaSelecoesAll()) {
            this.ac();
        }
        SR.yn().xZ();
        this.yn().clear();
        n2 = 0;
        if (this.bs && !SR.bD()) {
            int n3 = 0;
            while (n3 < SR.M().size()) {
                if (((Campeonato)SR.M().get(n3)).fg() != null) {
                    n2 = 1;
                    break;
                }
                ++n3;
            }
            if (n2 != 0) {
                PainelFimTemporada.pl();
            }
        }
        if (SR.yL()) {
            this.iY();
        }
        this.bk = false;
        if (n2 != 0) {
            PainelFimTemporada.AC();
        } else {
            SR.az();
            this.V();
        }
    }

    public void iX() {
        int n2 = -1;
        n2 = JOptionPane.showConfirmDialog(null, "Deseja criar um torneio Amistoso de in\u00edcio de temporada? ", "Torneio Amistoso", 0);
        if (n2 == 0) {
            GerenciadorTelas.aY(10);
        } else {
            this.bk = false;
            this.V();
        }
    }

    private void iY() {
        String string = "Torneio Amistoso";
        String string2 = "Juazeiro";
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 <= 7) {
            arrayList.add((ModeloTime)SR.P().get(n2));
            ++n2;
        }
        if (SR.yn() != null) {
            SR.yn().a(arrayList, 0, string, string2, false);
        }
    }

    public void a(String string) {
        ModeloTime ah2 = null;
        ModeloJogador f2 = null;
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.O().size()) {
            n2 = 0;
            f2 = (ModeloJogador)SR.O().get(n3);
            int n4 = 0;
            while (n4 < SR.P().size()) {
                ah2 = (ModeloTime)SR.P().get(n4);
                int n5 = 0;
                while (n5 < ah2.kc().size()) {
                    if (((ModeloJogador)ah2.kc().get(n5)).equals(f2)) {
                        ++n2;
                    }
                    ++n5;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public void b(String string) {
        Object var2_2 = null;
        ModeloJogador f2 = null;
        boolean bl = false;
        int n2 = 0;
        while (n2 < SR.O().size()) {
            bl = false;
            f2 = (ModeloJogador)SR.O().get(n2);
            int n3 = 0;
            while (n3 < SR.P().size()) {
                Collections.frequency(((ModeloTime)SR.P().get(n3)).kc(), f2);
                ++n3;
            }
            ++n2;
        }
    }

    public void ab() {
        CompeticaoEliminatoriasOceania n2 = new CompeticaoEliminatoriasOceania();
        this.a(n2);
        competicoes.CompeticaoEliminatoriasEurocopa l_02 = new competicoes.CompeticaoEliminatoriasEurocopa();
        this.a(l_02);
        CompeticaoEliminatoriasAfrica i_02 = new CompeticaoEliminatoriasAfrica();
        this.a(i_02);
        CompeticaoEliminatoriasConcacaf k2 = new CompeticaoEliminatoriasConcacaf();
        this.a(k2);
        CompeticaoEliminatoriasRepescagem j2 = new CompeticaoEliminatoriasRepescagem();
        this.a(j2);
        competicoes.CompeticaoRepescagemIntercontinental m_02 = new competicoes.CompeticaoRepescagemIntercontinental();
        this.a(m_02);
        CompeticaoCopaOceania g2 = new CompeticaoCopaOceania();
        this.a(g2);
        CompeticaoCopaOuro h_02 = new CompeticaoCopaOuro();
        this.a(h_02);
        CompeticaoCopaAsia e2 = new CompeticaoCopaAsia();
        this.a(e2);
        CompeticaoCopaAfrica c2 = new CompeticaoCopaAfrica();
        this.a(c2);
        CompeticaoCopaAmerica d2 = new CompeticaoCopaAmerica();
        this.a(d2);
        CompeticaoEurocopa p2 = new CompeticaoEurocopa();
        this.a(p2);
        CompeticaoCopaDoMundo q2 = new CompeticaoCopaDoMundo();
        this.a(q2);
        CompeticaoFinalissima k_02 = new CompeticaoFinalissima();
        this.a(k_02);
        CompeticaoLigaDasNacoesUefa m2 = new CompeticaoLigaDasNacoesUefa();
        this.a(m2);
        CompeticaoLigaDasNacoesConcacaf n_02 = new CompeticaoLigaDasNacoesConcacaf();
        this.a(n_02);
        n2.setNome(GerenciadorIdioma.getString("eliAS"));
        l_02.setNome(GerenciadorIdioma.getString("eliEU"));
        i_02.setNome(GerenciadorIdioma.getString("eliAfr"));
        j2.setNome(GerenciadorIdioma.getString("eliAsia"));
        k2.setNome(GerenciadorIdioma.getString("eliConcacaf"));
        m_02.setNome(GerenciadorIdioma.getString("eliOce"));
        p2.setNome(GerenciadorIdioma.getString("cro"));
        d2.setNome(GerenciadorIdioma.getString("cam"));
        q2.setNome(GerenciadorIdioma.getString("ncm"));
        c2.setNome(GerenciadorIdioma.getString("nCAfr"));
        e2.setNome(GerenciadorIdioma.getString("nCAsi"));
        h_02.setNome(GerenciadorIdioma.getString("nCOuro"));
        g2.setNome(GerenciadorIdioma.getString("nCopaOFC"));
        k_02.setNome("Final\u00edssima");
        m2.setNome("Liga Na\u00e7\u00f5es Europa");
        n_02.setNome("Liga Na\u00e7\u00f5es Concacaf");
    }

    public void ac() {
        Competicao at2;
        SR.ad();
        if (this.aK != null) {
            this.aK.xZ();
            this.aK.mw();
        }
        if (this.aS != null) {
            this.aS.xZ();
            this.aS.mw();
        }
        if (this.aR != null) {
            this.aR.xZ();
            this.aR.mw();
        }
        if (this.aT != null) {
            this.aT.xZ();
            this.aT.mw();
        }
        if (this.aU != null) {
            this.aU.xZ();
            this.aU.mw();
        }
        if (this.aV != null) {
            this.aV.xZ();
            this.aV.mw();
        }
        if (this.aW != null) {
            this.aW.xZ();
            this.aW.mw();
        }
        if (this.IX != null) {
            this.IX.mw();
        }
        if (this.GC != null) {
            this.GC.mw();
            this.GC.xZ();
        }
        if (this.GI != null) {
            this.GI.mw();
            this.GI.xZ();
        }
        if (this.aL != null) {
            this.aL.xZ();
        }
        if (this.aM != null) {
            this.aM.xZ();
        }
        if (this.aN != null) {
            this.aN.xZ();
        }
        if (this.aQ != null) {
            this.aQ.xZ();
        }
        if (this.aO != null) {
            this.aO.xZ();
        }
        if (this.aP != null) {
            this.aP.xZ();
        }
        if (this.aL != null) {
            this.aL.mw();
        }
        if (this.aM != null) {
            this.aM.mw();
        }
        if (this.aN != null) {
            this.aN.mw();
        }
        if (this.aQ != null) {
            this.aQ.mw();
        }
        if (this.aO != null) {
            this.aO.mw();
        }
        if (this.aP != null) {
            this.aP.mw();
        }
        if (this.bl == this.ae) {
            if (this.aK != null) {
                this.aK.ya();
            } else {
                at2 = new CompeticaoCopaDoMundo();
                this.a((CompeticaoCopaDoMundo)at2);
                this.aK.ya();
            }
            this.bl += 4;
        }
        if (this.bm - 1 == this.ae) {
            if (this.aM != null) {
                this.aM.fF(0);
            } else {
                at2 = new competicoes.CompeticaoEliminatoriasEurocopa();
                this.a((competicoes.CompeticaoEliminatoriasEurocopa)at2);
                at2.setNome(GerenciadorIdioma.getString("eliEU"));
                this.aM.fF(0);
            }
        }
        if (this.bl - 1 == this.ae) {
            if (this.aL != null) {
                this.aL.ya();
            } else {
                at2 = new CompeticaoEliminatoriasOceania();
                this.a((CompeticaoEliminatoriasOceania)at2);
                at2.setNome(GerenciadorIdioma.getString("eliAS"));
                this.aL.ya();
            }
            if (this.aM != null) {
                this.aM.fF(7);
            } else {
                at2 = new competicoes.CompeticaoEliminatoriasEurocopa();
                this.a((competicoes.CompeticaoEliminatoriasEurocopa)at2);
                at2.setNome(GerenciadorIdioma.getString("eliEU"));
                this.aM.fF(7);
            }
            if (this.aN != null) {
                this.aN.Bj();
            } else {
                at2 = new CompeticaoEliminatoriasAfrica();
                this.a((CompeticaoEliminatoriasAfrica)at2);
                at2.setNome(GerenciadorIdioma.getString("eliAfr"));
                this.aN.Bj();
            }
            if (this.aQ != null) {
                this.aQ.Bj();
            } else {
                at2 = new CompeticaoEliminatoriasConcacaf();
                this.a((CompeticaoEliminatoriasConcacaf)at2);
                at2.setNome(GerenciadorIdioma.getString("eliConcacaf"));
                this.aQ.Bj();
            }
            if (this.aO != null) {
                this.aO.Bj();
            } else {
                at2 = new CompeticaoEliminatoriasRepescagem();
                this.a((CompeticaoEliminatoriasRepescagem)at2);
                at2.setNome(GerenciadorIdioma.getString("eliAsia"));
                this.aO.Bj();
            }
            if (this.aP != null) {
                this.aP.Bj();
            } else {
                at2 = new competicoes.CompeticaoRepescagemIntercontinental();
                this.a((competicoes.CompeticaoRepescagemIntercontinental)at2);
                at2.setNome(GerenciadorIdioma.getString("eliOce"));
                this.aP.Bj();
            }
        }
        if (this.bm == this.ae) {
            if (this.aS != null) {
                this.aS.ya();
            } else {
                at2 = new CompeticaoEurocopa();
                this.a((CompeticaoEurocopa)at2);
                at2.setNome(GerenciadorIdioma.getString("cro"));
                this.aS.ya();
            }
            this.bm += 4;
        } else if (this.aS != null) {
            this.aS.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.bn == this.ae) {
            if (this.aR != null) {
                this.aR.ya();
            } else {
                at2 = new CompeticaoCopaAmerica();
                this.a((CompeticaoCopaAmerica)at2);
                at2.setNome(GerenciadorIdioma.getString("cam"));
                this.aR.ya();
            }
            this.bn = this.ae == 1 ? (this.bn += 4) : (this.bn += 4);
        } else if (this.aR != null) {
            this.aR.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.bo == this.ae) {
            if (this.aT != null) {
                this.aT.ya();
            } else {
                this.a(new CompeticaoCopaAfrica());
                this.aT.ya();
            }
            this.bo += 4;
        } else if (this.aT != null) {
            this.aT.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.bp == this.ae) {
            if (this.aU != null) {
                this.aU.ya();
            } else {
                this.a(new CompeticaoCopaAsia());
                this.aU.ya();
            }
            this.bp += 4;
        } else if (this.aU != null) {
            this.aU.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.br == this.ae) {
            if (this.aV != null) {
                this.aV.ya();
            } else {
                this.a(new CompeticaoCopaOuro());
                this.aV.ya();
            }
            this.br += 2;
        } else if (this.aV != null) {
            this.aV.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.bq == this.ae) {
            if (this.aW != null) {
                this.aW.ya();
            } else {
                this.a(new CompeticaoCopaOceania());
                this.aW.ya();
            }
            this.bq += 4;
        } else if (this.aW != null) {
            this.aW.p((competicoes.LigaPontosCorridos)null);
        }
        if (this.IZ == this.ae) {
            if (this.IX != null) {
                this.IX.Bs();
            }
            this.IZ += 4;
        }
        if (this.Ja == this.ae) {
            if (this.GC != null) {
                this.GC.Ar();
            }
            this.Ja += 2;
        }
        if (this.Jb == this.ae) {
            if (this.GI != null) {
                this.GI.Ar();
            }
            this.Jb += 2;
        }
    }

    public void ad() {
        int n2 = 0;
        while (n2 < this.ap.size()) {
            ((LigaNacional)this.ap.get(n2)).jm();
            ((LigaNacional)this.ap.get(n2)).jj();
            ++n2;
        }
    }

    public void ae() {
        Competicao at2;
        int n2 = 0;
        while (n2 < SR.aG().size()) {
            ((LigaNacional)SR.aG().get(n2)).jy();
            ++n2;
        }
        this.aP().yq();
        this.aF().yq();
        this.aI().yq();
        this.aO().yq();
        this.aL().yq();
        this.aQ().yq();
        this.aH().yq();
        this.aK().yq();
        this.mj().yq();
        this.aH().mw();
        this.aF().mw();
        this.aI().mw();
        this.aO().mw();
        this.aL().mw();
        this.aQ().mw();
        this.aP().mw();
        this.aH().mw();
        this.aK().mw();
        this.mj().mw();
        this.aR().mw();
        if (SR.aW() != null) {
            this.aW().mw();
        }
        if (SR.aV() != null) {
            this.aV().mw();
        }
        if (this.aY() != null) {
            this.aY().mw();
        }
        if (this.ba() != null) {
            this.ba().mw();
        }
        if (this.aZ() != null) {
            this.aZ().mw();
        }
        if (this.aT != null) {
            this.aT.xZ();
            this.aT.mw();
        }
        if (this.aU != null) {
            this.aU.xZ();
            this.aU.mw();
        }
        if (this.aV != null) {
            this.aV.xZ();
            this.aV.mw();
        }
        if (this.aW != null) {
            this.aW.xZ();
            this.aW.mw();
        }
        if ((n2 = Calendario.d(4)) > 0) {
            Calendario.b(n2, 1, 0);
        }
        if (SR.aV() != null) {
            SR.aV().zR();
        } else {
            at2 = new CompeticaoRecopaSulAmericana();
            SR.a((CompeticaoRecopaSulAmericana)at2);
            ((CompeticaoRecopaSulAmericana)at2).zR();
        }
        if (SR.aW() != null) {
            SR.aW().zR();
        } else {
            at2 = new CompeticaoRecopaEuropeia();
            SR.a((CompeticaoRecopaEuropeia)at2);
            ((CompeticaoRecopaEuropeia)at2).zR();
        }
        if (SR.aV() != null) {
            SR.aV().mw();
        }
        if (SR.aW() != null) {
            SR.aW().mw();
        }
    }

    public void c(String string) {
        Object var2_2 = null;
        ModeloJogador f2 = null;
        boolean bl = false;
        int n2 = 0;
        while (n2 < SR.Q().size()) {
            bl = false;
            f2 = (ModeloJogador)SR.Q().get(n2);
            int n3 = 0;
            while (n3 < SR.P().size()) {
                Collections.frequency(((ModeloTime)SR.P().get(n3)).ky(), f2);
                ++n3;
            }
            ++n2;
        }
    }

    private void af() {
        this.by.clear();
        this.bz.clear();
        this.bA.clear();
        this.bB.clear();
        int n2 = 0;
        while (n2 < this.ai.size()) {
            ((ModeloJogador)this.ai.get(n2)).gc();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ag.size()) {
            ((ModeloJogador)this.O().get(n2)).gd();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.bz.size()) {
            this.ag.remove(this.bz.get(n2));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.by.size()) {
            this.ag.add((ModeloJogador)this.by.get(n2));
            ++n2;
        }
        this.by.clear();
        this.bz.clear();
        n2 = 0;
        while (n2 < this.ah.size()) {
            ((ModeloJogador)this.Q().get(n2)).gf();
            ++n2;
        }
        this.c(true);
        n2 = 0;
        while (n2 < this.bB.size()) {
            this.ah.remove(this.bB.get(n2));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.bA.size()) {
            if (!this.ah.contains(this.bA.get(n2))) {
                this.ah.add((ModeloJogador)this.bA.get(n2));
            }
            ++n2;
        }
        this.bA.clear();
        this.bB.clear();
        n2 = 0;
        while (n2 < SR.O().size()) {
            ((ModeloJogador)SR.O().get(n2)).fK();
            ((ModeloJogador)SR.O().get(n2)).fJ();
            ++n2;
        }
    }

    public void c(boolean bl) {
        int n2 = 0;
        if (!bl) {
            int[] nArray = new int[6];
            nArray[1] = 1;
            nArray[2] = 2;
            nArray[3] = 3;
            nArray[4] = 3;
            nArray[5] = 4;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[5];
            nArray3[1] = 1;
            nArray3[2] = 2;
            nArray3[3] = 3;
            nArray3[4] = 4;
            int[] nArray4 = nArray3;
            int n3 = 0;
            while (n3 < this.aj.size()) {
                int n4;
                if (((ModeloTime)this.aj.get(n3)).kn().booleanValue() && ((ModeloTime)this.aj.get(n3)).getReputacao() >= 3) {
                    if (((ModeloTime)this.aj.get(n3)).kx() < 12) {
                        n4 = 0;
                        while (n4 < nArray2.length) {
                            ModeloJogador.a((ModeloTime)this.aj.get(n3), nArray2[n4], null, 0, null, bl);
                            ++n4;
                        }
                    }
                } else if (((ModeloTime)this.aj.get(n3)).kx() < 5) {
                    n4 = 0;
                    while (n4 < nArray4.length) {
                        ModeloJogador.a((ModeloTime)this.aj.get(n3), nArray4[n4], null, 0, null, bl);
                        ++n4;
                    }
                }
                ++n3;
            }
        } else {
            int n5 = 0;
            while (n5 < this.aj.size()) {
                if (((ModeloTime)this.aj.get(n5)).kx() < 15) {
                    if (((ModeloTime)this.aj.get(n5)).kn().booleanValue()) {
                        n2 = 2 + new Random().nextInt(3);
                    } else {
                        n2 = new Random().nextInt(3);
                        if (((ModeloTime)this.aj.get(n5)).getNivel() >= 20) {
                            ++n2;
                        }
                    }
                    if (n2 + ((ModeloTime)this.aj.get(n5)).kx() >= 20) {
                        n2 = 20 - ((ModeloTime)this.aj.get(n5)).kx() - 2;
                    }
                    if (n2 > 0) {
                        int n6 = 0;
                        while (n6 <= n2) {
                            ModeloJogador.a((ModeloTime)this.aj.get(n5), -1, null, 0, null, bl);
                            ++n6;
                        }
                    }
                }
                ++n5;
            }
        }
    }

    private void iZ() {
        int n2 = 0;
        while (n2 < this.al.size()) {
            ((Campeonato)this.al.get(n2)).kk();
            ++n2;
        }
    }

    private void ag() {
        int n2 = 0;
        while (n2 < this.aj.size()) {
            ((ModeloTime)this.aj.get(n2)).km().clear();
            ((ModeloTime)this.aj.get(n2)).kk();
            if (!((ModeloTime)this.aj.get(n2)).jZ().booleanValue()) {
                ((ModeloTime)this.aj.get(n2)).kp();
                ((ModeloTime)this.aj.get(n2)).kA();
                ((ModeloTime)this.aj.get(n2)).kz();
            }
            if (((ModeloTime)this.aj.get(n2)).ka() != null) {
                ((ModeloTime)this.aj.get(n2)).ka().cj(50);
                ((ModeloTime)this.aj.get(n2)).ka().ck(50);
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < SR.aN().size()) {
            ((ModeloTime)SR.aN().get(n2)).kG();
            ++n2;
        }
    }

    private void ah() {
        this.I();
        int n2 = 0;
        while (n2 < this.as.size()) {
            ((Calendario)this.as.get(n2)).clear();
            ++n2;
        }
        this.as.clear();
        this.r(SR.op() + (this.ae - 1));
        Calendario.g();
    }

    private void ai() {
        ModeloTime ah2;
        if (SR.aK() != null && SR.aI() != null) {
            ah2 = SR.aK().cS();
            SR.aI().T(ah2);
            SR.aK().N(ah2);
        }
        if (SR.aF() != null && SR.aH() != null) {
            ah2 = SR.aH().cS();
            SR.aF().O(ah2);
            SR.aH().N(ah2);
        }
        if (SR.aK() != null && SR.mj() != null) {
            ah2 = SR.mj().cS();
            SR.aK().ab(ah2);
        }
    }

    private void jw() {
        ModeloTime ah2;
        if (this.IX != null && this.aS != null && (ah2 = this.aS.cS()) != null) {
            this.IX.Z(ah2);
        }
        if (this.IX != null && this.aR != null && (ah2 = this.aR.cS()) != null) {
            this.IX.aa(ah2);
        }
    }

    private void aj() {
        ArrayList arrayList = new ArrayList();
        arrayList = IniciadorCarreira.di();
        int n2 = 0;
        while (n2 < this.aZ.length) {
            if (this.aZ[n2] != null) {
                this.aZ[n2].am(arrayList);
            }
            ++n2;
        }
    }

    private void ak() {
        int n2 = 0;
        while (n2 < SR.aE().size()) {
            ((CarregadorConfigEstadual)SR.aE().get(n2)).ee();
            ++n2;
        }
        n2 = 0;
        while (n2 < SR.aE().size()) {
            int n3 = 0;
            while (n3 < ((CarregadorConfigEstadual)SR.aE().get(n2)).eb().size()) {
                ((CompeticaoCampeonatoEstadual)((CarregadorConfigEstadual)SR.aE().get(n2)).eb().get(n3)).yi().aN(false);
                ++n3;
            }
            ++n2;
        }
    }

    public void al() {
        int n2;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((LigaNacional)SR.N().get(n3)).eb().size()) {
                ((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(n2)).fi(n2);
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.O().size()) {
            ((ModeloJogador)SR.O().get(n3)).ay(0);
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(0)).zM().size()) {
                ((ModeloJogador)((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(0)).zM().get(n2)).fd();
                ++n2;
            }
            ++n3;
        }
    }

    private void am() {
        int n2;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            ((LigaNacional)SR.N().get(n3)).ee();
            ((LigaNacional)SR.N().get(n3)).jq().mw();
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((LigaNacional)SR.N().get(n3)).eb().size()) {
                ((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(n2)).yi().aN(false);
                ((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(n2)).aT(false);
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 1;
            if (((LigaNacional)SR.N().get(n3)).jc() == 29 && SR.bk()) {
                n2 = 0;
            } else if (((LigaNacional)SR.N().get(n3)).jc() == 29 && SR.X()) {
                n2 = 0;
            }
            if (n2 != 0) {
                int n4;
                ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
                int n5 = 0;
                while (n5 < ((LigaNacional)SR.N().get(n3)).eb().size()) {
                    n4 = 0;
                    while (n4 < ((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(n5)).yi().yK().size()) {
                        arrayList.add((ModeloTime)((CompeticaoLigaNacional)((LigaNacional)SR.N().get(n3)).eb().get(n5)).yi().yK().get(n4));
                        ++n4;
                    }
                    ++n5;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(((LigaNacional)SR.N().get(n3)).jg());
                Collections.sort(arrayList2, ColecaoComparadoresSorteio.cN);
                n4 = 0;
                while (n4 < arrayList2.size()) {
                    if (!arrayList.contains(arrayList2.get(n4))) {
                        arrayList.add((ModeloTime)arrayList2.get(n4));
                    }
                    ++n4;
                }
                ((LigaNacional)SR.N().get(n3)).a(arrayList, false, "atualizaLigasNacionais");
            } else if (((LigaNacional)SR.N().get(n3)).jc() == 29) {
                ((LigaNacional)SR.N().get(n3)).a((competicoes.CompeticaoCopaNacional)null);
            }
            ++n3;
        }
    }

    public static void an() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((Calendario)SR.R().get(SR.af)).j();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (arrayList.get(n2) instanceof competicoes.LigaPontosCorridos && ((FaseCompeticao)arrayList.get(n2)).b() == 1 && ((competicoes.LigaPontosCorridos)arrayList.get(n2)).vl() != null) {
                ((competicoes.LigaPontosCorridos)arrayList.get(n2)).vl().a((competicoes.LigaPontosCorridos)arrayList.get(n2));
            }
            ++n2;
        }
    }

    public int ao() {
        if (((Calendario)SR.R().get(SR.J())).t().size() > 0) {
            return ((Competicao)((Calendario)SR.R().get(SR.J())).t().get(0)).b();
        }
        return -1;
    }

    public void ap() {
        this.bH = false;
        if (SR.bD() && SR.H() == 10) {
            SR.h(false);
        }
        if (EstadoCarreira.ay()) {
            if (this.bs) {
                GerenciadorTelas.aY(2);
                if (!this.bL) {
                    if (SR.autoSalvar == 1) {
                        if (this.bJ >= 3) {
                            try {
                                GerenciadorTelas.iF().ru();
                            }
                            catch (IOException iOException) {
                                iOException.printStackTrace();
                            }
                            this.bJ = 0;
                        } else {
                            ++this.bJ;
                        }
                    } else if (SR.autoSalvar == 2) {
                        try {
                            GerenciadorTelas.iF().ru();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    } else if (SR.autoSalvar == 3 && this.bF()) {
                        this.bM = false;
                        try {
                            GerenciadorTelas.iF().ru();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                }
                if (!this.bL && !GerenciadorTelas.iF().rB()) {
                    if (new Random().nextInt(100) == 1) {
                        GerenciadorTelas.iF().ac(false);
                    } else if (new Random().nextInt(2) == 1) {
                        GerenciadorTelas.iF().ac(true);
                    }
                }
            }
        } else {
            if (SR.isIgnoraLigas() && this.ao() == 1 && !AgrupadorCompeticoesRodada.dG() && !this.bI) {
                this.bH = true;
            }
            if (this.bI) {
                this.bI = false;
            }
            if (SR.isIgnoraEstadual() && this.ao() == 3) {
                if (!AgrupadorCompeticoesRodada.J(3)) {
                    this.bH = true;
                }
            } else if (SR.isIgnoraEstadual() && this.ao() == 10 && !AgrupadorCompeticoesRodada.J(10)) {
                this.bH = true;
            }
            if (!this.bH && this.ao() == 10 && this.aq() && !AgrupadorCompeticoesRodada.dH()) {
                this.bH = true;
            } else if (!this.bH && this.ao() == 10 && !this.ar() && vM().getRegionaisSemHumanos() == 0) {
                this.bH = true;
            }
            nucleo.ModeloTime.kh();
            ModeloPartida.he();
            if (this.bs && !this.bH && AgrupadorCompeticoesRodada.dw()) {
                AgrupadorCompeticoesRodada.dx();
            } else {
                this.at();
            }
        }
        if (this.bL) {
            this.bL = false;
        }
    }

    private boolean aq() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.aZ.length) {
            if (SR.aZ[n3] != null) {
                ++n2;
            }
            ++n3;
        }
        return n2 < 4 && n2 > 0;
    }

    private boolean ar() {
        int n2 = 0;
        while (n2 < SR.M().size()) {
            ModeloTime ah2;
            if (SR.M().get(n2) != null && (ah2 = ((Campeonato)SR.M().get(n2)).fg()) != null) {
                int n3 = 0;
                while (n3 < SR.aZ.length) {
                    if (SR.aZ[n3] != null && SR.aZ[n3].yd() != null && SR.aZ[n3].yd().yK() != null && SR.aZ[n3].yd().yK().contains(ah2)) {
                        return true;
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        return false;
    }

    public void as() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((Calendario)SR.R().get(SR.J())).h();
        int n2 = ((Calendario)SR.R().get(SR.J())).b();
        int n3 = 0;
        while (n3 < arrayList.size()) {
            ((ModeloPartida)arrayList.get(n3)).a(true);
            ((ModeloPartida)arrayList.get(n3)).hg();
            ((ModeloPartida)arrayList.get(n3)).hi();
            ((ModeloPartida)arrayList.get(n3)).hf();
            ((ModeloPartida)arrayList.get(n3)).hh();
            ((ModeloPartida)arrayList.get(n3)).hc().I(false);
            ((ModeloPartida)arrayList.get(n3)).hd().I(false);
            ((ModeloPartida)arrayList.get(n3)).a(null);
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.O().size()) {
            ((ModeloJogador)SR.O().get(n3)).fr();
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.Q().size()) {
            ((ModeloJogador)SR.Q().get(n3)).ai(100);
            ++n3;
        }
        if (n2 == 7 || n2 == 9) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                ModeloTime ah2 = ((LigaNacional)SR.aG().get(n3)).jn();
                if (ah2 != null) {
                    int n4 = 0;
                    while (n4 < ah2.kc().size()) {
                        if (((ModeloJogador)ah2.kc().get(n4)).fg() == null) {
                            ((ModeloJogador)ah2.kc().get(n4)).fr();
                        }
                        ++n4;
                    }
                }
                ++n3;
            }
        }
        Collections.sort(SR.L(), bO);
    }

    public void at() {
        this.as();
        EstadoCarreira.an();
        this.aM();
        this.aC();
        this.aB();
        this.q(0);
        if (this.bs && !this.bH) {
            GerenciadorTelas.aY(5);
        } else {
            this.ax();
        }
    }

    private void au() {
        int n2;
        ArrayList<ModeloOfertaJogador> arrayList = new ArrayList<ModeloOfertaJogador>();
        if (this.av != null && SR.av.size() > 0) {
            n2 = 0;
            while (n2 < SR.av.size()) {
                if (((ModeloOfertaJogador)this.av.get(n2)).tM()) {
                    boolean bl = false;
                    Campeonato al2 = null;
                    if (((ModeloOfertaJogador)this.av.get(n2)).x().fg() != null && ((ModeloOfertaJogador)this.av.get(n2)).x().fg().jZ().booleanValue()) {
                        bl = true;
                        al2 = ((ModeloOfertaJogador)this.av.get(n2)).x().fg().ka();
                    }
                    if (((ModeloOfertaJogador)this.av.get(n2)).tN()) {
                        arrayList.add((ModeloOfertaJogador)SR.av.get(n2));
                        if (((ModeloOfertaJogador)this.av.get(n2)).tP() != null && ((ModeloOfertaJogador)this.av.get(n2)).tP().jZ().booleanValue()) {
                            new ModeloRegistroJogador(((ModeloOfertaJogador)this.av.get(n2)).tP().ka(), 29, 83, "", ((ModeloOfertaJogador)this.av.get(n2)).x().getNome());
                        } else if (bl) {
                            new ModeloRegistroJogador(al2, 29, 84, "", ((ModeloOfertaJogador)this.av.get(n2)).x().getNome());
                        }
                    } else if (((ModeloOfertaJogador)this.av.get(n2)).tP() != null && ((ModeloOfertaJogador)this.av.get(n2)).tP().jZ().booleanValue() && !((ModeloOfertaJogador)this.av.get(n2)).tQ()) {
                        new ModeloRegistroJogador(((ModeloOfertaJogador)this.av.get(n2)).tP().ka(), 28, 82, "", ((ModeloOfertaJogador)this.av.get(n2)).x().getNome());
                        ((ModeloOfertaJogador)this.av.get(n2)).au(true);
                    }
                }
                ++n2;
            }
        }
        if (arrayList.size() > 0) {
            n2 = 0;
            while (n2 < arrayList.size()) {
                SR.av.remove(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void d(ModeloJogador f2) {
        int n2 = -1;
        if (this.av != null && SR.av.size() > 0) {
            int n3 = 0;
            while (n3 < SR.av.size()) {
                if (((ModeloOfertaJogador)SR.av.get(n3)).x() == f2) {
                    n2 = n3;
                    break;
                }
                ++n3;
            }
        }
        if (n2 >= 0) {
            SR.av.remove(n2);
        }
    }

    private void av() {
        int n2 = 0;
        while (n2 < SR.aN().size()) {
            int n3 = 0;
            while (n3 < ((ModeloTime)SR.aN().get(n2)).kc().size()) {
                if (((ModeloJogador)((ModeloTime)SR.aN().get(n2)).kc().get(n3)).ft().booleanValue()) {
                    new ProcessoLeilaoJogador((ModeloJogador)((ModeloTime)SR.aN().get(n2)).kc().get(n3), ((ModeloJogador)((ModeloTime)SR.aN().get(n2)).kc().get(n3)).fl(), true, true);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private void aw() {
        int n2;
        ArrayList<ObraEstadioPendente> arrayList = new ArrayList<ObraEstadioPendente>();
        if (this.aw != null && SR.aw.size() > 0) {
            n2 = 0;
            while (n2 < SR.aw.size()) {
                if (((ObraEstadioPendente)SR.aw.get(n2)).ew().before(SR.bb())) {
                    ((ObraEstadioPendente)SR.aw.get(n2)).ex();
                    arrayList.add((ObraEstadioPendente)SR.aw.get(n2));
                }
                ++n2;
            }
        }
        if (arrayList.size() > 0) {
            n2 = 0;
            while (n2 < arrayList.size()) {
                SR.aw.remove(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void ax() {
        int n2 = ((Calendario)SR.R().get(SR.J())).i();
        if (n2 == 1 || n2 == 3) {
            this.n(n2);
        }
        int n3 = this.az();
        if (this.av != null && SR.av.size() > 0) {
            this.au();
        }
        if (new Random().nextInt(100) > 50) {
            this.av();
        }
        if (this.aw != null && SR.aw.size() > 0) {
            this.aw();
        }
        this.q(1);
        if (n3 == 0) {
            this.bk = true;
        }
        if (this.bs) {
            if (this.bk) {
                afQ.zw();
                this.al();
                GerenciadorTelas.aY(6);
            } else {
                SR.ap();
            }
        } else if (this.bk) {
            this.al();
        }
    }

    private static boolean ay() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((Calendario)SR.R().get(SR.af)).h();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (((ModeloPartida)arrayList.get(n2)).hc().jZ().booleanValue() && !((ModeloPartida)arrayList.get(n2)).hc().kf()) {
                EstadoCarreira.a(((ModeloPartida)arrayList.get(n2)).hc(), (ModeloPartida)arrayList.get(n2));
                return true;
            }
            if (((ModeloPartida)arrayList.get(n2)).hd().jZ().booleanValue() && !((ModeloPartida)arrayList.get(n2)).hd().kf()) {
                EstadoCarreira.a(((ModeloPartida)arrayList.get(n2)).hd(), (ModeloPartida)arrayList.get(n2));
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static ModeloTime B() {
        return X;
    }

    public static void a(ModeloTime ah2, ModeloPartida i2) {
        X = ah2;
        bv = i2;
    }

    public int az() {
        int n2 = SR.af;
        while (n2 < SR.R().size()) {
            if (!((Calendario)SR.R().get(n2)).e() && ((Calendario)SR.R().get(n2)).b() > 0 && ((Calendario)SR.R().get(n2)).h().size() > 0) {
                SR.l(n2);
                return n2;
            }
            ++n2;
        }
        return 0;
    }

    private static void aA() {
    }

    private void aB() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((Calendario)this.as.get(this.af)).t();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((Competicao)arrayList.get(n2)).mx();
            ++n2;
        }
    }

    private void aC() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((Calendario)this.as.get(this.af)).j();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (arrayList.get(n2) instanceof competicoes.LigaPontosCorridos) {
                ((competicoes.LigaPontosCorridos)arrayList.get(n2)).pO();
            } else if (arrayList.get(n2) instanceof ChaveMataMata) {
                ((ChaveMataMata)arrayList.get(n2)).pO();
            }
            ++n2;
        }
    }

    private void n(int n2) {
        int n3;
        int n4 = 0;
        while (n4 < this.am.size()) {
            if (((Campeonato)this.am.get(n4)).jZ().booleanValue() && ((Campeonato)this.am.get(n4)).fg() == null) {
                ArrayList arrayList = afQ.b((Campeonato)this.am.get(n4), false);
                if (!SR.bD() && arrayList != null && arrayList.size() > 0) {
                    GerenciadorTelas.a(arrayList, (Campeonato)this.am.get(n4), 0);
                }
            }
            ++n4;
        }
        ArrayList arrayList = new ArrayList();
        if (n2 == 1) {
            n3 = 0;
            while (n3 < this.ao.size()) {
                ((LigaNacional)this.ao.get(n3)).A(arrayList);
                ++n3;
            }
        } else if (n2 == 3) {
            n3 = 0;
            while (n3 < this.aq.size()) {
                ((CarregadorConfigEstadual)this.aq.get(n3)).A(arrayList);
                ++n3;
            }
        }
        if (arrayList.size() > 0 && SR.bs && !SR.bD() && SR.getVerMudancaTecnicos() == 1) {
            GerenciadorTelas.K(arrayList);
        }
        n3 = 0;
    }

    public boolean isJogaEstadual() {
        return this.jogaEstadual;
    }

    public void setJogaEstadual(boolean bl) {
        this.jogaEstadual = bl;
    }

    public ArrayList aE() {
        return this.aq;
    }

    public CompeticaoLibertadores aF() {
        return this.aC;
    }

    public void a(CompeticaoLibertadores r2) {
        this.aC = r2;
    }

    public LigaNacional o(int n2) {
        int n3 = 0;
        while (n3 < this.ao.size()) {
            if (((LigaNacional)this.ao.get(n3)).jc() == n2) {
                return (LigaNacional)this.ao.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public CarregadorConfigEstadual p(int n2) {
        int n3 = 0;
        while (n3 < this.aq.size()) {
            if (((CarregadorConfigEstadual)this.aq.get(n3)).getEstado() == n2) {
                return (CarregadorConfigEstadual)this.aq.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public ArrayList aG() {
        return this.ap;
    }

    public CompeticaoSulAmericana aH() {
        return this.aY;
    }

    public void a(CompeticaoSulAmericana h3) {
        this.aY = h3;
    }

    public boolean isJogaIntClubes() {
        return this.jogaIntClubes;
    }

    public void setJogaIntClubes(boolean bl) {
        this.jogaIntClubes = bl;
    }

    public CompeticaoChampionsLeague aI() {
        return this.aB;
    }

    public void a(CompeticaoChampionsLeague v2) {
        this.aB = v2;
    }

    public boolean aJ() {
        return this.bb;
    }

    public void d(boolean bl) {
        this.bb = bl;
    }

    public CompeticaoLigaEuropa aK() {
        return this.aX;
    }

    public void a(CompeticaoLigaEuropa x2) {
        this.aX = x2;
    }

    public CompeticaoLigaAsiatica aL() {
        return this.aE;
    }

    public void a(CompeticaoLigaAsiatica u2) {
        this.aE = u2;
    }

    public void aM() {
        int n2 = 0;
        while (n2 <= this.af) {
            ((Calendario)this.as.get(n2)).a(true);
            ++n2;
        }
    }

    public void q(int n2) {
        if (n2 == 0) {
            int n3 = 0;
            while (n3 <= this.af) {
                if (((Calendario)this.as.get(n3)).r().size() > 0) {
                    ((Calendario)this.as.get(n3)).f(0);
                }
                ++n3;
            }
        } else {
            int n4 = 0;
            while (n4 <= this.af) {
                if (((Calendario)this.as.get(n4)).s().size() > 0) {
                    ((Calendario)this.as.get(n4)).f(1);
                }
                ++n4;
            }
        }
    }

    public ArrayList aN() {
        return this.ak;
    }

    public void d(ModeloTime ah2) {
        this.ak.add(ah2);
    }

    public CompeticaoLigaAfricana aO() {
        return this.aD;
    }

    public void a(CompeticaoLigaAfricana t2) {
        this.aD = t2;
    }

    public competicoes.CompeticaoLigaConcacaf aP() {
        return this.aF;
    }

    public CompeticaoLigaOceania aQ() {
        return this.aG;
    }

    public void a(CompeticaoLigaOceania y2) {
        this.aG = y2;
    }

    public void a(competicoes.CompeticaoLigaConcacaf w2) {
        this.aF = w2;
    }

    public competicoes.CompeticaoMundialDeClubes aR() {
        if (this.aA == null && SR.isJogaIntClubes()) {
            this.aA = new competicoes.CompeticaoMundialDeClubes();
        }
        return this.aA;
    }

    public void a(competicoes.CompeticaoMundialDeClubes a_02) {
        this.aA = a_02;
    }

    public void r(int n2) {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        calendar.set(n2, 0, 1, 0, 0, 0);
        while (calendar.get(1) == n2) {
            Calendario a2 = new Calendario();
            a2.a(calendar.get(1), calendar.get(2), calendar.get(5));
            SR.a(a2);
            if (calendar.get(2) == 0 && calendar.get(7) == 1 && ++n3 == 1) {
                n4 = n5;
                SR.l(n5);
            }
            ++n5;
            calendar.add(5, 1);
        }
        this.aS();
    }

    private void aS() {
        ArrayList arrayList = Calendario.d();
        ArrayList arrayList2 = Calendario.c(1);
        ArrayList arrayList3 = this.salarioMensal ? arrayList : arrayList2;
        int n2 = 0;
        while (n2 < arrayList3.size()) {
            Calendario.b((Integer)arrayList3.get(n2), 2, 0);
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            Calendario.b((Integer)arrayList.get(n2), 5, 0);
            ++n2;
        }
        arrayList3 = arrayList2;
        n2 = 0;
        while (n2 < arrayList3.size()) {
            Calendario.b((Integer)arrayList3.get(n2), 3, 0);
            ++n2;
        }
    }

    public boolean isUsaGrupoPadraoEstadual() {
        return this.usaGrupoPadraoEstadual;
    }

    public void setUsaGrupoPadraoEstadual(boolean bl) {
        this.usaGrupoPadraoEstadual = bl;
    }

    public void aT() {
        int n2;
        if (SR.isHabilidadeIndividual() && SR.bO() == 3) {
            n2 = 0;
            while (n2 < this.aj.size()) {
                ((ModeloTime)this.aj.get(n2)).lj();
                ++n2;
            }
        }
        n2 = 0;
        while (n2 < this.ag.size()) {
            ((ModeloJogador)this.ag.get(n2)).fV();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ah.size()) {
            ((ModeloJogador)this.ah.get(n2)).fY();
            ++n2;
        }
        if (SR.isHabilidadeIndividual()) {
            if (SR.bO() == 3) {
                SR.A(0);
            } else {
                SR.bP();
            }
        }
    }

    public void aU() {
        int n2 = 0;
        while (n2 < this.O().size()) {
            ((ModeloJogador)this.O().get(n2)).fI();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.Q().size()) {
            ((ModeloJogador)this.Q().get(n2)).fI();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.aj.size()) {
            ((ModeloTime)this.aj.get(n2)).kp();
            ((ModeloTime)this.aj.get(n2)).kH();
            ++n2;
        }
    }

    public CompeticaoRecopaSulAmericana aV() {
        return this.aI;
    }

    public void a(CompeticaoRecopaSulAmericana e_02) {
        this.aI = e_02;
    }

    public CompeticaoRecopaEuropeia aW() {
        return this.aJ;
    }

    public void a(CompeticaoRecopaEuropeia d_02) {
        this.aJ = d_02;
    }

    public boolean isSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(boolean bl) {
        this.salarioMensal = bl;
    }

    public ArrayList aX() {
        if (this.bx == null) {
            this.bx = new ArrayList();
        }
        return this.bx;
    }

    public CompeticaoCopaDoMundo aY() {
        return this.aK;
    }

    public void a(CompeticaoCopaDoMundo q2) {
        this.aK = q2;
    }

    public CompeticaoCopaAmerica aZ() {
        return this.aR;
    }

    public void a(CompeticaoCopaAmerica d2) {
        this.aR = d2;
    }

    public CompeticaoEurocopa ba() {
        return this.aS;
    }

    public void a(CompeticaoEurocopa p2) {
        this.aS = p2;
    }

    public LigaNacional s(int n2) {
        int n3 = 0;
        while (n3 < this.ap.size()) {
            if (((LigaNacional)this.ap.get(n3)).jc() == n2) {
                return (LigaNacional)this.ap.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public Calendar bb() {
        return ((Calendario)this.as.get(this.af)).a();
    }

    public long bc() {
        return ((Calendario)this.as.get(this.af)).a().getTime().getTime();
    }

    public ArrayList bd() {
        return this.ax;
    }

    public CompeticaoCopaAfrica be() {
        return this.aT;
    }

    public void a(CompeticaoCopaAfrica c2) {
        this.aT = c2;
    }

    public CompeticaoCopaAsia bf() {
        return this.aU;
    }

    public void a(CompeticaoCopaAsia e2) {
        this.aU = e2;
    }

    public CompeticaoCopaOuro bg() {
        return this.aV;
    }

    public void a(CompeticaoCopaOuro h_02) {
        this.aV = h_02;
    }

    public Campeonato bh() {
        int n2 = 0;
        while (n2 < this.al.size()) {
            if (((Campeonato)this.al.get(n2)).fg() == null && !((Campeonato)this.al.get(n2)).jZ().booleanValue()) {
                return (Campeonato)this.al.get(n2);
            }
            ++n2;
        }
        return null;
    }

    public Campeonato a(ModeloTime ah2, int n2) {
        ArrayList<Campeonato> arrayList = new ArrayList<Campeonato>();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (n5 < this.al.size()) {
            if (n2 == -1) {
                n3 = 0;
                n4 = 5;
            } else if (n2 == 0) {
                n3 = ah2.getReputacao();
                n4 = ah2.getReputacao();
            } else if (n2 == 1) {
                n3 = ah2.getReputacao() - 1;
                n4 = ah2.getReputacao();
            } else if (n2 == 2) {
                n3 = ah2.getReputacao() - 2;
                n4 = ah2.getReputacao() + 1;
            }
            if (!(((Campeonato)this.al.get(n5)).fg() != null || ((Campeonato)this.al.get(n5)).jZ().booleanValue() || ((Campeonato)this.al.get(n5)).fg() == ah2 || ((Campeonato)this.al.get(n5)).bz() != ah2.getPais() && ((Campeonato)this.al.get(n5)).lE() != ah2.getPais() || ((Campeonato)this.al.get(n5)).getReputacao() < n3 || ((Campeonato)this.al.get(n5)).getReputacao() > n4)) {
                arrayList.add((Campeonato)this.al.get(n5));
            }
            ++n5;
        }
        if (arrayList.size() > 0) {
            n5 = new Random().nextInt(100);
            if (n5 < 50) {
                Collections.sort(arrayList, bO);
            } else {
                Collections.shuffle(arrayList);
            }
        }
        if (arrayList.size() > 0) {
            return (Campeonato)arrayList.get(0);
        }
        return null;
    }

    public void a(Campeonato al2, Campeonato al3) {
        ModeloTime ah2 = al2.fg();
        ModeloTime ah3 = al3.fg();
        al2.i(al3);
        al3.i(al2);
        al2.E(ah3);
        al3.E(ah2);
    }

    public void a(ModeloTime ah2, Campeonato al2, Campeonato al3) {
        if (al2 != null) {
            al2.i(al3);
        }
        if (al3 != null) {
            al3.E(ah2);
        }
    }

    public boolean t(int n2) {
        int n3 = 0;
        while (n3 < this.bF.size()) {
            if (((ItemSelecaoPais)this.bF.get(n3)).getPais() == n2 && ((ItemSelecaoPais)this.bF.get(n3)).iC()) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public void bi() {
        int n2 = 0;
        while (n2 < this.bF.size()) {
            ((ItemSelecaoPais)this.bF.get(n2)).v(true);
            ++n2;
        }
    }

    public boolean bj() {
        int n2 = 0;
        while (n2 < this.bF.size()) {
            if (((ItemSelecaoPais)this.bF.get(n2)).iC()) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public boolean isJogaIntano1() {
        return this.jogaIntano1;
    }

    public void setJogaIntano1(boolean bl) {
        this.jogaIntano1 = bl;
    }

    public boolean isGruposIntPadrao() {
        return this.gruposIntPadrao;
    }

    public void setGruposIntPadrao(boolean bl) {
        this.gruposIntPadrao = bl;
    }

    public boolean[] getVerJint() {
        return this.verJint;
    }

    public void setVerJint(boolean[] blArray) {
        this.verJint = blArray;
    }

    public void setVerJint(boolean bl, int n2) {
        this.verJint[n2] = bl;
    }

    public boolean isJogaSelecoesAll() {
        return this.jogaSelecoesAll;
    }

    public void setJogaSelecoesAll(boolean bl) {
        this.jogaSelecoesAll = bl;
    }

    public boolean bk() {
        return this.bc;
    }

    public void e(boolean bl) {
        this.bc = bl;
    }

    public static ModeloPartida bl() {
        return bv;
    }

    public boolean bm() {
        return this.bd;
    }

    public void f(boolean bl) {
        this.bd = bl;
    }

    public boolean isNegritoCasa() {
        return this.negritoCasa;
    }

    public void setNegritoCasa(boolean bl) {
        this.negritoCasa = bl;
    }

    public ArrayList bn() {
        return this.at;
    }

    public ArrayList bo() {
        return this.au;
    }

    public int getAutoSalvar() {
        return this.autoSalvar;
    }

    public void setAutoSalvar(int n2) {
        this.autoSalvar = n2;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int n2) {
        this.velocidade = n2;
    }

    public int getVelocidadeNH() {
        return this.velocidadeNH;
    }

    public void setVelocidadeNH(int n2) {
        this.velocidadeNH = n2;
    }

    public int getAvisoTerminoContrato() {
        return this.avisoTerminoContrato;
    }

    public void setAvisoTerminoContrato(int n2) {
        this.avisoTerminoContrato = n2;
    }

    public int getVerDecisaoPenNaoHumano() {
        return this.verDecisaoPenNaoHumano;
    }

    public void setVerDecisaoPenNaoHumano(int n2) {
        this.verDecisaoPenNaoHumano = n2;
    }

    public int getVerMudancaTecnicos() {
        return this.verMudancaTecnicos;
    }

    public void setVerMudancaTecnicos(int n2) {
        this.verMudancaTecnicos = n2;
    }

    public int getVerJanelaSubs() {
        return this.verJanelaSubs;
    }

    public void setVerJanelaSubs(int n2) {
        this.verJanelaSubs = n2;
    }

    public boolean isAutoRenovaContrato() {
        return this.autoRenovaContrato;
    }

    public void setAutoRenovaContrato(boolean bl) {
        this.autoRenovaContrato = bl;
    }

    public boolean isUsaCorPlacar() {
        return this.usaCorPlacar;
    }

    public void setUsaCorPlacar(boolean bl) {
        this.usaCorPlacar = bl;
    }

    public int getCorPlacar() {
        return this.corPlacar;
    }

    public void setCorPlacar(int n2) {
        this.corPlacar = n2;
    }

    public boolean isUsaSons() {
        return this.usaSons;
    }

    public void setUsaSons(boolean bl) {
        this.usaSons = bl;
    }

    public boolean isUsaCoresLista() {
        return this.usaCoresLista;
    }

    public void setUsaCoresLista(boolean bl) {
        this.usaCoresLista = bl;
    }

    public boolean isVerEstaduaisAgrupados() {
        return this.verEstaduaisAgrupados;
    }

    public void setVerEstaduaisAgrupados(boolean bl) {
        this.verEstaduaisAgrupados = bl;
    }

    public String[] bp() {
        return this.bP;
    }

    public void bq() {
        int n2 = 0;
        while (n2 < this.bP.length) {
            this.bP[n2] = String.format("#%02x%02x%02x", this.coresLista[0].getRed(), this.coresLista[n2].getGreen(), this.coresLista[n2].getBlue());
            ++n2;
        }
    }

    public Color[] getCoresLista() {
        if (this.coresLista != null) {
            return this.coresLista;
        }
        this.coresLista = new Color[5];
        int n2 = 0;
        while (n2 < this.coresLista.length) {
            this.coresLista[n2] = new Color(Integer.valueOf(this.bP[n2].substring(1, 3), 16), Integer.valueOf(this.bP[n2].substring(3, 5), 16), Integer.valueOf(this.bP[n2].substring(5, 7), 16));
            ++n2;
        }
        return this.coresLista;
    }

    public void setCoresLista(Color[] colorArray) {
        this.coresLista = colorArray;
        this.bq();
    }

    public String br() {
        return this.bj;
    }

    public void d(String string) {
        this.bj = string;
    }

    public InfoArquivoSalvoType bs() {
        if (this.ad == null) {
            this.ad = new InfoArquivoSalvoType();
        }
        return this.ad;
    }

    public void a(InfoArquivoSalvoType infoArquivoSalvoType) {
        this.ad = infoArquivoSalvoType;
    }

    public ArrayList bt() {
        return this.av;
    }

    public ArrayList bu() {
        if (this.an == null) {
            this.an = new ArrayList();
        }
        return this.an;
    }

    public competicoes.CompeticaoAmistoso bv() {
        return this.aH;
    }

    public ArrayList bw() {
        if (this.aw == null) {
            this.aw = new ArrayList();
        }
        return this.aw;
    }

    public ArrayList bx() {
        return this.ay;
    }

    public int by() {
        return this.be;
    }

    public void u(int n2) {
        this.be = n2;
    }

    public int bz() {
        return this.bf;
    }

    public int bA() {
        int n2 = -1;
        if (SR.M().size() > 0) {
            Campeonato al2 = (Campeonato)SR.M().get(0);
            if (al2.fg() != null) {
                return al2.fg().getPais();
            }
            return al2.bz();
        }
        return n2;
    }

    public void v(int n2) {
        this.bf = n2;
    }

    public void setIgnoraLigas(boolean bl) {
        this.ignoraLigas = bl;
    }

    public boolean isIgnoraLigas() {
        return this.ignoraLigas;
    }

    public Competicao[] bB() {
        Competicao[] atArray = new Competicao[]{this.aK, this.aS, this.aR, this.aT, this.aU, this.aV, this.aW, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aX, this.aY, this.aI, this.aJ, this.IY};
        return atArray;
    }

    public boolean isIgnoraEstadual() {
        return this.ignoraEstadual;
    }

    public void setIgnoraEstadual(boolean bl) {
        this.ignoraEstadual = bl;
    }

    public boolean bC() {
        return this.bI;
    }

    public void g(boolean bl) {
        this.bI = bl;
    }

    public boolean bD() {
        return this.bK;
    }

    public void h(boolean bl) {
        this.bK = bl;
    }

    public boolean bE() {
        return this.bL;
    }

    public void i(boolean bl) {
        this.bL = bl;
    }

    public boolean bF() {
        return this.bM;
    }

    public void j(boolean bl) {
        this.bM = bl;
    }

    public void f(ArrayList arrayList) {
        this.ak = arrayList;
    }

    public ArrayList bG() {
        return this.bF;
    }

    public void g(ArrayList arrayList) {
        this.bF = arrayList;
    }

    public void h(ArrayList arrayList) {
        this.an = arrayList;
    }

    public void i(ArrayList arrayList) {
        this.ao = arrayList;
    }

    public void j(ArrayList arrayList) {
        this.ap = arrayList;
    }

    public void k(ArrayList arrayList) {
        this.aq = arrayList;
    }

    public void l(ArrayList arrayList) {
        this.av = arrayList;
    }

    public void m(ArrayList arrayList) {
        this.ax = arrayList;
    }

    public void n(ArrayList arrayList) {
        this.as = arrayList;
    }

    public void o(ArrayList arrayList) {
        this.at = arrayList;
    }

    public void p(ArrayList arrayList) {
        this.au = arrayList;
    }

    public void q(ArrayList arrayList) {
        this.aw = arrayList;
    }

    public void r(ArrayList arrayList) {
        this.ay = arrayList;
    }

    public int bH() {
        return this.bg;
    }

    public void bI() {
        ++this.bg;
    }

    public void w(int n2) {
        this.bg = n2;
    }

    public ModeloTime x(int n2) {
        ModeloTime ah2 = null;
        int n3 = 0;
        while (n3 < SR.P().size()) {
            if (((ModeloTime)SR.P().get(n3)).lk() == n2) {
                ah2 = (ModeloTime)SR.P().get(n3);
                return ah2;
            }
            ++n3;
        }
        if (ah2 == null) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                if (((LigaNacional)SR.aG().get(n3)).jn() != null && ((LigaNacional)SR.aG().get(n3)).jn().lk() == n2) {
                    ah2 = ((LigaNacional)SR.aG().get(n3)).jn();
                    return ah2;
                }
                ++n3;
            }
        }
        return ah2;
    }

    public Campeonato y(int n2) {
        Campeonato al2 = null;
        int n3 = 0;
        while (n3 < SR.L().size()) {
            if (((Campeonato)SR.L().get(n3)).lT() == n2) {
                al2 = (Campeonato)SR.L().get(n3);
                return al2;
            }
            ++n3;
        }
        return al2;
    }

    public static String z(int n2) {
        ModeloTime ah2 = null;
        int n3 = 0;
        while (n3 < SR.P().size()) {
            if (((ModeloTime)SR.P().get(n3)).lk() == n2) {
                ah2 = (ModeloTime)SR.P().get(n3);
                return ah2.getNome();
            }
            ++n3;
        }
        if (ah2 == null) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                if (((LigaNacional)SR.aG().get(n3)).jn() != null && ((LigaNacional)SR.aG().get(n3)).jn().lk() == n2) {
                    ah2 = ((LigaNacional)SR.aG().get(n3)).jn();
                    return ah2.getNome();
                }
                ++n3;
            }
        }
        return "";
    }

    public ArrayList bJ() {
        return this.az;
    }

    public void s(ArrayList arrayList) {
        this.az = arrayList;
    }

    public CompeticaoEliminatoriasOceania bK() {
        return this.aL;
    }

    public void a(CompeticaoEliminatoriasOceania n2) {
        this.aL = n2;
    }

    public competicoes.CompeticaoEliminatoriasEurocopa bL() {
        return this.aM;
    }

    public void a(competicoes.CompeticaoEliminatoriasEurocopa l_02) {
        this.aM = l_02;
    }

    public CompeticaoEliminatoriasAfrica bM() {
        return this.aN;
    }

    public void a(CompeticaoEliminatoriasAfrica i_02) {
        this.aN = i_02;
    }

    public ArrayList bN() {
        return this.ai;
    }

    public void t(ArrayList arrayList) {
        this.ai = arrayList;
    }

    public boolean isHabilidadeIndividual() {
        return this.habilidadeIndividual;
    }

    public void setHabilidadeIndividual(boolean bl) {
        this.habilidadeIndividual = bl;
    }

    public int bO() {
        return this.bh;
    }

    public void bP() {
        ++this.bh;
    }

    public void A(int n2) {
        this.bh = n2;
    }

    public boolean isUsarGruposReaisCopa() {
        return this.bi;
    }

    public void setUsarGruposReaisCopa(boolean bl) {
        this.bi = bl;
    }

    public CompeticaoEliminatoriasRepescagem bQ() {
        return this.aO;
    }

    public void a(CompeticaoEliminatoriasRepescagem j2) {
        this.aO = j2;
    }

    public CompeticaoEliminatoriasConcacaf bR() {
        return this.aQ;
    }

    public void a(CompeticaoEliminatoriasConcacaf k2) {
        this.aQ = k2;
    }

    public competicoes.CompeticaoRepescagemIntercontinental bS() {
        return this.aP;
    }

    public void a(competicoes.CompeticaoRepescagemIntercontinental m_02) {
        this.aP = m_02;
    }

    public boolean isJogaRegionais() {
        return this.jogaRegionais;
    }

    public void setJogaRegionais(boolean bl) {
        this.jogaRegionais = bl;
    }

    public int bT() {
        return this.bl;
    }

    public int bU() {
        ++this.bt;
        return this.bt;
    }

    public competicoes.CompeticaoCopasRegionais[] bV() {
        return this.aZ;
    }

    public void a(competicoes.CompeticaoCopasRegionais f2, int n2) {
        this.aZ[n2] = f2;
    }

    public boolean[] getJogaRegionaisTodos() {
        return this.jogaRegionaisTodos;
    }

    public void setJogaRegionaisTodos(boolean[] blArray) {
        this.jogaRegionaisTodos = blArray;
    }

    public ArrayList bW() {
        return this.ar;
    }

    public void u(ArrayList arrayList) {
        this.ar = arrayList;
    }

    public CompeticaoCopaOceania bX() {
        return this.aW;
    }

    public void a(CompeticaoCopaOceania g2) {
        this.aW = g2;
    }

    public ArrayList bY() {
        return this.bu;
    }

    public int bZ() {
        return this.bn;
    }

    public int ca() {
        return this.br;
    }

    public Competicao c(int n2, int n3) {
        Competicao[] atArray = new Competicao[]{this.aB, this.aC, this.aD, this.aE, this.aF, this.aG};
        Competicao[] atArray2 = new Competicao[]{this.aX, this.aY};
        Competicao[] atArray3 = new Competicao[]{this.IY};
        if (n2 == 4 && n3 < atArray.length) {
            return atArray[n3];
        }
        if (n2 == 6 && n3 < atArray2.length) {
            return atArray2[n3];
        }
        if (n2 == 12 && n3 < atArray3.length) {
            return atArray3[n3];
        }
        return null;
    }

    public void cb() {
        if (this.bw == null) {
            this.bw = new ArrayList();
        }
        int n2 = 0;
        while (n2 < this.aj.size()) {
            this.bw.add(((ModeloTime)this.aj.get(n2)).ev());
            ++n2;
        }
        Collections.sort(this.bw, ColecaoComparadoresSorteio.aaT);
    }

    public ArrayList cc() {
        return this.bw;
    }

    public ArrayList e(ModeloTime ah2) {
        ArrayList<ModeloOfertaJogador> arrayList = new ArrayList<ModeloOfertaJogador>();
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((ModeloOfertaJogador)this.av.get(n2)).x().fg() != null && ((ModeloOfertaJogador)this.av.get(n2)).x().fg() == ah2) {
                arrayList.add((ModeloOfertaJogador)this.av.get(n2));
            }
            ++n2;
        }
        return arrayList;
    }

    public ArrayList f(ModeloTime ah2) {
        ArrayList<ModeloOfertaJogador> arrayList = new ArrayList<ModeloOfertaJogador>();
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((ModeloOfertaJogador)this.av.get(n2)).tP() == ah2) {
                arrayList.add((ModeloOfertaJogador)this.av.get(n2));
            }
            ++n2;
        }
        return arrayList;
    }

    public ModeloOfertaJogador e(ModeloJogador f2) {
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((ModeloOfertaJogador)this.av.get(n2)).x() == f2) {
                return (ModeloOfertaJogador)this.av.get(n2);
            }
            ++n2;
        }
        return null;
    }

    public boolean isVerLeiloes() {
        return this.verLeiloes;
    }

    public void setVerLeiloes(boolean bl) {
        this.verLeiloes = bl;
    }

    public boolean cd() {
        int n2 = 0;
        while (n2 < this.ak.size()) {
            if (((ModeloTime)this.ak.get(n2)).ka() != null && ((ModeloTime)this.ak.get(n2)).kb() > 0L && ((ModeloTime)this.ak.get(n2)).kw() < 35) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public CompeticaoConferenceLeague mj() {
        return this.IY;
    }

    public void a(CompeticaoConferenceLeague j_02) {
        this.IY = j_02;
    }

    public int op() {
        return this.rM;
    }

    public void I(int n2) {
        this.rM = n2;
    }

    public void rU() {
        this.bl = 4;
        this.bm = 2;
        this.bn = 2;
        this.IZ = 3;
        this.bo = 1;
        this.bp = 1;
        this.bq = 3;
        this.br = 1;
        this.Ja = 1;
        this.Jb = 1;
    }

    public CompeticaoLigaDasNacoesUefa sq() {
        return this.GC;
    }

    public void a(CompeticaoLigaDasNacoesUefa m2) {
        this.GC = m2;
    }

    public CompeticaoFinalissima yl() {
        return this.IX;
    }

    public void a(CompeticaoFinalissima k_02) {
        this.IX = k_02;
    }

    public CompeticaoLigaDasNacoesConcacaf ym() {
        return this.GI;
    }

    public void a(CompeticaoLigaDasNacoesConcacaf n_02) {
        this.GI = n_02;
    }

    public CompeticaoTorneioAmistoso yn() {
        return this.Gy;
    }

    public void a(CompeticaoTorneioAmistoso l2) {
        this.Gy = l2;
    }

    public boolean yL() {
        return this.Jc;
    }

    public void aO(boolean bl) {
        this.Jc = bl;
    }

    public int ae(int n2, int n3) {
        int n4 = 0;
        if (n2 == 2) {
            n4 = 8;
        } else if (n2 == 3) {
            n4 = 9;
        } else if (n2 == 4) {
            n4 = n3;
        } else if (n2 == 6) {
            if (n3 == 0) {
                n4 = 6;
            } else if (n3 == 1) {
                n4 = 7;
            }
        } else if (n2 == 12) {
            n4 = 14;
        } else if (n2 == 10) {
            n4 = 10;
        } else if (n2 == 8) {
            n4 = 12;
        } else if (n2 == 11) {
            n4 = 13;
        } else if (n2 == 15) {
            n4 = 15;
        } else if (n2 == 7) {
            n4 = n3 == 7 ? 11 : 16;
        } else if (n2 == 9) {
            n4 = 17;
        } else if (n2 == 14) {
            n4 = 18;
        } else if (n2 == 5) {
            n4 = 19;
        } else if (n2 == 13) {
            n4 = 20;
        }
        return n4;
    }
}

