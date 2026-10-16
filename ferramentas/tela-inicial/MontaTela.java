import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/* Monta a tela inicial: fundo novo (redimensionado para o tamanho da original) + os ícones e textos brancos da
 * tela atual, extraídos pela diferença de brilho em relação ao verde liso de fundo, nas mesmas posições.
 * Uso: java MontaTela <tela_atual.jpg> <fundo.png> <saida.jpg> */
public class MontaTela {
    public static void main(String[] a) throws Exception {
        BufferedImage atual = ImageIO.read(new File(a[0]));
        BufferedImage fundo = ImageIO.read(new File(a[1]));
        int w = atual.getWidth(), h = atual.getHeight();
        // fundo: corta para a proporção da tela e redimensiona
        double prop = (double) w / h; int fw = fundo.getWidth(), fh = fundo.getHeight();
        int cw = fw, ch = (int) Math.round(fw / prop); if (ch > fh) { ch = fh; cw = (int) Math.round(fh * prop); }
        BufferedImage saida = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = saida.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.drawImage(fundo.getSubimage((fw - cw) / 2, (fh - ch) / 2, cw, ch).getScaledInstance(w, h, Image.SCALE_SMOOTH), 0, 0, null);
        // escurece levemente a faixa dos ícones e o canto do SAIR para o branco ficar legível
        g.setPaint(new GradientPaint(0, h * 0.25f, new Color(0, 0, 0, 0), 0, h * 0.45f, new Color(0, 20, 8, 110), true));
        g.fillRect(0, (int) (h * 0.25), w, (int) (h * 0.45));
        g.setPaint(new RadialGradientPaint(new Point(w - 70, h - 25), 90, new float[]{0f, 1f}, new Color[]{new Color(0, 20, 8, 140), new Color(0, 20, 8, 0)}));
        g.fillRect(w - 180, h - 90, 180, 90);
        g.dispose();
        // cor do fundo liso da tela atual (canto superior esquerdo) e extração dos elementos claros
        int bg = atual.getRGB(5, 5);
        double lb = lum(bg);
        for (int y = 0; y < h; y++) for (int x = 0; x < w; x++) {
            int p = atual.getRGB(x, y);
            double alfa = Math.max(0, Math.min(1, (lum(p) - lb - 8) / (235 - lb)));
            if (alfa <= 0) continue;
            int q = saida.getRGB(x, y);
            int r = (int) ((p >> 16 & 255) * alfa + (q >> 16 & 255) * (1 - alfa));
            int gg = (int) ((p >> 8 & 255) * alfa + (q >> 8 & 255) * (1 - alfa));
            int b = (int) ((p & 255) * alfa + (q & 255) * (1 - alfa));
            saida.setRGB(x, y, r << 16 | gg << 8 | b);
        }
        javax.imageio.ImageWriter wr = ImageIO.getImageWritersByFormatName("jpg").next();
        javax.imageio.ImageWriteParam pr = wr.getDefaultWriteParam(); pr.setCompressionMode(javax.imageio.ImageWriteParam.MODE_EXPLICIT); pr.setCompressionQuality(0.95f);
        try (var out = ImageIO.createImageOutputStream(new File(a[2]))) { wr.setOutput(out); wr.write(null, new javax.imageio.IIOImage(saida, null, null), pr); }
    }
    static double lum(int c) { return 0.299 * (c >> 16 & 255) + 0.587 * (c >> 8 & 255) + 0.114 * (c & 255); }
}
