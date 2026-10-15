package telas;

import telas.PainelEmprestimosJogadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharPainelEmprestimos
implements ActionListener {
    final /* synthetic */ PainelEmprestimosJogadores Ar;

    ListenerFecharPainelEmprestimos(PainelEmprestimosJogadores bs_02) {
        this.Ar = bs_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelEmprestimosJogadores.a(this.Ar).dispose();
    }
}

