package Homework;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();;
        int episode = Integer.parseInt(scan.nextLine());
        int launchBreak = Integer.parseInt(scan.nextLine());

        double launch = launchBreak * 0.125;
        double relaxTime = launchBreak * 0.25;
        double totalTime = episode + launch + relaxTime;
        double totalLeft = Math.abs(launchBreak - totalTime);

        if ( launchBreak >= totalTime ) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(totalLeft));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(totalLeft));


        }



    }
}
