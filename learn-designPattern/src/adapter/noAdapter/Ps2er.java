package adapter.noAdapter;

import adapter.Ps2;
import adapter.Usber;

 class Ps2er implements Ps2 {
    @Override
    public void ps2Input() {
        System.out.println("ps2输入");
    }
}
