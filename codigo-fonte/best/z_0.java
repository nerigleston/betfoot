package best;

import java.io.File;
import java.io.FilenameFilter;

class z_0
implements FilenameFilter {
    z_0() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".ces");
    }
}

