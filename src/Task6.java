public class Task6
{
    public static void main(String[] args)
    {
        for(int row = 5; row >= 1; row--)
        {
            System.out.println();
            for(int col = 1; col <= row; col++)
            {
                System.out.print(" *");
            }
        }
    }
}