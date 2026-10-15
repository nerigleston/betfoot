package nucleo;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoXmlConfig
implements FilenameFilter {
    FiltroArquivoXmlConfig() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".xml");
    }
}

