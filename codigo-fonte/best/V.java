package best;

import java.io.File;
import java.io.FilenameFilter;

class V
implements FilenameFilter {
    V() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".ban");
    }
}

