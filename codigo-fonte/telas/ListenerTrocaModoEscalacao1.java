package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTrocaModoEscalacao1
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerTrocaModoEscalacao1(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacao.e(this.Bq).bV(1);
        TelaEscalacao.a(this.Bq, TelaEscalacao.e(this.Bq).kS());
        TelaEscalacao.b(this.Bq, -1);
        TelaEscalacao.c(this.Bq, -1);
    }
}

