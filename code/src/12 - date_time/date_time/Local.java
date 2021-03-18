package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

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

        TimeZone tz = TimeZone.getDefault();
        // System.out.println(tz.getID());

        LocalDateTime ldt = LocalDateTime.now();

        ZoneId ziKolkata = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zdtKolkata = ZonedDateTime.of(ldt, ziKolkata);
        System.out.println("In India Central Time Zone: " + zdtKolkata);

        ZoneId ziTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zdtTokyo = zdtKolkata.withZoneSameInstant(ziTokyo);
        System.out.println("In Tokyo Central Time Zone:" + zdtTokyo);

        ZoneId ziSingapore = ZoneId.of("Asia/Singapore");
        ZonedDateTime zdtSingapore = zdtKolkata.withZoneSameInstant(ziSingapore);
        System.out.println("In Singapore Central Time Zone:" + zdtSingapore);

        Instant inst = Instant.now();
        System.out.println(inst);

        // Toronto - vad är klockan just nu på formatet HH:mm:ss
        LocalTime toronto = LocalTime.now(TimeZone.getTimeZone("America/Toronto").toZoneId());
        System.out.println("Den lokala tiden i Toronto: " + toronto);
    }
}
