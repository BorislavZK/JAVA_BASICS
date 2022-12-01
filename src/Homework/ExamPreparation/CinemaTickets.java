package Homework.ExamPreparation;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = 0;
        int standard = 0;
        int kids = 0;
        int totalTickets = 0;

        String movie;
        while (!"Finish".equals(movie = scanner.nextLine())) {
            int seats = Integer.parseInt(scanner.nextLine());
            int movieTickets = 0;

            String type;
            while (movieTickets < seats && !"End".equals(type = scanner.nextLine())) {
                if ("student".equals(type)) {
                    student++;
                    movieTickets++;
                    totalTickets++;
                } else if ("standard".equals(type)) {
                    standard++;
                    movieTickets++;
                    totalTickets++;
                } else if ("kid".equals(type)) {
                    kids++;
                    movieTickets++;
                    totalTickets++;
                }
            }

            System.out.printf("%s - %.2f%% full.%n", movie, movieTickets * 100.0 / seats);
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standard * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.", kids * 100.0 / totalTickets);
    }
}