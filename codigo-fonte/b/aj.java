package b;

import best.at;
import f.I;
import f.b_0;
import f.f_0;
import f.o;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class aj
extends JLabel
implements ListCellRenderer {
    private int w = 0;

    public aj(int n2) {
        this.w = n2;
    }

    public aj() {
    }

    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        this.setIcon(null);
        if (bl) {
            this.setBackground(Color.YELLOW);
            this.setForeground(jList.getSelectionForeground());
        } else {
            this.setBackground(jList.getBackground());
            this.setForeground(jList.getForeground());
        }
        if (object != null && object instanceof o) {
            o o2 = (o)object;
            this.setIcon(new ImageIcon(this.getClass().getResource("/aesticons/" + o2.yk() + ".png")));
            String string = o2.getNome();
            this.setText(string);
        } else if (object != null && object instanceof f_0) {
            f_0 f_02 = (f_0)object;
            String string = f_02.getNome();
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + f_02.yg().jc() + ".png")));
        } else if (object != null && object instanceof b_0) {
            b_0 b_02 = (b_0)object;
            String string = b_02.getNome();
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + b_02.zO() + ".png")));
        } else if (object != null && object instanceof I) {
            String string = "Supercopa";
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aicons/ic_ligas.png")));
        } else if (object != null) {
            at at2 = (at)object;
            String string = at2.getNome();
            this.setText(string);
            this.setIcon(at2.es());
            if (this.w == 1 && at2.b() == 15) {
                this.setText("Torneio Amistoso");
            }
        }
        return this;
    }
}

