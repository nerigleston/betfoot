package nucleo;

import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import nucleo.BuscadorTimeDestinoTransferencia;
import motor.GerenciadorJogo;
import java.util.ArrayList;
import java.util.Collections;

public class SorteadorJogadorAleatorio {
    ModeloTime gD = null;
    ModeloJogador gE = null;

    public SorteadorJogadorAleatorio() {
        this.ix();
        if (this.gE != null) {
            this.iy();
        }
    }

    private void ix() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(GerenciadorJogo.SR.P());
        Collections.shuffle(arrayList);
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ModeloJogador f2;
            if (!((ModeloTime)arrayList.get(n2)).jZ().booleanValue() && ((ModeloTime)arrayList.get(n2)).kw() >= 21 && (f2 = ((ModeloTime)arrayList.get(n2)).kv()) != null) {
                this.gE = f2;
                break;
            }
            ++n2;
        }
    }

    private void iy() {
        BuscadorTimeDestinoTransferencia l2 = new BuscadorTimeDestinoTransferencia(this.gE, this.gE.fk(), true, false, 0);
        l2.a(false, false);
        this.gD = l2.cK();
    }

    public ModeloTime iz() {
        return this.gD;
    }

    public ModeloJogador iA() {
        return this.gE;
    }
}

