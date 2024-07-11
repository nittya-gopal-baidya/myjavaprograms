public class Factorial {
    public static int getFact(int x){
        if(x==0){
            return 1;
        }
        return x*getFact(x-1);
    }
    public static void main(String[] args) {
        System.out.println(getFact(6));
    }
}
