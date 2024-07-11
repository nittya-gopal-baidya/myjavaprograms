public class MethodOverloading {
    public static void showData(){
        System.out.println("Nothing to show ");
    }
    public static void showData(int x){
        System.out.println("The value of X = "+x);
    }
    public static void showData(int x,int y){
        System.out.println("The value of x and y are "+x+" and "+y+" respectively");
    }
    public static void main(String[]args){
    showData();
    showData(4);
    showData(10,20);
    }
}

