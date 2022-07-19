package Homework;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int totaltime = hour * 60 + min + 15;

        int newHour = totaltime / 60;
        int newMin = totaltime % 60;

        if ( newHour == 24 ) {
            newHour = 0;
        }

        System.out.printf("%d:%02d", newHour, newMin);
    }
}
