import java.util.Scanner;

public class day6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Compute factorial (iterative)

        int counter;
        long factorial = 1;

        counter = scan.nextInt();

        for (int x = counter; x > 0; x--)
        {
            factorial = x * factorial;
        }

        System.out.println(factorial);
    }
}