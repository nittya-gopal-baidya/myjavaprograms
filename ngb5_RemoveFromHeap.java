 
import java.util.ArrayList;

public class ngb5_RemoveFromHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);// o(1)
            int x = arr.size() - 1;// o(1)
            int parentIdx = (x - 1) / 2;// o(1)
            while (arr.get(x) < arr.get(parentIdx)) {// O(logn)
                // swap while child is less than parent
                int temp = arr.get(parentIdx);
                arr.set(parentIdx, arr.get(x));
                arr.set(x, temp);
                x = parentIdx;
                parentIdx = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int leftChild = 2 * idx + 1;
            int rightChild = 2 * idx + 2;
            int minIdx = idx;
            if (leftChild <= arr.size() - 1 && arr.get(minIdx) > arr.get(leftChild)) {
                minIdx = leftChild;
            }
            if (rightChild <= arr.size() - 1 && arr.get(minIdx) > arr.get(rightChild)) {
                minIdx = rightChild;
            }
            if (minIdx != idx) {
                // swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(idx));
                arr.set(idx, temp);
                heapify(minIdx);// if heap is chnaged due to fix the previous node
            }

        }

        public int remove() {
            int data = arr.get(0);
            // step 1: swap last data with first data
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            // step2: delete last data
            arr.remove(arr.size() - 1);
            // step3: apply heapify to fix min heap
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.add(60);
        pq.add(90);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());// output will be ascending order
            pq.remove();
        }

    }
}
