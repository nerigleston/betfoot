package telas;

import static motor.GerenciadorJogo.SR;
import static motor.GerenciadorJogo.vM;

import telas.OuvinteFecharDialogoTrofeusTimeIcones;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.TituloConquistado;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.CarregadorConfigEstadual;
import components.RestricaoPosicaoLayout;
import components.LayoutPosicaoAbsoluta;
import components.PainelArvoreCompeticoes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogoGaleriaTrofeusTimeIcones
extends JPanel {
    private JDialog ub;
    private ModeloTime zY = null;
    private int EQ = 0;
    private PainelArvoreCompeticoes[] ER;
    private JButton vm;
    private PainelArvoreCompeticoes ES;
    private PainelArvoreCompeticoes ET;
    private PainelArvoreCompeticoes EU;
    private PainelArvoreCompeticoes EV;
    private PainelArvoreCompeticoes EW;
    private PainelArvoreCompeticoes EX;
    private PainelArvoreCompeticoes EY;
    private PainelArvoreCompeticoes EZ;
    private PainelArvoreCompeticoes Fa;
    private PainelArvoreCompeticoes Fb;
    private PainelArvoreCompeticoes Fc;
    private PainelArvoreCompeticoes Fd;
    private PainelArvoreCompeticoes Fe;
    private PainelArvoreCompeticoes Ff;
    private PainelArvoreCompeticoes Fg;
    private PainelArvoreCompeticoes Fh;
    private JLabel vf;

    public DialogoGaleriaTrofeusTimeIcones(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.zY = ah2;
        this.mJ();
        this.mH();
        PainelArvoreCompeticoes[] kArray = new PainelArvoreCompeticoes[]{this.ES, this.Fa, this.Fb, this.Fc, this.Fd, this.Fe, this.Ff, this.Fg, this.Fh, this.ET, this.EU, this.EV, this.EW, this.EX, this.EY, this.EZ};
        this.ER = kArray;
        this.vf.setText("Galeria de Trof\u00e9us - " + ah2.getNome());
        this.vf.setIcon(ah2.kU());
        if (this.zY.cT().size() > 0) {
            this.py();
        }
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(vM().getCorTema(), 1));
    }

    private void pD() {
        LigaNacional z2 = SR.o(29);
        this.zY.q((Competicao)z2.eb().get(0));
        this.zY.q((Competicao)z2.eb().get(1));
        this.zY.q((Competicao)z2.eb().get(2));
        this.zY.q((Competicao)z2.eb().get(3));
        CarregadorConfigEstadual w2 = null;
        int n2 = 0;
        while (n2 < SR.aE().size()) {
            if (((CarregadorConfigEstadual)SR.aE().get(n2)).eb().size() > 1) {
                w2 = (CarregadorConfigEstadual)SR.aE().get(n2);
                break;
            }
            ++n2;
        }
        this.zY.q((Competicao)w2.eb().get(0));
        this.zY.q((Competicao)w2.eb().get(1));
    }

    private void py() {
        if (this.zY.lp()) {
            this.AD();
        } else {
            this.pE();
            this.pF();
            this.pB();
            this.pC();
        }
    }

    private void AD() {
        this.N(7, 7);
        this.N(7, this.zY.gg());
        if (this.zY.gg() == 0) {
            this.N(14, 0);
        } else if (this.zY.gg() == 4) {
            this.N(14, 4);
        }
        if (this.zY.gg() == 0 || this.zY.gg() == 1) {
            this.M(13, -1);
        }
    }

    private void pE() {
        this.M(5, -1);
    }

    private void pF() {
        int n2 = this.zY.gg();
        this.M(4, n2);
        this.M(6, n2);
        this.M(12, n2);
        this.M(8, n2);
    }

    private void pB() {
        this.N(1, 1);
        this.M(2, -1);
        this.M(11, -1);
        this.N(1, 2);
        this.N(1, 3);
        this.N(1, 4);
    }

    private void pC() {
        int n2 = this.zY.jV();
        this.M(10, n2);
        this.N(3, 1);
        this.N(3, 2);
        this.N(3, 3);
        this.N(3, 4);
    }

    public void M(int n2, int n3) {
        int n4 = 0;
        Competicao at2 = null;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n5 = -1;
        int n6 = this.zY.cT().size() - 1;
        while (n6 >= 0) {
            if (((TituloConquistado)this.zY.cT().get(n6)).b() == n2 && ((TituloConquistado)this.zY.cT().get(n6)).H() != n5) {
                ++n4;
                arrayList.add(((TituloConquistado)this.zY.cT().get(n6)).H() + SR.iU());
                at2 = ((TituloConquistado)this.zY.cT().get(n6)).gS();
                n5 = ((TituloConquistado)this.zY.cT().get(n6)).H();
            }
            --n6;
        }
        String string = this.W(arrayList);
        if (n4 > 0) {
            this.a(n2, n3, n4, string, at2);
        }
    }

    public void N(int n2, int n3) {
        int n4 = 0;
        Competicao at2 = null;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n5 = -1;
        int n6 = this.zY.cT().size() - 1;
        while (n6 >= 0) {
            if (((TituloConquistado)this.zY.cT().get(n6)).b() == n2 && ((TituloConquistado)this.zY.cT().get(n6)).el() == n3 && ((TituloConquistado)this.zY.cT().get(n6)).H() != n5) {
                ++n4;
                arrayList.add(((TituloConquistado)this.zY.cT().get(n6)).H() + SR.iU());
                at2 = ((TituloConquistado)this.zY.cT().get(n6)).gS();
                n5 = ((TituloConquistado)this.zY.cT().get(n6)).H();
            }
            --n6;
        }
        String string = this.W(arrayList);
        if (n4 > 0) {
            this.a(n2, n3, n4, string, at2);
        }
    }

    private String W(ArrayList arrayList) {
        String string = "";
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            String string2 = String.valueOf(Integer.toString((Integer)arrayList.get(n2))) + ", ";
            if (n2 == arrayList.size() - 1 || n2 == 22) {
                string2 = Integer.toString((Integer)arrayList.get(n2));
            }
            string = String.valueOf(string) + string2;
            if (n2 == 22) {
                string = String.valueOf(string) + "...";
                break;
            }
            ++n2;
        }
        string = "<html>" + string + "</html>";
        return string;
    }

    private void a(int n2, int n3, int n4, String string, Competicao at2) {
        if (this.EQ < this.ER.length) {
            String[] stringArray = at2.mA();
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            this.ER[this.EQ].a(string3, string, n4, ConstantesJogo.x(string2));
            ++this.EQ;
        }
    }

    private void mH() {
        this.vm.addActionListener(new OuvinteFecharDialogoTrofeusTimeIcones(this));
    }

    private void mJ() {
        this.vf = new JLabel();
        this.vm = new JButton();
        this.Fc = new PainelArvoreCompeticoes();
        this.ES = new PainelArvoreCompeticoes();
        this.Fa = new PainelArvoreCompeticoes();
        this.Fb = new PainelArvoreCompeticoes();
        this.Fd = new PainelArvoreCompeticoes();
        this.Fe = new PainelArvoreCompeticoes();
        this.Ff = new PainelArvoreCompeticoes();
        this.Fg = new PainelArvoreCompeticoes();
        this.Fh = new PainelArvoreCompeticoes();
        this.ET = new PainelArvoreCompeticoes();
        this.EU = new PainelArvoreCompeticoes();
        this.EV = new PainelArvoreCompeticoes();
        this.EW = new PainelArvoreCompeticoes();
        this.EX = new PainelArvoreCompeticoes();
        this.EY = new PainelArvoreCompeticoes();
        this.EZ = new PainelArvoreCompeticoes();
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setBackground(new Color(0, 0, 0));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.vf.setFont(new Font("Tahoma", 1, 14));
        this.vf.setForeground(new Color(255, 255, 255));
        this.vf.setText("Galeria de Trofeus");
        this.add((Component)this.vf, new RestricaoPosicaoLayout(20, 10, 303, -1));
        this.vm.setFont(new Font("Tahoma", 0, 12));
        this.vm.setText("X");
        this.vm.setToolTipText("");
        this.add((Component)this.vm, new RestricaoPosicaoLayout(805, 5, 60, -1));
        this.add((Component)this.Fc, new RestricaoPosicaoLayout(665, 40, 200, 164));
        this.add((Component)this.ES, new RestricaoPosicaoLayout(20, 40, 200, 164));
        this.add((Component)this.Fa, new RestricaoPosicaoLayout(235, 40, 200, 164));
        this.add((Component)this.Fb, new RestricaoPosicaoLayout(450, 40, 200, 164));
        this.add((Component)this.Fd, new RestricaoPosicaoLayout(20, 220, 200, 164));
        this.add((Component)this.Fe, new RestricaoPosicaoLayout(235, 220, 200, 164));
        this.add((Component)this.Ff, new RestricaoPosicaoLayout(450, 220, 200, 164));
        this.add((Component)this.Fg, new RestricaoPosicaoLayout(665, 220, 200, 164));
        this.add((Component)this.Fh, new RestricaoPosicaoLayout(20, 400, 200, 164));
        this.add((Component)this.ET, new RestricaoPosicaoLayout(235, 400, 200, 164));
        this.add((Component)this.EU, new RestricaoPosicaoLayout(450, 400, 200, 164));
        this.add((Component)this.EV, new RestricaoPosicaoLayout(665, 400, 200, 164));
        this.add((Component)this.EW, new RestricaoPosicaoLayout(20, 580, 200, 164));
        this.add((Component)this.EX, new RestricaoPosicaoLayout(235, 580, 200, 164));
        this.add((Component)this.EY, new RestricaoPosicaoLayout(450, 580, 200, 164));
        this.add((Component)this.EZ, new RestricaoPosicaoLayout(665, 580, 200, 164));
    }

    public int pG() {
        return this.EQ;
    }

    static /* synthetic */ JDialog a(DialogoGaleriaTrofeusTimeIcones di2) {
        return di2.ub;
    }
}

