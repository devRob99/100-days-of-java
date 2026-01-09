// Check if a string is a palindrome
import java.util.Scanner;

public class day11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int top = word.length();

        for (int i = 0; i <= word.length() / 2; i++)
        {
            if (word.charAt(i) != word.charAt(top - 1))
            {
                System.out.print("Not a Palindrome");
                break;
            }
            else if (i == word.length() / 2)
            {
                System.out.print("Palindrome");
            }
            else
            {
                top--;
            }
        }
    }
}
