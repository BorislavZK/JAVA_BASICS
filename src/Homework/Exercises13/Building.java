package Homework.Exercises13;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms ; j++) {
                if ( i == floors){
                    System.out.printf("L%d%d",i,j);

            }
        }

    }


}
}
