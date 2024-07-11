public class Example {
    private int x;
    private int y;
    public Example() {
        this(4, 5); // Calls the parameterized constructor with default values
        System.out.println("Default constructor called");
    }
    public Example(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor called with values x: " + x + " and y: " + y);
    }
    public static void main(String[] args) {
        Example example1 = new Example();
        Example example2 = new Example(10, 20);
    }
}
