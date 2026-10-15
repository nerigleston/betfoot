package editor;

import editor.PainelEdicaoTime;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

class ListenerSeletorCorFundoTime
extends MouseAdapter {
    final /* synthetic */ PainelEdicaoTime VG;

    ListenerSeletorCorFundoTime(PainelEdicaoTime ac2) {
        this.VG = ac2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Color color = PainelEdicaoTime.f(this.VG).getBackground();
        color = JColorChooser.showDialog(PainelEdicaoTime.f(this.VG), "", PainelEdicaoTime.f(this.VG).getBackground());
        if (color != null) {
            PainelEdicaoTime.f(this.VG).setBackground(color);
        }
    }
}

