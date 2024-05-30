import java.util.*;

public class Bonus {

    public static void main(String[] args) {


        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(stringnumber);

    }

    public static HashSet<Integer> randomnumbergenerator() {
    Random rand = new Random();
    Integer upperbound = 9;
    HashSet<Integer> secretnumber = new HashSet<>();
    Integer randomnumber = 0;
    int count = 0;

        while(secretnumber.size() < 4) {
        randomnumber = rand.nextInt(upperbound);
        secretnumber.add(randomnumber);
        count++;
    }
        return secretnumber;
    }

    public static String setToStringConverter(HashSet<Integer> secretnumber) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer item : secretnumber) {
            stringBuilder.append(item.toString());
        }
        return stringBuilder.toString();
    }

    public static void feedback(String stringbuilder) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringbuilder)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringbuilder.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringbuilder.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
