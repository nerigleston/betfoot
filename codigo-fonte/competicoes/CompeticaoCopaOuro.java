package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import configuracao.LoadLigaOptions;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoCopaOuro
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata YJ = null;
    private LigaPontosCorridos YD = null;
    private ArrayList YE = new ArrayList();
    private ArrayList YF = new ArrayList();
    private LigaNacional YG = null;
    private int YH = 0;

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YJ = null;
        this.YE.clear();
        this.YF.clear();
    }

    public CompeticaoCopaOuro() {
        this.F(7, 4);
        this.O(true);
    }

    public void ya() {
        this.YE.clear();
        this.YF.clear();
        this.YD = null;
        this.YJ = null;
        int n2 = 16;
        ++this.YH;
        this.YG = this.yb();
        if (this.YG == null || !this.YG.jl()) {
            ++n2;
        } else {
            this.YE.add(this.YG);
        }
        LigaNacional.a(false, 4, n2, this.YE, false, null);
        if (this.YE.size() >= 16) {
            LigaPontosCorridos s2;
            ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
            int n3 = 0;
            while (n3 < this.YE.size()) {
                arrayList.add(((LigaNacional)this.YE.get(n3)).jo());
                ((LigaNacional)this.YE.get(n3)).z(true);
                ++n3;
            }
            Collections.sort(this.YF, ColecaoComparadoresSorteio.cN);
            ArrayList arrayList2 = ColecaoComparadoresSorteio.ad(4, 4);
            int n4 = 0;
            while (n4 < arrayList2.size()) {
                this.YF.add((ModeloTime)arrayList.get((Integer)arrayList2.get(n4)));
                ++n4;
            }
            boolean[] blArray = new boolean[7];
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 16;
            loadLigaOptions.nGrupos = 4;
            loadLigaOptions.numeroTimesMataMata = 2;
            loadLigaOptions.doisTurnos = false;
            loadLigaOptions.duasVoltasMataMata = blArray;
            loadLigaOptions.melhoresTerceiros = false;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 7, null, false, null, true, this);
            s2.setNome(this.getNome());
            GerenciadorJogo.afQ.L(this.YF);
        }
    }

    @Override
    public int cy(int n2) {
        int n3 = this.YH - 1;
        n3 %= 10;
        int n4 = 45000;
        int[] nArray = new int[]{75000, 65000, 52698, 48134, 45600, 34990, 37215, 28065};
        int[] nArray2 = new int[]{45000, 42000, 32698, 38134, 35600, 34990, 37215, 28065};
        if (this.YG != null && this.YG.jc() != 131 && this.YG.jc() != 68) {
            nArray = nArray2;
        }
        if (n2 <= 7) {
            n4 = nArray[n2];
        } else if (n2 - 8 < nArray.length) {
            n4 = nArray[n2 - 8];
        }
        return n4;
    }

    @Override
    public String cx(int n2) {
        int n3 = this.YH - 1;
        n3 %= 10;
        String[][] stringArrayArray = new String[][]{{"Cidade do M\u00e9xico", "Guadalajara", "Puebla", "Tijuana", "Le\u00f3n", "Monterrey", "Morelia", "Toluca"}, {"Los Angeles", "Chicago", "Miami", "S\u00e3o Francisco", "Detroid", "Filad\u00e9lfia", "Seattle", "Nova York"}, {"Toronto", "Montreal", "Calgary", "Ottawa", "Edmonton", "Winnipeg", "Vancouver", "Brampton"}, {"San Jos\u00e9", "Lim\u00f3n", "Alajuela", "Heredia", "Cinco Esquinas", "Desamparados", "Liberia", "Puntarenas"}, {"Havana", "Santiago de Cuba", "Camag\u00fcey", "Holgu\u00edn", "Santa Clara", "Cienfuegos", "Bayamo", "Pinar del R\u00edo"}, {"Cidade do M\u00e9xico", "Guadalajara", "Nezahualc\u00f3yotl", "Zapopan", "Le\u00f3n", "Monterrey", "San Luis", "Toluca"}, {"Nova York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Miami", "Filad\u00e9lfia", "Dallas"}, {"Man\u00e1gua", "Le\u00f3n", "Masaya", "Tipitapa", "Estel\u00ed", "Granada", "Ciudad Sandino", "Matagalpa"}, {"Cidade do M\u00e9xico", "Guadalajara", "Puebla", "Morelos", "Le\u00f3n", "Monterrey", "M\u00e9rida", "Toluca"}, {"Los Angeles", "Chicago", "Miami", "S\u00e3o Francisco", "Detroid", "Filad\u00e9lfia", "Seattle", "Nova York"}};
        String string = null;
        int n4 = n2;
        if (n2 > 7) {
            n4 = n2 - 8;
        }
        if (n4 < stringArrayArray[n3].length) {
            string = stringArrayArray[n3][n4];
        }
        return string;
    }

    public LigaNacional yb() {
        int n2 = this.YH - 1;
        int[] nArray = new int[]{131, 68, 38, 51, 53, 131, 68, 139, 131, 68};
        if ((n2 %= 10) >= 0 && n2 < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"1\u00ba Grupo A", "2\u00ba Grupo B", "1\u00ba Grupo D", "2\u00ba Grupo C", "1\u00ba Grupo B", "2\u00ba Grupo A", "1\u00ba Grupo C", "2\u00ba Grupo D"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public void p(LigaPontosCorridos s2) {
        this.YD = s2;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD.yZ()) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array, "Fase de Grupos"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase Final"));
        return arrayList;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_copaouro";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public int ye() {
        return this.YH;
    }

    @Override
    public void mr() {
        this.YD.za();
    }
}

