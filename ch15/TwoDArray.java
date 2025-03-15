import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;
        int[][] studentgrades = {
            {88, 70, 91, 75, 89},
            {95, 96, 91, 100, 87}, 
            {69, 72, 85, 76, 74}
        };

        // print 2D array. one way
        for(int i=0; i < rows; i++) {
            System.out.print("Student " + i + ": ");
            for(int j=0; j<columns; j++) {
                System.out.print(studentgrades[i][j] + " ");
            }
            System.out.println();
        }

        // print 2D array. another way
        System.out.println(Arrays.deepToString(studentgrades));
    }
}
