package nucleo;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoBan
implements FilenameFilter {
    FiltroArquivoBan() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".ban");
    }
}

