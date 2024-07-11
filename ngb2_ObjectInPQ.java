import java.util.Comparator;
import java.util.PriorityQueue;

public class ngb2_ObjectInPQ {
    public static class Student implements Comparable<Student> {
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
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Nittya", 10));
        pq.add(new Student("Devid", 20)); // O(logn)
        pq.add(new Student("Alex", 30));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);// o(1)
            pq.remove();// O(logn)
        }

    }
}
