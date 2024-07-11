class MyFunction {//these all functions are differ in only  variable
    public void A(){
        System.out.println("this is funtion A ");
    }
    public void A(int x){
        System.out.println("this is function A with variable x ");
    }
    public static void A(int x,int y){
        System.out.println("this is function A with variable x and y");
    }
}
public class Ex5_Oops {
    public static void main(String[] args) {
        MyFunction f=new MyFunction();
        f.A();
        f.A(5);
        f.A(4,5);
    }
}
