import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {
    public static void main(String[] args) {

        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + randomNumber + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } else if (input.equals("lower")) {
                max = randomNumber - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
                break;
            }

            // This if statement checks to see if it's still possible to win
            // Example: The program guesses 28, you enter "higher", then the program guesses 29, you enter "lower"
            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
            }
        }
    }
}
