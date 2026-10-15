package components;

import telas.PainelPrincipalClube;
import telas.TelaLeilaoJogador;
import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import nucleo.BuscadorTimeDestinoTransferencia;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import java.awt.Dimension;
import javax.swing.JDialog;

public class ProcessoLeilaoJogador {
    private ModeloJogador U;
    private int oq;
    private boolean Rz = false;
    private int RA;
    private ModeloTime RB;

    public ProcessoLeilaoJogador(ModeloJogador f2, int n2, boolean bl, boolean bl2) {
        this.U = f2;
        this.oq = n2;
        int n3 = 0;
        if (!bl2) {
            int n4 = 0;
            while (n4 < GerenciadorJogo.SR.aN().size()) {
                if (GerenciadorJogo.SR.aN().get(n4) != f2.fg() && ((ModeloTime)GerenciadorJogo.SR.aN().get(n4)).kb() >= (long)n2) {
                    ++n3;
                }
                ++n4;
            }
        }
        if (n3 == 0) {
            this.Rz = true;
        }
        if (this.uZ()) {
            this.iy();
        }
        if (!bl2) {
            this.vb();
        }
        this.va();
    }

    private boolean uZ() {
        double d2 = PainelPrincipalClube.qq();
        if (d2 == 0.0) {
            d2 = 0.1;
        }
        int n2 = (int)Math.round((double)this.U.fk() * PainelPrincipalClube.qq());
        return this.oq <= this.U.fk() + n2;
    }

    private void iy() {
        BuscadorTimeDestinoTransferencia l2 = new BuscadorTimeDestinoTransferencia(this.U, this.oq, true, false, 0);
        l2.a(false, false);
        this.RB = l2.cK();
        this.RA = l2.cL();
    }

    private void va() {
        if (this.RB != null) {
            this.U.a(this.RB, this.RA, true, false, false);
        }
    }

    private void vb() {
        JDialog jDialog = new JDialog(GerenciadorTelas.db());
        TelaLeilaoJogador iX2 = new TelaLeilaoJogador(jDialog, this);
        jDialog.add(iX2);
        jDialog.setSize(604, 550);
        jDialog.setPreferredSize(new Dimension(604, 550));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.pack();
        jDialog.setVisible(true);
    }

    public ModeloJogador x() {
        return this.U;
    }

    public void a(ModeloJogador f2) {
        this.U = f2;
    }

    public int lY() {
        return this.oq;
    }

    public void cq(int n2) {
        this.oq = n2;
    }

    public boolean vc() {
        return this.Rz;
    }

    public void aE(boolean bl) {
        this.Rz = bl;
    }

    public int vd() {
        return this.RA;
    }

    public ModeloTime ve() {
        return this.RB;
    }

    public void ei(int n2) {
        this.RA = n2;
    }

    public void I(ModeloTime ah2) {
        this.RB = ah2;
    }
}

