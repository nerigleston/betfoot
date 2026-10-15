package d;

import e.g;
import best.n_0;
import d.ai;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class an
implements ActionListener {
    final /* synthetic */ ai VN;

    an(ai ai2) {
        this.VN = ai2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (ai.b(this.VN).getSelectedRow() >= 0) {
            if (ai.d(this.VN).getJogadores().size() >= 30) {
                ai.c(this.VN).setText("O time de destino n\u00e3o tem vaga");
            } else {
                if (n_0.da().wL() != null && n_0.da().wK() && n_0.da().wI() != ai.d(this.VN)) {
                    ai.d(this.VN).getJogadores().add(n_0.da().wL());
                    n_0.da().wI().getJogadores().remove(n_0.da().wL());
                } else {
                    ai.c(this.VN).setText("N\u00e3o foi poss\u00edvel transferir");
                }
                n_0.da().a((g)null);
                n_0.da().wJ().setRowSelectionInterval(0, 0);
                n_0.da().wJ().addNotify();
                n_0.da().Uw.dispose();
                n_0.da().c(ai.d(this.VN));
            }
        }
    }
}

