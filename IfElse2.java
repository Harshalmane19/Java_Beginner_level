import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y ");
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y ");
        int y = sc.nextInt();
        int difference=0;

        if (x > y) {
            System.out.println("x is bigger than y");
            difference=x-y;
            System.out.println("The difference between x and y is: "+difference);


        } else if (y > x) {
            System.out.println("x is smaller than y");
            difference=y-x;
            System.out.println("The difference between x and y is: "+difference);

        } else if (x == y) {
            System.out.println("x and y are the same");
        } else {
            System.out.println("No number is provided");
        }

    }
    }
