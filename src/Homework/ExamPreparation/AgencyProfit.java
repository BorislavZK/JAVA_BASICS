package Homework.ExamPreparation;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String airCarrier = scan.nextLine();
        int adultsTickets = Integer.parseInt(scan.nextLine());
        int childrensTicket = Integer.parseInt(scan.nextLine());
        double adultsTicketPrice = Double.parseDouble(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());
        double childrenTicketPrice = adultsTicketPrice * 0.3;

        double totalAdults = adultsTicketPrice * adultsTickets + (fee * adultsTickets);
        double totalChildrens = childrenTicketPrice * childrensTicket + (fee * childrensTicket);

        double agencyProfit = (totalAdults + totalChildrens) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airCarrier, agencyProfit );

    }

}
