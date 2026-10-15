package components;

import telas.TelaEscalacao;
import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import components.GeradorIconeJogador;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;

public class TooltipEstatisticasJogador2
extends JLayeredPane {
    @Override
    public String getToolTipText(MouseEvent mouseEvent) {
        Point point = new Point(mouseEvent.getX(), mouseEvent.getY());
        if (GeradorIconeJogador.V(mouseEvent.getX(), mouseEvent.getY())) {
            int n2 = GeradorIconeJogador.S(mouseEvent.getX(), mouseEvent.getY());
            if (n2 >= 1 && ((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x() != null) {
                String string = "";
                Double d2 = 0.0;
                if (n2 >= 0 && n2 < TelaEscalacao.oa().size()) {
                    d2 = ((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().F();
                }
                String string2 = String.format("%.2f", d2);
                if (d2 < 2.0) {
                    string2 = "--";
                }
                if (n2 <= 25 && ConstantesJogo.sE[n2][0] != ((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getPosicao()) {
                    string = "Improvisado como " + ConstantesJogo.rH[ConstantesJogo.sE[n2][0]];
                }
                if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
                    return "<html>" + ((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getNome() + "(F:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().fi()) + " E:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().fp()) + ")" + "<br><b>Posic\u00e3o original:</b> " + ConstantesJogo.rH[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getPosicao()] + "<br><b>Lado original:</b> " + ConstantesJogo.rK[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getLado()] + "<br><b>Idade:</b> " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getIdade()) + "<br><b>Caract:</b> " + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getCr2()] + "<br><b>Nota m\u00e9dia</b>: " + string2 + "<br>" + string + "</html>";
                }
                return "<html>" + ((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getNome() + " (E:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().fp()) + ")" + "<br><b>Posic\u00e3o original: </b>" + ConstantesJogo.rH[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getPosicao()] + "<br><b>Lado original: </b>" + ConstantesJogo.rK[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getLado()] + "<br><b>Idade: </b>" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getIdade()) + "<br><b>Caract: </b>" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().getCr2()] + "<br><b>Gol: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gK()) + "<br><b>Des: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gN()) + "<br><b>Arm: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gO()) + "<br><b>Fin: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gP()) + "<br><b>Vel: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gJ()) + "<br><b>Tec: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gL()) + "<br><b>Pas: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n2)).x().gM()) + "<br><b>Nota m\u00e9dia</b>: " + string2 + "<br>" + string + "</html>";
            }
        } else if (GeradorIconeJogador.X(mouseEvent.getX(), mouseEvent.getY())) {
            int n3 = GeradorIconeJogador.U(mouseEvent.getX(), mouseEvent.getY());
            Double d3 = 0.0;
            if (n3 >= 0 && n3 < TelaEscalacao.oa().size()) {
                d3 = ((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().F();
            }
            String string = String.format("%.2f", d3);
            if (d3 < 2.0) {
                string = "--";
            }
            if (n3 >= 1 && ((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x() != null) {
                if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
                    return "<html>" + ((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getNome() + "<br><b>Posic\u00e3o original:</b>" + ConstantesJogo.rH[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getPosicao()] + "<br><b>Lado original:</b>" + ConstantesJogo.rK[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getLado()] + "<br><b>Idade:</b>" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getIdade()) + "<br><b>Caract:</b>" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getCr2()] + "<br><b>Nota m\u00e9dia</b>: " + string + "</html>";
                }
                return "<html>" + ((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getNome() + "<br><b>Posic\u00e3o original:</b>" + ConstantesJogo.rH[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getPosicao()] + "<br><b>Lado original:</b>" + ConstantesJogo.rK[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getLado()] + "<br><b>Idade:</b>" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getIdade()) + "<br><b>Caract:</b>" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getCr1()] + "/" + ConstantesJogo.qN[((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().getCr2()] + "<br><b>Gol: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gK()) + "<br><b>Des:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gN()) + "<br><b>Arm:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gO()) + "<br><b>Fin: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gP()) + "<br><b>Vel:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gJ()) + "<br><b>Tec:" + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gL()) + "<br><b>Pas: " + Integer.toString(((GeradorIconeJogador)TelaEscalacao.oa().get(n3)).x().gM()) + "<br><b>Nota m\u00e9dia</b>: " + string + "</html>";
            }
        }
        return super.getToolTipText(mouseEvent);
    }
}

