package a;

import a.gl_0;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class gp_0
extends MouseMotionAdapter {
    final /* synthetic */ gl_0 JZ;

    gp_0(gl_0 gl_02) {
        this.JZ = gl_02;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        gl_0.c(this.JZ, mouseEvent);
    }
}

