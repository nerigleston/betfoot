import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 * Gera os ícones dos instaladores em empacotamento/icones: betfoot.png (512), betfoot.ico (16-256) e
 * betfoot.iconset/ (para o iconutil do macOS montar o .icns).
 *
 *   java empacotamento/Icone.java empacotamento/icones
 */
public class Icone {
    public static void main(String[] args) throws Exception {
        File dir = new File(args.length > 0 ? args[0] : "icones");
        File iconset = new File(dir, "betfoot.iconset");
        iconset.mkdirs();
        ImageIO.write(desenhar(512), "png", new File(dir, "betfoot.png"));
        int[] mac = {16, 32, 128, 256, 512};
        for (int s : mac) {
            ImageIO.write(desenhar(s), "png", new File(iconset, "icon_" + s + "x" + s + ".png"));
            ImageIO.write(desenhar(s * 2), "png", new File(iconset, "icon_" + s + "x" + s + "@2x.png"));
        }
        int[] win = {16, 24, 32, 48, 64, 128, 256};
        List<byte[]> pngs = new ArrayList<>();
        for (int s : win) {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ImageIO.write(desenhar(s), "png", b);
            pngs.add(b.toByteArray());
        }
        try (DataOutputStream o = new DataOutputStream(new FileOutputStream(new File(dir, "betfoot.ico")))) {
            o.writeShort(0);
            o.writeShort(le16(1));
            o.writeShort(le16(win.length));
            int offset = 6 + 16 * win.length;
            for (int i = 0; i < win.length; i++) {
                o.writeByte(win[i] >= 256 ? 0 : win[i]);
                o.writeByte(win[i] >= 256 ? 0 : win[i]);
                o.writeByte(0);
                o.writeByte(0);
                o.writeShort(le16(1));
                o.writeShort(le16(32));
                o.writeInt(le32(pngs.get(i).length));
                o.writeInt(le32(offset));
                offset += pngs.get(i).length;
            }
            for (byte[] p : pngs) {
                o.write(p);
            }
        }
    }

    static int le16(int v) {
        return ((v & 0xff) << 8) | ((v >> 8) & 0xff);
    }

    static int le32(int v) {
        return Integer.reverseBytes(v);
    }

    static BufferedImage desenhar(int s) {
        BufferedImage img = new BufferedImage(s, s, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.scale(s / 1024.0, s / 1024.0);

        // Fundo: quadrado arredondado verde-gramado com faixas.
        Shape fundo = new RoundRectangle2D.Double(64, 64, 896, 896, 200, 200);
        g.setPaint(new GradientPaint(0, 64, new Color(0x2e9d4a), 0, 960, new Color(0x13612a)));
        g.fill(fundo);
        g.setClip(fundo);
        g.setColor(new Color(255, 255, 255, 18));
        for (int y = 64; y < 960; y += 224) {
            g.fillRect(64, y, 896, 112);
        }
        g.setClip(null);

        // Bola.
        double cx = 512, cy = 430, r = 270;
        Ellipse2D bola = new Ellipse2D.Double(cx - r, cy - r, 2 * r, 2 * r);
        g.setColor(new Color(0, 0, 0, 60));
        g.fill(new Ellipse2D.Double(cx - r + 14, cy - r + 22, 2 * r, 2 * r));
        g.setColor(Color.WHITE);
        g.fill(bola);
        g.setClip(bola);
        g.setColor(new Color(0x1b1b1b));
        double rp = r * 0.36;
        g.fill(pentagono(cx, cy, rp, -90));
        g.setStroke(new BasicStroke((float) (r * 0.05), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        for (int i = 0; i < 5; i++) {
            double a = Math.toRadians(-90 + 72 * i);
            double x1 = cx + rp * Math.cos(a), y1 = cy + rp * Math.sin(a);
            double x2 = cx + r * 0.78 * Math.cos(a), y2 = cy + r * 0.78 * Math.sin(a);
            g.draw(new java.awt.geom.Line2D.Double(x1, y1, x2, y2));
            g.fill(pentagono(cx + r * 1.02 * Math.cos(a), cy + r * 1.02 * Math.sin(a), rp * 0.95, -90 + 72 * i + 180));
        }
        g.setClip(null);
        g.setColor(new Color(0, 0, 0, 40));
        g.setStroke(new BasicStroke(10));
        g.draw(bola);

        // "26/27".
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 190);
        FontRenderContext frc = g.getFontRenderContext();
        TextLayout t = new TextLayout("26/27", fonte, frc);
        double w = t.getBounds().getWidth();
        Shape texto = t.getOutline(AffineTransform.getTranslateInstance(512 - w / 2 - t.getBounds().getX(), 885));
        g.setColor(new Color(0, 0, 0, 70));
        g.fill(AffineTransform.getTranslateInstance(6, 8).createTransformedShape(texto));
        g.setColor(new Color(0xffd23f));
        g.fill(texto);
        g.dispose();
        return img;
    }

    static Shape pentagono(double cx, double cy, double r, double inicio) {
        Path2D p = new Path2D.Double();
        for (int i = 0; i < 5; i++) {
            double a = Math.toRadians(inicio + 72 * i);
            double x = cx + r * Math.cos(a), y = cy + r * Math.sin(a);
            if (i == 0) {
                p.moveTo(x, y);
            } else {
                p.lineTo(x, y);
            }
        }
        p.closePath();
        return p;
    }
}
