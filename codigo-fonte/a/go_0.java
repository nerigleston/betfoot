package a;

import a.gl_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class go_0
extends MouseAdapter {
    final /* synthetic */ gl_0 JZ;

    go_0(gl_0 gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        gl_0.a(this.JZ, mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        gl_0.b(this.JZ, mouseEvent);
    }
}

