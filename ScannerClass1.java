import java.util.Scanner;
public class ScannerClass1 {
    public static void main(String[] args)
    {
        /* Scanner is a class in java. It is easiest way to read input in java program. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname=sc.next();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Amount of money in your pocket: £");
        double money = sc.nextDouble();
        /* Math.ceil() method rounds the specified double value upward and returns it.ie. the value 3.24 will be
         rounded to 4.0 which is equal to integer 4. */
        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is "+fname+" The length of name is "+fname.length()+" characters long");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old.");

        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);


    }
}
