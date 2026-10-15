package editor;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoXml2
implements FilenameFilter {
    FiltroArquivoXml2() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".xml");
    }
}

