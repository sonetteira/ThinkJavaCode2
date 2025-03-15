public class ChainNest {

    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else {
            if (x < 0) {
                System.out.println("x is negative");
            } else {
                System.out.println("x is zero");
            }
        }

        // positive/even using nested conditionals
        if(x >= 0) {
            if (x % 2 == 0) {
                System.out.println("x is positive and even");
            }
        } 

        // positive/even using multiple conditions
        if (x >= 0 && x % 2 == 0) {
            System.out.println("x is positive and even");
        }

        // positive/even using nested conditionals
        // now this way is more efficient
        if(x >= 0) {
            if (x % 2 == 0) {
                System.out.println("x is positive and even");
            } else {
                System.out.println("x is positive and odd");
            }
        } else {
            System.out.println("x is negative");

        }

        // positive/even using multiple conditions
        // less efficient, tests for positivity twice
        if (x >= 0 && x % 2 == 0) {
            System.out.println("x is positive and even");
        } else if (x >= 0) {
            System.out.println("x is positive and odd");
        } else {
            System.out.println("x is negative");
        }

        String espanol;
        if (x == 0) {
            espanol = "cero";
        } else if (x == 1) {
            espanol = "uno";
        } else if (x == 2) {
            espanol = "dos";
        } else if (x == 3) {
            espanol = "tres";
        } else {
            espanol = "mas";
        }
    }

}
