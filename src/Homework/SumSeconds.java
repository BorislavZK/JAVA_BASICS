package Homework;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int FirstTime = Integer.parseInt(scan.nextLine());
        int SecondTime = Integer.parseInt(scan.nextLine());
        int ThirdTime = Integer.parseInt(scan.nextLine());

        int TotalTime = FirstTime + SecondTime + ThirdTime;
        int Minutes = TotalTime / 60;
        int Seconds = TotalTime % 60;

        if ( Seconds < 10 ) {
            System.out.printf("%d:0%d", Minutes, Seconds);
        } else {
            System.out.printf("%d:%d", Minutes, Seconds);
        }
    }
}
