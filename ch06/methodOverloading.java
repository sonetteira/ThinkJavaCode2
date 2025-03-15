import java.util.Arrays;

public class methodOverloading {
    
    public static int[] range(int start, int stop) {
        // a range of integers between start (inclusive) and stop (exclusive)
        int[] range = new int[stop-start];
        int i = 0;
        while(start < stop) {
            range[i] = start;
            start++;
            i++;
        }
        return range;
    }

    public static int[] range(int start, int stop, int step) {
        double startDouble = start;
        double stopDouble = stop;
        double stepDouble = step;
        int[] range = new int[(int)Math.ceil((stopDouble-startDouble)/stepDouble)];
        int i = 0;
        while(start < stop) {
            range[i] = start;
            start += step;
            i++;
        }
        return range;
    }

    public static double[] range(double start, double stop, double step) {
        // avoid floating point errors
        // this will only work for double with fewer than 5 digits
        int startInt = (int)(start * 10000);
        int stopInt = (int)(stop * 10000);
        int stepInt = (int)(step * 10000);
        double[] range = new double[(int)Math.ceil((stop-start)/step)];
        int i = 0;
        while(startInt < stopInt) {
            range[i] = ((double) startInt) / 10000;
            startInt += stepInt;
            i++;
        }
        return range;
    }

    public static void main(String[] args) {
        int[] range1 = range(1, 5);
        int[] range2 = range(1, 5, 2);
        int[] range25 = range(0, 10, 3);
        double[] range3 = range(1.0, 5.0, 3.0);
        double[] range4 = range(0.0, 1.0, 0.3);
        double[] range5 = range(0.0, 0.002, 0.0005);
        
        System.out.println(Arrays.toString(range1));
        System.out.println(Arrays.toString(range2));
        System.out.println(Arrays.toString(range25));
        System.out.println(Arrays.toString(range3));
        System.out.println(Arrays.toString(range4));
        System.out.println(Arrays.toString(range5));
    }
}
