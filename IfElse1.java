import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y ");
        System.out.println("Enter the value of x ");
        int x=sc.nextInt();
        System.out.println("Enter the value of y ");
        int y=sc.nextInt();

        if(x>y)
        {
            System.out.println("x is bigger than y");

        }
        else if(y>x)
        {
            System.out.println("x is smaller than y");

        }
        else if(x==y)
        {
          System.out.println("x and y are the same");
        }
        else
        {
            System.out.println("No number is provided");
        }


    }
}
