import java.util.Scanner;
public class DivideBill {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total bill: ");
        double bill=sc.nextDouble();
        System.out.println("Enter people : ");
        int p=sc.nextInt();
        double pay=bill/p;
        System.out.format("Bill pay by "+p+" people. Each person should pay %.2f and total bill is %.2f",pay,bill);

    }
}
