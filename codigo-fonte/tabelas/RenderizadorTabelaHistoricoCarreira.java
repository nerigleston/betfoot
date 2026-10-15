package tabelas;

import nucleo.ModeloTime;
import nucleo.TemporadaCarreiraJogador;
import motor.GerenciadorJogo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderizadorTabelaHistoricoCarreira
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        super.getTableCellRendererComponent(jTable, object, bl, bl2, n2, n3);
        this.setBorder(noFocusBorder);
        super.setForeground(Color.BLACK);
        this.setHorizontalAlignment(2);
        this.setIcon(null);
        this.setText("");
        TemporadaCarreiraJogador k2 = (TemporadaCarreiraJogador)object;
        if (k2 != null) {
            if (k2.cC() > 0) {
                if (n3 == 0) {
                    this.setText(Integer.toString(k2.cC() + GerenciadorJogo.SR.iU()));
                }
                if (n3 == 1) {
                    this.setText("promovido");
                }
            } else {
                if (k2.H() == -1) {
                    this.setFont(new Font("Helvetica", 1, 12));
                }
                if (k2.H() == -1) {
                    if (n3 == 1) {
                        this.setText("Total carreira:");
                    }
                } else if (n3 == 0) {
                    this.setText(Integer.toString(k2.H() + GerenciadorJogo.SR.iU()));
                } else if (n3 == 1) {
                    this.setText(k2.ck());
                    ModeloTime ah2 = k2.cu();
                    if (ah2 != null) {
                        this.setIcon(ah2.kU());
                    }
                }
                if (n3 == 2) {
                    this.setText(Integer.toString(k2.w()));
                } else if (n3 == 3) {
                    this.setText(Integer.toString(k2.y()));
                } else if (n3 == 4) {
                    this.setText(Integer.toString(k2.cv()));
                } else if (n3 == 5) {
                    this.setText(Integer.toString(k2.cw()));
                } else if (n3 == 6) {
                    this.setText(Integer.toString(k2.cx()));
                } else if (n3 == 7) {
                    this.setText(Integer.toString(k2.cD()));
                } else if (n3 == 8) {
                    if (k2.H() == -1) {
                        this.setText(k2.cG());
                    } else {
                        this.setText(k2.cE());
                    }
                }
            }
        }
        return this;
    }
}

