public class StopWatch {

    int minutes;
    private int hours;
    private int days;

    public void record(int minutes) {
    if (minutes >= 0) {
        this.days = minutes / 1440;
        this.hours = (minutes % 1440) / 60;
         this.minutes = minutes % 60;
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
}