package nucleo;

import nucleo.VerificadorRegistro;
import nucleo.ConstantesJogo;

public class CalculadoraChaveRegistro {
    public static int eT() {
        String string = VerificadorRegistro.eW();
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = 0;
        try {
            int n4;
            int n5;
            int n6 = 0;
            while (n6 < string.length()) {
                n4 = n5 = string.charAt(n6);
                n2 += n4 * ++n3 + (n3 + 3);
                ++n6;
            }
            n5 = n6 = (int)string.charAt(1);
            int n7 = n4 = (int)string.charAt(2);
            n2 *= n7 + n5 + 5;
            n2 = n2 * 12 + 331216;
            int n8 = 0;
            while (n8 < 45) {
                n5 = n7 * 8 + 342874 + ConstantesJogo.B(n2, n8);
                ++n8;
            }
            VerificadorRegistro.Y(n5);
        }
        catch (Exception exception) {
            System.exit(0);
        }
        return n2;
    }
}

