public class ngb6_HeapSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public static void heapify(int idx, int arr[], int n) {// logn
        int maxIdx = idx;
        int leftChild = 2 * idx;
        int rightChild = 2 * idx + 1;
        if (leftChild < n && arr[leftChild] > arr[maxIdx]) {
            maxIdx = leftChild;
        }
        if (rightChild < n && arr[rightChild] > arr[maxIdx]) {
            maxIdx = rightChild;
        }
        if (maxIdx != idx) {
            // swap
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, arr, n);
        }
    }

    public static void heapSort(int arr[], int n) {
        /*
         * while(n>0){
         * // step1: build max heap
         * 
         * for (int i = n / 2; i >= 0; i--) {// for non-leaf nodes only
         * heapify(i, arr,n);
         * 
         * 
         * }
         * // step2: swap first and last element
         * int temp = arr[n-1];
         * arr[n-1] = arr[0];
         * arr[0] = temp;
         * // step3: reduce the size of array by 1
         * n = n - 1;
         * heapSort(arr, n);
         * }
         */
        // step1:build heap
        for (int i = n / 2; i >= 0; i--) {// for non-leaf nodes only n times : Overall Time complexity=O(nlogn)
            heapify(i, arr, n); //logn
        }
        //step2: swap 1st elemnt with last element 
        for (int j = n - 1; j > 0; j--) {//Overall time complexity :O(nlogn)
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
        //step3: reduce size by one and continue for remaining nodes 
            heapify(0, arr, j);//logn
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        System.out.println("BEFORE HEAP SORT");
        printArray(arr);
        heapSort(arr, arr.length); //Time complxity :O(nlogn) Space complexity :O(1) :inplace sorting algorithm(doesn't need extra space for producing output )
        System.out.println("AFTER HEAP SORT");
        printArray(arr);
    }
}
