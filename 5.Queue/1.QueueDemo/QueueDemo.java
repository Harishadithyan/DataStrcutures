// Stack is class but Queue is interface
// new will not available due to interface 
// It is just like the Linked list so we create new ll
// Follows FIFO
import java.util.*;

class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());   // Only sees front element
        System.out.println(queue.remove()); // Removes front
        System.out.println(queue.remove());
    }
}