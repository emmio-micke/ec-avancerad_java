package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Local {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        // System.out.println(t);

        t = LocalTime.of(13, 15, 0);
        // System.out.println(t);

        t = LocalTime.parse("13:56:24");
        // System.out.println(t);

        LocalDate d = LocalDate.now();
        // System.out.println(d);

        d = LocalDate.of(2021, 6, 24);
        // System.out.println(d);

        d = LocalDate.parse("2015-12-24");
        // System.out.println(d);

        LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);

        dt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        // System.out.println(dt);

        dt = LocalDateTime.of(d, t);
        // System.out.println(dt);

        dt = LocalDateTime.of(2014, Month.FEBRUARY, 2, 10, 30, 15);
        // System.out.println(dt);

        // System.out.println(t.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        // System.out.println(d.format(DateTimeFormatter.ofPattern("y-M-d")));
        // System.out.println(dt.format(DateTimeFormatter.ofPattern("y-MM-dd
        // HH:mm:ss")));

        // TimeZone tz = TimeZone.getDefault();
        // System.out.println(tz.getID());

        /*
         * tz.setID("America/Belize"); System.out.println(tz.getID()); dt =
         * LocalDateTime.now(); System.out.println(dt);
         */

        LocalDateTime ldt = LocalDateTime.now();

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone : " + singaporeZoneId);

        // LocalDateTime + ZoneId = ZonedDateTime
        ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : " + asiaZonedDateTime);

        /*
         * ZoneId newYokZoneId = ZoneId.of("America/New_York");
         * System.out.println("TimeZone : " + newYokZoneId);
         * 
         * ZonedDateTime nyDateTime =
         * asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
         * System.out.println("Date (New York) : " + nyDateTime);
         * 
         * DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
         * System.out.println("\n---DateTimeFormatter---");
         * System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
         * System.out.println("Date (New York) : " + format.format(nyDateTime));
         */
    }
}
