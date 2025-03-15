import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {

        LinkedList<String> bookChapters = new LinkedList<String>();
        
        bookChapters.add("1: Computer Programming");
        bookChapters.add("2: Variables and Operators");
        bookChapters.add("3: Input and Output");

        System.out.println(bookChapters); 
        // [1: Computer Programming, 2: Variables and Operators, 3: Input and Output]

        bookChapters.add(1, "1.1: What is a Computer");

        System.out.println(bookChapters);
        // [1: Computer Programming, 1.1: What is a Computer, 
        // 2: Variables and Operators, 3: Input and Output]
        
        bookChapters.getFirst();

        for(String chap : bookChapters) {
            System.out.println(chap);
        }
    }
}