// Reverse a string
import java.util.Scanner;

public class day10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int x = word.length() - 1;
        for (int i = 0; i < word.length(); i++)
        {
            System.out.print(word.charAt(x));
            x--;
        }

    }
}