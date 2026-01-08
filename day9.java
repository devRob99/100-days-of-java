// Fibonacci (recursive)
import java.util.Scanner;

public class day9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(fibonacci(n));

    }

    public static int fibonacci(int n)
    {
        if (n == 1)
        {
            return 0;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
