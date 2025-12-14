package Collection;

import java.util.*;
import java.util.LinkedList;

public class DQ {

    public static void main(String[] args) {
        Deque<Integer> dQ = new LinkedList<>();

        dQ.addFirst(10);//1
        dQ.addFirst(20);//2 1
        dQ.addLast(30);
        dQ.addLast(40);
        System.out.println(dQ);

        // dQ.removeFirst();
        // System.out.println(dQ);
        // dQ.removeLast();
        // System.out.println(dQ);
        System.out.println("first el :" + dQ.getFirst());
        System.out.println("last el :" + dQ.getLast());

    }
}
