public class CallByReference {
    int x;
    public CallByReference(int x){
        this.x=x;
    }
    public static void ModifyValue(CallByReference obj){
        obj.x+=10;
        System.out.println("Val = "+obj.x+" inside method");
    }
    public static void main(String[] args) {
        CallByReference cbr=new CallByReference(10);
        System.out.println("before calling :"+cbr.x);
        ModifyValue(cbr);
        System.out.println("after calling:"+cbr.x);
    }
}
