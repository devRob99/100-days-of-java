// Compute LCM
import java.util.Scanner;

public class day19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();

        if (numOne < numTwo)
        {
            int holder = numTwo;

            numTwo = numOne;
            numOne = holder;
        }

        int LCM = numOne * numTwo;
        int temp = numTwo;
        int GCD = numOne;

        while (temp > 0)
        {
            int remainder = GCD % temp;

            GCD = temp;
            temp = remainder;
        }

        LCM = LCM / GCD;
        System.out.println(LCM);
    }

}