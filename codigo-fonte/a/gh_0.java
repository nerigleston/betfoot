package a;

import a.gi_0;
import a.gj_0;
import a.gk_0;
import b.B;
import b.ax;
import best.F;
import best.a_0;
import c.a;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

public class gh_0
extends JPanel {
    private a_0 JO = null;
    private ArrayList vp = null;
    private F CY = null;
    private JDialog ub = null;
    private static Timer Dk;
    private JButton vq;
    private JScrollPane ut;
    private JLabel vf;
    private JTable zS;

    public gh_0(JDialog jDialog, a_0 a_02, ArrayList arrayList) {
        this.ub = jDialog;
        this.JO = a_02;
        this.vp = arrayList;
        this.mJ();
        this.vq.setEnabled(false);
        this.vf.setIcon(a_02.cu().kU());
        this.mV();
        this.vq.addActionListener(new gi_0(this));
        if (a.SR.bD()) {
            this.oR();
        }
    }

    private void oQ() {
        this.ub.dispose();
    }

    public void oR() {
        Dk = new Timer();
        Dk.schedule((TimerTask)new gj_0(this), 0L);
    }

    public void A(F f2) {
        this.CY = f2;
        if (f2 != null) {
            this.JO.f(f2);
            this.vq.setEnabled(true);
        }
    }

    public void mV() {
        B b2 = new B(this.vp, this);
        this.zS.setModel(b2);
        int[] nArray = new int[]{25, 75, 25, 55, 100};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.zS.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.zS.setAutoResizeMode(3);
        this.zS.setRowHeight(20);
        this.zS.setShowGrid(false);
        this.zS.setDefaultRenderer(F.class, new ax());
        this.zS.setAutoCreateRowSorter(false);
        this.zS.getTableHeader().setReorderingAllowed(false);
        this.zS.setCellSelectionEnabled(false);
        this.zS.setSelectionMode(0);
        this.zS.setRowSelectionAllowed(true);
        this.zS.setSelectionBackground(Color.YELLOW);
        this.zS.setFillsViewportHeight(true);
        this.zS.getSelectionModel().addListSelectionListener(new gk_0(this));
    }

    private void mJ() {
        this.vf = new JLabel();
        this.ut = new JScrollPane();
        this.zS = new JTable();
        this.vq = new JButton();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setBackground(new Color(44, 53, 49));
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setForeground(new Color(255, 255, 153));
        this.vf.setHorizontalAlignment(0);
        this.vf.setText("Penalty - escolha do batedor");
        this.ut.setViewportView(this.zS);
        this.vq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/ball.png")));
        this.vq.setText("Bater");
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.vf, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.ut, -2, 360, -2).addContainerGap(20, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.vq, -2, 139, -2).addGap(123, 123, 123)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.vf).addGap(18, 18, 18).addComponent(this.ut, -1, 297, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.vq, -2, 32, -2).addContainerGap()));
    }

    static /* synthetic */ JDialog a(gh_0 gh_02) {
        return gh_02.ub;
    }

    static /* synthetic */ Timer rL() {
        return Dk;
    }

    static /* synthetic */ void b(gh_0 gh_02) {
        gh_02.oQ();
    }

    static /* synthetic */ JTable c(gh_0 gh_02) {
        return gh_02.zS;
    }
}

