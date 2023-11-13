import java.time.LocalTime;

public class Clock {
    private int hour, minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public void addMinute() {
        if (minute <= 58) {
            minute++;
        } else {
            minute = 0;
            if (hour <= 22) {
                hour++;
            } else {
                hour = 0;
            }
        }
    }

    @Override
    public String toString() {
        LocalTime myTime = LocalTime.of(hour, minute);
        String myTimeString = String.valueOf(myTime);
        return myTimeString;
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(23, 57);
        c1.addMinute();
        c1.addMinute();
        c1.addMinute();
        c1.addMinute();
        System.out.println(c1);
    }
}
