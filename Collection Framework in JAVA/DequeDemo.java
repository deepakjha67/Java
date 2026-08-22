import java.util.*; 

// Deque — Double Ended Queue
public class DequeDemo {
    public static void main(String [] Args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);   // add at rear
        dq.offerFirst(5);   // add at front
        dq.offerLast(50);   // add at rear

        System.out.println(dq);             // [5, 10, 50]
        System.out.println(dq.pollLast());  // 50 (removed from rear)
        System.out.println(dq.pollFirst()); // 5  (removed from front)
        System.out.println(dq.peek());      // 10


// ArrayDeque as Stack (LIFO)
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);     // pushes to top (front)
        stack.push(20);
        stack.push(30);

        System.out.println(stack);       // [30, 20, 10]
        System.out.println(stack.pop()); // 30 (removes top)
        System.out.println(stack.peek());// 20 (views top)
    } 
}