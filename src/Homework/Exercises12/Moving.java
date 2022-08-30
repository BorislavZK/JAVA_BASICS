package Homework.Exercises12;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roomLength = Integer.parseInt(scan.nextLine());
        int roomWidth = Integer.parseInt(scan.nextLine());
        int roomHeight = Integer.parseInt(scan.nextLine());
        boolean ifDone = false;

        int roomVolume = roomLength * roomWidth * roomHeight;

        int boxes = Integer.parseInt(scan.nextLine());

        while (roomVolume > boxes){

            String input = scan.nextLine();

            if (input.equals("Done")){
                ifDone = true;
                break;

            }

            roomVolume -= Integer.parseInt(input);

        }

        int roomVolumeLeft = roomVolume - boxes;

        if (ifDone){

            System.out.printf("%d Cubic meters left.", roomVolumeLeft);
        }else{

            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(roomVolumeLeft));
        }

    }
}
