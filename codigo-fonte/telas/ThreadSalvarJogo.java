package telas;

import telas.PainelAguardeProcesso;

public class ThreadSalvarJogo
extends Thread {
    final /* synthetic */ PainelAguardeProcesso LA;

    public ThreadSalvarJogo(PainelAguardeProcesso hz2) {
        this.LA = hz2;
    }

    @Override
    public void run() {
        this.LA.sh();
    }
}

