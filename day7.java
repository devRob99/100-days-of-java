// Compute factorial (recursive)

import java.util.Scanner;

public class day7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int counter = scan.nextInt();

        int result = factorial(counter);

        System.out.println(result);
    }

    public static int factorial(int n)
    {
        if (n == 0) // base case
        {
            return 1;
        }

        return n * factorial(n - 1); // recursive case
    }
}