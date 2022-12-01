package TESTS;

public class ForLoopAndString {
    public static void main(String[] args) {


        String name = "Bobi";

        for (int i = 0; i <= name.length() - 1; i ++ ) {
            char symbol = name.charAt(i);
            System.out.println(symbol);
        }

        //        char symbol = name.charAt(2);
        //        System.out.println(symbol);
    }
}
