import java.util.PriorityQueue;

public class ngb10_SlidingWindowMaximum {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    static int[] slidingWindowMax(int window[], int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int res[] = new int[window.length - k + 1];
        // First window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(window[i], i));
        }
        res[0] = pq.peek().val;
        //For remaining windows
        for (int i = k; i < window.length; i++) {
            while (pq.peek().idx <= (i - k) && !pq.isEmpty()) {
                pq.remove();
            }
            pq.add(new Pair(window[i], i));
            res[i - k + 1] = pq.peek().val;
        }
        return res;
    }
//
    public static void main(String[] args) {
        int window[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int res[] = slidingWindowMax(window, 3);//TC:O(nlogK)
        printArray(res);
    }
}
