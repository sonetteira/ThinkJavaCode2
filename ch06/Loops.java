import java.util.Scanner;

/**
 * Demonstrates uses of loops.
 */
public class Loops {

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {         // n is even
                n = n / 2;
            } else {                  // n is odd
                n = n * 3 + 1;
            }
        }
    }

    public static void plusplus() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;  // add 1 to i
        }
    }

    public static void appreciate() {
        int i = 2;
        while (i <= 8) {
            System.out.print(i + ", ");
            i += 2;  // add 2 to i
        }
        System.out.println("Who do we appreciate?");
    }

    public static void appreciate2() {

        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println("Who do we appreciate?");
    }

    public static void loopvar() {
        int n;
        for (n = 3; n > 0; n--) {
            System.out.println(n);
        }
        System.out.println("n is now " + n);
    }

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

    public static void count() {
        // count to 5
        for(int num = 1; num <= 5; num ++) {
            System.out.println(num);
        }
        // can't access this from here
        // System.out.println(num);
    }

    public static void infiniteLoops() {
        // infinite while loop - missing update statement

        // count down from 3
        int count = 3;
        while(count > 0) {
            System.out.println(count);
            
        }

        // infinite for loop - condition is impossible
        
        // count to 5
        for(int num = 0; num != 5; num += 2) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // System.out.println("\ncountdown");
        // countdown(3);

        // System.out.println("\nsequence");
        // sequence(10);

        // System.out.println("\nplusplus");
        // plusplus();

        // System.out.println("\nappreciate");
        // appreciate();

        // System.out.println("\nappreciate2");
        // appreciate2();

        // System.out.println("\nloopvar");
        // loopvar();

        // System.out.println("\nnested");
        // nested();

        // System.out.println("\nvalidate input");
        // validateInput();
        
        // System.out.println("\ncount");
        // count();

        System.out.println("\ninfinite loops");
        infiniteLoops();
    }

}
