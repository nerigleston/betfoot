package nucleo;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoXml
implements FilenameFilter {
    FiltroArquivoXml() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".xml");
    }
}

