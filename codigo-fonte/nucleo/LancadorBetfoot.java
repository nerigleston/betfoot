package nucleo;

import telas.TelaInicial;
import nucleo.VerificadorRegistro;
import nucleo.TarefaInicialSegundoPlano;
import nucleo.LancadorTestes;
import nucleo.GerenciadorIdioma;
import nucleo.UtilitariosTexto;
import motor.GerenciadorJogo;
import components.RegistradorErros;
import java.awt.Window;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LancadorBetfoot {
    public static void main(String[] stringArray) {
        Object object;
        Thread.setDefaultUncaughtExceptionHandler(new RegistradorErros());
        try {
            UIManager.LookAndFeelInfo[] lookAndFeelInfoArray = UIManager.getInstalledLookAndFeels();
            int n2 = lookAndFeelInfoArray.length;
            int n3 = 0;
            while (n3 < n2) {
                object = lookAndFeelInfoArray[n3];
                if ("Nimbus".equals(((UIManager.LookAndFeelInfo)object).getName())) {
                    UIManager.setLookAndFeel(((UIManager.LookAndFeelInfo)object).getClassName());
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
        LancadorBetfoot.mg();
        new GerenciadorIdioma(true);
        UtilitariosTexto.cU();
        object = new TelaInicial();
        ((Window)object).pack();
        ((Window)object).setSize(532, 300);
        ((Window)object).setLocationRelativeTo(null);
        ((Window)object).setVisible(true);
        GerenciadorJogo.vH();
        LancadorBetfoot.ml();
    }

    public static void ml() {
        Thread thread = new Thread(new TarefaInicialSegundoPlano());
        thread.start();
    }

    public static void mg() {
        Preferences preferences = Preferences.userRoot();
        preferences = preferences.node("systemacxyz22");
        String string = preferences.get("n", "nf");
        int n2 = preferences.getInt("nr", -1);
        if (string.length() > 2 && n2 > 0) {
            int n3;
            VerificadorRegistro.n(string);
            if (VerificadorRegistro.k(string)) {
                VerificadorRegistro.n("Betfoot 2016");
            }
            VerificadorRegistro.eT();
            n2 = LancadorBetfoot.a(n2, string);
            int n4 = VerificadorRegistro.eX();
            String string2 = System.getProperty("sun.arch.data.model");
            int n5 = Integer.parseInt(string2);
            GerenciadorJogo.SU = n3 = preferences.getInt("vSave", n5);
            if (n2 == n4) {
                GerenciadorJogo.ey(new Random().nextInt(1080) + 1920);
            } else {
                GerenciadorJogo.ey(new Random().nextInt(800) + 600);
            }
        }
    }

    private static int a(int n2, String string) {
        char c2 = string.charAt(0);
        int n3 = c2 * 31348;
        return n2 + n3;
    }
}

