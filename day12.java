// Count vowels in a string
import java.util.Scanner;

public class day12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int counter = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (isVowel(Character.toLowerCase(word.charAt(i))))
            {
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}