package nucleo;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/*
 * Diferenças de teclado e mouse entre sistemas: no macOS os atalhos usam Cmd (no Windows e no Linux, Ctrl),
 * as teclas F viram Cmd+número e o clique secundário pode ser Ctrl+clique.
 */
public final class Plataforma {
    public static final boolean MAC = System.getProperty("os.name", "").toLowerCase().startsWith("mac");

    private Plataforma() {
    }

    /* Atalho com a tecla de comando do sistema: Cmd+tecla no macOS, Ctrl+tecla nos demais. */
    public static KeyStroke atalho(int keyCode) {
        return KeyStroke.getKeyStroke(keyCode, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx(), false);
    }

    /* Atalho de uma tecla F (F1..F11) como o usuário espera no sistema: a própria tecla F no Windows e no Linux;
     * no macOS, onde as teclas F controlam brilho e volume, Cmd+número (F1..F9 -> Cmd+1..9, F10 -> Cmd+0, F11 -> Cmd+-). */
    public static KeyStroke teclaF(int keyCode) {
        if (!MAC) {
            return KeyStroke.getKeyStroke(keyCode, 0);
        }
        int n = keyCode - KeyEvent.VK_F1 + 1;
        int tecla = n <= 9 ? KeyEvent.VK_0 + n : n == 10 ? KeyEvent.VK_0 : KeyEvent.VK_MINUS;
        return atalho(tecla);
    }

    /* Registra a tecla F e, no macOS, também o Cmd+número equivalente (fn+F continua funcionando). */
    public static void registrarTeclaF(InputMap inputMap, int keyCode, Object acao) {
        inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), acao);
        if (MAC) {
            inputMap.put(teclaF(keyCode), acao);
        }
    }

    /* O Java só gera mouseClicked se o cursor não se mexer nem um pixel entre apertar e soltar. No trackpad (toque
     * para clicar) o cursor quase sempre mexe um pouco, e o clique se perde: era preciso tocar duas vezes. Este filtro
     * gera o clique que faltou quando o botão é solto no mesmo componente, a até TOLERANCIA pixels de onde foi
     * apertado. Ele só age quando o Java descartou o clique (houve arrasto), então nunca duplica um clique. */
    private static final int TOLERANCIA = 6;
    private static Component pressionado;
    private static Point pontoPressionado;
    private static boolean arrastou;

    public static void instalarCliqueTolerante() {
        Toolkit.getDefaultToolkit().addAWTEventListener(evento -> {
            if (!(evento instanceof MouseEvent)) {
                return;
            }
            MouseEvent e = (MouseEvent) evento;
            switch (e.getID()) {
                case MouseEvent.MOUSE_PRESSED:
                    pressionado = e.getComponent();
                    pontoPressionado = e.getPoint();
                    arrastou = false;
                    break;
                case MouseEvent.MOUSE_DRAGGED:
                    if (e.getComponent() == pressionado) {
                        arrastou = true;
                    }
                    break;
                case MouseEvent.MOUSE_RELEASED:
                    if (arrastou && e.getComponent() == pressionado && pontoPressionado != null
                            && pontoPressionado.distance(e.getPoint()) <= TOLERANCIA) {
                        Component c = e.getComponent();
                        MouseEvent clique = new MouseEvent(c, MouseEvent.MOUSE_CLICKED, e.getWhen(), e.getModifiersEx(),
                                e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), false, e.getButton());
                        SwingUtilities.invokeLater(() -> c.dispatchEvent(clique));
                    }
                    pressionado = null;
                    arrastou = false;
                    break;
                default:
            }
        }, AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    /* Botão direito, clique com dois dedos ou, no macOS, Ctrl+clique. */
    public static boolean isCliqueSecundario(MouseEvent mouseEvent) {
        return SwingUtilities.isRightMouseButton(mouseEvent) || mouseEvent.isPopupTrigger()
                || MAC && SwingUtilities.isLeftMouseButton(mouseEvent) && mouseEvent.isControlDown();
    }
}
