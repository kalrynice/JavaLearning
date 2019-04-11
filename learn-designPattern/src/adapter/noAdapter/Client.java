package adapter.noAdapter;

import adapter.PS2Plug;
import adapter.classAdapter.Ps2Adapter;

public class Client {
    public static void main(String []args){
        PS2Plug ps2Plug = new PS2Plug();
        ps2Plug.plugging(new Ps2er());
    }
}
