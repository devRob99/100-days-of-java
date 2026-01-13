// List primes up to N (basic)
import java.util.Scanner;

public class day17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int x = 2; x <= N; x++)
        {
            boolean isPrime = true;


            for (int y = 2; y <= Math.sqrt(x); y++)
            {
                if (x % y == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.print(x + " ");
            }
        }
    }
}