import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopGame {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = sc.nextInt();
            if(guess==randomNumber)
            {
                System.out.println("Correct");
            }

            else if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }

        } while (guess != randomNumber);

    }
}
