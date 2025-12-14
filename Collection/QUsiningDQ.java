package Collection;

import java.util.*;
import java.util.LinkedList;

public class QUsiningDQ {

    static class Queue {

        Deque<Integer> dQ = new LinkedList<>();

        public boolean isEmpty() {
            return dQ.isEmpty();
        }

        public void add(int data) {
            dQ.add(data);
        }

        public int remove() {
            return dQ.removeFirst();
        }

        public int peek() {
            return dQ.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
