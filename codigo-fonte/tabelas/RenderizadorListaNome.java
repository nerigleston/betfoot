package tabelas;

import nucleo.Competicao;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RenderizadorListaNome
extends JLabel
implements ListCellRenderer {
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        if (object != null && object instanceof Competicao) {
            Competicao at2 = (Competicao)object;
            String string = at2.getNome();
            this.setText(string);
            if (bl) {
                this.setBackground(jList.getSelectionBackground());
                this.setForeground(jList.getSelectionForeground());
            } else {
                this.setBackground(jList.getBackground());
                this.setForeground(jList.getForeground());
            }
        } else {
            this.setText((String)object);
        }
        return this;
    }
}

