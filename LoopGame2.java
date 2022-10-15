import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopGame2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " guesses!");
            }

        } while (guess != randomNumber);
    }
}
