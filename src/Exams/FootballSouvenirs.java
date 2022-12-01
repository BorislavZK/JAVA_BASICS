package Exams;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        String type = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (!team.equals("Argentina") && !team.equals("Brazil") && !team.equals("Croatia" ) && !team.equals("Denmark")){
            System.out.println("Invalid country!");
            return;
        }

        if (!type.equals("flags") && !type.equals("caps") && !type.equals("posters") && !type.equals("stickers")) {
            System.out.println("Invalid stock!");
            return;
        }

        switch (type){
            case "flags":
                if (team.equals("Argentina")){
                    price = 3.25;
                } else if (team.equals("Brazil")){
                    price = 4.20;
                } else if (team.equals("Croatia")){
                    price = 2.75;
                } else {
                    price = 3.10;
                }
                break;

            case"caps":
                if (team.equals("Argentina")){
                    price = 7.20;
                } else if (team.equals("Brazil")){
                    price = 8.50;
                } else if (team.equals("Croatia")){
                    price = 6.90;
                } else {
                    price = 6.50;
                }
                break;
            case"posters":
                if (team.equals("Argentina")){
                    price = 5.10;
                } else if (team.equals("Brazil")){
                    price = 4.20;
                } else if (team.equals("Croatia")){
                    price = 2.75;
                } else {
                    price = 3.10;
                }
                break;
            case"stickers":
                if (team.equals("Argentina")){
                    price = 1.25;
                } else if (team.equals("Brazil")){
                    price = 1.20;
                } else if (team.equals("Croatia")){
                    price = 1.10;
                } else {
                    price = 0.90;
                }
                break;

            default:
                break;

        }

        scan.close();

        double total = count * price;

        System.out.printf("Pepi bought %d stickers of %s for %.2f lv.", count,team,total);
    }
}
