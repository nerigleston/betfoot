package d;

import best.ad;
import best.n_0;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class a_0
extends JLabel
implements ListCellRenderer {
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        String string = (String)object;
        if (bl) {
            this.setBackground(jList.getSelectionBackground());
            this.setForeground(jList.getSelectionForeground());
        } else {
            this.setBackground(jList.getBackground());
            this.setForeground(jList.getForeground());
        }
        ImageIcon imageIcon = ((ad)n_0.cY().get(n_0.h(string))).jD();
        String string2 = ((ad)n_0.cY().get(n_0.h(string))).getNome();
        this.setIcon(imageIcon);
        this.setText(string2);
        return this;
    }
}

