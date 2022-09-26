import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String player = scan.nextLine();
        int gols = 0;
        int maxGoals = Integer.MIN_VALUE;
        String winner = "";
        boolean flag = false;

        while (!player.equals("END")) {
            gols = Integer.parseInt(scan.nextLine());

            if (gols > maxGoals) {
                maxGoals = gols;
                winner = player;

                if (maxGoals >= 10) {
                    flag = true;
                    //System.out.printf("%s is the best player!", winner);
                    break;
                }

            }

            player = scan.nextLine();
        }

        if (flag) {
            System.out.printf("%s is the best player!\n",winner);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
            return;
        }

        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!\n",winner);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);

        } else {
            System.out.printf("%s is the best player!\n",winner);
            System.out.printf("He has scored %d goals.",maxGoals);
        }



    }
}
