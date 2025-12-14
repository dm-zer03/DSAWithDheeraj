
import java.util.PriorityQueue;

public class PQ {

    static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //pq.add(3); //O(logn)
        //pq.add(4);
        // pq.add(1);
        //pq.add(7);
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Dheeraj", 11));
        pq.add(new Student("Shubham", 5));
        pq.add(new Student("Mahesh", 10));
        pq.add(new Student("Preeti", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank + " ");//O(1)
            pq.remove();//O(logn)
        }
    }
}
