// Compute GCD (Euclid)
import java.util.Scanner;

public class day18
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int remainder = 1;

        if (numOne < numTwo)
        {
            int holder = numTwo;

            numTwo = numOne;
            numOne = holder;
        }

        while (remainder > 0)
        {
            remainder = numOne % numTwo;

            numOne = numTwo;
            numTwo = remainder;
        }

        System.out.println(numOne);

    }
}