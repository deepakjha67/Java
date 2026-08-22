import java.util.*; 
public class QueueDemo {
    public static void main(String [] Args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);          // [10, 20, 30]
        System.out.println(q.poll());   // 10  (removed from front)
        System.out.println(q);          // [20, 30]
        System.out.println(q.peek());   // 20  (front element)
    } 
}