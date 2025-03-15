import java.math.BigDecimal;
import java.math.BigInteger;

public class Primitives {
    
    public static void main(String[] args) {

        // creating a string object the long way
        String name = new String("Simon");

        // shorthand for creating a new string object
        String anotherName = "Elizabeth";

        int nameLen = name.length();
        boolean sameName = name.equals(anotherName);
        int nameDiff = anotherName.compareTo(name);

        String color = "  Green  ";
        // copy of string in all uppercase
        String upperColor = color.toUpperCase();
        // copy of string with leading and trailing whitespace removed
        String trimmedColor = color.trim();
        // copy of string with all 'e' characters replaced with '3'
        String leetColor = color.replace("e", "3");

        String a = null;

        Integer wrapperA = 1;
        Boolean wrapperB = true;
        Character wrapperC = 'C';
        Double wrapperD = 1.1;
        Long wrapperE = Long.valueOf(1111111111);

        int biggestInt = Integer.MAX_VALUE; // 2147483647
        int smallestInt = Integer.MIN_VALUE; // -2147483648

        double biggestDouble = Double.MAX_VALUE; // 1.7976931348623157E308
        double smallestDouble = Double.MIN_VALUE; // 4.9E-324

        long biggestLong = Long.MAX_VALUE; // 9223372036854775807
        long smallestLong = Long.MIN_VALUE; // -9223372036854775808

        // wrapper class parse methods can convert between different data types
        int inputNum = Integer.parseInt("55");

        BigInteger reallyLargeNumber = new BigInteger("98765432100023456789");
        // add 100 to BigInteger
        BigInteger plus100 = reallyLargeNumber.add(BigInteger.valueOf(100));

        String weather = "snow";
        String precip = "snow";
        
        System.out.println(weather == precip); // true
        System.out.println(weather.equals(precip)); // also true
    }
}
