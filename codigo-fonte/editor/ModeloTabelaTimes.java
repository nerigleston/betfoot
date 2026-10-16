package editor;

import nucleo.UtilitariosTexto;
import editor.ComparadorPaisTime;
import editor.ComparadorNomeTime;
import editor.ModeloTabelaJogadores;
import editor.ComparadorNivelTime;
import modelos.ModeloJogador2;
import modelos.ModeloTime2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaTimes
extends AbstractTableModel {
    private String[] Nt;
    private static ArrayList cE;
    private static int VV;
    private static int VP;
    private static int VW;
    private static int VX;
    private static int VY;
    private static int VZ;
    public static Comparator cN;
    public static Comparator cL;
    public static Comparator VS;

    static {
        VV = 0;
        VP = 0;
        VW = 0;
        VX = 0;
        VY = 0;
        VZ = 0;
        cN = new ComparadorNivelTime();
        cL = new ComparadorPaisTime();
        VS = new ComparadorNomeTime();
    }

    public ModeloTabelaTimes() {
        cE = UtilitariosTexto.cZ();
        this.Nt = new String[]{"Time", "Pais", "Nivel"};
    }

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return cE.size();
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (cE.size() > 0) {
            return cE.get(n2);
        }
        return null;
    }

    @Override
    public String getColumnName(int n2) {
        return this.Nt[n2];
    }

    public void removeRow(int n2) {
        cE.remove(n2);
    }

    public void ai(String string) {
        boolean bl = false;
        if (VX > cE.size()) {
            VX = 0;
        }
        int n2 = VX;
        while (n2 < cE.size()) {
            if (string.length() <= ((ModeloTime2)cE.get(n2)).getNome().length() && string.equalsIgnoreCase(UtilitariosTexto.f(((ModeloTime2)cE.get(n2)).getNome()).substring(0, string.length()))) {
                int n3 = UtilitariosTexto.da().wO().convertRowIndexToView(n2);
                UtilitariosTexto.da().wO().changeSelection(n3, 0, true, true);
                UtilitariosTexto.da().wO().setRowSelectionInterval(n3, n3);
                VX = n2 + 1;
                bl = true;
                break;
            }
            ++n2;
        }
        if (!bl) {
            VX = 0;
        }
    }

    public void aj(String string) {
        boolean bl = false;
        if (VX > cE.size()) {
            VX = 0;
        }
        int n2 = VX;
        while (n2 < cE.size()) {
            if (string.length() <= ((ModeloTime2)cE.get(n2)).getNome().length() && string.equalsIgnoreCase(UtilitariosTexto.f(((ModeloTime2)cE.get(n2)).getNome()).substring(0, string.length()))) {
                UtilitariosTexto.da().wS().xe().changeSelection(n2, 0, true, true);
                UtilitariosTexto.da().wS().xe().setRowSelectionInterval(n2, n2);
                VX = n2 + 1;
                bl = true;
                break;
            }
            ++n2;
        }
        if (!bl) {
            VX = 0;
        }
    }

    public void ak(String string) {
        boolean bl = false;
        if (VY > cE.size()) {
            VY = 0;
        }
        int n2 = VY;
        while (n2 < cE.size()) {
            if (VZ > ((ModeloTime2)cE.get(n2)).getJogadores().size()) {
                VZ = 0;
            }
            int n3 = VZ;
            while (n3 < ((ModeloTime2)cE.get(n2)).getJogadores().size()) {
                if (string.length() <= ((ModeloJogador2)((ModeloTime2)cE.get(n2)).getJogadores().get(n3)).getNome().length() && string.equalsIgnoreCase(UtilitariosTexto.f(((ModeloJogador2)((ModeloTime2)cE.get(n2)).getJogadores().get(n3)).getNome()).substring(0, string.length()))) {
                    int n4 = UtilitariosTexto.da().wO().convertRowIndexToView(n2);
                    UtilitariosTexto.da().wO().changeSelection(n4, 0, true, true);
                    UtilitariosTexto.da().wO().setRowSelectionInterval(n4, n4);
                    UtilitariosTexto.da().wJ().changeSelection(n3, 0, true, true);
                    UtilitariosTexto.da().wJ().setRowSelectionInterval(n3, n3);
                    VZ = n3 + 1;
                    VY = n2;
                    if (n3 + 1 > ((ModeloTime2)cE.get(n2)).getJogadores().size()) {
                        VY = n2 + 1;
                        VZ = 0;
                    }
                    bl = true;
                    break;
                }
                ++n3;
            }
            if (bl) break;
            VZ = 0;
            ++VY;
            ++n2;
        }
        if (!bl) {
            VY = 0;
        }
    }

    public void eJ(int n2) {
        UtilitariosTexto.da().wS().e((ModeloTime2)cE.get(n2));
    }

    public void et(int n2) {
        UtilitariosTexto.da().d((ModeloTime2)cE.get(n2));
        UtilitariosTexto.da().wE();
        ModeloTabelaJogadores ap2 = new ModeloTabelaJogadores();
        UtilitariosTexto.da().wJ().setModel(ap2);
        UtilitariosTexto.da().wH();
        if (UtilitariosTexto.da().wI().getJogadores().size() > 0) {
            UtilitariosTexto.da().wJ().setRowSelectionInterval(0, 0);
        } else {
            UtilitariosTexto.da().a((ModeloJogador2)null);
        }
        UtilitariosTexto.da().wQ().setIcon(new ImageIcon(this.getClass().getResource("/aicons/greencheck.png")));
        UtilitariosTexto.da().wP().setIcon(null);
    }

    public void eK(int n2) {
        if (n2 == 0) {
            Collections.sort(cE, VS);
            if (VP == 0) {
                VP = -1;
            } else if (VP == -1) {
                VP = 0;
            }
        }
        if (n2 == 1) {
            Collections.sort(cE, cL);
            if (VV == 0) {
                VV = -1;
            } else if (VV == -1) {
                VV = 0;
            }
        } else if (n2 == 2) {
            Collections.sort(cE, cN);
            if (VW == 0) {
                VW = -1;
            } else if (VW == -1) {
                VW = 0;
            }
        }
    }

    public Class getColumnClass(int n2) {
        return this.getValueAt(0, n2).getClass();
    }

    public static void eL(int n2) {
        VX = n2;
    }

    static /* synthetic */ int vG() {
        return VW;
    }

    static /* synthetic */ int xi() {
        return VV;
    }

    static /* synthetic */ int xj() {
        return VP;
    }
}

