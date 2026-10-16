package nucleo;

import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import java.util.Random;
import javax.swing.JProgressBar;

public abstract class UtilitariosGeracaoJogador {
    public static void a(boolean bl, ModeloJogador f2, ModeloTime ah2) {
        int n2 = 5;
        if (ah2.kn().booleanValue()) {
            n2 = ah2.getDivisao() < 1 ? 5 : (ah2.getDivisao() == 1 ? 22 : (ah2.getDivisao() == 2 ? 17 : (ah2.getDivisao() == 3 ? 14 : 7)));
            if (ah2.gg() == 0) {
                n2 += 5;
            }
        } else {
            n2 = ah2.getReputacao() == 5 ? 20 : (ah2.getReputacao() == 4 ? 15 : (ah2.getReputacao() == 3 ? 12 : (ah2.getReputacao() == 2 ? 7 : 5)));
            if (ah2.gg() == 0) {
                n2 += 5;
            }
        }
        n2 += new Random().nextInt(5);
        int n3 = f2.fE();
        if (n3 > 100) {
            n3 = 100;
        }
        double d2 = (double)n3 / 100.0;
        int n4 = (int)Math.round((double)n2 * d2);
        int n5 = f2.fH() + n4;
        if (f2.fH() >= 9) {
            n5 += new Random().nextInt(10);
        }
        f2.ad(n5);
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            int n6 = 1;
            if (ah2.kn().booleanValue()) {
                switch (ah2.getDivisao()) {
                    case 1: {
                        n6 = 7;
                        break;
                    }
                    case 2: {
                        n6 = 3;
                        break;
                    }
                    case 3: {
                        n6 = 1;
                    }
                }
            } else {
                switch (ah2.getReputacao()) {
                    case 5: {
                        n6 = 7;
                        break;
                    }
                    case 4: {
                        n6 = 4;
                        break;
                    }
                    case 3: {
                        n6 = 1;
                        break;
                    }
                    case 2: {
                        n6 = 1;
                        break;
                    }
                    case 1: {
                        n6 = 1;
                    }
                }
            }
            int n7 = n5 - 5;
            if (n7 < 5) {
                n7 = 5;
            }
            f2.j(n7, n6);
        }
        f2.h(false);
        f2.ar(GerenciadorJogo.SR.H());
        f2.d(0.0);
        f2.a(180L, true);
        f2.fK();
        f2.fJ();
        if (f2.ff().booleanValue()) {
            if (new Random().nextInt(3) == 1) {
                f2.a(true);
            } else {
                f2.a(false);
            }
        } else if (f2.gm().booleanValue()) {
            f2.a(true);
            f2.j(false);
        } else if (new Random().nextInt(200) == 1) {
            f2.a(true);
        }
        if (f2.ff().booleanValue() && f2.fH() < 8) {
            f2.aq(8);
        }
        ah2.ky().remove(f2);
        ah2.ky().remove(f2);
        if (bl) {
            GerenciadorJogo.SR.bA.remove(f2);
        }
        if (!ah2.kc().contains(f2)) {
            ah2.kc().add(f2);
        }
        if (!GerenciadorJogo.SR.O().contains(f2)) {
            GerenciadorJogo.SR.O().add(f2);
        }
        if (bl) {
            GerenciadorJogo.SR.bB.add(f2);
        } else {
            GerenciadorJogo.SR.Q().remove(f2);
        }
        f2.b((JProgressBar)null);
    }

    public static void r(int n2, int n3) {
        int[] nArray = new int[]{3, 4, 4, 5, 4};
        int n4 = 0;
        while (n4 < nArray.length) {
            int n5 = 0;
            while (n5 < nArray[n4]) {
                ModeloJogador f2 = new ModeloJogador(n2);
                UtilitariosGeracaoJogador.a(n3, f2, n4);
                ++n5;
            }
            ++n4;
        }
    }

    private static void a(int n2, ModeloJogador f2, int n3) {
        int n4 = 15;
        f2.setPosicao(n3);
        if (n2 <= 15) {
            n4 = n2;
        } else {
            switch (n2) {
                case 16: {
                    n4 = 17;
                    break;
                }
                case 17: {
                    n4 = 18;
                    break;
                }
                case 18: {
                    n4 = 19;
                    break;
                }
                case 19: {
                    n4 = 21;
                    break;
                }
                case 20: {
                    n4 = 25;
                    break;
                }
                case 21: {
                    n4 = 26;
                    break;
                }
                case 22: {
                    n4 = 27;
                    break;
                }
                case 23: {
                    n4 = 28;
                    break;
                }
                case 24: {
                    n4 = 29;
                    break;
                }
                case 25: {
                    n4 = 30;
                    break;
                }
                default: {
                    n4 = 0;
                }
            }
        }
        n4 = n4 - 5 + new Random().nextInt(8);
        f2.ad(n4);
        f2.h(false);
        f2.ar(GerenciadorJogo.SR.H());
        f2.d(0.0);
        f2.a(180L, true);
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            n4 = 1;
            int n5 = 1;
            if (n2 <= 15) {
                n4 = n2;
            } else {
                switch (n2) {
                    case 16: {
                        n4 = 17;
                        break;
                    }
                    case 17: {
                        n4 = 18;
                        break;
                    }
                    case 18: {
                        n4 = 19;
                        break;
                    }
                    case 19: {
                        n4 = 21;
                        break;
                    }
                    case 20: {
                        n4 = 25;
                        break;
                    }
                    case 21: {
                        n4 = 26;
                        break;
                    }
                    case 22: {
                        n4 = 27;
                        break;
                    }
                    case 23: {
                        n4 = 28;
                        break;
                    }
                    case 24: {
                        n4 = 29;
                        break;
                    }
                    case 25: {
                        n4 = 30;
                        break;
                    }
                    default: {
                        n4 = 0;
                    }
                }
            }
            n5 = n2 >= 20 ? 7 : (n2 >= 19 ? 4 : (n2 >= 17 ? 1 : 1));
            int n6 = n4;
            int n7 = n5;
            if (n6 > 4) {
                n6 -= 4;
            }
            f2.j(n6, n7);
        }
        int[] nArray = ModeloJogador.at(n3);
        f2.setCr1(nArray[0]);
        f2.setCr2(nArray[1]);
        f2.aq(new Random().nextInt(4) + 7);
        f2.setIdade(new Random().nextInt(12) + 18);
        f2.setLado(new Random().nextInt(2));
        f2.setStatus(0);
        f2.fG();
        f2.fK();
        f2.fJ();
    }
}

