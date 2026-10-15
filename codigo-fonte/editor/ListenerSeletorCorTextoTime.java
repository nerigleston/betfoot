package editor;

import editor.PainelEdicaoTime;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

class ListenerSeletorCorTextoTime
extends MouseAdapter {
    final /* synthetic */ PainelEdicaoTime VG;

    ListenerSeletorCorTextoTime(PainelEdicaoTime ac2) {
        this.VG = ac2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Color color = PainelEdicaoTime.g(this.VG).getBackground();
        color = JColorChooser.showDialog(PainelEdicaoTime.g(this.VG), "", PainelEdicaoTime.g(this.VG).getBackground());
        if (color != null) {
            PainelEdicaoTime.g(this.VG).setBackground(color);
        }
    }
}

