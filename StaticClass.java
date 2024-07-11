class A{
    public static void methA(){
        System.out.println("Method of A");
    }
}
public class StaticClass {
    public static int x=10;
    public static void meth(){
        System.out.println("This is a method ");
    }
    public static void main(String[] args) {
        System.out.println(x);
        meth();
        A.methA();
    }
}
