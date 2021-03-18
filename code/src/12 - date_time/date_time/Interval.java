package date_time;

import java.time.*;

public class Interval {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);

        Period period = Period.between(startDate, endDate);

        /*
         * System.out.println(period.getYears());
         * System.out.println(period.getMonths()); System.out.println(period.getDays());
         */

        Period fromDays = Period.ofDays(50);
        // System.out.println(fromDays);

        // Period fromUnits = Period.of(3, 10, 10);
        // Period fromMonths = Period.ofMonths(5);
        // Period fromYears = Period.ofYears(10);
        // Period fromWeeks = Period.ofWeeks(40);

        Instant startTime = Instant.parse("2017-10-03T10:15:30.00Z");
        Instant endTime = Instant.parse("2017-10-03T10:16:30.00Z");

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration.getSeconds());

        LocalTime start = LocalTime.of(1, 20, 25, 1024);
        LocalTime end = LocalTime.of(3, 22, 27, 1544);

        System.out.println(Duration.between(start, end).getSeconds());
    }
}
