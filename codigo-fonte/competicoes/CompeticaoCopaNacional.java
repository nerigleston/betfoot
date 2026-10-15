package competicoes;

import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.DadosPais;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ModeloRegistroJogador;
import components.ListaTimesPoteCopaNacional;
import competicoes.GeradorChaveMataMata;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoCopaNacional
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaNacional KR;
    private ChaveMataMata YI = null;
    private int nTimes = -1;
    private ArrayList afU = new ArrayList();

    public CompeticaoCopaNacional() {
    }

    public CompeticaoCopaNacional(LigaNacional z2) {
        this.KR = z2;
        this.F(2, z2.gg());
        this.setNome("Copa " + DadosPais.bq(z2.jc()) + " " + z2.jf());
        this.nTimes = this.nTimes;
    }

    public void a(CompeticaoCopaNacional f_02, ArrayList arrayList, boolean[] blArray) {
        int n2 = arrayList.size();
        if (n2 >= 8) {
            int n3 = 0;
            ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
            ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
            ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
            if (n2 >= 128) {
                n3 = 128;
            } else if (n2 >= 64) {
                n3 = 64;
            } else if (n2 >= 32) {
                n3 = 32;
            } else if (n2 >= 16) {
                n3 = 16;
            } else if (n2 >= 8) {
                n3 = 8;
            }
            this.nTimes = n3;
            int n4 = 0;
            while (n4 < n3 / 2) {
                arrayList3.add((ModeloTime)arrayList.get(n4));
                arrayList4.add((ModeloTime)arrayList.get(n3 / 2 + n4));
                ++n4;
            }
            Collections.shuffle(arrayList3);
            Collections.shuffle(arrayList4);
            n4 = 0;
            while (n4 < arrayList3.size()) {
                arrayList2.add((ModeloTime)arrayList4.get(n4));
                arrayList2.add((ModeloTime)arrayList3.get(n4));
                ++n4;
            }
            ChaveMataMata z2 = new ChaveMataMata(null, arrayList2.size(), 2, 0, blArray, f_02, -1);
            this.b(z2);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(z2, arrayList2, 0, true, 0, 0, 2, false);
        }
    }

    public void b(CompeticaoCopaNacional f_02, ArrayList arrayList, boolean[] blArray) {
        int n2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (this.afU.size() < 12) {
            this.afU.clear();
            if (GerenciadorJogo.SR.isJogaIntClubes() && GerenciadorJogo.SR.aF() != null) {
                if (GerenciadorJogo.SR.aF().yy() != null) {
                    n2 = 0;
                    while (n2 < GerenciadorJogo.SR.aF().yy().size()) {
                        if (((ModeloTime)GerenciadorJogo.SR.aF().yy().get(n2)).getPais() == 29) {
                            this.afU.add((ModeloTime)GerenciadorJogo.SR.aF().yy().get(n2));
                        }
                        ++n2;
                    }
                }
                if (GerenciadorJogo.SR.aF().yB() != null) {
                    n2 = 0;
                    while (n2 < GerenciadorJogo.SR.aF().yB().size()) {
                        if (((ModeloTime)GerenciadorJogo.SR.aF().yB().get(n2)).getPais() == 29) {
                            this.afU.add((ModeloTime)GerenciadorJogo.SR.aF().yB().get(n2));
                        }
                        ++n2;
                    }
                }
            }
            n2 = 0;
            while (n2 <= 12) {
                if (!this.afU.contains(arrayList2.get(n2))) {
                    this.afU.add((ModeloTime)arrayList2.get(n2));
                }
                ++n2;
            }
            this.Bg();
            this.Bf();
        } else {
            this.Bg();
            this.Bf();
        }
        if (this.afU.size() == 12) {
            n2 = 0;
            while (n2 <= 11) {
                arrayList2.remove(this.afU.get(n2));
                ++n2;
            }
            this.Bh();
            ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
            ListaTimesPoteCopaNacional[] azArray = new ListaTimesPoteCopaNacional[8];
            int[] nArray = new int[]{10, 10, 10, 10, 10, 10, 10, 10};
            int n3 = 0;
            int n4 = 0;
            while (n4 < azArray.length) {
                azArray[n4] = new ListaTimesPoteCopaNacional();
                while (nArray[n4] > 0) {
                    if (azArray[n4].contains(arrayList2.get(n3))) continue;
                    azArray[n4].add((ModeloTime)arrayList2.get(n3));
                    ((ModeloTime)arrayList2.get(n3)).bW(n4);
                    ++n3;
                    int n5 = n4;
                    nArray[n5] = nArray[n5] - 1;
                }
                Collections.shuffle(azArray[n4]);
                ++n4;
            }
            n4 = 1;
            int n6 = 0;
            while (n6 < azArray.length) {
                if (azArray[n6] != null && azArray[n6].size() != 10) {
                    n4 = 0;
                    break;
                }
                ++n6;
            }
            if (n4 != 0) {
                n6 = 0;
                while (n6 < 10) {
                    arrayList3.add((ModeloTime)azArray[4].get(n6));
                    arrayList3.add((ModeloTime)azArray[0].get(n6));
                    arrayList3.add((ModeloTime)azArray[7].get(n6));
                    arrayList3.add((ModeloTime)azArray[3].get(n6));
                    arrayList3.add((ModeloTime)azArray[5].get(n6));
                    arrayList3.add((ModeloTime)azArray[1].get(n6));
                    arrayList3.add((ModeloTime)azArray[6].get(n6));
                    arrayList3.add((ModeloTime)azArray[2].get(n6));
                    ++n6;
                }
                boolean[] blArray2 = new boolean[8];
                blArray2[2] = true;
                blArray2[3] = true;
                blArray2[4] = true;
                blArray2[5] = true;
                blArray2[6] = true;
                blArray2[7] = true;
                boolean[] blArray3 = blArray2;
                ChaveMataMata z2 = new ChaveMataMata(null, arrayList3.size(), 2, 0, blArray3, f_02, 2029);
                this.b(z2);
                GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
                g_02.a(z2, arrayList3, 0, false, 0, 0, 2, false);
                g_02.fb(2129);
            } else {
                this.a(f_02, arrayList, blArray);
            }
        } else {
            this.a(f_02, arrayList, blArray);
        }
    }

    public void ad(ArrayList arrayList) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        Collections.sort(arrayList, ColecaoComparadoresSorteio.abm);
        int n2 = 0;
        while (n2 <= 19) {
            arrayList3.add((ModeloTime)arrayList.get(n2));
            ++n2;
        }
        n2 = 20;
        while (n2 <= 39) {
            arrayList4.add((ModeloTime)arrayList.get(n2));
            ++n2;
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        n2 = 0;
        while (n2 < arrayList3.size()) {
            arrayList2.add((ModeloTime)arrayList4.get(n2));
            arrayList2.add((ModeloTime)arrayList3.get(n2));
            ++n2;
        }
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YI, arrayList2, 1, false, 0, 0, 2, false);
        g_02.fb(2229);
        this.YI.BH();
    }

    public void ao(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.afU);
        if (arrayList2.size() == 32) {
            Collections.sort(arrayList2, ColecaoComparadoresSorteio.abm);
            ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
            ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
            int n2 = 0;
            while (n2 <= 15) {
                arrayList4.add((ModeloTime)arrayList2.get(n2));
                ++n2;
            }
            n2 = 16;
            while (n2 <= 31) {
                arrayList5.add((ModeloTime)arrayList2.get(n2));
                ++n2;
            }
            Collections.shuffle(arrayList4);
            Collections.shuffle(arrayList5);
            n2 = 0;
            while (n2 < arrayList4.size()) {
                arrayList3.add((ModeloTime)arrayList4.get(n2));
                arrayList3.add((ModeloTime)arrayList5.get(n2));
                ++n2;
            }
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.YI, arrayList3, 2, true, 0, 0, 2, false);
            g_02.fb(2329);
            this.YI.BH();
        }
    }

    public void as(ArrayList arrayList) {
        Collections.shuffle(arrayList);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YI, arrayList, 3, true, 0, 0, 2, false);
        g_02.fb(2429);
        this.YI.BH();
    }

    public void at(ArrayList arrayList) {
        Collections.shuffle(arrayList);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YI, arrayList, 4, true, 0, 0, 2, false);
        g_02.fb(2529);
        this.YI.BH();
    }

    public void au(ArrayList arrayList) {
        Collections.shuffle(arrayList);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YI, arrayList, 5, true, 0, 0, 2, false);
        g_02.fb(2629);
        this.YI.BH();
    }

    public void av(ArrayList arrayList) {
        Collections.shuffle(arrayList);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YI, arrayList, 6, true, 0, 0, 2, false);
        g_02.fb(2729);
        this.YI.BH();
    }

    private void Bf() {
        if (this.afU.size() > 12) {
            ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
            int n2 = 0;
            while (n2 <= 11) {
                arrayList.add((ModeloTime)this.afU.get(n2));
                ++n2;
            }
            this.afU.clear();
            n2 = 0;
            while (n2 <= 11) {
                this.afU.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
        }
    }

    private void Bg() {
        if (GerenciadorJogo.SR.isJogaRegionais()) {
            ModeloTime ah2 = null;
            ModeloTime ah3 = null;
            if (GerenciadorJogo.SR.bV()[2] != null) {
                ah2 = GerenciadorJogo.SR.bV()[2].cS();
                this.afU.remove(ah2);
                this.afU.add(0, ah2);
            }
            if (GerenciadorJogo.SR.bV()[3] != null) {
                ah3 = GerenciadorJogo.SR.bV()[3].cS();
                this.afU.remove(ah3);
                this.afU.add(0, ah3);
            }
        }
    }

    public void Bh() {
        String string = "";
        if (this.afU.size() == 12) {
            int n2 = 0;
            while (n2 < this.afU.size()) {
                String string2 = String.valueOf(((ModeloTime)this.afU.get(n2)).getNome()) + ", ";
                if (n2 == 10) {
                    string2 = ((ModeloTime)this.afU.get(n2)).getNome();
                } else if (n2 == 11) {
                    string2 = " e " + ((ModeloTime)this.afU.get(n2)).getNome() + ".";
                }
                string = String.valueOf(string) + string2;
                ++n2;
            }
            n2 = 0;
            while (n2 < GerenciadorJogo.SR.M().size()) {
                if (((Campeonato)GerenciadorJogo.SR.M().get(n2)).fg() != null && ((Campeonato)GerenciadorJogo.SR.M().get(n2)).fg().getPais() == 29) {
                    new ModeloRegistroJogador((Campeonato)GerenciadorJogo.SR.M().get(n2), 23, 75, "", string);
                }
                ++n2;
            }
        }
    }

    public void Bi() {
        this.afU.clear();
    }

    public void W(ModeloTime ah2) {
        if (!this.afU.contains(ah2)) {
            this.afU.add(ah2);
        }
    }

    public ChaveMataMata yf() {
        return this.YI;
    }

    public void b(ChaveMataMata z2) {
        this.YI = z2;
    }

    public int iW() {
        return this.KR.iW();
    }

    public LigaNacional yg() {
        return this.KR;
    }

    @Override
    public void mr() {
        this.YI.z(this);
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YI};
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        return null;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (this.YI.zf() == 2029 && GerenciadorJogo.vM().isNovoFormatoCopa()) {
            return ConstantesJogo.pt;
        }
        return this.YI.zB();
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        String string = "tr_copa_" + EnumPaises.valueOf("P" + Integer.toString(this.KR.jc())).jA();
        String string2 = "tr_copa";
        stringArray[0] = ConstantesJogo.w(string) ? string : string2;
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public int getnTimes() {
        return this.nTimes;
    }

    public String[] yh() {
        if (this.nTimes == 128) {
            return ConstantesJogo.px;
        }
        if (this.nTimes == 64) {
            return ConstantesJogo.py;
        }
        if (this.nTimes == 32) {
            return ConstantesJogo.pz;
        }
        if (this.nTimes == 16) {
            return ConstantesJogo.pA;
        }
        if (this.nTimes == 8) {
            return ConstantesJogo.pB;
        }
        if (this.nTimes == 4) {
            return ConstantesJogo.pC;
        }
        if (this.nTimes == 2) {
            return ConstantesJogo.pD;
        }
        return ConstantesJogo.ps;
    }
}

