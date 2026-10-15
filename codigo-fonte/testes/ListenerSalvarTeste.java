package testes;

import motor.GerenciadorJogo;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.prefs.Preferences;
import javax.swing.JButton;

class ListenerSalvarTeste
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;
    private final /* synthetic */ JButton Xc;

    ListenerSalvarTeste(JanelaMenuTeste h3, JButton jButton) {
        this.Xb = h3;
        this.Xc = jButton;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Xc.setText("save");
        int n2 = new Random().nextInt(1000);
        int n3 = 0;
        Preferences preferences = Preferences.userRoot().node(this.getClass().getName());
        n3 = preferences.getInt("cont", 0);
        try {
            GerenciadorJogo.ae("teste20_" + n3);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        preferences.putInt("cont", n3++);
        System.out.println("---salvo");
    }
}

