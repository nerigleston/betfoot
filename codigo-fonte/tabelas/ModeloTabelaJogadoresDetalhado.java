package tabelas;

import telas.PainelBuscaJogadores;
import telas.TelaGerenciamentoClube;
import tabelas.ComparadorJogadoresPosicaoDetalhado;
import nucleo.ModeloJogador;
import motor.GerenciadorJogo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaJogadoresDetalhado
extends AbstractTableModel {
    private String[] Nt;
    private ArrayList vp;
    private static int SE = 1;
    private TelaGerenciamentoClube SO = null;
    private PainelBuscaJogadores SL = null;
    public static Comparator KZ = new ComparadorJogadoresPosicaoDetalhado();

    public ModeloTabelaJogadoresDetalhado(ArrayList arrayList, TelaGerenciamentoClube iA2) {
        this.SO = iA2;
        this.vp = arrayList;
        this.mK();
    }

    public ModeloTabelaJogadoresDetalhado(ArrayList arrayList) {
        this.vp = arrayList;
        this.mK();
    }

    public ModeloTabelaJogadoresDetalhado(ArrayList arrayList, PainelBuscaJogadores gx_02) {
        this.SL = gx_02;
        this.vp = arrayList;
        this.mK();
    }

    private void mK() {
        Collections.sort(this.vp, KZ);
        this.Nt = new String[]{"P", "", "", "Nome", "L", "F", "Sal\u00e1rio", "Valor", "Car.", "GC", "A", "Idade", "V", "E"};
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            this.Nt = new String[]{"", "P", "", "Nome", "L", "Gol", "Des", "Arm", "Fin", "Vel", "Tec", "Pas", "Sal\u00e1rio", "Valor", "Car.", "GC", "A", "Idade", "V", "E"};
        }
        if (this.vp.size() > 0) {
            this.et(0);
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
        if (n2 < this.vp.size()) {
            return this.vp.get(n2);
        }
        return null;
    }

    public void et(int n2) {
        if (this.SO != null) {
            this.SO.s((ModeloJogador)this.vp.get(n2));
        }
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

