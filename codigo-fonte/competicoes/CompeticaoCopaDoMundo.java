package competicoes;

import nucleo.ListaTimes;
import nucleo.LigaNacional;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import configuracao.LoadLigaOptions;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CompeticaoCopaDoMundo
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YE = new ArrayList();
    private int YH = 0;
    private ArrayList YF = new ArrayList();
    private ArrayList YM = new ArrayList();
    private LigaNacional YN = null;
    private LigaNacional YO = null;
    private LigaNacional YG = null;
    private int[] Zw;
    private static final int[] GRUPOS_2026 = new int[]{131, 1, 49, 159, 38, 180, 27, 39, 29, 129, 62, 84, 68, 14, 150, 192, 3, 50, 60, 8, 85, 107, 179, 190, 21, 57, 98, 143, 65, 35, 195, 9, 72, 142, 169, 99, 11, 15, 10, 108, 154, 46, 157, 196, 97, 52, 75, 147};
    private static final int[] SEDES_2026 = new int[]{131, 68, 38};
    private static final int[][] CHAVE = new int[][]{{1, 4}, {3, 0}, {1, 8}, {3, 1}, {2, 0}, {2, 1}, {1, 5}, {2, 2}, {2, 10}, {2, 11}, {1, 7}, {2, 9}, {1, 3}, {3, 4}, {1, 6}, {3, 5}, {1, 2}, {2, 5}, {2, 4}, {2, 8}, {1, 0}, {3, 2}, {1, 11}, {3, 3}, {1, 9}, {2, 7}, {2, 3}, {2, 6}, {1, 1}, {3, 6}, {1, 10}, {3, 7}};
    private static final String[] TERCEIROS = new String[]{"ABCDF", "CDFGH", "BEFIJ", "AEHIJ", "CEFHI", "EHIJK", "EFGIJ", "DEIJL"};

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YE.clear();
        this.YF.clear();
    }

    public CompeticaoCopaDoMundo() {
        int[] nArray = new int[16];
        nArray[1] = 3;
        nArray[2] = 4;
        nArray[3] = 7;
        nArray[4] = 8;
        nArray[5] = 11;
        nArray[6] = 12;
        nArray[7] = 15;
        nArray[8] = 2;
        nArray[9] = 1;
        nArray[10] = 6;
        nArray[11] = 5;
        nArray[12] = 10;
        nArray[13] = 9;
        nArray[14] = 14;
        nArray[15] = 13;
        this.Zw = nArray;
        this.F(7, 7);
        this.O(true);
    }

    private void montar48(ArrayList arrayList) {
        this.YF.clear();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            ((LigaNacional)arrayList.get(i2)).z(true);
            this.YF.add(((LigaNacional)arrayList.get(i2)).jo());
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 48;
        loadLigaOptions.nGrupos = 12;
        loadLigaOptions.numeroTimesMataMata = 2;
        loadLigaOptions.doisTurnos = false;
        loadLigaOptions.duasVoltasMataMata = new boolean[7];
        loadLigaOptions.var0 = 7700;
        LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 7, null, false, null, true, this);
        s2.setNome(this.getNome());
        this.YD = s2;
        GerenciadorJogo.afQ.L(this.YF);
    }

    private static ArrayList sortear(ArrayList arrayList) {
        int n2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, LigaNacional.cN);
        ArrayList arrayList3 = new ArrayList();
        ArrayList[] arrayListArray = new ArrayList[4];
        for (n2 = 0; n2 < 4; ++n2) {
            arrayListArray[n2] = new ArrayList(arrayList2.subList(n2 * 12, n2 * 12 + 12));
            Collections.shuffle(arrayListArray[n2]);
        }
        for (n2 = 0; n2 < 12; ++n2) {
            for (int i2 = 0; i2 < 4; ++i2) {
                arrayList3.add(arrayListArray[i2].get(n2));
            }
        }
        return arrayList3;
    }

    public void ya() {
        ArrayList<LigaNacional> arrayList;
        if (GerenciadorJogo.SR.H() > 1) {
            this.Bu();
            return;
        }
        this.YE.clear();
        this.YF.clear();
        this.YD = null;
        ++this.YH;
        this.YG = this.eY(0);
        if (GerenciadorJogo.SR.isUsarGruposReaisCopa()) {
            arrayList = new ArrayList<LigaNacional>();
            for (int i2 = 0; i2 < GRUPOS_2026.length; ++i2) {
                arrayList.add(GerenciadorJogo.SR.s(GRUPOS_2026[i2]));
            }
        } else {
            int n2;
            for (int i3 = 0; i3 < SEDES_2026.length; ++i3) {
                this.YE.add(GerenciadorJogo.SR.s(SEDES_2026[i3]));
            }
            this.YE.addAll(this.YM);
            int[] nArray = new int[]{16, 6, 9, 8, 3, 1};
            int n3 = new Random().nextInt(100) + 1;
            int n4 = n3 <= 50 ? 2 : 3;
            nArray[n4] = nArray[n4] + 1;
            int n5 = n3 <= 50 ? 3 : 1;
            nArray[n5] = nArray[n5] + 1;
            for (n2 = 0; n2 <= 5; ++n2) {
                if (nArray[n2] <= 0) continue;
                LigaNacional.a(true, n2, nArray[n2], this.YE, false, this.YN);
            }
            for (n2 = 0; n2 <= 5 && this.YE.size() < 48; ++n2) {
                LigaNacional.a(true, n2, 48 - this.YE.size(), this.YE, false, this.YN);
            }
            while (this.YE.size() > 48) {
                this.YE.remove(this.YE.size() - 1);
            }
            ArrayList<LigaNacional> arrayList2 = arrayList = this.YE.size() == 48 ? CompeticaoCopaDoMundo.sortear(this.YE) : null;
        }
        if (arrayList != null) {
            this.montar48(arrayList);
        }
        this.YM.clear();
        this.YN = null;
        this.YF.clear();
        this.YE.clear();
    }

    public void Bu() {
        ++this.YH;
        this.YG = this.eY(0);
        this.YE.clear();
        this.YE.addAll(this.YM);
        this.YM.clear();
        for (int i2 = 0; i2 <= 5 && this.YE.size() < 48; ++i2) {
            LigaNacional.a(true, i2, 48 - this.YE.size(), this.YE, false, null);
        }
        while (this.YE.size() > 48) {
            this.YE.remove(this.YE.size() - 1);
        }
        this.montar48(CompeticaoCopaDoMundo.sortear(this.YE));
        this.YF.clear();
        this.YE.clear();
    }

    private static boolean distribuir(int n2, int[] nArray, boolean[] blArray, int[] nArray2) {
        if (n2 == TERCEIROS.length) {
            return true;
        }
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (blArray[i2] || TERCEIROS[n2].indexOf((char)(65 + nArray[i2])) < 0) continue;
            blArray[i2] = true;
            nArray2[n2] = i2;
            if (CompeticaoCopaDoMundo.distribuir(n2 + 1, nArray, blArray, nArray2)) {
                return true;
            }
            blArray[i2] = false;
        }
        return false;
    }

    private ArrayList chave2026() {
        ArrayList arrayList = this.YD.yQ();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            ArrayList arrayList5 = ((ListaTimes)arrayList.get(i2)).gR();
            Collections.sort(arrayList5, ColecaoComparadoresSorteio.abn);
            arrayList2.add(arrayList5.get(2));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abn);
        arrayList3 = new ArrayList(arrayList3.subList(0, 8));
        int[] object = new int[8];
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
            if (!arrayList3.contains(arrayList2.get(i3))) continue;
            object[arrayList4.size()] = i3;
            arrayList4.add(arrayList2.get(i3));
        }
        int[] nArray = new int[8];
        if (!CompeticaoCopaDoMundo.distribuir(0, (int[])object, new boolean[8], nArray)) {
            for (int i4 = 0; i4 < 8; ++i4) {
                nArray[i4] = i4;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < CHAVE.length; ++i5) {
            int n2 = CHAVE[i5][0];
            int n3 = CHAVE[i5][1];
            if (n2 == 3) {
                arrayList5.add(arrayList4.get(nArray[n3]));
                continue;
            }
            arrayList5.add(((ListaTimes)arrayList.get(n3)).gR().get(n2 - 1));
        }
        return arrayList5;
    }

    public void yt() {
        Object object;
        ArrayList arrayList;
        if (this.YD.yQ().size() == 12) {
            arrayList = this.chave2026();
        } else {
            int n2;
            object = new ArrayList();
            for (n2 = 0; n2 < this.YD.yQ().size(); ++n2) {
                ((ArrayList)object).add(((ListaTimes)this.YD.yQ().get(n2)).gR().get(0));
                ((ArrayList)object).add(((ListaTimes)this.YD.yQ().get(n2)).gR().get(1));
            }
            arrayList = new ArrayList();
            if (((ArrayList)object).size() == 16) {
                for (n2 = 0; n2 < ((ArrayList)object).size(); ++n2) {
                    arrayList.add(((ArrayList)object).get(this.Zw[n2]));
                }
            }
            if (((ArrayList)object).size() == 32) {
                for (n2 = 0; n2 < this.Zw.length; ++n2) {
                    arrayList.add(((ArrayList)object).get(this.Zw[n2]));
                }
                for (n2 = 0; n2 < this.Zw.length; ++n2) {
                    arrayList.add(((ArrayList)object).get(this.Zw[n2] + 16));
                }
            }
        }
        boolean[] blArray = new boolean[7];
        this.YD.c(new ChaveMataMata(null, arrayList.size(), this.b(), 0, blArray, this, -1));
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YD.yY(), arrayList, 0, blArray[0], 0, 0, this.b(), false);
    }

    public static String ab(int n2, int n3) {
        String[][] stringArrayArray = new String[][]{{"Moscou", "Ecaterimburgo", "S\u00e3o Petesburgo", "S\u00f3chi", "Caz\u00e3", "Saransk", "Moscou", "Kaliningrado", "Samara", "Rostov", "Moscou", "N\u00edjni Novgorod", "S\u00f3chi", "Volgogrado", "Saransk", "Moscou"}, {"S\u00e3o Petesburgo", "Rostov", "Moscou", "Caz\u00e3", "Samara", "Ecaterimburgo", "N\u00edjni Novgorod", "Volgogrado", "S\u00e3o Petesburgo", "Kaliningrado", "Rostov", "S\u00f3chi", "Moscou", "N\u00edjni Novgorod", "Ecaterimburgo", "Caz\u00e3"}, {"Samara", "Volgogrado", "Saransk", "Kaliningrado", "Moscou", "S\u00f3chi", "S\u00e3o Petesburgo", "Rostov", "Moscou", "N\u00edjni Novgorod", "Ecaterimburgo", "Caz\u00e3", "Kaliningrado", "Saransk", "Samara", "Volgogrado"}, {"S\u00f3chi", "Caz\u00e3", "Samara", "Rostov", "Moscou (Luzhniki)", "N\u00edjni Novgorod", "S\u00e3o Petersburgo", "Moscou (Spartak)", "", "", "", "", "", "", "", ""}, {"N\u00edjni Novgorod", "Caz\u00e3", "S\u00f3chi", "Samara", "", "", "", "", "", "", "", "", "", "", "", ""}, {"S\u00e3o Petersburgo", "Moscou (Luzhniki)", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"Moscou (Luzhniki)", "S\u00e3o Petersburgo", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}};
        return stringArrayArray[n2][n3];
    }

    public LigaNacional eY(int n2) {
        int n3 = this.YH + n2;
        int[] nArray = new int[]{39, 131, 65, 11, 104, 97, 43, 3, 29, 162};
        if ((n3 %= 10) >= 0 && n3 < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n3]);
        }
        return null;
    }

    @Override
    public int cy(int n2) {
        int n3 = 45000;
        int[] nArray = new int[]{80000, 65000, 52698, 48134, 45600, 34990, 37215, 28065};
        int[] nArray2 = new int[]{45000, 42000, 32698, 38134, 35600, 34990, 37215, 28065};
        if (this.YG != null && this.YG.jc() != 11 && this.YG.jc() != 29 && this.YG.jc() != 131) {
            nArray = nArray2;
        }
        if (n2 <= 7) {
            n3 = nArray[n2];
        } else if (n2 - 8 < nArray.length) {
            n3 = nArray[n2 - 8];
        }
        return n3;
    }

    @Override
    public String cx(int n2) {
        String[][] stringArrayArray = new String[][]{{"Lusail", "Al Khor", "Doha", "Al Wakrah", "Umm Salal", "Madinat", "Al Rayyan", "Doha"}, {"Nova York", "Los Angeles", "Atlanta", "Cid. M\u00e9xico", "Boston", "Guadalajara", "San Francisco", "Houston", "Monterrey", "Dallas", "Vancouver", "Toronto"}, {"Buenos Aires", "Santiago", "Montevid\u00e9u", "Assunci\u00f3n", "C\u00f3rdoba", "Concepci\u00f3n", "Mendoza", "Ros\u00e1rio", "La Plata", "Santa F\u00e9", "Almagro"}, {"Madrid", "Lisaboa", "Barcelona", "Porto", "Sevilha", "Val\u00eancia", "Braga", "M\u00e1laga", "Bilbau", "Braga"}, {"Roma", "Mil\u00e3o", "Turim", "Bologna", "Cagliari", "G\u00eanoa", "Floren\u00e7a", "Udine"}, {"Londres", "Liverpool", "Manchester", "Notthingam", "Leeds", "Coventry", "Sheffield", "Bristol"}, {"Pequim", "Guangzhou", "Hangzhou", "Nanquim", "Jinan", "Xangai", "Tianjin", "Chongqing"}, {"Berlim", "Munique", "Hamburgo", "Dortmund", "Frankfurt", "Hannover", "Leipzig", "Nuremberg"}, {"Rio de Janeiro", "S\u00e3o Paulo", "Belo Horizonte", "Fortaleza", "Salvador", "Porto Alegre", "Recife", "Curitiba"}, {"Moscou", "S\u00e3o Petesburgo", "Kazan", "Kaliningrad", "Yaroslavl", "Samara", "Volgograd", "Yekaterinburg"}};
        int n3 = this.YH % 10;
        if (n2 < stringArrayArray[n3].length) {
            return stringArrayArray[n3][n2];
        }
        return n2 - stringArrayArray[n3].length < stringArrayArray[n3].length ? stringArrayArray[n3][n2 - stringArrayArray[n3].length] : stringArrayArray[n3][0];
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public void a(Competicao at2, LigaNacional z2) {
        this.YM.add(z2);
        z2.jo().e(at2, 1);
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD.yZ()) {
            l_0Array = new FaseCompeticao[]{this.YD.yY()};
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        arrayList.add(new ItemFormacao(new FaseCompeticao[]{this.YD}, "Fase de Grupos"));
        arrayList.add(new ItemFormacao(new FaseCompeticao[]{this.YD.yY()}, "Fase Final"));
        return arrayList;
    }

    @Override
    public String[] mA() {
        return new String[]{"tr_copamundo", this.getNome()};
    }

    public int ye() {
        return this.YH;
    }

    @Override
    public void mr() {
        this.YD.za();
    }
}

