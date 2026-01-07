// Fibonacci (iterative)
import java.util.Scanner;

public class day8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();


        if (num == 1)
        {
            System.out.print(0);
        }
        else
        {
            long num1 = 0;
            long num2 = 1;

            System.out.print(num1 + " " + num2 + " ");

            for (int x = 2; x < num; x++)
            {

                long num3 = num1 + num2;

                System.out.print(num3 + " ");

                num1 = num2;
                num2 = num3;
            }
        }
    }
}