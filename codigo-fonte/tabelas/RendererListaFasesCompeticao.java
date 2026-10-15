package tabelas;

import components.ItemFormacao;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererListaFasesCompeticao
extends JLabel
implements ListCellRenderer {
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        this.setIcon(null);
        if (bl) {
            this.setBackground(Color.YELLOW);
            this.setForeground(jList.getSelectionForeground());
        } else {
            this.setBackground(jList.getBackground());
            this.setForeground(jList.getForeground());
        }
        if (object != null) {
            ItemFormacao y2 = (ItemFormacao)object;
            String string = y2.tZ();
            this.setText(string);
        }
        return this;
    }
}

