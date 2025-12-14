package Collection;

public class LinkedList {

    public static class Node {

        int data;
        Node next;

        // Initially Linked List Pointing towards null 
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    // Head Node 
    // Tail Node both require to track LL 
    public static Node head;
    public static Node tail;
    public static int size;

    // 1. add First TC : O(1) 
    public void addFirst(int data) {
        //Step:1 Create new node 
        Node newNode = new Node(data);
        size++;
        //LL isEmpty()
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step:2 newNode next =head
        newNode.next = head;//link 

        //Step:3 newNode  =head
        head = newNode;
    }

    // 2. add Last TC : O(1) 
    public void addLast(int data) {
        //Step:1 Create new node 
        Node newNode = new Node(data);
        size++;
        //LL isEmpty()
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step:2 tail.next=newNode
        tail.next = newNode;//link 

        //Step:3 tail = newNode
        tail = newNode;
    }

    // 3. printLL TC : O(n) 
    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //4.Add in the middle add(idx,data)
    public void add(int idx, int data) {
        //if  LL is empty adding head 
        if (idx == 0) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //i =idx-1 ;temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 5.Remove First : Argument not req ? head present
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty..");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // 6.Remove Last : Argument not req ? head present
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty..");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //reached till prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // 7.Search (Iterative)
    //Search for key in LinkedList.Return the position where it is found 
    //It not found,return -1;
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            //Key found
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }

        // Key not found
        return -1;
    }

    //Using recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    //TC :O(n) SC:O(n) 
    public int recSearch(int key) {
        return helper(head, key);
    }

    //TC:O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;//remove first;
        }

        //sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2

        }
        return slow; //slow is my midNode.
    }

    public boolean checkPalindrome() {
        //base case
        if (head == null && head.next == null) {
            return true;
        }

        // step1:find mid
        Node midNode = findMid(head);

        //step2:reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;

        //step3:check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Floyd cycle detection algo
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2

            if (slow == fast) {
                return true;//cycle exists 
            }

        }
        return false;
    }

    public static void removeCycle() {
        //detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        //find meeting point 
        slow = head;
        Node prev = null;//last Node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        //We will create a method for CRUD
        // ll.addFirst(1);
        // ll.addFirst(2);
        //LL-> 2->1

        // ll.printLL();
        // ll.addFirst(2);
        // ll.printLL();
        // ll.addFirst(1);
        // ll.printLL();
        // ll.addLast(4);
        // ll.printLL();
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.printLL();
        //LL-> 1->2->3->4->Null
        // System.out.println("Size:" + ll.size);
        // int removeVal = ll.removeFirst();
        // System.out.println(removeVal);
        // ll.printLL();
        // int removeVal = ll.removeLast();
        // System.out.println(removeVal);
        // ll.printLL();
        // System.out.println("Size:" + ll.size);
        // System.out.println("Key @ index:" + ll.itrSearch(4));
        // System.out.println("Key @ index:" + ll.itrSearch(10));
        // System.out.println("Key @ index:" + ll.recSearch(4));
        // System.out.println("Key @ index:" + ll.recSearch(10));
        // ll.reverse();
        // ll.printLL();
        // ll.deleteNthFromEnd(2);
        // ll.printLL();
        //ll.addLast(1);
        //ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        //ll.addLast(1);
        //ll.printLL();
        //boolean ans = ll.checkPalindrome();
        //System.out.println(ans);
        //For detecting cycle
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        //1->2->3->1
        // System.out.println(isCycle());
        //Removing the cycle from linked List 
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }

}
