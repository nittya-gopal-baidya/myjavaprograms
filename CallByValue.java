public class CallByValue {
    public static void ModifyValue(int val){
        val=val+10;
        System.out.println("Val = "+val+" inside method");
    }
    public static void main(String[] args) {
        int x=10;
        System.out.println("before calling method:"+x);
        ModifyValue(x);
        System.out.println("after calling method:"+x);
    }
}
