import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import javax.imageio.ImageIO;

/* Uso: java Escudo <origem.png> <escudo60.png> <mini18.png>  -> imprime "cor1 cor2" (cores predominantes). */
public class Escudo {
    public static void main(String[] a) throws Exception {
        BufferedImage img = ImageIO.read(new File(a[0]));
        salvar(img, 60, a[1]); salvar(img, 18, a[2]);
        Map<Integer, Integer> cont = new HashMap<>();
        for (int y = 0; y < img.getHeight(); y++) for (int x = 0; x < img.getWidth(); x++) {
            int p = img.getRGB(x, y); if ((p >>> 24) < 160) continue;
            int r = (p >> 16 & 255) / 32 * 32 + 16, g = (p >> 8 & 255) / 32 * 32 + 16, b = (p & 255) / 32 * 32 + 16;
            cont.merge(r << 16 | g << 8 | b, 1, Integer::sum);
        }
        java.util.List<Map.Entry<Integer, Integer>> l = new ArrayList<>(cont.entrySet());
        l.sort((x, y) -> y.getValue() - x.getValue());
        int c1 = l.isEmpty() ? 0xffffff : l.get(0).getKey(), c2 = -1;
        for (var e : l) if (dist(e.getKey(), c1) > 120) { c2 = e.getKey(); break; }
        if (c2 < 0) c2 = brilho(c1) > 128 ? 0x000000 : 0xffffff;
        System.out.println(hex(ajusta(c1)) + " " + hex(ajusta(c2)));
    }
    static int ajusta(int c) { // puxa para o branco/preto quando já está perto
        if (brilho(c) > 225) return 0xffffff; if (brilho(c) < 30) return 0x000000; return c; }
    static double brilho(int c) { return 0.299 * (c >> 16 & 255) + 0.587 * (c >> 8 & 255) + 0.114 * (c & 255); }
    static double dist(int a, int b) { int dr = (a >> 16 & 255) - (b >> 16 & 255), dg = (a >> 8 & 255) - (b >> 8 & 255), db = (a & 255) - (b & 255); return Math.sqrt(dr * dr + dg * dg + db * db); }
    static String hex(int c) { return String.format("#%06x", c & 0xffffff); }
    static void salvar(BufferedImage img, int lado, String dest) throws Exception {
        double esc = Math.min((double) lado / img.getWidth(), (double) lado / img.getHeight());
        int w = Math.max(1, (int) Math.round(img.getWidth() * esc)), h = Math.max(1, (int) Math.round(img.getHeight() * esc));
        BufferedImage out = new BufferedImage(lado, lado, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = out.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(img.getScaledInstance(w, h, Image.SCALE_SMOOTH), (lado - w) / 2, (lado - h) / 2, null); g.dispose();
        ImageIO.write(out, "png", new File(dest));
    }
}
