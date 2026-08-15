public class StopWatch {

    int minutes;
    private int hours;
    private int days;
    private int workingDays;

    public void record(int minutes) {
    if (minutes >= 0) {
        this.days = minutes / 1440;
        this.hours = (minutes % 1440) / 60;
         this.minutes = minutes % 60;
         this.workingDays = minutes / (8 * 60);
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
    return workingDays;
}
}