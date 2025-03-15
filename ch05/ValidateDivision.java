import java.util.Scanner;

public class ValidateDivision {
    public static double division(double a, double b) {
        // we could have the division function validate that b is not 0
        // but then what should it return?
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a nominator: ");
        double n = in.nextDouble();
        System.out.print("Enter a denominator: ");
        double d = in.nextDouble();
        if(d==0) {
            System.out.println("No dividing by 0!");
            return;
        } 
        double quotient = division(n, d);
        System.out.printf("%.0f / %.0f = %.0f", n, d, quotient);
    }
}
