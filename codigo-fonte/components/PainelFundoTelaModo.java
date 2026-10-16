package components;

import java.awt.LayoutManager;
import java.awt.Insets;
import java.awt.Container;
import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelFundoTelaModo
extends JPanel {
    private static BufferedImage DH = null;
    private static int Qf = 0;
    private static String Qg = null;

    public PainelFundoTelaModo(String string, int n2) {
        Qf = n2;
        Qg = string;
        this.setLayout(new Centralizado());
    }

    /* Coloca a tela do jogo no centro da janela, na horizontal e na vertical, no tamanho preferido dela.
     * Se a tela for maior que a janela, encosta no canto (a rolagem continua funcionando). */
    private static final class Centralizado
    implements LayoutManager {
        @Override
        public void addLayoutComponent(String nome, Component componente) {
        }

        @Override
        public void removeLayoutComponent(Component componente) {
        }

        @Override
        public Dimension preferredLayoutSize(Container pai) {
            Dimension d = new Dimension();
            for (Component c : pai.getComponents()) {
                Dimension p = c.getPreferredSize();
                d.width = Math.max(d.width, p.width);
                d.height = Math.max(d.height, p.height);
            }
            Insets i = pai.getInsets();
            d.width += i.left + i.right;
            d.height += i.top + i.bottom;
            return d;
        }

        @Override
        public Dimension minimumLayoutSize(Container pai) {
            return this.preferredLayoutSize(pai);
        }

        @Override
        public void layoutContainer(Container pai) {
            Insets i = pai.getInsets();
            int w = pai.getWidth() - i.left - i.right;
            int h = pai.getHeight() - i.top - i.bottom;
            for (Component c : pai.getComponents()) {
                Dimension p = c.getPreferredSize();
                int cw = Math.min(p.width, Math.max(w, p.width));
                int ch = Math.min(p.height, Math.max(h, p.height));
                c.setBounds(i.left + Math.max(0, (w - cw) / 2), i.top + Math.max(0, (h - ch) / 2), cw, ch);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (Qf == 0) {
            try {
                DH = ImageIO.read(new File(String.valueOf(System.getProperty("user.dir")) + "/img/f01.jpg"));
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Dimension dimension = this.getSize();
            super.paintComponent(graphics);
            graphics.drawImage(DH, 0, 0, dimension.width, dimension.height, null);
        } else if (Qf == 8) {
            try {
                DH = ImageIO.read(new File(String.valueOf(System.getProperty("user.dir")) + "/img/f02.jpg"));
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Dimension dimension = this.getSize();
            super.paintComponent(graphics);
            graphics.drawImage(DH, 0, 0, dimension.width, dimension.height, null);
        } else if (Qf == 1) {
            super.paintComponent(graphics);
            Graphics2D graphics2D = (Graphics2D)graphics;
            graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            int n2 = this.getWidth();
            int n3 = this.getHeight();
            Color color = Color.RED;
            Color color2 = Color.GREEN;
            GradientPaint gradientPaint = new GradientPaint(0.0f, 0.0f, color, 0.0f, n3, color2);
            graphics2D.setPaint(gradientPaint);
            graphics2D.fillRect(0, 0, n2, n3);
        } else if (Qf == 3) {
            try {
                DH = ImageIO.read(new File(String.valueOf(System.getProperty("user.dir")) + "/img/f03.png"));
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Dimension dimension = this.getSize();
            super.paintComponent(graphics);
            graphics.drawImage(DH, 0, 0, dimension.width, dimension.height, null);
        }
    }
}

