package competicoes;

import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import motor.GerenciadorJogo;
import competicoes.GeradorChaveMataMata;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class CompeticaoMundialDeClubes
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata ZM = null;
    private ChaveMataMata ZN = null;
    private ModeloTime ZO = null;
    private ModeloTime ZP = null;
    private ModeloTime ZQ = null;
    private ModeloTime ZR = null;
    private ModeloTime ZS = null;
    private ModeloTime ZT = null;

    public CompeticaoMundialDeClubes() {
        this.setNome(GerenciadorIdioma.getString("mundialclubes"));
        this.F(5, 7);
        this.O(true);
    }

    public void zC() {
        this.ZM = null;
        this.ZN = null;
        this.ZO = null;
        this.ZP = null;
        this.ZQ = null;
        this.ZR = null;
        this.ZS = null;
        this.ZT = null;
        if (GerenciadorJogo.SR.aI() != null) {
            this.ZO = GerenciadorJogo.SR.aI().cS();
            GerenciadorJogo.SR.aI().N(this.ZO);
        }
        if (GerenciadorJogo.SR.aF() != null) {
            this.ZP = GerenciadorJogo.SR.aF().cS();
            GerenciadorJogo.SR.aF().N(this.ZP);
            if (this.ZP != null && this.ZP.getPais() == 131) {
                this.ZP = GerenciadorJogo.SR.aF().yx();
            }
        }
        if (GerenciadorJogo.SR.aO() != null) {
            this.ZQ = GerenciadorJogo.SR.aO().cS();
            GerenciadorJogo.SR.aO().N(this.ZQ);
        }
        if (GerenciadorJogo.SR.aL() != null) {
            this.ZR = GerenciadorJogo.SR.aL().cS();
            GerenciadorJogo.SR.aL().N(this.ZR);
        }
        if (GerenciadorJogo.SR.aQ() != null) {
            this.ZS = GerenciadorJogo.SR.aQ().cS();
            GerenciadorJogo.SR.aQ().N(this.ZS);
        }
        if (GerenciadorJogo.SR.aP() != null) {
            this.ZT = GerenciadorJogo.SR.aP().cS();
            GerenciadorJogo.SR.aP().N(this.ZT);
        }
        if (this.ZO != null && this.ZP != null && this.ZQ != null && this.ZR != null && this.ZS != null && this.ZT != null) {
            ModeloTime[] ahArray = new ModeloTime[]{this.ZQ, this.ZR, this.ZS, this.ZT};
            int[] nArray = new int[4];
            nArray[0] = 2;
            nArray[2] = 3;
            nArray[3] = 1;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[4];
            nArray3[0] = 3;
            nArray3[1] = 2;
            nArray3[2] = 1;
            int[] nArray4 = nArray3;
            int[] nArray5 = new int[4];
            nArray5[1] = 2;
            nArray5[2] = 3;
            nArray5[3] = 1;
            int[] nArray6 = nArray5;
            int n2 = new Random().nextInt(3);
            int[] nArray7 = new int[4];
            nArray7[0] = 2;
            nArray7[2] = 3;
            nArray7[3] = 1;
            int[] nArray8 = nArray7;
            nArray8 = n2 == 0 ? nArray2 : (n2 == 1 ? nArray4 : nArray6);
            ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
            int n3 = 0;
            while (n3 < 4) {
                arrayList.add(ahArray[nArray8[n3]]);
                ++n3;
            }
            boolean[] blArray = new boolean[7];
            this.ZM = new ChaveMataMata(null, arrayList.size(), this.b(), 1, blArray, this, -1);
            this.ZM.fc(150);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.ZM, arrayList, 0, false, 0, 0, this.b(), false);
        }
    }

    public void al(ArrayList arrayList) {
        if (arrayList.size() == 2) {
            ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
            arrayList2.add(this.ZP);
            arrayList2.add((ModeloTime)arrayList.get(0));
            arrayList2.add(this.ZO);
            arrayList2.add((ModeloTime)arrayList.get(1));
            boolean[] blArray = new boolean[7];
            this.ZN = new ChaveMataMata(null, arrayList2.size(), this.b(), 0, blArray, this, -1);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.ZN, arrayList2, 0, false, 0, 0, this.b(), false);
        }
    }

    public ChaveMataMata zD() {
        return this.ZM;
    }

    public ChaveMataMata zE() {
        return this.ZN;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.ZM) {
            return ConstantesJogo.pE;
        }
        return ConstantesJogo.pF;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.ZM};
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.ZM, this.ZN};
        if (this.ZN == null) {
            return l_0Array;
        }
        return l_0Array2;
    }

    @Override
    public void mr() {
        this.ZN.z(this);
    }

    public static ArrayList eX(int n2) {
        String[] stringArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray2 = null;
        if (n2 == 1) {
            stringArray2 = stringArray = new String[]{"Campe\u00e3o Libertadores", "vencedor quartas 1", "Campe\u00e3o L. Campe\u00f5es", "vencedor quartas 2"};
        } else if (n2 == 2) {
            stringArray2 = stringArray = new String[]{"Vencedor Semi-Final 1", "Vencedor Semi-Final 2", "Perdedor Semi-Final 1", "Perdedor Semi-Final 2"};
        }
        int n3 = 0;
        while (n3 < stringArray2.length) {
            arrayList.add(stringArray2[n3]);
            ++n3;
        }
        return arrayList;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_mundial";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

