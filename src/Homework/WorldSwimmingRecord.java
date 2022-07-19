package Homework;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secPerMeter= Double.parseDouble(scan.nextLine());

        double ivanTime = distance * secPerMeter;

        double resistance = Math.floor(distance / 15 ) * 12.5;

        ivanTime = ivanTime + resistance;

        if (ivanTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - worldRecord);
        }


    }
}
