import java.util.Scanner;

public class day3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Check if a number is even/odd

        int num;
        num = scan.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd");
        }
    }
}
