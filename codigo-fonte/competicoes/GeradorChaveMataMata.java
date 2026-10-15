package competicoes;

import nucleo.BalancoFinanceiro;
import nucleo.ModeloPartida;
import nucleo.ModeloTime;
import nucleo.Campeonato;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.PartidaCompeticao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ModeloRegistroJogador;
import competicoes.CompeticaoLigaNacional;
import competicoes.CompeticaoCopaNacional;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;

public class GeradorChaveMataMata
implements Serializable {
    private static final long serialVersionUID = 1L;
    ChaveMataMata aae;
    private int oj;
    private int w;
    private int aaf;
    boolean gj;
    boolean aag = false;
    private ArrayList as = new ArrayList();
    private ArrayList aai = new ArrayList();
    private ArrayList aaj = new ArrayList();
    private ArrayList aak = new ArrayList();
    private transient ArrayList aal = new ArrayList();
    int aam;
    int aan;
    int var0 = -1;

    public void a(ChaveMataMata z2, ArrayList arrayList, int n2, boolean bl, int n3, int n4, int n5, boolean bl2) {
        this.b(z2, arrayList, n2, bl, n3, n4, n5, bl2);
    }

    public void b(ChaveMataMata z2, ArrayList arrayList, int n2, boolean bl, int n3, int n4, int n5, boolean bl2) {
        ArrayList arrayList2;
        Competicao at2;
        this.w = n5;
        this.e(z2);
        this.fk(arrayList.size());
        this.oj = n2;
        this.aag = bl2;
        this.s(bl);
        this.fl(this.c(this.w, this.oj, true));
        this.fm(n4);
        Competicao at3 = null;
        at3 = z2.yT();
        ArrayList arrayList3 = new ArrayList();
        boolean bl3 = false;
        if (z2 != null && z2.zf() == 14006) {
            bl3 = true;
        }
        arrayList3 = nucleo.Calendario.a(n5, bl3);
        int n6 = 0;
        while (n6 < arrayList.size()) {
            this.aai.add(new ModeloPartida(z2, n2, (ModeloTime)arrayList.get(n6), (ModeloTime)arrayList.get(n6 + 1), (Integer)arrayList3.get(0), at3, null));
            n6 += 2;
        }
        this.eZ((Integer)arrayList3.get(0));
        if (bl) {
            n6 = 0;
            while (n6 < arrayList.size()) {
                this.aaj.add(new ModeloPartida(z2, n2, (ModeloTime)arrayList.get(n6 + 1), (ModeloTime)arrayList.get(n6), (Integer)arrayList3.get(1), at3, null));
                n6 += 2;
            }
            this.eZ((Integer)arrayList3.get(1));
        }
        z2.zp().add(this);
        if (this.aai.size() == 1 && this.aae != null && (at2 = this.aae.yT()) != null && at2.mq() && (arrayList2 = this.aae.zt()).size() == 2) {
            this.aai.add(new ModeloPartida(z2, n2, (ModeloTime)arrayList2.get(0), (ModeloTime)arrayList2.get(1), (Integer)arrayList3.get(0), at3, null));
        }
    }

    public ChaveMataMata zT() {
        return this.aae;
    }

    public int[] o(ModeloPartida i2) {
        int[] nArray = new int[]{-1, -1};
        if (this.aaj != null && this.aaj.size() > 0) {
            int n2 = 0;
            while (n2 < this.aaj.size()) {
                if (this.aaj.get(n2) == i2) {
                    nArray[0] = ((ModeloPartida)this.aai.get(n2)).hw();
                    nArray[1] = ((ModeloPartida)this.aai.get(n2)).hu();
                    break;
                }
                ++n2;
            }
        }
        return nArray;
    }

    private int c(int n2, int n3, boolean bl) {
        int n4 = 0;
        if (n2 == 2) {
            int n5 = this.aae.zq();
            int n6 = ConstantesJogo.ss.length - 1 - n5;
            if ((n3 += n6) < ConstantesJogo.ss.length) {
                n4 = ConstantesJogo.ss[n3];
            }
        } else if (n2 == 4) {
            int n7 = this.aae.yT().gg();
            if (n7 < 0) {
                n7 = 1;
            }
            if (this.aae.zf() >= 4101 && this.aae.zf() <= 4103) {
                n4 = 500000;
            } else if (this.aae.zf() >= 4000 && this.aae.zf() <= 4004) {
                n4 = 1000000;
            } else if (n3 < ConstantesJogo.sw[0].length) {
                n4 = ConstantesJogo.sw[n7][n3];
            }
        } else if (n2 == 5) {
            if (n3 < ConstantesJogo.sx.length) {
                n4 = ConstantesJogo.sx[n3];
            }
        } else if (n2 == 6) {
            int n8 = this.aae.yT().gg();
            if (n8 < 0 || n8 > 1) {
                n8 = 1;
            }
            if (this.aae.zf() == 6100) {
                n4 = 300000;
            } else if (this.aae.zf() >= 6000 && this.aae.zf() <= 6004) {
                n4 = 500000;
            } else if (n3 < ConstantesJogo.sy[0].length) {
                n4 = ConstantesJogo.sy[n8][n3];
            }
        } else if (n2 == 8) {
            n4 = ConstantesJogo.sz[0];
        } else if (n2 == 10) {
            if (n3 < ConstantesJogo.sv.length) {
                n4 = ConstantesJogo.sv[n3];
            }
        } else if (n2 == 11) {
            n4 = ConstantesJogo.sA[0];
        } else if (n2 == 12) {
            int n9 = this.aae.yT().gg();
            if (n9 < 0 || n9 > 1) {
                n9 = 1;
            }
            if (this.aae.zf() == 6100) {
                n4 = 300000;
            } else if (this.aae.zf() >= 6000 && this.aae.zf() <= 6004) {
                n4 = 500000;
            } else if (n3 < ConstantesJogo.aeG[0].length) {
                n4 = ConstantesJogo.aeG[n9][n3];
            }
        }
        return n4;
    }

    public void e(ChaveMataMata z2) {
        this.aae = z2;
    }

    public int lU() {
        return this.oj;
    }

    public void co(int n2) {
        this.oj = n2;
    }

    public int zU() {
        return this.aaf;
    }

    public void fk(int n2) {
        this.aaf = n2;
    }

    public boolean hO() {
        return this.gj;
    }

    public void s(boolean bl) {
        this.gj = bl;
    }

    public ArrayList zV() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.aai.size()) {
            arrayList.add(((ModeloPartida)this.aai.get(n2)).hc());
            arrayList.add(((ModeloPartida)this.aai.get(n2)).hd());
            ++n2;
        }
        return arrayList;
    }

    public ArrayList zW() {
        return this.aai;
    }

    public void ap(ArrayList arrayList) {
        this.aai = arrayList;
    }

    public ArrayList zX() {
        return this.aaj;
    }

    public void aq(ArrayList arrayList) {
        this.aaj = arrayList;
    }

    public ArrayList zY() {
        return this.aak;
    }

    public void ar(ArrayList arrayList) {
        this.aak = arrayList;
    }

    public void fl(int n2) {
        this.aam = n2;
    }

    public void fm(int n2) {
        this.aan = n2;
    }

    private void eZ(int n2) {
        this.as.add(n2);
    }

    public void b(boolean bl, boolean bl2) {
        Serializable serializable;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        while (n11 < this.aai.size()) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
            n6 = 0;
            n7 = 0;
            n8 = 0;
            n9 = 0;
            n10 = 0;
            n2 = ((ModeloPartida)this.aai.get(n11)).hu();
            n3 = ((ModeloPartida)this.aai.get(n11)).hw();
            n9 = n2;
            n10 = n3;
            if (n2 > n3) {
                ++n6;
            } else if (n3 > n2) {
                ++n7;
            }
            if (this.gj) {
                n4 = ((ModeloPartida)this.aaj.get(n11)).hw();
                if (n4 > (n5 = ((ModeloPartida)this.aaj.get(n11)).hu())) {
                    ++n6;
                } else if (n5 > n4) {
                    ++n7;
                }
                n9 += n4;
                n10 += n5;
            }
            if (n6 > n7) {
                n8 = 1;
            } else if (n7 > n6) {
                n8 = 2;
            }
            if (n8 == 0) {
                if (n9 > n10) {
                    n8 = 1;
                } else if (n10 > n9) {
                    n8 = 2;
                }
            }
            if (n8 == 0 && this.gj && this.aag) {
                if (n4 > n3) {
                    n8 = 1;
                } else if (n3 > n4) {
                    n8 = 2;
                }
            }
            if (n8 == 0 && this.ze() == 2129) {
                n8 = 2;
            } else if (n8 == 0) {
                serializable = (ModeloPartida)this.aai.get(n11);
                if (this.gj) {
                    serializable = (ModeloPartida)this.aaj.get(n11);
                }
                n8 = ((ModeloPartida)serializable).hP() && ((ModeloPartida)serializable).hR() != null ? (((ModeloPartida)serializable).hR() == ((ModeloPartida)this.aai.get(n11)).hc() ? 1 : 2) : (((ModeloPartida)this.aai.get(n11)).hc().lf() < ((ModeloPartida)this.aai.get(n11)).hc().lf() ? 1 : 2);
            }
            if (n8 == 1) {
                this.aak.add(((ModeloPartida)this.aai.get(n11)).hc());
                this.aal.add(((ModeloPartida)this.aai.get(n11)).hd());
                serializable = (ModeloPartida)this.aai.get(n11);
                if (this.gj) {
                    serializable = (ModeloPartida)this.aaj.get(n11);
                }
                this.a((ModeloPartida)serializable, ((ModeloPartida)this.aai.get(n11)).hc().ka(), 1);
                this.a((ModeloPartida)serializable, ((ModeloPartida)this.aai.get(n11)).hd().ka(), 2);
                this.V(((ModeloPartida)this.aai.get(n11)).hc());
                if (this.aae.zf() == 90 || this.aae.zf() == 91 || this.aae.zf() == 92 || this.aae.zf() == 93 || this.aae.zf() == 94 || this.aae.zf() == 95) {
                    GerenciadorJogo.SR.aY().a(this.aae.yT(), GerenciadorJogo.SR.s(((ModeloPartida)this.aai.get(n11)).hc().getPais()));
                }
            } else {
                this.aak.add(((ModeloPartida)this.aai.get(n11)).hd());
                this.aal.add(((ModeloPartida)this.aai.get(n11)).hc());
                serializable = (ModeloPartida)this.aai.get(n11);
                if (this.gj) {
                    serializable = (ModeloPartida)this.aaj.get(n11);
                }
                this.a((ModeloPartida)serializable, ((ModeloPartida)this.aai.get(n11)).hc().ka(), 2);
                this.a((ModeloPartida)serializable, ((ModeloPartida)this.aai.get(n11)).hd().ka(), 1);
                this.V(((ModeloPartida)this.aai.get(n11)).hd());
                if (this.aae.zf() == 90 || this.aae.zf() == 91 || this.aae.zf() == 92 || this.aae.zf() == 93 || this.aae.zf() == 94 || this.aae.zf() == 95) {
                    GerenciadorJogo.SR.aY().a(this.aae.yT(), GerenciadorJogo.SR.s(((ModeloPartida)this.aai.get(n11)).hd().getPais()));
                }
            }
            ++n11;
        }
        if (bl2) {
            if (this.aae.zf() == 1099) {
                ((CompeticaoLigaNacional)this.aae.yT()).BO();
            } else if (this.aae.zf() == 1098) {
                ((CompeticaoLigaNacional)this.aae.yT()).r(this.aak, this.aal);
            } else if (this.aae.zf() != 91) {
                if (this.aae.zf() == 1068) {
                    ((CompeticaoLigaNacional)this.aae.yT()).n(this.aak, this.aal);
                } else if (this.aae.zf() == 9502) {
                    GerenciadorJogo.SR.bS().p(this.aak, this.aal);
                } else if (this.aae.zf() == 9401) {
                    GerenciadorJogo.SR.bR().ay(this.aak);
                } else if (this.aae.zf() == 9200) {
                    GerenciadorJogo.SR.bM().aw(this.aak);
                } else if (this.aae.zf() == 9202) {
                    GerenciadorJogo.SR.bM().p(this.aak, this.aal);
                } else if (this.aae.zf() == 9300) {
                    GerenciadorJogo.SR.bQ().aw(this.aak);
                } else if (this.aae.zf() == 9002) {
                    GerenciadorJogo.SR.bL().az(this.aak);
                } else if (this.aae.zf() == 9303) {
                    GerenciadorJogo.SR.bQ().ax(this.aak);
                } else if (this.aae.zf() == 4000) {
                    GerenciadorJogo.SR.aI().aj(this.aak);
                } else if (this.aae.zf() == 4001) {
                    GerenciadorJogo.SR.aI().g(this.aak, this.aal);
                } else if (this.aae.zf() == 4002) {
                    GerenciadorJogo.SR.aI().h(this.aak, this.aal);
                } else if (this.aae.zf() == 4003) {
                    GerenciadorJogo.SR.aI().j(this.aak, this.aal);
                } else if (this.aae.zf() == 4004) {
                    GerenciadorJogo.SR.aI().k(this.aak, this.aal);
                } else if (this.aae.zf() == 6001) {
                    GerenciadorJogo.SR.aK().g(this.aak, this.aal);
                } else if (this.aae.zf() == 6002) {
                    GerenciadorJogo.SR.aK().m(this.aak, this.aal);
                } else if (this.aae.zf() == 6006) {
                    GerenciadorJogo.SR.aK().l(this.aak, this.aal);
                } else if (this.aae.zf() == 6004) {
                    GerenciadorJogo.SR.aK().m(this.aak, this.aal);
                } else if (this.aae.zf() == 4101) {
                    GerenciadorJogo.SR.aF().g(this.aak, this.aal);
                } else if (this.aae.zf() == 4102) {
                    GerenciadorJogo.SR.aF().h(this.aak, this.aal);
                } else if (this.aae.zf() == 4103) {
                    GerenciadorJogo.SR.aF().i(this.aak, this.aal);
                } else if (this.aae.zf() == 12001) {
                    GerenciadorJogo.SR.mj().g(this.aak, this.aal);
                } else if (this.aae.zf() == 12002) {
                    GerenciadorJogo.SR.mj().h(this.aak, this.aal);
                } else if (this.aae.zf() == 12003) {
                    GerenciadorJogo.SR.mj().j(this.aak, this.aal);
                } else if (this.aae.zf() == 12004) {
                    GerenciadorJogo.SR.mj().m(this.aak, this.aal);
                } else if (this.aae.zf() == 12006) {
                    GerenciadorJogo.SR.mj().l(this.aak, this.aal);
                } else if (this.aae.zf() == 6100) {
                    GerenciadorJogo.SR.aH().o(this.aak, this.aal);
                } else if (this.aae.zf() == 14006) {
                    GerenciadorJogo.SR.sq().aA(this.aal);
                } else if (this.aae.zf() == 2029 && this.var0 != 2729) {
                    CompeticaoCopaNacional f_02 = (CompeticaoCopaNacional)this.aae.yT();
                    if (this.var0 == 2129) {
                        f_02.ad(this.aak);
                    } else if (this.var0 == 2229) {
                        f_02.ao(this.aak);
                    } else if (this.var0 == 2329) {
                        f_02.as(this.aak);
                    } else if (this.var0 == 2429) {
                        f_02.at(this.aak);
                    } else if (this.var0 == 2529) {
                        f_02.au(this.aak);
                    } else if (this.var0 == 2629) {
                        f_02.av(this.aak);
                    }
                } else if (this.aae.zf() != 1802 && this.aae.zf() != 1803) {
                    if (this.aae.zf() == 150) {
                        GerenciadorJogo.SR.aR().al(this.aak);
                    } else if (bl) {
                        Competicao at2 = this.aae.yT();
                        serializable = this.aae.zy();
                        ModeloTime ah2 = null;
                        ModeloTime ah3 = null;
                        if (this.aak.get(0) == ((ModeloPartida)this.aai.get(0)).hc()) {
                            n8 = 1;
                            ah2 = ((ModeloPartida)this.aai.get(0)).hc();
                            ah3 = ((ModeloPartida)this.aai.get(0)).hd();
                        } else {
                            n8 = 2;
                            ah2 = ((ModeloPartida)this.aai.get(0)).hd();
                            ah3 = ((ModeloPartida)this.aai.get(0)).hc();
                        }
                        new PartidaCompeticao(at2, (FaseCompeticao)serializable, ah2, ah3);
                        if (ConstantesJogo.fs(at2.b())) {
                            ah2.ka();
                        }
                    }
                }
            }
        }
    }

    private void V(ModeloTime ah2) {
        this.fl(this.c(this.w, this.oj, false));
        if (ah2 != null && this.aam > 0 && ah2.jZ().booleanValue()) {
            ah2.v(this.aam, 3);
            ChaveMataMata z2 = this.zT();
            if (ah2.ka() != null && ah2.ka().jZ().booleanValue() && z2 != null) {
                new ModeloRegistroJogador(ah2.ka(), 26, 79, ((FaseCompeticao)z2).getNome(), BalancoFinanceiro.c(this.aam));
            }
        }
    }

    private void a(ModeloPartida i2, Campeonato al2, int n2) {
        if (i2 != null && al2 != null && i2.hy() != null && i2.hy().b() != 7 && i2.hy().b() != 9) {
            al2.a(i2, true, n2);
        }
    }

    public boolean zZ() {
        return this.aag;
    }

    public int ze() {
        return this.var0;
    }

    public void fb(int n2) {
        this.var0 = n2;
    }

    public boolean ad(ModeloTime ah2) {
        int n2 = 0;
        while (n2 < this.aai.size()) {
            if (((ModeloPartida)this.aai.get(n2)).hc() == ah2 || ((ModeloPartida)this.aai.get(n2)).hd() == ah2) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}

