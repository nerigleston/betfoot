package nucleo;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class GeradorPropostaSelecao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList Jg = new ArrayList();
    private ArrayList Jh = new ArrayList();
    private ArrayList Jj = new ArrayList();
    private ArrayList Jl = new ArrayList();

    public void L(ArrayList arrayList) {
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (!((ModeloTime)arrayList.get(n2)).jZ().booleanValue()) {
                this.d(this.Jg, ((ModeloTime)arrayList.get(n2)).getPais());
                this.d(this.Jh, ((ModeloTime)arrayList.get(n2)).getPais());
            }
            ++n2;
        }
        Collections.shuffle(this.Jh);
    }

    public void zi() {
        this.Jg.clear();
        this.Jh.clear();
        this.Jj.clear();
        this.Jl.clear();
    }

    public ArrayList a(Campeonato al2, boolean bl) {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.Jg.size()) {
            ModeloTime ah2 = GerenciadorJogo.SR.s((Integer)this.Jg.get(n2)).jn();
            if (ah2 != null && !ah2.jZ().booleanValue()) {
                arrayList.add(ah2);
            }
            ++n2;
        }
        Collections.shuffle(arrayList);
        if (arrayList.size() > 0) {
            int n3;
            arrayList2.add(0);
            arrayList2.add(1);
            arrayList2.add(3);
            arrayList2.add(2);
            arrayList2.add(4);
            arrayList2.add(5);
            int[][] nArrayArray = new int[][]{{2, 1, 1, 1, 1}, {2, 2, 1, 1, 1}, {3, 2, 2, 1, 1}, {4, 3, 2, 2, 1}, {5, 4, 5, 3, 2}, {5, 4, 4, 3, 2}};
            int n4 = al2.getReputacao();
            if (al2.fg() != null && al2.fg().getReputacao() > n4) {
                n4 = al2.fg().getReputacao();
            }
            int[] nArray = nArrayArray[n4];
            boolean bl2 = false;
            int n5 = 0;
            while (n5 < 2) {
                int n6;
                int n7 = 0;
                n3 = 0;
                while (n3 < nArray.length) {
                    if (nArray[n3] >= 1) {
                        n6 = 0;
                        while (n6 < arrayList.size()) {
                            if (((ModeloTime)arrayList.get(n6)).getReputacao() == nArray[n3] && ((ModeloTime)arrayList.get(n6)).gg() == ((Integer)arrayList2.get(n7)).intValue() && !arrayList3.contains(arrayList.get(n6))) {
                                if ((Integer)arrayList2.get(n7) == 5 && !bl2) {
                                    arrayList3.add((ModeloTime)arrayList.get(n6));
                                    bl2 = true;
                                } else if ((Integer)arrayList2.get(n7) != 5) {
                                    arrayList3.add((ModeloTime)arrayList.get(n6));
                                }
                                if (n7 + 1 < arrayList2.size()) {
                                    ++n7;
                                    break;
                                }
                                n7 = 0;
                                break;
                            }
                            ++n6;
                        }
                    }
                    ++n3;
                }
                if (arrayList3.size() < nArray.length) {
                    n3 = 0;
                    while (n3 < nArray.length) {
                        if (nArray[n3] >= 1 && arrayList3.size() < nArray.length) {
                            n6 = 0;
                            while (n6 < arrayList.size()) {
                                if (((ModeloTime)arrayList.get(n6)).getReputacao() == nArray[n3] && !arrayList3.contains(arrayList.get(n6))) {
                                    if (((ModeloTime)arrayList.get(n6)).gg() == 5 && !bl2) {
                                        arrayList3.add((ModeloTime)arrayList.get(n6));
                                        bl2 = true;
                                        break;
                                    }
                                    if (((ModeloTime)arrayList.get(n6)).gg() == 5) break;
                                    arrayList3.add((ModeloTime)arrayList.get(n6));
                                    break;
                                }
                                ++n6;
                            }
                        }
                        ++n3;
                    }
                }
                ++n5;
            }
            n5 = -1;
            Campeonato al3 = null;
            n3 = 0;
            if (n3 < GerenciadorJogo.SR.M().size()) {
                n5 = ((Campeonato)GerenciadorJogo.SR.M().get(n3)).lE();
                al3 = (Campeonato)GerenciadorJogo.SR.M().get(n3);
            }
            if (n5 >= 0) {
                n3 = 0;
                ModeloTime ah3 = null;
                int n8 = 0;
                while (n8 < arrayList.size()) {
                    if (((ModeloTime)arrayList.get(n8)).getPais() == n5 && !((ModeloTime)arrayList.get(n8)).jZ().booleanValue() && !arrayList3.contains(arrayList.get(n8))) {
                        ah3 = (ModeloTime)arrayList.get(n8);
                        if (((ModeloTime)arrayList.get(n8)).getNivel() < 18) {
                            n3 = 1;
                        } else if (al3 != null && al3.fg() != null && al3.fg().getReputacao() >= 3) {
                            n3 = 1;
                        }
                    }
                    ++n8;
                }
                if (n3 != 0) {
                    if (arrayList3.size() == 0) {
                        arrayList3.add(ah3);
                    } else {
                        arrayList3.set(arrayList3.size() - 1, ah3);
                    }
                }
            }
        }
        return arrayList3;
    }

    public void d(ArrayList arrayList, int n2) {
        if (!arrayList.contains(n2)) {
            arrayList.add(n2);
        }
    }

    public void zj() {
        this.Jl.clear();
        int n2 = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.N().size()) {
            int n4 = 0;
            while (n4 < ((LigaNacional)GerenciadorJogo.SR.N().get(n3)).eb().size()) {
                arrayList.clear();
                if (((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n3)).eb().get(n4)).yi().yK().size() > 0) {
                    n2 = Math.round(((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n3)).eb().get(n4)).yi().yK().size() / 2);
                }
                int n5 = n2;
                while (n5 < ((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n3)).eb().get(n4)).yi().yK().size()) {
                    arrayList.add(((ModeloTime)((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n3)).eb().get(n4)).yi().yK().get(n5)).lk());
                    ++n5;
                }
                this.M(arrayList);
                ++n4;
            }
            ++n3;
        }
        Collections.shuffle(this.Jl);
    }

    private void M(ArrayList arrayList) {
        Collections.shuffle(arrayList);
        int n2 = 0;
        while (n2 <= 2) {
            if (n2 < arrayList.size()) {
                this.Jl.add((Integer)arrayList.get(n2));
            }
            ++n2;
        }
    }

    public ArrayList b(Campeonato al2, boolean bl) {
        ArrayList arrayList = new ArrayList();
        LigaNacional z2 = GerenciadorJogo.SR.o(al2.lE());
        LigaNacional z3 = GerenciadorJogo.SR.s(al2.bz());
        if (z3 != null) {
            z3.a(arrayList, al2, bl, true);
        }
        if (z2 != null && z2 != z3) {
            z2.a(arrayList, al2, bl, false);
        }
        boolean bl2 = false;
        if (al2.jZ().booleanValue() && (al2.lG() < 2 || al2.getReputacao() > 3)) {
            bl2 = true;
        }
        if (bl2) {
            ArrayList<LigaNacional> arrayList2 = new ArrayList<LigaNacional>();
            if (GerenciadorJogo.SR.N().size() > 0) {
                int n2 = 0;
                while (n2 < GerenciadorJogo.SR.N().size()) {
                    if (GerenciadorJogo.SR.N().get(n2) != z3 && GerenciadorJogo.SR.N().get(n2) != z2) {
                        arrayList2.add((LigaNacional)GerenciadorJogo.SR.N().get(n2));
                    }
                    ++n2;
                }
                if (arrayList2.size() > 0) {
                    Collections.shuffle(arrayList2);
                    n2 = 0;
                    while (n2 < arrayList2.size()) {
                        ((LigaNacional)arrayList2.get(n2)).a(arrayList, al2, bl, false);
                        if (arrayList.size() > 6) break;
                        ++n2;
                    }
                }
            }
        }
        return arrayList;
    }

    public void zw() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.M().size()) {
            ArrayList arrayList;
            if (((Campeonato)GerenciadorJogo.SR.M().get(n2)).jZ().booleanValue() && ((Campeonato)GerenciadorJogo.SR.M().get(n2)).fg() != null && (arrayList = this.b((Campeonato)GerenciadorJogo.SR.M().get(n2), true)) != null && arrayList.size() > 0) {
                GerenciadorTelas.a(arrayList, (Campeonato)GerenciadorJogo.SR.M().get(n2), 0);
            }
            ++n2;
        }
    }

    public static ArrayList c(Campeonato al2, boolean bl) {
        Object object;
        int n2;
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
        boolean bl2 = false;
        boolean bl3 = false;
        if (GerenciadorJogo.SR.ca() - 1 == GerenciadorJogo.SR.H()) {
            bl3 = true;
            LigaPontosCorridos[] sArray = new LigaPontosCorridos[6];
            if (GerenciadorJogo.SR.bK() != null) {
                sArray[1] = GerenciadorJogo.SR.bK().yd();
            }
            if (GerenciadorJogo.SR.bM() != null) {
                sArray[2] = GerenciadorJogo.SR.bM().yd();
            }
            if (GerenciadorJogo.SR.bQ() != null) {
                sArray[3] = GerenciadorJogo.SR.bQ().yd();
            }
            if (GerenciadorJogo.SR.bS() != null) {
                sArray[5] = GerenciadorJogo.SR.bS().yd();
            }
            int n3 = 0;
            while (n3 < sArray.length) {
                if (sArray[n3] != null) {
                    n2 = 0;
                    while (n2 < sArray[n3].yK().size()) {
                        if (!((ModeloTime)sArray[n3].yK().get(n2)).jZ().booleanValue()) {
                            arrayList2.add((ModeloTime)sArray[n3].yK().get(n2));
                        }
                        ++n2;
                    }
                }
                ++n3;
            }
        }
        if (GerenciadorJogo.SR.aY() != null && GerenciadorJogo.SR.aY().yd() != null) {
            int n4 = 0;
            while (n4 < GerenciadorJogo.SR.aY().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.aY().yd().yK().get(n4)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.aY().yd().yK().get(n4));
                }
                ++n4;
            }
            bl2 = true;
        }
        if (GerenciadorJogo.SR.ba() != null && GerenciadorJogo.SR.ba().yd() != null) {
            int n5 = 0;
            while (n5 < GerenciadorJogo.SR.ba().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.ba().yd().yK().get(n5)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.ba().yd().yK().get(n5));
                }
                ++n5;
            }
            arrayList4.add(0);
        }
        if (GerenciadorJogo.SR.aZ() != null && GerenciadorJogo.SR.aZ().yd() != null) {
            int n6 = 0;
            while (n6 < GerenciadorJogo.SR.aZ().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.aZ().yd().yK().get(n6)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.aZ().yd().yK().get(n6));
                }
                ++n6;
            }
            arrayList4.add(1);
        }
        if (GerenciadorJogo.SR.be() != null && GerenciadorJogo.SR.be().yd() != null) {
            int n7 = 0;
            while (n7 < GerenciadorJogo.SR.be().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.be().yd().yK().get(n7)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.be().yd().yK().get(n7));
                }
                ++n7;
            }
            arrayList4.add(2);
        }
        if (GerenciadorJogo.SR.bf() != null && GerenciadorJogo.SR.bf().yd() != null) {
            int n8 = 0;
            while (n8 < GerenciadorJogo.SR.bf().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.bf().yd().yK().get(n8)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.bf().yd().yK().get(n8));
                }
                ++n8;
            }
            arrayList4.add(3);
        }
        if (GerenciadorJogo.SR.bX() != null && GerenciadorJogo.SR.bX().yd() != null) {
            int n9 = 0;
            while (n9 < GerenciadorJogo.SR.bX().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.bX().yd().yK().get(n9)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.bX().yd().yK().get(n9));
                }
                ++n9;
            }
            arrayList4.add(5);
        }
        if (GerenciadorJogo.SR.bg() != null && GerenciadorJogo.SR.bg().yd() != null) {
            int n10 = 0;
            while (n10 < GerenciadorJogo.SR.bg().yd().yK().size()) {
                if (!((ModeloTime)GerenciadorJogo.SR.bg().yd().yK().get(n10)).jZ().booleanValue()) {
                    arrayList2.add((ModeloTime)GerenciadorJogo.SR.bg().yd().yK().get(n10));
                }
                ++n10;
            }
            arrayList4.add(4);
        }
        if (arrayList2.size() > 0) {
            int n11;
            int n12;
            Collections.shuffle(arrayList2);
            int[][] nArrayArray2 = new int[][]{{2, 1, 1, -1, -1}, {2, 2, 1, 1, 1}, {3, 2, 2, 1, 1}, {4, 3, 2, 2, 1}, {5, 4, 5, 3, 2}, {5, 4, 4, 3, 2}};
            int[][] nArrayArray = new int[][]{{-1, -1, -1, -1, -1}, {2, 2, 1, 1, 1, 1}, {2, 2, 1, 1, 1, 1}, {4, 3, 2, 2, 2, 1}, {5, 4, 4, 3, 2, 1}, {5, 5, 4, 4, 3, 2}};
            n2 = al2.getReputacao();
            if (al2.fg() != null && al2.fg().getReputacao() > n2) {
                n2 = al2.fg().getReputacao();
            }
            int[] nArray3 = nArrayArray2[n2];
            if (bl3) {
                nArray3 = nArrayArray[n2];
                int[] nArray = new int[]{12, 7, 7, 8, 10, 10};
                int[] nArray2 = new int[6];
                LigaNacional z2 = GerenciadorJogo.SR.s(al2.lE());
                n12 = z2.gg();
                if (al2.fg() != null) {
                    if (al2.fg().gg() == 0) {
                        nArray[0] = 12;
                        nArray[0] = 7;
                    } else if (al2.fg().gg() == 1) {
                        nArray[0] = 9;
                        nArray[1] = 10;
                    }
                }
                n11 = 0;
                while (n11 < arrayList2.size()) {
                    if (nArray2[((ModeloTime)arrayList2.get(n11)).gg()] < nArray[((ModeloTime)arrayList2.get(n11)).gg()] && !arrayList3.contains(arrayList2.get(n11))) {
                        arrayList3.add((ModeloTime)arrayList2.get(n11));
                        int n13 = ((ModeloTime)arrayList2.get(n11)).gg();
                        nArray2[n13] = nArray2[n13] + 1;
                    }
                    if (n12 == ((ModeloTime)arrayList2.get(n11)).gg() && ((ModeloTime)arrayList2.get(n11)).getReputacao() >= 4 && !arrayList3.contains(arrayList2.get(n11))) {
                        arrayList3.add((ModeloTime)arrayList2.get(n11));
                    }
                    ++n11;
                }
                if (arrayList3.size() > 0) {
                    arrayList2 = arrayList3;
                }
            }
            if (bl2 || bl3 || arrayList4.size() <= 0) {
                if (arrayList2.size() > 0) {
                    int n14 = 0;
                    while (n14 < nArray3.length) {
                        if (nArray3[n14] >= 1) {
                            int n15 = 0;
                            while (n15 < arrayList2.size()) {
                                if (((ModeloTime)arrayList2.get(n15)).getReputacao() == nArray3[n14] && !arrayList.contains(arrayList2.get(n15))) {
                                    arrayList.add((ModeloTime)arrayList2.get(n15));
                                    break;
                                }
                                ++n15;
                            }
                        }
                        ++n14;
                    }
                }
            } else if (arrayList2.size() > 0) {
                boolean bl4 = false;
                int n16 = 0;
                while (n16 < 2) {
                    int n17 = 0;
                    n12 = 0;
                    while (n12 < nArray3.length) {
                        if (nArray3[n12] >= 1) {
                            n11 = 0;
                            while (n11 < arrayList2.size()) {
                                if (((ModeloTime)arrayList2.get(n11)).getReputacao() == nArray3[n12] && ((ModeloTime)arrayList2.get(n11)).gg() == ((Integer)arrayList4.get(n17)).intValue() && !arrayList.contains(arrayList2.get(n11))) {
                                    if ((Integer)arrayList4.get(n17) == 5 && !bl4) {
                                        arrayList.add((ModeloTime)arrayList2.get(n11));
                                        bl4 = true;
                                    } else if ((Integer)arrayList4.get(n17) != 5) {
                                        arrayList.add((ModeloTime)arrayList2.get(n11));
                                    }
                                    if (n17 + 1 < arrayList4.size()) {
                                        ++n17;
                                        break;
                                    }
                                    n17 = 0;
                                    break;
                                }
                                ++n11;
                            }
                        }
                        ++n12;
                    }
                    ++n16;
                }
                if (arrayList.size() < nArray3.length) {
                    n16 = 0;
                    while (n16 < nArray3.length) {
                        if (nArray3[n16] >= 1 && arrayList.size() < nArray3.length) {
                            int n18 = 0;
                            while (n18 < arrayList2.size()) {
                                if (((ModeloTime)arrayList2.get(n18)).getReputacao() == nArray3[n16] && !arrayList.contains(arrayList2.get(n18))) {
                                    if (((ModeloTime)arrayList2.get(n18)).gg() == 5 && !bl4) {
                                        arrayList.add((ModeloTime)arrayList2.get(n18));
                                        bl4 = true;
                                        break;
                                    }
                                    if (((ModeloTime)arrayList2.get(n18)).gg() == 5) break;
                                    arrayList.add((ModeloTime)arrayList2.get(n18));
                                    break;
                                }
                                ++n18;
                            }
                        }
                        ++n16;
                    }
                }
            }
        }
        int n19 = -1;
        Campeonato al3 = null;
        n2 = 0;
        if (n2 < GerenciadorJogo.SR.M().size()) {
            n19 = ((Campeonato)GerenciadorJogo.SR.M().get(n2)).lE();
            al3 = (Campeonato)GerenciadorJogo.SR.M().get(n2);
        }
        if (n19 >= 0) {
            n2 = 0;
            object = null;
            int n20 = 0;
            while (n20 < arrayList2.size()) {
                if (((ModeloTime)arrayList2.get(n20)).getPais() == n19 && !((ModeloTime)arrayList2.get(n20)).jZ().booleanValue() && !arrayList.contains(arrayList2.get(n20))) {
                    object = (ModeloTime)arrayList2.get(n20);
                    if (((ModeloTime)arrayList2.get(n20)).getNivel() < 18) {
                        n2 = 1;
                    } else if (al3 != null && al3.fg() != null && al3.fg().getReputacao() >= 3) {
                        n2 = 1;
                    }
                }
                ++n20;
            }
            if (n2 != 0) {
                if (arrayList.size() == 0) {
                    arrayList.add((ModeloTime)object);
                } else {
                    arrayList.set(arrayList.size() - 1, (ModeloTime)object);
                }
            }
        }
        System.out.println("cria proposta selecao:" + arrayList.size());
        return arrayList;
    }

    public ArrayList Ap() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.Jl.size()) {
            ModeloTime ah2 = GerenciadorJogo.SR.x((Integer)this.Jl.get(n2));
            if (ah2 != null && !ah2.jZ().booleanValue()) {
                arrayList.add(ah2);
            }
            ++n2;
        }
        return arrayList;
    }

    public ArrayList Aq() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.Jh.size()) {
            ModeloTime ah2 = GerenciadorJogo.SR.s((Integer)this.Jh.get(n2)).jn();
            if (ah2 != null && !ah2.jZ().booleanValue()) {
                arrayList.add(ah2);
            }
            ++n2;
        }
        return arrayList;
    }
}

