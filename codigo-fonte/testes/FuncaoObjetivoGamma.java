package testes;

import testes.FuncaoParaRaiz;
import testes.FuncoesEstatisticas;

class FuncaoObjetivoGamma
implements FuncaoParaRaiz {
    public double Wu = 0.0;

    FuncaoObjetivoGamma() {
    }

    @Override
    public double m(double d2) {
        double d3 = this.Wu - FuncoesEstatisticas.y(d2);
        return d3;
    }
}

