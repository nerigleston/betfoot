package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import java.util.ArrayList;

public final class SorteioAdversarios {
    public static void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean bl) {
        LigaNacional z2 = null;
        int n2 = 0;
        while (n2 < arrayList.size()) {
            z2 = (LigaNacional)GerenciadorJogo.SR.aG().get(((ModeloCoeficientePais)arrayList.get(n2)).uW());
            if (((ModeloCoeficientePais)arrayList.get(n2)).uY()) {
                bl = true;
            }
            z2.a(((ModeloCoeficientePais)arrayList.get(n2)).uX(), arrayList2, arrayList3, bl);
            ++n2;
        }
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2, int n2, ArrayList arrayList3) {
        if (arrayList.size() < n2) {
            ArrayList<ModeloCoeficientePais> arrayList4 = new ArrayList<ModeloCoeficientePais>();
            int n3 = 0;
            while (n3 < arrayList2.size()) {
                if (arrayList.size() >= n2) break;
                arrayList4.clear();
                arrayList4.add(new ModeloCoeficientePais("mesmo pais", ((ModeloCoeficientePais)arrayList2.get(n3)).uW(), 1));
                SorteioAdversarios.a(arrayList4, arrayList, arrayList3, false);
                ++n3;
            }
        }
    }

    public static void a(int n2, int n3, ArrayList arrayList, ArrayList arrayList2, int n4, AtributosJogador al2) {
        int n5 = 0;
        int n6 = 0;
        boolean bl = false;
        boolean bl2 = false;
        int n7 = 0;
        while (n7 < arrayList.size()) {
            if (((ModeloCoeficientePais)arrayList.get(n7)).uW() == n4) {
                n5 += ((ModeloCoeficientePais)arrayList.get(n7)).uX();
                if (((ModeloCoeficientePais)arrayList.get(n7)).uY()) {
                    bl = true;
                }
            }
            ++n7;
        }
        if (arrayList2 != null) {
            n7 = 0;
            while (n7 < arrayList2.size()) {
                if (((ModeloCoeficientePais)arrayList2.get(n7)).uW() == n4) {
                    n6 += ((ModeloCoeficientePais)arrayList2.get(n7)).uX();
                    if (((ModeloCoeficientePais)arrayList2.get(n7)).uY()) {
                        bl2 = true;
                    }
                }
                ++n7;
            }
        }
        if (n2 == 1 && n3 == 1) {
            ModeloTime ah2 = GerenciadorJogo.SR.aF().cS();
            ModeloTime ah3 = GerenciadorJogo.SR.aH().cS();
            if (ah2 != null && ah2 == ah3 && n4 == ah2.getPais()) {
                ++n5;
            }
        }
        if (bl) {
            --n5;
        }
        if (bl2) {
            --n6;
        }
        if (n3 == 1) {
            al2.ea(n5);
            al2.eb(n6);
            if (bl) {
                al2.ee(1);
            }
            if (bl2) {
                al2.ef(1);
            }
        } else if (n3 == 2) {
            al2.ec(n5);
            al2.ed(n6);
            if (bl) {
                al2.eg(1);
            }
            if (bl2) {
                al2.eh(1);
            }
        } else if (n3 == 3) {
            al2.fA(n5);
            al2.fB(n6);
            if (bl) {
                al2.fC(1);
            }
            if (bl2) {
                al2.fD(1);
            }
        }
    }
}

