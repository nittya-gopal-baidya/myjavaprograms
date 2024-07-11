interface Interface1 {
    public void display();
    
    public void openCamera();
}

class TestClass implements Interface1 {

    public void display() {
        System.out.println("i am good listener and speaker too");
    }

    public void openCamera() {
        System.out.println("this is camera");
    }
}

public class Ex10_Interface {

    public static void main(String[] args) {

        TestClass t = new TestClass();
        t.display();
        t.openCamera();
    }
}
