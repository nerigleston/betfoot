package tabelas;

import nucleo.Competicao;
import competicoes.CompeticaoSupercopa;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCopaNacional;
import competicoes.CompeticaoCampeonatoEstadual;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RenderizadorListaCompeticoes
extends JLabel
implements ListCellRenderer {
    private int w = 0;

    public RenderizadorListaCompeticoes(int n2) {
        this.w = n2;
    }

    public RenderizadorListaCompeticoes() {
    }

    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        this.setIcon(null);
        if (bl) {
            this.setBackground(Color.YELLOW);
            this.setForeground(jList.getSelectionForeground());
        } else {
            this.setBackground(jList.getBackground());
            this.setForeground(jList.getForeground());
        }
        if (object != null && object instanceof CompeticaoCampeonatoEstadual) {
            CompeticaoCampeonatoEstadual o2 = (CompeticaoCampeonatoEstadual)object;
            this.setIcon(new ImageIcon(this.getClass().getResource("/aesticons/" + o2.yk() + ".png")));
            String string = o2.getNome();
            this.setText(string);
        } else if (object != null && object instanceof CompeticaoCopaNacional) {
            CompeticaoCopaNacional f_02 = (CompeticaoCopaNacional)object;
            String string = f_02.getNome();
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + f_02.yg().jc() + ".png")));
        } else if (object != null && object instanceof CompeticaoLigaNacional) {
            CompeticaoLigaNacional b_02 = (CompeticaoLigaNacional)object;
            String string = b_02.getNome();
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aflags/" + b_02.zO() + ".png")));
        } else if (object != null && object instanceof CompeticaoSupercopa) {
            String string = "Supercopa";
            this.setText(string);
            this.setIcon(new ImageIcon(this.getClass().getResource("/aicons/ic_ligas.png")));
        } else if (object != null) {
            Competicao at2 = (Competicao)object;
            String string = at2.getNome();
            this.setText(string);
            this.setIcon(at2.es());
            if (this.w == 1 && at2.b() == 15) {
                this.setText("Torneio Amistoso");
            }
        }
        return this;
    }
}

