import java.util.ArrayList;
import java.util.Collection;

public class ClassTest {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Quiz> allTheQuizzes = new ArrayList<>();

        Collection.sort(allTheQuizzes);

        test.add(4);
        boolean yn = test.contains(2);

        for(int i=0; i<test.size(); i++) {}

        System.out.println(yn);
    }
}

class Quiz implements Comparable {
    private int week;
    public Quiz(int week) {
        this.week = week;
    }
    
    @Override
    public Integer compareTo(Quiz otherQuiz) {
        if(this.week > otherQuiz.week) 
            return 1;
        return 0;
    }
}