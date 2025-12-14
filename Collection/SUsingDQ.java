package Collection;

import java.util.*;
import java.util.LinkedList;

public class SUsingDQ {

    static class Stack {

        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // Return some error value or handle underflow condition
            }
            return deque.removeLast();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // Handle empty stack case
            }
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
