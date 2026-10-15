package nucleo;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCampeonatoEstadual;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColocacaoTime
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int ae;
    private int w;
    private int dz;
    private int T = 0;
    private int bX = 0;
    private int d = 0;
    private int nK = 0;
    private int nL = 0;
    private int nM = 0;
    private int nN = -1;
    private int divisao = -1;
    private int nO = -1;
    private transient boolean nP = false;
    private transient boolean nQ = false;
    private transient boolean nR = false;

    public ColocacaoTime() {
    }

    public ColocacaoTime(Competicao at2, ModeloTime ah2, int n2) {
        this.ae = GerenciadorJogo.SR.H();
        this.w = at2.b();
        this.dz = n2;
        if (at2 instanceof CompeticaoLigaNacional) {
            this.divisao = ((CompeticaoLigaNacional)at2).ip();
        } else if (at2 instanceof CompeticaoCampeonatoEstadual) {
            this.divisao = ((CompeticaoCampeonatoEstadual)at2).ip();
        }
    }

    public int H() {
        return this.ae;
    }

    public int w() {
        return this.T;
    }

    public void cl() {
        ++this.T;
    }

    public int cm() {
        return this.bX;
    }

    public void cn() {
        ++this.bX;
    }

    public int co() {
        return this.d;
    }

    public void cp() {
        ++this.d;
    }

    public int ls() {
        return this.nK;
    }

    public void ca(int n2) {
        this.nK += n2;
    }

    public int lt() {
        return this.nL;
    }

    public void cb(int n2) {
        this.nL += n2;
    }

    public int lu() {
        return this.nM;
    }

    public void cc(int n2) {
        this.nM = n2;
    }

    public int lv() {
        return this.nN;
    }

    public void cd(int n2) {
        this.nN = n2;
    }

    public String d(LigaNacional z2) {
        String string = "";
        String string2 = "Campe\u00e3o";
        String string3 = "Vice-campe\u00e3o";
        String string4 = "";
        String string5 = "";
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.w == 2) {
            if (z2 != null) {
                if (z2.jq() != null && z2.jq().yf() != null) {
                    arrayList.addAll(Arrays.asList(z2.jq().b((FaseCompeticao)null)));
                } else if (z2.jc() == 29 && GerenciadorJogo.vM().isNovoFormatoCopa()) {
                    arrayList.addAll(Arrays.asList(ConstantesJogo.pt));
                } else if (z2.jq() != null) {
                    arrayList.addAll(Arrays.asList(z2.jq().yh()));
                }
            }
        } else if (this.w == 4) {
            if (this.dz == 0 || this.dz == 1 || this.dz == 3 || this.dz == 2) {
                arrayList.addAll(Arrays.asList(ConstantesJogo.pA));
            } else if (this.dz == 4) {
                arrayList.addAll(Arrays.asList(ConstantesJogo.pB));
            } else if (this.dz == 5) {
                arrayList.addAll(Arrays.asList(ConstantesJogo.pC));
            }
        } else if (this.w == 6 || this.w == 12) {
            if (this.dz == 0) {
                arrayList.addAll(Arrays.asList(ConstantesJogo.pz));
            } else {
                arrayList.addAll(Arrays.asList(ConstantesJogo.pA));
            }
        } else {
            arrayList.addAll(Arrays.asList(ConstantesJogo.py));
        }
        Collections.reverse(arrayList);
        if (this.w == 9) {
            if (this.divisao == 1) {
                return "Classificado";
            }
            return "N\u00e3o classificado";
        }
        if (this.nN >= 0) {
            this.nR = true;
            if (this.nN == 1090) {
                this.nR = false;
                return String.valueOf(string5) + "Venceu playoff";
            }
            if (this.nN == 1091) {
                return String.valueOf(string5) + "Perdeu playoff";
            }
            if (this.nN == 1001) {
                return String.valueOf(string5) + "Fase de grupos";
            }
            if (this.nN == 4101) {
                return String.valueOf(string5) + ConstantesJogo.pR[0];
            }
            if (this.nN == 4102) {
                return String.valueOf(string5) + ConstantesJogo.pS[0];
            }
            if (this.nN == 4103) {
                return String.valueOf(string5) + ConstantesJogo.pT[0];
            }
            if (this.nN == 6000) {
                return String.valueOf(string5) + ConstantesJogo.pM[0];
            }
            if (this.nN == 6001) {
                return String.valueOf(string5) + ConstantesJogo.pN[0];
            }
            if (this.nN == 6002) {
                return String.valueOf(string5) + ConstantesJogo.pO[0];
            }
            if (this.nN == 6003) {
                return String.valueOf(string5) + ConstantesJogo.pP[0];
            }
            if (this.nN == 6006) {
                return String.valueOf(string5) + ConstantesJogo.abY[0];
            }
            if (this.nN == 6004) {
                return String.valueOf(string5) + ConstantesJogo.pQ[0];
            }
            if (this.nN == 6100) {
                return String.valueOf(string5) + ConstantesJogo.pW[0];
            }
            if (this.nN == 4000) {
                return String.valueOf(string5) + ConstantesJogo.pG[0];
            }
            if (this.nN == 4001) {
                return String.valueOf(string5) + ConstantesJogo.pI[0];
            }
            if (this.nN == 4002) {
                return String.valueOf(string5) + ConstantesJogo.pJ[0];
            }
            if (this.nN == 4003) {
                return String.valueOf(string5) + ConstantesJogo.pK[0];
            }
            if (this.nN == 4004) {
                return String.valueOf(string5) + ConstantesJogo.pL[0];
            }
            if (this.nN == 12001) {
                return String.valueOf(string5) + ConstantesJogo.abZ[0];
            }
            if (this.nN == 12002) {
                return String.valueOf(string5) + ConstantesJogo.aca[0];
            }
            if (this.nN == 12003) {
                return String.valueOf(string5) + ConstantesJogo.acb[0];
            }
            if (this.nN == 12004) {
                return String.valueOf(string5) + ConstantesJogo.acc[0];
            }
            if (this.nN == 12006) {
                return String.valueOf(string5) + ConstantesJogo.abY[0];
            }
            if (this.nN == 0) {
                if (this.nM == 1) {
                    this.nP = true;
                    this.nR = false;
                    return string2;
                }
                if (this.nM == 2) {
                    this.nQ = true;
                    this.nR = false;
                    return string3;
                }
                if (this.w == 7 || this.w == 14) {
                    if (this.nM == 3) {
                        this.nR = false;
                        return "3\u00ba";
                    }
                    if (this.nM == 4) {
                        this.nR = false;
                        return "4\u00ba";
                    }
                }
            } else if (this.nN >= 1 && this.nN < arrayList.size()) {
                return (String)arrayList.get(this.nN);
            }
        } else {
            if (this.lu() > 0) {
                if (this.nM == 1) {
                    this.nP = true;
                    return string2;
                }
                if (this.nM == 2) {
                    this.nQ = true;
                    return string3;
                }
                if (this.w == 7) {
                    this.nR = true;
                    return "Fase grupos";
                }
                return String.valueOf(Integer.toString(this.lu())) + " \u00ba";
            }
            if (this.ae < GerenciadorJogo.SR.H()) {
                if (this.w == 1) {
                    this.nR = true;
                    return "1\u00aa fase";
                }
                if (this.w == 14) {
                    String[] stringArray = new String[]{"A", "A", "B", "C", "D"};
                    String string6 = "Grupos";
                    if (this.divisao >= 0 && this.divisao < stringArray.length) {
                        string6 = "Liga " + stringArray[this.divisao];
                    }
                    return string6;
                }
                if (this.w == 7) {
                    this.nR = true;
                    return "Fase grupos";
                }
            }
        }
        return string;
    }

    public int b() {
        return this.w;
    }

    public int el() {
        return this.dz;
    }

    public int getDivisao() {
        return this.divisao;
    }

    public int lw() {
        return this.nO;
    }

    public void ce(int n2) {
        this.nO = n2;
    }

    public boolean lx() {
        return this.nP;
    }

    public boolean ly() {
        return this.nQ;
    }

    public boolean lz() {
        return this.nR;
    }

    public void setDivisao(int n2) {
        this.divisao = n2;
    }
}

