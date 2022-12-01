package TESTS;

public class CharPlusASCII {
    public static void main(String[] args) {


        String test = "Bobi i Dana";

        int asciiSum = 0;

        for (int i = 0; i <= test.length() - 1; i++) {

            char currentChar = test.charAt(i);
            int asciiNum = currentChar;
            asciiSum += asciiNum;

            System.out.printf("Current ASCII NUM = %d\n", asciiNum);


        }

        System.out.printf("ASCII SUM = %d", asciiSum);


    }
}
