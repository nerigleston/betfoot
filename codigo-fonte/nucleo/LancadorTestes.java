package nucleo;

import nucleo.VerificadorRegistro;
import nucleo.Calendario;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorIdioma;
import nucleo.UtilitariosTexto;
import nucleo.IniciadorCarreira;
import competicoes.CompeticaoSulAmericana;
import competicoes.CompeticaoLibertadores;
import competicoes.CompeticaoLigaAfricana;
import competicoes.CompeticaoLigaAsiatica;
import competicoes.CompeticaoChampionsLeague;
import competicoes.CompeticaoLigaConcacaf;
import competicoes.CompeticaoLigaEuropa;
import competicoes.CompeticaoLigaOceania;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LancadorTestes {
    public static void main(String[] stringArray) {
        try {
            UIManager.LookAndFeelInfo[] lookAndFeelInfoArray = UIManager.getInstalledLookAndFeels();
            int n2 = lookAndFeelInfoArray.length;
            int n3 = 0;
            while (n3 < n2) {
                UIManager.LookAndFeelInfo lookAndFeelInfo = lookAndFeelInfoArray[n3];
                if ("Metal".equals(lookAndFeelInfo.getName())) {
                    UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
                    break;
                }
                ++n3;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            Logger.getLogger(LancadorTestes.class.getName()).log(Level.SEVERE, null, classNotFoundException);
        }
        catch (InstantiationException instantiationException) {
            Logger.getLogger(LancadorTestes.class.getName()).log(Level.SEVERE, null, instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(LancadorTestes.class.getName()).log(Level.SEVERE, null, illegalAccessException);
        }
        catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
            Logger.getLogger(LancadorTestes.class.getName()).log(Level.SEVERE, null, unsupportedLookAndFeelException);
        }
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        new GerenciadorIdioma(true);
        UtilitariosTexto.cU();
        LancadorTestes.mh();
        LancadorTestes.mg();
    }

    public static void mg() {
        Preferences preferences = Preferences.userRoot();
        preferences = preferences.node("systemacxy");
        String string = preferences.get("n", "nf");
        int n2 = preferences.getInt("nr", -1);
        VerificadorRegistro.n(string);
        VerificadorRegistro.eT();
        n2 = LancadorTestes.a(n2, string);
        int n3 = VerificadorRegistro.eX();
        if (n2 == n3) {
            motor.GerenciadorJogo.ey(new Random().nextInt(300) + 150);
        } else {
            motor.GerenciadorJogo.ey(new Random().nextInt(50) + 30);
        }
    }

    private static int a(int n2, String string) {
        char c2 = string.charAt(0);
        int n3 = c2 * 31348;
        return n2 + n3;
    }

    public static void mh() {
        long l2 = 0L;
        long l3 = 0L;
        new motor.GerenciadorJogo();
        motor.GerenciadorJogo.SR.bs = false;
        new testes.JanelaMenuTeste().wT();
        motor.GerenciadorJogo.vH();
        IniciadorCarreira.dd();
        motor.GerenciadorJogo.SR.bi();
    }

    public static void mi() {
        new testes.JanelaMenuTeste().wT();
    }

    private static void mk() {
        int[] nArray = new int[8];
        nArray[0] = 7;
        nArray[2] = 2;
        nArray[3] = 5;
        nArray[4] = 3;
        nArray[5] = 4;
        nArray[6] = 6;
        nArray[7] = 1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[32];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < 4) {
            int n5 = 0;
            while (n5 < 8) {
                nArray3[n2] = nArray2[n5] + n3;
                ++n2;
                ++n5;
            }
            n3 += 8;
            ++n4;
        }
        System.out.println(Arrays.toString(nArray3));
    }

    private static void dk() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaAsiatica());
        motor.GerenciadorJogo.SR.aL().yq();
    }

    private static void dl() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaOceania());
        motor.GerenciadorJogo.SR.aQ().yq();
    }

    private static void dm() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaConcacaf());
        motor.GerenciadorJogo.SR.aP().yq();
    }

    private static void dn() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaAfricana());
        motor.GerenciadorJogo.SR.aO().yq();
    }

    private static void do_1() {
        motor.GerenciadorJogo.SR.a(new CompeticaoSulAmericana());
        motor.GerenciadorJogo.SR.aH().yq();
    }

    private static void dp() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaEuropa());
        motor.GerenciadorJogo.SR.aK().yq();
    }

    private static void dq() {
        motor.GerenciadorJogo.SR.a(new CompeticaoChampionsLeague());
        motor.GerenciadorJogo.SR.aI().setNome(GerenciadorIdioma.getString("ligaC"));
        motor.GerenciadorJogo.SR.aI().yq();
    }

    private static void dr() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLibertadores());
        motor.GerenciadorJogo.SR.aF().setNome(GerenciadorIdioma.getString("lib"));
        motor.GerenciadorJogo.SR.aF().yq();
    }

    public static void u() {
        int n2 = 0;
        n2 = 0;
        ArrayList arrayList = Calendario.b(100);
        int n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Amistoso C:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList = Calendario.b(200);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Amistoso S:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList = Calendario.b(10);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Regional:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList = Calendario.b(3);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Estadual:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(1);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Nacional:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(4);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Int1:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(2);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Copa:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(7);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Selecoes:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(6);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("INT2:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(8);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Recopa:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(5);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Mundial:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
        n2 = 0;
        arrayList.clear();
        arrayList = Calendario.b(9);
        n3 = 0;
        while (n3 < arrayList.size()) {
            System.out.println("Elimin:" + ++n2 + ") " + ((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).f() + " " + ConstantesJogo.rF[((Calendario)motor.GerenciadorJogo.SR.R().get((Integer)arrayList.get(n3))).a().get(7)] + " " + arrayList.get(n3));
            ++n3;
        }
    }
}

