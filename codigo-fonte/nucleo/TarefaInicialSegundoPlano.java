package nucleo;

import nucleo.BalancoFinanceiro;

public class TarefaInicialSegundoPlano
implements Runnable {
    @Override
    public void run() {
        BalancoFinanceiro.ey();
    }
}

