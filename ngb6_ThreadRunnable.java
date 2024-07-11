class ThR1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Running . . ");
        }
    }
}
class ThR2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Eating . . ");
        }
    }
}
public class ngb6_ThreadRunnable {
    public static void main(String[] args) {
        ThR1 e1=new ThR1();
        ThR2 e2=new ThR2();
        Thread t1=new Thread(e1);
        Thread t2=new Thread(e2);
        t1.start();;
        t2.start();

    }
}
