package nucleo;

import nucleo.ModeloPartida;
import nucleo.ModeloTime;
import java.util.ArrayList;

public class EstatisticasGeraisCompeticao {
    private double cy = 0.0;
    private int V;
    private int W;
    private ModeloPartida cz = null;
    private ArrayList cA = new ArrayList();
    private ModeloTime cB = null;

    public EstatisticasGeraisCompeticao() {
    }

    public EstatisticasGeraisCompeticao(double d2, int n2, int n3, ModeloPartida i2, ModeloTime ah2, ArrayList arrayList) {
        this.cy = d2;
        this.V = n2;
        this.W = n3;
        this.cz = i2;
        this.cB = ah2;
        this.cA = arrayList;
    }

    public String cQ() {
        if (this.cy > 0.0) {
            return String.format("%.1f", this.cy);
        }
        return "--";
    }

    public int y() {
        return this.V;
    }

    public int A() {
        return this.W;
    }

    public ModeloPartida cR() {
        return this.cz;
    }

    public ModeloTime cS() {
        return this.cB;
    }

    public ArrayList cT() {
        return this.cA;
    }
}

