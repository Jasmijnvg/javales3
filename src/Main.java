    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"one", "two", "three", "four", "Five", "six", "seven", "eight", "nine", "zero"};

        Translator translate = new Translator(alphabetic, numeric);

        Boolean play = true;
        String invalid = "invalid input";

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (play) {
            System.out.println("Type 'x' te stop \nType 'v' to translate");
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type a number between 0 to 9");
            }

            int number = scanner.nextInt();

            if (number < 10) {
                String result = translate.translate(number);
                System.out.println("The translation of " + number + " is " + result);
            } else {
                System.out.println(invalid);
            }


        }
    }
}

