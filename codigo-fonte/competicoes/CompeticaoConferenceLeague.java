package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import components.ModeloRegistroJogador;
import components.ItemFormacao;
import competicoes.LigaSuica;
import competicoes.SorteioAdversarios;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CompeticaoConferenceLeague
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata YP = null;
    private ChaveMataMata YQ = null;
    private ChaveMataMata YR = null;
    private ChaveMataMata ZB = null;
    private LigaPontosCorridos YD = null;
    private ChaveMataMata afT = null;
    private ArrayList YF = new ArrayList();
    private ArrayList YS = new ArrayList();
    private ArrayList ZE = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();
    private ArrayList YW = new ArrayList();
    private ArrayList cabecas = null;
    private ArrayList confrontos = null;

    public CompeticaoConferenceLeague() {
        this.F(12, 0);
        this.yp();
    }

    private void yo() {
    }

    private void yp() {
        this.YW.add(new ModeloCoeficientePais("fra", 72, 1));
        this.YW.add(new ModeloCoeficientePais("ing", 97, 1));
        this.YW.add(new ModeloCoeficientePais("esp", 65, 1));
        this.YW.add(new ModeloCoeficientePais("ita", 104, 1));
        this.YW.add(new ModeloCoeficientePais("ale", 3, 1));
        this.YW.add(new ModeloCoeficientePais("cro", 52, 1, true));
        this.YW.add(new ModeloCoeficientePais("sui", 180, 1, true));
        this.YW.add(new ModeloCoeficientePais("gre", 78, 1, true));
        this.YW.add(new ModeloCoeficientePais("hol", 85, 1));
        this.YW.add(new ModeloCoeficientePais("bel", 21, 1));
        this.YW.add(new ModeloCoeficientePais("aut", 15, 1));
        this.YW.add(new ModeloCoeficientePais("esc", 62, 1));
        this.YW.add(new ModeloCoeficientePais("ucr", 193, 1));
        this.YW.add(new ModeloCoeficientePais("por", 154, 1));
        this.YW.add(new ModeloCoeficientePais("isr", 103, 1, true));
        this.YW.add(new ModeloCoeficientePais("nor", 142, 1, true));
        this.YW.add(new ModeloCoeficientePais("sue", 179, 1));
        this.YW.add(new ModeloCoeficientePais("bul", 31, 1, true));
        this.YW.add(new ModeloCoeficientePais("rom", 160, 1, true));
        this.YW.add(new ModeloCoeficientePais("aze", 16, 1, true));
        this.YW.add(new ModeloCoeficientePais("caz", 40, 1, true));
        this.YW.add(new ModeloCoeficientePais("hun", 88, 1, true));
        this.YW.add(new ModeloCoeficientePais("belarus", 25, 1, true));
        this.YW.add(new ModeloCoeficientePais("pol", 152, 1, true));
        this.YW.add(new ModeloCoeficientePais("esl", 64, 1, true));
        this.YW.add(new ModeloCoeficientePais("esk", 63, 1, true));
        this.YW.add(new ModeloCoeficientePais("lie", 118, 1));
        this.YW.add(new ModeloCoeficientePais("lit", 119, 1, true));
        this.YW.add(new ModeloCoeficientePais("lux", 120, 1, true));
        this.YW.add(new ModeloCoeficientePais("bos", 27, 1, true));
        this.YW.add(new ModeloCoeficientePais("irl", 100, 1, true));
        this.YW.add(new ModeloCoeficientePais("mac", 122, 1, true));
        this.YW.add(new ModeloCoeficientePais("arm", 12, 1, true));
        this.YW.add(new ModeloCoeficientePais("let", 114, 1, true));
        this.YW.add(new ModeloCoeficientePais("alb", 2, 1, true));
        this.YW.add(new ModeloCoeficientePais("serv", 171, 1));
        this.YW.add(new ModeloCoeficientePais("cze", 159, 1));
        this.YW.add(new ModeloCoeficientePais("cro", 52, 1));
        this.YW.add(new ModeloCoeficientePais("sui", 180, 1));
        this.YW.add(new ModeloCoeficientePais("gre", 78, 1));
        this.YW.add(new ModeloCoeficientePais("isr", 103, 1));
        this.YW.add(new ModeloCoeficientePais("nor", 142, 1));
        this.YW.add(new ModeloCoeficientePais("sue", 179, 1));
        this.YW.add(new ModeloCoeficientePais("bul", 31, 1));
        this.YW.add(new ModeloCoeficientePais("rom", 160, 1));
        this.YW.add(new ModeloCoeficientePais("aze", 16, 1));
        this.YW.add(new ModeloCoeficientePais("caz", 40, 1));
        this.YW.add(new ModeloCoeficientePais("hun", 88, 1));
        this.YW.add(new ModeloCoeficientePais("belarus", 25, 1));
        this.YW.add(new ModeloCoeficientePais("tu", 192, 1));
        this.YW.add(new ModeloCoeficientePais("din", 54, 1));
        this.YW.add(new ModeloCoeficientePais("chipre", 44, 1));
        this.YW.add(new ModeloCoeficientePais("serv", 171, 1));
        this.YW.add(new ModeloCoeficientePais("cze", 159, 1));
        this.YW.add(new ModeloCoeficientePais("cro", 52, 1));
        this.YW.add(new ModeloCoeficientePais("sui", 180, 1));
        this.YW.add(new ModeloCoeficientePais("gre", 78, 1));
        this.YW.add(new ModeloCoeficientePais("isr", 103, 1));
        this.YW.add(new ModeloCoeficientePais("nor", 142, 1));
        this.YW.add(new ModeloCoeficientePais("sue", 179, 1));
        this.YW.add(new ModeloCoeficientePais("bul", 31, 1));
        this.YW.add(new ModeloCoeficientePais("rom", 160, 1));
        this.YW.add(new ModeloCoeficientePais("aze", 16, 1));
        this.YW.add(new ModeloCoeficientePais("caz", 40, 1));
        this.YW.add(new ModeloCoeficientePais("hun", 88, 1));
        this.YW.add(new ModeloCoeficientePais("hol", 85, 1));
        this.YW.add(new ModeloCoeficientePais("bel", 21, 1));
        this.YW.add(new ModeloCoeficientePais("aut", 15, 1));
        this.YW.add(new ModeloCoeficientePais("esc", 62, 1));
        this.YW.add(new ModeloCoeficientePais("ucr", 193, 1));
        this.YW.add(new ModeloCoeficientePais("tu", 192, 1));
        this.YW.add(new ModeloCoeficientePais("din", 54, 1));
        this.YW.add(new ModeloCoeficientePais("chipre", 44, 1));
        this.YW.add(new ModeloCoeficientePais("por", 154, 1));
        this.YW.add(new ModeloCoeficientePais("irlN", 101, 1, true));
        this.YW.add(new ModeloCoeficientePais("geo", 76, 1, true));
        this.YW.add(new ModeloCoeficientePais("fin", 70, 1, true));
        this.YW.add(new ModeloCoeficientePais("mol", 134, 1, true));
        this.YW.add(new ModeloCoeficientePais("mlt", 128, 1, true));
        this.YW.add(new ModeloCoeficientePais("ifaroe", 92, 1, true));
        this.YW.add(new ModeloCoeficientePais("kos", 110, 1, true));
        this.YW.add(new ModeloCoeficientePais("gib", 216, 1, true));
        this.YW.add(new ModeloCoeficientePais("mnt", 105, 1, true));
        this.YW.add(new ModeloCoeficientePais("wal", 145, 1, true));
        this.YW.add(new ModeloCoeficientePais("isl", 102, 1, true));
        this.YW.add(new ModeloCoeficientePais("est", 66, 1, true));
        this.YW.add(new ModeloCoeficientePais("andorra", 4, 1, true));
        this.YW.add(new ModeloCoeficientePais("san m", 164, 1, true));
        this.YW.add(new ModeloCoeficientePais("pol", 152, 1));
        this.YW.add(new ModeloCoeficientePais("esl", 64, 1));
        this.YW.add(new ModeloCoeficientePais("esk", 63, 1));
        this.YW.add(new ModeloCoeficientePais("lit", 119, 1));
        this.YW.add(new ModeloCoeficientePais("lux", 120, 1));
        this.YW.add(new ModeloCoeficientePais("bos", 27, 1));
        this.YW.add(new ModeloCoeficientePais("irl", 100, 1));
        this.YW.add(new ModeloCoeficientePais("mac", 122, 1));
        this.YW.add(new ModeloCoeficientePais("arm", 12, 1));
        this.YW.add(new ModeloCoeficientePais("let", 114, 1));
        this.YW.add(new ModeloCoeficientePais("alb", 2, 1));
        this.YW.add(new ModeloCoeficientePais("irlN", 101, 1));
        this.YW.add(new ModeloCoeficientePais("geo", 76, 1));
        this.YW.add(new ModeloCoeficientePais("fin", 70, 1));
        this.YW.add(new ModeloCoeficientePais("mol", 134, 1));
        this.YW.add(new ModeloCoeficientePais("mlt", 128, 1));
        this.YW.add(new ModeloCoeficientePais("ifaroe", 92, 1));
        this.YW.add(new ModeloCoeficientePais("kos", 110, 1));
        this.YW.add(new ModeloCoeficientePais("gib", 216, 1));
        this.YW.add(new ModeloCoeficientePais("mnt", 105, 1));
        this.YW.add(new ModeloCoeficientePais("wal", 145, 1));
        this.YW.add(new ModeloCoeficientePais("isl", 102, 1));
        this.YW.add(new ModeloCoeficientePais("est", 66, 1));
        this.YW.add(new ModeloCoeficientePais("andorra", 4, 1));
        this.YW.add(new ModeloCoeficientePais("san m", 164, 1));
        this.YW.add(new ModeloCoeficientePais("belarus", 25, 1));
        this.YW.add(new ModeloCoeficientePais("pol", 152, 1));
        this.YW.add(new ModeloCoeficientePais("esl", 64, 1));
        this.YW.add(new ModeloCoeficientePais("esk", 63, 1));
        this.YW.add(new ModeloCoeficientePais("lit", 119, 1));
        this.YW.add(new ModeloCoeficientePais("lux", 120, 1));
        this.YW.add(new ModeloCoeficientePais("bos", 27, 1));
        this.YW.add(new ModeloCoeficientePais("irl", 100, 1));
        this.YW.add(new ModeloCoeficientePais("mac", 122, 1));
        this.YW.add(new ModeloCoeficientePais("arm", 12, 1));
        this.YW.add(new ModeloCoeficientePais("let", 114, 1));
        this.YW.add(new ModeloCoeficientePais("alb", 2, 1));
        this.YW.add(new ModeloCoeficientePais("irlN", 101, 1));
        this.YW.add(new ModeloCoeficientePais("geo", 76, 1));
        this.YW.add(new ModeloCoeficientePais("fin", 70, 1));
        this.YW.add(new ModeloCoeficientePais("mol", 134, 1));
        this.YW.add(new ModeloCoeficientePais("mlt", 128, 1));
        this.YW.add(new ModeloCoeficientePais("ifaroe", 92, 1));
        this.YW.add(new ModeloCoeficientePais("kos", 110, 1));
        this.YW.add(new ModeloCoeficientePais("gib", 216, 1));
        this.YW.add(new ModeloCoeficientePais("mnt", 105, 1));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(0, 3, this.YV, this.YW, n2, al2);
    }

    private void Bd() {
        ((ModeloCoeficientePais)this.YW.get(40)).fE(162);
        ((ModeloCoeficientePais)this.YW.get(87)).fE(162);
    }

    public void yq() {
        if (GerenciadorJogo.SR.H() == 3) {
            this.Bd();
        }
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YS.clear();
        this.ZE.clear();
        this.YD = null;
        this.YP = null;
        this.YQ = null;
        this.YR = null;
        this.ZB = null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(GerenciadorJogo.SR.aI().yy());
        arrayList.addAll(GerenciadorJogo.SR.aI().yE());
        arrayList.addAll(GerenciadorJogo.SR.aK().yy());
        arrayList.addAll(GerenciadorJogo.SR.aK().yE());
        ArrayList<ModeloCoeficientePais> arrayList2 = new ArrayList<ModeloCoeficientePais>();
        arrayList2.add(new ModeloCoeficientePais("ing", 97, 1));
        arrayList2.add(new ModeloCoeficientePais("esp", 65, 1));
        arrayList2.add(new ModeloCoeficientePais("ita", 104, 1));
        arrayList2.add(new ModeloCoeficientePais("ale", 3, 1));
        SorteioAdversarios.a(arrayList2, this.YF, arrayList, false);
        arrayList.addAll(this.YF);
        SorteioAdversarios.a(this.YW, this.YS, arrayList, false);
        if (this.YS.size() < 134) {
            SorteioAdversarios.a(this.YS, this.YW, 134, arrayList);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        if (this.YS.size() == 134) {
            ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
            for (int i2 = 74; i2 <= 133; ++i2) {
                arrayList3.add((ModeloTime)this.YS.get(i2));
            }
            Collections.shuffle(arrayList3);
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            boolean[] blArray2 = blArray;
            this.YP = new ChaveMataMata(null, 60, this.b(), 1, blArray2, this, 12001);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.YP, arrayList3, 0, blArray2[0], 0, 0, this.b(), false);
        } else {
            System.out.println("erro Conference League():" + this.YS.size());
        }
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 12001);
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 7; ++n4) {
            arrayList3.add((ModeloTime)this.ZE.get(n4));
        }
        for (n4 = 8; n4 <= 15; ++n4) {
            arrayList4.add((ModeloTime)this.ZE.get(n4));
        }
        for (n4 = 14; n4 <= 58; ++n4) {
            arrayList5.add((ModeloTime)this.YS.get(n4));
        }
        for (n4 = 59; n4 <= 73; ++n4) {
            arrayList6.add((ModeloTime)this.YS.get(n4));
        }
        arrayList6.addAll(arrayList);
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[8];
        for (n3 = 0; n3 <= 7; ++n3) {
            aqArray[n3] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n3 = 0; n3 <= 7; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.GrupoSorteioSemMesmoPais[] aqArray2 = new components.GrupoSorteioSemMesmoPais[45];
        for (n2 = 0; n2 <= 44; ++n2) {
            aqArray2[n2] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n2 = 0; n2 <= 44; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 7; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 44; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.YQ = new ChaveMataMata(null, arrayList7.size(), this.b(), 1, blArray2, this, 12002);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YQ, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void h(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 12002);
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList3.add((ModeloTime)arrayList.get(n4));
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            arrayList4.add((ModeloTime)arrayList.get(n4));
        }
        arrayList4.add((ModeloTime)this.ZE.get(16));
        arrayList4.add((ModeloTime)this.ZE.get(17));
        for (n4 = 5; n4 <= 13; ++n4) {
            arrayList5.add((ModeloTime)this.YS.get(n4));
        }
        for (n4 = 8; n4 <= 25; ++n4) {
            arrayList5.add((ModeloTime)arrayList.get(n4));
        }
        for (n4 = 26; n4 <= 52; ++n4) {
            arrayList6.add((ModeloTime)arrayList.get(n4));
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[5];
        for (n3 = 0; n3 <= 4; ++n3) {
            aqArray[n3] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.GrupoSorteioSemMesmoPais[] aqArray2 = new components.GrupoSorteioSemMesmoPais[27];
        for (n2 = 0; n2 <= 26; ++n2) {
            aqArray2[n2] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 4; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.YR = new ChaveMataMata(null, arrayList7.size(), this.b(), 1, blArray2, this, 12003);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YR, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void j(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 12003);
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList3.add((ModeloTime)arrayList.get(n4));
        }
        for (n4 = 18; n4 <= 22; ++n4) {
            arrayList4.add((ModeloTime)this.ZE.get(n4));
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList5.add((ModeloTime)this.YS.get(n4));
        }
        for (n4 = 5; n4 <= 16; ++n4) {
            arrayList5.add((ModeloTime)arrayList.get(n4));
        }
        for (n4 = 17; n4 <= 31; ++n4) {
            arrayList6.add((ModeloTime)arrayList.get(n4));
        }
        for (n4 = 23; n4 <= 24; ++n4) {
            arrayList6.add((ModeloTime)this.ZE.get(n4));
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[5];
        for (n3 = 0; n3 <= 4; ++n3) {
            aqArray[n3] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.GrupoSorteioSemMesmoPais[] aqArray2 = new components.GrupoSorteioSemMesmoPais[17];
        for (n2 = 0; n2 <= 16; ++n2) {
            aqArray2[n2] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n2 = 0; n2 <= 16; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 4; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 16; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.ZB = new ChaveMataMata(null, arrayList7.size(), this.b(), 1, blArray2, this, 12004);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.ZB, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void m(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 12004);
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        for (n2 = 25; n2 <= 34; ++n2) {
            arrayList3.add((ModeloTime)this.ZE.get(n2));
        }
        arrayList3.addAll(arrayList);
        for (n2 = 0; n2 < this.YF.size(); ++n2) {
            arrayList3.add((ModeloTime)this.YF.get(n2));
        }
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abm);
        if (arrayList3.size() >= 36) {
            ArrayList arrayList4 = new ArrayList(arrayList3.subList(0, 36));
            this.YD = LigaSuica.criar(this, arrayList4, 6, this.b(), 12005, this.getNome());
        } else {
            System.out.println("erro fase de liga " + this.getNome() + ": " + arrayList3.size() + " clubes");
        }
    }

    public void Be() {
        ArrayList arrayList = LigaSuica.classificacao(this.YD);
        this.cabecas = new ArrayList(arrayList.subList(0, 8));
        for (int i2 = 24; i2 < arrayList.size(); ++i2) {
            ((ModeloTime)arrayList.get(i2)).a(this, -1, 12005);
        }
        this.confrontos = new ArrayList();
        ArrayList arrayList2 = LigaSuica.playoff(arrayList, this.confrontos);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.YD.c(new ChaveMataMata(this.YD, arrayList2.size(), this.b(), 1, blArray, this, 12006));
        new GeradorChaveMataMata().a(this.YD.yY(), arrayList2, 0, true, 0, 0, this.b(), false);
    }

    public void l(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 12006);
        }
        ArrayList arrayList3 = LigaSuica.oitavas(this.cabecas, this.confrontos, arrayList);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.afT = new ChaveMataMata(null, arrayList3.size(), this.b(), 0, blArray, this, -1);
        new GeradorChaveMataMata().a(this.afT, arrayList3, 0, true, 0, 0, this.b(), false);
    }

    public void b(ArrayList arrayList, int n2) {
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((ModeloTime)arrayList.get(i2)).jZ().booleanValue()) continue;
            if (n2 == 0) {
                new ModeloRegistroJogador(((ModeloTime)arrayList.get(i2)).ka(), 35, 90, "", "");
                continue;
            }
            new ModeloRegistroJogador(((ModeloTime)arrayList.get(i2)).ka(), 35, 90, "", "");
        }
    }

    @Override
    public void mr() {
        this.YD.f(this.afT);
    }

    @Override
    public LigaNacional mF() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        int[] nArray = new int[]{152, 65, 52, 31, 21, 154, 3, 72, 162, 97};
        if ((n2 %= 10) < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public static String yD() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        String string = "";
        String[] stringArray = new String[]{"Gdansk", "Sevilla", "Zagreb", "Sofia", "Bruxelas", "Porto", "Frankfurt", "Lyon", "Moscou", "Liverpool"};
        string = stringArray[n2 %= 10];
        return string;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YP, this.YQ, this.YR, this.ZB};
            l_0Array = l_0Array2;
        } else if (this.YD.yY() != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY(), this.afT};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YP, this.YQ, this.YR, this.ZB};
        arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase de Liga"));
        if (this.YD != null && this.YD.yY() != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY(), this.afT};
            arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
        } else {
            arrayList.add(new ItemFormacao(null, "Fase Final"));
        }
        return arrayList;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.YP) {
            return ConstantesJogo.abZ;
        }
        if (l_02 == this.YQ) {
            return ConstantesJogo.aca;
        }
        if (l_02 == this.YR) {
            return ConstantesJogo.acb;
        }
        if (l_02 == this.ZB) {
            return ConstantesJogo.acc;
        }
        if (this.YD != null && l_02 == this.YD.yY()) {
            return ConstantesJogo.abY;
        }
        return ConstantesJogo.pA;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_conference";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public ArrayList zo() {
        return this.ZE;
    }

    @Override
    public boolean cz(int n2) {
        return this.afT != null && this.afT.zq() == n2;
    }
}

