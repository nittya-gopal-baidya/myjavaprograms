//import java.lang.Thread;
/*TAype A: By using Thread class */

// class MyThreadA extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("Thread A is Running . . .");
//         }
//     }}
// class MyThreadB extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("Thread B is Running . . .");
//         }
//     }
// }
// public class Ex11_Thread {
//     public static void main(String[] args) {
//         MyThreadA th1=new MyThreadA();
//         MyThreadB th2=new MyThreadB();
//         th1.start();
//         th2.start();
//     }
// }

/*Type B : By using runnable interface */
class MyThreadA implements Runnable {

    public void run() {
        while(true){
            System.out.println("Thread A is running . . . ");
        }
    }
}
class MyThreadB implements Runnable {

    public void run() {
        while(true){
            System.out.println("Thread B is running . . . ");
        }
    }
}
public class Ex11_Thread {
    public static void main(String[] args) {
        MyThreadA ball1=new MyThreadA();
        MyThreadB ball2=new MyThreadB();
        Thread bat2=new Thread(ball2);
        Thread bat1=new Thread(ball1);
        // bat1.start();
        // bat2.start();
        // System.out.println(bat1.getPriority());
        // System.out.println(bat2.getPriority());
        bat1.setPriority(1);
        bat2.setPriority(9);
        bat1.start();
        bat2.start();

        
    }
}
