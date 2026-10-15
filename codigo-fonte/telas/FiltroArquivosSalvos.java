package telas;

import telas.DialogoCarregarJogoSalvo;
import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivosSalvos
implements FilenameFilter {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    FiltroArquivosSalvos(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".s22");
    }
}

