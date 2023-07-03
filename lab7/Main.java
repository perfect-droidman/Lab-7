package lab7;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.enqueue(5);
        pq.enqueue(3);
        pq.enqueue(7);
        pq.enqueue(1);
        pq.enqueue(9);
        pq.enqueue(2);
        pq.enqueue(4);
        pq.enqueue(6);
        pq.enqueue(8);
        pq.enqueue(0);
        while (!pq.isEmpty()) {
            System.out.println(pq.removeFront());
        }
    }
}
