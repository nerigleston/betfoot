package tabelas;

import components.LinhaGaleriaTrofeus;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizadorCelulaImagem
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(0);
        this.setIcon(null);
        this.setText("");
        LinhaGaleriaTrofeus aj2 = (LinhaGaleriaTrofeus)object;
        if (aj2 != null && aj2.dX(n3) != null) {
            this.setText("<html>\n<body><p style=\\\"vertical-align: bottom; padding:5; font-size:10\\\"><center><img src=\"file:" + aj2.dY(n3) + "\" >" + "<center>" + aj2.dX(n3) + " [" + Integer.toString(aj2.dZ(n3)) + "]" + "</center>" + "<br><center>" + "\n</p>\n</body></html>\n");
        }
        return this;
    }
}

