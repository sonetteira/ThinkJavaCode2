import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        
        // ArrayList<String> names = new ArrayList<String>();


        // names.add("Nic"); //add Nick to the end of the list
        // names.add("Chris"); //add Chris to the end of the list
        // names.add(0, "Alexandra"); //add Alexandra at index 0

        // System.out.println(names); // [Alexandra, Nic, Chris]

        // // String nick = names.get(1); // access element at index 1
        // // names.set(1, "Nick"); // update element at index 1
        // // names.remove(1); //remove element at index 1

        // // System.out.println(nick); // [Alexandra, Chris]

        // // typical for loop
        // for(int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }

        // Collections.sort(names);

        // // arraylist foreach loop
        // for(String item : names) {
        //     System.out.println(item);
        // }


        // ArrayList<KnicksGames> knicks2024 = new ArrayList<KnicksGames>();
        
        // knicks2024.add(new KnicksGames("1/3", 114, 122, "Nassau Veterans Memorial Coliseum"));
        // knicks2024.add(new KnicksGames("1/5", 121, 128, "Chase Fieldhouse"));
        // knicks2024.add(new KnicksGames("1/6", 118, 108, "Chase Fieldhouse"));

        ArrayList<String> trees = new ArrayList<>();
        trees.add("oak");
        trees.add("maple");
        trees.add("walnut");

        System.out.println(trees.get(0));

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println(number);

        numbers.add(6);

    }
}

class KnicksGames {
    private String date;
    private int knicksScore;
    private int opponentsScore;
    private String location;

    public KnicksGames(String date, int knicksScore, int opponentsScore, String location) {
        this.date = date;
        this.knicksScore = knicksScore;
        this.opponentsScore = opponentsScore;
        this.location = location;
    }

    public boolean homeGame() {
        return location.equals("Westchester County Center");
    }
}


