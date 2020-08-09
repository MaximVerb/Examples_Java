package oefeningen_vb.collections.comparator.vbComparator1;

public class Time {
    private int hour;
    private int minutes;
    private int sec;

    public Time(int hour, int minutes, int sec) {
        this.hour = hour;
        this.minutes = minutes;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
