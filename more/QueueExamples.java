import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();

        line.add("Jahan");
        line.add("Terry");
        line.add("Zoheb");
        line.add("Dylan");

        System.out.println(line); // [Jahan, Terry, Zoheb, Dylan]

        String firstInLine = line.poll(); // Jahan

        System.out.println(firstInLine); // Jahan

        System.out.println(line); // [Terry, Zoheb, Dylan]

        for(String item : line) {
            System.out.println(item);
        }
        
    }
}
