import java.util.Scanner;

public class TIcTacToe {
    public static void main(String[] args) {
        char[] a = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        Scanner sc = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn=1;
        while (true) {
            do {
                System.out.println("Enter position: ");
                input = sc.nextInt();
            } while (a[input-1] == 'X' || a[input-1] == 'O');

            a[input - 1] = turn;


            System.out.println(" " + a[6] + "| " + a[7] + " | " + a[8] + "   ");
            System.out.println("--+--+---");
            System.out.println(" " + a[3] + "| " + a[4] + " | " + a[5] + "   ");
            System.out.println("--+--+---");
            System.out.println(" " + a[0] + "| " + a[1] + " | " + a[2] + "  \n ");

            if(a[0]==turn && a[1]==turn && a[2]==turn ||
                    a[3]==turn && a[4]==turn && a[5]==turn ||
                    a[6]==turn && a[7]==turn && a[8]==turn ||
                    a[6]==turn && a[3]==turn && a[0]==turn ||
                    a[7]==turn && a[4]==turn && a[1]==turn ||
                    a[8]==turn && a[5]==turn && a[3]==turn ||
                    a[6]==turn && a[4]==turn && a[2]==turn ||
                    a[8]==turn && a[4]==turn && a[0]==turn)
            {
                System.out.println(turn+" is WINNER ");
                break;
            }

            if (turn == 'X')
                turn = 'O';
            else if (turn == 'O') {
                turn = 'X';
            }
            currentTurn++;
            if(currentTurn >9)
            {
                System.out.println("End");
            }
        }

    }
}

