package adapter.objectAdapter;

import adapter.Ps2;
import adapter.Usber;

public class Ps2Adapter implements Ps2 {
    Usber usber ;

    public Ps2Adapter(Usber usber){
        this.usber = usber;
    }
    @Override
    public void ps2Input() {
        usber.usbInput();
    }
}
