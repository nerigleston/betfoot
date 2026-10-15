package a;

import a.dn_0;
import java.io.File;
import java.io.FilenameFilter;

class dS
implements FilenameFilter {
    final /* synthetic */ dn_0 GR;

    dS(dn_0 dn_02) {
        this.GR = dn_02;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.toLowerCase().endsWith(".s22");
    }
}

