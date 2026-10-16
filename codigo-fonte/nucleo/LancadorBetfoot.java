package nucleo;

import telas.TelaInicial;
import nucleo.TarefaInicialSegundoPlano;
import nucleo.LancadorTestes;
import nucleo.GerenciadorIdioma;
import nucleo.UtilitariosTexto;
import motor.GerenciadorJogo;
import components.RegistradorErros;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LancadorBetfoot {
    public static void main(String[] stringArray) {
        Object object;
        Thread.setDefaultUncaughtExceptionHandler(new RegistradorErros());
        Plataforma.instalarCliqueTolerante();
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

}

