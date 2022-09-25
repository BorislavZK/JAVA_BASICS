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
            System.out.printf("%s hasn't played any games during this season", team);
            return; //BREAK
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

            //	W - Отборът е победител и получава 3 точки
            //	D - Срещата е завършила без победител и отборът получава 1 точка
            //	L - Отборът е загубил срещата и не получава точки

            //"Total stats:"
            //"## W: {брой спечелени игри}"
            //"## D: {брой игри, завършили наравно}"
            //"## L: {брой загубени игри}"
            //"Win rate: {процент спечелени игри}%"

        }

        double

        System.out.printf("%s has won %d points during this season\n", team,points);
        System.out.println("Total stats:");
        System.out.printf("## W: {брой спечелени игри}");


    }
}
