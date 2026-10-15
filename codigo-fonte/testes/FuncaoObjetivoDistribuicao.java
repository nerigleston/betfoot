package testes;

import testes.FuncaoParaRaiz;
import testes.FuncoesEstatisticas;

class FuncaoObjetivoDistribuicao
implements FuncaoParaRaiz {
    public double Ws = 0.0;
    public double Wt = 0.0;
    public double Wu = 0.0;
    public double Wv = 0.0;

    FuncaoObjetivoDistribuicao() {
    }

    @Override
    public double m(double d2) {
        double d3 = this.Wv - FuncoesEstatisticas.a(this.Ws, this.Wt, this.Wu, d2);
        return d3;
    }
}

