package nucleo;

import nucleo.FiltroArquivoBan;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import modelos.ModeloTime2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarregadorTimes {
    private static transient int hj = 0;

    public static void w(boolean bl) {
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/teams");
        File[] fileArray = file.listFiles(new FiltroArquivoBan());
        if (fileArray != null) {
            int n2 = 0;
            while (n2 < fileArray.length) {
                if (fileArray[n2].isFile()) {
                    String string = fileArray[n2].getName();
                    string = string.substring(0, string.lastIndexOf("."));
                    try {
                        CarregadorTimes.a(fileArray[n2].getPath(), string, bl);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                ++n2;
            }
        }
    }

    public static void a(String string, String string2, boolean bl) {
        ModeloTime2 t2 = new ModeloTime2();
        try {
            FileInputStream fileInputStream = new FileInputStream(string);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            t2 = (ModeloTime2)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return;
        }
        try {
            if (bl) {
                new ModeloTime(t2);
            } else if (t2.getVid() == 185) {
                boolean bl2 = false;
                if (bl2) {
                    if (t2.getPais() == 29 && hj < 24) {
                        t2.setPais(218);
                        ++hj;
                    } else if (t2.getPais() == 29 && hj < 48) {
                        t2.setPais(220);
                        ++hj;
                    }
                }
                t2.setFileRef(string2);
                if (t2.isValid()) {
                    if (t2.getPais() >= 0 && t2.getPais() < GerenciadorJogo.SR.bD.length) {
                        int n2 = t2.getPais();
                        GerenciadorJogo.SR.bD[n2] = GerenciadorJogo.SR.bD[n2] + 1;
                        if (t2.getPais() == 29) {
                            int n3 = t2.getEstado();
                            GerenciadorJogo.SR.bE[n3] = GerenciadorJogo.SR.bE[n3] + 1;
                        }
                    }
                    GerenciadorJogo.SR.bC.add(t2);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

