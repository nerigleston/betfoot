package f;

import best.I;
import best.a;
import best.ah;
import best.at;
import est.LoadLigaOptions;
import f.s;
import h.a_0;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class LigaSuica {
    private LigaSuica() {
    }

    public static int[][][] tabela(int[] nArray, int n2, Random random) {
        int n3 = nArray.length / n2;
        for (int i2 = 0; i2 < 3000; ++i2) {
            int[][][] nArray2;
            int[][] nArray3;
            boolean bl = i2 < 2500;
            int[][] nArray4 = nArray3 = n2 == 4 ? LigaSuica.adversarios4(random, nArray, bl) : LigaSuica.adversarios6(random, nArray, bl, n3);
            if (nArray3 == null || (nArray2 = LigaSuica.rodadas(nArray3, nArray.length, nArray3.length * 2 / nArray.length, random)) == null) continue;
            return nArray2;
        }
        throw new IllegalStateException("n\u00e3o foi poss\u00edvel montar a fase de liga");
    }

    static int[] permutacao(Random random, int n2) {
        int n3;
        int[] nArray = new int[n2];
        for (n3 = 0; n3 < n2; ++n3) {
            nArray[n3] = n3;
        }
        for (n3 = n2 - 1; n3 > 0; --n3) {
            int n4 = random.nextInt(n3 + 1);
            int n5 = nArray[n3];
            nArray[n3] = nArray[n4];
            nArray[n4] = n5;
        }
        return nArray;
    }

    private static boolean conflito(int[] nArray, boolean bl, int n2, int n3) {
        return bl && nArray[n2] == nArray[n3];
    }

    static int[][] adversarios4(Random random, int[] nArray, boolean bl) {
        int[][] nArrayArray = new int[144][];
        int n2 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3;
            int[] nArray2 = null;
            for (n3 = 0; n3 < 500 && nArray2 == null; ++n3) {
                nArray2 = LigaSuica.permutacao(random, 9);
                for (int i3 = 0; i3 < 9 && nArray2 != null; ++i3) {
                    if (!LigaSuica.conflito(nArray, bl, i2 * 9 + nArray2[i3], i2 * 9 + nArray2[(i3 + 1) % 9])) continue;
                    nArray2 = null;
                }
            }
            if (nArray2 == null) {
                return null;
            }
            for (n3 = 0; n3 < 9; ++n3) {
                nArrayArray[n2++] = new int[]{i2 * 9 + nArray2[n3], i2 * 9 + nArray2[(n3 + 1) % 9]};
            }
            for (n3 = i2 + 1; n3 < 4; ++n3) {
                int n4;
                int[] nArray3 = null;
                int[] nArray4 = null;
                for (n4 = 0; n4 < 2000 && nArray4 == null; ++n4) {
                    nArray3 = LigaSuica.permutacao(random, 9);
                    nArray4 = LigaSuica.permutacao(random, 9);
                    for (int i4 = 0; i4 < 9 && nArray4 != null; ++i4) {
                        if (nArray3[i4] != nArray4[i4] && !LigaSuica.conflito(nArray, bl, i2 * 9 + i4, n3 * 9 + nArray3[i4]) && !LigaSuica.conflito(nArray, bl, i2 * 9 + i4, n3 * 9 + nArray4[i4])) continue;
                        nArray4 = null;
                    }
                }
                if (nArray4 == null) {
                    return null;
                }
                for (n4 = 0; n4 < 9; ++n4) {
                    nArrayArray[n2++] = new int[]{i2 * 9 + n4, n3 * 9 + nArray3[n4]};
                    nArrayArray[n2++] = new int[]{n3 * 9 + nArray4[n4], i2 * 9 + n4};
                }
            }
        }
        return nArrayArray;
    }

    static int[][] adversarios6(Random random, int[] nArray, boolean bl, int n2) {
        int n3;
        int n4;
        int n5 = nArray.length;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        for (int i2 = 0; i2 < 6; ++i2) {
            int[] nArray2 = null;
            for (n4 = 0; n4 < 500 && nArray2 == null; ++n4) {
                nArray2 = LigaSuica.permutacao(random, n2);
                for (int i3 = 0; i3 < n2 && nArray2 != null; i3 += 2) {
                    if (!LigaSuica.conflito(nArray, bl, i2 * n2 + nArray2[i3], i2 * n2 + nArray2[i3 + 1])) continue;
                    nArray2 = null;
                }
            }
            if (nArray2 == null) {
                return null;
            }
            for (n4 = 0; n4 < n2; n4 += 2) {
                arrayList.add(new int[]{i2 * n2 + nArray2[n4], i2 * n2 + nArray2[n4 + 1]});
            }
            for (n4 = i2 + 1; n4 < 6; ++n4) {
                int n6;
                int[] nArray3 = null;
                for (n6 = 0; n6 < 2000 && nArray3 == null; ++n6) {
                    nArray3 = LigaSuica.permutacao(random, n2);
                    for (n3 = 0; n3 < n2 && nArray3 != null; ++n3) {
                        if (!LigaSuica.conflito(nArray, bl, i2 * n2 + n3, n4 * n2 + nArray3[n3])) continue;
                        nArray3 = null;
                    }
                }
                if (nArray3 == null) {
                    return null;
                }
                for (n6 = 0; n6 < n2; ++n6) {
                    arrayList.add(new int[]{i2 * n2 + n6, n4 * n2 + nArray3[n6]});
                }
            }
        }
        List[] listArray = new List[n5];
        for (int i4 = 0; i4 < n5; ++i4) {
            listArray[i4] = new ArrayList();
        }
        boolean[] blArray = new boolean[arrayList.size()];
        for (n4 = 0; n4 < arrayList.size(); ++n4) {
            int[] nArray4 = (int[])arrayList.get(n4);
            listArray[nArray4[0]].add(n4);
            listArray[nArray4[1]].add(n4);
        }
        int[][] nArrayArray = new int[arrayList.size()][];
        int n7 = 0;
        int[] nArray5 = new int[n5];
        for (n3 = 0; n3 < n5; ++n3) {
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
            arrayDeque.push(n3);
            while (!arrayDeque.isEmpty()) {
                int n8 = (Integer)arrayDeque.peek();
                while (nArray5[n8] < listArray[n8].size() && blArray[(Integer)listArray[n8].get(nArray5[n8])]) {
                    int n9 = n8;
                    nArray5[n9] = nArray5[n9] + 1;
                }
                if (nArray5[n8] == listArray[n8].size()) {
                    arrayDeque.pop();
                    continue;
                }
                int n10 = (Integer)listArray[n8].get(nArray5[n8]);
                blArray[n10] = true;
                int[] nArray6 = (int[])arrayList.get(n10);
                int n11 = nArray6[0] == n8 ? nArray6[1] : nArray6[0];
                nArrayArray[n7++] = new int[]{n8, n11};
                arrayDeque.push(n11);
            }
        }
        return nArrayArray;
    }

    static int[][][] rodadas(int[][] nArray, int n2, int n3, Random random) {
        int n4 = n2 / 2;
        boolean[] blArray = new boolean[nArray.length];
        int[][][] nArrayArray = new int[n3][][];
        for (int i2 = 0; i2 < n3; ++i2) {
            int[] nArray2 = new int[n4];
            if (!LigaSuica.emparelhar(nArray, blArray, new boolean[n2], nArray2, 0, random, new int[]{0}, n2)) {
                return null;
            }
            nArrayArray[i2] = new int[n4][];
            for (int i3 = 0; i3 < n4; ++i3) {
                blArray[nArray2[i3]] = true;
                nArrayArray[i2][i3] = nArray[nArray2[i3]];
            }
        }
        return nArrayArray;
    }

    private static boolean emparelhar(int[][] nArray, boolean[] blArray, boolean[] blArray2, int[] nArray2, int n2, Random random, int[] nArray3, int n3) {
        int n4;
        if (n2 == nArray2.length) {
            return true;
        }
        nArray3[0] = nArray3[0] + 1;
        if (nArray3[0] > 20000) {
            return false;
        }
        ArrayList<Integer> arrayList = null;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (blArray2[i2]) continue;
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            for (n4 = 0; n4 < nArray.length; ++n4) {
                if (blArray[n4] || nArray[n4][0] != i2 && nArray[n4][1] != i2 || blArray2[nArray[n4][0]] || blArray2[nArray[n4][1]]) continue;
                arrayList2.add(n4);
            }
            if (arrayList2.isEmpty()) {
                return false;
            }
            if (arrayList != null && arrayList2.size() >= arrayList.size()) continue;
            arrayList = arrayList2;
        }
        Collections.shuffle(arrayList, random);
        for (Object e2 : arrayList) {
            n4 = (Integer)e2;
            blArray2[nArray[n4][1]] = true;
            blArray2[nArray[n4][0]] = true;
            blArray[n4] = true;
            nArray2[n2] = n4;
            boolean bl = LigaSuica.emparelhar(nArray, blArray, blArray2, nArray2, n2 + 1, random, nArray3, n3);
            blArray[n4] = false;
            if (bl) {
                return true;
            }
            blArray2[nArray[n4][1]] = false;
            blArray2[nArray[n4][0]] = false;
        }
        return false;
    }

    public static s criar(at at2, ArrayList arrayList, int n2, int n3, int n4, String string) {
        int[] nArray = new int[arrayList.size()];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = ((ah)arrayList.get(i2)).getPais();
        }
        int[][][] nArray2 = LigaSuica.tabela(nArray, n2, new Random());
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = arrayList.size();
        loadLigaOptions.nGrupos = 0;
        loadLigaOptions.numeroTimesMataMata = 24;
        loadLigaOptions.doisTurnos = false;
        loadLigaOptions.pulaDuasDatas = false;
        loadLigaOptions.duasVoltasMataMata = new boolean[]{true, true, true, false, false, false, false};
        s s2 = new s(loadLigaOptions, new ArrayList(), 0, null, null, null, n3, null, false, null, true, at2);
        s2.fb(n4);
        s2.setNome(string);
        s2.yK().addAll(arrayList);
        ArrayList arrayList2 = a.a(s2.b(), false);
        for (int i3 = 0; i3 < nArray2.length; ++i3) {
            int n5 = (Integer)arrayList2.get(i3);
            for (int i4 = 0; i4 < nArray2[i3].length; ++i4) {
                new I(s2, i3, (ah)arrayList.get(nArray2[i3][i4][0]), (ah)arrayList.get(nArray2[i3][i4][1]), n5, at2, null);
            }
            if (s2.yF().contains(n5)) continue;
            s2.yF().add(n5);
        }
        s2.yH();
        return s2;
    }

    public static ArrayList classificacao(s s2) {
        ArrayList arrayList = new ArrayList(s2.yK());
        Collections.sort(arrayList, a_0.abn);
        return arrayList;
    }

    public static ArrayList playoff(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        arrayList2.clear();
        for (int i2 = 0; i2 < 8; ++i2) {
            ah ah2 = (ah)arrayList.get(8 + i2);
            ah ah3 = (ah)arrayList.get(23 - i2);
            arrayList3.add(ah3);
            arrayList3.add(ah2);
            arrayList2.add(new ah[]{ah3, ah2});
        }
        return arrayList3;
    }

    public static ArrayList perdedores(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        for (Object e2 : arrayList) {
            ah[] ahArray = (ah[])e2;
            arrayList3.add(arrayList2.contains(ahArray[0]) ? ahArray[1] : ahArray[0]);
        }
        return arrayList3;
    }

    public static ArrayList oitavas(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ah[] ahArray;
        ah[] ahArray2 = new ah[8];
        for (int i2 = 0; i2 < 8; ++i2) {
            ahArray = (ah[])arrayList2.get(i2);
            ahArray2[i2] = arrayList3.contains(ahArray[1]) ? ahArray[1] : ahArray[0];
        }
        Random random = new Random();
        ahArray = new ah[8];
        for (int i3 = 0; i3 < 8; i3 += 2) {
            ah serializable = ahArray2[7 - i3];
            ah ah2 = ahArray2[6 - i3];
            boolean bl = random.nextBoolean();
            ahArray[i3] = bl ? ah2 : serializable;
            ahArray[i3 + 1] = bl ? serializable : ah2;
        }
        int[] nArray = new int[]{0, 7, 3, 4, 1, 6, 2, 5};
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < 8; ++i4) {
            arrayList4.add(ahArray[nArray[i4]]);
            arrayList4.add(arrayList.get(nArray[i4]));
        }
        return arrayList4;
    }
}

