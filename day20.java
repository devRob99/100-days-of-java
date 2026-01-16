//Convert Celsius ↔ Fahrenheit
import java.util.Scanner;

public class day20
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter F if you are converting from Fahrenheit to Celsius or enter C if you are converting from Celsius to Fahrenheit.");
        String tempType = scan.nextLine();
        int temp;
        tempType = tempType.toLowerCase();

        while(tempType.charAt(0) != 'c' && tempType.charAt(0) != 'f')
        {
            System.out.println("Invalid input, try again");
            String tryAgain = scan.nextLine();
            tempType = tryAgain.toLowerCase();
        }

        if (tempType.charAt(0) == 'f')
        {
            System.out.println("Enter temperature in Fahrenheit to convert to Celsius: ");
            temp = scan.nextInt();
            System.out.print((temp - 32) * 5/9);
            System.out.println("C");
        }
        else
        {
            System.out.println("Enter temperature in Celsius to convert to Fahrenheit: ");
            temp = scan.nextInt();
            System.out.print((temp * 9/5) + 32);
            System.out.println("F");
        }
    }
}