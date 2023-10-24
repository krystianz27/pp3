import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main24 {
    public static void main(String[] args) {
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = currentTime.format(myFormatTime);

        Duration duration = Duration.between(currentTime, midnight);
        long elapsedMinutes = Math.abs(duration.toMinutes());
        long elapsedSeconds = Math.abs(duration.toSeconds());

        // System.out.println(currentTime);
        // System.out.println(formattedDate);
        // System.out.println(midnight);
        // System.out.println(duration);
        System.out.println("Minutes after midnight: " + elapsedMinutes);
        System.out.println("Seconds after midnight: " + elapsedSeconds);

        int hour = 22;
        int minute = 19;
        timePassed(hour, minute);
    }

    static void timePassed(int hour, int minute) {
        int passedMinutes = hour * 60 + minute;
        int passedSeconds = passedMinutes * 60;

        System.out.println("Minutes after midnight: " + passedMinutes);
        System.out.println("Seconds after midnight: " + passedSeconds);
    }

}
