package telas;

import telas.DialogoCarregarJogoSalvo;
import javax.swing.JTable;

class TabelaArquivosSalvosSomenteLeitura
extends JTable {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    TabelaArquivosSalvosSomenteLeitura(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public boolean isCellEditable(int n2, int n3) {
        return false;
    }
}

