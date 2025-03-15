import java.math.BigInteger;

public class Countdown {
    public static String countdown(int n) {
        while(n > 0) {
            System.out.println(n--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return "Blastoff";
    }

    public static void recursiveCountdown(int n) {
        if(n==0){
            System.out.println("Blastoff!");
        } else {
            recursiveCountdown(n-1);
            System.out.println(n);
        }   
    }

    public static void nLines(int n) {
        if(n>0) {
            System.out.println();
            nLines(n-1);
        }
    }

    public static BigInteger factorial(int n) {
        if(n==0) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void infinity(int n) {
        System.out.println(n++);
        infinity(n);
    }

    public static void iterativeInfinity(int n) {
        while(true){
            System.out.println(n++);
        }   
    }

    public static void main(String[] args) {
        // System.out.println(countdown(5));
        // recursiveCountdown(5);
        // nLines(5);
        // System.out.println(factorial(3000));
        // infinity(0);
        iterativeInfinity(0);
    }
}
