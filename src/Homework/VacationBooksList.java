package Homework;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());


        //Общо време за четене на книгата: 212 страници / 20 страници за час = 10 часа общо Необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден

        int totalTime = pages / pagesPerHour;
        int hoursperday = totalTime / days;

        System.out.println(hoursperday);
    }
}
