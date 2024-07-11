abstract class A{
    public void funA(){
        System.out.println("this is funA ");
    }
    abstract public void funB();
}
abstract class B extends A{
    public void funB(){
        System.out.println("this is fun B");
    }
    abstract public void funC();
}
class C extends B{
    public void funC(){
        System.out.println("this is funC");
    }
    public void funD(){
        System.out.println("this is funD");
    }
}
public class Ex3_Oops1 {
    public static void main(String[] args) {
        B objC=new C();
        objC.funC();
    }
}
