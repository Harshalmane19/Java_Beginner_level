import java.util.Scanner;

public class Array4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] a=new String[5];
        for(int i=0;i<a.length;i++)
        {
            a[i] =sc.nextLine();
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            if(count==2) {
               System.out.println("No more memory");
               break;
            }
            count++;

        }

    }
}
