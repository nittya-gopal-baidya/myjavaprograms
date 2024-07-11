class A{
    int x,y;
    public A(int x,int y){
        this.x=x;
        this.y=y;

    }
    public boolean isEqual(A a){
        if(a.x==x && a.y==y){
            return true;
        }
        else{
            return false;
        }
    }
}
public class PassObjectAsParameter {

   public static void main(String[] args) {
    A a=new A(10, 20);
    A b=new A(10, 20);
    A c =new A(5, 5);
    System.out.println("a==b:"+a.isEqual(b));
    System.out.println("a==c:"+a.isEqual(c));
   } 
}
