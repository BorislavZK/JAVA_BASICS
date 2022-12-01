package Homework.ExamPreparation;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tickets = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());


        double ticketsPerDay = tickets * ticketPrice;
        double total = ticketsPerDay * days;

        double commission = (total / 100) * percent;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, total - commission);

    }
}
