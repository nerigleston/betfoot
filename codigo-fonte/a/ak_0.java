package a;

import best.ah;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ak_0
extends JLabel
implements ListCellRenderer {
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        if (object != null && object instanceof ah) {
            ah ah2 = (ah)object;
            String string = ah2.getNome();
            if (bl) {
                this.setBackground(jList.getSelectionBackground());
                this.setForeground(jList.getSelectionForeground());
            } else {
                this.setBackground(jList.getBackground());
                this.setForeground(jList.getForeground());
            }
            this.setIcon(ah2.kU());
            this.setText(string);
        }
        return this;
    }
}

