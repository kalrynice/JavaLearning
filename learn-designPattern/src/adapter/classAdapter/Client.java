package adapter.classAdapter;

import adapter.PS2Plug;

public class Client {
    public static void main(String []args){
        PS2Plug ps2Plug = new PS2Plug();
        ps2Plug.plugging(new Ps2Adapter());
    }
}
