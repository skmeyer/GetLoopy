import java.util.Random;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int rollNum = 0;
        int rollSum = die1 + die2 + die3;

        System.out.println("Roll:        Die 1 | Die 2 | Die 3 | Sum");
        System.out.println("----------------------------------------");

        while(die1 != die2 & die1 != die3 || die2 != die3)
        {
            rollNum++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            System.out.printf("Roll: %-5d %4d %7d %7d %7d\n", rollNum, die1, die2, die3, rollSum);
        }
        System.out.println("----------------------------------------");

    }
}