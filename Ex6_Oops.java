 class A {
    public void funcA(){
        System.out.println("this is func A of class A ");
    }
    public void funcB(){
        System.out.println("this is func B of class A");
    }
}
 class B extends A{
    public void  funcB(){
        System.out.println("this is func B of class B ");
    }
}
public class Ex6_Oops {
    
    public static void main(String[] args) {
        B b=new B();
        b.funcA();
        b.funcB();
    }
}
