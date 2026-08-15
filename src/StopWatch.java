public class StopWatch {

    int minutes;
    private int hours;

    public void record(int minutes) {
    if (minutes >= 0) {
        this.minutes = minutes;
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }
}

    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
    return hours;
}
}