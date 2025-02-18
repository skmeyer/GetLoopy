import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int rollNum = 0;
        String continueYN = "";
        int rollSum = die1 + die2 + die3;

        do
        {
            System.out.println("Roll:        Die 1 | Die 2 | Die 3 | Sum");
            System.out.println("----------------------------------------");

            rollNum = 0;
            do
            {
                rollNum++;
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                rollSum = die1 + die2 + die3;
                System.out.printf("Roll: %-5d %4d %7d %7d %7d\n", rollNum, die1, die2, die3, rollSum);
            }while(die1 != die2 & die1 != die3 || die2 != die3);
            System.out.println("----------------------------------------");
            System.out.print("Would you like to roll again? [Y/N]: ");
            continueYN = in.nextLine();

        }while(continueYN.equalsIgnoreCase("Y"));
    }
}