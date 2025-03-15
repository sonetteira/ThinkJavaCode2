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
    }  
}

