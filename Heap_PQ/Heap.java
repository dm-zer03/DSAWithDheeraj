
import java.util.*;

public class Heap {

    static class Heaps {

        ArrayList<Integer> arr = new ArrayList<>();

        //TC:O(logn)
        public void add(int data) {
            //add at last index
            arr.add(data);
            int x = arr.size() - 1;//x is child
            int par = (x - 1) / 2;//par index

            //TC:O(logn) : why we are comparing only parent 
            //maxHeap reverse conditions
            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;

            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            //maxHeap reverse 2nd conditions
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            //maxHeap reverse 2nd conditions
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                //Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            //step1-swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //step:2 delete last ;
            arr.remove(arr.size() - 1);

            //step:3  //TC:O(logn)
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heaps h = new Heaps();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek() + "");
            h.remove(); //Same as pq output
        }
    }
}
