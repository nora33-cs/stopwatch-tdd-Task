public class Main {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        int totalMinutes = 1500;
        stopWatch.record(totalMinutes);
        int workingDays = stopWatch.getWorkingDays();

     System.out.println(
    "The recorded time is " +
    stopWatch.getDays() + " day(s), " +
    stopWatch.getHours() + " hour(s), and " +
    stopWatch.getMinutes() + " minute(s). " +
    "This is equivalent to " +
    stopWatch.getWorkingDays() + " full 8-hour working day(s) + " +
    (totalMinutes % 480) + " remaining minute(s)."
);
    }
}