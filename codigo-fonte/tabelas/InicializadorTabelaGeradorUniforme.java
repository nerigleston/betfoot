package tabelas;

import nucleo.ConstantesJogo;
import testes.GeradorUniformeAleatorio;

public class InicializadorTabelaGeradorUniforme {
    public InicializadorTabelaGeradorUniforme() {
        int[] nArray = new int[]{634112, 3254568, 3143594, 31935239, 5303933, 223123};
        int n2 = 0;
        while (n2 < nArray.length) {
            GeradorUniformeAleatorio.aa(ConstantesJogo.tH[n2], ConstantesJogo.tE[n2]);
            ++n2;
        }
    }
}

