package tabelas;

import nucleo.ModeloJogador;
import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizadorTabelaJogadoresResumo
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(0);
        this.setIcon(null);
        this.setText("");
        ModeloJogador f2 = (ModeloJogador)object;
        if (n3 == 0) {
            this.setHorizontalAlignment(0);
            this.setText(ConstantesJogo.rI[f2.getPosicao()]);
        } else if (n3 == 1) {
            this.setHorizontalAlignment(2);
            this.setText(f2.getNome());
        } else if (n3 == 2) {
            if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
                this.setText(Integer.toString(f2.fi()));
            } else {
                this.setText(Integer.toString(f2.gP()));
            }
        } else {
            if (n3 == 3) {
                return f2.a(Color.black);
            }
            if (n3 == 4) {
                this.setText(String.valueOf(ConstantesJogo.qN[f2.getCr1()]) + "/" + ConstantesJogo.qN[f2.getCr2()]);
            }
        }
        return this;
    }
}

