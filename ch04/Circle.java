public class Circle {

    static double pi = Math.PI;

    public static double calculateArea(double radius) {
        return pi * radius * radius;
    }

    public static void iDunno(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        double diameter = 10.0;
        double area = calculateArea(diameter / 2);
        System.out.println(area);
        System.out.println(pi);
        iDunno("null");
    }

}

