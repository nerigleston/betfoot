package persistencia;

import nucleo.ModeloJogador;
import nucleo.Campeonato;
import nucleo.RegistroTransferenciaJogador;
import nucleo.Competicao;
import nucleo.DesempenhoJogadorCompeticao;
import motor.GerenciadorJogo;
import java.util.ArrayList;

public abstract class RestauradorReferenciasJogo {
    public static void Af() {
        int n2;
        ArrayList<Competicao> arrayList = new ArrayList<Competicao>();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.R().size()) {
            n2 = 0;
            while (n2 < ((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().size()) {
                if (!arrayList.contains(((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().get(n2))) {
                    arrayList.add((Competicao)((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().get(n2));
                }
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList.size()) {
            ((Competicao)arrayList.get(n3)).az(n3);
            ++n3;
        }
        n3 = 0;
        while (n3 < GerenciadorJogo.SR.O().size()) {
            n2 = 0;
            while (n2 < ((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().size()) {
                if (((DesempenhoJogadorCompeticao)((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().get(n2)).gX() >= 0) {
                    int n4 = 0;
                    while (n4 < arrayList.size()) {
                        if (((DesempenhoJogadorCompeticao)((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().get(n2)).gX() == ((Competicao)arrayList.get(n4)).gD()) {
                            ((DesempenhoJogadorCompeticao)((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().get(n2)).m((Competicao)arrayList.get(n4));
                            break;
                        }
                        ++n4;
                    }
                }
                ++n2;
            }
            ++n3;
        }
    }

    public static void Ag() {
        int n2;
        ArrayList<Competicao> arrayList = new ArrayList<Competicao>();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.R().size()) {
            n2 = 0;
            while (n2 < ((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().size()) {
                if (!arrayList.contains(((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().get(n2))) {
                    arrayList.add((Competicao)((nucleo.Calendario)GerenciadorJogo.SR.R().get(n3)).t().get(n2));
                }
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList.size()) {
            ((Competicao)arrayList.get(n3)).az(n3);
            ++n3;
        }
        n3 = 0;
        while (n3 < GerenciadorJogo.SR.O().size()) {
            n2 = 0;
            while (n2 < ((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().size()) {
                ((DesempenhoJogadorCompeticao)((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).gH().get(n2)).gY();
                ++n2;
            }
            ++n3;
        }
    }

    public static void Ah() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.O().size()) {
            ((ModeloJogador)GerenciadorJogo.SR.O().get(n2)).fg();
            ++n2;
        }
        n2 = 0;
        while (n2 < GerenciadorJogo.SR.Q().size()) {
            ((ModeloJogador)GerenciadorJogo.SR.Q().get(n2)).fg();
            ++n2;
        }
        n2 = 0;
        while (n2 < GerenciadorJogo.SR.L().size()) {
            ((Campeonato)GerenciadorJogo.SR.L().get(n2)).fg();
            ++n2;
        }
    }

    public static void Ai() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.O().size()) {
            ((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).az(n2);
            ((ModeloJogador)GerenciadorJogo.SR.O().get(n3)).aC(1);
            ++n2;
            ++n3;
        }
        n3 = 0;
        while (n3 < GerenciadorJogo.SR.Q().size()) {
            ((ModeloJogador)GerenciadorJogo.SR.Q().get(n3)).az(n2);
            ((ModeloJogador)GerenciadorJogo.SR.Q().get(n3)).aC(2);
            ++n2;
            ++n3;
        }
        n3 = 0;
        while (n3 < GerenciadorJogo.SR.bo().size()) {
            ((RegistroTransferenciaJogador)GerenciadorJogo.SR.bo().get(n3)).mb();
            ++n3;
        }
    }

    public static void Aj() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.bo().size()) {
            ((RegistroTransferenciaJogador)GerenciadorJogo.SR.bo().get(n2)).me();
            ++n2;
        }
    }
}

