package telas;


import telas.OuvinteAbrirJogoTelaInicial;
import telas.OuvinteAbrirEditorTelaInicial;
import telas.OuvinteCarregarJogoTelaInicial;
import telas.OuvinteSairTelaInicial;
import nucleo.UtilitariosTexto;
import nucleo.IniciadorCarreira;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 * Tela inicial. A arte (aiconsj/tela_inicial_fundo.jpg, 1672×941) já traz o logo, os textos e os três cartões; por cima ficam
 * áreas de clique transparentes, nas posições dos cartões, que acendem ao passar o mouse. Se a arte mudar, ajuste
 * os retângulos em mJ() (coordenadas na imagem original).
 */
public class TelaInicial
extends JFrame {
    private static final int ARTE_LARGURA = 1672;
    private static final int ARTE_ALTURA = 941;
    public static final int LARGURA = 960;
    public static final int ALTURA = Math.round(ARTE_ALTURA * (float)LARGURA / ARTE_LARGURA);
    private static final double ESCALA = (double)LARGURA / ARTE_LARGURA;
    private static final Color VERDE = new Color(34, 230, 110);
    private static final Image ARTE = TelaInicial.carregarArte();
    private JPanel vd;
    private JLabel afs;
    private JLabel aft;
    private JLabel afw;
    private JLabel afx;

    public TelaInicial() {
        try {
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/icon16.png"));
            this.setIconImage(imageIcon.getImage());
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.setTitle("Betfoot");
        this.setUndecorated(true);
        this.mJ();
        this.mH();
    }

    public void mH() {
        this.aft.addMouseListener(new OuvinteAbrirJogoTelaInicial(this));
        this.afs.addMouseListener(new OuvinteAbrirEditorTelaInicial(this));
        this.afx.addMouseListener(new OuvinteCarregarJogoTelaInicial(this));
        this.afw.addMouseListener(new OuvinteSairTelaInicial(this));
        // Enter abre um novo jogo.
        this.vd.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "novo");
        this.vd.getActionMap().put("novo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TelaInicial.this.mi();
            }
        });
    }

    /** A janela tem tamanho fixo; ignora os setSize antigos (532×300) de quem a abre. */
    @Override
    public void setSize(int n, int n2) {
        super.setSize(LARGURA, ALTURA);
    }

    private void pW() {
        UtilitariosTexto.b(this);
        UtilitariosTexto.g("Metal");
        GerenciadorTelas.cX();
    }

    private void rN() {
        UtilitariosTexto.b(this);
        UtilitariosTexto.g("Metal");
        UtilitariosTexto.cV();
        UtilitariosTexto.cW();
        this.setVisible(false);
    }

    private void mi() {
        new GerenciadorJogo();
        IniciadorCarreira.dd();
        UtilitariosTexto.g("Metal");
        if (UtilitariosTexto.db() == null) {
            new GerenciadorTelas(true);
        } else {
            GerenciadorTelas.aY(0);
        }
        this.dispose();
    }

    private void mJ() {
        this.vd = new PainelArte();
        this.vd.setLayout(null);
        this.vd.setPreferredSize(new Dimension(LARGURA, ALTURA));
        // Retângulos na arte original: cartões Novo jogo, Jogo salvo e Editor, e o X de fechar.
        // Cada cartão: retângulo e centro do botão da seta.
        this.aft = new Cartao(223, 254, 403, 493, 424, 698);
        this.afx = new Cartao(650, 254, 377, 493, 837, 698);
        this.afs = new Cartao(1053, 254, 403, 493, 1253, 698);
        this.afw = TelaInicial.area(new Fechar(), 1568, 33, 70, 70);
        this.aft.getAccessibleContext().setAccessibleName("Novo jogo");
        this.afx.getAccessibleContext().setAccessibleName("Jogo salvo");
        this.afs.getAccessibleContext().setAccessibleName("Editor");
        this.afw.getAccessibleContext().setAccessibleName("Sair");
        this.vd.add(this.aft);
        this.vd.add(this.afx);
        this.vd.add(this.afs);
        this.vd.add(this.afw);
        this.setDefaultCloseOperation(3);
        this.setContentPane(this.vd);
        this.pack();
        super.setSize(LARGURA, ALTURA);
        try {
            this.setShape(new RoundRectangle2D.Double(0.0, 0.0, LARGURA, ALTURA, 28.0, 28.0));
        }
        catch (Exception exception) {
            // janela sem cantos arredondados onde o sistema não suporta
        }
        // Sem barra de título: arrastar pelo fundo move a janela.
        MouseAdapter arrastar = new MouseAdapter() {
            private Point inicio;

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                this.inicio = mouseEvent.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                Point point = TelaInicial.this.getLocation();
                TelaInicial.this.setLocation(point.x + mouseEvent.getX() - this.inicio.x, point.y + mouseEvent.getY() - this.inicio.y);
            }
        };
        this.vd.addMouseListener(arrastar);
        this.vd.addMouseMotionListener(arrastar);
    }

    private static JLabel area(JLabel jLabel, int x, int y, int w, int h) {
        jLabel.setBounds((int)Math.round(x * ESCALA), (int)Math.round(y * ESCALA), (int)Math.round(w * ESCALA), (int)Math.round(h * ESCALA));
        return jLabel;
    }

    private static Graphics2D suave(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        return graphics2D;
    }

    private static Color alfa(Color color, double d) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)Math.max(0.0, Math.min(255.0, d * 255.0)));
    }

    /** Área de clique transparente que anima de 0 a 1 (hover) ao passar o mouse e escurece ao pressionar. */
    private static abstract class AreaClique
    extends JLabel {
        protected float hover;
        protected boolean pressionado;
        private boolean dentro;
        private final Timer timer = new Timer(15, actionEvent -> {
            float alvo = this.dentro ? 1.0f : 0.0f;
            this.hover += (alvo - this.hover) * 0.25f;
            if (Math.abs(alvo - this.hover) < 0.01f) {
                this.hover = alvo;
                ((Timer)actionEvent.getSource()).stop();
            }
            this.repaint();
        });

        AreaClique() {
            this.setCursor(new Cursor(12));
            this.setFocusable(false);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    AreaClique.this.dentro = true;
                    AreaClique.this.timer.start();
                }

                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    AreaClique.this.dentro = false;
                    AreaClique.this.pressionado = false;
                    AreaClique.this.timer.start();
                }

                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                    AreaClique.this.pressionado = true;
                    AreaClique.this.repaint();
                }

                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                    AreaClique.this.pressionado = false;
                    AreaClique.this.repaint();
                }
            });
        }
    }

    /**
     * Cartão da arte. No hover o pedaço da arte do cartão é redesenhado um pouco maior (sobe), com sombra e borda
     * verde, e o botão da seta acende (a seta fica centralizada).
     */
    private static class Cartao
    extends AreaClique {
        private static final int MARGEM = 16;
        private static final double RAIO = 72.0;
        private final int ax;
        private final int ay;
        private final int aw;
        private final int ah;
        private final double setaX;
        private final double setaY;

        Cartao(int x, int y, int w, int h, int sx, int sy) {
            this.ax = x;
            this.ay = y;
            this.aw = w;
            this.ah = h;
            this.setaX = (sx - x) * ESCALA;
            this.setaY = (sy - y) * ESCALA;
            this.setBounds((int)Math.round(x * ESCALA) - MARGEM, (int)Math.round(y * ESCALA) - MARGEM, (int)Math.round(w * ESCALA) + 2 * MARGEM, (int)Math.round(h * ESCALA) + 2 * MARGEM);
        }

        @Override
        public boolean contains(int x, int y) {
            // A margem é só para desenhar o cartão maior; o clique vale dentro do cartão.
            return x >= MARGEM && y >= MARGEM && x < this.getWidth() - MARGEM && y < this.getHeight() - MARGEM;
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            if (this.hover <= 0.0f || ARTE == null) {
                return;
            }
            Graphics2D graphics2D = TelaInicial.suave(graphics);
            double cw = this.getWidth() - 2 * MARGEM;
            double ch = this.getHeight() - 2 * MARGEM;
            double k = 1.0 + (this.pressionado ? 0.012 : 0.035) * this.hover;
            double dw = cw * k;
            double dh = ch * k;
            double dx = (this.getWidth() - dw) / 2.0;
            double dy = (this.getHeight() - dh) / 2.0 - 4.0 * this.hover;
            double r = RAIO * ESCALA * k;
            // Sombra.
            for (int i = 1; i <= 4; ++i) {
                graphics2D.setColor(TelaInicial.alfa(Color.BLACK, 0.07 * this.hover));
                graphics2D.fill(new RoundRectangle2D.Double(dx - i, dy + 2 + i * 2, dw + 2 * i, dh + i, r + i, r + i));
            }
            // Arte do cartão ampliada.
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(dx, dy, dw, dh, r, r);
            Graphics2D recorte = (Graphics2D)graphics2D.create();
            recorte.clip(forma);
            recorte.drawImage(ARTE, (int)Math.round(dx), (int)Math.round(dy), (int)Math.round(dx + dw), (int)Math.round(dy + dh), this.ax, this.ay, this.ax + this.aw, this.ay + this.ah, null);
            recorte.setColor(TelaInicial.alfa(Color.WHITE, 0.05 * this.hover));
            recorte.fill(forma);
            recorte.dispose();
            // Borda verde com brilho.
            for (int i = 3; i >= 1; --i) {
                graphics2D.setStroke(new BasicStroke(i * 3.0f));
                graphics2D.setColor(TelaInicial.alfa(VERDE, 0.1 * this.hover));
                graphics2D.draw(forma);
            }
            graphics2D.setStroke(new BasicStroke(2.0f));
            graphics2D.setColor(TelaInicial.alfa(VERDE, 0.95 * this.hover));
            graphics2D.draw(forma);
            // Botão da seta.
            double sx = dx + this.setaX * k;
            double sy = dy + this.setaY * k;
            double sr = 29.0 * ESCALA * k + 1.5 * this.hover;
            graphics2D.setColor(TelaInicial.alfa(VERDE, 0.25 * this.hover));
            graphics2D.fill(new Ellipse2D.Double(sx - sr - 5, sy - sr - 5, 2 * sr + 10, 2 * sr + 10));
            graphics2D.setColor(TelaInicial.misturar(new Color(3, 101, 65), new Color(22, 200, 100), this.hover));
            graphics2D.fill(new Ellipse2D.Double(sx - sr, sy - sr, 2 * sr, 2 * sr));
            graphics2D.setColor(TelaInicial.alfa(Color.WHITE, 0.35 * this.hover));
            graphics2D.setStroke(new BasicStroke(1.2f));
            graphics2D.draw(new Ellipse2D.Double(sx - sr, sy - sr, 2 * sr, 2 * sr));
            double a = sr * 0.42;
            graphics2D.setColor(Color.WHITE);
            graphics2D.setStroke(new BasicStroke(2.4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            graphics2D.draw(new Line2D.Double(sx - a, sy, sx + a, sy));
            java.awt.geom.GeneralPath ponta = new java.awt.geom.GeneralPath();
            ponta.moveTo(sx + a * 0.15, sy - a * 0.8);
            ponta.lineTo(sx + a, sy);
            ponta.lineTo(sx + a * 0.15, sy + a * 0.8);
            graphics2D.draw(ponta);
            graphics2D.dispose();
        }
    }

    private static Color misturar(Color color, Color color2, double d) {
        double e = 1.0 - d;
        return new Color((int)(color.getRed() * e + color2.getRed() * d), (int)(color.getGreen() * e + color2.getGreen() * d), (int)(color.getBlue() * e + color2.getBlue() * d));
    }

    private static class Fechar
    extends AreaClique {
        @Override
        protected void paintComponent(Graphics graphics) {
            if (this.hover <= 0.0f) {
                return;
            }
            Graphics2D graphics2D = TelaInicial.suave(graphics);
            double w = this.getWidth();
            graphics2D.setColor(TelaInicial.alfa(VERDE, (this.pressionado ? 0.55 : 0.35) * this.hover));
            graphics2D.fill(new Ellipse2D.Double(1.0, 1.0, w - 2.0, w - 2.0));
            graphics2D.setStroke(new BasicStroke(1.5f));
            graphics2D.setColor(TelaInicial.alfa(VERDE, 0.9 * this.hover));
            graphics2D.draw(new Ellipse2D.Double(1.0, 1.0, w - 2.0, w - 2.0));
            // Redesenha o X por cima, girando um pouco.
            double c = w / 2.0;
            double b = w * 0.17;
            graphics2D.rotate(Math.toRadians(90.0 * this.hover), c, c);
            graphics2D.setColor(Color.WHITE);
            graphics2D.setStroke(new BasicStroke(2.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            graphics2D.draw(new Line2D.Double(c - b, c - b, c + b, c + b));
            graphics2D.draw(new Line2D.Double(c - b, c + b, c + b, c - b));
            graphics2D.dispose();
        }
    }

    private static Image carregarArte() {
        try {
            return new ImageIcon(TelaInicial.class.getResource("/aiconsj/tela_inicial_fundo.jpg")).getImage();
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static class PainelArte
    extends JPanel {
        private final Image arte = ARTE;

        PainelArte() {
            this.setOpaque(true);
            this.setBackground(new Color(4, 20, 10));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            if (this.arte != null) {
                Graphics2D graphics2D = TelaInicial.suave(graphics);
                graphics2D.drawImage(this.arte, 0, 0, this.getWidth(), this.getHeight(), null);
                graphics2D.dispose();
            }
            // Créditos no rodapé: uma linha pequena e espaçada, sem fundo, com sombra leve para ler sobre o gramado.
            Graphics2D g = TelaInicial.suave(graphics);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            java.awt.Font fonte = components.TemaBetfoot.espacada(components.TemaBetfoot.display(11.0f), 0.18f);
            g.setFont(fonte);
            java.awt.FontMetrics fm = g.getFontMetrics();
            String[] partes = new String[]{"FEITO POR  ", "VISION TECH", "  \u00d7  ", "NERIDEV"};
            Color[] cores = new Color[]{TelaInicial.alfa(Color.WHITE, 0.45), TelaInicial.alfa(Color.WHITE, 0.85), TelaInicial.alfa(Color.WHITE, 0.35), TelaInicial.alfa(new Color(34, 222, 110), 0.9)};
            int largura = 0;
            for (String s : partes) {
                largura += fm.stringWidth(s);
            }
            int x = (this.getWidth() - largura) / 2;
            int y = this.getHeight() - 14;
            for (int i = 0; i < partes.length; ++i) {
                g.setColor(TelaInicial.alfa(Color.BLACK, 0.5));
                g.drawString(partes[i], x, y + 1);
                g.setColor(cores[i]);
                g.drawString(partes[i], x, y);
                x += fm.stringWidth(partes[i]);
            }
            g.dispose();
        }
    }

    static /* synthetic */ JLabel a(TelaInicial gq2) {
        return gq2.aft;
    }

    static /* synthetic */ void b(TelaInicial gq2) {
        gq2.mi();
    }

    static /* synthetic */ JLabel c(TelaInicial gq2) {
        return gq2.afs;
    }

    static /* synthetic */ void d(TelaInicial gq2) {
        gq2.rN();
    }

    static /* synthetic */ JLabel f(TelaInicial gq2) {
        return gq2.afx;
    }

    static /* synthetic */ void g(TelaInicial gq2) {
        gq2.pW();
    }
}
