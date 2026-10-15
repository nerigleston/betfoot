package competicoes;

import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.VagasPais;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.EstatisticaJogadorCompeticao;
import nucleo.FaseCompeticao;
import nucleo.CandidatoSelecaoCampeonato;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.ComparadorClassificacao;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompeticaoLigaNacional
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YL = null;
    private LigaPontosCorridos ZU = null;
    private ChaveMataMata ZV = null;
    private ArrayList ZW = new ArrayList();
    private ArrayList ZX = new ArrayList();
    private ArrayList ZY = new ArrayList();
    private transient ArrayList ZZ = new ArrayList();
    private ArrayList aaa = new ArrayList();
    private int divisao = 0;
    private LigaNacional KR = null;
    private boolean agz = false;
    private int nRebaixados = 0;
    private boolean[] duasVoltasplayoffReb = new boolean[3];
    private boolean[] duasVoltasMataMataSobe = new boolean[3];
    private int vagasSobemPeloMataMata = 0;
    private int rebaixadosDireto = 2;
    private ChaveMataMata agA = null;
    private ChaveMataMata agB = null;
    private boolean GU = false;
    public static Comparator aab = new ComparadorClassificacao();

    @Override
    public void clear() {
        this.ZZ.clear();
        this.aaa.clear();
        this.ZW.clear();
    }

    public CompeticaoLigaNacional() {
    }

    public CompeticaoLigaNacional(LigaNacional z2, int n2) {
        this.F(1, n2);
        this.divisao = n2;
        this.KR = z2;
    }

    public void zF() {
        this.ZU = null;
    }

    public void a(ArrayList arrayList, LigaPontosCorridos s2, int n2) {
        if (n2 == 1020 && arrayList.size() == 8) {
            LigaPontosCorridos s3;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 8;
            loadLigaOptions.nGrupos = 2;
            loadLigaOptions.numeroTimesMataMata = 1;
            loadLigaOptions.doisTurnos = true;
            this.ZU = s3 = new LigaPontosCorridos(loadLigaOptions, arrayList, 0, null, null, s2.vl(), 1, null, false, s2, true, this);
            s3.setNome(s2.getNome());
            s3.fb(1022);
        }
    }

    public void n(ArrayList arrayList, ArrayList arrayList2) {
        this.YL.ai(arrayList2);
    }

    public EstatisticaJogadorCompeticao D(ModeloJogador f2) {
        int n2 = 0;
        while (n2 < this.ZW.size()) {
            if (((EstatisticaJogadorCompeticao)this.ZW.get(n2)).x() == f2) {
                return (EstatisticaJogadorCompeticao)this.ZW.get(n2);
            }
            ++n2;
        }
        EstatisticaJogadorCompeticao e2 = new EstatisticaJogadorCompeticao(this, f2);
        this.ZW.add(e2);
        return e2;
    }

    public void E(ModeloJogador f2) {
        boolean bl = true;
        if (f2.getPosicao() == 0 && f2.fT() != 1) {
            bl = false;
        } else if (f2.getPosicao() == 1 && f2.getLado() == 0 && f2.fT() != 9) {
            bl = false;
        } else if (f2.getPosicao() == 1 && f2.getLado() == 1 && f2.fT() != 2) {
            bl = false;
        } else if (f2.getPosicao() == 2) {
            if (f2.fT() < 3 || f2.fT() > 8) {
                bl = false;
            }
        } else if (f2.getPosicao() == 3) {
            if (f2.fT() < 10 || f2.fT() > 17) {
                bl = false;
            }
        } else if (f2.getPosicao() == 4 && f2.fT() < 18) {
            bl = false;
        }
        if (f2.getPosicao() == 1 && f2.getLado() == 0 && f2.fT() == 17) {
            bl = true;
        }
        if (f2.getPosicao() == 1 && f2.getLado() == 1 && f2.fT() == 10) {
            bl = true;
        }
        int[] nArray = new int[26];
        nArray[0] = -1;
        nArray[2] = 5;
        nArray[3] = 2;
        nArray[4] = 2;
        nArray[5] = 2;
        nArray[6] = 2;
        nArray[7] = 2;
        nArray[8] = 2;
        nArray[9] = 1;
        nArray[10] = 3;
        nArray[11] = 6;
        nArray[12] = 6;
        nArray[13] = 6;
        nArray[14] = 3;
        nArray[15] = 3;
        nArray[16] = 3;
        nArray[17] = 3;
        nArray[18] = 4;
        nArray[19] = 4;
        nArray[20] = 4;
        nArray[21] = 4;
        nArray[22] = 4;
        nArray[23] = 4;
        nArray[24] = 4;
        nArray[25] = 4;
        int[] nArray2 = nArray;
        if (bl) {
            EstatisticaJogadorCompeticao e2 = this.D(f2);
            e2.a(f2.gk());
            if (nArray2[f2.fT()] == 3 && f2.fF() == 0) {
                e2.j(6);
            } else if (nArray2[f2.fT()] == 3 && f2.fF() == 1) {
                e2.j(3);
            } else if (nArray2[f2.fT()] == 5 && f2.getPosicao() == 3) {
                e2.j(3);
            } else if (nArray2[f2.fT()] == 1 && f2.getPosicao() == 3) {
                e2.j(3);
            } else {
                e2.j(nArray2[f2.fT()]);
            }
        }
    }

    public void fi(int n2) {
        int n3;
        this.zL();
        int[] nArray = new int[11];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 2;
        nArray[4] = 5;
        nArray[5] = 6;
        nArray[6] = 6;
        nArray[7] = 3;
        nArray[8] = 3;
        nArray[9] = 4;
        nArray[10] = 4;
        int[] nArray2 = nArray;
        int n4 = this.yi().zk();
        VagasPais am2 = new VagasPais();
        am2.k(GerenciadorJogo.SR.H());
        int n5 = 0;
        while (n5 < nArray2.length) {
            n3 = 0;
            while (n3 < this.ZW.size()) {
                if (((EstatisticaJogadorCompeticao)this.ZW.get(n3)).E() == nArray2[n5] && ((EstatisticaJogadorCompeticao)this.ZW.get(n3)).D() >= (double)n4 && !am2.lV().contains(((EstatisticaJogadorCompeticao)this.ZW.get(n3)).x())) {
                    am2.lV().add(((EstatisticaJogadorCompeticao)this.ZW.get(n3)).x());
                    am2.lW().add(((EstatisticaJogadorCompeticao)this.ZW.get(n3)).x().fg());
                    break;
                }
                ++n3;
            }
            ++n5;
        }
        this.ZY.add(am2);
        ModeloJogador f2 = null;
        n3 = 0;
        while (n3 < this.ZW.size()) {
            if (((EstatisticaJogadorCompeticao)this.ZW.get(n3)).D() >= (double)n4) {
                this.ZX.add(((EstatisticaJogadorCompeticao)this.ZW.get(n3)).x());
                if (n2 != 0 || (f2 = ((EstatisticaJogadorCompeticao)this.ZW.get(n3)).x()) == null) break;
                f2.a(true);
                break;
            }
            ++n3;
        }
    }

    public ArrayList fj(int n2) {
        ArrayList<EstatisticaJogadorCompeticao> arrayList = new ArrayList<EstatisticaJogadorCompeticao>();
        int n3 = this.yi().zk();
        int n4 = 0;
        int n5 = 0;
        while (n5 < this.ZW.size()) {
            if (((EstatisticaJogadorCompeticao)this.ZW.get(n5)).E() == n2 && ((EstatisticaJogadorCompeticao)this.ZW.get(n5)).D() >= (double)n3) {
                if (n4 < 20) {
                    arrayList.add((EstatisticaJogadorCompeticao)this.ZW.get(n5));
                }
                ++n4;
            }
            if (n4 == 20) break;
            ++n5;
        }
        return arrayList;
    }

    public ArrayList zG() {
        ArrayList<EstatisticaJogadorCompeticao> arrayList = new ArrayList<EstatisticaJogadorCompeticao>();
        int n2 = this.yi().zk();
        int n3 = 0;
        int n4 = 0;
        while (n4 < this.ZW.size()) {
            if (((EstatisticaJogadorCompeticao)this.ZW.get(n4)).D() >= (double)n2 && n3 < 20) {
                arrayList.add((EstatisticaJogadorCompeticao)this.ZW.get(n4));
                ++n3;
            }
            if (n3 >= 20) break;
            ++n4;
        }
        return arrayList;
    }

    public void F(ModeloJogador f2) {
        CandidatoSelecaoCampeonato y_02 = new CandidatoSelecaoCampeonato();
        y_02.a(f2);
        y_02.j(f2.gk());
        y_02.bi(f2.fT());
        if (this.ZZ == null) {
            this.ZZ = new ArrayList();
        }
        this.ZZ.add(y_02);
    }

    public void zH() {
        Collections.sort(this.ZZ, aab);
        int[] nArray = new int[]{1, 9, 3, 3, 2, 11, 11, 14, 14, 18, 18};
        int[] nArray2 = new int[]{1, 9, 8, 8, 2, 13, 13, 16, 16, 25, 25};
        VagasPais am2 = new VagasPais();
        am2.co(this.aaa.size() - 1);
        int n2 = 0;
        while (n2 <= 10) {
            int n3 = 0;
            while (n3 < this.ZZ.size()) {
                if (((CandidatoSelecaoCampeonato)this.ZZ.get(n3)).iR() >= nArray[n2] && ((CandidatoSelecaoCampeonato)this.ZZ.get(n3)).iR() <= nArray2[n2] && !am2.lV().contains(((CandidatoSelecaoCampeonato)this.ZZ.get(n3)).x())) {
                    am2.lV().add(((CandidatoSelecaoCampeonato)this.ZZ.get(n3)).x());
                    am2.lW().add(((CandidatoSelecaoCampeonato)this.ZZ.get(n3)).x().fg());
                    break;
                }
                ++n3;
            }
            ++n2;
        }
        this.aaa.add(am2);
        this.ZZ.clear();
    }

    public void BJ() {
        this.agA = null;
        this.agB = null;
    }

    public boolean BK() {
        int n2 = this.BN();
        return n2 > 0 && this.vagasSobemPeloMataMata > 0;
    }

    public int BL() {
        if (this.nRebaixados > 0) {
            return this.nRebaixados - this.rebaixadosDireto;
        }
        return 0;
    }

    public boolean BM() {
        if (this.nRebaixados > 0 && this.nRebaixados != this.rebaixadosDireto) {
            if (this.divisao == 4 && this.KR != null && this.KR.jc() == 29 && GerenciadorJogo.SR.bk()) {
                this.setRebaixadosDireto(this.nRebaixados);
                return false;
            }
            return true;
        }
        return false;
    }

    public int BN() {
        if (this.divisao > 1) {
            return this.KR.K(this.divisao);
        }
        return 0;
    }

    public int[] t(LigaPontosCorridos s2) {
        int[] nArray = new int[3];
        if (s2 == this.YL) {
            nArray[0] = this.KR.K(this.divisao);
            nArray[2] = this.KR.fq(this.divisao);
        }
        if (nArray[0] > 0) {
            nArray[1] = this.vagasSobemPeloMataMata;
            nArray[0] = nArray[0] - this.vagasSobemPeloMataMata;
        }
        return nArray;
    }

    public boolean ac(ModeloTime ah2) {
        return this.agB != null && this.agB.zp().size() > 0 && ((GeradorChaveMataMata)this.agB.zp().get(0)).zY().contains(ah2);
    }

    public void BO() {
        this.aT(true);
        this.BP();
    }

    public void r(ArrayList arrayList, ArrayList arrayList2) {
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((ModeloTime)arrayList.get(n2)).c(this, 1090, 1098);
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList2.size()) {
            ((ModeloTime)arrayList2.get(n2)).c(this, 1091, 1098);
            ++n2;
        }
    }

    public void BP() {
        if (this.KR != null) {
            CompeticaoLigaNacional b_02;
            CompeticaoLigaNacional b_03 = this.KR.fo(this.divisao);
            if (b_03 != null && b_03.BS()) {
                this.a(b_03);
            } else if (this.KR.fa(this.divisao)) {
                this.a((CompeticaoLigaNacional)null);
            }
            if (this.divisao > 1 && (b_02 = this.KR.fp(this.divisao)) != null && b_02.BS()) {
                b_02.a(this);
            }
        }
    }

    public void a(CompeticaoLigaNacional b_02) {
        if (this.BM() && this.agB == null) {
            int n2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
            arrayList = this.YL.fG(this.nRebaixados);
            if (this.YL.ze() == 1020) {
                n2 = 0;
                while (n2 < arrayList.size()) {
                    System.out.println(String.valueOf(arrayList.size()) + " lista rebaixamento: " + ((ModeloTime)arrayList.get(n2)).getNome());
                    ++n2;
                }
            }
            Collections.reverse(arrayList);
            n2 = this.nRebaixados - this.rebaixadosDireto;
            if (b_02 != null) {
                arrayList2 = b_02.yi().l(this.nRebaixados, true);
                Collections.reverse(arrayList2);
            } else if (this.KR != null) {
                arrayList2 = this.KR.ek();
            }
            int n3 = 0;
            while (n3 < n2) {
                if (n3 < arrayList.size() && n3 < arrayList2.size()) {
                    arrayList3.add((ModeloTime)arrayList.get(n3));
                    arrayList3.add((ModeloTime)arrayList2.get(n3));
                }
                ++n3;
            }
            if (arrayList3.size() > 0) {
                this.agB = new ChaveMataMata(null, arrayList3.size(), this.b(), 1, this.duasVoltasplayoffReb, this, 1098);
                GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
                g_02.a(this.agB, arrayList3, 0, this.duasVoltasplayoffReb[0], 0, 0, this.b(), false);
            }
        }
    }

    public void BQ() {
        if (this.divisao > 1 && this.agA == null && this.BK()) {
            int n2 = this.BN();
            int n3 = 4;
            int n4 = n2 - this.vagasSobemPeloMataMata;
            int n5 = n4 + n3;
            int n6 = 0;
            ArrayList arrayList = new ArrayList();
            ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
            arrayList.addAll(this.YL.l(n5, false));
            if (arrayList.size() >= n5) {
                int n7 = n4;
                while (n7 < n5) {
                    arrayList2.add((ModeloTime)arrayList.get(n7));
                    ++n7;
                }
                if (this.vagasSobemPeloMataMata == 2) {
                    n6 = 1;
                }
                this.agA = new ChaveMataMata(null, arrayList2.size(), this.b(), n6, this.duasVoltasMataMataSobe, this, 1099);
                GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
                g_02.a(this.agA, arrayList2, 0, this.duasVoltasMataMataSobe[0], 0, 0, this.b(), false);
            } else {
                this.aT(true);
                this.BP();
            }
        } else {
            this.aT(true);
            this.BP();
        }
    }

    @Override
    public String getNome() {
        if (this.yi() != null) {
            return this.yi().getNome();
        }
        return "Nacional";
    }

    public ArrayList zI() {
        return this.ZY;
    }

    public void zJ() {
        this.ZW.clear();
    }

    public void zK() {
        this.aaa.clear();
    }

    public void zL() {
        Collections.sort(this.ZW, tZ);
    }

    public ArrayList zM() {
        return this.ZX;
    }

    public LigaPontosCorridos yi() {
        return this.YL;
    }

    public void q(LigaPontosCorridos s2) {
        this.YL = s2;
    }

    public ArrayList zN() {
        return this.aaa;
    }

    public LigaNacional yg() {
        return this.KR;
    }

    public int zO() {
        if (this.KR != null) {
            return this.KR.jc();
        }
        return -1;
    }

    @Override
    public void mr() {
        if (this.YL.ze() == 1020 && this.ZU != null) {
            this.ZU.za();
        } else {
            this.YL.za();
        }
    }

    @Override
    public LigaNacional iq() {
        return this.KR;
    }

    @Override
    public int ip() {
        return this.divisao;
    }

    @Override
    public String P(boolean bl) {
        return this.YL.io();
    }

    @Override
    public String is() {
        return this.YL.is();
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YL};
        if (this.agB != null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.agB};
            l_0Array = l_0Array2;
        } else if (this.agA != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.agA};
            l_0Array = l_0Array3;
        } else if (this.YL.ze() == 1068) {
            l_0Array[0] = this.YL != null && this.YL.yQ().size() > 0 ? (this.YL.yY() != null ? this.YL.yY() : this.YL) : this.ZV;
        } else if (this.YL.ze() == 1020) {
            if (this.ZU != null) {
                l_0Array[0] = this.ZU.yY() != null ? this.ZU.yY() : this.ZU;
            }
        } else if (this.YL.yZ()) {
            FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{this.YL.yY()};
            l_0Array = l_0Array4;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        Object object;
        FaseCompeticao[] l_0Array;
        boolean bl = false;
        boolean bl2 = false;
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        if (this.YL.ze() == 1068) {
            l_0Array = new FaseCompeticao[]{this.ZV};
            arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
            if (this.YL != null && this.YL.yQ().size() > 0) {
                object = new FaseCompeticao[]{this.YL};
                arrayList.add(new ItemFormacao((FaseCompeticao[])object, "Fase de Grupos"));
            } else {
                arrayList.add(new ItemFormacao(null, "Fase de Grupos"));
            }
            object = new FaseCompeticao[]{this.yi().yY()};
            arrayList.add(new ItemFormacao((FaseCompeticao[])object, "Fase Final"));
            bl = true;
        } else if (this.YL.ze() == 1020) {
            l_0Array = new FaseCompeticao[]{this.YL};
            arrayList.add(new ItemFormacao(l_0Array, "Primeira Fase"));
            object = new FaseCompeticao[]{this.ZU};
            arrayList.add(new ItemFormacao((FaseCompeticao[])object, "Segunda Fase"));
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[1];
            if (this.ZU != null) {
                l_0Array2[0] = this.ZU.yY();
            }
            arrayList.add(new ItemFormacao(l_0Array2, "Final"));
            bl = true;
        } else if (this.YL.yX() > 0) {
            String string = "Primeira Fase";
            if (this.YL.yQ().size() > 0) {
                string = "Fase de Grupos";
            }
            object = new FaseCompeticao[]{this.yi()};
            arrayList.add(new ItemFormacao((FaseCompeticao[])object, string));
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.yi().yY()};
            arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
            bl = true;
        }
        if (this.BK()) {
            l_0Array = new FaseCompeticao[]{this.agA};
            arrayList.add(new ItemFormacao(l_0Array, "Mata-mata vagas ascenso"));
            bl2 = true;
        }
        if (this.BM()) {
            l_0Array = new FaseCompeticao[]{this.agB};
            object = "Playoff (" + String.valueOf(this.divisao) + "\u00aa div x " + String.valueOf(this.divisao + 1) + "\u00aa div)";
            if (this.divisao == 4) {
                object = "Playoff (" + String.valueOf(this.divisao) + "\u00aa div x " + "sem div.";
            }
            arrayList.add(new ItemFormacao(l_0Array, (String)object));
            bl2 = true;
        }
        if (!bl && bl2) {
            l_0Array = new FaseCompeticao[]{this.yi()};
            arrayList.add(0, new ItemFormacao(l_0Array, "Tabela Liga"));
            bl = true;
        }
        if (bl) {
            return arrayList;
        }
        return null;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        String string = "tr_nacional_" + EnumPaises.valueOf("P" + Integer.toString(this.KR.jc())).jA() + "_d" + Integer.toString(this.divisao);
        String string2 = "tr_nacionalgenerico";
        stringArray[0] = ConstantesJogo.w(string) ? string : (this.divisao == 1 ? (ConstantesJogo.w(string = "tr_nacional_" + EnumPaises.valueOf("P" + Integer.toString(this.KR.jc())).jA()) ? string : string2) : string2);
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public LigaPontosCorridos zP() {
        return this.ZU;
    }

    public ChaveMataMata zQ() {
        return this.ZV;
    }

    public void d(ChaveMataMata z2) {
        this.ZV = z2;
    }

    public boolean zc() {
        return this.agz;
    }

    public void aS(boolean bl) {
        this.agz = bl;
    }

    public int getnRebaixados() {
        return this.nRebaixados;
    }

    public void setnRebaixados(int n2) {
        this.nRebaixados = n2;
    }

    public int getRebaixadosDireto() {
        return this.rebaixadosDireto;
    }

    public void setRebaixadosDireto(int n2) {
        this.rebaixadosDireto = n2;
    }

    public int getVagasSobemPeloMataMata() {
        return this.vagasSobemPeloMataMata;
    }

    public void setVagasSobemPeloMataMata(int n2) {
        this.vagasSobemPeloMataMata = n2;
        if (this.vagasSobemPeloMataMata > 2) {
            this.vagasSobemPeloMataMata = 0;
        }
        if (this.vagasSobemPeloMataMata < 0) {
            this.vagasSobemPeloMataMata = 0;
        }
    }

    public boolean[] getDuasVoltasplayoffReb() {
        return this.duasVoltasplayoffReb;
    }

    public void a(boolean[] blArray) {
        this.duasVoltasplayoffReb = blArray;
    }

    public boolean[] getDuasVoltasMataMataSobe() {
        return this.duasVoltasMataMataSobe;
    }

    public void b(boolean[] blArray) {
        this.duasVoltasMataMataSobe = blArray;
    }

    public ChaveMataMata BR() {
        return this.agA;
    }

    public boolean BS() {
        return this.GU;
    }

    public void aT(boolean bl) {
        this.GU = bl;
    }
}

