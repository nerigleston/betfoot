package components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 * Identidade visual do Betfoot (a mesma da tela inicial): fundo escuro com o estádio, cartões de vidro, verde
 * vivo como destaque. Cores, fontes, painéis, botões, campos, tabelas e ícones vetoriais para as telas Swing.
 */
public final class TemaBetfoot {
    public static final Color FUNDO = new Color(5, 12, 9);
    public static final Color CARTAO = new Color(8, 17, 13, 200);
    public static final Color CARTAO_SOLIDO = new Color(14, 27, 21);
    public static final Color BORDA = new Color(255, 255, 255, 22);
    public static final Color TEXTO = new Color(241, 245, 243);
    public static final Color TEXTO_SUAVE = new Color(152, 170, 161);
    public static final Color TEXTO_FRACO = new Color(104, 122, 113);
    public static final Color VERDE = new Color(34, 222, 110);
    public static final Color VERDE_BOTAO = new Color(22, 163, 74);
    public static final Color VERDE_SELECAO = new Color(22, 101, 52);
    public static final Color VERMELHO = new Color(248, 113, 113);
    public static final Color LINHA_PAR = new Color(10, 20, 15);
    public static final Color LINHA_IMPAR = new Color(10, 20, 15);
    public static final Color CAMPO = new Color(255, 255, 255, 14);
    public static final String FONTE = Font.SANS_SERIF;

    public enum Estilo {
        PRIMARIO, SECUNDARIO, PERIGO, DESTRUTIVO, FANTASMA, ICONE, CHIP, SEGMENTO, ABA
    }

    public enum Simbolo {
        MAIS, LAPIS, LIXEIRA, CASA, SAIR, LUPA, DADO, JOGADOR_MAIS, JOGADOR_LAPIS, JOGADOR_MENOS, PESSOA, PESSOAS, ESTADIO, NIVEL, APITO, MAPA, TROFEU, VOLTAR, AVANCAR, SUBIR, DESCER
    }

    private static Image estadio;
    private static Image logo;

    private TemaBetfoot() {
    }

    private static final java.util.Map<String, Font> FONTES = new java.util.HashMap<String, Font>();

    private static Font carregarFonte(String string) {
        Font font = FONTES.get(string);
        if (font == null && !FONTES.containsKey(string)) {
            try (java.io.InputStream in = TemaBetfoot.class.getResourceAsStream("/afontes/" + string + ".ttf")) {
                font = Font.createFont(Font.TRUETYPE_FONT, in);
                java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
            }
            catch (Exception exception) {
                font = null;
            }
            FONTES.put(string, font);
        }
        return font;
    }

    /** Texto corrido: Barlow (SemiBold no negrito). */
    public static Font fonte(int estilo, float tamanho) {
        Font font = TemaBetfoot.carregarFonte((estilo & Font.BOLD) != 0 ? "Barlow-SemiBold" : "Barlow-Medium");
        return font == null ? new Font(FONTE, estilo, Math.round(tamanho)) : font.deriveFont(tamanho);
    }

    /** Títulos, números e botões: Barlow Condensed, no estilo dos jogos de futebol. */
    public static Font display(float tamanho) {
        Font font = TemaBetfoot.carregarFonte(tamanho >= 22.0f ? "BarlowCondensed-ExtraBold" : "BarlowCondensed-Bold");
        return font == null ? new Font(FONTE, Font.BOLD, Math.round(tamanho)) : font.deriveFont(tamanho);
    }

    /** Desenha texto com espaçamento extra entre letras. */
    public static void textoEspacado(Graphics2D graphics2D, String string, float x, float y, float espaco) {
        java.util.Map<java.awt.font.TextAttribute, Object> atributos = new java.util.HashMap<java.awt.font.TextAttribute, Object>();
        atributos.put(java.awt.font.TextAttribute.TRACKING, espaco);
        Font font = graphics2D.getFont();
        graphics2D.setFont(font.deriveFont(atributos));
        graphics2D.drawString(string, x, y);
        graphics2D.setFont(font);
    }

    public static Font espacada(Font font, float espaco) {
        java.util.Map<java.awt.font.TextAttribute, Object> atributos = new java.util.HashMap<java.awt.font.TextAttribute, Object>();
        atributos.put(java.awt.font.TextAttribute.TRACKING, espaco);
        return font.deriveFont(atributos);
    }

    public static Graphics2D suave(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        return graphics2D;
    }

    public static Color alfa(Color color, double d) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)Math.max(0.0, Math.min(255.0, d * 255.0)));
    }

    private static Image imagem(String string) {
        try {
            return new ImageIcon(TemaBetfoot.class.getResource(string)).getImage();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Image logo() {
        if (logo == null) {
            logo = TemaBetfoot.imagem("/aiconsj/logo_betfoot.png");
        }
        return logo;
    }

    /** Fundo da janela: estádio escurecido com degradê e um brilho verde no topo. */
    public static class Fundo
    extends JPanel {
        public Fundo(LayoutManager layoutManager) {
            super(layoutManager);
            this.setOpaque(true);
            this.setBackground(FUNDO);
            if (estadio == null) {
                estadio = TemaBetfoot.imagem("/aiconsj/fundo_estadio.jpg");
            }
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            if (estadio != null && estadio.getWidth(null) > 0) {
                double escala = Math.max((double)w / estadio.getWidth(null), (double)h / estadio.getHeight(null));
                int iw = (int)Math.ceil(estadio.getWidth(null) * escala);
                int ih = (int)Math.ceil(estadio.getHeight(null) * escala);
                graphics2D.drawImage(estadio, (w - iw) / 2, (h - ih) / 2, iw, ih, null);
            }
            graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, TemaBetfoot.alfa(FUNDO, 0.8), 0.0f, h, TemaBetfoot.alfa(FUNDO, 0.94)));
            graphics2D.fillRect(0, 0, w, h);
            graphics2D.setPaint(new java.awt.RadialGradientPaint(w / 2.0f, -h * 0.1f, Math.max(w, h) * 0.6f, new float[]{0.0f, 1.0f}, new Color[]{TemaBetfoot.alfa(VERDE, 0.1), TemaBetfoot.alfa(VERDE, 0.0)}));
            graphics2D.fillRect(0, 0, w, h);
            graphics2D.dispose();
        }
    }

    /** Painel de vidro com cantos arredondados. */
    public static class Cartao
    extends JPanel {
        private final int raio;

        public Cartao(LayoutManager layoutManager) {
            this(layoutManager, 18);
        }

        public Cartao(LayoutManager layoutManager, int n) {
            super(layoutManager);
            this.raio = n;
            this.setOpaque(false);
            this.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, this.raio * 2, this.raio * 2);
            graphics2D.setColor(CARTAO);
            graphics2D.fill(forma);
            graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, TemaBetfoot.alfa(Color.WHITE, 0.09), 0.0f, 60.0f, TemaBetfoot.alfa(Color.WHITE, 0.0)));
            graphics2D.draw(forma);
            graphics2D.dispose();
        }
    }

    /** Logo oficial (aiconsj/logo_completa.png, branca) + nome da tela em destaque e uma linha de apoio. */
    public static class Marca
    extends JComponent {
        private static Image logoCompleta;
        private final String titulo;
        private final String subtitulo;

        public Marca(String string, String string2) {
            this.titulo = string;
            this.subtitulo = string2;
            if (logoCompleta == null) {
                logoCompleta = TemaBetfoot.imagem("/aiconsj/logo_completa.png");
            }
            this.setPreferredSize(new Dimension(620, 48));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            int h = this.getHeight();
            int x = 0;
            if (logoCompleta != null && logoCompleta.getHeight(null) > 0) {
                int lh = 34;
                int lw = lh * logoCompleta.getWidth(null) / logoCompleta.getHeight(null);
                graphics2D.drawImage(logoCompleta, 0, (h - lh) / 2, lw, lh, null);
                x = lw + 24;
            }
            if (this.titulo != null) {
                graphics2D.setColor(VERDE);
                java.awt.geom.Path2D.Double barra = new java.awt.geom.Path2D.Double();
                barra.moveTo(x + 4, h / 2.0 - 15);
                barra.lineTo(x + 8, h / 2.0 - 15);
                barra.lineTo(x + 4, h / 2.0 + 15);
                barra.lineTo(x, h / 2.0 + 15);
                barra.closePath();
                graphics2D.fill(barra);
                x += 22;
                graphics2D.setFont(TemaBetfoot.espacada(TemaBetfoot.display(22.0f), 0.04f));
                graphics2D.setColor(TEXTO);
                graphics2D.drawString(this.titulo.toUpperCase(), x, h / 2 - 1);
                if (this.subtitulo != null) {
                    graphics2D.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
                    graphics2D.setColor(TEXTO_SUAVE);
                    graphics2D.drawString(this.subtitulo, x, h / 2 + 17);
                }
            }
            graphics2D.dispose();
        }
    }

    /**
     * Tela do jogo que ocupa a janela toda (fundo do estádio). Dentro do PainelFundoTelaModo, que centraliza no
     * tamanho preferido, pede o tamanho da janela; abaixo do mínimo, a rolagem da janela assume.
     */
    public static class Tela
    extends Fundo {
        private final Dimension minimo;

        public Tela(LayoutManager layoutManager, int largura, int altura) {
            super(layoutManager);
            this.minimo = new Dimension(largura, altura);
        }

        @Override
        public Dimension getPreferredSize() {
            return Tela.tamanho(this, this.minimo.width, this.minimo.height);
        }

        /** Tamanho da área do pai (a janela), nunca abaixo do mínimo. Para telas que não estendem Tela. */
        public static Dimension tamanho(Component component, int largura, int altura) {
            Container pai = component.getParent();
            if (pai == null || pai.getParent() instanceof javax.swing.JViewport || pai.getWidth() <= 0) {
                return new Dimension(largura, altura);
            }
            Insets i = pai.getInsets();
            return new Dimension(Math.max(largura, pai.getWidth() - i.left - i.right), Math.max(altura, pai.getHeight() - i.top - i.bottom));
        }
    }

    /** Centraliza o conteúdo na horizontal, sem passar de uma largura máxima (telas largas não esticam demais). */
    public static JPanel centralizar(final JComponent jComponent, final int larguraMaxima) {
        JPanel jPanel = new JPanel(new LayoutManager() {
            @Override
            public void addLayoutComponent(String string, Component component) {
            }

            @Override
            public void removeLayoutComponent(Component component) {
            }

            @Override
            public Dimension preferredLayoutSize(Container container) {
                Dimension d = jComponent.getPreferredSize();
                return new Dimension(Math.min(d.width, larguraMaxima), d.height);
            }

            @Override
            public Dimension minimumLayoutSize(Container container) {
                return jComponent.getMinimumSize();
            }

            @Override
            public void layoutContainer(Container container) {
                int w = Math.min(container.getWidth(), larguraMaxima);
                jComponent.setBounds((container.getWidth() - w) / 2, 0, w, container.getHeight());
            }
        });
        jPanel.setOpaque(false);
        jPanel.add(jComponent);
        return jPanel;
    }

    /** Cabeçalho de cartão: título em caixa alta, linha de apoio opcional e um componente à direita. */
    public static JPanel cabecalho(String titulo, String subtitulo, Component direita) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(12, 0));
        jPanel.setOpaque(false);
        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new javax.swing.BoxLayout(textos, 1));
        JLabel jTitulo = new JLabel(titulo.toUpperCase());
        jTitulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(20.0f), 0.03f));
        jTitulo.setForeground(TEXTO);
        jTitulo.putClientProperty("tema.ok", Boolean.TRUE);
        textos.add(jTitulo);
        if (subtitulo != null) {
            JLabel jSub = new JLabel(subtitulo);
            jSub.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            jSub.setForeground(TEXTO_SUAVE);
            jSub.putClientProperty("tema.ok", Boolean.TRUE);
            textos.add(jSub);
        }
        jPanel.add((Component)textos, "Center");
        if (direita != null) {
            JPanel canto = new JPanel(new java.awt.BorderLayout());
            canto.setOpaque(false);
            canto.add(direita, "North");
            jPanel.add((Component)canto, "East");
        }
        return jPanel;
    }

    /** Linha fina que separa blocos dentro de um cartão. */
    public static JComponent divisor() {
        JComponent jComponent = new JComponent() {
            @Override
            protected void paintComponent(Graphics graphics) {
                graphics.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
                graphics.fillRect(0, this.getHeight() / 2, this.getWidth(), 1);
            }
        };
        jComponent.setPreferredSize(new Dimension(10, 21));
        jComponent.setMaximumSize(new Dimension(Integer.MAX_VALUE, 21));
        jComponent.setAlignmentX(0.0f);
        return jComponent;
    }

    /** Marcador de "jogar/não jogar" em tabelas: o mesmo quadrado com check verde das caixas de seleção. */
    public static Icon marcador(final boolean marcado) {
        return new Icon() {
            @Override
            public void paintIcon(Component component, Graphics graphics, int x, int y) {
                Graphics2D g = TemaBetfoot.suave(graphics);
                RoundRectangle2D.Double forma = new RoundRectangle2D.Double(x + 0.5, y + 0.5, 17.0, 17.0, 6.0, 6.0);
                g.setColor(marcado ? VERDE_BOTAO : TemaBetfoot.alfa(Color.WHITE, 0.06));
                g.fill(forma);
                g.setColor(marcado ? TemaBetfoot.alfa(VERDE, 0.8) : TemaBetfoot.alfa(Color.WHITE, 0.25));
                g.draw(forma);
                if (marcado) {
                    g.setColor(Color.WHITE);
                    g.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(x + 4.5, y + 9.5);
                    p.lineTo(x + 7.5, y + 12.5);
                    p.lineTo(x + 13.5, y + 5.5);
                    g.draw(p);
                }
                g.dispose();
            }

            @Override
            public int getIconWidth() {
                return 18;
            }

            @Override
            public int getIconHeight() {
                return 18;
            }
        };
    }

    /** Indicador de etapas ("1 Competições — 2 Técnico e time"): feitas e atual em verde, próximas apagadas. */
    public static class Passos
    extends JComponent {
        private final String[] nomes;
        private final int atual;

        public Passos(int n, String ... stringArray) {
            this.atual = n;
            this.nomes = stringArray;
            this.setPreferredSize(new Dimension(this.largura(), 40));
        }

        private int largura() {
            FontMetrics fm = this.getFontMetrics(TemaBetfoot.espacada(TemaBetfoot.display(15.0f), 0.06f));
            int w = 0;
            for (String s : this.nomes) {
                w += 30 + 10 + fm.stringWidth(s.toUpperCase());
            }
            return w + (this.nomes.length - 1) * 52;
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int h = this.getHeight();
            int x = Math.max(0, this.getWidth() - this.largura());
            Font fonte = TemaBetfoot.espacada(TemaBetfoot.display(15.0f), 0.06f);
            for (int i = 0; i < this.nomes.length; ++i) {
                boolean feito = i < this.atual;
                boolean agora = i == this.atual;
                int cy = h / 2;
                Ellipse2D.Double bola = new Ellipse2D.Double(x, cy - 15, 30, 30);
                g.setColor(agora ? VERDE_BOTAO : (feito ? TemaBetfoot.alfa(VERDE, 0.18) : TemaBetfoot.alfa(Color.WHITE, 0.06)));
                g.fill(bola);
                g.setColor(agora || feito ? TemaBetfoot.alfa(VERDE, 0.8) : TemaBetfoot.alfa(Color.WHITE, 0.2));
                g.draw(bola);
                if (feito) {
                    g.setStroke(new BasicStroke(2.2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(x + 9.5, cy + 0.5);
                    p.lineTo(x + 13.5, cy + 4.5);
                    p.lineTo(x + 20.5, cy - 4.5);
                    g.setColor(VERDE);
                    g.draw(p);
                    g.setStroke(new BasicStroke(1.0f));
                } else {
                    g.setFont(TemaBetfoot.display(16.0f));
                    FontMetrics fn = g.getFontMetrics();
                    String n = Integer.toString(i + 1);
                    g.setColor(agora ? Color.WHITE : TEXTO_FRACO);
                    g.drawString(n, x + (30 - fn.stringWidth(n)) / 2, cy + (fn.getAscent() - fn.getDescent()) / 2);
                }
                x += 40;
                g.setFont(fonte);
                FontMetrics fm = g.getFontMetrics();
                String s = this.nomes[i].toUpperCase();
                g.setColor(agora ? TEXTO : (feito ? TEXTO_SUAVE : TEXTO_FRACO));
                g.drawString(s, x, cy + (fm.getAscent() - fm.getDescent()) / 2);
                x += fm.stringWidth(s);
                if (i < this.nomes.length - 1) {
                    g.setColor(feito ? TemaBetfoot.alfa(VERDE, 0.5) : TemaBetfoot.alfa(Color.WHITE, 0.14));
                    g.fillRect(x + 12, cy, 28, 2);
                    x += 52;
                }
            }
            g.dispose();
        }
    }

    // ----- Bandeiras e imagens -----

    private static final java.util.Map<String, Icon> BANDEIRAS = new java.util.HashMap<String, Icon>();

    /**
     * Bandeira retangular moderna (abandeiras/<índice>.png, do flagcdn) com cantos arredondados e contorno sutil;
     * se faltar, usa a bandeira redonda antiga (aflags/).
     */
    public static Icon bandeira(int n, int altura) {
        String chave = n + "/" + altura;
        Icon icon = BANDEIRAS.get(chave);
        if (icon == null) {
            Image image = TemaBetfoot.imagem("/abandeiras/" + n + ".png");
            if (image == null) {
                image = TemaBetfoot.imagem("/aflags/" + n + ".png");
                icon = image == null ? new ImageIcon() : new IconeEscalado(new ImageIcon(image), altura, altura, 0);
            } else {
                int largura = Math.max(altura, Math.round(altura * (float)image.getWidth(null) / image.getHeight(null)));
                icon = new IconeEscalado(new ImageIcon(image), Math.min(largura, Math.round(altura * 1.5f)), altura, Math.max(2, altura / 5));
            }
            BANDEIRAS.put(chave, icon);
        }
        return icon;
    }

    /** Encaixa um ícone (ex.: escudo de tamanho variado) num quadrado de "lado" px, sem deformar. */
    public static Icon encaixar(final Icon icon, final int lado) {
        if (icon == null || icon.getIconWidth() <= 0 || icon.getIconHeight() <= 0) {
            return icon;
        }
        final double escala = Math.min((double)lado / icon.getIconWidth(), (double)lado / icon.getIconHeight());
        return new Icon() {
            @Override
            public void paintIcon(Component component, Graphics graphics, int x, int y) {
                Graphics2D g = TemaBetfoot.suave(graphics);
                double w = icon.getIconWidth() * escala;
                double h = icon.getIconHeight() * escala;
                g.translate(x + (lado - w) / 2.0, y + (lado - h) / 2.0);
                g.scale(escala, escala);
                icon.paintIcon(component, g, 0, 0);
                g.dispose();
            }

            @Override
            public int getIconWidth() {
                return lado;
            }

            @Override
            public int getIconHeight() {
                return lado;
            }
        };
    }

    /** Desenha uma imagem em outro tamanho, com suavização e cantos arredondados opcionais. */
    public static class IconeEscalado
    implements Icon {
        private final Icon original;
        private final int largura;
        private final int altura;
        private final int raio;

        public IconeEscalado(Icon icon, int n, int n2, int n3) {
            this.original = icon;
            this.largura = n;
            this.altura = n2;
            this.raio = n3;
        }

        public static Icon escalar(Icon icon, double d) {
            if (icon == null || icon.getIconWidth() <= 0) {
                return icon;
            }
            return new IconeEscalado(icon, (int)Math.round(icon.getIconWidth() * d), (int)Math.round(icon.getIconHeight() * d), 0);
        }

        @Override
        public int getIconWidth() {
            return this.largura;
        }

        @Override
        public int getIconHeight() {
            return this.altura;
        }

        @Override
        public void paintIcon(Component component, Graphics graphics, int x, int y) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            if (this.raio > 0) {
                g.clip(new RoundRectangle2D.Double(x, y, this.largura, this.altura, this.raio * 2, this.raio * 2));
            }
            g.translate(x, y);
            g.scale((double)this.largura / Math.max(1, this.original.getIconWidth()), (double)this.altura / Math.max(1, this.original.getIconHeight()));
            this.original.paintIcon(component, g, 0, 0);
            g.dispose();
            if (this.raio > 0) {
                Graphics2D b = TemaBetfoot.suave(graphics);
                b.setColor(TemaBetfoot.alfa(Color.WHITE, 0.18));
                b.draw(new RoundRectangle2D.Double(x + 0.5, y + 0.5, this.largura - 1, this.altura - 1, this.raio * 2, this.raio * 2));
                b.dispose();
            }
        }
    }

    /** Título de seção: texto pequeno em caixa alta, espaçado. */
    public static JLabel rotulo(String string) {
        JLabel jLabel = new JLabel(string.toUpperCase());
        jLabel.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.08f));
        jLabel.setForeground(TEXTO_FRACO);
        return jLabel;
    }

    public static JLabel titulo(String string) {
        JLabel jLabel = new JLabel(string.toUpperCase());
        jLabel.setFont(TemaBetfoot.espacada(TemaBetfoot.display(24.0f), 0.02f));
        jLabel.setForeground(TEXTO);
        return jLabel;
    }

    // ----- Botões -----

    public static <B extends AbstractButton> B botao(B b, Estilo estilo) {
        b.setUI(new BotaoUI(estilo));
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setRolloverEnabled(true);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFont(TemaBetfoot.display(estilo == Estilo.CHIP || estilo == Estilo.FANTASMA ? 14.0f : 17.0f));
        b.setForeground(estilo == Estilo.PRIMARIO ? Color.WHITE : TEXTO);
        b.setIconTextGap(8);
        int v = estilo == Estilo.CHIP ? 6 : 9;
        int hz = estilo == Estilo.ICONE ? 9 : (estilo == Estilo.CHIP ? 12 : 16);
        b.setBorder(BorderFactory.createEmptyBorder(v, hz, v, hz));
        return b;
    }

    public static <B extends AbstractButton> B botao(B b, Estilo estilo, String string, Simbolo simbolo) {
        TemaBetfoot.botao(b, estilo);
        b.setText(string);
        b.setIcon(simbolo == null ? null : new IconeVetor(simbolo, 16, estilo == Estilo.PRIMARIO ? Color.WHITE : (estilo == Estilo.PERIGO ? VERMELHO : TEXTO)));
        return b;
    }

    /**
     * Botões no estilo de menu de jogo: forma inclinada (paralelogramo), texto em caixa alta condensado, brilho no
     * hover e leve afundamento ao clicar. ICONE é circular; FANTASMA e CHIP são discretos. Em ABA e SEGMENTO, o botão
     * ativo é o que tem ícone (é assim que o jogo marca Principal/Juniores); o ícone do jogo não é desenhado.
     */
    public static class BotaoUI
    extends BasicButtonUI {
        private static final int INCLINACAO = 9;
        private final Estilo estilo;

        public BotaoUI(Estilo estilo) {
            this.estilo = estilo;
        }

        private boolean inclinado() {
            return this.estilo == Estilo.PRIMARIO || this.estilo == Estilo.SECUNDARIO || this.estilo == Estilo.PERIGO || this.estilo == Estilo.DESTRUTIVO || this.estilo == Estilo.ABA || this.estilo == Estilo.SEGMENTO;
        }

        private boolean ativo(AbstractButton b) {
            return (this.estilo == Estilo.ABA || this.estilo == Estilo.SEGMENTO) && b.getIcon() != null;
        }

        private static java.awt.Shape paralelogramo(double x, double y, double w, double h, double k) {
            GeneralPath p = new GeneralPath();
            p.moveTo(x + k, y);
            p.lineTo(x + w, y);
            p.lineTo(x + w - k, y + h);
            p.lineTo(x, y + h);
            p.closePath();
            return p;
        }

        private String texto(AbstractButton b) {
            String s = b.getText();
            if (s == null || s.isEmpty()) {
                return "";
            }
            return this.estilo == Estilo.ICONE ? s : s.toUpperCase();
        }

        private Font fonteDe(AbstractButton b) {
            float tamanho = this.estilo == Estilo.CHIP ? 13.0f : (this.estilo == Estilo.FANTASMA ? 14.0f : 17.0f);
            return TemaBetfoot.espacada(TemaBetfoot.display(tamanho), 0.04f);
        }

        @Override
        public void paint(Graphics graphics, JComponent jComponent) {
            AbstractButton b = (AbstractButton)jComponent;
            ButtonModel m = b.getModel();
            boolean hover = m.isRollover() && b.isEnabled();
            boolean apertado = m.isArmed() && m.isPressed();
            boolean ativo = this.ativo(b);
            Graphics2D g = TemaBetfoot.suave(graphics);
            double w = b.getWidth();
            double h = b.getHeight();
            int afunda = apertado ? 1 : 0;
            java.awt.Shape forma;
            if (this.inclinado()) {
                forma = BotaoUI.paralelogramo(1.0, 1.0 + afunda, w - 2.0, h - 2.0 - afunda, INCLINACAO);
            } else if (this.estilo == Estilo.ICONE) {
                double d = Math.min(w, h) - 2.0;
                forma = new Ellipse2D.Double((w - d) / 2.0, (h - d) / 2.0 + afunda, d, d);
            } else {
                forma = new RoundRectangle2D.Double(0.5, 0.5 + afunda, w - 1.0, h - 1.0 - afunda, h, h);
            }
            Color texto = TEXTO;
            switch (this.estilo) {
                case PRIMARIO: {
                    if (hover) {
                        // Brilho verde em volta.
                        for (int i = 3; i >= 1; --i) {
                            g.setStroke(new BasicStroke(i * 3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                            g.setColor(TemaBetfoot.alfa(VERDE, 0.09));
                            g.draw(forma);
                        }
                    }
                    Color c1 = apertado ? new Color(22, 163, 74) : (hover ? new Color(74, 240, 140) : new Color(34, 222, 110));
                    Color c2 = apertado ? new Color(21, 128, 61) : (hover ? new Color(34, 197, 94) : new Color(22, 170, 80));
                    g.setPaint(new GradientPaint(0.0f, 0.0f, c1, 0.0f, (float)h, c2));
                    g.fill(forma);
                    texto = new Color(4, 22, 12);
                    break;
                }
                case DESTRUTIVO: {
                    if (hover) {
                        for (int i = 3; i >= 1; --i) {
                            g.setStroke(new BasicStroke(i * 3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                            g.setColor(TemaBetfoot.alfa(new Color(239, 68, 68), 0.1));
                            g.draw(forma);
                        }
                    }
                    Color c1 = apertado ? new Color(185, 28, 28) : (hover ? new Color(248, 90, 90) : new Color(239, 68, 68));
                    Color c2 = apertado ? new Color(153, 27, 27) : (hover ? new Color(220, 38, 38) : new Color(200, 30, 30));
                    g.setPaint(new GradientPaint(0.0f, 0.0f, c1, 0.0f, (float)h, c2));
                    g.fill(forma);
                    texto = Color.WHITE;
                    break;
                }
                case SECUNDARIO:
                    g.setColor(TemaBetfoot.alfa(Color.WHITE, apertado ? 0.14 : (hover ? 0.1 : 0.06)));
                    g.fill(forma);
                    g.setStroke(new BasicStroke(1.2f));
                    g.setColor(hover ? TemaBetfoot.alfa(VERDE, 0.9) : TemaBetfoot.alfa(Color.WHITE, 0.16));
                    g.draw(forma);
                    break;
                case PERIGO:
                    g.setColor(TemaBetfoot.alfa(VERMELHO, apertado ? 0.32 : (hover ? 0.22 : 0.1)));
                    g.fill(forma);
                    g.setStroke(new BasicStroke(1.2f));
                    g.setColor(TemaBetfoot.alfa(VERMELHO, hover ? 0.8 : 0.35));
                    g.draw(forma);
                    texto = new Color(254, 202, 202);
                    break;
                case ABA:
                case SEGMENTO:
                    if (ativo) {
                        g.setPaint(new GradientPaint(0.0f, 0.0f, new Color(34, 222, 110), 0.0f, (float)h, new Color(22, 170, 80)));
                        g.fill(forma);
                        texto = new Color(4, 22, 12);
                    } else {
                        g.setColor(TemaBetfoot.alfa(Color.WHITE, hover ? 0.1 : 0.04));
                        g.fill(forma);
                        texto = hover ? TEXTO : TEXTO_SUAVE;
                    }
                    break;
                case ICONE:
                    g.setColor(hover ? TemaBetfoot.alfa(VERDE, apertado ? 0.32 : 0.2) : TemaBetfoot.alfa(Color.WHITE, 0.06));
                    g.fill(forma);
                    g.setStroke(new BasicStroke(1.2f));
                    g.setColor(hover ? TemaBetfoot.alfa(VERDE, 0.8) : TemaBetfoot.alfa(Color.WHITE, 0.12));
                    g.draw(forma);
                    texto = hover ? VERDE : TEXTO;
                    break;
                case CHIP:
                    g.setColor(TemaBetfoot.alfa(Color.WHITE, apertado ? 0.12 : (hover ? 0.08 : 0.0)));
                    g.fill(forma);
                    g.setColor(hover ? TemaBetfoot.alfa(VERDE, 0.8) : TemaBetfoot.alfa(Color.WHITE, 0.18));
                    g.draw(forma);
                    texto = hover ? TEXTO : TEXTO_SUAVE;
                    break;
                default:
                    texto = hover ? VERDE : TEXTO_SUAVE;
            }
            if (!b.isEnabled()) {
                texto = TEXTO_FRACO;
            }
            // Ícone + texto centralizados.
            Icon icon;
            if (this.estilo == Estilo.ABA || this.estilo == Estilo.SEGMENTO) {
                Object simbolo = b.getClientProperty("simbolo");
                icon = simbolo instanceof Simbolo ? new IconeVetor((Simbolo)simbolo, 18, texto) : null;
            } else {
                icon = b.getIcon();
                if (icon instanceof IconeVetor) {
                    icon = ((IconeVetor)icon).cor(this.estilo == Estilo.PERIGO ? VERMELHO : texto);
                }
            }
            String s = this.texto(b);
            Font font = this.fonteDe(b);
            g.setFont(font);
            FontMetrics fm = g.getFontMetrics();
            int tw = s.isEmpty() ? 0 : fm.stringWidth(s);
            int iw = icon == null ? 0 : icon.getIconWidth();
            int gap = icon != null && tw > 0 ? 8 : 0;
            int x = (int)Math.round((w - (iw + gap + tw)) / 2.0);
            if (icon != null) {
                icon.paintIcon(b, g, x, (int)Math.round((h - icon.getIconHeight()) / 2.0) + afunda);
            }
            if (tw > 0) {
                g.setColor(texto);
                g.drawString(s, x + iw + gap, (int)Math.round((h + fm.getAscent() - fm.getDescent()) / 2.0) + afunda);
            }
            if (this.estilo == Estilo.FANTASMA && hover && tw > 0) {
                g.setColor(VERDE);
                g.fillRect(x + iw + gap, (int)h - 6, tw, 2);
            }
            g.dispose();
        }

        @Override
        public Dimension getPreferredSize(JComponent jComponent) {
            AbstractButton b = (AbstractButton)jComponent;
            FontMetrics fm = b.getFontMetrics(this.fonteDe(b));
            String s = this.texto(b);
            int tw = s.isEmpty() ? 0 : fm.stringWidth(s);
            Icon icon = this.estilo == Estilo.ABA || this.estilo == Estilo.SEGMENTO ? (b.getClientProperty("simbolo") != null ? new IconeVetor(Simbolo.PESSOA, 18, TEXTO) : null) : b.getIcon();
            int iw = icon == null ? 0 : icon.getIconWidth();
            int ih = icon == null ? 0 : icon.getIconHeight();
            int gap = icon != null && tw > 0 ? 8 : 0;
            if (this.estilo == Estilo.ICONE) {
                int d = Math.max(42, Math.max(iw, ih) + 22);
                return new Dimension(d, d);
            }
            int ph = this.estilo == Estilo.CHIP ? 30 : (this.estilo == Estilo.FANTASMA ? 36 : 42);
            int pad = this.estilo == Estilo.CHIP ? 10 : (this.estilo == Estilo.FANTASMA ? 8 : 24);
            return new Dimension(pad * 2 + iw + gap + tw + (this.inclinado() ? INCLINACAO : 0), Math.max(ph, ih + 16));
        }
    }

    // ----- Ícones vetoriais -----

    public static class IconeVetor
    implements Icon {
        private final Simbolo simbolo;
        private final int tamanho;
        private final Color cor;

        public IconeVetor(Simbolo simbolo, int n, Color color) {
            this.simbolo = simbolo;
            this.tamanho = n;
            this.cor = color;
        }

        public IconeVetor cor(Color color) {
            return new IconeVetor(this.simbolo, this.tamanho, color);
        }

        @Override
        public int getIconWidth() {
            return this.tamanho;
        }

        @Override
        public int getIconHeight() {
            return this.tamanho;
        }

        @Override
        public void paintIcon(Component component, Graphics graphics, int x, int y) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            double s = this.tamanho;
            g.translate(x, y);
            g.setColor(this.cor);
            g.setStroke(new BasicStroke((float)Math.max(1.5, s / 9.0), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            switch (this.simbolo) {
                case MAIS:
                    g.draw(new Line2D.Double(s * 0.5, s * 0.18, s * 0.5, s * 0.82));
                    g.draw(new Line2D.Double(s * 0.18, s * 0.5, s * 0.82, s * 0.5));
                    break;
                case LAPIS: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.66, s * 0.14);
                    p.lineTo(s * 0.86, s * 0.34);
                    p.lineTo(s * 0.36, s * 0.84);
                    p.lineTo(s * 0.14, s * 0.86);
                    p.lineTo(s * 0.16, s * 0.64);
                    p.closePath();
                    g.draw(p);
                    break;
                }
                case LIXEIRA: {
                    g.draw(new Line2D.Double(s * 0.16, s * 0.26, s * 0.84, s * 0.26));
                    g.draw(new Line2D.Double(s * 0.4, s * 0.14, s * 0.6, s * 0.14));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.26, s * 0.26);
                    p.lineTo(s * 0.31, s * 0.86);
                    p.lineTo(s * 0.69, s * 0.86);
                    p.lineTo(s * 0.74, s * 0.26);
                    g.draw(p);
                    break;
                }
                case CASA: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.14, s * 0.46);
                    p.lineTo(s * 0.5, s * 0.14);
                    p.lineTo(s * 0.86, s * 0.46);
                    p.moveTo(s * 0.24, s * 0.38);
                    p.lineTo(s * 0.24, s * 0.86);
                    p.lineTo(s * 0.76, s * 0.86);
                    p.lineTo(s * 0.76, s * 0.38);
                    g.draw(p);
                    break;
                }
                case VOLTAR: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.84, s * 0.5);
                    p.lineTo(s * 0.16, s * 0.5);
                    p.moveTo(s * 0.42, s * 0.22);
                    p.lineTo(s * 0.14, s * 0.5);
                    p.lineTo(s * 0.42, s * 0.78);
                    g.draw(p);
                    break;
                }
                case AVANCAR: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.16, s * 0.5);
                    p.lineTo(s * 0.84, s * 0.5);
                    p.moveTo(s * 0.58, s * 0.22);
                    p.lineTo(s * 0.86, s * 0.5);
                    p.lineTo(s * 0.58, s * 0.78);
                    g.draw(p);
                    break;
                }
                case SUBIR:
                case DESCER: {
                    boolean sobe = this.simbolo == Simbolo.SUBIR;
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.5, s * 0.16);
                    p.lineTo(s * 0.5, s * 0.84);
                    if (sobe) {
                        p.moveTo(s * 0.22, s * 0.42);
                        p.lineTo(s * 0.5, s * 0.14);
                        p.lineTo(s * 0.78, s * 0.42);
                    } else {
                        p.moveTo(s * 0.22, s * 0.58);
                        p.lineTo(s * 0.5, s * 0.86);
                        p.lineTo(s * 0.78, s * 0.58);
                    }
                    g.draw(p);
                    break;
                }
                case SAIR: {
                    g.draw(new java.awt.geom.Arc2D.Double(s * 0.15, s * 0.18, s * 0.7, s * 0.7, 125.0, -250.0, java.awt.geom.Arc2D.OPEN));
                    g.draw(new Line2D.Double(s * 0.5, s * 0.1, s * 0.5, s * 0.48));
                    break;
                }
                case LUPA:
                    g.draw(new Ellipse2D.Double(s * 0.14, s * 0.14, s * 0.52, s * 0.52));
                    g.draw(new Line2D.Double(s * 0.6, s * 0.6, s * 0.86, s * 0.86));
                    break;
                case DADO: {
                    g.draw(new RoundRectangle2D.Double(s * 0.14, s * 0.14, s * 0.72, s * 0.72, s * 0.22, s * 0.22));
                    double d = s * 0.12;
                    for (double[] c : new double[][]{{0.34, 0.34}, {0.66, 0.66}, {0.5, 0.5}, {0.66, 0.34}, {0.34, 0.66}}) {
                        g.fill(new Ellipse2D.Double(s * c[0] - d / 2, s * c[1] - d / 2, d, d));
                    }
                    break;
                }
                case PESSOA:
                    g.fill(new Ellipse2D.Double(s * 0.32, s * 0.08, s * 0.36, s * 0.36));
                    g.fill(new java.awt.geom.Arc2D.Double(s * 0.12, s * 0.52, s * 0.76, s * 0.76, 0.0, 180.0, java.awt.geom.Arc2D.CHORD));
                    break;
                case PESSOAS:
                    g.fill(new Ellipse2D.Double(s * 0.2, s * 0.14, s * 0.3, s * 0.3));
                    g.fill(new java.awt.geom.Arc2D.Double(s * 0.04, s * 0.52, s * 0.62, s * 0.66, 0.0, 180.0, java.awt.geom.Arc2D.CHORD));
                    g.setColor(TemaBetfoot.alfa(this.cor, 0.6));
                    g.fill(new Ellipse2D.Double(s * 0.56, s * 0.2, s * 0.24, s * 0.24));
                    g.fill(new java.awt.geom.Arc2D.Double(s * 0.5, s * 0.54, s * 0.46, s * 0.5, 0.0, 180.0, java.awt.geom.Arc2D.CHORD));
                    break;
                case ESTADIO: {
                    // Arquibancada oval vista de cima com o campo no meio.
                    g.draw(new Ellipse2D.Double(s * 0.06, s * 0.2, s * 0.88, s * 0.6));
                    g.draw(new Ellipse2D.Double(s * 0.26, s * 0.34, s * 0.48, s * 0.32));
                    g.draw(new Line2D.Double(s * 0.5, s * 0.34, s * 0.5, s * 0.66));
                    break;
                }
                case NIVEL:
                    for (int i = 0; i < 4; ++i) {
                        double bh = s * (0.24 + 0.2 * i);
                        g.fill(new RoundRectangle2D.Double(s * (0.08 + 0.23 * i), s * 0.9 - bh, s * 0.16, bh, s * 0.06, s * 0.06));
                    }
                    break;
                case APITO: {
                    g.draw(new Ellipse2D.Double(s * 0.08, s * 0.38, s * 0.46, s * 0.46));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.4, s * 0.4);
                    p.lineTo(s * 0.92, s * 0.26);
                    p.lineTo(s * 0.92, s * 0.48);
                    p.lineTo(s * 0.52, s * 0.56);
                    g.draw(p);
                    g.fill(new Ellipse2D.Double(s * 0.24, s * 0.54, s * 0.14, s * 0.14));
                    break;
                }
                case MAPA: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.5, s * 0.92);
                    p.curveTo(s * 0.2, s * 0.6, s * 0.16, s * 0.48, s * 0.16, s * 0.4);
                    p.curveTo(s * 0.16, s * 0.2, s * 0.32, s * 0.06, s * 0.5, s * 0.06);
                    p.curveTo(s * 0.68, s * 0.06, s * 0.84, s * 0.2, s * 0.84, s * 0.4);
                    p.curveTo(s * 0.84, s * 0.48, s * 0.8, s * 0.6, s * 0.5, s * 0.92);
                    g.draw(p);
                    g.draw(new Ellipse2D.Double(s * 0.38, s * 0.28, s * 0.24, s * 0.24));
                    break;
                }
                case TROFEU: {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.26, s * 0.12);
                    p.lineTo(s * 0.74, s * 0.12);
                    p.lineTo(s * 0.7, s * 0.46);
                    p.curveTo(s * 0.66, s * 0.58, s * 0.34, s * 0.58, s * 0.3, s * 0.46);
                    p.closePath();
                    g.draw(p);
                    g.draw(new Line2D.Double(s * 0.5, s * 0.6, s * 0.5, s * 0.76));
                    g.draw(new Line2D.Double(s * 0.32, s * 0.86, s * 0.68, s * 0.86));
                    g.draw(new java.awt.geom.Arc2D.Double(s * 0.08, s * 0.16, s * 0.24, s * 0.24, 90.0, 180.0, java.awt.geom.Arc2D.OPEN));
                    g.draw(new java.awt.geom.Arc2D.Double(s * 0.68, s * 0.16, s * 0.24, s * 0.24, 90.0, -180.0, java.awt.geom.Arc2D.OPEN));
                    break;
                }
                default: {
                    // Jogador (cabeça e ombros) + sinal.
                    g.draw(new Ellipse2D.Double(s * 0.16, s * 0.12, s * 0.34, s * 0.34));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(s * 0.06, s * 0.88);
                    p.curveTo(s * 0.06, s * 0.62, s * 0.2, s * 0.56, s * 0.33, s * 0.56);
                    p.curveTo(s * 0.46, s * 0.56, s * 0.6, s * 0.62, s * 0.6, s * 0.88);
                    g.draw(p);
                    if (this.simbolo == Simbolo.JOGADOR_MAIS) {
                        g.draw(new Line2D.Double(s * 0.8, s * 0.26, s * 0.8, s * 0.58));
                        g.draw(new Line2D.Double(s * 0.64, s * 0.42, s * 0.96, s * 0.42));
                    } else if (this.simbolo == Simbolo.JOGADOR_MENOS) {
                        g.draw(new Line2D.Double(s * 0.64, s * 0.42, s * 0.96, s * 0.42));
                    } else {
                        g.draw(new Line2D.Double(s * 0.66, s * 0.66, s * 0.94, s * 0.3));
                    }
                }
            }
            g.dispose();
        }
    }

    // ----- Campos -----

    /** Campo de texto escuro, sem borda própria, com texto de exemplo quando vazio. */
    public static class Campo
    extends JTextField {
        private final String exemplo;

        public Campo(String string) {
            this.exemplo = string;
            this.setOpaque(false);
            this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            this.setForeground(TEXTO);
            this.setCaretColor(VERDE);
            this.setSelectionColor(VERDE_SELECAO);
            this.setSelectedTextColor(Color.WHITE);
            this.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            if (this.getText().isEmpty() && this.exemplo != null) {
                Graphics2D graphics2D = TemaBetfoot.suave(graphics);
                graphics2D.setFont(this.getFont());
                graphics2D.setColor(TEXTO_FRACO);
                FontMetrics fontMetrics = graphics2D.getFontMetrics();
                graphics2D.drawString(this.exemplo, this.getInsets().left, (this.getHeight() + fontMetrics.getAscent() - fontMetrics.getDescent()) / 2);
                graphics2D.dispose();
            }
        }
    }

    /** Caixa arredondada com lupa à esquerda, o campo e o botão de buscar à direita; Enter também busca. */
    public static JPanel caixaBusca(final JTextField jTextField, final JButton jButton) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(8, 0)) {
            @Override
            protected void paintComponent(Graphics graphics) {
                Graphics2D graphics2D = TemaBetfoot.suave(graphics);
                RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, 12.0, 12.0);
                graphics2D.setColor(CAMPO);
                graphics2D.fill(forma);
                graphics2D.setColor(jTextField.isFocusOwner() ? TemaBetfoot.alfa(VERDE, 0.7) : TemaBetfoot.alfa(Color.WHITE, 0.12));
                graphics2D.draw(forma);
                graphics2D.dispose();
            }
        };
        jPanel.setOpaque(false);
        jPanel.setBorder(BorderFactory.createEmptyBorder(4, 12, 4, 4));
        JLabel lupa = new JLabel(new IconeVetor(Simbolo.LUPA, 15, TEXTO_FRACO));
        jPanel.add((Component)lupa, "West");
        jPanel.add((Component)jTextField, "Center");
        TemaBetfoot.botao(jButton, Estilo.PRIMARIO);
        jButton.setIcon(null);
        jButton.setText("Buscar");
        jButton.setFont(TemaBetfoot.fonte(Font.BOLD, 12.0f));
        jButton.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
        jPanel.add((Component)jButton, "East");
        jTextField.addActionListener(actionEvent -> jButton.doClick());
        jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent focusEvent) {
                jPanel.repaint();
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent focusEvent) {
                jPanel.repaint();
            }
        });
        return jPanel;
    }

    public static void combo(JComboBox<?> jComboBox) {
        jComboBox.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton jButton = new JButton(new Icon() {
                    @Override
                    public void paintIcon(Component component, Graphics graphics, int x, int y) {
                        Graphics2D g = TemaBetfoot.suave(graphics);
                        g.setColor(TEXTO_SUAVE);
                        g.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        GeneralPath p = new GeneralPath();
                        p.moveTo(x + 1, y + 2);
                        p.lineTo(x + 5, y + 6);
                        p.lineTo(x + 9, y + 2);
                        g.draw(p);
                        g.dispose();
                    }

                    @Override
                    public int getIconWidth() {
                        return 10;
                    }

                    @Override
                    public int getIconHeight() {
                        return 8;
                    }
                });
                jButton.setContentAreaFilled(false);
                jButton.setBorderPainted(false);
                jButton.setFocusPainted(false);
                jButton.setOpaque(false);
                jButton.setBorder(BorderFactory.createEmptyBorder(0, 6, 0, 10));
                return jButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics graphics, java.awt.Rectangle rectangle, boolean bl) {
            }

            @Override
            protected javax.swing.plaf.basic.ComboPopup createPopup() {
                // Lista que abre: escura, com borda verde e rolagem fina.
                javax.swing.plaf.basic.BasicComboPopup popup = new javax.swing.plaf.basic.BasicComboPopup(this.comboBox) {
                    @Override
                    protected JScrollPane createScroller() {
                        JScrollPane sp = super.createScroller();
                        TemaBetfoot.rolagem(sp);
                        sp.getViewport().setBackground(CARTAO_SOLIDO);
                        return sp;
                    }
                };
                popup.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(34, 50, 42)), BorderFactory.createEmptyBorder(4, 4, 4, 4)));
                popup.setBackground(CARTAO_SOLIDO);
                popup.getList().setBackground(CARTAO_SOLIDO);
                popup.getList().setForeground(TEXTO);
                popup.getList().setSelectionBackground(VERDE_SELECAO);
                popup.getList().setSelectionForeground(Color.WHITE);
                popup.getList().setFixedCellHeight(34);
                return popup;
            }
        });
        jComboBox.setOpaque(false);
        jComboBox.setForeground(TEXTO);
        jComboBox.setBackground(CARTAO_SOLIDO);
        jComboBox.setFont(TemaBetfoot.fonte(Font.BOLD, 13.0f));
        jComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jComboBox.setBorder(new javax.swing.border.AbstractBorder() {
            @Override
            public void paintBorder(Component component, Graphics graphics, int x, int y, int w, int h) {
                Graphics2D graphics2D = TemaBetfoot.suave(graphics);
                RoundRectangle2D.Double forma = new RoundRectangle2D.Double(x + 0.5, y + 0.5, w - 1, h - 1, 10.0, 10.0);
                graphics2D.setColor(TemaBetfoot.alfa(Color.WHITE, 0.05));
                graphics2D.fill(forma);
                graphics2D.setColor(TemaBetfoot.alfa(Color.WHITE, 0.14));
                graphics2D.draw(forma);
                graphics2D.dispose();
            }

            @Override
            public Insets getBorderInsets(Component component) {
                return new Insets(6, 12, 6, 2);
            }
        });
        final ListCellRenderer renderer = jComboBox.getRenderer();
        jComboBox.setRenderer(new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
                Component component = renderer.getListCellRendererComponent(jList, object, n, bl, bl2);
                if (component instanceof JComponent) {
                    ((JComponent)component).setOpaque(n >= 0);
                    ((JComponent)component).setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
                }
                component.setBackground(bl ? VERDE_SELECAO : CARTAO_SOLIDO);
                component.setForeground(bl ? Color.WHITE : TEXTO);
                component.setFont(TemaBetfoot.fonte(n >= 0 ? Font.PLAIN : Font.BOLD, 14.0f));
                if (component instanceof JLabel) {
                    // Bandeira redonda antiga (aflags/N.png) -> bandeira retangular nova.
                    JLabel l = (JLabel)component;
                    Icon icon = l.getIcon();
                    if (icon instanceof ImageIcon && ((ImageIcon)icon).getDescription() != null) {
                        java.util.regex.Matcher m = java.util.regex.Pattern.compile("/aflags/(\\d+)\\.png").matcher(((ImageIcon)icon).getDescription());
                        if (m.find()) {
                            l.setIcon(TemaBetfoot.bandeira(Integer.parseInt(m.group(1)), 14));
                        }
                    }
                    l.setIconTextGap(10);
                }
                return component;
            }
        });
    }

    // ----- Tabelas -----

    /** Tabela escura, linhas altas, sem grade, cabeçalho discreto, rolagem fina. */
    public static void tabela(JTable jTable, JScrollPane jScrollPane) {
        jTable.setOpaque(true);
        jTable.setBackground(LINHA_IMPAR);
        jTable.setForeground(TEXTO);
        jTable.setSelectionBackground(VERDE_SELECAO);
        jTable.setSelectionForeground(Color.WHITE);
        jTable.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        jTable.setRowHeight(36);
        jTable.setShowGrid(false);
        jTable.setIntercellSpacing(new Dimension(0, 0));
        jTable.setFillsViewportHeight(true);
        JTableHeader jTableHeader = jTable.getTableHeader();
        jTableHeader.setDefaultRenderer(new CabecalhoRenderer());
        jTableHeader.setPreferredSize(new Dimension(jTableHeader.getPreferredSize().width, 36));
        jTableHeader.setBackground(LINHA_IMPAR);
        jTableHeader.setBorder(BorderFactory.createEmptyBorder());
        TemaBetfoot.rolagem(jScrollPane);
    }

    public static void rolagem(JScrollPane jScrollPane) {
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane.setViewportBorder(null);
        jScrollPane.getViewport().setBackground(LINHA_IMPAR);
        jScrollPane.setBackground(LINHA_IMPAR);
        jScrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, new JPanel() {
            {
                this.setBackground(LINHA_IMPAR);
            }
        });
        for (JScrollBar jScrollBar : new JScrollBar[]{jScrollPane.getVerticalScrollBar(), jScrollPane.getHorizontalScrollBar()}) {
            if (jScrollBar == null) {
                continue;
            }
            jScrollBar.setUI(new BarraRolagemUI());
            jScrollBar.setOpaque(true);
            jScrollBar.setBackground(LINHA_IMPAR);
            jScrollBar.setUnitIncrement(30);
            jScrollBar.setPreferredSize(new Dimension(10, 10));
        }
    }

    /**
     * Cores das linhas de uma tabela com o tema: listras discretas, seleção verde. Chamar no prepareRenderer.
     * Texto vermelho (time marcado no editor) continua vermelho, só mais claro.
     */
    public static Component linha(JTable jTable, Component component, int n, int n2) {
        boolean selecionada = jTable.isRowSelected(n);
        Color atual = component.getForeground();
        boolean marcado = Color.RED.equals(atual);
        component.setBackground(selecionada ? new Color(18, 72, 40) : LINHA_IMPAR);
        component.setForeground(marcado ? VERMELHO : (selecionada ? Color.WHITE : TEXTO));
        if (component instanceof JComponent) {
            // Linha selecionada: barra verde à esquerda, como nos menus de jogo.
            ((JComponent)component).setBorder(n2 == 0 && selecionada ? BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 3, 0, 0, VERDE), BorderFactory.createEmptyBorder(0, 11, 0, 6)) : BorderFactory.createEmptyBorder(0, n2 == 0 ? 14 : 6, 0, 6));
        }
        return component;
    }

    private static class CabecalhoRenderer
    extends DefaultTableCellRenderer {
        CabecalhoRenderer() {
            this.setHorizontalAlignment(SwingConstants.LEFT);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            super.getTableCellRendererComponent(jTable, object, false, false, n, n2);
            this.setText(object == null ? "" : object.toString().toUpperCase());
            this.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.08f));
            this.setForeground(TEXTO_FRACO);
            this.setBackground(LINHA_IMPAR);
            this.setOpaque(true);
            this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, TemaBetfoot.alfa(Color.WHITE, 0.06)), BorderFactory.createEmptyBorder(0, n2 == 0 ? 14 : 6, 0, 6)));
            return this;
        }
    }

    private static class BarraRolagemUI
    extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            this.trackColor = LINHA_IMPAR;
            this.thumbColor = TemaBetfoot.alfa(Color.WHITE, 0.18);
        }

        private JButton vazio() {
            JButton jButton = new JButton();
            jButton.setPreferredSize(new Dimension(0, 0));
            jButton.setMinimumSize(new Dimension(0, 0));
            jButton.setMaximumSize(new Dimension(0, 0));
            return jButton;
        }

        @Override
        protected JButton createDecreaseButton(int n) {
            return this.vazio();
        }

        @Override
        protected JButton createIncreaseButton(int n) {
            return this.vazio();
        }

        @Override
        protected void paintTrack(Graphics graphics, JComponent jComponent, java.awt.Rectangle rectangle) {
            graphics.setColor(LINHA_IMPAR);
            graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        }

        @Override
        protected void paintThumb(Graphics graphics, JComponent jComponent, java.awt.Rectangle rectangle) {
            if (rectangle.isEmpty()) {
                return;
            }
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            graphics2D.setColor(this.isThumbRollover() ? TemaBetfoot.alfa(VERDE, 0.6) : this.thumbColor);
            graphics2D.fill(new RoundRectangle2D.Double(rectangle.x + 2, rectangle.y + 2, rectangle.width - 4, rectangle.height - 4, 6.0, 6.0));
            graphics2D.dispose();
        }
    }

    /** Faixa fina com as duas cores do time (fundo → texto). */
    public static class FaixaCores
    extends JComponent {
        private Color c1 = VERDE_BOTAO;
        private Color c2 = VERDE;

        public FaixaCores() {
            this.setPreferredSize(new Dimension(10, 4));
        }

        public Color cor1() {
            return this.c1;
        }

        public Color cor2() {
            return this.c2;
        }

        public void cores(Color color, Color color2) {
            this.c1 = color == null ? VERDE_BOTAO : color;
            this.c2 = color2 == null ? VERDE : color2;
            // O cartão do time usa estas cores no fundo: redesenha ele inteiro, senão sobram faixas da cor antiga.
            Component p = this.getParent();
            while (p != null && !(p instanceof Cartao)) {
                p = p.getParent();
            }
            (p != null ? p : this).repaint();
        }

        /** A cor mais viva do time (para brilhos); verde do Betfoot se as duas forem branco/preto/cinza. */
        public Color corViva() {
            float[] h1 = Color.RGBtoHSB(this.c1.getRed(), this.c1.getGreen(), this.c1.getBlue(), null);
            float[] h2 = Color.RGBtoHSB(this.c2.getRed(), this.c2.getGreen(), this.c2.getBlue(), null);
            float s1 = h1[1] * h1[2];
            float s2 = h2[1] * h2[2];
            if (Math.max(s1, s2) < 0.25f) {
                return VERDE;
            }
            return s1 >= s2 ? this.c1 : this.c2;
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, this.c1, this.getWidth(), 0.0f, this.c2));
            graphics2D.fill(new RoundRectangle2D.Double(0.0, 0.0, this.getWidth(), this.getHeight(), this.getHeight(), this.getHeight()));
            graphics2D.dispose();
        }
    }

    /**
     * Mensagem de retorno (ex.: "jogador adicionado"): pílula verde que aparece com o texto e some sozinha
     * depois de alguns segundos.
     */
    public static class Aviso
    extends JLabel {
        private final javax.swing.Timer some = new javax.swing.Timer(4500, actionEvent -> Aviso.super.setText(""));

        public Aviso() {
            this.setHorizontalAlignment(SwingConstants.CENTER);
            this.setFont(TemaBetfoot.fonte(Font.BOLD, 13.0f));
            this.some.setRepeats(false);
        }

        @Override
        public void setText(String string) {
            super.setText(string);
            if (this.some != null && string != null && !string.isEmpty()) {
                this.some.restart();
            }
        }

        @Override
        public void setForeground(Color color) {
            super.setForeground(TEXTO);
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            String s = this.getText();
            if (s == null || s.isEmpty()) {
                return;
            }
            Graphics2D g = TemaBetfoot.suave(graphics);
            g.setFont(this.getFont());
            FontMetrics fm = g.getFontMetrics();
            int tw = fm.stringWidth(s) + 32;
            int th = 32;
            int x = (this.getWidth() - tw) / 2;
            int y = (this.getHeight() - th) / 2;
            g.setColor(TemaBetfoot.alfa(VERDE, 0.14));
            g.fill(new RoundRectangle2D.Double(x, y, tw, th, th, th));
            g.setColor(TemaBetfoot.alfa(VERDE, 0.5));
            g.draw(new RoundRectangle2D.Double(x + 0.5, y + 0.5, tw - 1, th - 1, th, th));
            g.setColor(TEXTO);
            g.drawString(s, x + 16, y + (th + fm.getAscent() - fm.getDescent()) / 2);
            g.dispose();
        }
    }

    /**
     * Lotação do elenco: lê os rótulos do jogo ("19/30" e "11" titulares) e mostra uma barra de progresso
     * com os números. Fica vermelha quando o elenco está cheio.
     */
    public static class Medidor
    extends JComponent {
        private final JLabel total;
        private final JLabel titulares;

        public Medidor(JLabel jLabel, JLabel jLabel2) {
            this.total = jLabel;
            this.titulares = jLabel2;
            this.setPreferredSize(new Dimension(330, 42));
            java.beans.PropertyChangeListener ouvinte = evento -> this.repaint();
            jLabel.addPropertyChangeListener("text", ouvinte);
            jLabel2.addPropertyChangeListener("text", ouvinte);
            this.setToolTipText("Jogadores no elenco e titulares");
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            String t = this.total.getText() == null ? "0/30" : this.total.getText();
            int atual = 0;
            int maximo = 30;
            try {
                String[] p = t.split("/");
                atual = Integer.parseInt(p[0].trim());
                maximo = Integer.parseInt(p[1].trim());
            }
            catch (Exception exception) {
                // mantém o padrão
            }
            int w = this.getWidth();
            int h = this.getHeight();
            // Titulares (direita).
            g.setFont(TemaBetfoot.display(26.0f));
            FontMetrics fm = g.getFontMetrics();
            String tit = this.titulares.getText() == null ? "0" : this.titulares.getText();
            int twTit = fm.stringWidth(tit);
            g.setColor(TEXTO);
            g.drawString(tit, w - twTit, h / 2 + 4);
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(12.0f), 0.08f));
            FontMetrics fm2 = g.getFontMetrics();
            g.setColor(TEXTO_FRACO);
            g.drawString("TITULARES", w - fm2.stringWidth("TITULARES"), h / 2 + 18);
            // Elenco (barra).
            int fim = w - Math.max(twTit, fm2.stringWidth("TITULARES")) - 28;
            g.setFont(TemaBetfoot.display(26.0f));
            String num = Integer.toString(atual);
            String max = "/" + maximo;
            int inicio = 0;
            g.setColor(TEXTO);
            g.drawString(num, inicio, h / 2 + 4);
            int nx = inicio + fm.stringWidth(num);
            g.setFont(TemaBetfoot.display(16.0f));
            g.setColor(TEXTO_FRACO);
            g.drawString(max, nx + 2, h / 2 + 4);
            int bx = nx + g.getFontMetrics().stringWidth(max) + 14;
            int bw = Math.max(40, fim - bx);
            double frac = maximo <= 0 ? 0.0 : Math.min(1.0, (double)atual / maximo);
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.1));
            g.fill(new RoundRectangle2D.Double(bx, h / 2.0 - 6, bw, 6.0, 6.0, 6.0));
            g.setColor(frac >= 1.0 ? VERMELHO : VERDE);
            g.fill(new RoundRectangle2D.Double(bx, h / 2.0 - 6, bw * frac, 6.0, 6.0, 6.0));
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(12.0f), 0.08f));
            g.setColor(TEXTO_FRACO);
            g.drawString(frac >= 1.0 ? "ELENCO CHEIO" : "ELENCO \u00b7 " + (maximo - atual) + " VAGAS", bx, h / 2 + 18);
            g.dispose();
        }
    }

    /** Moldura arredondada clara para destacar escudos e camisas. */
    public static class Moldura
    extends JPanel {
        public Moldura(Component component, int n) {
            super(new java.awt.GridBagLayout());
            this.setOpaque(false);
            this.setPreferredSize(new Dimension(n, n));
            this.setMinimumSize(new Dimension(n, n));
            this.add(component);
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            Rectangle2D.Double r = new Rectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1);
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(r.x, r.y, r.width, r.height, 18.0, 18.0);
            graphics2D.setColor(TemaBetfoot.alfa(Color.WHITE, 0.06));
            graphics2D.fill(forma);
            graphics2D.setColor(TemaBetfoot.alfa(Color.WHITE, 0.1));
            graphics2D.draw(forma);
            graphics2D.dispose();
        }
    }

    // ----- Modais -----

    /** Painel sólido arredondado com borda verde, usado como corpo dos modais. */
    private static class CorpoModal
    extends JPanel {
        CorpoModal(LayoutManager layoutManager) {
            super(layoutManager);
            this.setOpaque(false);
            this.setBorder(BorderFactory.createEmptyBorder(22, 24, 22, 24));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D graphics2D = TemaBetfoot.suave(graphics);
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, 28.0, 28.0);
            graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, new Color(17, 33, 25), 0.0f, this.getHeight(), new Color(9, 18, 14)));
            graphics2D.fill(forma);
            graphics2D.setColor(TemaBetfoot.alfa(VERDE, 0.4));
            graphics2D.draw(forma);
            graphics2D.dispose();
        }
    }

    /** Diálogo modal sem moldura, cantos arredondados e Esc fecha. Para painéis que recebem o diálogo no construtor. */
    public static javax.swing.JDialog dialogo(Component component) {
        java.awt.Window window = component == null ? null : (component instanceof java.awt.Window ? (java.awt.Window)component : javax.swing.SwingUtilities.getWindowAncestor(component));
        final javax.swing.JDialog jDialog = new javax.swing.JDialog(window, java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog.setUndecorated(true);
        // Cantos arredondados por recorte da janela (setShape), não por transparência: janela transparente no
        // macOS deixa resíduos ao repintar listas de combo e sliders.
        jDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent componentEvent) {
                try {
                    jDialog.setShape(new RoundRectangle2D.Double(0.0, 0.0, jDialog.getWidth(), jDialog.getHeight(), 28.0, 28.0));
                }
                catch (Exception exception) {
                    // sem suporte a recorte: fica com o canto quadrado
                }
            }
        });
        jDialog.getRootPane().registerKeyboardAction(actionEvent -> jDialog.dispose(), javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
        return jDialog;
    }

    private static void arrastavel(final java.awt.Window window, Component component) {
        java.awt.event.MouseAdapter mouseAdapter = new java.awt.event.MouseAdapter() {
            private java.awt.Point inicio;

            @Override
            public void mousePressed(java.awt.event.MouseEvent mouseEvent) {
                this.inicio = mouseEvent.getPoint();
            }

            @Override
            public void mouseDragged(java.awt.event.MouseEvent mouseEvent) {
                if (this.inicio != null) {
                    java.awt.Point point = window.getLocation();
                    window.setLocation(point.x + mouseEvent.getX() - this.inicio.x, point.y + mouseEvent.getY() - this.inicio.y);
                }
            }
        };
        component.addMouseListener(mouseAdapter);
        component.addMouseMotionListener(mouseAdapter);
    }

    /**
     * Abre um painel antigo do jogo como modal no tema: aplica cores/estilos aos componentes, põe num cartão
     * arredondado, centraliza e permite arrastar. Esc fecha. Devolve o diálogo (ainda invisível).
     */
    public static javax.swing.JDialog modal(Component component, JComponent jComponent) {
        TemaBetfoot.aplicarTema(jComponent);
        // Os painéis antigos têm tamanho fixo; com as fontes novas o conteúdo cortava. Deixa o layout medir.
        if (jComponent.getLayout() instanceof javax.swing.GroupLayout) {
            jComponent.setPreferredSize(null);
        }
        return TemaBetfoot.janela(component, jComponent);
    }

    /** Como modal(), para painéis já feitos no tema novo: só põe no cartão, centraliza e deixa arrastar. */
    public static javax.swing.JDialog janela(Component component, JComponent jComponent) {
        return TemaBetfoot.vestir(TemaBetfoot.dialogo(component), jComponent);
    }

    /** Põe o painel (já no tema) no cartão do modal, dentro de um diálogo criado por dialogo(); centraliza e deixa arrastar. */
    public static javax.swing.JDialog vestir(javax.swing.JDialog jDialog, JComponent jComponent) {
        CorpoModal corpo = new CorpoModal(new java.awt.BorderLayout());
        corpo.add((Component)jComponent, "Center");
        jDialog.setContentPane(corpo);
        jDialog.pack();
        jDialog.setLocationRelativeTo(jDialog.getOwner());
        TemaBetfoot.arrastavel(jDialog, corpo);
        TemaBetfoot.arrastavel(jDialog, jComponent);
        return jDialog;
    }

    /**
     * Confirmação no tema: ícone, título, mensagem e os botões Cancelar / confirmar. Enter confirma, Esc cancela.
     * Com perigo, o ícone e o botão ficam vermelhos (excluir).
     */
    public static boolean confirmar(Component component, String titulo, String mensagem, String botao, boolean perigo) {
        return TemaBetfoot.mensagem(component, titulo, mensagem, botao, perigo, true);
    }

    /** Aviso no tema, só com OK. */
    public static void aviso(Component component, String titulo, String mensagem) {
        TemaBetfoot.mensagem(component, titulo, mensagem, "Entendi", true, false);
    }

    private static boolean mensagem(Component component, String titulo, String mensagem, String botao, final boolean perigo, boolean cancelar) {
        final javax.swing.JDialog jDialog = TemaBetfoot.dialogo(component);
        final boolean[] resposta = new boolean[1];
        CorpoModal corpo = new CorpoModal(new java.awt.BorderLayout(18, 0));
        corpo.setBorder(BorderFactory.createEmptyBorder(26, 26, 22, 26));
        final Color cor = perigo ? VERMELHO : VERDE;
        JComponent icone = new JComponent() {
            {
                this.setPreferredSize(new Dimension(52, 52));
            }

            @Override
            protected void paintComponent(Graphics graphics) {
                Graphics2D g = TemaBetfoot.suave(graphics);
                g.setColor(TemaBetfoot.alfa(cor, 0.16));
                g.fill(new Ellipse2D.Double(0.0, 0.0, 52.0, 52.0));
                g.setColor(TemaBetfoot.alfa(cor, 0.5));
                g.draw(new Ellipse2D.Double(0.5, 0.5, 51.0, 51.0));
                g.setColor(cor);
                g.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                if (perigo) {
                    g.draw(new Line2D.Double(26.0, 15.0, 26.0, 30.0));
                    g.fill(new Ellipse2D.Double(24.0, 35.0, 4.0, 4.0));
                } else {
                    GeneralPath p = new GeneralPath();
                    p.moveTo(17.0, 27.0);
                    p.lineTo(23.5, 33.5);
                    p.lineTo(35.0, 20.0);
                    g.draw(p);
                }
                g.dispose();
            }
        };
        JPanel coluna = new JPanel(new java.awt.BorderLayout());
        coluna.setOpaque(false);
        coluna.add((Component)icone, "North");
        corpo.add((Component)coluna, "West");
        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new javax.swing.BoxLayout(textos, 1));
        JLabel jTitulo = new JLabel(titulo.toUpperCase());
        jTitulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(24.0f), 0.02f));
        jTitulo.setForeground(TEXTO);
        textos.add(jTitulo);
        textos.add(javax.swing.Box.createVerticalStrut(8));
        JLabel jMensagem = new JLabel("<html><div style='width:300px'>" + mensagem.replace("&", "&amp;").replace("<", "&lt;").replace("\n", "<br>") + "</div></html>");
        jMensagem.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        jMensagem.setForeground(TEXTO_SUAVE);
        textos.add(jMensagem);
        textos.add(javax.swing.Box.createVerticalStrut(22));
        JPanel botoes = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));
        botoes.setOpaque(false);
        botoes.setAlignmentX(0.0f);
        if (cancelar) {
            JButton bCancelar = TemaBetfoot.botao(new JButton(), Estilo.FANTASMA, "Cancelar", null);
            bCancelar.addActionListener(actionEvent -> jDialog.dispose());
            botoes.add(bCancelar);
        }
        JButton bConfirmar = TemaBetfoot.botao(new JButton(), perigo && cancelar ? Estilo.DESTRUTIVO : Estilo.PRIMARIO, botao, null);
        bConfirmar.addActionListener(actionEvent -> {
            resposta[0] = true;
            jDialog.dispose();
        });
        botoes.add(bConfirmar);
        JPanel linhaBotoes = new JPanel(new java.awt.BorderLayout());
        linhaBotoes.setOpaque(false);
        linhaBotoes.setAlignmentX(0.0f);
        linhaBotoes.add((Component)botoes, "East");
        jTitulo.setAlignmentX(0.0f);
        jMensagem.setAlignmentX(0.0f);
        textos.add(linhaBotoes);
        corpo.add((Component)textos, "Center");
        jDialog.setContentPane(corpo);
        jDialog.getRootPane().setDefaultButton(bConfirmar);
        jDialog.pack();
        jDialog.setLocationRelativeTo(jDialog.getOwner());
        TemaBetfoot.arrastavel(jDialog, corpo);
        jDialog.setVisible(true);
        return resposta[0];
    }

    /**
     * Modal com título, subtítulo, um conteúdo livre e uma fileira de botões. Devolve o índice do botão clicado
     * (-1 se fechar com Esc). O botão "principal" é verde e responde ao Enter; "perigo" (se >= 0) fica vermelho.
     */
    public static int escolher(Component component, String titulo, String subtitulo, JComponent conteudo, String[] botoes, int principal) {
        final javax.swing.JDialog jDialog = TemaBetfoot.dialogo(component);
        final int[] resposta = new int[]{-1};
        CorpoModal corpo = new CorpoModal(new java.awt.BorderLayout(0, 18));
        corpo.setBorder(BorderFactory.createEmptyBorder(24, 28, 24, 28));
        JPanel topo = new JPanel();
        topo.setOpaque(false);
        topo.setLayout(new javax.swing.BoxLayout(topo, 1));
        JLabel jTitulo = TemaBetfoot.titulo(titulo);
        jTitulo.setAlignmentX(0.0f);
        topo.add(jTitulo);
        if (subtitulo != null) {
            JLabel jSub = new JLabel(subtitulo);
            jSub.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            jSub.setForeground(TEXTO_SUAVE);
            jSub.setAlignmentX(0.0f);
            topo.add(jSub);
        }
        corpo.add((Component)topo, "North");
        corpo.add((Component)conteudo, "Center");
        JPanel fileira = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));
        fileira.setOpaque(false);
        JButton padrao = null;
        for (int i = 0; i < botoes.length; ++i) {
            final int indice = i;
            JButton b = TemaBetfoot.botao(new JButton(), i == principal ? Estilo.PRIMARIO : (i == 0 ? Estilo.FANTASMA : Estilo.SECUNDARIO), botoes[i], null);
            b.addActionListener(actionEvent -> {
                resposta[0] = indice;
                jDialog.dispose();
            });
            fileira.add(b);
            if (i == principal) {
                padrao = b;
            }
        }
        corpo.add((Component)fileira, "South");
        jDialog.setContentPane(corpo);
        if (padrao != null) {
            jDialog.getRootPane().setDefaultButton(padrao);
        }
        jDialog.pack();
        jDialog.setLocationRelativeTo(jDialog.getOwner());
        TemaBetfoot.arrastavel(jDialog, corpo);
        jDialog.setVisible(true);
        return resposta[0];
    }

    /** Topo de modal: ícone opcional (bandeira, escudo), título grande, subtítulo e o X que dispara "fechar". */
    public static JPanel topoModal(Icon icone, String titulo, String subtitulo, final AbstractButton fechar) {
        JPanel topo = new JPanel(new java.awt.BorderLayout(16, 0));
        topo.setOpaque(false);
        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new javax.swing.BoxLayout(textos, 1));
        JLabel jTitulo = new JLabel(titulo.toUpperCase());
        jTitulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(30.0f), 0.02f));
        jTitulo.setForeground(TEXTO);
        jTitulo.setIcon(icone);
        jTitulo.setIconTextGap(14);
        jTitulo.putClientProperty("tema.ok", Boolean.TRUE);
        textos.add(jTitulo);
        if (subtitulo != null) {
            JLabel sub = new JLabel(subtitulo);
            sub.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            sub.setForeground(TEXTO_SUAVE);
            sub.putClientProperty("tema.ok", Boolean.TRUE);
            textos.add(sub);
        }
        topo.add((Component)textos, "Center");
        if (fechar != null) {
            JButton x = TemaBetfoot.fechar();
            x.addActionListener(actionEvent -> fechar.doClick());
            JPanel canto = new JPanel(new java.awt.BorderLayout());
            canto.setOpaque(false);
            canto.add((Component)x, "North");
            topo.add((Component)canto, "East");
        }
        return topo;
    }

    /** Rodapé de modal: linha fina em cima, "esquerda" (opcional) e os botões à direita (Voltar/Cancelar, depois a ação). */
    public static JPanel rodapeModal(Component esquerda, Component ... botoes) {
        JPanel rodape = new JPanel(new java.awt.BorderLayout(16, 0));
        rodape.setOpaque(false);
        rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(18, 0, 0, 0)));
        if (esquerda != null) {
            rodape.add(esquerda, "West");
        }
        JPanel direita = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));
        direita.setOpaque(false);
        for (Component b : botoes) {
            direita.add(b);
        }
        rodape.add((Component)direita, "East");
        return rodape;
    }

    /** Rótulo de campo de formulário (caixa alta, pequeno, espaçado), como nos modais do editor. */
    public static JLabel rotuloCampo(JLabel jLabel, String string) {
        return Formulario.rotuloCampo(jLabel, string);
    }

    /** Botão X do canto dos modais (fica verde no hover). */
    public static JButton fechar() {
        JButton fechar = TemaBetfoot.botao(new JButton(), Estilo.ICONE, null, Simbolo.MAIS);
        fechar.setIcon(new Icon() {
            @Override
            public void paintIcon(Component component, Graphics graphics, int x, int y) {
                Graphics2D g = TemaBetfoot.suave(graphics);
                g.setColor(((AbstractButton)component).getModel().isRollover() ? VERDE : TEXTO_SUAVE);
                g.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g.draw(new Line2D.Double(x + 3, y + 3, x + 13, y + 13));
                g.draw(new Line2D.Double(x + 13, y + 3, x + 3, y + 13));
                g.dispose();
            }

            @Override
            public int getIconWidth() {
                return 16;
            }

            @Override
            public int getIconHeight() {
                return 16;
            }
        });
        fechar.setToolTipText("Fechar (Esc)");
        return fechar;
    }

    /**
     * Monta formulários de modal no padrão novo: título (com X), campos em grade de 2 colunas com o rótulo em
     * cima, e uma barra de ações no rodapé. Usado para reorganizar os painéis antigos sem trocar seus campos.
     */
    public static class Formulario {
        private final JPanel grade = new JPanel(new java.awt.GridBagLayout());
        private final java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        private int linha = 0;

        public Formulario() {
            this.grade.setOpaque(false);
            this.c.fill = java.awt.GridBagConstraints.HORIZONTAL;
            this.c.anchor = java.awt.GridBagConstraints.NORTHWEST;
            this.c.weightx = 1.0;
        }

        private static JLabel rotuloCampo(JLabel jLabel, String string) {
            JLabel l = jLabel == null ? new JLabel() : jLabel;
            l.setText(string.toUpperCase());
            l.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.08f));
            l.setForeground(TEXTO_FRACO);
            l.setIcon(null);
            l.setHorizontalAlignment(SwingConstants.LEFT);
            l.putClientProperty("tema.ok", Boolean.TRUE);
            return l;
        }

        private JPanel celula(JLabel jLabel, String string, Component component) {
            final JPanel p = new JPanel(new java.awt.BorderLayout(0, 6));
            p.setOpaque(false);
            final JLabel l = Formulario.rotuloCampo(jLabel, string);
            p.add((Component)l, "North");
            p.add(component, "Center");
            // Se o campo some (ex.: Estado fora do Brasil), o rótulo some junto.
            component.addComponentListener(new java.awt.event.ComponentAdapter() {
                @Override
                public void componentShown(java.awt.event.ComponentEvent componentEvent) {
                    p.setVisible(true);
                }

                @Override
                public void componentHidden(java.awt.event.ComponentEvent componentEvent) {
                    p.setVisible(false);
                }
            });
            p.setVisible(component.isVisible());
            return p;
        }

        /** Campo ocupando a largura toda. */
        public Formulario campo(JLabel jLabel, String string, Component component) {
            this.c.gridx = 0;
            this.c.gridy = this.linha++;
            this.c.gridwidth = 2;
            this.c.insets = new Insets(0, 0, 16, 0);
            this.grade.add((Component)this.celula(jLabel, string, component), this.c);
            return this;
        }

        /** Dois campos lado a lado. */
        public Formulario par(JLabel jLabel, String string, Component component, JLabel jLabel2, String string2, Component component2) {
            this.c.gridy = this.linha++;
            this.c.gridwidth = 1;
            this.c.gridx = 0;
            this.c.insets = new Insets(0, 0, 16, 8);
            this.grade.add((Component)this.celula(jLabel, string, component), this.c);
            this.c.gridx = 1;
            this.c.insets = new Insets(0, 8, 16, 0);
            this.grade.add((Component)this.celula(jLabel2, string2, component2), this.c);
            return this;
        }

        /** Linha livre (ex.: caixas de seleção). */
        public Formulario livre(Component component) {
            this.c.gridx = 0;
            this.c.gridy = this.linha++;
            this.c.gridwidth = 2;
            this.c.insets = new Insets(0, 0, 16, 0);
            this.grade.add(component, this.c);
            return this;
        }

        /**
         * Monta o painel final dentro de "destino" (que é esvaziado): título + subtítulo + X, a grade, e o rodapé com
         * "esquerda" (opcional) à esquerda e os botões à direita (Cancelar, depois a ação principal).
         */
        public void montar(JPanel destino, JLabel titulo, String subtitulo, final AbstractButton cancelar, Component esquerda, Component ... botoes) {
            destino.removeAll();
            destino.setLayout(new java.awt.BorderLayout(0, 22));
            destino.setOpaque(false);
            destino.setPreferredSize(null);
            JPanel topo = new JPanel(new java.awt.BorderLayout(16, 0));
            topo.setOpaque(false);
            JPanel textos = new JPanel();
            textos.setOpaque(false);
            textos.setLayout(new javax.swing.BoxLayout(textos, 1));
            titulo.setText(titulo.getText() == null ? "" : titulo.getText().toUpperCase());
            titulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(30.0f), 0.02f));
            titulo.setForeground(TEXTO);
            titulo.setHorizontalAlignment(SwingConstants.LEFT);
            titulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 8));
            titulo.setAlignmentX(0.0f);
            titulo.putClientProperty("tema.ok", Boolean.TRUE);
            textos.add(titulo);
            if (subtitulo != null) {
                JLabel sub = new JLabel(subtitulo);
                sub.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                sub.setForeground(TEXTO_SUAVE);
                sub.setAlignmentX(0.0f);
                sub.putClientProperty("tema.ok", Boolean.TRUE);
                textos.add(sub);
            }
            JPanel barra = new JPanel(new java.awt.BorderLayout());
            barra.setOpaque(false);
            barra.setPreferredSize(new Dimension(4, 4));
            barra.setMaximumSize(new Dimension(48, 4));
            topo.add((Component)textos, "Center");
            if (cancelar != null) {
                JButton fechar = TemaBetfoot.fechar();
                fechar.addActionListener(actionEvent -> cancelar.doClick());
                JPanel canto = new JPanel(new java.awt.BorderLayout());
                canto.setOpaque(false);
                canto.add((Component)fechar, "North");
                topo.add((Component)canto, "East");
            }
            destino.add((Component)topo, "North");
            destino.add((Component)this.grade, "Center");
            JPanel rodape = new JPanel(new java.awt.BorderLayout(16, 0));
            rodape.setOpaque(false);
            rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(18, 0, 0, 0)));
            if (esquerda != null) {
                rodape.add(esquerda, "West");
            }
            JPanel direita = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));
            direita.setOpaque(false);
            for (Component b : botoes) {
                direita.add(b);
            }
            rodape.add((Component)direita, "East");
            destino.add((Component)rodape, "South");
            // Largura mínima do formulário; a altura fica livre para o layout medir depois do tema aplicado.
            this.c.gridx = 0;
            this.c.gridy = this.linha++;
            this.c.gridwidth = 2;
            this.c.insets = new Insets(0, 0, 0, 0);
            this.grade.add(javax.swing.Box.createHorizontalStrut(540), this.c);
        }
    }

    // ----- Tema em painéis antigos -----

    /** Borda arredondada para campos: fundo levemente claro e contorno verde quando focado. */
    public static class BordaCampo
    extends javax.swing.border.AbstractBorder {
        @Override
        public void paintBorder(Component component, Graphics graphics, int x, int y, int w, int h) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(x + 0.5, y + 0.5, w - 1, h - 1, 10.0, 10.0);
            g.setColor(component.isFocusOwner() ? TemaBetfoot.alfa(VERDE, 0.75) : TemaBetfoot.alfa(Color.WHITE, 0.16));
            g.draw(forma);
            g.dispose();
        }

        @Override
        public Insets getBorderInsets(Component component) {
            return new Insets(12, 14, 12, 14);
        }
    }

    /** Caixa de seleção arredondada com check verde. */
    private static class IconeCaixa
    implements Icon {
        @Override
        public void paintIcon(Component component, Graphics graphics, int x, int y) {
            AbstractButton b = (AbstractButton)component;
            boolean marcada = b.isSelected();
            boolean radio = b instanceof javax.swing.JRadioButton;
            Graphics2D g = TemaBetfoot.suave(graphics);
            java.awt.Shape forma = radio ? new Ellipse2D.Double(x + 0.5, y + 0.5, 17.0, 17.0) : new RoundRectangle2D.Double(x + 0.5, y + 0.5, 17.0, 17.0, 6.0, 6.0);
            g.setColor(marcada ? VERDE_BOTAO : TemaBetfoot.alfa(Color.WHITE, b.getModel().isRollover() ? 0.12 : 0.06));
            g.fill(forma);
            g.setColor(marcada ? TemaBetfoot.alfa(VERDE, 0.8) : TemaBetfoot.alfa(Color.WHITE, 0.25));
            g.draw(forma);
            if (marcada) {
                g.setColor(Color.WHITE);
                if (radio) {
                    g.fill(new Ellipse2D.Double(x + 5.5, y + 5.5, 7.0, 7.0));
                } else {
                    g.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    GeneralPath p = new GeneralPath();
                    p.moveTo(x + 4.5, y + 9.5);
                    p.lineTo(x + 7.5, y + 12.5);
                    p.lineTo(x + 13.5, y + 5.5);
                    g.draw(p);
                }
            }
            g.dispose();
        }

        @Override
        public int getIconWidth() {
            return 18;
        }

        @Override
        public int getIconHeight() {
            return 18;
        }
    }

    private static class SliderUI
    extends javax.swing.plaf.basic.BasicSliderUI {
        SliderUI(javax.swing.JSlider jSlider) {
            super(jSlider);
        }

        @Override
        public void paintTrack(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            java.awt.Rectangle r = this.trackRect;
            int cy = r.y + r.height / 2;
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.12));
            g.fill(new RoundRectangle2D.Double(r.x, cy - 3, r.width, 6.0, 6.0, 6.0));
            int px = this.thumbRect.x + this.thumbRect.width / 2;
            g.setColor(VERDE_BOTAO);
            g.fill(new RoundRectangle2D.Double(r.x, cy - 3, px - r.x, 6.0, 6.0, 6.0));
            g.dispose();
        }

        @Override
        public void paintThumb(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            java.awt.Rectangle r = this.thumbRect;
            double d = 16.0;
            double x = r.x + (r.width - d) / 2.0;
            double y = r.y + (r.height - d) / 2.0;
            g.setColor(Color.WHITE);
            g.fill(new Ellipse2D.Double(x, y, d, d));
            g.setColor(VERDE);
            g.setStroke(new BasicStroke(2.5f));
            g.draw(new Ellipse2D.Double(x + 1, y + 1, d - 2, d - 2));
            g.dispose();
        }

        @Override
        public void paintFocus(Graphics graphics) {
        }
    }

    private static boolean ehTexto(String string, String ... stringArray) {
        if (string == null) {
            return false;
        }
        String s = string.trim().toLowerCase();
        for (String t : stringArray) {
            if (s.equals(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Percorre um painel feito no estilo antigo e aplica o tema: painéis transparentes (os vazios, que mostram
     * cores, ficam), rótulos claros, campos/combos/caixas/sliders/tabelas/botões no estilo novo. OK vira "Salvar".
     */
    public static void aplicarTema(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTable || component instanceof JScrollPane) {
                if (component instanceof JScrollPane) {
                    JScrollPane sp = (JScrollPane)component;
                    Component vista = sp.getViewport().getView();
                    if (vista instanceof JTable) {
                        TemaBetfoot.tabela((JTable)vista, sp);
                    } else {
                        TemaBetfoot.rolagem(sp);
                        if (vista instanceof Container) {
                            TemaBetfoot.aplicarTema((Container)vista);
                        }
                    }
                }
                continue;
            }
            if (component instanceof JComponent && Boolean.TRUE.equals(((JComponent)component).getClientProperty("tema.ok"))) {
                if (component instanceof Container) {
                    TemaBetfoot.aplicarTema((Container)component);
                }
                continue;
            }
            if (component instanceof JLabel) {
                JLabel l = (JLabel)component;
                Font f = l.getFont();
                if (f != null && f.isBold() && f.getSize() >= 14) {
                    l.setFont(TemaBetfoot.fonte(Font.BOLD, 20.0f));
                    l.setForeground(TEXTO);
                } else {
                    l.setFont(TemaBetfoot.fonte(Font.BOLD, 12.0f));
                    l.setForeground(TEXTO_SUAVE);
                }
            } else if (component instanceof javax.swing.JCheckBox || component instanceof javax.swing.JRadioButton) {
                AbstractButton b = (AbstractButton)component;
                b.setOpaque(false);
                b.setForeground(TEXTO);
                b.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
                b.setIcon(new IconeCaixa());
                b.setSelectedIcon(new IconeCaixa());
                b.setRolloverEnabled(true);
                b.setIconTextGap(8);
                b.setFocusPainted(false);
                b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            } else if (component instanceof JButton) {
                JButton b = (JButton)component;
                String texto = b.getText();
                Icon icon = b.getIcon();
                String descricao = icon instanceof ImageIcon ? String.valueOf(((ImageIcon)icon).getDescription()) : "";
                if (TemaBetfoot.ehTexto(texto, "ok", "confirmar", "salvar")) {
                    TemaBetfoot.botao(b, Estilo.PRIMARIO, TemaBetfoot.ehTexto(texto, "ok") ? "Salvar" : texto, null);
                } else if (TemaBetfoot.ehTexto(texto, "cancelar", "fechar", "voltar")) {
                    TemaBetfoot.botao(b, Estilo.SECUNDARIO, texto, null);
                } else if ((texto == null || texto.isEmpty()) && descricao.contains("search")) {
                    TemaBetfoot.botao(b, Estilo.ICONE, null, Simbolo.LUPA);
                } else {
                    TemaBetfoot.botao(b, texto == null || texto.isEmpty() ? Estilo.ICONE : Estilo.SECUNDARIO);
                }
            } else if (component instanceof JComboBox) {
                TemaBetfoot.combo((JComboBox<?>)component);
            } else if (component instanceof javax.swing.text.JTextComponent) {
                javax.swing.text.JTextComponent t = (javax.swing.text.JTextComponent)component;
                if (!(t instanceof Campo)) {
                    t.setOpaque(true);
                    t.setBackground(new Color(20, 36, 28));
                    t.setForeground(TEXTO);
                    t.setCaretColor(VERDE);
                    t.setSelectionColor(VERDE_SELECAO);
                    t.setSelectedTextColor(Color.WHITE);
                    t.setDisabledTextColor(TEXTO_FRACO);
                    t.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
                    t.setBorder(new BordaCampo());
                    t.addFocusListener(new java.awt.event.FocusAdapter() {
                        @Override
                        public void focusGained(java.awt.event.FocusEvent focusEvent) {
                            t.repaint();
                        }

                        @Override
                        public void focusLost(java.awt.event.FocusEvent focusEvent) {
                            t.repaint();
                        }
                    });
                }
            } else if (component instanceof javax.swing.JSlider) {
                javax.swing.JSlider s = (javax.swing.JSlider)component;
                s.setUI(new SliderUI(s));
                s.setOpaque(false);
                s.setForeground(TEXTO_SUAVE);
                s.setCursor(new Cursor(Cursor.HAND_CURSOR));
            } else if (component instanceof JPanel) {
                JPanel p = (JPanel)component;
                if (p.getComponentCount() > 0) {
                    p.setOpaque(false);
                } else if (p.getBorder() instanceof javax.swing.border.LineBorder) {
                    // Amostra de cor: mantém a cor, contorno claro.
                    p.setBorder(BorderFactory.createLineBorder(TemaBetfoot.alfa(Color.WHITE, 0.4)));
                }
            }
            if (component instanceof Container && !(component instanceof JComboBox) && !(component instanceof javax.swing.JSlider)) {
                TemaBetfoot.aplicarTema((Container)component);
            }
        }
        if (container instanceof JPanel && ((JPanel)container).getComponentCount() > 0) {
            ((JPanel)container).setOpaque(false);
        }
    }
}
