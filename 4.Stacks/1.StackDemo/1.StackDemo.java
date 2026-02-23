//  Follows the LIFO
import java.util.*;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Internally they were also arrays
        stack.push(4);
        stack.push(14);
        stack.push(24);
        stack.push(34);
        stack.push(44);
        stack.push(54);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // Removing empty stack gives an error
        System.out.println(stack.pop());
    }
}