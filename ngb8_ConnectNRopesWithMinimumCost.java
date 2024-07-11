import java.util.PriorityQueue;

public class ngb8_ConnectNRopesWithMinimumCost {
    static int getMinCost(PriorityQueue<Integer> pQueue) {
        int minCost = 0, val1, val2;
        while (!pQueue.isEmpty()) {
            val1 = pQueue.remove();
            val2 = pQueue.remove();
            minCost += val1 + val2;
            if(!pQueue.isEmpty()){
                pQueue.add(val1+val2);
            }

        }
        return minCost;
    }

    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pQueue.add(ropes[i]);
        }
        System.out.println("minimum cost = " + getMinCost(pQueue));
    }
}
