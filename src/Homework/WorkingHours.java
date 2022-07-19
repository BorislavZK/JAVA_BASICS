package Homework;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
// 10 do 18 h
        switch (day){
            case "Monday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;

            case "Tuesday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Wednesday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Thursday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Friday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Saturday":
                if ( hour >= 10 && hour<= 18 ){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                    System.out.println("closed");
                break;
            default:
                System.out.println("closed");
                break;
        }

    }
}


// Tuesday  Wednesday Thursday Friday Saturday
//Sunday