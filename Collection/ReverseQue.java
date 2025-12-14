package Collection;

import java.util.*;

public class ReverseQue {

    public static void reverse(Queue<Integer> aDQ) {
        Stack<Integer> s = new Stack<>();

        while (!aDQ.isEmpty()) {
            s.push(aDQ.remove());
        }

        while (!s.isEmpty()) {
            aDQ.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> aDQ = new ArrayDeque<>();
        // Populating the queue
        for (int i = 1; i <= 10; i++) {
            aDQ.add(i);
        }

        reverse(aDQ);

        while (!aDQ.isEmpty()) {
            System.out.print(aDQ.remove() + " ");
        }
        System.out.println();
    }
}
