package tabelas;

import telas.PainelPartidaAoVivo2;
import nucleo.LigaNacional;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.CarregadorConfigEstadual;
import competicoes.CompeticaoCopaNacional;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RenderizadorListaPaises
extends JLabel
implements ListCellRenderer {
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        if (object != null) {
            this.setIcon(null);
            if (bl) {
                this.setBackground(Color.YELLOW);
                this.setForeground(jList.getSelectionForeground());
            } else {
                this.setBackground(jList.getBackground());
                this.setForeground(jList.getForeground());
            }
            if (object != null && object instanceof CarregadorConfigEstadual) {
                CarregadorConfigEstadual w2 = (CarregadorConfigEstadual)object;
                this.setIcon(new ImageIcon(this.getClass().getResource("/aesticons/" + w2.getEstado() + ".png")));
                String string = ConstantesJogo.rY[w2.getEstado()];
                this.setText(string);
            } else if (object != null && object instanceof CompeticaoCopaNacional) {
                CompeticaoCopaNacional f_02 = (CompeticaoCopaNacional)object;
                if (PainelPartidaAoVivo2.sf() == 1) {
                    this.setText(f_02.yg().jf());
                } else {
                    this.setText(f_02.getNome());
                }
                this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + f_02.yg().jc() + ".png")));
            } else if (object != null && object instanceof LigaNacional) {
                LigaNacional z2 = (LigaNacional)object;
                if (PainelPartidaAoVivo2.sf() == 1) {
                    this.setText(z2.jf());
                } else {
                    this.setText(z2.jq().getNome());
                }
                this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + z2.jc() + ".png")));
            } else if (object != null) {
                Competicao at2 = (Competicao)object;
                String string = at2.getNome();
                this.setText(string);
                this.setIcon(at2.es());
            }
        }
        return this;
    }
}

