package Exams;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Входът се чете от конзолата и съдържа точно 4 реда:
        //•	На първия ред - месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
        //•	На втория ред - броят на прекараните часове - цяло число в диапазона [1...10]
        //•	На третия ред - броят на хората в групата -  цяло число в диапазона [1...10]
        //•	На четвъртия ред - времето от деня – текст с възможности: "day" или "night"


        String month = scan.nextLine();
        int hours = Integer.parseInt(scan.nextLine());
        int peoplesGroup = Integer.parseInt(scan.nextLine());
        String partOfTheDay = scan.nextLine();

        double pricePerHour = 0;


        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (partOfTheDay.equals("day")) {
                pricePerHour = 10.5;
            } else {
                pricePerHour = 8.40;
            }

        } else {
            if (partOfTheDay.equals("day")) {
                pricePerHour = 12.60;
            } else {
                pricePerHour = 10.20;
            }

        }

        if (peoplesGroup >= 4) {
            pricePerHour *= 0.9;
        }

        if (hours >= 5){
            pricePerHour *= 0.5;
        }

        //•	На първия ред: "Price per person for one hour: {цена на човек за час}"
        //•	На втория ред: "Total cost of the visit: {общата цена}"

        System.out.printf("Price per person for one hour: %.2f\n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", pricePerHour * hours * peoplesGroup);

    }
}
