package tabelas;

import telas.PainelBuscaJogadores;
import tabelas.ComparadorMercadoJogadores;
import nucleo.ModeloJogador;
import motor.GerenciadorJogo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaMercadoJogadores
extends AbstractTableModel {
    private String[] Nt;
    private ArrayList vp;
    private static int SE = 1;
    private PainelBuscaJogadores SL = null;
    public static Comparator KZ = new ComparadorMercadoJogadores();

    public ModeloTabelaMercadoJogadores(ArrayList arrayList, PainelBuscaJogadores gx_02) {
        this.SL = gx_02;
        this.vp = arrayList;
        this.mK();
    }

    private void mK() {
        Collections.sort(this.vp, KZ);
        this.Nt = new String[]{"P", "", "Nome", "Time", "L", "F", "Sal\u00e1rio", "Valor", "Car.", "GC", "Idade", "V", "E"};
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            this.Nt = new String[]{"P", "", "Nome", "Time", "L", "Gol", "Des", "Arm", "Fin", "Vel", "Tec", "Pas", "Sal\u00e1rio", "Valor", "Car.", "GC", "Idade", "V", "E"};
        }
    }

    @Override
    public int getColumnCount() {
        return this.Nt.length;
    }

    @Override
    public int getRowCount() {
        return this.vp.size();
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        if (this.vp.size() > 0) {
            return this.vp.get(n2);
        }
        return null;
    }

    public void et(int n2) {
        this.SL.s((ModeloJogador)this.vp.get(n2));
    }

    @Override
    public String getColumnName(int n2) {
        return this.Nt[n2];
    }

    public Class getColumnClass(int n2) {
        if (this.getValueAt(0, n2) != null) {
            return this.getValueAt(0, n2).getClass();
        }
        return String.class;
    }

    public ArrayList uH() {
        return this.vp;
    }

    static /* synthetic */ int vG() {
        return SE;
    }
}

