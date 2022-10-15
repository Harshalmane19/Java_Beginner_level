import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password: ");
        while(true)
        {
            String pass=sc.next();
            if(!pass.equals("shark50"))
            {
                System.out.println("Enter password");
            }
            else
            {
               System.out.println("ACCESS AAPROVED");
            }

        }
    }
}
