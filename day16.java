//Check if a number is prime
import java.util.Scanner;

public class day16
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;

        if (num == 2)
        {
            System.out.println("Prime Number");
        }
        else if (num < 2)
        {
            System.out.println("Not a Prime number");
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println("Not a Prime number");
            }
        }
    }
}