package telas;

import static motor.GerenciadorJogo.vM;

import telas.RenderizadorPaisLista;
import telas.ListenerFecharAdicionarTecnico;
import telas.OuvinteConfirmarAdicionarTecnico;
import nucleo.EnumPaises;
import nucleo.DadosPais;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.UtilitariosTexto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class TelaAdicionarTecnico
extends JPanel {
    private JDialog ub = null;
    private JButton uc;
    private JButton ud;
    private JComboBox ue;
    private JTextField uf;
    private JLabel ug;
    private JLabel uh;
    private JLabel a_;

    public TelaAdicionarTecnico(JDialog jDialog) {
        this.ub = jDialog;
        this.mJ();
        this.mH();
        int n2 = 0;
        while (n2 < EnumPaises.jz()) {
            this.ue.addItem(((DadosPais)UtilitariosTexto.cY().get(n2)).getNome());
            ++n2;
        }
        RenderizadorPaisLista aJ2 = new RenderizadorPaisLista();
        aJ2.setPreferredSize(new Dimension(10, 25));
        this.ue.setRenderer(aJ2);
        this.ue.setMaximumRowCount(12);
        this.ue.setSelectedIndex(0);
        this.ue.setSelectedIndex(UtilitariosTexto.G(29));
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
    }

    public void mH() {
        this.ud.addActionListener(new ListenerFecharAdicionarTecnico(this));
        this.uc.addActionListener(new OuvinteConfirmarAdicionarTecnico(this));
    }

    private void mI() {
        if (this.uf.getText().toString() != "" && !this.uf.getText().isEmpty() && this.uf.getText().length() > 1 && this.uf.getText().length() < 50) {
            Campeonato.c(this.uf.getText().toString(), UtilitariosTexto.H(this.ue.getSelectedIndex()));
            this.ub.dispose();
        } else {
            JOptionPane.showMessageDialog(this.ub, "Nome inv\u00e1lido", "Adicionar t\u00e9cnico", 2);
        }
    }

    private void mJ() {
        this.ug = new JLabel();
        this.uh = new JLabel();
        this.uf = new JTextField();
        this.a_ = new JLabel();
        this.ue = new JComboBox();
        this.ud = new JButton();
        this.uc = new JButton();
        this.setBackground(new Color(104, 120, 100));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.ug.setFont(new Font("Tahoma", 1, 14));
        this.ug.setForeground(new Color(255, 255, 102));
        this.ug.setHorizontalAlignment(0);
        this.ug.setText("Adicionar t\u00e9cnico humano");
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setHorizontalAlignment(4);
        this.uh.setText("Nome:");
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setHorizontalAlignment(4);
        this.a_.setText("Nacionalidade:");
        this.ud.setText("Cancelar");
        this.uc.setText("Adicionar");
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(30, 30, 30).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ug, -2, 348, -2).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.uh, -2, 73, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.uf, -2, 224, -2)).addGroup(groupLayout.createSequentialGroup().addGap(10, 10, 10).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup().addComponent(this.a_, -2, 73, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ue, -2, 214, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.ud, -2, 113, -2).addGap(36, 36, 36).addComponent(this.uc, -2, 117, -2)))))).addContainerGap(18, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.ug).addGap(34, 34, 34).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.uh).addComponent(this.uf, -2, -1, -2)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a_).addComponent(this.ue, -2, -1, -2)).addGap(31, 31, 31).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ud).addComponent(this.uc)).addContainerGap(44, Short.MAX_VALUE)));
    }

    static /* synthetic */ JDialog a(TelaAdicionarTecnico a2) {
        return a2.ub;
    }

    static /* synthetic */ void b(TelaAdicionarTecnico a2) {
        a2.mI();
    }
}

