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


        for (int i = 1; i <= games ; i++) {

            String result = scan.nextLine();

            if(result.equals("W")){
                w++;
            }else if (result.equals("D")){
                d++;
            }else{
                l++;
            }


            //	W - Отборът е победител и получава 3 точки
            //	D - Срещата е завършила без победител и отборът получава 1 точка
            //	L - Отборът е загубил срещата и не получава точки


        }
    }
}
