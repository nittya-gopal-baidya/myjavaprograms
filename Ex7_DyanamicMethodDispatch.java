class Phone{
    public void playMusic(){
        System.out.println("play music on phone");
    }
    public void openCamera(){
        System.out.println("open camera on phone ");
    }
}
class SmartPhone extends Phone{
    public void openGallary(){
        System.out.println("open gallary on smartphone");
    }
    public void playMusic(){
        System.out.println("play music on smartphone");
    }
    public void openCamera(){
        System.out.println("open camera on smartphone ");
    }
}

public class Ex7_DyanamicMethodDispatch {

    public static void main(String[] args) {
        // Phone ph=new Phone();
        // ph.openCamera();

        // Phone ph=new SmartPhone();
        // ph.playMusic();

        // Phone ph=new SmartPhone();
        // ph.openGallary();

        //  SmartPhone sph=new SmartPhone();
        //  sph.playMusic();

        /* used to achieve runtime polymorphism in java and decide wich method of which class will run /excute */
        
    }
}
