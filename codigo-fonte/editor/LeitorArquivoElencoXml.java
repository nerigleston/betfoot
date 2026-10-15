package editor;

import persistencia.EntradaObjetosCompativel;
import editor.FiltroArquivoB16;
import editor.FiltroArquivoXml2;
import modelos.ModeloJogador2;
import modelos.ModeloTime2;
import java.awt.Color;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeitorArquivoElencoXml {
    private static String TZ = "E:/java/Betfoot2017_editor/teams";
    private static String Ua = "E:/java/Betfoot2017_editor/teams";

    public static void wj() {
        String string = ".b16";
        int n2 = 18;
        File file = new File(TZ);
        File[] fileArray = file.listFiles(new FiltroArquivoB16());
        int n3 = 0;
        while (n3 < fileArray.length) {
            if (fileArray[n3].isFile()) {
                String string2 = fileArray[n3].getName();
                string2 = string2.substring(0, string2.lastIndexOf("."));
                LeitorArquivoElencoXml.a(fileArray[n3].getPath(), string2, false, 18);
            }
            ++n3;
        }
    }

    public static void a(String string, String string2, boolean bl, int n2) {
        Closeable closeable;
        Closeable closeable2;
        String string3 = ".b18";
        ModeloTime2 t2 = new ModeloTime2();
        try {
            closeable2 = new FileInputStream(string);
            closeable = new EntradaObjetosCompativel((InputStream)closeable2);
            t2 = (ModeloTime2)((ObjectInputStream)closeable).readObject();
            ((ObjectInputStream)closeable).close();
            ((FileInputStream)closeable2).close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return;
        }
        t2.setVid(n2);
        t2.setId(0);
        try {
            closeable2 = new FileOutputStream(String.valueOf(Ua) + "/" + string2 + ".b18");
            closeable = new ObjectOutputStream((OutputStream)closeable2);
            ((ObjectOutputStream)closeable).writeObject(t2);
            ((ObjectOutputStream)closeable).close();
            ((FileOutputStream)closeable2).close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void iD() {
        File file = new File(TZ);
        File[] fileArray = file.listFiles(new FiltroArquivoXml2());
        int n2 = 0;
        while (n2 < fileArray.length) {
            if (fileArray[n2].isFile()) {
                String string = fileArray[n2].getName();
                string = string.substring(0, string.lastIndexOf("."));
                try {
                    LeitorArquivoElencoXml.a(fileArray[n2].getPath(), string);
                }
                catch (ParserConfigurationException parserConfigurationException) {
                    System.out.println("O parser n\u00e3o foi configurado corretamente.");
                    parserConfigurationException.printStackTrace();
                }
                catch (SAXException sAXException) {
                    System.out.println("Problema ao fazer o parse do arquivo.");
                    sAXException.printStackTrace();
                }
                catch (IOException iOException) {
                    System.out.println("O arquivo n\u00e3o pode ser lido.");
                    iOException.printStackTrace();
                }
            }
            ++n2;
        }
        System.out.printf("salvos", new Object[0]);
    }

    public static void a(String string, String string2) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(string);
        Element element = document.getDocumentElement();
        ModeloTime2 t2 = new ModeloTime2();
        t2.setId(0);
        t2.setPais(Integer.parseInt(LeitorArquivoElencoXml.a(element, "p")));
        t2.setEstado(Integer.parseInt(LeitorArquivoElencoXml.a(element, "es")));
        t2.setNivel(Integer.parseInt(LeitorArquivoElencoXml.a(element, "nv")));
        t2.setFileRef(string2);
        t2.setNome(LeitorArquivoElencoXml.a(element, "n"));
        t2.setEstadio(LeitorArquivoElencoXml.a(element, "e"));
        t2.setNivel(Integer.parseInt(LeitorArquivoElencoXml.a(element, "nv")));
        t2.setCapacidade(Integer.parseInt(LeitorArquivoElencoXml.a(element, "ec")));
        t2.setTecnico(LeitorArquivoElencoXml.a(element, "t"));
        t2.setCorF(Color.decode("#" + LeitorArquivoElencoXml.a(element, "cf")));
        t2.setCorT(Color.decode("#" + LeitorArquivoElencoXml.a(element, "ct")));
        t2.setReputacao(Integer.parseInt(LeitorArquivoElencoXml.a(element, "r")));
        t2.setCorBase(Integer.parseInt(LeitorArquivoElencoXml.a(element, "cb")));
        boolean bl = false;
        if (t2.getNome() != "0" && t2.getTecnico() != "0" && t2.getFileRef() != null) {
            bl = true;
        }
        int n2 = 0;
        int n3 = 0;
        if (bl) {
            Object object;
            NodeList nodeList = element.getElementsByTagName("jog");
            ArrayList<ModeloJogador2> arrayList = new ArrayList<ModeloJogador2>();
            ArrayList<ModeloJogador2> arrayList2 = new ArrayList<ModeloJogador2>();
            if (nodeList.getLength() > 0) {
                int n4 = 0;
                while (n4 < nodeList.getLength()) {
                    object = (Element)nodeList.item(n4);
                    if (LeitorArquivoElencoXml.a((Element)object, "no") != "0") {
                        ModeloJogador2 g2 = new ModeloJogador2();
                        g2.setNome(LeitorArquivoElencoXml.a((Element)object, "no"));
                        if (Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "s")) == 1) {
                            g2.setEstrela(true);
                        }
                        g2.setPais(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "pa")));
                        g2.setIdade(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "i")));
                        g2.setPosicao(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "p")));
                        g2.setStatus(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "t")));
                        g2.setLado(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "l")));
                        g2.setCr1(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "c1")));
                        g2.setCr2(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "c2")));
                        g2.setHash(Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "tl")));
                        if (Integer.parseInt(LeitorArquivoElencoXml.a((Element)object, "ju")) == 0) {
                            arrayList.add(g2);
                            if (g2.getPosicao() != 0) {
                                ++n2;
                            } else {
                                ++n3;
                            }
                        } else {
                            arrayList2.add(g2);
                        }
                    }
                    ++n4;
                }
            }
            if (n3 >= 1 && n2 >= 11) {
                t2.setValid(true);
            }
            t2.setJogadores(arrayList);
            t2.setJuniores(arrayList2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(Ua) + "/" + string2 + ".b16");
                object = new ObjectOutputStream(fileOutputStream);
                ((ObjectOutputStream)object).writeObject(t2);
                ((ObjectOutputStream)object).close();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static String a(Element element, String string) {
        if (element.getElementsByTagName(string).getLength() == 0) {
            return "0";
        }
        if (element.getElementsByTagName(string).item(0).getChildNodes().getLength() == 0) {
            return "0";
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList == null) {
            return "0";
        }
        Element element2 = (Element)nodeList.item(0);
        if (element2 == null) {
            return "0";
        }
        Node node = element2.getFirstChild();
        return node.getNodeValue();
    }
}

