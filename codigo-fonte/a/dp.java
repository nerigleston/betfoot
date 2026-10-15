package a;

import a.do_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dp
implements ActionListener {
    final /* synthetic */ do_1 FF;

    dp(do_1 do_) {
        this.FF = do_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.FF.nH();
    }
}

