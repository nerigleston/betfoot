package a;

import a.dz_0;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class df_0
implements DocumentListener {
    final /* synthetic */ dz_0 Gn;

    df_0(dz_0 dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        dz_0.e(this.Gn);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        dz_0.e(this.Gn);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        dz_0.e(this.Gn);
    }
}

