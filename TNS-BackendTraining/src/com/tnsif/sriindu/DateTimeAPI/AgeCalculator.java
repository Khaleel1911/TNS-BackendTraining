package com.tnsif.sriindu.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for birth date 
        System.out.print("Enter your birthdate (dd-MM-yyyy): ");
        String input = scanner.nextLine();

        // Defining date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parsing string to LocalDate
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate currentDate = LocalDate.now();

        // Calculating age
        Period age = Period.between(birthDate, currentDate);

        // Output
        System.out.println("You are " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days old.");
    }
}

