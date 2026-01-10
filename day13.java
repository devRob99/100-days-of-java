// Count occurrences of a character in a string

import java.util.Scanner;

public class day13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        String string = scan.nextLine();

        int count = string.length();
        int num = 0;

        for (int i = 0; i < count; i++)
        {
            if (Character.toLowerCase(x.charAt(0)) == Character.toLowerCase(string.charAt(i)))
            {
                num++;
            }
        }

        System.out.println(num);
    }
}