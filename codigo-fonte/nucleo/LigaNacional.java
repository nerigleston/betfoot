package nucleo;

import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.ComparadorJogadorForca;
import nucleo.ComparadorLigaNacional;
import nucleo.EnumPaises;
import nucleo.DadosPais;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.Competicao;
import nucleo.PartidaCompeticao;
import nucleo.UtilitariosGeracaoJogador;
import nucleo.Estadio;
import nucleo.CarregadorConfigEstadual;
import motor.GerenciadorJogo;
import configuracao.ConfigLigaType;
import configuracao.LoadLigaOptions;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCopaNacional;
import competicoes.LigaPontosCorridos;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class LigaNacional
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList ds = new ArrayList();
    private int pais;
    private ArrayList dt = new ArrayList();
    private int dw = 0;
    private CompeticaoCopaNacional hu;
    private boolean[] duasVoltasMataMata = new boolean[]{true, true, true, true, true, true, true};
    private ArrayList hv = new ArrayList();
    private ArrayList hw = new ArrayList();
    private ModeloTime hy = null;
    private boolean hz = false;
    private int hr = 0;
    private int hA = 12;
    private String hB = "";
    private boolean hC = false;
    private transient ArrayList hD = new ArrayList();
    private transient ArrayList hE = null;
    public static Comparator hF = new ComparadorJogadorForca();
    public static Comparator cN = new ComparadorLigaNacional();

    public LigaNacional() {
    }

    public LigaNacional(int n2) {
        this.hB = EnumPaises.valueOf("P" + n2).getNome();
        this.pais = n2;
        this.hr = new Random().nextInt(50000);
    }

    public void iT() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getPais() == this.pais) {
                this.hv.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
            }
            ++n2;
        }
    }

    public void K() {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            CompeticaoLigaNacional b_02 = null;
            if (n2 + 1 < this.ds.size()) {
                b_02 = (CompeticaoLigaNacional)this.ds.get(n2 + 1);
            }
            ((CompeticaoLigaNacional)this.ds.get(n2)).a(b_02);
            ++n2;
        }
    }

    public boolean fa(int n2) {
        return n2 >= this.ds.size();
    }

    public CompeticaoLigaNacional fo(int n2) {
        CompeticaoLigaNacional b_02 = null;
        if (n2 < this.ds.size()) {
            b_02 = (CompeticaoLigaNacional)this.ds.get(n2);
            return b_02;
        }
        return null;
    }

    public CompeticaoLigaNacional fp(int n2) {
        if (n2 > 1) {
            CompeticaoLigaNacional b_02 = null;
            int n3 = n2 - 2;
            if (n3 < this.ds.size()) {
                b_02 = (CompeticaoLigaNacional)this.ds.get(n3);
                return b_02;
            }
        }
        return null;
    }

    public void Ar() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(this.hv);
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((ModeloTime)arrayList.get(n2)).l(true);
            ++n2;
        }
        Collections.sort(arrayList, ColecaoComparadoresSorteio.cN);
        arrayList2.addAll(arrayList);
        ConfigLigaType configLigaType = null;
        LoadLigaOptions loadLigaOptions = null;
        boolean bl = false;
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n3 = 4;
        int n4 = 1;
        while (n4 <= n3) {
            bl = false;
            configLigaType = LigaNacional.t(this.pais, n4);
            loadLigaOptions = new LoadLigaOptions();
            arrayList3.clear();
            int n5 = 0;
            if (configLigaType == null) {
                bl = true;
            } else if (configLigaType.getnTimes() > arrayList.size()) {
                bl = true;
            }
            if (bl) {
                loadLigaOptions.nTimes = 20;
                n5 = 2;
                if (arrayList.size() >= 20) {
                    loadLigaOptions.nTimes = 20;
                    n5 = 4;
                } else if (arrayList.size() >= 18) {
                    loadLigaOptions.nTimes = 18;
                } else if (arrayList.size() >= 16) {
                    loadLigaOptions.nTimes = 16;
                } else if (arrayList.size() >= 14) {
                    loadLigaOptions.nTimes = 14;
                } else if (arrayList.size() >= 12) {
                    loadLigaOptions.nTimes = 12;
                } else if (arrayList.size() >= 10) {
                    loadLigaOptions.nTimes = 10;
                }
                loadLigaOptions.nomeLiga = DadosPais.br(this.pais);
            } else {
                loadLigaOptions.nTimes = configLigaType.getnTimes();
                loadLigaOptions.doisTurnos = configLigaType.isDoisTurnos();
                loadLigaOptions.nGrupos = configLigaType.getnGrupos();
                loadLigaOptions.jogosDentroGrupo = configLigaType.isJogosDentroGrupo();
                loadLigaOptions.numeroTimesMataMata = configLigaType.getNumeroTimesMataMata();
                n5 = configLigaType.getnRebaixados();
                loadLigaOptions.duasVoltasMataMata = configLigaType.getDuasVoltasMataMata();
                loadLigaOptions.desempateEstadual = configLigaType.getDesempate();
                loadLigaOptions.classificaPeloGeral = configLigaType.isClassificaPeloGeral();
                loadLigaOptions.melhoresTerceiros = configLigaType.isMelhoresTerceiros();
                loadLigaOptions.numeroTurnos = configLigaType.getFormula();
                if (loadLigaOptions.nTimes <= 10 && n5 > 2) {
                    n5 = 2;
                }
                loadLigaOptions.nomeLiga = configLigaType.getNome2() != null ? configLigaType.getNome2() : DadosPais.br(this.pais);
                loadLigaOptions.nomeDivisao = configLigaType.getNomeDivisao();
            }
            if (arrayList.size() >= loadLigaOptions.nTimes) {
                if (n4 == 4 && this.pais == 29 && GerenciadorJogo.SR.isJogaEstadual()) {
                    GerenciadorJogo.SR.e(true);
                } else {
                    int n6 = 0;
                    while (n6 < loadLigaOptions.nTimes) {
                        arrayList3.add((ModeloTime)arrayList.get(n6));
                        ++n6;
                    }
                }
                CompeticaoLigaNacional b_02 = new CompeticaoLigaNacional(this, this.ds.size() + 1);
                if (!bl) {
                    b_02.aS(configLigaType.isRebaixadoPeloGrupo());
                    b_02.setRebaixadosDireto(configLigaType.getRebaixadosDireto());
                    b_02.setVagasSobemPeloMataMata(configLigaType.getVagasSobemPeloMataMata());
                    b_02.a(configLigaType.getDuasVoltasplayoffReb());
                    b_02.b(configLigaType.getDuasVoltasMataMataSobe());
                    if (configLigaType.getVersaoArquivo() != 22 || configLigaType.getRebaixadosDireto() == 0 || configLigaType.getRebaixadosDireto() > n5) {
                        b_02.setRebaixadosDireto(n5);
                    }
                } else {
                    b_02.setRebaixadosDireto(n5);
                }
                b_02.setnRebaixados(n5);
                LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList3, 0, null, null, this, 1, null, false, null, false, b_02);
                b_02.q(s2);
                this.ds.add(b_02);
                int n7 = 0;
                while (n7 < arrayList3.size()) {
                    arrayList.remove(arrayList3.get(n7));
                    ++n7;
                }
            }
            ++n4;
        }
        this.iV();
        n4 = 1;
        if (this.pais == 29 && GerenciadorJogo.SR.bk()) {
            n4 = 0;
        } else if (this.pais == 29 && GerenciadorJogo.SR.isJogaRegionais()) {
            n4 = 0;
        } else if (this.pais == 29 && GerenciadorJogo.vM().isNovoFormatoCopa()) {
            n4 = 0;
        } else if (this.pais == 29 && !GerenciadorJogo.SR.isJogaEstadual() && !GerenciadorJogo.SR.isJogaRegionais()) {
            n4 = 0;
        }
        if (n4 != 0) {
            this.a(arrayList2, false, "criaLigas");
        }
        if (this.pais == 29 && GerenciadorJogo.SR.isJogaEstadual()) {
            CarregadorConfigEstadual.dZ();
        }
    }

    public static ConfigLigaType t(int n2, int n3) {
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.bG.size()) {
            if (((ConfigLigaType)GerenciadorJogo.SR.bG.get(n4)).getPais() == n2 && ((ConfigLigaType)GerenciadorJogo.SR.bG.get(n4)).getDivisao() == n3) {
                return (ConfigLigaType)GerenciadorJogo.SR.bG.get(n4);
            }
            ++n4;
        }
        return null;
    }

    private void iV() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getPais() == this.pais && ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getDivisao() == 0) {
                this.dt.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
                ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).setDivisao(0);
            }
            ++n2;
        }
        Collections.sort(this.dt, ColecaoComparadoresSorteio.abm);
    }

    public int iW() {
        int n2 = this.hv.size();
        int n3 = 0;
        if (n2 >= 128) {
            n3 = 7;
        } else if (n2 >= 64) {
            n3 = 6;
        } else if (n2 >= 32) {
            n3 = 5;
        } else if (n2 >= 16) {
            n3 = 4;
        } else if (n2 >= 8) {
            n3 = 3;
        }
        return n3 - 1;
    }

    public void y(boolean bl) {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        if (this.ds.size() >= 1) {
            ModeloTime[] ahArray;
            ModeloTime ah2 = null;
            ModeloTime ah3 = null;
            ModeloTime ah4 = null;
            arrayList.addAll(((CompeticaoLigaNacional)this.ds.get(0)).yi().yV());
            if (this.ds.size() > 1) {
                ArrayList arrayList3 = ((CompeticaoLigaNacional)this.ds.get(1)).yi().yV();
                arrayList.addAll(arrayList3);
                if (arrayList3.size() > 0) {
                    ah2 = (ModeloTime)arrayList3.get(0);
                }
            }
            if (arrayList.size() < 12) {
                arrayList.addAll(this.ek());
            }
            if (bl && ah2 != null) {
                arrayList.remove(ah2);
                arrayList.add(0, ah2);
            }
            if ((ahArray = this.bk(GerenciadorJogo.SR.H() - 1)) != null) {
                arrayList.remove(ahArray[0]);
                arrayList.add(0, ahArray[0]);
            }
            if (GerenciadorJogo.SR.aH() != null && GerenciadorJogo.SR.aH().yz() != null && GerenciadorJogo.SR.aH().yz().getPais() == this.pais) {
                ah4 = GerenciadorJogo.SR.aH().yz();
                arrayList.remove(ah4);
                arrayList.add(0, ah4);
            }
            if (GerenciadorJogo.SR.aF() != null && GerenciadorJogo.SR.aF().yz() != null && GerenciadorJogo.SR.aF().yz().getPais() == this.pais) {
                ah3 = GerenciadorJogo.SR.aF().yz();
                arrayList.remove(ah3);
                arrayList.add(0, ah3);
            }
        }
        this.hu.Bi();
        if (arrayList.size() >= 12) {
            int n2 = 0;
            while (n2 <= 11) {
                this.hu.W((ModeloTime)arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void ja() {
        this.a(this.hv, false, "CriaCopaAno1PosLib");
    }

    public void a(ArrayList arrayList, boolean bl, String string) {
        int n2 = arrayList.size();
        if (this.pais == 29 && n2 >= 91 && GerenciadorJogo.vM().isNovoFormatoCopa() && !bl) {
            if (this.hu == null) {
                this.hu = new CompeticaoCopaNacional(this);
            }
            this.hu.b(this.hu, arrayList, this.duasVoltasMataMata);
        } else if (n2 >= 8) {
            if (this.hu == null) {
                this.hu = new CompeticaoCopaNacional(this);
            }
            this.hu.a(this.hu, arrayList, this.duasVoltasMataMata);
        }
    }

    public int ec() {
        return this.dw;
    }

    public void jb() {
        ++this.dw;
    }

    public ArrayList eb() {
        return this.ds;
    }

    public int jc() {
        return this.pais;
    }

    public void bj(int n2) {
        this.pais = n2;
    }

    public ModeloTime[] bk(int n2) {
        ModeloTime[] ahArray = new ModeloTime[2];
        if (this.hu != null) {
            int n3 = 0;
            while (n3 < this.hu.mn().size()) {
                if (((PartidaCompeticao)this.hu.mn().get(n3)).H() == n2) {
                    ahArray[0] = ((PartidaCompeticao)this.hu.mn().get(n3)).ce();
                    ahArray[1] = ((PartidaCompeticao)this.hu.mn().get(n3)).cf();
                    return ahArray;
                }
                ++n3;
            }
        }
        return null;
    }

    public void jd() {
        if (this.hD.size() == 0) {
            if (this.ds.size() >= 1) {
                this.hD.addAll(((CompeticaoLigaNacional)this.ds.get(0)).yi().yV());
                if (this.ds.size() > 1) {
                    this.hD.addAll(((CompeticaoLigaNacional)this.ds.get(1)).yi().yV());
                }
            } else {
                this.hD = this.je();
            }
        }
    }

    public void a(int n2, ArrayList arrayList, ArrayList arrayList2, boolean bl) {
        ModeloTime[] ahArray;
        this.jd();
        if (bl && (ahArray = this.bk(GerenciadorJogo.SR.H() - 1)) != null && !arrayList2.contains(ahArray[0])) {
            arrayList.add(ahArray[0]);
            arrayList2.add(ahArray[0]);
            --n2;
        }
        if (n2 > 0) {
            int n3 = 0;
            while (n3 < this.hD.size()) {
                if (n2 > 0 && !arrayList2.contains(this.hD.get(n3))) {
                    arrayList.add((ModeloTime)this.hD.get(n3));
                    arrayList2.add((ModeloTime)this.hD.get(n3));
                    --n2;
                }
                if (n2 == 0) break;
                ++n3;
            }
        }
    }

    private ArrayList je() {
        int[] nArray = new int[]{85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35};
        int n2 = 0;
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n3 = 0;
        while (n3 < this.hv.size()) {
            arrayList.add((ModeloTime)this.hv.get(n3));
            ((ModeloTime)this.hv.get(n3)).bR(new Random().nextInt(1000) + 1);
            ++n3;
        }
        Collections.sort(arrayList, ColecaoComparadoresSorteio.cN);
        n3 = 0;
        while (n3 < arrayList.size()) {
            n2 = n3 < nArray.length ? nArray[n3] : 20;
            int n4 = new Random().nextInt(100) + 1;
            if (n4 <= n2) {
                arrayList2.add((ModeloTime)arrayList.get(n3));
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList.size()) {
            if (!arrayList2.contains(arrayList.get(n3))) {
                arrayList2.add((ModeloTime)arrayList.get(n3));
            }
            ++n3;
        }
        return arrayList2;
    }

    public int gg() {
        return EnumPaises.valueOf("P" + Integer.toString(this.pais)).gg();
    }

    public String jf() {
        return EnumPaises.valueOf("P" + Integer.toString(this.pais)).getNome();
    }

    public ArrayList jg() {
        return this.hv;
    }

    public ArrayList jh() {
        return this.hw;
    }

    public void ee() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        boolean bl = false;
        if (this.ds.size() > 0) {
            ((CompeticaoLigaNacional)this.ds.get(0)).yi().ah(0, ((CompeticaoLigaNacional)this.ds.get(0)).getnRebaixados());
        }
        int n2 = 1;
        while (n2 < this.ds.size()) {
            ((CompeticaoLigaNacional)this.ds.get(n2)).yi().ah(((CompeticaoLigaNacional)this.ds.get(n2 - 1)).getnRebaixados(), ((CompeticaoLigaNacional)this.ds.get(n2)).getnRebaixados());
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ds.size()) {
            int n3;
            if (n2 + 1 < this.ds.size()) {
                arrayList2.clear();
                arrayList.clear();
                if (bl) {
                    System.out.println("====divisao " + (n2 + 1));
                }
                int n4 = 0;
                while (n4 < ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().size()) {
                    if (bl) {
                        System.out.println(String.valueOf(n4) + " " + ((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().get(n4)).getNome());
                    }
                    ++n4;
                }
                n4 = 0;
                while (n4 < ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yU().size()) {
                    arrayList2.add((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2)).yi().yU().get(n4));
                    ++n4;
                }
                n4 = 0;
                while (n4 < ((CompeticaoLigaNacional)this.ds.get(n2 + 1)).yi().yW().size()) {
                    arrayList.add((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2 + 1)).yi().yW().get(n4));
                    ++n4;
                }
                if (bl) {
                    n4 = 0;
                    while (n4 < arrayList2.size()) {
                        System.out.println("<<desce " + ((ModeloTime)arrayList2.get(n4)).getNome());
                        ++n4;
                    }
                }
                if (bl) {
                    n4 = 0;
                    while (n4 < arrayList.size()) {
                        System.out.println("<<sobe " + ((ModeloTime)arrayList.get(n4)).getNome());
                        ++n4;
                    }
                }
                if (GerenciadorJogo.SR.bk() && n2 == 2 && this.jc() == 29) {
                    GerenciadorJogo.SR.bY().clear();
                }
                if (arrayList2.size() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    n3 = 0;
                    while (n3 < arrayList2.size()) {
                        if (!((CompeticaoLigaNacional)this.ds.get(n2)).ac((ModeloTime)arrayList2.get(n3))) {
                            ((ModeloTime)arrayList2.get(n3)).b((Competicao)this.ds.get(n2), 0);
                            ((ModeloTime)arrayList.get(n3)).b((Competicao)this.ds.get(n2 + 1), 1);
                            ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().remove(arrayList2.get(n3));
                            ((CompeticaoLigaNacional)this.ds.get(n2 + 1)).yi().yK().add((ModeloTime)arrayList2.get(n3));
                            ((CompeticaoLigaNacional)this.ds.get(n2 + 1)).yi().yK().remove(arrayList.get(n3));
                            ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().add((ModeloTime)arrayList.get(n3));
                            if (GerenciadorJogo.SR.bk() && n2 == 2 && this.jc() == 29) {
                                GerenciadorJogo.SR.bY().add((ModeloTime)arrayList2.get(n3));
                            }
                        }
                        ++n3;
                    }
                }
            } else {
                if (bl) {
                    System.out.println("====divisao ultima " + n2);
                }
                int n5 = 0;
                while (n5 < ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().size()) {
                    if (bl) {
                        System.out.println(String.valueOf(n5) + " " + ((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().get(n5)).getNome());
                    }
                    ++n5;
                }
                arrayList2.clear();
                arrayList.clear();
                n5 = ((CompeticaoLigaNacional)this.ds.get(n2)).getnRebaixados();
                if (this.dt.size() < n5) {
                    n5 = this.dt.size();
                }
                if (n5 > 0) {
                    n3 = 0;
                    while (n3 < ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yU().size()) {
                        if (n3 < n5) {
                            arrayList2.add((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2)).yi().yU().get(n3));
                        }
                        ++n3;
                    }
                    if (bl) {
                        n3 = 0;
                        while (n3 < arrayList2.size()) {
                            System.out.println("<<desce " + ((ModeloTime)arrayList2.get(n3)).getNome());
                            ++n3;
                        }
                    }
                    n3 = 0;
                    while (n3 < n5) {
                        arrayList.add((ModeloTime)this.dt.get(n3));
                        ++n3;
                    }
                    if (bl) {
                        n3 = 0;
                        while (n3 < arrayList.size()) {
                            System.out.println("<<sobe " + ((ModeloTime)arrayList.get(n3)).getNome());
                            ++n3;
                        }
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        Collections.reverse(arrayList);
                        n3 = 0;
                        while (n3 < arrayList2.size()) {
                            if (!((CompeticaoLigaNacional)this.ds.get(n2)).ac((ModeloTime)arrayList2.get(n3))) {
                                ((ModeloTime)arrayList2.get(n3)).b((Competicao)this.ds.get(n2), 0);
                                ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().remove(arrayList2.get(n3));
                                this.dt.add((ModeloTime)arrayList2.get(n3));
                                ((ModeloTime)arrayList2.get(n3)).setDivisao(0);
                                this.dt.remove(arrayList.get(n3));
                                ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().add((ModeloTime)arrayList.get(n3));
                            }
                            ++n3;
                        }
                    }
                }
            }
            ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yI();
            ++n2;
        }
        if (this.pais == 29 && GerenciadorJogo.SR.bk()) {
            ((CompeticaoLigaNacional)this.ds.get(this.ds.size() - 1)).yi().yJ();
        }
        n2 = 0;
        while (n2 < this.ds.size()) {
            ((CompeticaoLigaNacional)this.ds.get(n2)).BJ();
            ++n2;
        }
    }

    public Campeonato ji() {
        ArrayList<Campeonato> arrayList = new ArrayList<Campeonato>();
        ArrayList<Campeonato> arrayList2 = new ArrayList<Campeonato>();
        ArrayList<Campeonato> arrayList3 = new ArrayList<Campeonato>();
        ArrayList<Campeonato> arrayList4 = new ArrayList<Campeonato>();
        ArrayList<Campeonato> arrayList5 = new ArrayList<Campeonato>();
        ArrayList<Campeonato> arrayList6 = new ArrayList<Campeonato>();
        int n2 = this.jc();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.L().size()) {
            if (!((Campeonato)GerenciadorJogo.SR.L().get(n3)).jZ().booleanValue() && ((Campeonato)GerenciadorJogo.SR.L().get(n3)).jo() == null) {
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).lE() == n2 && ((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 5) {
                    arrayList.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).lE() == n2 && ((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 4) {
                    arrayList2.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).lE() == n2 && ((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 3) {
                    arrayList3.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 5) {
                    arrayList4.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 4) {
                    arrayList5.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
                if (((Campeonato)GerenciadorJogo.SR.L().get(n3)).getReputacao() == 3) {
                    arrayList6.add((Campeonato)GerenciadorJogo.SR.L().get(n3));
                }
            }
            ++n3;
        }
        if (arrayList.size() > 0) {
            return (Campeonato)arrayList.get(0);
        }
        if (arrayList2.size() > 0) {
            return (Campeonato)arrayList2.get(0);
        }
        if (arrayList4.size() > 0) {
            return (Campeonato)arrayList4.get(0);
        }
        if (arrayList5.size() > 0) {
            return (Campeonato)arrayList5.get(0);
        }
        if (arrayList3.size() > 0) {
            return (Campeonato)arrayList3.get(0);
        }
        if (arrayList6.size() > 0) {
            return (Campeonato)arrayList6.get(0);
        }
        return null;
    }

    public void z(boolean bl) {
        Object object;
        this.jo().kc().clear();
        if ((bl || this.jo().ka() == null) && !this.jo().jZ().booleanValue() && (object = this.ji()) != null) {
            this.g((Campeonato)object);
        }
        if (!this.hz && !this.jk()) {
            UtilitariosGeracaoJogador.r(this.pais, this.hA);
        }
        int[] nArray0 = new int[]{3, 4, 4, 5, 4, 3};
        int[] nArray = new int[6];
        nArray[1] = 2;
        nArray[2] = 2;
        nArray[3] = 2;
        nArray[4] = 2;
        nArray[5] = 2;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[6];
        nArray3[1] = 2;
        nArray3[2] = 2;
        nArray3[3] = 3;
        nArray3[4] = 2;
        nArray3[5] = 1;
        int[] nArray4 = nArray3;
        ArrayList<ModeloJogador> arrayList = new ArrayList<ModeloJogador>();
        ArrayList<ModeloJogador> arrayList2 = new ArrayList<ModeloJogador>();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.O().size()) {
            if (((ModeloJogador)GerenciadorJogo.SR.O().get(n2)).getPais() == this.pais && ((ModeloJogador)GerenciadorJogo.SR.O().get(n2)).fg() != null) {
                arrayList.add((ModeloJogador)GerenciadorJogo.SR.O().get(n2));
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < GerenciadorJogo.SR.bN().size()) {
            if (((ModeloJogador)GerenciadorJogo.SR.bN().get(n2)).getPais() == this.pais) {
                arrayList.add((ModeloJogador)GerenciadorJogo.SR.bN().get(n2));
            }
            ++n2;
        }
        Collections.sort(arrayList, hF);
        n2 = 0;
        while (n2 < arrayList.size()) {
            if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 0) {
                if (nArray0[0] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    int[] object2 = nArray0;
                    object2[0] = object2[0] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() < 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 0) {
                if (nArray2[((ModeloJogador)arrayList.get(n2)).getPosicao()] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    int n3 = ((ModeloJogador)arrayList.get(n2)).getPosicao();
                    nArray2[n3] = nArray2[n3] - 1;
                    int[] object3 = nArray0;
                    int n4 = ((ModeloJogador)arrayList.get(n2)).getPosicao();
                    object3[n4] = object3[n4] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() < 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 1) {
                if (nArray4[((ModeloJogador)arrayList.get(n2)).getPosicao()] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    int n5 = ((ModeloJogador)arrayList.get(n2)).getPosicao();
                    nArray4[n5] = nArray4[n5] - 1;
                    int[] object4 = nArray0;
                    int n6 = ((ModeloJogador)arrayList.get(n2)).getPosicao();
                    object4[n6] = object4[n6] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 0 && ((ModeloJogador)arrayList.get(n2)).fF() == 1) {
                if (nArray2[3] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    nArray2[3] = nArray2[3] - 1;
                    int[] object5 = nArray0;
                    object5[3] = object5[3] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 1 && ((ModeloJogador)arrayList.get(n2)).fF() == 1) {
                if (nArray4[3] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    nArray4[3] = nArray4[3] - 1;
                    int[] object6 = nArray0;
                    object6[3] = object6[3] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 0 && ((ModeloJogador)arrayList.get(n2)).fF() == 0) {
                if (nArray2[5] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    nArray2[5] = nArray2[5] - 1;
                    int[] object7 = nArray0;
                    object7[5] = object7[5] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 3 && ((ModeloJogador)arrayList.get(n2)).getLado() == 1 && ((ModeloJogador)arrayList.get(n2)).fF() == 0) {
                if (nArray4[5] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    nArray4[5] = nArray4[5] - 1;
                    int[] object8 = nArray0;
                    object8[5] = object8[5] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 4 && ((ModeloJogador)arrayList.get(n2)).getLado() == 0) {
                if (nArray2[4] > 0) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                    nArray2[4] = nArray2[4] - 1;
                    int[] object9 = nArray0;
                    object9[4] = object9[4] - 1;
                }
            } else if (((ModeloJogador)arrayList.get(n2)).getPosicao() == 4 && ((ModeloJogador)arrayList.get(n2)).getLado() == 1 && nArray4[4] > 0) {
                arrayList2.add((ModeloJogador)arrayList.get(n2));
                nArray4[4] = nArray4[4] - 1;
                int[] object10 = nArray0;
                object10[4] = object10[4] - 1;
            }
            ++n2;
        }
        if (arrayList.size() < 23) {
            n2 = 0;
            while (n2 <= 5) {
                int n7 = 0;
                n7 = n2 < 5 ? n2 : 3;
                if (nArray0[n2] > 0) {
                    int n8 = 0;
                    while (n8 < arrayList.size()) {
                        if (((ModeloJogador)arrayList.get(n8)).getPosicao() == n7 && !arrayList2.contains(arrayList.get(n8))) {
                            arrayList2.add((ModeloJogador)arrayList.get(n8));
                        }
                        ++n8;
                    }
                }
                ++n2;
            }
        }
        if (arrayList.size() < 23) {
            n2 = 0;
            while (n2 < arrayList.size()) {
                if (!arrayList2.contains(arrayList.get(n2))) {
                    arrayList2.add((ModeloJogador)arrayList.get(n2));
                }
                ++n2;
            }
        }
        Collections.sort(arrayList2, ColecaoComparadoresSorteio.abe);
        this.hy.N(arrayList2);
        this.hy.o(null);
        this.hy.n((ModeloJogador)null);
        this.hy.kA();
        this.hy.kz();
    }

    public void jj() {
        int n2 = 0;
        int n3 = 0;
        int[] nArray = new int[5];
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.O().size()) {
            if (((ModeloJogador)GerenciadorJogo.SR.O().get(n4)).getPais() == this.pais) {
                if (((ModeloJogador)GerenciadorJogo.SR.O().get(n4)).getPosicao() == 0) {
                    ++n3;
                } else {
                    ++n2;
                }
                int n5 = ((ModeloJogador)GerenciadorJogo.SR.O().get(n4)).getPosicao();
                nArray[n5] = nArray[n5] + 1;
            }
            ++n4;
        }
        this.hz = n2 >= 15 && n3 >= 2;
    }

    public boolean jk() {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < GerenciadorJogo.SR.O().size()) {
            if (((ModeloJogador)GerenciadorJogo.SR.O().get(n4)).getPais() == this.pais) {
                if (((ModeloJogador)GerenciadorJogo.SR.O().get(n4)).getPosicao() == 0) {
                    ++n3;
                } else {
                    ++n2;
                }
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < GerenciadorJogo.SR.bN().size()) {
            if (((ModeloJogador)GerenciadorJogo.SR.bN().get(n4)).getPais() == this.pais) {
                if (((ModeloJogador)GerenciadorJogo.SR.bN().get(n4)).getPosicao() == 0) {
                    ++n3;
                } else {
                    ++n2;
                }
            }
            ++n4;
        }
        return n2 >= 16 && n3 >= 2;
    }

    public boolean jl() {
        return this.hz;
    }

    public void A(boolean bl) {
        this.hz = bl;
    }

    public static void a(boolean bl, int n2, int n3, ArrayList arrayList, boolean bl2, LigaNacional z2) {
        int[] nArray;
        int n4;
        ArrayList<LigaNacional> arrayList2 = new ArrayList<LigaNacional>();
        boolean bl3 = false;
        if (bl3) {
            n4 = 0;
            while (n4 < GerenciadorJogo.SR.aG().size()) {
                if (((LigaNacional)GerenciadorJogo.SR.aG().get(n4)).gg() == n2 && ((LigaNacional)GerenciadorJogo.SR.aG().get((int)n4)).hz) {
                    arrayList2.add((LigaNacional)GerenciadorJogo.SR.aG().get(n4));
                }
                ++n4;
            }
        } else {
            n4 = 0;
            while (n4 < GerenciadorJogo.SR.aG().size()) {
                if (((LigaNacional)GerenciadorJogo.SR.aG().get(n4)).gg() == n2) {
                    arrayList2.add((LigaNacional)GerenciadorJogo.SR.aG().get(n4));
                }
                ++n4;
            }
        }
        Collections.sort(arrayList2, cN);
        int[] nArray2 = new int[]{95, 80, 70, 50, 30, 20, 10, 5};
        int[] nArray3 = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 50};
        int[] nArray4 = new int[]{100, 95, 30, 10, 5};
        int[] nArray5 = new int[]{80, 80, 70, 70, 70, 50};
        int[] nArray6 = new int[]{90, 50, 30, 10, 5};
        int[] nArray7 = new int[]{100, 90, 80, 60, 30};
        int[] nArray8 = new int[]{99, 95, 30, 10, 5};
        int[] nArray9 = new int[]{100, 95, 80, 50, 30, 20, 10, 5};
        if (!bl) {
            nArray = new int[]{100, 100, 90, 70, 60, 20, 10, 5};
            int[] nArray10 = new int[]{100, 50, 30, 10, 5};
            int[] nArray11 = new int[]{100, 100, 100, 98, 60, 40};
            int[] nArray12 = new int[]{100, 100, 90, 65, 60};
            int[] nArray13 = new int[]{100, 100, 100, 100, 100, 95, 80};
            int[] nArray14 = new int[]{100, 90, 90, 10, 5};
            nArray2 = nArray;
            nArray4 = nArray10;
            nArray5 = nArray11;
            nArray6 = nArray12;
            nArray7 = nArray13;
            nArray8 = nArray14;
        }
        if (n2 == 0) {
            nArray9 = nArray2;
        } else if (n2 == 1) {
            nArray9 = nArray4;
        } else if (n2 == 2) {
            nArray9 = nArray5;
        } else if (n2 == 3) {
            nArray9 = nArray6;
        } else if (n2 == 4) {
            nArray9 = nArray7;
        } else if (n2 == 5) {
            nArray9 = nArray8;
        }
        if (bl2) {
            if (n2 == 4) {
                nArray = new int[]{100, 100, 100, 95, 75, 70, 70, 70, 70};
                nArray3 = nArray;
            } else if (n2 == 3) {
                nArray = new int[]{100, 100, 70, 70, 70, 70, 70, 70, 70};
                nArray3 = nArray;
            }
            nArray9 = nArray3;
            arrayList2.remove(GerenciadorJogo.SR.aY().eY(1));
        }
        if (n2 != 3 || n3 == 1) {
            // empty if block
        }
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        boolean bl4 = false;
        if (bl4) {
            System.out.println("-----probs");
        }
        int n9 = 0;
        while (n9 < arrayList2.size()) {
            if (n3 > 0) {
                n6 = new Random().nextInt(100) + 1;
                if (n9 > 0 && ((LigaNacional)arrayList2.get(n9)).getNivel() < n7 && ++n5 >= nArray9.length) {
                    n5 = nArray9.length - 1;
                }
                if (arrayList2.get(n9) != z2 && n6 <= nArray9[n5] && !arrayList.contains(arrayList2.get(n9))) {
                    arrayList.add((LigaNacional)arrayList2.get(n9));
                    --n3;
                    ++n8;
                    if (bl4) {
                        System.out.println("-sim " + n8 + " " + ((LigaNacional)arrayList2.get(n9)).jf() + "(n:" + ((LigaNacional)arrayList2.get((int)n9)).hA + ") " + n5 + " rand=" + n6 + " prob" + nArray9[n5] + " " + "randdopais:" + ((LigaNacional)arrayList2.get((int)n9)).hr);
                    }
                } else if (bl4) {
                    System.out.println("-n\u00e3o " + ((LigaNacional)arrayList2.get(n9)).jf() + "(n:" + ((LigaNacional)arrayList2.get((int)n9)).hA + ") " + n5 + " rand=" + n6 + " prob" + nArray9[n5] + " " + "randdopais:" + ((LigaNacional)arrayList2.get((int)n9)).hr);
                }
                n7 = ((LigaNacional)arrayList2.get((int)n9)).hA;
            }
            ++n9;
        }
        n9 = 0;
        while (n9 < arrayList2.size()) {
            if (n3 > 0 && arrayList2.get(n9) != z2 && !arrayList.contains(arrayList2.get(n9))) {
                arrayList.add((LigaNacional)arrayList2.get(n9));
                --n3;
            }
            ++n9;
        }
        if (bl4) {
            System.out.println("nos grupos-----");
            n9 = 0;
            while (n9 < arrayList.size()) {
                System.out.println(String.valueOf(((LigaNacional)arrayList.get(n9)).jf()) + " " + ((LigaNacional)arrayList.get((int)n9)).hA + " " + ((LigaNacional)arrayList.get((int)n9)).hr);
                ++n9;
            }
        }
    }

    public int getNivel() {
        return this.hA;
    }

    public void jm() {
        this.hA = EnumPaises.valueOf("P" + Integer.toString(this.pais)).getNivel();
    }

    public ModeloTime jn() {
        return this.hy;
    }

    public ModeloTime jo() {
        if (this.hy == null) {
            ModeloTime ah2;
            this.hy = ah2 = new ModeloTime(this.jf(), null, -1, this.jc(), -1, this.getNivel(), null, this.jt(), null, null, null, -1, null, true);
            ah2.bX(GerenciadorJogo.SR.bH());
            GerenciadorJogo.SR.bI();
            int[] nArray = EnumPaises.valueOf("P" + Integer.toString(this.jc())).jB();
            int[] nArray2 = EnumPaises.valueOf("P" + Integer.toString(this.jc())).jC();
            this.hy.d(new Color(nArray[0], nArray[1], nArray[2]));
            this.hy.c(new Color(nArray2[0], nArray2[1], nArray2[2]));
            this.hy.ln();
            this.hy.lo();
        }
        return this.hy;
    }

    public void z(ModeloTime ah2) {
        this.hy = ah2;
    }

    public void a(ArrayList arrayList, Campeonato al2, boolean bl, boolean bl2) {
        int[][] nArrayArray = new int[5][];
        int[] nArray = new int[6];
        nArray[2] = 1;
        nArray[3] = 2;
        nArray[4] = -1;
        nArray[5] = -1;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{1, 1, 2, 3, -1, -1};
        nArrayArray[2] = new int[]{2, 2, 3, -1, -1, -1};
        nArrayArray[3] = new int[]{2, 3, 3, -1, -1, -1};
        nArrayArray[4] = new int[]{-1, -1, -1, -1, -1, -1};
        int[][] nArrayArray2 = nArrayArray;
        int[][] nArrayArray3 = new int[5][];
        int[] nArray2 = new int[6];
        nArray2[1] = -1;
        nArray2[2] = -1;
        nArray2[3] = 2;
        nArray2[4] = -1;
        nArray2[5] = -1;
        nArrayArray3[0] = nArray2;
        nArrayArray3[1] = new int[]{1, -1, 2, -1, -1, -1};
        nArrayArray3[2] = new int[]{2, -1, -1, -1, -1, -1};
        nArrayArray3[3] = new int[]{2, 3, -1, -1, -1, -1};
        nArrayArray3[4] = new int[]{-1, -1, -1, -1, -1, -1};
        int[][] nArrayArray4 = nArrayArray3;
        int[][] nArrayArray5 = new int[5][];
        int[] nArray3 = new int[6];
        nArray3[1] = -1;
        nArray3[2] = -1;
        nArray3[3] = -1;
        nArray3[4] = -1;
        nArray3[5] = -1;
        nArrayArray5[0] = nArray3;
        nArrayArray5[1] = new int[]{1, -1, -1, -1, -1, -1};
        nArrayArray5[2] = new int[]{2, -1, -1, -1, -1, -1};
        nArrayArray5[3] = new int[]{2, 3, -1, -1, -1, -1};
        nArrayArray5[4] = new int[]{-1, -1, -1, -1, -1, -1};
        int[][] nArrayArray6 = nArrayArray5;
        int[][] nArrayArray7 = new int[5][];
        int[] nArray4 = new int[6];
        nArray4[1] = 1;
        nArray4[2] = -1;
        nArray4[3] = -1;
        nArray4[4] = -1;
        nArray4[5] = -1;
        nArrayArray7[0] = nArray4;
        nArrayArray7[1] = new int[]{1, 2, -1, -1, -1, -1};
        nArrayArray7[2] = new int[]{2, 8, -1, -1, -1, -1};
        nArrayArray7[3] = new int[]{3, 8, -1, -1, -1, -1};
        nArrayArray7[4] = new int[]{-1, -1, -1, -1, -1, -1};
        int[][] nArrayArray8 = nArrayArray7;
        int[][] nArrayArray9 = new int[5][];
        int[] nArray5 = new int[6];
        nArray5[1] = -1;
        nArray5[2] = -1;
        nArray5[3] = -1;
        nArray5[4] = -1;
        nArray5[5] = -1;
        nArrayArray9[0] = nArray5;
        nArrayArray9[1] = new int[]{1, -1, -1, -1, -1, -1};
        nArrayArray9[2] = new int[]{8, 8, -1, -1, -1, -1};
        nArrayArray9[3] = new int[]{8, 8, -1, -1, -1, -1};
        nArrayArray9[4] = new int[]{-1, -1, -1, -1, -1, -1};
        int[][] nArrayArray10 = nArrayArray9;
        int n2 = -1;
        n2 = al2.fg() == null ? al2.lG() : al2.fg().getDivisao() - 1;
        if (n2 < 0) {
            n2 = this.ds.size() - 1;
        }
        if (n2 > this.ds.size() - 1) {
            n2 = this.ds.size() - 1;
        }
        if (n2 >= 0) {
            int[] nArray6 = nArrayArray2[n2];
            int n3 = new Random().nextInt(1000);
            if (n3 > 700) {
                nArray6 = nArrayArray4[n2];
            } else if (n3 > 500) {
                nArray6 = nArrayArray6[n2];
            }
            if (!bl2) {
                nArray6 = nArrayArray8[n2];
                if (n3 > 500) {
                    nArray6 = nArrayArray10[n2];
                }
            }
            int n4 = 0;
            while (n4 < nArray6.length) {
                if (nArray6[n4] == 8) {
                    nArray6[n4] = this.ds.size() - 1;
                }
                if (nArray6[n4] >= 0 && nArray6[n4] < this.ds.size()) {
                    if (((CompeticaoLigaNacional)this.ds.get(nArray6[n4])).yi().yK().size() > 0) {
                        ((CompeticaoLigaNacional)this.ds.get(nArray6[n4])).yi().b(arrayList, al2, bl);
                    } else if (!al2.jZ().booleanValue()) {
                        this.a(arrayList, al2, bl);
                    }
                }
                ++n4;
            }
        }
    }

    public void a(ArrayList arrayList, Campeonato al2, boolean bl) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.ek().size()) {
            if (!((ModeloTime)this.ek().get(n2)).jZ().booleanValue() && this.ek().get(n2) != al2.lF()) {
                arrayList2.add((ModeloTime)this.ek().get(n2));
            }
            ++n2;
        }
        Collections.shuffle(arrayList2);
        n2 = 0;
        if (n2 < arrayList2.size() && !arrayList.contains(arrayList2.get(n2))) {
            arrayList.add((ModeloTime)arrayList2.get(n2));
        }
    }

    public void A(ArrayList arrayList) {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            ((CompeticaoLigaNacional)this.ds.get(n2)).yi().A(arrayList);
            ++n2;
        }
    }

    public String jp() {
        return this.hB;
    }

    public ArrayList ek() {
        return this.dt;
    }

    public CompeticaoCopaNacional jq() {
        return this.hu;
    }

    public boolean jr() {
        return this.hC;
    }

    public void B(boolean bl) {
        this.hC = bl;
    }

    public int js() {
        return this.ds.size();
    }

    public int jt() {
        if (this.hA >= 20) {
            return 5;
        }
        if (this.hA >= 19) {
            return 4;
        }
        if (this.hA >= 17) {
            return 3;
        }
        if (this.hA >= 15) {
            return 2;
        }
        return 1;
    }

    private void f(Campeonato al2) {
        int n2 = -1;
        n2 = al2.jo().getPais();
        LigaNacional z2 = GerenciadorJogo.SR.s(n2);
        if (z2 != null) {
            Campeonato al3 = al2;
            Campeonato al4 = z2.ji();
            al3.z(null);
            z2.jo().h(null);
            z2.jo().k(false);
            if (al4 != null) {
                z2.g(al4);
            }
            z2.z(false);
        }
    }

    public void g(Campeonato al2) {
        if (this.jo().ka() != null) {
            this.jo().ka().z(null);
        }
        if (al2.jo() != null) {
            this.f(al2);
        }
        this.jo().h(al2);
        al2.z(this.jo());
        this.jo().k(al2.jZ());
    }

    public void a(CompeticaoCopaNacional f_02) {
        if (f_02 == null && this.hu == null) {
            this.hu = new CompeticaoCopaNacional(this);
        }
    }

    public boolean ju() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() == this.hu && (((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hc().jZ().booleanValue() || ((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hd().jZ().booleanValue())) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public boolean ei() {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            int n3 = 0;
            while (n3 < ((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().size()) {
                if (((ModeloTime)((CompeticaoLigaNacional)this.ds.get(n2)).yi().yK().get(n3)).jZ().booleanValue()) {
                    return true;
                }
                ++n3;
            }
            ++n2;
        }
        return false;
    }

    public boolean jv() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() == this.hu) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public boolean ej() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (this.ds.contains(((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy())) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public void jx() {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            ((CompeticaoLigaNacional)this.ds.get(n2)).zJ();
            ((CompeticaoLigaNacional)this.ds.get(n2)).zK();
            ++n2;
        }
    }

    public void a(LigaPontosCorridos s2) {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            if (((CompeticaoLigaNacional)this.ds.get(n2)).yi() == s2) {
                ((CompeticaoLigaNacional)this.ds.get(n2)).zH();
            }
            ++n2;
        }
    }

    public void jy() {
        this.hD.clear();
    }

    public int K(int n2) {
        int n3 = n2 - 2;
        if (n2 > 1 && n3 < this.ds.size()) {
            return ((CompeticaoLigaNacional)this.ds.get(n3)).getnRebaixados();
        }
        return 0;
    }

    public int fq(int n2) {
        int n3 = n2 - 2;
        if (n2 > 1 && n3 < this.ds.size()) {
            return ((CompeticaoLigaNacional)this.ds.get(n3)).BL();
        }
        return 0;
    }

    public Estadio C(boolean bl) {
        int n2;
        int n3 = 6;
        if (this.hE == null && GerenciadorJogo.SR.cc() != null) {
            this.hE = new ArrayList();
            n2 = 0;
            while (n2 < GerenciadorJogo.SR.cc().size()) {
                if (((Estadio)GerenciadorJogo.SR.cc().get(n2)).getPais() == this.pais) {
                    this.hE.add((Estadio)GerenciadorJogo.SR.cc().get(n2));
                    if (--n3 == 0) break;
                }
                ++n2;
            }
        }
        if (this.hE != null && this.hE.size() > 0) {
            if (!bl) {
                if (this.hE != null && this.hE.size() > 0) {
                    return (Estadio)this.hE.get(new Random().nextInt(this.hE.size()));
                }
            } else {
                n2 = new Random().nextInt(2);
                if (n2 < this.hE.size()) {
                    return (Estadio)this.hE.get(n2);
                }
                this.hE.get(0);
            }
        }
        return null;
    }

    public components.AtributosJogador As() {
        components.AtributosJogador al2 = new components.AtributosJogador();
        int n2 = this.jc();
        if (this.gg() == 0) {
            GerenciadorJogo.SR.aI().a(n2, al2);
            GerenciadorJogo.SR.aK().a(n2, al2);
            GerenciadorJogo.SR.mj().a(n2, al2);
        } else if (this.gg() == 1) {
            GerenciadorJogo.SR.aF().a(n2, al2);
            GerenciadorJogo.SR.aH().a(n2, al2);
        } else if (this.gg() == 2) {
            GerenciadorJogo.SR.aO().a(n2, al2);
        } else if (this.gg() == 3) {
            GerenciadorJogo.SR.aL().a(n2, al2);
        } else if (this.gg() == 4) {
            GerenciadorJogo.SR.aP().a(n2, al2);
        } else if (this.gg() == 5) {
            GerenciadorJogo.SR.aQ().a(n2, al2);
        }
        return al2;
    }

    static /* synthetic */ int b(LigaNacional z2) {
        return z2.hA;
    }

    static /* synthetic */ int c(LigaNacional z2) {
        return z2.hr;
    }
}

