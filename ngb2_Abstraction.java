
abstract class Cycle{
    int speed;
    public void incrSpeed(int x){
        this.speed=this.speed+x;
    }
    abstract public void decrSpeed(int y);
}
class Bicycle extends Cycle{
    public void decrSpeed(int y){
        this.speed=this.speed-y;
    }
}
public class ngb2_Abstraction {
    public static void main(String[] args) {
        Bicycle avon =new Bicycle();
        avon.speed=100;
        avon.incrSpeed(10);
        System.out.println("speed after increment = "+avon.speed);
        avon.decrSpeed(25);
        System.out.println("speed after decrement = "+avon.speed);
    }
}
