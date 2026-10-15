package nucleo;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoCes
implements FilenameFilter {
    FiltroArquivoCes() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".ces");
    }
}

