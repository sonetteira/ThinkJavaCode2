import java.util.Arrays;
import java.util.Random;

public class Accumulator {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {
        
        // reduce operation to find the max value in an array
        int[] randomNumbers = randomArray(10);

        int max = randomNumbers[0];
        for (int number : randomNumbers) {
            if (number > max)
                max = number;
        }

        System.out.println(max);
        System.out.println(Arrays.toString(randomNumbers));
    }
}
