import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ngb1_definePQ{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(20); //O(logn)
        pq.add(30);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());//o(1)
            pq.remove();//O(logn)
        }

    }
}