package com.tnsif.sriindu.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Current date
        LocalTime time = LocalTime.now(); // Current time
        LocalDateTime dateTime = LocalDateTime.now(); // Current date and time
        ZonedDateTime zoned = ZonedDateTime.now(); // With timezone

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
        System.out.println("ZonedDateTime: " + zoned);

        // Formatting
        String formatted = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Formatted Date: " + formatted);
    }
}

