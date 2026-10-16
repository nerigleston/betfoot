package nucleo;

import persistencia.EntradaObjetosCompativel;
import nucleo.ModeloPartida;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.ComparadorTimesEstaduais;
import nucleo.FiltroArquivoXmlConfig;
import nucleo.FiltroArquivoCes;
import motor.GerenciadorJogo;
import components.ColocacaoCampeonatoEstadual;
import est.ArrayLigaEType;
import est.ConfigEstadualType;
import est.LoadLigaOptions;
import competicoes.CompeticaoCampeonatoEstadual;
import competicoes.LigaPontosCorridos;
import comparadores.ColecaoComparadoresSorteio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CarregadorConfigEstadual
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int dr = -1;
    public ArrayList ds = new ArrayList();
    private ArrayList dt = new ArrayList();
    private static transient ArrayList du = new ArrayList();
    private static transient ArrayList dv = new ArrayList();
    private int dw = 0;
    public static Comparator dx = new ComparadorTimesEstaduais();

    public CarregadorConfigEstadual() {
    }

    public CarregadorConfigEstadual(int n2) {
        this.dr = n2;
        GerenciadorJogo.SR.aE().add(this);
        this.dY();
    }

    private void dY() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getPais() == 29 && ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getEstado() == this.dr) {
                arrayList.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
            }
            ++n2;
        }
        DivisoesIniciais.ordenarEstadual(arrayList, ColecaoComparadoresSorteio.cN);
        ConfigEstadualType configEstadualType = null;
        boolean bl = false;
        int n3 = arrayList.size();
        boolean bl2 = false;
        boolean bl3 = false;
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n4 = 1;
        while (n4 <= 4) {
            bl = false;
            bl2 = false;
            bl3 = false;
            if (arrayList.size() >= 6) {
                int n5;
                configEstadualType = CarregadorConfigEstadual.g(this.dr, n4);
                LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
                int n6 = 0;
                if (configEstadualType == null) {
                    bl = true;
                } else if (ConstantesJogo.sL[configEstadualType.getFormula()][0] > n3) {
                    bl = true;
                }
                if (!bl) {
                    loadLigaOptions.nTimes = ConstantesJogo.sL[configEstadualType.getFormula()][0];
                    loadLigaOptions.nGrupos = ConstantesJogo.sL[configEstadualType.getFormula()][1];
                    loadLigaOptions.numeroTimesMataMata = ConstantesJogo.sL[configEstadualType.getFormula()][2];
                    loadLigaOptions.doisTurnos = ConstantesJogo.sL[configEstadualType.getFormula()][3] == 1;
                    loadLigaOptions.duasVoltasMataMata = configEstadualType.getFinaisIdaVoltaFormatado();
                    configEstadualType.getFormula();
                    n6 = ConstantesJogo.sL[configEstadualType.getFormula()][4];
                    loadLigaOptions.desempateEstadual = configEstadualType.getDesempate();
                    if (configEstadualType.getFormula() == 7 || configEstadualType.getFormula() == 10) {
                        loadLigaOptions.jogosDentroGrupo = false;
                    }
                    loadLigaOptions.var0 = configEstadualType.getFormula();
                } else {
                    loadLigaOptions.nTimes = 6;
                    loadLigaOptions.nGrupos = 0;
                    loadLigaOptions.numeroTimesMataMata = 2;
                    loadLigaOptions.doisTurnos = true;
                    n6 = 2;
                    loadLigaOptions.var0 = 0;
                }
                arrayList2.clear();
                ArrayList arrayList3 = new ArrayList();
                if (loadLigaOptions.var0 == 7 && n4 == 1 && this.dr == 25 && GerenciadorJogo.SR.isUsaGrupoPadraoEstadual()) {
                    arrayList3 = CarregadorConfigEstadual.z(arrayList);
                }
                ArrayList arrayList4 = new ArrayList();
                if (loadLigaOptions.var0 == 7 && n4 == 1 && this.dr == 25 && arrayList3.size() == 16) {
                    n5 = 0;
                    while (n5 < arrayList3.size()) {
                        arrayList2.add((ModeloTime)arrayList3.get(n5));
                        ++n5;
                    }
                    bl3 = true;
                    arrayList3.clear();
                } else {
                    n5 = 0;
                    while (n5 < loadLigaOptions.nTimes) {
                        if (n5 < arrayList.size()) {
                            arrayList2.add((ModeloTime)arrayList.get(n5));
                        }
                        ++n5;
                    }
                }
                LigaPontosCorridos s2 = null;
                CompeticaoCampeonatoEstadual o2 = new CompeticaoCampeonatoEstadual(this, this.ds.size() + 1);
                o2.setnRebaixados(n6);
                s2 = new LigaPontosCorridos(loadLigaOptions, arrayList2, 0, null, null, null, 3, this, bl2, null, bl3, o2);
                this.ds.add(o2);
                o2.q(s2);
                int n7 = 0;
                while (n7 < arrayList2.size()) {
                    arrayList.remove(arrayList2.get(n7));
                    ++n7;
                }
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < arrayList.size()) {
            this.dt.add((ModeloTime)arrayList.get(n4));
            ++n4;
        }
    }

    private static ArrayList z(ArrayList arrayList) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < ConstantesJogo.sO.length) {
            int n3 = 0;
            while (n3 < arrayList.size()) {
                if (((ModeloTime)arrayList.get(n3)).jY().equals(ConstantesJogo.sO[n2]) && ((ModeloTime)arrayList.get(n3)).getEstado() == 25) {
                    arrayList2.add((ModeloTime)arrayList.get(n3));
                }
                ++n3;
            }
            ++n2;
        }
        return arrayList2;
    }

    public static void dZ() {
        CarregadorConfigEstadual.ef();
        int[] nArray = new int[27];
        int n2 = -1;
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.P().size()) {
            if (((ModeloTime)GerenciadorJogo.SR.P().get(n3)).getPais() == 29 && (n2 = ((ModeloTime)GerenciadorJogo.SR.P().get(n3)).getEstado()) >= 0 && n2 <= 26) {
                int n4 = n2;
                nArray[n4] = nArray[n4] + 1;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < nArray.length) {
            if (nArray[n3] >= 6) {
                new CarregadorConfigEstadual(n3);
            }
            ++n3;
        }
    }

    public static void ds() {
        du.clear();
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/conf_estadual");
        File[] fileArray = file.listFiles(new FiltroArquivoXmlConfig());
        int n2 = 0;
        while (n2 < fileArray.length) {
            if (fileArray[n2].isFile()) {
                try {
                    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                    Document document = documentBuilder.parse(fileArray[n2].getPath());
                    Node node = document.getFirstChild();
                    NodeList nodeList = node.getChildNodes();
                    int n3 = 0;
                    while (n3 < nodeList.getLength()) {
                        Node node2 = nodeList.item(n3);
                        Element element = (Element)node2;
                        CarregadorConfigEstadual.j(element.getTextContent());
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            ++n2;
        }
    }

    public static void j(String string) {
        String string2;
        String[] stringArray;
        if ((string = string.trim()) != null && !string.isEmpty() && (stringArray = (string2 = string).split(",")).length == 8) {
            int[] nArray = new int[stringArray.length];
            int n2 = 0;
            while (n2 < nArray.length) {
                nArray[n2] = Integer.parseInt(stringArray[n2]);
                ++n2;
            }
            dv.add(new ConfigEstadualType(nArray));
        }
    }

    public static ConfigEstadualType g(int n2, int n3) {
        int n4 = 0;
        while (n4 < dv.size()) {
            if (((ConfigEstadualType)dv.get(n4)).getId() == n2 && ((ConfigEstadualType)dv.get(n4)).getDivisao() == n3) {
                return (ConfigEstadualType)dv.get(n4);
            }
            ++n4;
        }
        return null;
    }

    public String ea() {
        return ConstantesJogo.rZ[this.dr];
    }

    public ArrayList eb() {
        return this.ds;
    }

    public int ec() {
        return this.dw;
    }

    public void ed() {
        ++this.dw;
    }

    public int getEstado() {
        return this.dr;
    }

    public void ee() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        boolean bl = false;
        ((CompeticaoCampeonatoEstadual)this.ds.get(0)).yi().ah(0, ((CompeticaoCampeonatoEstadual)this.ds.get(0)).getnRebaixados());
        int n2 = 1;
        while (n2 < this.ds.size()) {
            ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().ah(((CompeticaoCampeonatoEstadual)this.ds.get(n2 - 1)).getnRebaixados(), ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).getnRebaixados());
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ds.size()) {
            int n3;
            if (n2 + 1 < this.ds.size()) {
                arrayList2.clear();
                arrayList.clear();
                n3 = 0;
                while (n3 < ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yU().size()) {
                    arrayList2.add((ModeloTime)((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yU().get(n3));
                    ++n3;
                }
                n3 = 0;
                while (n3 < ((CompeticaoCampeonatoEstadual)this.ds.get(n2 + 1)).yi().yW().size()) {
                    arrayList.add((ModeloTime)((CompeticaoCampeonatoEstadual)this.ds.get(n2 + 1)).yi().yW().get(n3));
                    ++n3;
                }
                if (arrayList2.size() == arrayList.size()) {
                    n3 = 0;
                    while (n3 < arrayList2.size()) {
                        ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().remove(arrayList2.get(n3));
                        ((CompeticaoCampeonatoEstadual)this.ds.get(n2 + 1)).yi().yK().add((ModeloTime)arrayList2.get(n3));
                        ++n3;
                    }
                    n3 = 0;
                    while (n3 < arrayList.size()) {
                        ((CompeticaoCampeonatoEstadual)this.ds.get(n2 + 1)).yi().yK().remove(arrayList.get(n3));
                        ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().add((ModeloTime)arrayList.get(n3));
                        ++n3;
                    }
                }
            } else {
                arrayList2.clear();
                arrayList.clear();
                n3 = ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).getnRebaixados();
                if (this.dt.size() < n3) {
                    n3 = this.dt.size();
                }
                if (n3 > 0) {
                    int n4 = 0;
                    while (n4 < ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yU().size()) {
                        if (n4 < n3) {
                            arrayList2.add((ModeloTime)((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yU().get(n4));
                        }
                        ++n4;
                    }
                    n4 = 0;
                    while (n4 < n3) {
                        arrayList.add((ModeloTime)this.dt.get(n4));
                        ++n4;
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        n4 = 0;
                        while (n4 < arrayList2.size()) {
                            ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().remove(arrayList2.get(n4));
                            this.dt.add((ModeloTime)arrayList2.get(n4));
                            ++n4;
                        }
                        n4 = 0;
                        while (n4 < arrayList.size()) {
                            this.dt.remove(arrayList.get(n4));
                            ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().add((ModeloTime)arrayList.get(n4));
                            ++n4;
                        }
                    }
                }
            }
            ++n2;
        }
    }

    public static void P(int n2) {
        ArrayLigaEType arrayLigaEType = new ArrayLigaEType();
        int n3 = 0;
        while (n3 < dv.size()) {
            if (((ConfigEstadualType)dv.get(n3)).getId() == n2) {
                arrayLigaEType.a.add((ConfigEstadualType)dv.get(n3));
            }
            ++n3;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.getProperty("user.dir")) + "/conf_estadual/" + ConstantesJogo.rX[n2] + ".ces");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayLigaEType);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void ef() {
        dv.clear();
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/conf_estadual");
        File[] fileArray = file.listFiles(new FiltroArquivoCes());
        int n2 = 0;
        while (n2 < fileArray.length) {
            if (fileArray[n2].isFile()) {
                ArrayLigaEType arrayLigaEType = new ArrayLigaEType();
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArray[n2].getPath());
                    ObjectInputStream objectInputStream = new EntradaObjetosCompativel(fileInputStream);
                    arrayLigaEType = (ArrayLigaEType)objectInputStream.readObject();
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
                CarregadorConfigEstadual.a(arrayLigaEType);
            }
            ++n2;
        }
    }

    public static void a(ArrayLigaEType arrayLigaEType) {
        int n2 = 0;
        while (n2 < arrayLigaEType.a.size()) {
            dv.add((ConfigEstadualType)arrayLigaEType.a.get(n2));
            ++n2;
        }
    }

    public static ArrayList eg() {
        return dv;
    }

    public static ArrayList eh() {
        int n2 = 128;
        ArrayList arrayList = new ArrayList();
        Collections.sort(GerenciadorJogo.SR.bx(), dx);
        int n3 = 0;
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        n3 = arrayList.size();
        if (n3 < n2) {
            CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        }
        if (n3 < n2) {
            CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
            CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        }
        return arrayList;
    }

    public static void a(int[] nArray, ArrayList arrayList) {
        int n2 = 0;
        while (n2 < nArray.length) {
            int n3 = 0;
            while (n3 < GerenciadorJogo.SR.bx().size()) {
                if (((ColocacaoCampeonatoEstadual)GerenciadorJogo.SR.bx().get(n3)).getEstado() == nArray[n2] && !arrayList.contains(((ColocacaoCampeonatoEstadual)GerenciadorJogo.SR.bx().get(n3)).vD())) {
                    arrayList.add(((ColocacaoCampeonatoEstadual)GerenciadorJogo.SR.bx().get(n3)).vD());
                    break;
                }
                ++n3;
            }
            ++n2;
        }
    }

    public static ArrayList Q(int n2) {
        int n3;
        Serializable serializable;
        int n4;
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        Collections.sort(GerenciadorJogo.SR.bx(), dx);
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        if (GerenciadorJogo.SR.bY().size() > 0) {
            n4 = 0;
            while (n4 < GerenciadorJogo.SR.bY().size()) {
                if (((ModeloTime)GerenciadorJogo.SR.bY().get(n4)).getDivisao() == 0 && !((ModeloTime)GerenciadorJogo.SR.bY().get(n4)).ko()) {
                    arrayList.add((ModeloTime)GerenciadorJogo.SR.bY().get(n4));
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.bY().get(n4));
                }
                ++n4;
            }
        }
        // Time de técnico humano que só disputa o estadual (fora das Séries A, B e C) tem vaga garantida na Série D.
        n4 = 0;
        while (n4 < GerenciadorJogo.SR.P().size()) {
            ModeloTime humano = (ModeloTime)GerenciadorJogo.SR.P().get(n4);
            if (humano.getPais() == 29 && humano.jZ() != null && humano.jZ().booleanValue() && humano.getDivisao() == 0 && !arrayList.contains(humano)) {
                arrayList.add(humano);
                arrayList2.add(humano);
            }
            ++n4;
        }
        n4 = 0;
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sf, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sb, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sc, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.sd, arrayList);
        CarregadorConfigEstadual.a(ConstantesJogo.se, arrayList);
        n4 = arrayList.size();
        if (n4 < n2 && (serializable = GerenciadorJogo.SR.o(29)) != null) {
            n3 = 0;
            while (n3 < ((LigaNacional)serializable).jg().size()) {
                if (n4 < n2 && ((ModeloTime)((LigaNacional)serializable).jg().get(n3)).getDivisao() == 0 && !arrayList.contains(((LigaNacional)serializable).jg().get(n3))) {
                    arrayList.add((ModeloTime)((LigaNacional)serializable).jg().get(n3));
                    ++n4;
                }
                ++n3;
            }
        }
        if (arrayList.size() > n2) {
            serializable = new ArrayList();
            ((ArrayList)serializable).addAll(arrayList);
            arrayList.clear();
            n3 = 0;
            while (n3 < n2) {
                arrayList.add((ModeloTime)((ArrayList)serializable).get(n3));
                ++n3;
            }
        }
        if (n2 == 68) {
            arrayList.removeAll(arrayList2);
            Collections.sort(arrayList, ColecaoComparadoresSorteio.aaU);
            int n5 = 0;
            while (n5 < arrayList2.size()) {
                arrayList.add(n5, (ModeloTime)arrayList2.get(n5));
                ++n5;
            }
        } else if (n2 == 64) {
            Collections.sort(arrayList, ColecaoComparadoresSorteio.aaV);
        }
        return arrayList;
    }

    public void A(ArrayList arrayList) {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().A(arrayList);
            ++n2;
        }
    }

    public boolean ei() {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            int n3 = 0;
            while (n3 < ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().size()) {
                if (((ModeloTime)((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().get(n3)).jZ().booleanValue()) {
                    return true;
                }
                ++n3;
            }
            ++n2;
        }
        return false;
    }

    public boolean j(ModeloTime ah2) {
        int n2 = 0;
        while (n2 < this.ds.size()) {
            int n3 = 0;
            while (n3 < ((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().size()) {
                if (((CompeticaoCampeonatoEstadual)this.ds.get(n2)).yi().yK().get(n3) == ah2) {
                    return true;
                }
                ++n3;
            }
            ++n2;
        }
        return false;
    }

    public boolean ej() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (this.ds.contains(((ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy())) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public ArrayList ek() {
        return this.dt;
    }

    public int K(int n2) {
        int n3 = n2 - 2;
        if (n2 > 1 && n3 < this.ds.size()) {
            return ((CompeticaoCampeonatoEstadual)this.ds.get(n3)).getnRebaixados();
        }
        return 0;
    }
}

