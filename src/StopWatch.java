public class StopWatch {

    private static final int MINUTES_PER_HOUR = 60;
    private static final int MINUTES_PER_DAY = 1440;
    private static final int MINUTES_PER_WORKING_DAY = 480;

    private int minutes;
    private int hours;
    private int days;

    public void record(int minutes) {
        if (minutes >= 0) {
            this.days = minutes / MINUTES_PER_DAY;
            this.hours = (minutes % MINUTES_PER_DAY) / MINUTES_PER_HOUR;
            this.minutes = minutes % MINUTES_PER_HOUR;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        int totalMinutes = days * MINUTES_PER_DAY
                         + hours * MINUTES_PER_HOUR
                         + minutes;

        return totalMinutes / MINUTES_PER_WORKING_DAY;
    }
}