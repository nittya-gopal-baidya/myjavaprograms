import java.security.DigestException;

class Animal{
    public void breath(){
        System.out.println("i am breathing");
    }
    public void haveLeg(){
        System.out.println("i have leg");
    }
    public void haveEye(){
        System.out.println("i have eye ");
    }
}
class Cat extends Animal{
    public void myIntro(){
        System.out.println("i am cat ");
    }
    public void haveTail(){
        System.out.println("i have one tail");
    }
}
class Dog extends Animal{
    public void myIntro(){
        super.breath();
        System.out.println("i am dog ");
    }
    public void haveTail(){
        System.out.println("i have two tail");
    }
}
public class Ex4_Oops {
    
    public static void main(String[] args) {
        Dog d=new Dog();
        d.breath();
        d.myIntro();
    }
}
