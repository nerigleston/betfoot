package tabelas;

import components.OpcaoTipoCompeticao;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RendererCompeticaoVisivel
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        OpcaoTipoCompeticao ae_02 = (OpcaoTipoCompeticao)object;
        if (ae_02 != null) {
            this.setText(ae_02.sT());
        }
        return this;
    }
}

