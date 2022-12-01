package Homework.ExamPreparation;

import java.util.Scanner;

public class CinemaTickets_BOBI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalTicket = 0;
        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;


        String movie = scan.nextLine();

        while (!movie.equals("Finish")) {

            int seats = Integer.parseInt(scan.nextLine());
            int movieTicket = 0;
            String type = scan.nextLine();

            while (!type.equals("End")) {

                movieTicket++;
                totalTicket++;

                if (type.equals("student")) {
                    studentTicket++;
                } else if (type.equals("standard")) {
                    standardTicket++;
                } else {
                    kidTicket++;
                }

                if (movieTicket >= seats) {
                    break;
                }


                type = scan.nextLine();
            }

            //•	След всеки филм да се отпечата, колко процента от кино залата е пълна
            //"{името на филма} - {процент запълненост на залата}% full."


            System.out.printf("%s - %.2f%% full.\n", movie, (1.00 * movieTicket / seats) * 100);

            movie = scan.nextLine();

        }

        //Total tickets: 12
        System.out.printf("Total tickets: %d\n", totalTicket);

        //66.67% student tickets.
        //25.00% standard tickets.
        //8.33% kids tickets.

        System.out.printf("%.2f%% student tickets.\n", (1.00 * studentTicket / totalTicket) * 100);
        System.out.printf("%.2f%% standard tickets.\n", (1.00 * standardTicket / totalTicket) * 100);
        System.out.printf("%.2f%% kids tickets.", (1.00 * kidTicket / totalTicket) * 100);

    }

}
