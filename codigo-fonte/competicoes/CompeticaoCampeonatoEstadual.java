package competicoes;

import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.CarregadorConfigEstadual;
import components.ItemFormacao;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.util.ArrayList;

public class CompeticaoCampeonatoEstadual
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private CarregadorConfigEstadual YK = null;
    private LigaPontosCorridos YL = null;
    private int divisao = 0;
    private int nRebaixados = 0;

    public CompeticaoCampeonatoEstadual() {
    }

    public CompeticaoCampeonatoEstadual(CarregadorConfigEstadual w2, int n2) {
        this.YK = w2;
        this.divisao = n2;
        this.F(3, w2.getEstado());
        if (n2 == 1) {
            this.setNome(ConstantesJogo.rZ[w2.getEstado()]);
        } else {
            this.setNome(String.valueOf(ConstantesJogo.rZ[w2.getEstado()]) + " - " + String.valueOf(n2) + "\u00aa divis\u00e3o");
        }
    }

    public LigaPontosCorridos yi() {
        return this.YL;
    }

    public void q(LigaPontosCorridos s2) {
        this.YL = s2;
    }

    public CarregadorConfigEstadual yj() {
        return this.YK;
    }

    public int yk() {
        return this.YK.getEstado();
    }

    @Override
    public void mr() {
        this.YL.za();
    }

    @Override
    public CarregadorConfigEstadual ir() {
        return this.YK;
    }

    @Override
    public int ip() {
        return this.divisao;
    }

    @Override
    public String is() {
        return this.YL.is();
    }

    public static ArrayList eX(int n2) {
        String[] stringArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray2 = null;
        if (n2 == 7) {
            stringArray2 = stringArray = new String[]{"1\u00ba Grupo A", "2\u00ba Grupo A", "1\u00ba Grupo B", "2\u00ba Grupo B", "1\u00ba Grupo C", "2\u00ba Grupo C", "1\u00ba Grupo D", "2\u00ba Grupo D"};
        } else if (n2 == 1) {
            stringArray2 = stringArray = new String[]{"1\u00ba Grupo A", "2\u00ba Grupo A", "1\u00ba Grupo B", "2\u00ba Grupo B", "1\u00ba Grupo C", "2\u00ba Grupo C", "1\u00ba Grupo D", "2\u00ba Grupo D"};
        } else if (n2 == 0) {
            stringArray2 = stringArray = new String[]{"1\u00ba", "2\u00ba"};
        } else if (n2 == 2 || n2 == 4 || n2 == 7 || n2 == 9) {
            stringArray2 = stringArray = new String[]{"1\u00ba", "4\u00ba", "2\u00ba", "3\u00ba"};
        } else if (n2 == 3 || n2 == 5) {
            stringArray2 = stringArray = new String[]{"2\u00ba", "7\u00ba", "4\u00ba", "5\u00ba", "1\u00ba", "8\u00ba", "6\u00ba", "3\u00ba"};
        } else if (n2 == 6) {
            stringArray2 = stringArray = new String[]{"2\u00ba no geral", "7\u00ba no geral", "4\u00ba no geral", "5\u00ba no geral", "1\u00ba no geral", "8\u00ba no geral", "6\u00ba no geral", "3\u00ba no geral"};
        } else if (n2 == 8) {
            stringArray2 = stringArray = new String[]{"Campe\u00e3o 1\u00ba turno", "Campe\u00e3o 2\u00ba turno"};
        }
        if (n2 == 318) {
            stringArray2 = stringArray = new String[]{"1\u00ba Grupo C", "4\u00ba Grupo C", "2\u00ba Grupo C", "3\u00ba Grupo C"};
        }
        if (n2 == 319) {
            stringArray2 = stringArray = new String[]{"5\u00ba Grupo C", "1\u00ba Grupo D", "6\u00ba Grupo C", "2\u00ba Grupo D"};
        }
        if (n2 == 1802 || n2 == 1803) {
            stringArray2 = stringArray = new String[]{"2\u00ba Grupo C", "1\u00ba Grupo B", "2\u00ba Grupo B", "1\u00ba Grupo C"};
        }
        if (n2 == 14 || n2 == 14) {
            stringArray2 = stringArray = new String[]{"1\u00ba Grupo A", "2\u00ba Grupo B", "1\u00ba Grupo B", "2\u00ba Grupo A"};
        }
        int n3 = 0;
        while (n3 < stringArray2.length) {
            arrayList.add(stringArray2[n3]);
            ++n3;
        }
        return arrayList;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YL};
        if (this.YL.yZ()) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YL.yY()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        if (this.YL.yX() > 0) {
            ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
            String string = "Primeira Fase";
            if (this.YL.yQ().size() > 0) {
                string = "Fase de Grupos";
            }
            FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.yi()};
            arrayList.add(new ItemFormacao(l_0Array, string));
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.yi().yY()};
            arrayList.add(new ItemFormacao(l_0Array2, "Fase Final"));
            return arrayList;
        }
        return null;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        String string = "tr_estadual_" + ConstantesJogo.rX[this.YK.getEstado()] + "_d" + Integer.toString(this.divisao);
        String string2 = "tr_estadualgenerico";
        stringArray[0] = ConstantesJogo.w(string) ? string : (this.divisao == 1 ? (ConstantesJogo.w(string = "tr_estadual_" + ConstantesJogo.rX[this.YK.getEstado()]) ? string : string2) : string2);
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public int getnRebaixados() {
        return this.nRebaixados;
    }

    public void setnRebaixados(int n2) {
        this.nRebaixados = n2;
    }

    public int[] t(LigaPontosCorridos s2) {
        int[] nArray = new int[3];
        if (s2 == this.YL) {
            nArray[0] = this.YK.K(this.divisao);
        }
        return nArray;
    }
}

