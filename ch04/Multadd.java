public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double d) {
        double a = 1.0;
        double b = d * Math.exp(-d);
        double c = Math.sqrt(1 - Math.exp(-d));
        return multadd(a, b, c);
    }

    public static void main(String[] args) {
        System.out.printf("1 * 2 + 3 = %.1f\n", multadd(1.0, 2.0, 3.0));
        double a = 1.0;
        double b = Math.sin(Math.PI / 4.0);
        double c = Math.cos(Math.PI / 4.0) / 2.0;
        System.out.printf("sin(pi/4) + (cos(pi/4)/2) = %f\n", multadd(a, b, c));
        b = Math.log(10.0);
        c = Math.log(20.0);
        System.out.printf("log10 + log20 = %f\n", multadd(a, b, c));
        System.out.printf("expSum(1) = %f\n", expSum(1.0));
    }
}
