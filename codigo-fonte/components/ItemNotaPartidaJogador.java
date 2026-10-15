package components;

import nucleo.ModeloPartida;
import nucleo.NotaPartidaJogador;
import motor.GerenciadorJogo;

public class ItemNotaPartidaJogador {
    private double Z = 0.0;
    private ModeloPartida zz = null;

    public ItemNotaPartidaJogador(NotaPartidaJogador j_02) {
        this.Z = j_02.C();
        int n2 = j_02.hM();
        int n3 = j_02.im();
        if (n2 >= 0 && n3 >= 0 && GerenciadorJogo.SR.m(n2) != null && n3 < GerenciadorJogo.SR.m(n2).size()) {
            this.zz = (ModeloPartida)GerenciadorJogo.SR.m(n2).get(n3);
        }
    }

    public double C() {
        return this.Z;
    }

    public void j(double d2) {
        this.Z = d2;
    }

    public ModeloPartida tR() {
        return this.zz;
    }

    public void n(ModeloPartida i2) {
        this.zz = i2;
    }
}

