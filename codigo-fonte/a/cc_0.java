package a;

import a.cz_0;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class cc_0
implements DocumentListener {
    final /* synthetic */ cz_0 Da;

    cc_0(cz_0 cz_02) {
        this.Da = cz_02;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        cz_0.c(this.Da);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        cz_0.c(this.Da);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        cz_0.c(this.Da);
    }
}

