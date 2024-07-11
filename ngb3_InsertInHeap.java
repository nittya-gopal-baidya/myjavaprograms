import java.util.ArrayList;

public class ngb3_InsertInHeap { // Overall TC=O(logn)
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);//o(1)
            int x = arr.size() - 1;//o(1)
            int parentIdx = (x - 1) / 2;//o(1)
            while (arr.get(x) < arr.get(parentIdx)) {//O(logn)
                //swap
                int temp = arr.get(parentIdx);
                arr.set(parentIdx, arr.get(x));
                arr.set(x, temp);
                x=parentIdx;
                parentIdx=(x-1)/2;
            }

        }
    }

    public static void main(String[] args) {

    }
}
