package Collection;

import java.util.*;

//InterLeave
//TC:O(n)
public class TwoHalfOfQue {

    public static void interLeave(Queue<Integer> aDQ) {
        Queue<Integer> firstHalf = new ArrayDeque<>();

        // Get the half size
        int size = aDQ.size();
        int halfSize = size / 2;

        // Move first half elements to firstHalf queue
        for (int idx = 0; idx < halfSize; idx++) {
            firstHalf.add(aDQ.remove());
        }

        // Interleave elements from both halves
        while (!firstHalf.isEmpty()) {
            aDQ.add(firstHalf.remove());
            aDQ.add(aDQ.remove());  // this removes from the second half
        }
    }

    public static void main(String[] args) {
        Queue<Integer> aDQ = new ArrayDeque<>();
        // Populating the queue
        for (int i = 1; i <= 10; i++) {
            aDQ.add(i);
        }

        interLeave(aDQ);

        while (!aDQ.isEmpty()) {
            System.out.print(aDQ.remove() + " ");
        }
        System.out.println();
    }
}
