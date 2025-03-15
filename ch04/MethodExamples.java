public class MethodExamples {

    public static void printExclamationMark() {
        // this method accepts no arguments and doesn't return anything
        System.out.print("!");
    }

    // this me
    public static void printMessage(String message) {
        // this method accepts a string and names it message, then prints it
        System.out.print(message);
    }

    public static int add(int a, int b) {
        // this method accepts 2 integer inputs and returns their sum
        int sum = a + b;
        return sum;
    }

    public static void problematicMethod() {
        System.out.println("This will print");
        return;
        // System.out.println("This will not!");
    }

    public static void main(String[] args) {
        // test methods
        printMessage("Stop barking");
        printExclamationMark();
        System.out.println("");
        
        // add method returns an int value
        // that can be used in place of a literal or variable
        printMessage("1 + 10 = " + add(1, 10));
    }
    
}


