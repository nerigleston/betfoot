package editor;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoBan2
implements FilenameFilter {
    FiltroArquivoBan2() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".ban");
    }
}

