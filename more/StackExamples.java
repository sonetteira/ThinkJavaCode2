import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<Integer> pile = new Stack<Integer>();

        pile.push(87);
        pile.push(93);
        pile.push(68);

        System.out.println(pile); // [87, 93, 68]

        int last = pile.peek(); // 68

        pile.pop(); // 68

        System.out.println(pile); // [87, 93]
        
        for(Integer num : pile) {
            System.out.println(num);
        }

        // java deque implementation of a stack
        System.out.println("Deque implementation of a stack");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);

        System.out.println(stack.peek());
        stack.push(2);
        
        System.out.println(stack);

        // java deque implementation of a queue
        System.out.println("Deque implementation of a queue");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);

        System.out.println(queue.peek());
        queue.add(2);
        queue.add(3);

        System.out.println(queue);
        System.out.println(queue.poll());
    }  
}



