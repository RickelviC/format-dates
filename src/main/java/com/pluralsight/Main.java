package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        LocalDate date = LocalDate.now();



        String formattedDate = today.format(dateTimeFormatter);

        System.out.println(formattedDate);
        System.out.println(date);
        System.out.println(date.getDayOfWeek() + " " + date.getDayOfMonth() + ", " + date.getYear());
        System.out.println(date.getDayOfWeek() + ", " + date.getMonth() +" " + date.getDayOfMonth()
                + ", " + date.getYear() + " " + today.getHour() + ":" + today.getMinute());// not in GMT

        System.out.println(today.getHour() + ":" + today.getMinute() + " on " + date.getDayOfMonth() );

    }
}
