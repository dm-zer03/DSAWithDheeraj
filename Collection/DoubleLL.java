package Collection;

public class DoubleLL {

    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast method
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {  // If list is empty, head and tail are the same
            head = tail = newNode;
            return;
        }
        tail.next = newNode;   // Link the current tail to the new node
        newNode.prev = tail;   // Link the new node back to the current tail
        tail = newNode;        // Move the tail to the new node
    }

    //Remove - removeFirst
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;// gives error if size==1
        size--;
        return val;

    }

    // removeLast method
    public int removeLast() {
        if (size == 0) {
            System.out.println("DLL is empty.");
            return -1; // Return a special value to indicate the list is empty
        }

        int removedData; // Variable to store the data of the removed node

        if (size == 1) { // Only one element in the list
            removedData = head.data;
            head = tail = null; // Remove the only node
        } else {
            removedData = tail.data; // Store the data of the last node
            tail = tail.prev;        // Move tail to the previous node
            tail.next = null;        // Disconnect the last node
        }
        size--;
        return removedData; // Return the data of the removed node
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }

    //print DLL
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();
        System.out.println("Size: " + dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size: " + dll.size);
        dll.reverse();
        dll.print();

    }
}
