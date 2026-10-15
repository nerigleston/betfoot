package components;

import components.PainelTipoCompeticao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoPainelCompeticao
implements ActionListener {
    final /* synthetic */ PainelTipoCompeticao PA;

    ListenerBotaoPainelCompeticao(PainelTipoCompeticao b2) {
        this.PA = b2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTipoCompeticao.a(this.PA).dispose();
    }
}

