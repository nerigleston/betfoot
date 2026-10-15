package f;

import best.ah;
import best.at;
import best.l_0;
import best.m_0;
import c.a;
import f.g_0;
import f.z;
import java.io.Serializable;
import java.util.ArrayList;

public class e_0
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private z aac = null;
    private ArrayList cE = new ArrayList();

    public e_0() {
        this.setNome(m_0.getString("recopaS"));
        this.F(8, 1);
    }

    public void zR() {
        this.cE.clear();
        this.aac = null;
        ah ah2 = null;
        ah ah3 = null;
        if (a.SR.aF() != null) {
            ah2 = a.SR.aF().yz();
        }
        if (a.SR.aH() != null) {
            ah3 = a.SR.aH().yz();
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        if (ah2 != null && ah3 != null && ah2 != ah3) {
            this.cE.add(ah3);
            this.cE.add(ah2);
            this.aac = new z(null, this.cE.size(), 8, 0, blArray, this, -1);
            g_0 g_02 = new g_0();
            g_02.a(this.aac, this.cE, 0, true, 0, 0, 8, false);
        }
    }

    @Override
    public void mr() {
        this.aac.z(this);
    }

    public z zS() {
        return this.aac;
    }

    @Override
    public l_0[] mB() {
        l_0[] l_0Array = new l_0[]{this.aac};
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        return null;
    }

    @Override
    public String[] b(l_0 l_02) {
        return this.aac.zB();
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_recopasulamaericana";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

