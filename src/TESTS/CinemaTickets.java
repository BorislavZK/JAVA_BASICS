package TESTS;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalTicket = 0;
        int standardTicket = 0;
        int studentTicket = 0;
        int kidsTicket = 0;


        String movie = scan.nextLine();

        while (!movie.equals("Finish")){
            int soldTicket = 0;
            int freePaces = Integer.parseInt(scan.nextLine());

            String ticketType = scan.nextLine();

            while (!ticketType.equals("End")){

                soldTicket ++;
                totalTicket++;

                switch (ticketType){

                    case "student":
                        studentTicket++;
                        break;

                    case "standard":
                        standardTicket++;
                        break;

                    case "kid":
                        kidsTicket++;
                        break;
                }

                if (soldTicket == freePaces){
                    break;
                }

                ticketType = scan.nextLine();


            }
            //"{името на филма} - {процент запълненост на залата}% full."
            System.out.printf("%s - %.2f% full.\n",movie, 1.0 * soldTicket / freePaces * 100 );

            movie = scan.nextLine();
        }

        //"Total tickets: {общият брой закупени билети за всички филми}"
        //"{процент на студентските билети}% student tickets."
        //"{процент на стандартните билети}% standard tickets."
        //"{процент на детските билети}% kids tickets."

        System.out.printf("Total tickets: %d\n", totalTicket);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * studentTicket / totalTicket * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * standardTicket / totalTicket * 100);
        System.out.printf("%.2f%% kids tickets.\n", 1.0 * kidsTicket / totalTicket * 100);


    }
}
