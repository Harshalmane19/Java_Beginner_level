import java.util.Scanner;

public class Que_Ans {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] s=new String[]{
                "The moon is further away from the earth than the sun is",
                "Goldfish only have a three second memory",
                "Microwaves have a longer wavelength than ultraviolet",
                "Antibiotics are used to treat viral infections",
                "Octopuses have three hearts"
        };
        boolean[] ans={true,false,true,true,false};
        boolean[] userans=new boolean[5];
        int f=0;

        for(int i=0;i<s.length;i++)
        {
            System.out.println("The question number "+(i+1)+ " is");
            System.out.println(s[i]);
            System.out.println("Answer of "+(i+1)+"question is :");
            userans[i]=sc.nextBoolean();

            if(ans[i]==userans[i])
            {
                System.out.println("Your answer is correct \n");
                f++;
            }
        }
        System.out.println("Your score is: "+f+" out of 5");


    }
}
