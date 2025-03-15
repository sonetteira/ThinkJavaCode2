public class FindMax {
    public static void main(String[] args) {
        int[] arr = {-47, -31, -80, -2};
        // int[] arr = {47, 31, 80, 2};
        int max = arr[0];
        // find max
        for(int x : arr) {
            if(x>max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
