import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6); //i=1 till i<6
        System.out.print("Your guess: ");
        int num=sc.nextInt();


        if(num==randomNumber)
        {
            System.out.println("Correct! Aren’t you lucky.");
        }
        else
        {
            System.out.println("Hard luck! Maybe next time..");
        }
    }
}
