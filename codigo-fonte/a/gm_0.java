package a;

import a.gl_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gm_0
implements ActionListener {
    final /* synthetic */ gl_0 JZ;

    gm_0(gl_0 gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gl_0.a(this.JZ).setVisible(false);
    }
}

