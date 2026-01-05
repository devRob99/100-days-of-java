import java.util.Scanner;

public class day4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Find the larger of two numbers

        int num1;
        int num2;

        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        if (num1 == num2)
        {
            System.out.println("The two numbers are equal");
        }
        else if (num1 > num2)
        {
            System.out.print(num1 + " is larger than " + num2);
        }
        else
        {
            System.out.print(num2 + " is larger than " + num1);
        }
    }
}