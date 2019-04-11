package adapter.classAdapter;

import adapter.Ps2;
import adapter.Usber;

public class Ps2Adapter extends Usber implements Ps2 {
    @Override
    public void ps2Input() {
        usbInput();
    }
}
