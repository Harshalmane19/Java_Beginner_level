import java.util.Scanner;

public class Guest_Dash {
    static String[] guest=new String[10];
    static Scanner sc=new Scanner(System.in);
        public static void main(String[] args)
        {
            insertTestNames();


            do {
                displayGuest();
                displayMenu();
                int option=getOption();



                if (option == 1) {

                     addGuest();
                }
                if(option==2)
                {
                    insertGuest();
                }
                else if(option==3)
                {
                   renameGuest();
                }
                else if(option==4){
                   removeGuest();
                }
                else if(option==5)
                {
                    break;
                }

            }while(true);

            System.out.println("Existing...");

        }
        static public void displayGuest()
        {
            boolean isEmpty=true;
            System.out.println("_______________________\n -Guests- \n");
            for (int i = 0; i < guest.length; i++) {
                if(guest[i]!=null) {
                    System.out.println((i + 1) + ". " + guest[i]);
                    isEmpty=false;
                }
            }
            if(isEmpty)
            {
                System.out.println("Guest list is empty");
            }
        }
        static public void displayMenu()
        {
            System.out.println("_______________________\n-Menu-\n");

            System.out.println("1.Add Guest");
            System.out.println("2.Insert Guest");
            System.out.println("3.Rename");
            System.out.println("4.Remove Guest");
            System.out.println("5.Exit");
        }
    static public int getOption()
    {
        System.out.println("Option: ");
        int option = sc.nextInt();
        sc.nextLine();
        System.out.println();
        return option;
    }
    static void addGuest()
    {
        for (int i = 0; i < guest.length; i++) {
            if(guest[i]==null)
            {
                System.out.println("Name:");
                guest[i]=sc.nextLine();

                break;
            }
        }
    }
    static void insertGuest()
    {
        System.out.println("Num:");
        int num=sc.nextInt();
        sc.nextLine();
        if(num>=1 && num<=10 && guest[num-1]!=null) {
            System.out.println("Name:");
            String name = sc.nextLine();
            for(int i=guest.length-1; i>num-1; i--){
                guest[i] = guest[i-1];
            }
            guest[num-1]=name;
        }
        else
        {
            System.out.println("Error...There is no guest with number");
        }

    }
    static void renameGuest()
    {
        System.out.println("Num:");
        int num=sc.nextInt();
        sc.nextLine();
        if(num>=1 && num<=10 && guest[num-1]!=null) {
            System.out.println("Name:");
            String name = sc.nextLine();
            guest[num - 1] = name;
        }
        else
        {
            System.out.println("Error...There is no guest with number");
        }

    }
    static void removeGuest()
    {
        System.out.println("Enter name");
        int num=sc.nextInt();
        if(num>=1 && num<=10 && guest[num-1]!=null) {
            guest[num - 1] = null;


            String[] temp = new String[guest.length];
            int ti = 0;
            for (int i = 0; i < guest.length; i++) {
                if (guest[i] != null) {
                    temp[ti] = guest[i];
                    ti++;
                }
            }
            guest = temp;
        }
        else
        {
            System.out.println("Error...There is no guest with number");
        }


    }
    static void insertTestNames()
    {
        guest[0] = "Jacob";
        guest[1] = "Edward";
        guest[2] = "Rose";
        guest[3] = "Molly";
        guest[4] = "Christopher";

    }
    }

