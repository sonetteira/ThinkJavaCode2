import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void nested() {
        // prints multiplication table for 1-10
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }
    public static void validateInput() {
        // prompt the user to enter a number. validate the input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // as long as the value the user inputs isn't a number, keep asking
        while (!in.hasNextDouble()) {
            in.next();
            System.err.println("That's not a number!");
            System.out.print("Try again: ");
        }
        double num = in.nextDouble();
        System.out.printf("Half of that is %f", num/2);
    }
    public static void main(String[] args) {

        int[] arr = new int[4]; // 0,0,0,0
        int[] arr1 = Arrays.copyOf(arr, 4);
        // System.out.println(arr);
        // for(int n : arr) {
        //     System.out.printf("%d, ", n);
        // }
        // System.out.println(Arrays.toString(arr));

        // nested();
        // validateInput();

        // int i = 0;
        // while (i < 10) {
        //     System.out.println(i++);
        // }
        // System.out.println();
        // for(int j=0; j<10; j++) {
        //     System.out.println(j);
        // }
        // for(int i=0; i!=5; i+=2) {
        //     System.out.println(i);
        // }
    }
}
