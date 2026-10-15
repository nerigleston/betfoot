package components;

import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import components.GeradorIconeJogador;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLayeredPane;

public class TooltipListaJogadores
extends JLayeredPane {
    private ArrayList Qp = new ArrayList();

    public TooltipListaJogadores(ArrayList arrayList) {
        this.Qp = arrayList;
    }

    @Override
    public String getToolTipText(MouseEvent mouseEvent) {
        int n2;
        Point point = new Point(mouseEvent.getX(), mouseEvent.getY());
        if (GeradorIconeJogador.W(mouseEvent.getX(), mouseEvent.getY()) && (n2 = GeradorIconeJogador.T(mouseEvent.getX(), mouseEvent.getY())) >= 1 && ((GeradorIconeJogador)this.Qp.get(n2)).x() != null) {
            String string = "";
            if (n2 <= 25 && ConstantesJogo.sE[n2][0] != ((GeradorIconeJogador)this.Qp.get(n2)).x().getPosicao()) {
                string = "Improvisado como " + ConstantesJogo.rH[ConstantesJogo.sE[n2][0]];
            }
            if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
                return "<html>" + ((GeradorIconeJogador)this.Qp.get(n2)).x().getNome() + " (F:" + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().fi()) + " E:" + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().fp()) + ")" + "<br><b>Posic\u00e3o original:</b> " + ConstantesJogo.rH[((GeradorIconeJogador)this.Qp.get(n2)).x().getPosicao()] + "<br><b>Lado original:</b> " + ConstantesJogo.rK[((GeradorIconeJogador)this.Qp.get(n2)).x().getLado()] + "<br><b>Idade:</b> " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().getIdade()) + "<br><b>Caract:</b> " + ConstantesJogo.qN[((GeradorIconeJogador)this.Qp.get(n2)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)this.Qp.get(n2)).x().getCr2()] + "<br>" + string + "</html>";
            }
            return "<html>" + ((GeradorIconeJogador)this.Qp.get(n2)).x().getNome() + " (E:" + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().fp()) + ")" + "<br><b>Posic\u00e3o original:</b> " + ConstantesJogo.rH[((GeradorIconeJogador)this.Qp.get(n2)).x().getPosicao()] + "<br><b>Lado original:</b> " + ConstantesJogo.rK[((GeradorIconeJogador)this.Qp.get(n2)).x().getLado()] + "<br><b>Idade:</b> " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().getIdade()) + "<br><b>Caract:</b> " + ConstantesJogo.qN[((GeradorIconeJogador)this.Qp.get(n2)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)this.Qp.get(n2)).x().getCr2()] + "<br><b>Gol: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gK()) + "<br><b>Des: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gN()) + "<br><b>Arm: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gO()) + "<br><b>Fin: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gP()) + "<br><b>Vel: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gJ()) + "<br><b>Tec: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gL()) + "<br><b>Pas: " + Integer.toString(((GeradorIconeJogador)this.Qp.get(n2)).x().gM()) + "<br>" + string + "</html>";
        }
        return super.getToolTipText(mouseEvent);
    }

    public void aa(ArrayList arrayList) {
        this.Qp = arrayList;
    }
}

