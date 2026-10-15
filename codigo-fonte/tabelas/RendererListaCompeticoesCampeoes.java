package tabelas;

import nucleo.Competicao;
import competicoes.CompeticaoSupercopa;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RendererListaCompeticoesCampeoes
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
        if (object != null && object instanceof CompeticaoSupercopa) {
            CompeticaoSupercopa i2 = (CompeticaoSupercopa)object;
            String string = i2.getNome();
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + i2.getPais() + ".png")));
        } else if (object != null) {
            Competicao at2 = (Competicao)object;
            String string = at2.getNome();
            this.setText(string);
            this.setIcon(at2.es());
        }
        return this;
    }
}

