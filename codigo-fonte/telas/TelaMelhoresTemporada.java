package telas;

import static motor.GerenciadorJogo.SR;

import telas.RenderizadorPaisLista;
import telas.ListenerFecharTelaMelhoresTemporada;
import telas.ListenerTrocarDivisaoMelhoresTemporada;
import telas.ListenerTrocarLigaMelhoresTemporada;
import telas.ListenerTrocarRodadaMelhoresTemporada;
import telas.OuvinteVazioComboLigaMelhores;
import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.VagasPais;
import components.RestricaoPosicaoLayout;
import components.GeradorIconeJogador;
import competicoes.CompeticaoLigaNacional;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class TelaMelhoresTemporada
extends JPanel {
    private JDialog ub;
    private LigaNacional vt = null;
    private CompeticaoLigaNacional vu = null;
    private int w;
    private JLabel Az = new JLabel();
    private ArrayList AE = new ArrayList();
    private ImageIcon AJ;
    private ImageIcon AL = this.AJ = new ImageIcon(this.getClass().getResource("/aicons/camisat40.png"));
    private ModeloJogador MF = null;
    private JButton vm;
    private JComboBox vv;
    private JComboBox MG;
    private JComboBox ue;
    private JLabel Ds;
    private JLabel vf;
    private JLayeredPane MH;

    public TelaMelhoresTemporada(JDialog jDialog, CompeticaoLigaNacional b_02, LigaNacional z2, int n2) {
        this.ub = jDialog;
        this.vu = b_02;
        this.vt = z2;
        this.w = n2;
        this.mJ();
        this.AE.clear();
        int n3 = 0;
        while (n3 <= 25) {
            GeradorIconeJogador ao2 = new GeradorIconeJogador();
            this.AE.add(ao2);
            ++n3;
        }
        this.mH();
        if (n2 == 1) {
            this.vf.setText("Time do Ano");
        }
        if (this.vt == null) {
            this.vt = (LigaNacional)SR.N().get(0);
        }
        if (this.vu == null) {
            this.vu = (CompeticaoLigaNacional)this.vt.eb().get(0);
        }
        this.mW();
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharTelaMelhoresTemporada(this));
    }

    public void mW() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            this.ue.addItem(((LigaNacional)SR.N().get(n3)).jp());
            if (this.vt == SR.N().get(n3)) {
                n2 = n3;
            }
            ++n3;
        }
        RenderizadorPaisLista aJ2 = new RenderizadorPaisLista();
        this.ue.setRenderer(aJ2);
        this.ue.setMaximumRowCount(12);
        this.ue.setSelectedIndex(n2);
        int n4 = 0;
        while (n4 < this.vt.eb().size()) {
            this.vv.addItem(String.valueOf(Integer.toString(n4 + 1)) + "\u00aa divis\u00e3o");
            ++n4;
        }
        if (this.w == 0) {
            n4 = 0;
            while (n4 < this.vu.yi().zb() - 1) {
                this.MG.addItem(String.valueOf(Integer.toString(n4 + 1)) + " \u00aa rodada");
                ++n4;
            }
        } else {
            n4 = 0;
            while (n4 < SR.H()) {
                this.MG.addItem(Integer.toString(n4 + SR.op()));
                ++n4;
            }
        }
        if (this.vu != null && this.vu.yi().getDivisao() < this.vv.getItemCount()) {
            this.vv.setSelectedIndex(this.vu.yi().getDivisao() - 1);
        }
        this.vv.addActionListener(new ListenerTrocarDivisaoMelhoresTemporada(this));
        this.ue.addActionListener(new ListenerTrocarLigaMelhoresTemporada(this));
        this.MG.addActionListener(new ListenerTrocarRodadaMelhoresTemporada(this));
        if (this.w == 0) {
            if (this.vu != null && this.vu.yi().zb() - 2 < this.MG.getItemCount()) {
                this.MG.setSelectedIndex(this.vu.yi().zb() - 2);
            }
        } else if (SR.H() - 1 < this.MG.getItemCount()) {
            this.MG.setSelectedIndex(SR.H() - 1);
        }
    }

    private void sy() {
        this.MF = null;
        int n2 = 0;
        while (n2 <= 25) {
            ((GeradorIconeJogador)this.AE.get(n2)).vg();
            ++n2;
        }
        int[] nArray = new int[]{1, 9, 3, 5, 2, 11, 13, 14, 16, 22, 24};
        if (this.w == 0) {
            int n3 = this.MG.getSelectedIndex();
            if (n3 < this.vu.zN().size() && n3 >= 0) {
                int n4 = 0;
                while (n4 < ((VagasPais)this.vu.zN().get(n3)).lV().size()) {
                    ((GeradorIconeJogador)this.AE.get(nArray[n4])).a((ModeloJogador)((VagasPais)this.vu.zN().get(n3)).lV().get(n4));
                    if (((VagasPais)this.vu.zN().get(n3)).lW().get(n4) != null) {
                        ((GeradorIconeJogador)this.AE.get(nArray[n4])).h(((ModeloTime)((VagasPais)this.vu.zN().get(n3)).lW().get(n4)).kS());
                        ((GeradorIconeJogador)this.AE.get(nArray[n4])).n((ModeloTime)((VagasPais)this.vu.zN().get(n3)).lW().get(n4));
                    } else {
                        ((GeradorIconeJogador)this.AE.get(nArray[n4])).h(this.AL);
                    }
                    ++n4;
                }
            }
        } else {
            int n5 = this.MG.getSelectedIndex();
            if (n5 < this.vu.zM().size() && n5 >= 0) {
                this.MF = (ModeloJogador)this.vu.zM().get(n5);
            }
            if (n5 < this.vu.zI().size() && n5 >= 0) {
                int n6 = 0;
                while (n6 < ((VagasPais)this.vu.zI().get(n5)).lV().size()) {
                    ((GeradorIconeJogador)this.AE.get(nArray[n6])).a((ModeloJogador)((VagasPais)this.vu.zI().get(n5)).lV().get(n6));
                    if (((VagasPais)this.vu.zI().get(n5)).lW().get(n6) != null) {
                        ((GeradorIconeJogador)this.AE.get(nArray[n6])).h(((ModeloTime)((VagasPais)this.vu.zI().get(n5)).lW().get(n6)).kS());
                        ((GeradorIconeJogador)this.AE.get(nArray[n6])).n((ModeloTime)((VagasPais)this.vu.zI().get(n5)).lW().get(n6));
                    } else {
                        ((GeradorIconeJogador)this.AE.get(nArray[n6])).h(this.AL);
                    }
                    ++n6;
                }
            }
        }
        this.b(-1, this.MF);
    }

    private void b(int n2, ModeloJogador f2) {
        this.g(((GeradorIconeJogador)this.AE.get(0)).a(this.AE, n2, this.AL, true, 1, f2));
    }

    public void g(ImageIcon imageIcon) {
        this.Az.setIcon(null);
        this.Az.setIcon(imageIcon);
        this.MH.add((Component)this.Az, new RestricaoPosicaoLayout(-45, 0, -1, -1));
        this.MH.setLayer(this.Az, JLayeredPane.POPUP_LAYER);
    }

    private void mX() {
        if (this.vv.getSelectedIndex() < this.vt.eb().size()) {
            this.vu = (CompeticaoLigaNacional)this.vt.eb().get(this.vv.getSelectedIndex());
        }
        if (this.w == 0) {
            this.MG.removeAllItems();
            int n2 = 0;
            while (n2 < this.vu.yi().zb() - 1) {
                this.MG.addItem(String.valueOf(Integer.toString(n2 + 1)) + " \u00aa rodada");
                ++n2;
            }
            if (this.vu != null && this.vu.yi().zb() - 2 < this.MG.getItemCount()) {
                this.MG.setSelectedIndex(this.vu.yi().zb() - 2);
            }
        } else if (SR.H() - 1 < this.MG.getItemCount()) {
            this.MG.setSelectedIndex(SR.H() - 1);
        }
    }

    private void mU() {
        this.vt = (LigaNacional)SR.N().get(this.ue.getSelectedIndex());
        this.vv.removeAllItems();
        int n2 = 0;
        while (n2 < this.vt.eb().size()) {
            this.vv.addItem(String.valueOf(Integer.toString(n2 + 1)) + "\u00aa divis\u00e3o");
            ++n2;
        }
        this.vv.setSelectedIndex(0);
        this.mX();
    }

    private void mJ() {
        this.MH = new JLayeredPane();
        this.Ds = new JLabel();
        this.vf = new JLabel();
        this.vm = new JButton();
        this.ue = new JComboBox();
        this.vv = new JComboBox();
        this.MG = new JComboBox();
        this.setBackground(new Color(44, 53, 49));
        this.setLayout(new components.LayoutPosicaoAbsoluta());
        this.MH.setLayout(new components.LayoutPosicaoAbsoluta());
        this.Ds.setIcon(new ImageIcon(this.getClass().getResource("/aiconsj/campo_diminuido.jpg")));
        this.Ds.setAlignmentY(0.0f);
        this.Ds.setRequestFocusEnabled(false);
        this.MH.add((Component)this.Ds, new RestricaoPosicaoLayout(5, 0, 400, 566));
        this.add((Component)this.MH, new RestricaoPosicaoLayout(10, 80, 390, 566));
        this.vf.setFont(new Font("Tahoma", 1, 12));
        this.vf.setForeground(new Color(255, 255, 255));
        this.vf.setText("Time da Rodada");
        this.add((Component)this.vf, new RestricaoPosicaoLayout(10, 15, -1, -1));
        this.vm.setText("X");
        this.add((Component)this.vm, new RestricaoPosicaoLayout(303, 10, 50, -1));
        this.ue.addActionListener(new OuvinteVazioComboLigaMelhores(this));
        this.add((Component)this.ue, new RestricaoPosicaoLayout(10, 50, 120, -1));
        this.add((Component)this.vv, new RestricaoPosicaoLayout(140, 50, 110, -1));
        this.add((Component)this.MG, new RestricaoPosicaoLayout(260, 50, 100, -1));
    }

    private void b(ActionEvent actionEvent) {
    }

    static /* synthetic */ JDialog a(TelaMelhoresTemporada iu_02) {
        return iu_02.ub;
    }

    static /* synthetic */ JComboBox b(TelaMelhoresTemporada iu_02) {
        return iu_02.vv;
    }

    static /* synthetic */ void c(TelaMelhoresTemporada iu_02) {
        iu_02.mX();
    }

    static /* synthetic */ void d(TelaMelhoresTemporada iu_02) {
        iu_02.mU();
    }

    static /* synthetic */ void e(TelaMelhoresTemporada iu_02) {
        iu_02.sy();
    }

    static /* synthetic */ void a(TelaMelhoresTemporada iu_02, ActionEvent actionEvent) {
        iu_02.b(actionEvent);
    }
}

