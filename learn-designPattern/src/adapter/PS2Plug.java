package adapter;

public class PS2Plug {
    public PS2Plug(){
        System.out.println("一个ps2插头");
    }

    public void plugging(Ps2 ps2){
        System.out.println("插入ps2的接口");
        ps2.ps2Input();
    }
}
