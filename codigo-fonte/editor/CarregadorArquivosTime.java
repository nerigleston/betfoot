package editor;

import persistencia.EntradaObjetosCompativel;
import nucleo.UtilitariosTexto;
import editor.FiltroArquivoBan2;
import modelos.ModeloTime2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarregadorArquivosTime {
    public static void iD() {
        File file = new File(String.valueOf(UtilitariosTexto.cK) + "/teams");
        File[] fileArray = file.listFiles(new FiltroArquivoBan2());
        int n2 = 0;
        while (n2 < fileArray.length) {
            if (fileArray[n2].isFile()) {
                String string = fileArray[n2].getName();
                string = string.substring(0, string.lastIndexOf("."));
                CarregadorArquivosTime.e(fileArray[n2].getPath(), string);
            }
            ++n2;
        }
    }

    public static void e(String string, String string2) {
        ModeloTime2 t2 = new ModeloTime2();
        try {
            FileInputStream fileInputStream = new FileInputStream(string);
            ObjectInputStream objectInputStream = new EntradaObjetosCompativel(fileInputStream);
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
        if (t2.getVid() == 185) {
            t2.setFileRef(string2);
            UtilitariosTexto.cZ().add(t2);
        }
    }
}

