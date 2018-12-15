import java.time.*;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Set;

public class Dates {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println("Date today is " + ld);  //today's date

        LocalDate mb = LocalDate.of(1959, 3, 18);
        System.out.println("I was born on " + mb);

        //LocalDate ab = new LocalDate.parse("1960-3-13") ;

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is " + tomorrow);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();

        DayOfWeek whenBorn = mb.getDayOfWeek();
        System.out.println("I was born on a " + whenBorn);

        boolean leapYear = mb.isLeapYear();
        System.out.println("Was I born in a leap year? " + (leapYear ? "Yes, I  was" : "No, I  wasn't"));


//        The relationship of a date to another can be determined to occur before or after another date:

        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());


//        LocalTime represents time without a date.
//        Similar to LocalDate an instance of LocalTime can be created from system clock or by using “parse” and “of” method. Quick look at some of the commonly used APIs below.
//        An instance of current LocalTime can be created from the system clock as below:
//
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime sixThirty = LocalTime.parse("06:30");

        //        The Factory method “of” can be used to create a LocalTime. For example the below code creates LocalTime representing 06:30 AM using the factory method:
        LocalTime sixThirty = LocalTime.of(6, 30);

        //        The below example creates a LocalTime by parsing a string and adds an hour to it by using the “plus” API. The result would be LocalTime representing 07:30 AM:
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);

//        Various getter methods are available which can be used to get specific units of time like hour, min and secs like below:
        int six = LocalTime.parse("06:30").getHour();

//        We can also check if a specific time is before or after another specific time. The below code sample compares two LocalTime for which the result would be true:
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

//       The max, min and noon time of a day can be obtained by constants in LocalTime class. This is very useful when performing database queries to find records within a given span of time. For example, the below code represents 23:59:59.99:
        LocalTime maxTime = LocalTime.MAX;

//         LocalDateTime is used to represent a combination of date and time.
//        This is the most commonly used class when we need a combination of date and time. The class offers a variety of APIs and we will look at some of the most commonly used ones.
//        An instance of LocalDateTime can be obtained from the system clock similar to LocalDate and LocalTime:

        LocalDateTime.now();
        System.out.println(now);

//       Using the factory “of” and “parse” methods. The result would be a LocalDateTime instance representing 20 February 2015, 06:30 AM:

        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");

//        There are utility APIs to support addition and subtraction of specific units of time like days, months, year and minutes are available. The below code samples demonstrates the usage of “plus” and “minus” methods. These APIs behave exactly like their counterparts in LocalDate and LocalTime:

        LocalDateTime.plusDays(1);
        LocalDateTime.minusHours(2);

        //     Getter methods are available to extract specific units similar to the date and time classes. Given the above instance of LocalDateTime, the below code sample will return the month February:

        LocalDateTime.getMonth();

        // Java 8 provides ZonedDateTime when we need to deal with time zone specific date and time.The ZoneId is an
        //    identifier used to represent different zones.There are about 40 different time zones and the ZoneId are used
        //    to represent them as follows.
//
//      In this code snippet we create a Zone for Paris
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        //      The LocalDateTime can be converted to a specific zone:

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
//        The ZonedDateTime provides parse method to get time zone specific date time:
//
        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
//        Another way to work with time zone is by using OffsetDateTime. The OffsetDateTime is an immutable representation of a date-time with an offset. This class stores all date and time fields, to a precision of nanoseconds, as well as the offset from UTC/Greenwich.
//
//                The OffSetDateTime instance can be created as below using ZoneOffset. Here we create a LocalDateTime representing 6:30 am on 20th February 2015:

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
//        Then we add two hours to the time by creating a ZoneOffset and setting for the localDateTime instance:

        ZoneOffset offset = ZoneOffset.of("+02:00");
//
        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(localDateTime, offset);
//        We now have a localDateTime of 2015-02-20 06:30 +02:00. Now let’s move on to how to modify date and time values using the Period and Duration classes.

//        The Period class is widely used to modify values of given a date or to obtain the difference between two dates:
//
        LocalDate initialDate = LocalDate.parse("2007-05-10");
//        The Date can be manipulated using Period as shown in the following code snippet:
//
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
//        The Period class has various getter methods such as getYears, getMonths and getDays to get values from a Period object. The below code example returns an int value of 5 as we try to get difference in terms of days:
//
        int five = Period.between(finalDate, initialDate).getDays();
//        The Period between two dates can be obtained in a specific unit such as days or month or years, using ChronoUnit.between:
//
//        1
        long DaysFive = ChronoUnit.DAYS.between(finalDate, initialDate);
//        This code example returns five days.
//
//        Similar to Period, the Duration class is use to deal with Time. In the following code we create a LocalTime of 6:30 am and then add a duration of 30 seconds to make a LocalTime of 06:30:30am:
//
        LocalTime initialTime = LocalTime.of(6, 30, 0);
//
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        The Duration between two instants can be obtained either as a Duration or as a specific unit.In the first code
        snippet we use the between() method of the Duration
        class to find the time difference between finalTime and initialTime and return the difference in seconds:
//
//        1
        int thirty = Duration.between(finalTime, initialTime).getSeconds();
//        In the second example we use the between() method of the ChronoUnit class to perform the same operation:
//
//        1
        int thirty = ChronoUnit.SECONDS.between(finalTime, initialTime);
//        Now we will look at how to convert existing Date and Calendar to new Date/Time.
//
//        6. Compatibility with Date and Calendar
//        Java 8 has added the toInstant() method which helps to convert existing Date and Calendar instance to new Date Time API as in the following code snippet:

        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
//        The LocalDateTime can be constructed from epoch seconds as below. The result of the below code would be a LocalDateTime representing 2016-06-13T11:34:50:

        LocalDateTime.ofEpochSecond(1465817690, 0, ZoneOffset.UTC);
//        Now let’s move on to Date and Time formatting.
//
//        7. Date and Time Formatting
//        Java 8 provides APIs for the easy formatting of Date and Time:
        localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
//        The below code passes an ISO date format to format the local date. The result would be 2015-01-25 :

        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);

//        The DateTimeFormatter provides various standard formatting options.Custom patterns can be provided to
//        format method as well, like below, which would return a LocalDate as 2015 / 01 / 25:
//
        localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//        We can pass in formatting style either as SHORT, LONG or MEDIUM as part of the formatting option. The below code sample would give an output representing LocalDateTime in 25-Jan-2015 06:30:00:

        localDateTime
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.UK);
    }

}