public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.indexOf('l'));
        System.out.println(str.substring(1, 4));
        System.out.println(str.substring(3));
        System.out.println(str.equals("Jello"));
        System.out.println(str.compareTo("Jello"));
        System.out.println(String.format("%s", str));
    }
}
