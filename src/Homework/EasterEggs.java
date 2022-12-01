package Homework;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int eggs = Integer.parseInt(scan.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxEggsString = "";
        
        for (int i = 1; i <= eggs ; i++) {

            String eggColor = scan.nextLine();

            switch (eggColor){
                case"red":
                    red++;
                    break;
                case"orange":
                    orange++;
                    break;
                case"blue":
                    blue++;
                    break;
                case"green":
                    green++;
                    break;
            }

            if (maxEggs < red){
                maxEggs = red;
                maxEggsString = "red";
            }else if( maxEggs < orange){
                maxEggs = orange;
                maxEggsString = "orange";
            }else if (maxEggs < blue){
                maxEggs = blue;
                maxEggsString = "blue";
            }else if (maxEggs < green){
                maxEggsString = "green";
                maxEggs = green;
            }


        }

        System.out.printf("Red eggs: %d\n", red);
        System.out.printf("Orange eggs: %d\n", orange);
        System.out.printf("Blue eggs: %d\n", blue);
        System.out.printf("Green eggs: %d\n", green);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsString);

    }
}
