package telas;

import telas.PainelAnimacaoPenaltis;
import telas.PainelOrdemBatedoresPenaltis;
import telas.PainelTaticaPartida;
import telas.AcaoAtalhoSelecionarJogoPartida;
import telas.OuvinteCliqueListaPartida;
import telas.OuvinteVelocidadePartidaNivel0;
import telas.OuvinteVelocidadePartidaNivel1;
import telas.ListenerTeclaVelocidade2;
import telas.ListenerTeclaVelocidade3;
import telas.ListenerTeclaVelocidade4;
import telas.ListenerTeclaVelocidade5;
import telas.ListenerTemporizadorPartida;
import telas.ListenerSelecaoEventoPartida;
import telas.PainelAnimacaoPenalty;
import telas.PainelEscolhaBatedorPenalty;
import tabelas.RenderizadorPlacarPartidaAoVivo;
import tabelas.ModeloTabelaJogosAoVivo;
import competicoes.CompeticaoSupercopa;
import nucleo.DadosPais;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import competicoes.LigaPontosCorridos;
import motor.GerenciadorJogo;
import components.LayoutPosicaoAbsoluta;
import competicoes.CompeticaoSulAmericana;
import competicoes.CompeticaoLibertadores;
import competicoes.CompeticaoChampionsLeague;
import competicoes.CompeticaoLigaEuropa;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.Timer;

public class PainelPartidaAoVivo
extends JPanel {
    private static JFrame Br;
    private static PainelPartidaAoVivo GS;
    private static ArrayList vK;
    private static int GT;
    public Timer GO = null;
    private static int d;
    private static int dB;
    private boolean GU = false;
    private int GV = -1;
    private int GW = -1;
    private Color GX = new Color(51, 102, 0);
    private static ArrayList zD;
    private static ArrayList zE;
    private static ArrayList GY;
    private static boolean GZ;
    private int Ha = 720;
    private static Competicao Hb;
    private static int Hc;
    private AudioInputStream[] Hd = new AudioInputStream[7];
    private static Clip[] He;
    private JLabel uh;
    private JProgressBar Hf;
    private JScrollPane ut;
    private JLabel Hg;
    private JLabel xI;
    private JLabel Hh;
    private JLabel Hi;
    private JLabel Hj;
    private JLabel Hk;
    private JLabel Hl;
    private JLabel Hm;
    private JLabel Hn;
    private JLabel Ho;
    private JLabel Hp;
    private JPanel Hq;
    private JPanel Hr;
    private JTable Hs;
    private JLabel zM;
    private JLabel Ht;

    static {
        vK = new ArrayList();
        GT = 0;
        d = 1;
        dB = 1;
        zD = new ArrayList();
        zE = new ArrayList();
        GY = new ArrayList();
        GZ = true;
        Hb = null;
        Hc = -1;
        He = new Clip[7];
    }

    public PainelPartidaAoVivo(JFrame jFrame, int n2) {
        Br = jFrame;
        GS = this;
        this.Ha = n2;
        this.mJ();
        this.Hf.setStringPainted(false);
        this.Hf.setForeground(this.GX);
        this.Hf.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.Hf.setMaximum(45);
        this.nc();
        this.mY();
    }

    private void mY() {
        try {
            this.a(this.Hr);
            this.a(this.ut);
            this.a(this.Hs);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(112, 0), "f1");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(113, 0), "f2");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(114, 0), "f3");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(115, 0), "f4");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(116, 0), "f5");
        if (GerenciadorJogo.vL()) {
            jComponent.getInputMap().put(KeyStroke.getKeyStroke(116, 0), "f6");
        }
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "st");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(32, 0), "st");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("st", new AcaoAtalhoSelecionarJogoPartida(this));
        jComponent.getActionMap().put("f1", new OuvinteVelocidadePartidaNivel0(this));
        jComponent.getActionMap().put("f2", new OuvinteVelocidadePartidaNivel1(this));
        jComponent.getActionMap().put("f3", new ListenerTeclaVelocidade2(this));
        jComponent.getActionMap().put("f4", new ListenerTeclaVelocidade3(this));
        jComponent.getActionMap().put("f5", new ListenerTeclaVelocidade4(this));
        jComponent.getActionMap().put("f6", new ListenerTeclaVelocidade5(this));
    }

    private void setVelocidade(int n2) {
        if (n2 < ConstantesJogo.rz.length) {
            d = ConstantesJogo.rz[n2];
        }
    }

    public void Y(ArrayList arrayList) {
        Rectangle rectangle;
        Object object;
        int n2;
        int n3;
        GT = 0;
        vK.clear();
        dB = 1;
        this.GU = false;
        GZ = true;
        int n4 = 0;
        while (n4 < arrayList.size()) {
            n3 = 1;
            n2 = 0;
            while (n2 < GerenciadorJogo.SR.S().size()) {
                if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() == arrayList.get(n4)) {
                    if (n3 != 0) {
                        if (n4 == 0) {
                            this.a(((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy(), ((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).ht());
                        }
                        if (n4 != -1) {
                            object = new components.ItemPartidaAoVivo();
                            ((components.ItemPartidaAoVivo)object).L(this.a(((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy(), (nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2), ((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).ht()));
                            vK.add(object);
                        }
                        n3 = 0;
                    }
                    object = new components.ItemPartidaAoVivo();
                    ((components.ItemPartidaAoVivo)object).n((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2));
                    ((components.ItemPartidaAoVivo)object).tW();
                    if (((components.ItemPartidaAoVivo)object).tR().hc() != null) {
                        ((components.ItemPartidaAoVivo)object).tR().hc().Q(((components.ItemPartidaAoVivo)object).tR().hp());
                        ((components.ItemPartidaAoVivo)object).tR().hc().O(((components.ItemPartidaAoVivo)object).tR().hp());
                    }
                    if (((components.ItemPartidaAoVivo)object).tR().hd() != null) {
                        ((components.ItemPartidaAoVivo)object).tR().hd().Q(((components.ItemPartidaAoVivo)object).tR().hq());
                        ((components.ItemPartidaAoVivo)object).tR().hd().O(((components.ItemPartidaAoVivo)object).tR().hq());
                    }
                    if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy().b() == 7) {
                        rectangle = null;
                        ((components.ItemPartidaAoVivo)object).p(((components.ItemPartidaAoVivo)object).tR().ik());
                    } else if (((components.ItemPartidaAoVivo)object).tR().ev() == null) {
                        if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy().b() == 4) {
                            if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() instanceof CompeticaoChampionsLeague) {
                                ((components.ItemPartidaAoVivo)object).p(CompeticaoChampionsLeague.yD());
                            } else if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() instanceof CompeticaoLibertadores) {
                                ((components.ItemPartidaAoVivo)object).p(CompeticaoLibertadores.yD());
                            }
                        } else if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy().b() == 6) {
                            if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() instanceof CompeticaoSulAmericana) {
                                ((components.ItemPartidaAoVivo)object).p(CompeticaoSulAmericana.yD());
                            } else if (((nucleo.ModeloPartida)GerenciadorJogo.SR.S().get(n2)).hy() instanceof CompeticaoLigaEuropa) {
                                ((components.ItemPartidaAoVivo)object).p(CompeticaoLigaEuropa.yD());
                            }
                        }
                    }
                    vK.add(object);
                }
                ++n2;
            }
            ++n4;
        }
        n4 = 0;
        this.GW = -1;
        n3 = 0;
        n2 = 0;
        while (n2 < vK.size()) {
            if (((components.ItemPartidaAoVivo)vK.get(n2)).ei()) {
                n4 = 1;
                this.GW = n2;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < vK.size()) {
            if (((components.ItemPartidaAoVivo)vK.get(n2)).ei()) {
                ++n3;
            }
            ++n2;
        }
        if (n4 != 0 && this.GW >= 0) {
            this.pZ();
        } else {
            this.Hr.setVisible(false);
        }
        n2 = GerenciadorJogo.SR.getVelocidade();
        if (n4 == 0) {
            n2 = GerenciadorJogo.SR.getVelocidadeNH();
        }
        d = n4 != 0 ? ConstantesJogo.rz[n2] : ConstantesJogo.rA[n2];
        if (GerenciadorJogo.SR.bD()) {
            d = 1;
        }
        PainelPartidaAoVivo.GS.Hs.addNotify();
        if (this.GW >= 20) {
            object = (JViewport)PainelPartidaAoVivo.GS.Hs.getParent();
            rectangle = PainelPartidaAoVivo.GS.Hs.getCellRect(this.GW + 8, 0, true);
            Point point = ((JViewport)object).getViewPosition();
            rectangle.setLocation(rectangle.x - point.x, rectangle.y - point.y);
            PainelPartidaAoVivo.GS.Hs.scrollRectToVisible(rectangle);
        }
        Hc = this.GW;
        this.qf();
        this.oR();
    }

    public void pZ() {
        this.Hr.setVisible(true);
        this.Hp.setBackground(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hc().kB());
        this.Hp.setForeground(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hc().kC());
        this.Hp.setText(String.valueOf(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hc().getNome()) + " ");
        this.Ho.setBackground(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hd().kB());
        this.Ho.setForeground(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hd().kC());
        this.Ho.setText(" " + ((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hd().getNome());
        this.Hh.setIcon(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hc().kP());
        this.Hi.setIcon(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hd().kP());
        if (((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().ev() != null) {
            this.Hl.setText(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().ev().dS());
            this.Hm.setText(Integer.toString(((components.ItemPartidaAoVivo)vK.get(this.GW)).hU()));
        } else if (((components.ItemPartidaAoVivo)vK.get(this.GW)).ik() != null) {
            this.Hl.setText(((components.ItemPartidaAoVivo)vK.get(this.GW)).ik());
            this.Hm.setText("");
        } else {
            this.Hl.setText("");
            this.Hm.setText("");
        }
        this.Hj.setText("");
        this.Hk.setText("");
        this.Hj.setIcon(null);
        this.Hk.setIcon(null);
        this.Hn.setText("0 x 0");
        this.xI.setText("");
        if (((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hy() != null) {
            this.Ht.setText(this.a(((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().hy(), ((components.ItemPartidaAoVivo)vK.get(this.GW)).tR(), ((components.ItemPartidaAoVivo)vK.get(this.GW)).tR().ht()));
        } else {
            this.Ht.setText("");
        }
    }

    private String a(Competicao at2, nucleo.ModeloPartida i2, FaseCompeticao l_02) {
        String string = "";
        if (at2.b() == 3 && GerenciadorJogo.SR.isVerEstaduaisAgrupados()) {
            string = String.valueOf(ConstantesJogo.rZ[at2.el()]) + " - " + at2.is() + " - " + i2.hJ()[1];
        } else if (at2.b() == 3) {
            string = String.valueOf(at2.is()) + " - " + i2.hJ()[1];
        } else if (at2.b() == 1) {
            string = String.valueOf(at2.is()) + " - " + i2.hJ()[1];
            if (l_02 != null && l_02 instanceof ChaveMataMata) {
                if (((ChaveMataMata)l_02).zf() == 1099) {
                    string = "Mata Mata Ascenso - " + i2.hJ()[1];
                } else if (((ChaveMataMata)l_02).zf() == 1098) {
                    string = "Playoff rebaixamento - " + i2.hJ()[1];
                }
            }
        } else if (at2.b() == 10) {
            string = String.valueOf(at2.getNome()) + " - " + i2.hJ()[1];
        } else if (at2.b() == 7 && at2.el() != 7) {
            string = String.valueOf(at2.getNome()) + " - " + i2.hJ()[1];
        } else if (at2.b() == 9) {
            if (at2.el() < ConstantesJogo.sa.length) {
                string = String.valueOf(ConstantesJogo.sa[at2.el()]) + " - " + i2.hJ()[1];
            } else if (at2.el() == 70) {
                string = "Classificat\u00f3rio Eurocopa - " + i2.hJ()[1];
            }
            if (l_02 != null && l_02 instanceof LigaPontosCorridos && ((LigaPontosCorridos)l_02).ze() == 7701) {
                string = "Torneio Repescagem";
            }
        } else {
            string = at2 instanceof CompeticaoSupercopa ? "Supercopa " + DadosPais.bt(((CompeticaoSupercopa)at2).getPais()) : (at2.b() == 8 ? at2.getNome() : i2.hJ()[1]);
        }
        return string;
    }

    private void a(Competicao at2, FaseCompeticao l_02) {
        String string = "";
        if (at2 != null) {
            if (at2.b() == 3) {
                string = GerenciadorJogo.SR.isVerEstaduaisAgrupados() ? "Campeonatos estaduais" : "Campeonato " + ConstantesJogo.rZ[at2.el()];
            } else if (at2.b() == 1) {
                if (at2.iq() != null) {
                    string = "Campeonato " + DadosPais.bs(at2.iq().jc());
                }
            } else if (at2.b() == 10) {
                string = "Regional";
            } else if (at2.b() == 7 && at2.el() != 7) {
                string = "Copas de Sele\u00e7\u00f5es";
            } else if (at2.b() == 7 && at2.el() == 7) {
                string = "Copas do Mundo";
            } else if (at2.b() == 11) {
                string = "Supercopa Nacional";
            } else if (at2.b() == 8) {
                string = "Recopa";
            } else if (at2.b() == 9) {
                string = "Eliminat\u00f3rias";
                if (l_02 != null && l_02 instanceof LigaPontosCorridos && ((LigaPontosCorridos)l_02).ze() == 7701) {
                    string = "Eliminat\u00f3rias - Repescagem";
                }
            } else {
                string = at2.getNome();
            }
        }
        this.Hg.setText(string);
    }

    public void oR() {
        if (this.GO == null) {
            this.GO = new Timer(d, new ListenerTemporizadorPartida(this));
            this.GO.setRepeats(false);
            this.GO.start();
        } else {
            this.GO.restart();
        }
    }

    public void qa() {
        boolean bl = false;
        ++GT;
        if (dB == 1) {
            if (GT > 48) {
                this.qg();
            }
        } else if (dB == 2 && GT >= 51) {
            bl = true;
        }
        if (PainelPartidaAoVivo.qj() < 45) {
            this.uh.setText(String.valueOf(Integer.toString(PainelPartidaAoVivo.qj())) + "'" + " - " + Integer.toString(dB) + "\u00ba tempo");
            this.Hf.setValue(PainelPartidaAoVivo.qj());
        } else {
            this.uh.setText("Acr\u00e9scimos");
        }
        if (bl) {
            this.uh.setText("Fim de jogo");
            this.qc();
        } else {
            this.aa(false);
        }
    }

    public static void qb() {
        try {
            int n2 = 0;
            while (n2 < He.length) {
                if (He[n2] != null) {
                    He[n2].close();
                    PainelPartidaAoVivo.He[n2] = null;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void qc() {
        if (!this.GU) {
            this.GU = true;
            this.dk(1);
            this.qe();
            this.qd();
            if (GY.size() > 0) {
                int n2 = 0;
                while (n2 < GY.size()) {
                    this.g((nucleo.ModeloPartida)GY.get(n2));
                    ++n2;
                }
            }
            nucleo.AgrupadorCompeticoesRodada.dJ();
        }
    }

    private void g(nucleo.ModeloPartida i2) {
        ArrayList arrayList;
        if (!i2.hc().jZ().booleanValue() && !i2.hd().jZ().booleanValue()) {
            arrayList = new ArrayList();
            arrayList.addAll(i2.hp());
            Collections.sort(arrayList, ColecaoComparadoresSorteio.abg);
            zD = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(i2.hq());
            Collections.sort(arrayList2, ColecaoComparadoresSorteio.abg);
            zE = arrayList2;
        } else {
            if (i2.hc().jZ().booleanValue()) {
                this.a(i2, i2.hc());
            } else {
                arrayList = new ArrayList();
                arrayList.addAll(i2.hp());
                Collections.sort(arrayList, ColecaoComparadoresSorteio.abg);
                zD = arrayList;
            }
            if (i2.hd().jZ().booleanValue()) {
                this.a(i2, i2.hd());
            } else {
                arrayList = new ArrayList();
                arrayList.addAll(i2.hq());
                Collections.sort(arrayList, ColecaoComparadoresSorteio.abg);
                zE = arrayList;
            }
        }
        JDialog jDialog = new JDialog(Br);
        PainelAnimacaoPenaltis bg_02 = new PainelAnimacaoPenaltis(jDialog, i2);
        jDialog.add(bg_02);
        jDialog.setSize(469, 602);
        jDialog.setPreferredSize(new Dimension(469, 602));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    private void a(nucleo.ModeloPartida i2, ModeloTime ah2) {
        JDialog jDialog = new JDialog(Br);
        PainelOrdemBatedoresPenaltis c_02 = new PainelOrdemBatedoresPenaltis(jDialog, ah2, i2);
        jDialog.add(c_02);
        jDialog.setSize(500, 519);
        jDialog.setPreferredSize(new Dimension(500, 519));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    private void qd() {
        GY.clear();
        int n2 = 0;
        while (n2 < vK.size()) {
            if (((components.ItemPartidaAoVivo)vK.get(n2)).tR() != null && ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hS() && ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hk()) {
                if (((components.ItemPartidaAoVivo)vK.get(n2)).tR().hc().jZ().booleanValue() || ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hd().jZ().booleanValue()) {
                    GY.add(((components.ItemPartidaAoVivo)vK.get(n2)).tR());
                } else if (GerenciadorJogo.SR.getVerDecisaoPenNaoHumano() == 1) {
                    GY.add(((components.ItemPartidaAoVivo)vK.get(n2)).tR());
                }
            }
            ++n2;
        }
    }

    public void qe() {
        int n2 = 0;
        while (n2 < vK.size()) {
            boolean bl = false;
            if (((components.ItemPartidaAoVivo)vK.get(n2)).tR() != null && ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hu() != ((components.ItemPartidaAoVivo)vK.get(n2)).tT()) {
                bl = true;
            }
            if (bl) {
                ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hF();
            }
            ++n2;
        }
    }

    public File dj(int n2) {
        return GerenciadorJogo.dj(n2);
    }

    private void qf() {
        if (GerenciadorJogo.SR.isUsaSons()) {
            int n2 = 0;
            while (n2 < this.Hd.length) {
                File file = this.dj(n2);
                if (file != null) {
                    try {
                        this.Hd[n2] = AudioSystem.getAudioInputStream(file);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                ++n2;
            }
        }
    }

    public void dk(int n2) {
        if (GerenciadorJogo.SR.isUsaSons()) {
            Object var2_2 = null;
            if (n2 < this.Hd.length && this.Hd[n2] != null) {
                if (He[n2] == null) {
                    try {
                        PainelPartidaAoVivo.He[n2] = AudioSystem.getClip();
                        He[n2].open(this.Hd[n2]);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (He[n2] != null) {
                    try {
                        He[n2].stop();
                        He[n2].setFramePosition(0);
                        He[n2].start();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
        }
    }

    public void dl(int n2) {
        if (GerenciadorJogo.SR.isUsaSons()) {
            AudioInputStream audioInputStream = null;
            Clip clip = null;
            try {
                File file = this.dj(n2);
                if (file != null) {
                    audioInputStream = AudioSystem.getAudioInputStream(file);
                }
            }
            catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                unsupportedAudioFileException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            try {
                if (audioInputStream != null) {
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                }
            }
            catch (LineUnavailableException lineUnavailableException) {
                lineUnavailableException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public boolean dm(int n2) {
        if (!GerenciadorJogo.SR.isUsaSons()) {
            return false;
        }
        AudioInputStream audioInputStream = null;
        try {
            File file = this.dj(n2);
            if (file != null) {
                audioInputStream = AudioSystem.getAudioInputStream(file);
            }
        }
        catch (UnsupportedAudioFileException unsupportedAudioFileException) {
            unsupportedAudioFileException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            if (audioInputStream != null) {
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                clip.close();
            }
        }
        catch (LineUnavailableException lineUnavailableException) {
            lineUnavailableException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return true;
    }

    public void qg() {
        int n2;
        GT = 0;
        dB = 2;
        if (GerenciadorJogo.SR.getVerJanelaSubs() == 1) {
            this.dk(0);
            this.uh.setText("Intervalo");
            n2 = 0;
            while (n2 < vK.size()) {
                if (((components.ItemPartidaAoVivo)vK.get(n2)).ei()) {
                    this.e(n2, true);
                }
                ++n2;
            }
        }
        n2 = 0;
        while (n2 < vK.size()) {
            if (((components.ItemPartidaAoVivo)vK.get(n2)).ei()) {
                ((components.ItemPartidaAoVivo)vK.get(n2)).tR().m(2, 0);
            }
            ++n2;
        }
        this.Hj.setText("");
        this.Hj.setIcon(null);
        this.Hk.setIcon(null);
        this.Hk.setText("");
    }

    public void aa(boolean bl) {
        int n2;
        if (!bl) {
            n2 = 0;
            while (n2 < vK.size()) {
                if (((components.ItemPartidaAoVivo)vK.get(n2)).ei()) {
                    int[] nArray = ((components.ItemPartidaAoVivo)vK.get(n2)).tR().ib();
                    if (nArray[dB] <= GT) {
                        ((components.ItemPartidaAoVivo)vK.get(n2)).tR().q(GT, dB);
                    }
                    if (n2 == this.GW) {
                        this.xI.setText(((components.ItemPartidaAoVivo)vK.get(n2)).tR().ha());
                    }
                }
                ++n2;
            }
        }
        n2 = 0;
        while (n2 < vK.size()) {
            if (((components.ItemPartidaAoVivo)vK.get(n2)).tR() != null) {
                int n3 = 0;
                while (n3 < ((components.ItemPartidaAoVivo)vK.get(n2)).tR().hE().size()) {
                    if (!((nucleo.EventoPartida)((components.ItemPartidaAoVivo)vK.get(n2)).tR().hE().get(n3)).isDone() && ((nucleo.EventoPartida)((components.ItemPartidaAoVivo)vK.get(n2)).tR().hE().get(n3)).en() == dB && ((nucleo.EventoPartida)((components.ItemPartidaAoVivo)vK.get(n2)).tR().hE().get(n3)).em() <= GT) {
                        this.a((components.ItemPartidaAoVivo)vK.get(n2), ((components.ItemPartidaAoVivo)vK.get(n2)).tR(), (nucleo.EventoPartida)((components.ItemPartidaAoVivo)vK.get(n2)).tR().hE().get(n3), n2);
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        if (PainelPartidaAoVivo.GS.GV >= 0) {
            GZ = false;
            GS.e(PainelPartidaAoVivo.GS.GV, false);
            GZ = true;
            PainelPartidaAoVivo.GS.GV = -1;
        }
        PainelPartidaAoVivo.GS.Hs.addNotify();
        if (GZ) {
            GS.oR();
        }
    }

    public void a(components.ItemPartidaAoVivo v2, nucleo.ModeloPartida i2, nucleo.EventoPartida a_02, int n2) {
        if (a_02.b() == 8) {
            a_02.p(true);
        }
        if (!a_02.isDone()) {
            a_02.p(true);
            int n3 = 0;
            if (a_02.cu() == i2.hc()) {
                n3 = 1;
            } else if (a_02.cu() == i2.hd()) {
                n3 = 2;
            }
            if (n3 > 0) {
                v2.a(a_02);
                if (a_02.b() == 1) {
                    if (a_02.el() == 3 && v2.ei()) {
                        this.dk(4);
                        if (!a_02.cu().jZ().booleanValue()) {
                            this.b(v2, a_02);
                        } else {
                            this.a(v2, a_02);
                        }
                        a_02.q(true);
                    } else {
                        v2.dJ(n3);
                        if (v2.ei()) {
                            if (a_02.cu().jZ().booleanValue()) {
                                this.dk(2);
                            } else {
                                this.dk(3);
                            }
                        }
                    }
                } else if (a_02.b() == 3 || a_02.b() == 4) {
                    if (v2.ei()) {
                        this.dk(5);
                    }
                    if (a_02.cu().jZ().booleanValue()) {
                        GS.e(n2, false);
                    }
                } else if (a_02.b() == 5) {
                    if (v2.ei()) {
                        this.dk(6);
                    }
                    if (a_02.cu().jZ().booleanValue()) {
                        GS.e(n2, false);
                    }
                }
            }
            PainelPartidaAoVivo.GS.Hs.addNotify();
            if (this.Hr.isVisible() && this.GW >= 0 && this.GW == n2) {
                this.Hn.setText(String.valueOf(v2.tT()) + " x " + v2.tU());
                if (n3 == 1) {
                    this.Hj.setText(v2.tV().er());
                    this.Hj.setIcon(v2.tV().es());
                } else {
                    this.Hk.setText(v2.tV().er());
                    this.Hk.setIcon(v2.tV().es());
                }
            }
        }
    }

    private void a(components.ItemPartidaAoVivo v2, nucleo.EventoPartida a_02) {
        ArrayList arrayList = a_02.cu() == v2.tR().hc() ? v2.tR().hp() : v2.tR().hq();
        JDialog jDialog = new JDialog(Br);
        PainelEscolhaBatedorPenalty gh_02 = new PainelEscolhaBatedorPenalty(jDialog, a_02, arrayList);
        jDialog.add(gh_02);
        jDialog.setSize(400, 350);
        jDialog.setPreferredSize(new Dimension(400, 350));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.b(v2, a_02);
    }

    private void b(components.ItemPartidaAoVivo v2, nucleo.EventoPartida a_02) {
        JDialog jDialog = new JDialog(Br);
        PainelAnimacaoPenalty gb2 = new PainelAnimacaoPenalty(jDialog, v2, a_02, a_02.eo(), this);
        jDialog.add(gb2);
        jDialog.setSize(402, 202);
        jDialog.setPreferredSize(new Dimension(402, 202));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public String h(nucleo.ModeloPartida i2) {
        String string = null;
        int n2 = -1;
        n2 = i2.hy().b();
        if (n2 == 3) {
            string = String.valueOf(i2.hy().getNome()) + " " + i2.hy().ip();
        }
        return string;
    }

    public void nc() {
        ModeloTabelaJogosAoVivo m_02 = new ModeloTabelaJogosAoVivo(this);
        this.Hs.setModel(m_02);
        int[] nArray = new int[]{250, 200, 40, 40, 200, 300};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.Hs.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.Hs.setAutoResizeMode(3);
        this.Hs.setRowHeight(25);
        this.Hs.setTableHeader(null);
        this.Hs.setShowGrid(false);
        this.Hs.setDefaultRenderer(components.ItemPartidaAoVivo.class, new RenderizadorPlacarPartidaAoVivo());
        this.Hs.setIntercellSpacing(new Dimension(5, 5));
        this.Hs.setAutoCreateRowSorter(false);
        this.Hs.setCellSelectionEnabled(false);
        this.Hs.setRowSelectionAllowed(false);
        this.Hs.setBackground(ConstantesJogo.ot);
        this.Hs.setSelectionBackground(new Color(51, 102, 0));
        this.Hs.setFillsViewportHeight(true);
        this.mH();
    }

    private void qh() {
        if (Hc >= 0) {
            this.GV = Hc;
        }
    }

    private void mH() {
        this.Hs.addMouseListener(new ListenerSelecaoEventoPartida(this));
        OuvinteCliqueListaPartida dX2 = new OuvinteCliqueListaPartida(this);
        this.Hn.addMouseListener(dX2);
        this.Ho.addMouseListener(dX2);
        this.Hp.addMouseListener(dX2);
        this.Hl.addMouseListener(dX2);
        this.Hm.addMouseListener(dX2);
        this.xI.addMouseListener(dX2);
        this.Hh.addMouseListener(dX2);
        this.Hi.addMouseListener(dX2);
    }

    private void e(int n2, boolean bl) {
        JDialog jDialog = new JDialog(Br);
        PainelTaticaPartida cd_02 = new PainelTaticaPartida(jDialog, (components.ItemPartidaAoVivo)vK.get(n2), bl);
        jDialog.add(cd_02);
        jDialog.setSize(966, 726);
        jDialog.setPreferredSize(new Dimension(1024, 663));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    public ArrayList qi() {
        return vK;
    }

    public static int qj() {
        return GT;
    }

    public static int en() {
        return dB;
    }

    public static ArrayList qk() {
        return zD;
    }

    public static ArrayList ql() {
        return zE;
    }

    public static void a(int n2, ArrayList arrayList) {
        if (n2 == 1) {
            zD = arrayList;
        } else {
            zE = arrayList;
        }
    }

    public static Competicao qm() {
        return Hb;
    }

    public static void v(Competicao at2) {
        Hb = at2;
    }

    public static boolean qn() {
        return GZ;
    }

    public static void ab(boolean bl) {
        GZ = bl;
    }

    private void mJ() {
        this.Hq = new JPanel();
        this.Hg = new JLabel();
        this.Hf = new JProgressBar();
        this.uh = new JLabel();
        this.Hr = new JPanel();
        this.xI = new JLabel();
        this.Hn = new JLabel();
        this.Hh = new JLabel();
        this.Hi = new JLabel();
        this.Ho = new JLabel();
        this.Hp = new JLabel();
        this.Hk = new JLabel();
        this.Hm = new JLabel();
        this.Hj = new JLabel();
        this.Hl = new JLabel();
        this.Ht = new JLabel();
        this.zM = new JLabel();
        this.ut = new JScrollPane();
        this.Hs = new JTable();
        this.setBackground(ConstantesJogo.ou);
        this.setPreferredSize(new Dimension(1024, 710));
        this.Hq.setBackground(ConstantesJogo.ou);
        this.zM.setBackground(ConstantesJogo.ou);
        this.zM.setOpaque(true);
        this.Hq.setOpaque(true);
        this.Hq.setPreferredSize(new Dimension(1024, 40));
        this.Hg.setFont(new Font("Tahoma", 1, 14));
        this.Hg.setForeground(new Color(255, 255, 153));
        this.Hg.setText("Informa\u00e7\u00e3o da rodada");
        this.uh.setFont(new Font("Tahoma", 1, 12));
        this.uh.setForeground(new Color(255, 255, 255));
        this.uh.setText("Tempo");
        GroupLayout groupLayout = new GroupLayout(this.Hq);
        this.Hq.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Hg, -2, 566, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE).addComponent(this.Hf, -2, 115, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.uh, -2, 160, -2).addGap(71, 71, 71)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Hf, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Hg, GroupLayout.Alignment.LEADING).addComponent(this.uh, GroupLayout.Alignment.LEADING)).addGap(0, 3, Short.MAX_VALUE))).addContainerGap()));
        this.Hr.setBackground(new Color(0, 0, 0));
        this.Hr.setPreferredSize(new Dimension(1024, 40));
        this.Hr.setLayout(new LayoutPosicaoAbsoluta());
        this.xI.setForeground(new Color(255, 255, 255));
        this.xI.setHorizontalAlignment(0);
        this.xI.setText("Posse de bola");
        this.Hr.add((Component)this.xI, new components.RestricaoPosicaoLayout(800, 4, 190, 120));
        this.Hn.setFont(new Font("Tahoma", 1, 24));
        this.Hn.setForeground(new Color(255, 255, 255));
        this.Hn.setHorizontalAlignment(0);
        this.Hn.setText("3 x  1");
        this.Hr.add((Component)this.Hn, new components.RestricaoPosicaoLayout(430, 40, 100, -1));
        this.Hh.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.Hr.add((Component)this.Hh, new components.RestricaoPosicaoLayout(170, 20, -1, -1));
        this.Hi.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.Hr.add((Component)this.Hi, new components.RestricaoPosicaoLayout(725, 20, -1, -1));
        this.Ho.setFont(new Font("Tahoma", 1, 12));
        this.Ho.setForeground(new Color(255, 255, 255));
        this.Ho.setText("Tempo");
        this.Ho.setOpaque(true);
        this.Hr.add((Component)this.Ho, new components.RestricaoPosicaoLayout(537, 40, 180, 30));
        this.Hp.setBackground(new Color(153, 153, 0));
        this.Hp.setFont(new Font("Tahoma", 1, 12));
        this.Hp.setForeground(new Color(255, 255, 255));
        this.Hp.setHorizontalAlignment(4);
        this.Hp.setText("Informa\u00e7\u00e3o da rodada");
        this.Hp.setOpaque(true);
        this.Hr.add((Component)this.Hp, new components.RestricaoPosicaoLayout(235, 40, 190, 30));
        this.Hk.setFont(new Font("Tahoma", 0, 12));
        this.Hk.setForeground(new Color(255, 255, 204));
        this.Hk.setHorizontalAlignment(2);
        this.Hr.add((Component)this.Hk, new components.RestricaoPosicaoLayout(530, 90, 280, 30));
        this.Hm.setFont(new Font("Tahoma", 1, 12));
        this.Hm.setForeground(new Color(255, 255, 255));
        this.Hm.setHorizontalAlignment(4);
        this.Hm.setText("Informa\u00e7\u00e3o da rodada");
        this.Hr.add((Component)this.Hm, new components.RestricaoPosicaoLayout(10, 60, 150, -1));
        this.Hj.setFont(new Font("Tahoma", 0, 12));
        this.Hj.setForeground(new Color(255, 255, 204));
        this.Hj.setHorizontalAlignment(4);
        this.Hr.add((Component)this.Hj, new components.RestricaoPosicaoLayout(110, 90, 300, 30));
        this.Hl.setFont(new Font("Tahoma", 1, 12));
        this.Hl.setForeground(new Color(255, 255, 255));
        this.Hl.setHorizontalAlignment(4);
        this.Hl.setText("Informa\u00e7\u00e3o da rodada");
        this.Hr.add((Component)this.Hl, new components.RestricaoPosicaoLayout(10, 40, 150, -1));
        this.Ht.setForeground(new Color(255, 255, 255));
        this.Ht.setHorizontalAlignment(0);
        this.Ht.setText("semifinal");
        this.Hr.add((Component)this.Ht, new components.RestricaoPosicaoLayout(240, 10, 480, -1));
        this.zM.setIcon(new ImageIcon(this.getClass().getResource("/aiconsj/panelh.png")));
        this.zM.setToolTipText("");
        this.Hr.add((Component)this.zM, new components.RestricaoPosicaoLayout(0, 0, 1008, 130));
        this.ut.setBackground(new Color(0, 51, 0));
        this.ut.setBorder(BorderFactory.createCompoundBorder());
        this.ut.setViewportView(this.Hs);
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Hq, -2, -1, -2).addGroup(groupLayout2.createSequentialGroup().addGap(10, 10, 10).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Hr, -2, 1008, -2).addGroup(groupLayout2.createSequentialGroup().addComponent(this.ut).addGap(3, 3, 3))).addGap(10, 10, 10)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.Hq, -2, -1, -2).addGap(0, 0, 0).addComponent(this.Hr, -2, 130, -2).addGap(20, 20, 20).addComponent(this.ut, -1, 438, Short.MAX_VALUE).addGap(20, 20, 20)));
    }

    static /* synthetic */ void a(PainelPartidaAoVivo dV2) {
        dV2.qh();
    }

    static /* synthetic */ void a(PainelPartidaAoVivo dV2, int n2) {
        dV2.setVelocidade(n2);
    }

    static /* synthetic */ JTable b(PainelPartidaAoVivo dV2) {
        return dV2.Hs;
    }

    static /* synthetic */ ArrayList qo() {
        return vK;
    }

    static /* synthetic */ void b(PainelPartidaAoVivo dV2, int n2) {
        dV2.GV = n2;
    }

    static /* synthetic */ int c(PainelPartidaAoVivo dV2) {
        return dV2.GW;
    }
}

