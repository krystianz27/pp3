import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyCalendar {
    static int year = 2023;
    static int month = 1;
    static int day = 9;

    static String myDate() {
        LocalDate myDateObj = LocalDate.of(year, month, month);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = myDateObj.format(myFormatObj);
        // return (year + "-" + month + "-" + day);
        return formattedDate;
    }

    // static int days() {
    // int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // int passed_days = 0;
    // int index = 0;
    // for (int i : months) {
    // if (index == month - 1) {
    // break;
    // }
    // passed_days += i;
    // index += 1;
    // }
    // passed_days += day - 1;
    // return passed_days;
    // }

    static long days() {
        LocalDate myDateObj = LocalDate.of(year, month, day);
        LocalDate beginningYear = LocalDate.of(year, 1, 1);
        Duration duration = Duration.between(myDateObj.atStartOfDay(),
                beginningYear.atStartOfDay());
        long passed_days = Math.abs(duration.toDays());
        return passed_days;
    }

    static String monthName() {
        String monthString = Month.of(month).toString();
        return monthString;

    }

    public static void main(String[] args) {
        System.out.println("Date: " + myDate());
        System.out.println("Number of days passed from the beginning of year: " + days());
        // System.out.println("Month name: " + monthName());

    }
}
