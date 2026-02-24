// Dequeue helps to add and remove from the both  the sides
// Faster than LL and Stack
// null elements are not allowed
// Can Insert from first and last
// Can Remove from first and last
import java.util.*;
class Dequeueex{
    public static void main(String[] args){
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(80);
        deque.addLast(78);
        deque.removeFirst();
    }
}