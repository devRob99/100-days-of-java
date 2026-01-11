// Reverse an integer
import java.util.Scanner;

public class day15
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int revNum = 0;
        boolean isNegative = num < 0;
        num = Math.abs(num);

        if (num == 0)
        {
            System.out.print("0");
        }
        else
        {
            while (num > 0)
            {
                revNum = revNum * 10 + num % 10;
                num = num / 10;

                System.out.println(revNum);
            }

            if (isNegative)
            {
                revNum = -revNum;
            }
        }

        //System.out.println(revNum);
    }
}