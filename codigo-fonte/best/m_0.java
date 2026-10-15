package best;

import best.ac;
import best.ad;
import best.n_0;
import c.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Random;

public class m_0 {
    private static ArrayList gy = null;
    private static ArrayList gz = null;
    private InputStream gA = this.getClass().getResourceAsStream("/arquivos/default_lang.xml");
    private InputStream gB = this.getClass().getResourceAsStream("/arquivos/ok_bra.txt");
    private static Properties gC = null;

    public m_0(boolean bl) {
        if (bl) {
            this.a(this.it());
        } else {
            this.iu();
        }
    }

    public m_0() {
    }

    public void a(Properties properties) {
        gC = properties;
    }

    public Properties it() {
        Properties properties = new Properties();
        try {
            properties.loadFromXML(this.gA);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return properties;
    }

    public void iu() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.gB));
        try {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                a.SR.aX().add(string);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void iv() {
        String string = "E:/Dropbox/JavaProjetos/names/";
        int n2 = 0;
        while (n2 < ac.jz()) {
            String string2 = String.valueOf(((ad)n_0.cY().get(n2)).jE()) + ".txt";
            File file = new File(String.valueOf(string) + string2);
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            ++n2;
        }
    }

    public static String getString(String string) {
        String string2 = gC.getProperty(string);
        return string2;
    }

    public static void iw() {
        InputStream inputStream = m_0.class.getClass().getResourceAsStream("/arquivos/default_lang.xml");
        try {
            Properties properties = new Properties();
            properties.loadFromXML(inputStream);
            Enumeration<Object> enumeration = properties.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                String string2 = properties.getProperty(string);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void s(int n2, int n3) {
        Object var3_3 = null;
        Object var4_4 = null;
        int n4 = n_0.G(n2);
        String string = ((ad)n_0.cY().get(n4)).jE();
        String string2 = "/arquivos/names/" + string + ".txt";
        String string3 = "/arquivos/surnames/" + string + ".txt";
        if (n3 == 1) {
            string2 = string3;
        }
        InputStream inputStream = this.getClass().getResourceAsStream(string2);
        BufferedReader bufferedReader = null;
        if (inputStream != null) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        int n5 = 0;
        try {
            String string4;
            while ((string4 = bufferedReader.readLine()) != null) {
                ++n5;
                if (!string4.isEmpty() & !string4.contains(".") & !string4.contains("/") & !string4.contains("(") & !string4.matches(".*\\d+.*")) {
                    System.out.println(String.valueOf(n5) + ":" + string4);
                }
                System.out.println(string4);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public ArrayList a(String string, int n2, int n3) {
        if (n2 == 221) {
            n2 = 85;
        } else if (n2 == 222) {
            n2 = 72;
        } else if (n2 == 223) {
            n2 = 85;
        }
        if (gy == null || gy.size() < 221) {
            gy = new ArrayList(221);
            int n4 = 0;
            while (n4 < 222) {
                gy.add(new ArrayList());
                ++n4;
            }
        }
        if (gz == null || gz.size() < 221) {
            gz = new ArrayList(221);
            int n5 = 0;
            while (n5 < 222) {
                gz.add(new ArrayList());
                ++n5;
            }
        }
        if (gy.get(n2) == null) {
            gy.set(n2, new ArrayList());
        }
        if (gz.get(n2) == null) {
            gy.set(n2, new ArrayList());
        }
        ArrayList arrayList = (ArrayList)gy.get(n2);
        if (n3 == 1) {
            arrayList = (ArrayList)gz.get(n2);
        }
        if (arrayList != null && arrayList.size() == 0) {
            InputStream inputStream = this.getClass().getResourceAsStream(string);
            BufferedReader bufferedReader = null;
            if (inputStream == null) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            try {
                String string2;
                while ((string2 = bufferedReader.readLine()) != null) {
                    if (!(!string2.isEmpty() & !string2.contains(".") & !string2.matches(".*\\d+.*"))) continue;
                    arrayList.add(string2);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return arrayList;
    }

    public String au(int n2) {
        String string = null;
        String string2 = null;
        ArrayList arrayList = null;
        int n3 = n_0.G(n2);
        String string3 = ((ad)n_0.cY().get(n3)).jE();
        String string4 = "/arquivos/names/" + string3 + ".txt";
        String string5 = "/arquivos/surnames/" + string3 + ".txt";
        arrayList = this.a(string4, n2, 0);
        if (arrayList != null && arrayList.size() > 0) {
            int n4 = new Random().nextInt(arrayList.size());
            int n5 = 0;
            if (arrayList.size() >= 1000 && new Random().nextInt(2) == 0) {
                n4 = new Random().nextInt(500);
            }
            if (n4 == 0) {
                n4 = 1;
            }
            if ((n5 = m_0.q(string = (String)arrayList.get(n4))) == 1) {
                arrayList = this.a(string5, n2, 1);
                if (arrayList != null && arrayList.size() > 2) {
                    int n6 = new Random().nextInt(arrayList.size());
                    if (n6 == 0) {
                        n6 = 1;
                    }
                    if (!string.equals(string2 = (String)arrayList.get(n6))) {
                        string = String.valueOf(string) + " " + string2;
                    }
                }
            } else if (n5 == 2) {
                boolean bl = false;
                if (new Random().nextInt(2) == 0) {
                    bl = true;
                }
                if (string.length() <= 12 && bl && arrayList != null && arrayList.size() > 2) {
                    int n7 = new Random().nextInt(arrayList.size());
                    if (n7 == 0) {
                        n7 = 1;
                    }
                    if (!string.equals(string2 = (String)arrayList.get(n7)) && string2.length() <= 6) {
                        string = String.valueOf(string) + " " + string2;
                    }
                }
            }
        }
        return string;
    }

    public String k(int n2, boolean bl) {
        String string = null;
        String string2 = null;
        ArrayList arrayList = null;
        int n3 = n_0.G(n2);
        String string3 = ((ad)n_0.cY().get(n3)).jE();
        String string4 = "/arquivos/names/" + string3 + ".txt";
        String string5 = "/arquivos/surnames/" + string3 + ".txt";
        arrayList = this.a(string4, n2, 0);
        if (arrayList != null && arrayList.size() > 0) {
            int n4 = new Random().nextInt(arrayList.size());
            int n5 = 0;
            if (arrayList.size() >= 1000 && new Random().nextInt(2) == 0) {
                n4 = new Random().nextInt(500);
            }
            if (n4 == 0) {
                n4 = 1;
            }
            if ((n5 = m_0.q(string = (String)arrayList.get(n4))) == 1) {
                if (bl && (arrayList = this.a(string5, n2, 1)) != null && arrayList.size() > 2) {
                    int n6 = new Random().nextInt(arrayList.size());
                    if (n6 == 0) {
                        n6 = 1;
                    }
                    if (!string.equals(string2 = (String)arrayList.get(n6))) {
                        string = String.valueOf(string) + " " + string2;
                    }
                }
            } else if (n5 == 2) {
                boolean bl2 = false;
                if (new Random().nextInt(2) == 0) {
                    bl2 = true;
                }
                if (!bl) {
                    bl2 = false;
                }
                if (string.length() <= 12 && bl2 && arrayList != null && arrayList.size() > 2) {
                    int n7 = new Random().nextInt(arrayList.size());
                    if (n7 == 0) {
                        n7 = 1;
                    }
                    if (!string.equals(string2 = (String)arrayList.get(n7)) && string2.length() <= 6) {
                        string = String.valueOf(string) + " " + string2;
                    }
                }
            }
        }
        return string;
    }

    public static int q(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        String[] stringArray = string.split("\\s+");
        return stringArray.length;
    }
}

