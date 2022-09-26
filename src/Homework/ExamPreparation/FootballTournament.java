package Homework.ExamPreparation;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());
        int w = 0;
        int d = 0;
        int l = 0;
        int points = 0;


        if (games == 0){
            System.out.printf("%s hasn't played any games during this season.", team);
            return;
        }


        for (int i = 1; i <= games ; i++) {

            String result = scan.nextLine();

            if(result.equals("W")){
                w++;
                points += 3;
            }else if (result.equals("D")){
                d++;
                points += 1;
            }else{
                l++;
            }

        }

        double wPer = (100.00 / games) * w;
        double dPer = (100.00 / games) * d;
        double lPer = (100.00 / games) * l;

        System.out.printf("%s has won %d points during this season.\n", team,points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n",w);
        System.out.printf("## D: %d\n",d);
        System.out.printf("## L: %d\n",l);
        System.out.printf("Win rate: %.2f%%\n",wPer);


    }
}
