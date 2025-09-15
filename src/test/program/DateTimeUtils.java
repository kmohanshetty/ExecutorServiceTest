package test.program;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static LocalDateTime toUTCDateTime(LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault())
                       .withZoneSameInstant(ZoneId.of("UTC"))
                       .toLocalDateTime();
    }

    public static String formatAsUTC(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime utcDateTime = toUTCDateTime(now);

        // Display UTC date-time as LocalDateTime
        System.out.println("UTC LocalDateTime: " + utcDateTime);

        // Display formatted UTC date-time as a string
        System.out.println("Formatted UTC LocalDateTime: " + formatAsUTC(utcDateTime));
    }
}
