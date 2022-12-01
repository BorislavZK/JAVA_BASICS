package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int eggs = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int totalEggsSold = 0;
        boolean flag = false;


        while (!input.equals("Close")) {

            int eggsCount = 0;

            eggsCount = Integer.parseInt(scan.nextLine());

            if (input.equals("Fill")) {
                eggs += eggsCount;
            } else if (input.equals("Buy")) {
                if (eggsCount > eggs) {
                    System.out.println("Not enough eggs in store!");
                    flag = true;
                    break;
                } else {
                    eggs -= eggsCount;
                    totalEggsSold += eggsCount;
                }

            }


            input = scan.nextLine();
        }

        if(flag){
            System.out.printf("You can buy only %d.", eggs);
        }else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", totalEggsSold);
        }



    }
}
