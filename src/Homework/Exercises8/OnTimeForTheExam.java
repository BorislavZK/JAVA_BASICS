package Homework.Exercises8;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMin = Integer.parseInt(scan.nextLine());
        int hourOfArrivel = Integer.parseInt(scan.nextLine());
        int minOfArrival = Integer.parseInt(scan.nextLine());

        int examAllMin = examHour * 60 + examMin;
        int arriveAllMin = hourOfArrivel * 60 + minOfArrival;

        int diff = Math.abs(examAllMin - arriveAllMin);

        int diffHour = diff / 60;
        int diffMin = diff % 60;

        if (examAllMin < arriveAllMin){
            System.out.println("Late");
            if (diffHour == 0){
                System.out.printf("%d minutes after the start", diffMin);
            }else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMin);
            }
        }else if (examAllMin == arriveAllMin || diff <= 30) {
            System.out.println("on time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diffMin);
            }

        }else {
            System.out.println("Early");
            if (diffHour == 0 ){
                System.out.printf("%d minutes before the start", diffMin);

            }else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);
            }
        }

    }
}
