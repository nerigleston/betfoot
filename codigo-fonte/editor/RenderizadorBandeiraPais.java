package editor;

import nucleo.EnumPaises;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizadorBandeiraPais
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setBackground(Color.YELLOW);
        super.setForeground(Color.BLACK);
        if (n3 == 1) {
            String string = EnumPaises.valueOf("P" + object).getNome();
            this.setText(string);
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aflags/" + object + ".png"));
            this.setIcon(imageIcon);
        }
        if (n3 == 0) {
            this.setText((String)object);
            this.setIcon(null);
        }
        return this;
    }
}

