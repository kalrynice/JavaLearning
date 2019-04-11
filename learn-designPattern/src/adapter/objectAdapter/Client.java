package adapter.objectAdapter;

import adapter.PS2Plug;
import adapter.Usber;

public class Client {
    public static void main(String []args){
        PS2Plug ps2 = new PS2Plug();
        ps2.plugging(new Ps2Adapter(new Usber()));
    }
}
