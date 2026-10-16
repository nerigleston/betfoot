package testes;

import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import testes.ListenerPassarDia;
import testes.ListenerSair;
import testes.ListenerAdicionarTimeHumano;
import testes.ListenerSimularAnos;
import testes.ListenerSalvarTeste;
import testes.ListenerCarregarJogo;
import testes.ListenerAbrirConversor;
import testes.ListenerInicializarJogo;
import testes.OuvinteTesteIniciarJogo;
import testes.OuvinteTesteAbrirEditor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import sun.java2d.SunGraphicsEnvironment;

public class JanelaMenuTeste {
    private JWindow WW;
    private JFrame WX;
    private JPanel WY;
    private BufferedImage WZ = null;
    private JLabel Xa;

    public void wT() {
        this.xs();
        this.xt();
        this.xu();
        this.xv();
        this.xw();
        this.xx();
        this.xy();
        this.xz();
        this.xb();
        this.xA();
        this.xB();
        this.xD();
        this.xE();
        this.xa();
    }

    private void xr() {
        this.WW = new JWindow();
        Rectangle rectangle = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.WW.setSize(rectangle.width, rectangle.height);
        this.WW.setVisible(true);
    }

    private void xs() {
        this.WX = new JFrame("Betfoot");
        this.WX.setLayout(new BorderLayout());
        this.WX.setDefaultCloseOperation(3);
    }

    private void xa() {
        this.WX.setUndecorated(true);
        this.WX.pack();
        GraphicsConfiguration graphicsConfiguration = this.WX.getGraphicsConfiguration();
        Rectangle rectangle = SunGraphicsEnvironment.getUsableBounds(graphicsConfiguration.getDevice());
        this.WX.setMaximizedBounds(new Rectangle(0, 0, rectangle.width, rectangle.height));
        this.WX.setVisible(true);
    }

    private void xt() {
        this.WY = new JPanel();
        this.WX.add(this.WY);
    }

    private void xu() {
        try {
            if (this.getClass().getResource("/arquivos/2016.jpg") != null) {
                this.WZ = ImageIO.read(this.getClass().getResource("/arquivos/2016.jpg"));
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.Xa = new JLabel();
        if (this.WZ != null) {
            this.Xa.setIcon(new ImageIcon(this.WZ));
            this.Xa.setLayout(new FlowLayout());
        } else {
            BufferedImage bufferedImage = new BufferedImage(256, 256, 1);
            this.Xa.setIcon(new ImageIcon(bufferedImage));
            this.Xa.setLayout(new FlowLayout());
        }
        this.WY.add(this.Xa);
    }

    private void xv() {
        JButton jButton = new JButton("Passa Dia");
        jButton.addActionListener(new ListenerPassarDia(this));
        this.Xa.add(jButton);
    }

    private void Bc() {
        String string = "Torneio Teste";
        String string2 = "Sert\u00e3ozinho";
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 <= 7) {
            arrayList.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
            ++n2;
        }
        if (GerenciadorJogo.SR.yn() != null) {
            GerenciadorJogo.SR.yn().a(arrayList, 0, string, string2, false);
        }
    }

    private void xw() {
        JButton jButton = new JButton("Processa teste");
        jButton.addActionListener(new ListenerSimularAnos(this));
        this.Xa.add(jButton);
    }

    private void xx() {
        JButton jButton = new JButton("save");
        jButton.addActionListener(new ListenerSalvarTeste(this, jButton));
        this.Xa.add(jButton);
    }

    private void xy() {
        JButton jButton = new JButton("load");
        jButton.addActionListener(new ListenerCarregarJogo(this));
        this.Xa.add(jButton);
    }

    private void xz() {
        JButton jButton = new JButton("conversor");
        jButton.addActionListener(new ListenerAbrirConversor(this));
        this.Xa.add(jButton);
    }

    private void xb() {
        JButton jButton = new JButton("Inicializa Jogo");
        jButton.addActionListener(new ListenerInicializarJogo(this));
        this.Xa.add(jButton);
    }

    private void xA() {
        JButton jButton = new JButton("i");
        jButton.addActionListener(new OuvinteTesteIniciarJogo(this));
        this.WY.add(jButton);
    }

    private void xB() {
        JButton jButton = new JButton("e");
        jButton.addActionListener(new OuvinteTesteAbrirEditor(this));
        this.WY.add(jButton);
    }

    private void xD() {
        JButton jButton = new JButton("Sair");
        jButton.addActionListener(new ListenerSair(this));
        this.WY.add(jButton);
    }

    private void K(ModeloTime ah2) {
        if (GerenciadorJogo.SR.bs() != null) {
            GerenciadorJogo.SR.bs().setTc(ah2.ka().dS());
            GerenciadorJogo.SR.bs().setN(ah2.getNome());
            GerenciadorJogo.SR.bs().setA(GerenciadorJogo.SR.H() + GerenciadorJogo.SR.iU());
            GerenciadorJogo.SR.bs().setI("");
        }
    }

    private void xE() {
        JButton jButton = new JButton("Add Hum");
        jButton.addActionListener(new ListenerAdicionarTimeHumano(this));
        this.WY.add(jButton);
    }

    public static void c(JFrame jFrame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n2 = (int)((dimension.getWidth() - (double)jFrame.getWidth()) / 2.0);
        int n3 = (int)((dimension.getHeight() - (double)jFrame.getHeight()) / 2.0);
        jFrame.setLocation(n2, n3);
    }

    static /* synthetic */ void a(JanelaMenuTeste h3) {
        h3.Bc();
    }

    static /* synthetic */ JWindow b(JanelaMenuTeste h3) {
        return h3.WW;
    }

    static /* synthetic */ void a(JanelaMenuTeste h3, ModeloTime ah2) {
        h3.K(ah2);
    }
}

