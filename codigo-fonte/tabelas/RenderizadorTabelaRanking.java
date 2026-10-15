package tabelas;

import motor.GerenciadorJogo;
import components.ModeloLinhaTabela;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizadorTabelaRanking
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        super.setBackground(Color.white);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        ModeloLinhaTabela ak2 = (ModeloLinhaTabela)object;
        if (object != null) {
            if (n3 == 0) {
                if (ak2.tt()) {
                    super.setBackground(Color.BLACK);
                    super.setForeground(Color.white);
                } else if (!ak2.tt()) {
                    this.setText(Integer.toString(ak2.H() + GerenciadorJogo.SR.iU()));
                }
            }
            if (n3 == 1) {
                if (ak2.tt()) {
                    super.setBackground(Color.BLACK);
                    super.setForeground(Color.white);
                    this.setText(ak2.sT());
                } else if (ak2.fg() != null) {
                    this.setIcon(ak2.fg().kU());
                    this.setText(ak2.fg().getNome());
                }
            }
        }
        return this;
    }
}

