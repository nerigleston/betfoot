package telas;

import telas.AcaoAtalhoConfirmarEscalacao;
import telas.ListenerTrocaModoEscalacao0;
import telas.ListenerTrocaModoEscalacao1;
import telas.ListenerTrocaModoEscalacao2;
import telas.ListenerCliqueEscalacao;
import telas.ListenerArrastarJogadorEscalacao;
import telas.ListenerEscalarJogadorSelecionado;
import telas.ListenerCliqueJogadorEscalacao;
import telas.ListenerArrastarJogadorReserva;
import telas.OuvinteDefinirCapitaoEscalacao;
import telas.OuvinteDefinirBatedorEscanteioEscalacao;
import telas.OuvinteAlternarFalso9Escalacao;
import telas.ListenerSelecaoAnteriorTatica;
import telas.ListenerSelecaoOpcaoTaticaA;
import telas.ListenerSelecaoOpcaoTaticaB;
import telas.ListenerAlternarOpcaoEscalacao;
import telas.OuvinteJogarEscalacao;
import telas.OuvinteVoltarAoTimeEscalacao;
import telas.OuvinteCheckEscalacaoPadrao;
import telas.OuvinteAbrirTaticasSalvas;
import telas.ListenerSelecaoOpcaoTaticaC;
import telas.TelaGerenciarTaticas;
import nucleo.ModeloJogador;
import nucleo.ModeloPartida;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import components.TaticaSalva;
import components.GeradorIconeJogador;
import components.LayoutPosicaoAbsoluta;
import components.TooltipEstatisticasJogador2;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;

public class TelaEscalacao
extends JPanel {
    private JLabel Ay;
    private JLabel Az = new JLabel();
    private JLabel AA = new JLabel();
    private JLabel AB = new JLabel();
    private JLabel AC;
    private ImageIcon AD;
    private ArrayList AE = new ArrayList();
    private ArrayList AF = new ArrayList();
    private ModeloTime zu;
    private ModeloPartida bv;
    private static TelaEscalacao AG;
    private ImageIcon AH = new ImageIcon(this.getClass().getResource("/aicons/camisav.png"));
    private ImageIcon AI = new ImageIcon(this.getClass().getResource("/aicons/camisag.png"));
    private ImageIcon AJ = new ImageIcon(this.getClass().getResource("/aicons/camisat.png"));
    private ImageIcon AK = new ImageIcon(this.getClass().getResource("/aicons/camisar.png"));
    private ImageIcon AL = this.AJ;
    private ImageIcon AM = new ImageIcon(this.getClass().getResource("/aicons/camisat40.png"));
    private ImageIcon AN = new ImageIcon(this.getClass().getResource("/aicons/camisar40.png"));
    private ArrayList AO = new ArrayList();
    private int AP = -1;
    private int AQ = -1;
    private boolean AR = false;
    private boolean AS = false;
    private JDialog ub;
    private int AT = 0;
    private int AU = -1;
    private boolean AV = false;
    final JPopupMenu AW = new JPopupMenu();
    private boolean AX = false;
    private boolean AY = false;
    JMenuItem AZ = new JMenuItem("Falso 9");
    private JRadioButton Ba;
    private JRadioButton Bb;
    private JRadioButton Bc;
    private JCheckBox Bd;
    private JCheckBox Be;
    private JButton vb;
    private JComboBox Bf;
    private JComboBox Bg;
    private JComboBox Bh;
    private JComboBox Bi;
    private JLabel ug;
    private JLabel Bj;
    private JLabel vw;
    private JLabel zc;
    private JLabel uh;
    private JLabel a_;
    private JLabel ur;
    private JLabel vy;
    private JLabel vA;
    private JPanel vd;
    private JPanel we;
    private JLabel Bk;
    private JLabel Bl;
    private JLabel Bm;
    private JButton Bn;
    private JButton Bo;
    private TooltipEstatisticasJogador2 Bp;

    public static ArrayList oa() {
        return TelaEscalacao.AG.AE;
    }

    private void mY() {
        this.a(this);
        this.a(this.Bp);
        this.a(this.vd);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(32, 0), "st");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(115, 512), "st");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("st", new AcaoAtalhoConfirmarEscalacao(this));
    }

    public TelaEscalacao(JDialog jDialog, ModeloTime ah2, ModeloPartida i2, boolean bl) {
        this.ub = jDialog;
        this.zu = ah2;
        this.AV = bl;
        if (this.zu.ke() == null) {
            this.zu.kA();
        }
        if (this.zu.kd() == null) {
            this.zu.kz();
        }
        this.bv = i2;
        AG = this;
        this.AT = this.bv.hc() == this.zu ? 0 : 1;
        this.mJ();
        this.Bf.setMaximumRowCount(14);
        this.Be.setSelected(GerenciadorJogo.SR.bm());
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/alpha.png"));
        this.Ay = new JLabel();
        this.Ay.setIcon(imageIcon);
        this.Bp.add((Component)this.Ay, new components.RestricaoPosicaoLayout(0, 0, 480, 679));
        this.Bp.setLayer(this.Ay, JLayeredPane.PALETTE_LAYER);
        this.od();
        ToolTipManager.sharedInstance().registerComponent(this.Bp);
        if (!bl && this.bv.hy() != null && this.bv.hy().b() == 0) {
            this.AX = true;
            this.Bd.setVisible(true);
        } else {
            this.AX = false;
            this.Bd.setVisible(false);
        }
        this.U(this.AX);
        this.lA();
        if (this.Be.isSelected() && this.zu.kX() != null) {
            this.a(this.zu.kX(), false);
        }
        this.X(false);
        this.ok();
        this.og();
        this.oc();
        this.mY();
        this.ob();
    }

    private void ob() {
        if (this.bv.dX() < ConstantesJogo.pb.length) {
            this.Bm.setText(ConstantesJogo.pb[this.bv.dX()]);
            this.Bl.setIcon(new ImageIcon(this.getClass().getResource("/aicons/" + ConstantesJogo.pc[this.bv.dX()] + ".png")));
        }
    }

    private void oc() {
        JMenuItem jMenuItem = new JMenuItem("Batedor de faltas");
        jMenuItem.addActionListener(new ListenerEscalarJogadorSelecionado(this));
        this.AW.add(jMenuItem);
        this.AW.addSeparator();
        JMenuItem jMenuItem2 = new JMenuItem("Capit\u00e3o");
        jMenuItem2.addActionListener(new OuvinteDefinirCapitaoEscalacao(this));
        this.AW.add(jMenuItem2);
        this.AW.addSeparator();
        JMenuItem jMenuItem3 = new JMenuItem("Batedor de escanteios");
        jMenuItem3.addActionListener(new OuvinteDefinirBatedorEscanteioEscalacao(this));
        this.AW.add(jMenuItem3);
        this.AW.addSeparator();
        this.AZ.addActionListener(new OuvinteAlternarFalso9Escalacao(this));
        this.AW.add(this.AZ);
    }

    public void od() {
        String[] stringArray = ConstantesJogo.rB;
        String[] stringArray2 = ConstantesJogo.rC;
        String[] stringArray3 = ConstantesJogo.rD;
        String[] stringArray4 = ConstantesJogo.rE;
        int n2 = 0;
        while (n2 < stringArray2.length) {
            this.Bg.addItem(stringArray2[n2]);
            ++n2;
        }
        this.Bg.setSelectedIndex(this.zu.kj()[1]);
        n2 = 0;
        while (n2 < stringArray4.length) {
            this.Bh.addItem(stringArray4[n2]);
            ++n2;
        }
        this.Bh.setSelectedIndex(this.zu.kj()[2]);
        n2 = 0;
        while (n2 < stringArray3.length) {
            this.Bi.addItem(stringArray3[n2]);
            ++n2;
        }
        this.Bi.setSelectedIndex(this.zu.kj()[3]);
        n2 = 0;
        while (n2 < stringArray.length) {
            this.Bf.addItem(stringArray[n2]);
            ++n2;
        }
        if (this.bv != null) {
            ModeloTime ah2 = null;
            boolean bl = false;
            if (this.bv.hc() == this.zu) {
                ah2 = this.bv.hd();
                bl = true;
            } else {
                ah2 = this.bv.hc();
            }
            this.Bk.setIcon(ah2.kU());
            this.Bk.setText(ah2.getNome());
            ah2.kM();
            boolean bl2 = false;
            ImageIcon[] imageIconArray = ah2.kN();
            if (imageIconArray[0] == null && imageIconArray[1] == null && imageIconArray[2] == null) {
                bl2 = true;
            }
            int[] nArray = new int[3];
            nArray[1] = 1;
            nArray[2] = 2;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[3];
            nArray3[0] = 1;
            nArray3[2] = 2;
            int[] nArray4 = nArray3;
            int[] nArray5 = !bl ? nArray2 : nArray4;
            if (!bl2) {
                if (imageIconArray[nArray5[0]] != null) {
                    this.Bj.setIcon(GeradorIconeJogador.i(imageIconArray[nArray5[0]]));
                } else if (imageIconArray[nArray5[1]] != null) {
                    this.Bj.setIcon(GeradorIconeJogador.i(imageIconArray[nArray5[1]]));
                } else if (imageIconArray[nArray5[2]] != null) {
                    this.Bj.setIcon(GeradorIconeJogador.i(imageIconArray[nArray5[2]]));
                }
            } else if (!bl) {
                this.Bj.setIcon(this.AM);
            } else {
                this.Bj.setIcon(this.AN);
            }
        }
        boolean bl = false;
        ImageIcon[] imageIconArray = new ImageIcon[]{this.zu.bU(1), this.zu.bU(2), this.zu.bU(3)};
        if (imageIconArray[0] == null && imageIconArray[1] == null && imageIconArray[2] == null) {
            bl = true;
        }
        if (bl) {
            this.Bc.setIcon(this.AM);
            this.Ba.setIcon(this.AN);
            this.Bb.setVisible(false);
            this.AL = this.zu.kW() == 0 ? this.AJ : this.AK;
        } else {
            if (imageIconArray[0] != null) {
                this.Bc.setIcon(GeradorIconeJogador.i(imageIconArray[0]));
            } else {
                this.Bc.setIcon(this.AM);
            }
            if (imageIconArray[1] != null) {
                this.Ba.setIcon(GeradorIconeJogador.i(imageIconArray[1]));
            } else {
                this.Bc.setIcon(this.AN);
            }
            if (imageIconArray[2] != null) {
                this.Bb.setIcon(GeradorIconeJogador.i(imageIconArray[2]));
            } else {
                this.Bb.setVisible(false);
            }
            this.AL = this.zu.kS();
        }
    }

    public void oe() {
        int n2 = 37;
        while (n2 < this.AE.size()) {
            ((GeradorIconeJogador)this.AE.get(n2)).vg();
            ++n2;
        }
        n2 = 37;
        if (!this.AX) {
            int n3 = 0;
            while (n3 < this.AF.size()) {
                if (!this.t((ModeloJogador)this.AF.get(n3))) {
                    ((GeradorIconeJogador)this.AE.get(n2)).a((ModeloJogador)this.AF.get(n3));
                    ((GeradorIconeJogador)this.AE.get(n2)).h(this.AL);
                    ++n2;
                }
                ++n3;
            }
        } else {
            int n4 = 0;
            while (n4 < this.AF.size()) {
                if (((ModeloJogador)this.AF.get(n4)).fC() == this.AY && !this.t((ModeloJogador)this.AF.get(n4))) {
                    ((GeradorIconeJogador)this.AE.get(n2)).a((ModeloJogador)this.AF.get(n4));
                    ((GeradorIconeJogador)this.AE.get(n2)).h(this.AL);
                    ++n2;
                }
                ++n4;
            }
        }
        this.cT(-1);
    }

    public void U(boolean bl) {
        int n2;
        this.AF.clear();
        if (!this.AV) {
            n2 = 0;
            while (n2 < this.zu.kc().size()) {
                if (((ModeloJogador)this.zu.kc().get(n2)).a(this.bv, this.AV)) {
                    this.AF.add((ModeloJogador)this.zu.kc().get(n2));
                }
                ++n2;
            }
        } else {
            n2 = 0;
            while (n2 < this.zu.kc().size()) {
                if (((ModeloJogador)this.zu.kc().get(n2)).a(this.bv, this.AV)) {
                    this.AF.add((ModeloJogador)this.zu.kc().get(n2));
                }
                ++n2;
            }
        }
        if (bl) {
            n2 = 0;
            while (n2 < this.zu.ky().size()) {
                this.AF.add((ModeloJogador)this.zu.ky().get(n2));
                ++n2;
            }
        }
    }

    public ImageIcon a(int n2, ModeloJogador f2) {
        if (n2 == 1) {
            return this.AI;
        }
        if (n2 > 1) {
            if (f2 != null && f2.getPosicao() == 0) {
                return this.AI;
            }
            if (f2 != null) {
                return this.AL;
            }
            return this.AH;
        }
        if (f2 != null) {
            return this.AL;
        }
        return this.AH;
    }

    public void V(boolean bl) {
        int n2 = 0;
        while (n2 <= 91) {
            GeradorIconeJogador ao2 = new GeradorIconeJogador();
            this.AE.add(ao2);
            ++n2;
        }
        this.of();
        this.cS(-1);
    }

    private void W(boolean bl) {
        if (bl) {
            TaticaSalva ag2 = this.zu.kX();
            if (ag2 == null) {
                ag2 = new TaticaSalva();
                this.zu.a(ag2);
            }
            ag2.clear();
            int n2 = 0;
            while (n2 < 37) {
                if (((GeradorIconeJogador)this.AE.get(n2)).x() != null) {
                    ag2.uH().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                    ag2.uI().add(n2);
                } else if (((GeradorIconeJogador)this.AE.get(n2)).vf() != null) {
                    ag2.uH().add(null);
                    ag2.uI().add(n2);
                }
                ++n2;
            }
        }
    }

    public void a(TaticaSalva ag2, boolean bl) {
        this.AO.clear();
        int n2 = 0;
        while (n2 < 91) {
            if (n2 < this.AE.size()) {
                ((GeradorIconeJogador)this.AE.get(n2)).vg();
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < ag2.uH().size()) {
            if (ag2.uH().get(n2) != null) {
                if (this.AF.contains(ag2.uH().get(n2))) {
                    if ((Integer)ag2.uI().get(n2) < this.AE.size()) {
                        ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).a((ModeloJogador)ag2.uH().get(n2));
                        ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).h(this.AL);
                        this.AO.add((ModeloJogador)ag2.uH().get(n2));
                    }
                } else if ((Integer)ag2.uI().get(n2) < this.AE.size()) {
                    ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).a((ModeloJogador)null);
                    ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).h(this.AH);
                }
            } else if ((Integer)ag2.uI().get(n2) < this.AE.size()) {
                ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).a((ModeloJogador)null);
                ((GeradorIconeJogador)this.AE.get((Integer)ag2.uI().get(n2))).h(this.AH);
            }
            ++n2;
        }
        this.cS(-1);
        this.oe();
    }

    private void of() {
        int n2 = 0;
        while (n2 <= 36) {
            ((GeradorIconeJogador)this.AE.get(n2)).vg();
            ++n2;
        }
        n2 = 0;
        while (n2 <= 10) {
            ((GeradorIconeJogador)this.AE.get(ConstantesJogo.sJ[4][n2])).ej(n2);
            ++n2;
        }
        n2 = 26;
        while (n2 <= 36) {
            ((GeradorIconeJogador)this.AE.get(n2)).ej(n2);
            ++n2;
        }
    }

    private void cR(int n2) {
        int n3 = 0;
        while (n3 <= 36) {
            ((GeradorIconeJogador)this.AE.get(n3)).vg();
            ++n3;
        }
        n3 = 0;
        while (n3 <= 10) {
            ((GeradorIconeJogador)this.AE.get(ConstantesJogo.sJ[n2][n3])).ej(n3);
            ++n3;
        }
        n3 = 26;
        while (n3 <= 36) {
            ((GeradorIconeJogador)this.AE.get(n3)).ej(n3);
            ++n3;
        }
        this.cS(-1);
    }

    private void cS(int n2) {
        this.a(this.Az, ((GeradorIconeJogador)this.AE.get(0)).a(this.AE, n2, this.AL, false, -1, this.zu, 0), false);
        this.a(this.AA, ((GeradorIconeJogador)this.AE.get(0)).a(this.AE, n2, this.AL, false, -1, this.zu, 1), true);
    }

    private void cT(int n2) {
        this.e(((GeradorIconeJogador)this.AE.get(0)).a(this.AE, n2, this.AL));
    }

    public void a(JLabel jLabel, ImageIcon imageIcon, boolean bl) {
        jLabel.setIcon(null);
        jLabel.setIcon(imageIcon);
        int n2 = 0;
        int n3 = 0;
        if (bl) {
            n2 = 440;
            n3 = 30;
        }
        this.Bp.add((Component)jLabel, new components.RestricaoPosicaoLayout(n2, n3, -1, -1));
        this.Bp.setLayer(jLabel, JLayeredPane.POPUP_LAYER);
    }

    public void e(ImageIcon imageIcon) {
        this.AB.setIcon(null);
        this.AB.setIcon(imageIcon);
        this.Bp.add((Component)this.AB, new components.RestricaoPosicaoLayout(GeradorIconeJogador.vi(), GeradorIconeJogador.vj(), -1, -1));
        this.Bp.setLayer(this.AB, JLayeredPane.POPUP_LAYER);
    }

    public void f(ImageIcon imageIcon) {
        this.Az.setIcon(imageIcon);
    }

    private void lA() {
        this.AO.clear();
        this.AE.clear();
        this.V(false);
        this.oe();
    }

    private void cU(int n2) {
        if (n2 == 0) {
            this.lA();
        } else {
            ModeloJogador f2;
            int n3;
            int n4 = 0;
            while (n4 < this.AE.size()) {
                ((GeradorIconeJogador)this.AE.get(n4)).vg();
                ++n4;
            }
            this.AO.clear();
            this.AE.clear();
            n4 = 0;
            while (n4 <= 91) {
                GeradorIconeJogador ao2 = new GeradorIconeJogador();
                this.AE.add(ao2);
                ++n4;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.AF);
            Collections.sort(arrayList, ColecaoComparadoresSorteio.abh);
            int n5 = 0;
            while (n5 < 11) {
                n3 = ConstantesJogo.sJ[n2][n5];
                f2 = ModeloTime.a(arrayList, n3, false, false);
                if (f2 != null) {
                    ((GeradorIconeJogador)this.AE.get(n3)).h(this.AL);
                    ((GeradorIconeJogador)this.AE.get(n3)).a(f2);
                    arrayList.remove(f2);
                    this.AO.add(f2);
                }
                ++n5;
            }
            n5 = 26;
            n3 = 0;
            while (n3 < ConstantesJogo.sI.length) {
                f2 = ModeloTime.a(arrayList, ConstantesJogo.sI[n3], true, false);
                if (f2 != null) {
                    ((GeradorIconeJogador)this.AE.get(n5)).h(this.AL);
                    ((GeradorIconeJogador)this.AE.get(n5)).a(f2);
                    arrayList.remove(f2);
                    this.AO.add(f2);
                    ++n5;
                }
                ++n3;
            }
            n3 = 26;
            while (n3 <= 36) {
                if (((GeradorIconeJogador)this.AE.get(n3)).vf() == null) {
                    ((GeradorIconeJogador)this.AE.get(n3)).ej(n3);
                }
                ++n3;
            }
            n5 = 37;
            n3 = 0;
            while (n3 < this.AF.size()) {
                if (!this.AO.contains(this.AF.get(n3))) {
                    ((GeradorIconeJogador)this.AE.get(n5)).a((ModeloJogador)this.AF.get(n3));
                    ((GeradorIconeJogador)this.AE.get(n5)).h(this.AL);
                    ++n5;
                }
                ++n3;
            }
            this.cS(-1);
            this.cT(-1);
        }
    }

    public void og() {
        this.Bf.addActionListener(new ListenerSelecaoAnteriorTatica(this));
        this.Bg.addActionListener(new ListenerSelecaoOpcaoTaticaA(this));
        this.Bh.addActionListener(new ListenerSelecaoOpcaoTaticaB(this));
        this.Bi.addActionListener(new ListenerSelecaoOpcaoTaticaC(this));
        this.Bd.addActionListener(new ListenerAlternarOpcaoEscalacao(this));
        this.Bn.addActionListener(new OuvinteJogarEscalacao(this));
        this.Bo.addActionListener(new OuvinteVoltarAoTimeEscalacao(this));
        this.Be.addActionListener(new OuvinteCheckEscalacaoPadrao(this));
        this.vb.addActionListener(new OuvinteAbrirTaticasSalvas(this));
        this.Bc.addActionListener(new ListenerTrocaModoEscalacao0(this));
        this.Ba.addActionListener(new ListenerTrocaModoEscalacao1(this));
        this.Bb.addActionListener(new ListenerTrocaModoEscalacao2(this));
    }

    public void oh() {
        int n2 = 0;
        int n3 = 1;
        while (n3 <= 25) {
            if (((GeradorIconeJogador)this.AE.get(n3)).x() != null) {
                ++n2;
            }
            ++n3;
        }
        if (n2 != 11) {
            JOptionPane.showMessageDialog(this.ub, "Selecione 11 jogadores", "", 0);
        } else {
            this.W(true);
            this.oi();
        }
    }

    public boolean t(ModeloJogador f2) {
        int n2 = 1;
        while (n2 <= 36) {
            if (((GeradorIconeJogador)this.AE.get(n2)).x() != null && ((GeradorIconeJogador)this.AE.get(n2)).x() == f2) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public void oi() {
        this.zu.kY().clear();
        if (this.AT == 0) {
            this.bv.hl().clear();
            this.bv.hp().clear();
            this.bv.hn().clear();
        } else if (this.AT == 1) {
            this.bv.hm().clear();
            this.bv.hq().clear();
            this.bv.ho().clear();
        }
        int n2 = 1;
        while (n2 <= 25) {
            if (((GeradorIconeJogador)this.AE.get(n2)).x() != null) {
                ((GeradorIconeJogador)this.AE.get(n2)).x().as(n2);
                ((GeradorIconeJogador)this.AE.get(n2)).x().b(true);
                this.zu.kY().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                if (this.AT == 0) {
                    this.bv.hl().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                    this.bv.hp().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                } else if (this.AT == 1) {
                    this.bv.hm().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                    this.bv.hq().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                }
            }
            ++n2;
        }
        this.zu.kZ().clear();
        n2 = 26;
        while (n2 <= 36) {
            if (((GeradorIconeJogador)this.AE.get(n2)).x() != null) {
                ((GeradorIconeJogador)this.AE.get(n2)).x().as(n2);
                ((GeradorIconeJogador)this.AE.get(n2)).x().b(true);
                this.zu.kZ().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                if (this.AT == 0) {
                    this.bv.hn().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                } else if (this.AT == 1) {
                    this.bv.ho().add(((GeradorIconeJogador)this.AE.get(n2)).x());
                }
            }
            ++n2;
        }
        this.zu.I(true);
        if (GerenciadorJogo.SR.getAutoSalvar() > 0) {
            GerenciadorTelas.iF().rt();
        }
        this.ub.dispose();
        GerenciadorJogo.SR.ap();
    }

    public void oj() {
        JDialog jDialog = new JDialog(this.ub);
        TelaGerenciarTaticas il_02 = new TelaGerenciarTaticas(this, jDialog, this.zu);
        jDialog.add(il_02);
        jDialog.setSize(315, 343);
        jDialog.setPreferredSize(new Dimension(325, 273));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.pack();
        jDialog.setVisible(true);
    }

    private void d(MouseEvent mouseEvent) {
        this.AU = -1;
        if (GeradorIconeJogador.V(mouseEvent.getX(), mouseEvent.getY())) {
            this.AU = GeradorIconeJogador.S(mouseEvent.getX(), mouseEvent.getY());
            if (this.AU < 14 || this.AU == 17) {
                this.AZ.setEnabled(false);
            } else {
                this.AZ.setEnabled(true);
                if (((GeradorIconeJogador)this.AE.get(this.AU)).x() == this.zu.lr()) {
                    this.AZ.setText("N\u00e3o usar falso 9");
                } else {
                    this.AZ.setText("Falso 9");
                }
            }
            if (this.AU > 0 && this.AU <= 25 && ((GeradorIconeJogador)this.AE.get(this.AU)).x() != null) {
                this.AW.show(this.Bp, mouseEvent.getX(), mouseEvent.getY());
            }
        }
    }

    private void u(ModeloJogador f2) {
        this.zu.k(f2);
        this.cS(-1);
    }

    private void v(ModeloJogador f2) {
        this.zu.n(f2);
        this.cS(-1);
    }

    private void w(ModeloJogador f2) {
        if (this.zu.lr() == f2) {
            this.zu.o(null);
        } else {
            this.zu.o(f2);
        }
        this.cS(-1);
    }

    private void x(ModeloJogador f2) {
        this.zu.j(f2);
        this.cS(-1);
    }

    public void ok() {
        this.Bp.addMouseListener(new ListenerCliqueEscalacao(this));
        this.Bp.addMouseMotionListener(new ListenerArrastarJogadorEscalacao(this));
        this.addMouseListener(new ListenerCliqueJogadorEscalacao(this));
        this.addMouseMotionListener(new ListenerArrastarJogadorReserva(this));
    }

    private void a(MouseEvent mouseEvent) {
        if (this.AC == null) {
            return;
        }
        this.AC.setLocation(mouseEvent.getX() - 25, mouseEvent.getY() - 25);
    }

    private void b(MouseEvent mouseEvent) {
        if (GeradorIconeJogador.V(mouseEvent.getX(), mouseEvent.getY())) {
            this.AR = true;
            this.AP = GeradorIconeJogador.S(mouseEvent.getX(), mouseEvent.getY());
            if (this.AP > 0 && ((GeradorIconeJogador)this.AE.get(this.AP)).vf() != null) {
                this.cS(this.AP);
                if (this.AP > 1 && this.AP <= 25) {
                    this.X(true);
                }
                this.AC = null;
                this.AC = new JLabel();
                this.AC.setIcon(this.a(this.AP, ((GeradorIconeJogador)this.AE.get(this.AP)).x()));
                this.AC.setLocation(mouseEvent.getX() - 25, mouseEvent.getY() + -25);
                this.AC.setSize(this.AC.getWidth(), this.AC.getHeight());
                this.Bp.add((Component)this.AC, new components.RestricaoPosicaoLayout(mouseEvent.getX() - 25, mouseEvent.getY() - 25, 50, 50));
                this.Bp.setLayer(this.AC, JLayeredPane.DRAG_LAYER);
            }
        } else if (GeradorIconeJogador.X(mouseEvent.getX(), mouseEvent.getY())) {
            this.AS = true;
            this.AP = GeradorIconeJogador.U(mouseEvent.getX(), mouseEvent.getY());
            if (this.AP > 0 && ((GeradorIconeJogador)this.AE.get(this.AP)).vf() != null) {
                this.cT(this.AP);
                this.AC = null;
                this.AC = new JLabel();
                this.AC.setIcon(this.a(this.AP, ((GeradorIconeJogador)this.AE.get(this.AP)).x()));
                this.AC.setLocation(mouseEvent.getX() - 25, mouseEvent.getY() + -25);
                this.AC.setSize(this.AC.getWidth(), this.AC.getHeight());
                this.Bp.add((Component)this.AC, new components.RestricaoPosicaoLayout(mouseEvent.getX() - 25, mouseEvent.getY() - 25, 50, 50));
                this.Bp.setLayer(this.AC, JLayeredPane.DRAG_LAYER);
            }
        }
    }

    private void c(MouseEvent mouseEvent) {
        this.X(false);
        if (this.AC != null) {
            this.AC.setVisible(false);
            this.AC = null;
        }
        if (GeradorIconeJogador.V(mouseEvent.getX(), mouseEvent.getY())) {
            if (this.AS) {
                this.AR = true;
            }
            this.AQ = GeradorIconeJogador.S(mouseEvent.getX(), mouseEvent.getY());
            if (this.AQ > 0 && this.AP > 0) {
                this.H(this.AP, this.AQ);
            }
        } else if (GeradorIconeJogador.X(mouseEvent.getX(), mouseEvent.getY())) {
            if (this.AR) {
                this.AS = true;
            }
            this.AQ = GeradorIconeJogador.U(mouseEvent.getX(), mouseEvent.getY());
            if (this.AQ > 0) {
                if (this.AP > 0) {
                    this.H(this.AP, this.AQ);
                }
            } else if (this.AP > 1 && this.AP <= 36) {
                ((GeradorIconeJogador)this.AE.get(this.AP)).x();
            }
        }
        if (this.AR) {
            this.cS(-1);
            this.AR = false;
        }
        if (this.AS) {
            this.cT(-1);
            this.AS = false;
        }
    }

    public void cV(int n2) {
        GeradorIconeJogador ao2 = new GeradorIconeJogador();
        this.AE.add(ao2);
        ao2.vh();
        Collections.swap(this.AE, n2, this.AE.size() - 1);
    }

    public void H(int n2, int n3) {
        boolean bl = false;
        if (n2 < this.AE.size() && n3 < this.AE.size()) {
            if (n2 <= 36) {
                if (n2 > 1 && n2 <= 25 && n3 <= 25) {
                    bl = true;
                } else if (n2 == 1 || n3 < 25) {
                    if (((GeradorIconeJogador)this.AE.get(n2)).vf() != null && ((GeradorIconeJogador)this.AE.get(n3)).vf() != null) {
                        bl = true;
                    }
                } else if ((n2 > 25 || n3 > 25) && ((GeradorIconeJogador)this.AE.get(n2)).vf() != null && ((GeradorIconeJogador)this.AE.get(n3)).vf() != null) {
                    bl = true;
                }
            } else if (((GeradorIconeJogador)this.AE.get(n2)).vf() != null && ((GeradorIconeJogador)this.AE.get(n3)).vf() != null) {
                bl = true;
            }
        }
        if (bl) {
            Collections.swap(this.AE, n2, n3);
            if (n2 > 36) {
                if (((GeradorIconeJogador)this.AE.get(n2)).x() == null) {
                    this.AO.add(((GeradorIconeJogador)this.AE.get(n3)).x());
                    this.AE.remove(n2);
                }
            } else if (n3 > 36 && ((GeradorIconeJogador)this.AE.get(n3)).x() == null) {
                this.AO.add(((GeradorIconeJogador)this.AE.get(n2)).x());
                this.AE.remove(n3);
            }
        }
    }

    public void X(boolean bl) {
        this.Ay.setVisible(bl);
    }

    private void mJ() {
        this.Bp = new TooltipEstatisticasJogador2();
        this.Be = new JCheckBox();
        this.Bl = new JLabel();
        this.vd = new JPanel();
        this.Bn = new JButton();
        this.Bo = new JButton();
        this.vb = new JButton();
        this.ug = new JLabel();
        this.Bf = new JComboBox();
        this.uh = new JLabel();
        this.Bg = new JComboBox();
        this.Bh = new JComboBox();
        this.a_ = new JLabel();
        this.Bi = new JComboBox();
        this.ur = new JLabel();
        this.we = new JPanel();
        this.Bj = new JLabel();
        this.Bb = new JRadioButton();
        this.Ba = new JRadioButton();
        this.Bc = new JRadioButton();
        this.Bk = new JLabel();
        this.vw = new JLabel();
        this.Bm = new JLabel();
        this.zc = new JLabel();
        this.Bd = new JCheckBox();
        this.vy = new JLabel();
        this.vA = new JLabel();
        this.setBackground(new Color(153, 153, 153));
        this.setPreferredSize(new Dimension(1024, 684));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.Bp.setBackground(new Color(128, 141, 128));
        this.Bp.setMinimumSize(new Dimension(480, 679));
        this.Bp.setOpaque(true);
        this.Bp.setPreferredSize(new Dimension(1024, 748));
        this.Bp.setLayout(new LayoutPosicaoAbsoluta());
        this.Be.setBackground(new Color(51, 102, 0));
        this.Be.setForeground(new Color(255, 255, 255));
        this.Be.setText("escala\u00e7\u00e3o padr\u00e3o");
        this.Be.setOpaque(false);
        this.Bp.add((Component)this.Be, new components.RestricaoPosicaoLayout(290, 630, 140, 20));
        this.Bl.setIcon(new ImageIcon(this.getClass().getResource("/aicons/campo.png")));
        this.Bl.setAlignmentY(0.0f);
        this.Bl.setRequestFocusEnabled(false);
        this.Bp.add((Component)this.Bl, new components.RestricaoPosicaoLayout(0, 0, 434, 650));
        this.vd.setBackground(new Color(204, 204, 204));
        this.vd.setLayout(new LayoutPosicaoAbsoluta());
        this.Bn.setIcon(new ImageIcon(this.getClass().getResource("/aicons/ball.png")));
        this.Bn.setText("Jogar >>");
        this.vd.add((Component)this.Bn, new components.RestricaoPosicaoLayout(390, 60, 160, 31));
        this.Bo.setIcon(new ImageIcon(this.getClass().getResource("/aicons/home.png")));
        this.Bo.setText("<< Voltar ao time");
        this.vd.add((Component)this.Bo, new components.RestricaoPosicaoLayout(200, 60, 160, 31));
        this.vb.setIcon(new ImageIcon(this.getClass().getResource("/aicons/tactics.png")));
        this.vb.setText("t\u00e1ticas salvas");
        this.vd.add((Component)this.vb, new components.RestricaoPosicaoLayout(10, 60, 160, 30));
        this.ug.setText("Sele\u00e7\u00e3o Autom\u00e1tica:");
        this.vd.add((Component)this.ug, new components.RestricaoPosicaoLayout(10, 10, 123, -1));
        this.vd.add((Component)this.Bf, new components.RestricaoPosicaoLayout(10, 30, 123, -1));
        this.uh.setText("Estilo de jogo:");
        this.vd.add((Component)this.uh, new components.RestricaoPosicaoLayout(150, 10, -1, -1));
        this.vd.add((Component)this.Bg, new components.RestricaoPosicaoLayout(150, 30, 123, -1));
        this.vd.add((Component)this.Bh, new components.RestricaoPosicaoLayout(288, 30, 123, -1));
        this.a_.setText("Marca\u00e7\u00e3o:");
        this.vd.add((Component)this.a_, new components.RestricaoPosicaoLayout(290, 10, -1, -1));
        this.vd.add((Component)this.Bi, new components.RestricaoPosicaoLayout(428, 30, 123, -1));
        this.ur.setText("Concentrar ataques:");
        this.vd.add((Component)this.ur, new components.RestricaoPosicaoLayout(430, 10, -1, -1));
        this.Bp.add((Component)this.vd, new components.RestricaoPosicaoLayout(450, 630, 560, 100));
        this.we.setBackground(new Color(204, 204, 204));
        this.we.setLayout(new LayoutPosicaoAbsoluta());
        this.Bj.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisat40.png")));
        this.we.add((Component)this.Bj, new components.RestricaoPosicaoLayout(5, 10, -1, 48));
        this.Bb.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisat40.png")));
        this.Bb.setOpaque(false);
        this.we.add((Component)this.Bb, new components.RestricaoPosicaoLayout(385, 10, 40, 50));
        this.Ba.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisat40.png")));
        this.Ba.setOpaque(false);
        this.we.add((Component)this.Ba, new components.RestricaoPosicaoLayout(345, 10, 40, 50));
        this.Bc.setIcon(new ImageIcon(this.getClass().getResource("/aicons/camisat40.png")));
        this.Bc.setOpaque(false);
        this.we.add((Component)this.Bc, new components.RestricaoPosicaoLayout(305, 10, 40, 50));
        this.Bk.setHorizontalAlignment(0);
        this.Bk.setText("");
        this.we.add((Component)this.Bk, new components.RestricaoPosicaoLayout(45, 40, 120, -1));
        this.vw.setHorizontalAlignment(0);
        this.vw.setText("Advers\u00e1rio:");
        this.vw.setToolTipText("");
        this.we.add((Component)this.vw, new components.RestricaoPosicaoLayout(45, 20, 110, -1));
        this.Bm.setHorizontalAlignment(0);
        this.Bm.setText("P\u00e9ssima");
        this.Bm.setFocusable(false);
        this.we.add((Component)this.Bm, new components.RestricaoPosicaoLayout(170, 40, 130, -1));
        this.zc.setHorizontalAlignment(0);
        this.zc.setText("Condi\u00e7\u00e3o do gramado:");
        this.zc.setFocusable(false);
        this.we.add((Component)this.zc, new components.RestricaoPosicaoLayout(170, 20, 130, -1));
        this.Bp.add((Component)this.we, new components.RestricaoPosicaoLayout(10, 660, 430, 70));
        this.Bd.setBackground(new Color(51, 102, 0));
        this.Bd.setFont(new Font("Arial", 0, 12));
        this.Bd.setForeground(new Color(255, 255, 255));
        this.Bd.setText("ver juniores");
        this.Bd.setOpaque(false);
        this.Bp.add((Component)this.Bd, new components.RestricaoPosicaoLayout(880, 185, 140, 20));
        this.vy.setBackground(new Color(51, 51, 51));
        this.vy.setFont(new Font("Arial", 0, 12));
        this.vy.setForeground(new Color(255, 255, 255));
        this.vy.setText("  Jogadores dispon\u00edveis");
        this.vy.setOpaque(true);
        this.Bp.add((Component)this.vy, new components.RestricaoPosicaoLayout(435, 185, 590, 20));
        this.vA.setBackground(new Color(51, 102, 0));
        this.vA.setFont(new Font("Arial", 0, 12));
        this.vA.setForeground(new Color(255, 255, 255));
        this.vA.setText("  Banco de reservas");
        this.vA.setOpaque(true);
        this.Bp.add((Component)this.vA, new components.RestricaoPosicaoLayout(435, 0, 590, 20));
        this.add((Component)this.Bp, new components.RestricaoPosicaoLayout(0, 0, 1024, -1));
    }

    static /* synthetic */ ArrayList a(TelaEscalacao bz2) {
        return bz2.AE;
    }

    static /* synthetic */ int b(TelaEscalacao bz2) {
        return bz2.AU;
    }

    static /* synthetic */ void a(TelaEscalacao bz2, ModeloJogador f2) {
        bz2.u(f2);
    }

    static /* synthetic */ void b(TelaEscalacao bz2, ModeloJogador f2) {
        bz2.x(f2);
    }

    static /* synthetic */ void c(TelaEscalacao bz2, ModeloJogador f2) {
        bz2.v(f2);
    }

    static /* synthetic */ void d(TelaEscalacao bz2, ModeloJogador f2) {
        bz2.w(f2);
    }

    static /* synthetic */ JComboBox c(TelaEscalacao bz2) {
        return bz2.Bf;
    }

    static /* synthetic */ void a(TelaEscalacao bz2, int n2) {
        bz2.cU(n2);
    }

    static /* synthetic */ JComboBox d(TelaEscalacao bz2) {
        return bz2.Bg;
    }

    static /* synthetic */ ModeloTime e(TelaEscalacao bz2) {
        return bz2.zu;
    }

    static /* synthetic */ JComboBox f(TelaEscalacao bz2) {
        return bz2.Bh;
    }

    static /* synthetic */ JComboBox g(TelaEscalacao bz2) {
        return bz2.Bi;
    }

    static /* synthetic */ boolean h(TelaEscalacao bz2) {
        return bz2.AY;
    }

    static /* synthetic */ void a(TelaEscalacao bz2, boolean bl) {
        bz2.AY = bl;
    }

    static /* synthetic */ void b(TelaEscalacao bz2, boolean bl) {
        bz2.W(bl);
    }

    static /* synthetic */ JDialog i(TelaEscalacao bz2) {
        return bz2.ub;
    }

    static /* synthetic */ JCheckBox j(TelaEscalacao bz2) {
        return bz2.Be;
    }

    static /* synthetic */ void a(TelaEscalacao bz2, ImageIcon imageIcon) {
        bz2.AL = imageIcon;
    }

    static /* synthetic */ void b(TelaEscalacao bz2, int n2) {
        bz2.cS(n2);
    }

    static /* synthetic */ void c(TelaEscalacao bz2, int n2) {
        bz2.cT(n2);
    }

    static /* synthetic */ void a(TelaEscalacao bz2, MouseEvent mouseEvent) {
        bz2.d(mouseEvent);
    }

    static /* synthetic */ void b(TelaEscalacao bz2, MouseEvent mouseEvent) {
        bz2.b(mouseEvent);
    }

    static /* synthetic */ void c(TelaEscalacao bz2, MouseEvent mouseEvent) {
        bz2.c(mouseEvent);
    }

    static /* synthetic */ void d(TelaEscalacao bz2, MouseEvent mouseEvent) {
        bz2.a(mouseEvent);
    }
}

