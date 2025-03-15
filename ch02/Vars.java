public class Vars {
    public static void main(String[] args) {
        /* This is a 
         * multi line comment
         * Describes the program I'm writing
         */

        // Single line comment

        // declare a string variable
        String text;
        // assign string variable
        text = "There is a woodpecker outside my window.";

        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut" + 
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " + 
            "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " + 
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        // declare and assign int variable
        int monitors = 3;
        
        // declare and assign double variable
        double days = 15.5; double cups = 2.0;

        // output values
        System.out.println(text);
        System.out.println(cups);
        System.out.println(days);

        // use an expression to assign a fraction to a variable
        double fraction = 1.0 / 3.0;

        System.out.println(fraction);

        // round fraction to an int by type casting
        System.out.println((int)fraction);

        // convert pm times to 24 hr time
        int hour = 8;
        // this uses a literal
        System.out.println(hour + 12);
        
        // use a constant instead
        final int HOURS_DIFF = 12;
        System.err.println(hour + HOURS_DIFF);



    }
}
