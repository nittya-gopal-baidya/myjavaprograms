import java.lang.Thread;
class MyThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Chatting . . .");
        }
           
        
    }

}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Cooking . . .");
        }
           
        
    }

}
public class ngb5_Thread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
           
            t1.start();
            t2.start();
        
    }
}
