public class Time {
    public static void main(String[] args) {
        int hour, minute, second;
        hour = 14;
        minute = 13;
        second = 18;
        int secondsSinceMidnight = (hour * 60 * 60) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        int secondsRemaining = (24 * 60 * 60) - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        double percentPassed = (double)secondsSinceMidnight / (24 * 60 * 60) * 100;
        System.out.println("Percent of day passed: " + percentPassed);

    }
}
