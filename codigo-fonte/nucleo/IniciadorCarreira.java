package nucleo;

import persistencia.EntradaObjetosCompativel;
import nucleo.ModeloJogador;
import nucleo.ItemSelecaoPais;
import nucleo.CarregadorTimes;
import nucleo.LigaNacional;
import nucleo.Calendario;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorIdioma;
import nucleo.ComparadorNivelTime2Decrescente;
import nucleo.FiltroArquivoCfg;
import components.ColocacaoCampeonatoEstadual;
import est.ArrayLigaType;
import modelos.ModeloTime2;
import est.ConfigLigaType;
import competicoes.CompeticaoSulAmericana;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoConferenceLeague;
import competicoes.CompeticaoLigaAsiatica;
import competicoes.CompeticaoChampionsLeague;
import competicoes.CompeticaoLigaConcacaf;
import competicoes.CompeticaoLigaEuropa;
import competicoes.CompeticaoLigaOceania;
import comparadores.ColecaoComparadoresSorteio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public abstract class IniciadorCarreira {
    public static Comparator cN = new ComparadorNivelTime2Decrescente();

    public static void dd() {
        if (motor.GerenciadorJogo.SR.aG().size() == 0) {
            IniciadorCarreira.de();
        }
        motor.GerenciadorJogo.SR.bC = new ArrayList();
        motor.GerenciadorJogo.SR.bD = new int[EnumPaises.jz()];
        motor.GerenciadorJogo.SR.bE = new int[ConstantesJogo.rX.length];
        CarregadorTimes.w(false);
        Collections.sort(motor.GerenciadorJogo.SR.bC, cN);
        motor.GerenciadorJogo.SR.bF = new ArrayList();
        int n2 = 10;
        int n3 = 0;
        while (n3 < motor.GerenciadorJogo.SR.bD.length) {
            n2 = n3 == 3 || n3 == 11 || n3 == 97 || n3 == 104 || n3 == 72 ? 16 : 10;
            if (motor.GerenciadorJogo.SR.bD[n3] >= n2) {
                ItemSelecaoPais o2 = new ItemSelecaoPais();
                o2.setPais(n3);
                o2.aX(motor.GerenciadorJogo.SR.bD[n3]);
                o2.v(false);
                motor.GerenciadorJogo.SR.bF.add(o2);
            }
            ++n3;
        }
        motor.GerenciadorJogo.SR.bG = new ArrayList();
        IniciadorCarreira.ds();
    }

    public static void de() {
        motor.GerenciadorJogo.SR.aG().clear();
        int n2 = 0;
        while (n2 < EnumPaises.jz()) {
            LigaNacional z2 = new LigaNacional(n2);
            motor.GerenciadorJogo.SR.aG().add(z2);
            ++n2;
        }
    }

    public static void w(ArrayList arrayList) {
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (((ItemSelecaoPais)arrayList.get(n2)).iC()) {
                LigaNacional z2 = (LigaNacional)motor.GerenciadorJogo.SR.aG().get(((ItemSelecaoPais)arrayList.get(n2)).getPais());
                z2.Ar();
                motor.GerenciadorJogo.SR.a(z2);
            }
            ++n2;
        }
    }

    public static void df() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.N().size()) {
            if (((LigaNacional)motor.GerenciadorJogo.SR.N().get(n2)).jc() == 29) {
                ((LigaNacional)motor.GerenciadorJogo.SR.N().get(n2)).ja();
            }
            ++n2;
        }
    }

    public static void x(ArrayList arrayList) {
        int n2 = 15;
        Integer n3 = -1;
        boolean bl = false;
        int[] nArray = new int[EnumPaises.jz()];
        int n4 = 0;
        while (n4 < motor.GerenciadorJogo.SR.bC.size()) {
            n3 = ((ModeloTime2)motor.GerenciadorJogo.SR.bC.get(n4)).getPais();
            if (n3 != null) {
                bl = motor.GerenciadorJogo.SR.t(n3);
                if (nArray[((ModeloTime2)motor.GerenciadorJogo.SR.bC.get(n4)).getPais()] < n2 || bl) {
                    new ModeloTime((ModeloTime2)motor.GerenciadorJogo.SR.bC.get(n4));
                    int n5 = ((ModeloTime2)motor.GerenciadorJogo.SR.bC.get(n4)).getPais();
                    nArray[n5] = nArray[n5] + 1;
                }
            }
            ++n4;
        }
    }

    public static void dg() {
        IniciadorCarreira.x(motor.GerenciadorJogo.SR.bF);
        int n2 = 0;
        while (n2 < EnumPaises.jz()) {
            LigaNacional z2 = (LigaNacional)motor.GerenciadorJogo.SR.aG().get(n2);
            z2.iT();
            ++n2;
        }
        motor.GerenciadorJogo.SR.cb();
        motor.GerenciadorJogo.SR.r(motor.GerenciadorJogo.SR.op());
        Calendario.g();
        Calendario.u();
        IniciadorCarreira.w(motor.GerenciadorJogo.SR.bF);
        if ((motor.GerenciadorJogo.SR.bk() || motor.GerenciadorJogo.SR.X()) && (n2 = Calendario.e(1)) > 0) {
            Calendario.b(n2, 4, 1);
        }
        Calendario.q();
        new GerenciadorIdioma(false);
        IniciadorCarreira.dj();
        n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.O().size()) {
            ((ModeloJogador)motor.GerenciadorJogo.SR.O().get(n2)).fh();
            ++n2;
        }
        n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.Q().size()) {
            ((ModeloJogador)motor.GerenciadorJogo.SR.Q().get(n2)).fh();
            ++n2;
        }
        n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.L().size()) {
            ((Campeonato)motor.GerenciadorJogo.SR.L().get(n2)).fh();
            ++n2;
        }
        motor.GerenciadorJogo.SR.aU();
        motor.GerenciadorJogo.SR.c(false);
        if (motor.GerenciadorJogo.SR.op() == 2023) {
            motor.GerenciadorJogo.SR.rU();
        }
        motor.GerenciadorJogo.afQ.zj();
        if (motor.GerenciadorJogo.SR.isJogaSelecoesAll()) {
            motor.GerenciadorJogo.SR.ab();
            motor.GerenciadorJogo.SR.ac();
        }
        if (motor.GerenciadorJogo.SR.isJogaIntClubes()) {
            IniciadorCarreira.dm();
            IniciadorCarreira.dr();
            IniciadorCarreira.dq();
            IniciadorCarreira.dk();
            IniciadorCarreira.dn();
            IniciadorCarreira.dl();
            n2 = Calendario.d(4);
            if (n2 > 0) {
                Calendario.b(n2, 1, 0);
            }
            IniciadorCarreira.do_1();
            IniciadorCarreira.dp();
            IniciadorCarreira.yM();
        }
        if (!motor.GerenciadorJogo.SR.bk() && !motor.GerenciadorJogo.SR.isJogaRegionais()) {
            IniciadorCarreira.df();
        }
        Collections.sort(motor.GerenciadorJogo.SR.P(), ColecaoComparadoresSorteio.VS);
    }

    public static void dh() {
        boolean bl = false;
        int[] nArray = new int[4];
        String[] stringArray = new String[]{"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
        Integer[][] integerArrayArray = new Integer[][]{{18, 25}, {10, 17, 22, 23}, {1, 4, 5, 9, 14, 15, 16, 19, 24}, {0, 2, 3, 6, 7, 8, 11, 12, 13, 20, 21, 26}};
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.P().size()) {
            if (((ModeloTime)motor.GerenciadorJogo.SR.P().get(n2)).getPais() == 29) {
                int n3 = ((ModeloTime)motor.GerenciadorJogo.SR.P().get(n2)).getEstado();
                if (Arrays.asList(integerArrayArray[0]).contains(n3)) {
                    nArray[0] = nArray[0] + 1;
                } else if (Arrays.asList(integerArrayArray[1]).contains(n3)) {
                    nArray[1] = nArray[1] + 1;
                } else if (Arrays.asList(integerArrayArray[2]).contains(n3)) {
                    nArray[2] = nArray[2] + 1;
                } else if (Arrays.asList(integerArrayArray[3]).contains(n3)) {
                    nArray[3] = nArray[3] + 1;
                }
            }
            ++n2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList = IniciadorCarreira.di();
        boolean[] blArray = motor.GerenciadorJogo.SR.getJogaRegionaisTodos();
        int n4 = 0;
        while (n4 < 4) {
            if (blArray[n4] && nArray[n4] >= 16) {
                motor.GerenciadorJogo.SR.a(new competicoes.CompeticaoCopasRegionais(n4, arrayList), n4);
                bl = true;
            }
            ++n4;
        }
        motor.GerenciadorJogo.SR.setJogaRegionais(bl);
    }

    public static ArrayList di() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        LigaNacional z2 = motor.GerenciadorJogo.SR.o(29);
        if (z2 != null) {
            if (motor.GerenciadorJogo.vM().isConviteRegionais() && motor.GerenciadorJogo.SR.aN().size() == 1 && ((ModeloTime)motor.GerenciadorJogo.SR.aN().get(0)).getPais() == 29) {
                arrayList.add((ModeloTime)motor.GerenciadorJogo.SR.aN().get(0));
            }
            int n2 = 0;
            while (n2 < z2.eb().size()) {
                int n3 = 0;
                while (n3 < ((CompeticaoLigaNacional)z2.eb().get(n2)).yi().yK().size()) {
                    if (!arrayList.contains(((CompeticaoLigaNacional)z2.eb().get(n2)).yi().yK().get(n3))) {
                        arrayList.add((ModeloTime)((CompeticaoLigaNacional)z2.eb().get(n2)).yi().yK().get(n3));
                    }
                    ++n3;
                }
                ++n2;
            }
            if (motor.GerenciadorJogo.SR.H() > 1 && motor.GerenciadorJogo.SR.bx().size() > 0 && motor.GerenciadorJogo.SR.bk() && z2.eb().size() == 4) {
                n2 = 0;
                while (n2 < motor.GerenciadorJogo.SR.bx().size()) {
                    if (!arrayList.contains(arrayList.add(((ColocacaoCampeonatoEstadual)motor.GerenciadorJogo.SR.bx().get(n2)).vD()))) {
                        arrayList.add(((ColocacaoCampeonatoEstadual)motor.GerenciadorJogo.SR.bx().get(n2)).vD());
                    }
                    ++n2;
                }
            }
            n2 = 0;
            while (n2 < motor.GerenciadorJogo.SR.P().size()) {
                if (((ModeloTime)motor.GerenciadorJogo.SR.P().get(n2)).getPais() == 29 && !arrayList.contains(motor.GerenciadorJogo.SR.P().get(n2)) && !arrayList2.contains(motor.GerenciadorJogo.SR.P().get(n2))) {
                    arrayList2.add((ModeloTime)motor.GerenciadorJogo.SR.P().get(n2));
                }
                ++n2;
            }
            Collections.shuffle(arrayList2);
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private static void dj() {
        int n2 = 0;
        while (n2 < motor.GerenciadorJogo.SR.P().size()) {
            ((ModeloTime)motor.GerenciadorJogo.SR.P().get(n2)).bX(n2);
            ++n2;
        }
        motor.GerenciadorJogo.SR.w(motor.GerenciadorJogo.SR.P().size());
    }

    private static void dk() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaAsiatica());
        motor.GerenciadorJogo.SR.aL().yq();
    }

    private static void dl() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaOceania());
        motor.GerenciadorJogo.SR.aQ().yq();
    }

    private static void dm() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaConcacaf());
        motor.GerenciadorJogo.SR.aP().yq();
    }

    private static void dn() {
        motor.GerenciadorJogo.SR.a(new competicoes.CompeticaoLigaAfricana());
        motor.GerenciadorJogo.SR.aO().yq();
    }

    private static void do_1() {
        motor.GerenciadorJogo.SR.a(new CompeticaoSulAmericana());
        motor.GerenciadorJogo.SR.aH().yq();
    }

    private static void dp() {
        motor.GerenciadorJogo.SR.a(new CompeticaoLigaEuropa());
        motor.GerenciadorJogo.SR.aK().yq();
    }

    private static void yM() {
        motor.GerenciadorJogo.SR.a(new CompeticaoConferenceLeague());
        motor.GerenciadorJogo.SR.mj().yq();
        motor.GerenciadorJogo.SR.mj().setNome("Conference League");
    }

    private static void dq() {
        motor.GerenciadorJogo.SR.a(new CompeticaoChampionsLeague());
        motor.GerenciadorJogo.SR.aI().setNome(GerenciadorIdioma.getString("ligaC"));
        motor.GerenciadorJogo.SR.aI().yq();
    }

    private static void dr() {
        motor.GerenciadorJogo.SR.a(new competicoes.CompeticaoLibertadores());
        motor.GerenciadorJogo.SR.aF().setNome(GerenciadorIdioma.getString("lib"));
        motor.GerenciadorJogo.SR.aF().yq();
    }

    public static void ds() {
        motor.GerenciadorJogo.SR.bG.clear();
        File file = new File(String.valueOf(System.getProperty("user.dir")) + "/conf_ligas_nacionais");
        File[] fileArray = file.listFiles(new FiltroArquivoCfg());
        if (fileArray != null) {
            int n2 = 0;
            while (n2 < fileArray.length) {
                if (fileArray[n2].isFile()) {
                    ArrayLigaType arrayLigaType = new ArrayLigaType();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(fileArray[n2].getPath());
                        ObjectInputStream objectInputStream = new EntradaObjetosCompativel(fileInputStream);
                        arrayLigaType = (ArrayLigaType)objectInputStream.readObject();
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
                    IniciadorCarreira.a(arrayLigaType);
                }
                ++n2;
            }
        }
    }

    public static void a(ArrayLigaType arrayLigaType) {
        int n2 = 0;
        while (n2 < arrayLigaType.a.size()) {
            motor.GerenciadorJogo.SR.bG.add((ConfigLigaType)arrayLigaType.a.get(n2));
            ++n2;
        }
    }

    public static void a(ConfigLigaType[] configLigaTypeArray, int n2) {
        ArrayLigaType arrayLigaType = new ArrayLigaType();
        int n3 = 1;
        while (n3 < configLigaTypeArray.length) {
            arrayLigaType.a.add(configLigaTypeArray[n3]);
            ++n3;
        }
        ArrayList<ConfigLigaType> arrayList = new ArrayList<ConfigLigaType>();
        int n4 = 0;
        while (n4 < motor.GerenciadorJogo.SR.bG.size()) {
            if (((ConfigLigaType)motor.GerenciadorJogo.SR.bG.get(n4)).getPais() == n2) {
                arrayList.add((ConfigLigaType)motor.GerenciadorJogo.SR.bG.get(n4));
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < arrayList.size()) {
            motor.GerenciadorJogo.SR.bG.remove(arrayList.get(n4));
            ++n4;
        }
        motor.GerenciadorJogo.SR.bG.addAll(arrayLigaType.a);
        String string = String.valueOf(EnumPaises.valueOf("P" + Integer.toString(n2)).jA()) + ".cfg";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.getProperty("user.dir")) + "/conf_ligas_nacionais/" + string);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayLigaType);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void c(int n2, int n3, int n4) {
        ConfigLigaType configLigaType = new ConfigLigaType();
        if (n2 == 1) {
            configLigaType.setnTimes(10);
            configLigaType.setnRebaixados(2);
        } else if (n2 == 2) {
            configLigaType.setnTimes(20);
            configLigaType.setnRebaixados(4);
        }
        configLigaType.setPais(n3);
        configLigaType.setDivisao(n4);
        motor.GerenciadorJogo.SR.bG.add(configLigaType);
    }

}

