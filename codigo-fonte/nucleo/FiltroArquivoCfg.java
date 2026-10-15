package nucleo;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoCfg
implements FilenameFilter {
    FiltroArquivoCfg() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".cfg");
    }
}

