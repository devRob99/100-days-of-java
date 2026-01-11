// Sum of digits of an integer
import java.util.Scanner;

public class day14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        num = Math.abs(num); // Return absolute value of num if negative
        int sum = 0;

        while (num > 0)
        {
            sum += num % 10; // Adds last digit to sum
            num /= 10; // Removes last digit from num
        }

        System.out.println(sum);
    }
}