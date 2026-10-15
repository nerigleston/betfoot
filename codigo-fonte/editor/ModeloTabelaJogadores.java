package editor;

import nucleo.UtilitariosTexto;
import editor.ComparadorPosicaoJogador;
import editor.ComparadorPosicaoDescendente;
import editor.ComparadorNomeJogador;
import editor.ComparadorStatusJogador;
import editor.ComparadorIdadeJogador;
import modelos.ModeloJogador2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaJogadores
extends AbstractTableModel
implements TableModelListener {
    private String[] Nt;
    private static ArrayList vp = new ArrayList();
    private static int SE = 0;
    private static int VO = 0;
    private static int VP = 0;
    private static int VQ = 0;
    public static Comparator KZ = new ComparadorPosicaoJogador();
    public static Comparator VR = new ComparadorPosicaoDescendente();
    public static Comparator VS = new ComparadorNomeJogador();
    public static Comparator VT = new ComparadorStatusJogador();
    public static Comparator VU = new ComparadorIdadeJogador();

    public ModeloTabelaJogadores() {
        if (UtilitariosTexto.da() != null && UtilitariosTexto.da().wI() != null) {
            if (UtilitariosTexto.da().wK()) {
                vp = UtilitariosTexto.da().wI().getJogadores();
                Collections.sort(vp, VR);
            } else {
                vp = UtilitariosTexto.da().wI().getJuniores();
                Collections.sort(vp, VR);
            }
        }
        this.Nt = new String[]{"", "", "Nome", "Posicao", "Pais", "idade", "Carac.", "Lado"};
    }

    public void Z(int n2, int n3) {
        if (((ModeloJogador2)vp.get(n2)).getStatus() == 0) {
            if (n3 < 15) {
                ((ModeloJogador2)vp.get(n2)).setStatus(1);
            }
        } else if (((ModeloJogador2)vp.get(n2)).getStatus() == 1) {
            ((ModeloJogador2)vp.get(n2)).setStatus(0);
        }
    }

    public void xg() {
    }

    public void xh() {
    }

    public void et(int n2) {
        UtilitariosTexto.da().a((ModeloJogador2)vp.get(n2));
    }

    public void eI(int n2) {
        try {
            vp.remove(n2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return vp.size();
    }

    public Class getColumnClass(int n2) {
        if (this.getValueAt(0, n2) != null) {
            return this.getValueAt(0, n2).getClass();
        }
        return String.class;
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (vp.size() == 0) {
            return null;
        }
        ModeloJogador2 g2 = (ModeloJogador2)vp.get(n2);
        if (n3 == 0) {
            return g2.getStatus();
        }
        if (n3 == 1) {
            if (g2.isTopMundial()) {
                return 2;
            }
            if (g2.isEstrela()) {
                return 1;
            }
            return 0;
        }
        if (n3 == 2) {
            return g2.getNome();
        }
        if (n3 == 3) {
            return nucleo.ConstantesJogo.rH[g2.getPosicao()];
        }
        if (n3 == 4) {
            return Integer.toString(g2.getPais());
        }
        if (n3 == 5) {
            return g2.getIdade();
        }
        if (n3 == 6) {
            return String.valueOf(nucleo.ConstantesJogo.qN[g2.getCr1()]) + "/" + nucleo.ConstantesJogo.qN[g2.getCr2()];
        }
        if (n3 == 7) {
            return nucleo.ConstantesJogo.rK[g2.getLado()];
        }
        return null;
    }

    public void i(int n2, boolean bl) {
        if (n2 == 0) {
            Collections.sort(vp, VT);
            if (VO == 0) {
                VO = -1;
            } else if (VO == -1) {
                VO = 0;
            }
        } else if (n2 == 2) {
            Collections.sort(vp, VS);
            if (VP == 0) {
                VP = -1;
            } else if (VP == -1) {
                VP = 0;
            }
        } else if (n2 == 3) {
            Collections.sort(vp, KZ);
            if (bl) {
                SE = -1;
            } else if (SE == 0) {
                SE = -1;
            } else if (SE == -1) {
                SE = 0;
            }
        } else if (n2 == 5) {
            Collections.sort(vp, VU);
            if (VQ == 0) {
                VQ = -1;
            } else if (VQ == -1) {
                VQ = 0;
            }
        }
    }

    @Override
    public String getColumnName(int n2) {
        return this.Nt[n2];
    }

    @Override
    public void tableChanged(TableModelEvent tableModelEvent) {
    }

    static /* synthetic */ int vG() {
        return SE;
    }

    static /* synthetic */ int xi() {
        return VP;
    }

    static /* synthetic */ int xj() {
        return VO;
    }

    static /* synthetic */ int xk() {
        return VQ;
    }
}

