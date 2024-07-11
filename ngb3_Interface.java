
interface phone{
    public void playSong();   
}
interface smartphone{
    public void openCamera();
}
class samsung implements phone,smartphone{
    public void playSong(){
        System.out.println("SONG IS PLAYING . . .");
    }
    public void openCamera(){
        System.out.println("CAMERA TAKING PHOTOS . . .");
    }
}
public class ngb3_Interface {
    public static void main(String[] args) {
        samsung s21=new samsung();
        s21.playSong();
        s21.openCamera();
    }
}
