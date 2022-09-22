package Homework.ExamPreparation;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int wallHeight = Integer.parseInt(scan.nextLine());
        int wallWidth = Integer.parseInt(scan.nextLine());
        int noPaintPercent = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        double volume = Math.ceil(wallHeight * wallWidth * 4);
        double totalVolume = volume - ((volume / 100) * noPaintPercent);


        while (!command.equals("Tired!")){

            int paint = Integer.parseInt(command);

            totalVolume -= paint;

            if (totalVolume < 0 ){
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(totalVolume-paint));
                break;
            }

            command = scan.nextLine();
        }

        if(command.equals("Tired!")){

            System.out.printf("%.0f quadratic m left.",totalVolume);

        }




    }
}
