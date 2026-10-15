package editor;

import java.io.File;
import java.io.FilenameFilter;

class FiltroArquivoB16
implements FilenameFilter {
    FiltroArquivoB16() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".b16");
    }
}

