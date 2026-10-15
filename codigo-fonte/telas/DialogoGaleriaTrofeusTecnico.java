package telas;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.vM;

import telas.OuvinteFecharDialogoTrofeusTecnico;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.TituloConquistado;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.PartidaCompeticao;
import components.RestricaoPosicaoLayout;
import components.ModeloCelulaTime;
import components.LayoutPosicaoAbsoluta;
import components.PainelTabelaLiga;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoGaleriaTrofeusTecnico
extends JPanel {
    private JDialog ub;
    private Campeonato Es = null;
    private int Et = 0;
    private ArrayList Eu = new ArrayList();
    private ArrayList Ev = new ArrayList();
    private ArrayList Ew = new ArrayList();
    private ArrayList Ex = new ArrayList();
    private JLabel[] Ey;
    private JButton vm;
    private PainelTabelaLiga Ez;
    private PainelTabelaLiga EA;
    private PainelTabelaLiga EB;
    private JLabel vf;
    private JLabel EC;
    private JLabel xJ;
    private JLabel ED;
    private JLabel EE;
    private JLabel EF;
    private JLabel EG;
    private JLabel EH;
    private JLabel EI;
    private JLabel EJ;
    private JLabel EK;
    private JLabel EL;
    private JLabel EM;
    private JLabel EN;
    private JLabel EO;

    public DialogoGaleriaTrofeusTecnico(JDialog jDialog, Campeonato al2) {
        this.ub = jDialog;
        this.Es = al2;
        this.mJ();
        this.vf.setText(al2.dS());
        JLabel[] jLabelArray = new JLabel[]{this.xJ, this.ED, this.EH, this.EI, this.EJ, this.EK, this.EL, this.EM, this.EN, this.EO, this.EE, this.EF, this.EG};
        this.Ey = jLabelArray;
        int n2 = 0;
        while (n2 < this.Ey.length) {
            this.Ey[n2].setVisible(false);
            ++n2;
        }
        this.mH();
        this.py();
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
    }

    private void py() {
        this.pA();
        this.pB();
        this.pC();
        this.pz();
    }

    private void pz() {
        int n2 = 0;
        while (n2 < this.Ex.size()) {
            if (n2 < this.Ey.length) {
                this.Ey[n2].setVisible(true);
                this.Ey[n2].setIcon(ConstantesJogo.a(ConstantesJogo.x((String)this.Ex.get(n2)), 43, 60));
            }
            ++this.Et;
            ++n2;
        }
    }

    private void pA() {
        this.d(SR.aY(), 7);
        this.d(SR.sq(), 0);
        this.d(SR.ym(), 4);
        this.d(SR.ba(), 0);
        this.d(SR.aZ(), 1);
        this.d(SR.be(), 2);
        this.d(SR.bf(), 3);
        this.d(SR.bg(), 4);
        this.d(SR.bX(), 5);
        this.d(SR.yl(), 7);
        this.a(5, -1, this.Eu);
        this.a(4, -1, this.Eu);
        this.a(6, -1, this.Eu);
        this.a(12, -1, this.Eu);
        this.a(8, -1, this.Eu);
        this.EA.a("Internacionais", this.Eu);
    }

    private void pB() {
        this.b(1, 1, this.Ev);
        this.a(2, -1, this.Ev);
        this.a(11, -1, this.Ev);
        this.b(1, 2, this.Ev);
        this.b(1, 3, this.Ev);
        this.b(1, 4, this.Ev);
        this.EB.a("Nacionais", this.Ev);
    }

    private void pC() {
        this.a(10, -1, this.Ew);
        this.b(3, 1, this.Ew);
        this.b(3, 2, this.Ew);
        this.b(3, 3, this.Ew);
        this.b(3, 4, this.Ew);
        String string = "Estaduais e regionais";
        if (!SR.isJogaRegionais()) {
            string = "Estaduais";
        }
        this.Ez.a(string, this.Ew);
    }

    private void d(Competicao at2, int n2) {
        if (at2 != null) {
            int n3 = 0;
            while (n3 < at2.mn().size()) {
                if (((PartidaCompeticao)at2.mn().get(n3)).ci() == this.Es) {
                    this.a(((PartidaCompeticao)at2.mn().get(n3)).H(), 7, n2, at2, ((PartidaCompeticao)at2.mn().get(n3)).ce(), this.Eu);
                }
                ++n3;
            }
        }
    }

    public void a(int n2, int n3, ArrayList arrayList) {
        Competicao at2 = null;
        ModeloTime ah2 = null;
        int n4 = 0;
        int n5 = this.Es.cT().size() - 1;
        while (n5 >= 0) {
            if (((TituloConquistado)this.Es.cT().get(n5)).b() == n2) {
                at2 = ((TituloConquistado)this.Es.cT().get(n5)).gS();
                ah2 = SR.x(((TituloConquistado)this.Es.cT().get(n5)).ct());
                n4 = ((TituloConquistado)this.Es.cT().get(n5)).H();
                this.a(n4, n2, n3, at2, ah2, arrayList);
            }
            --n5;
        }
    }

    public void b(int n2, int n3, ArrayList arrayList) {
        Competicao at2 = null;
        ModeloTime ah2 = null;
        int n4 = 0;
        int n5 = this.Es.cT().size() - 1;
        while (n5 >= 0) {
            if (((TituloConquistado)this.Es.cT().get(n5)).b() == n2 && ((TituloConquistado)this.Es.cT().get(n5)).el() == n3) {
                at2 = ((TituloConquistado)this.Es.cT().get(n5)).gS();
                ah2 = SR.x(((TituloConquistado)this.Es.cT().get(n5)).ct());
                n4 = ((TituloConquistado)this.Es.cT().get(n5)).H();
                this.a(n4, n2, n3, at2, ah2, arrayList);
            }
            --n5;
        }
    }

    private void a(int n2, int n3, int n4, Competicao at2, ModeloTime ah2, ArrayList arrayList) {
        String[] stringArray = at2.mA();
        String string = stringArray[0];
        String string2 = stringArray[1];
        ModeloCelulaTime ac_02 = new ModeloCelulaTime();
        ac_02.k(n2);
        ac_02.ab(string2);
        ac_02.k(ah2);
        ac_02.j(ConstantesJogo.a(ConstantesJogo.x(string), 18, 18));
        arrayList.add(ac_02);
        if (!(string.equals("tr_nacionalgenerico") || string.equals("tr_supercopa_generico") || string.equals("tr_estadualgenerico") || this.Ex.contains(string))) {
            this.Ex.add(string);
        }
    }

    private void mH() {
        this.vm.addActionListener(new OuvinteFecharDialogoTrofeusTecnico(this));
    }

    private void mJ() {
        this.vf = new JLabel();
        this.vm = new JButton();
        this.Ez = new PainelTabelaLiga();
        this.EA = new PainelTabelaLiga();
        this.EB = new PainelTabelaLiga();
        this.EC = new JLabel();
        this.EG = new JLabel();
        this.xJ = new JLabel();
        this.ED = new JLabel();
        this.EH = new JLabel();
        this.EI = new JLabel();
        this.EJ = new JLabel();
        this.EK = new JLabel();
        this.EL = new JLabel();
        this.EM = new JLabel();
        this.EN = new JLabel();
        this.EO = new JLabel();
        this.EE = new JLabel();
        this.EF = new JLabel();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setBackground(new Color(0, 68, 105));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setForeground(new Color(255, 255, 204));
        this.vf.setText("Galeria de Trofeus T\u00e9cnico");
        this.add((Component)this.vf, new RestricaoPosicaoLayout(30, 60, 200, -1));
        this.vm.setFont(new Font("Tahoma", 0, 12));
        this.vm.setText("X");
        this.vm.setToolTipText("");
        this.add((Component)this.vm, new RestricaoPosicaoLayout(910, 20, 50, -1));
        this.add((Component)this.Ez, new RestricaoPosicaoLayout(650, 100, 310, 520));
        this.add((Component)this.EA, new RestricaoPosicaoLayout(10, 100, 310, 520));
        this.add((Component)this.EB, new RestricaoPosicaoLayout(330, 100, 310, 520));
        this.EC.setFont(new Font("Tahoma", 1, 14));
        this.EC.setForeground(new Color(255, 255, 255));
        this.EC.setText("Galeria de Trofeus T\u00e9cnico");
        this.add((Component)this.EC, new RestricaoPosicaoLayout(30, 30, 200, -1));
        this.EG.setForeground(new Color(255, 255, 255));
        this.EG.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EG.setToolTipText("");
        this.add((Component)this.EG, new RestricaoPosicaoLayout(850, 20, -1, -1));
        this.xJ.setForeground(new Color(255, 255, 255));
        this.xJ.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.xJ.setToolTipText("");
        this.add((Component)this.xJ, new RestricaoPosicaoLayout(240, 20, -1, -1));
        this.ED.setForeground(new Color(255, 255, 255));
        this.ED.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.ED.setToolTipText("");
        this.add((Component)this.ED, new RestricaoPosicaoLayout(290, 20, -1, -1));
        this.EH.setForeground(new Color(255, 255, 255));
        this.EH.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EH.setToolTipText("");
        this.add((Component)this.EH, new RestricaoPosicaoLayout(340, 20, -1, -1));
        this.EI.setForeground(new Color(255, 255, 255));
        this.EI.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EI.setToolTipText("");
        this.add((Component)this.EI, new RestricaoPosicaoLayout(390, 20, -1, -1));
        this.EJ.setForeground(new Color(255, 255, 255));
        this.EJ.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EJ.setToolTipText("");
        this.add((Component)this.EJ, new RestricaoPosicaoLayout(440, 20, -1, -1));
        this.EK.setForeground(new Color(255, 255, 255));
        this.EK.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EK.setToolTipText("");
        this.add((Component)this.EK, new RestricaoPosicaoLayout(490, 20, -1, -1));
        this.EL.setForeground(new Color(255, 255, 255));
        this.EL.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EL.setToolTipText("");
        this.add((Component)this.EL, new RestricaoPosicaoLayout(540, 20, -1, -1));
        this.EM.setForeground(new Color(255, 255, 255));
        this.EM.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EM.setToolTipText("");
        this.add((Component)this.EM, new RestricaoPosicaoLayout(590, 20, -1, -1));
        this.EN.setForeground(new Color(255, 255, 255));
        this.EN.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EN.setToolTipText("");
        this.add((Component)this.EN, new RestricaoPosicaoLayout(640, 20, -1, -1));
        this.EO.setForeground(new Color(255, 255, 255));
        this.EO.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EO.setToolTipText("");
        this.add((Component)this.EO, new RestricaoPosicaoLayout(690, 20, -1, -1));
        this.EE.setForeground(new Color(255, 255, 255));
        this.EE.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EE.setToolTipText("");
        this.add((Component)this.EE, new RestricaoPosicaoLayout(750, 20, -1, -1));
        this.EF.setForeground(new Color(255, 255, 255));
        this.EF.setIcon(new ImageIcon(this.getClass().getResource("/aicons/trsmall.png")));
        this.EF.setToolTipText("");
        this.add((Component)this.EF, new RestricaoPosicaoLayout(800, 20, -1, -1));
    }

    static /* synthetic */ JDialog a(DialogoGaleriaTrofeusTecnico dg_02) {
        return dg_02.ub;
    }
}

