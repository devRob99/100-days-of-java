// Find the second largest number in an array
import java.util.Arrays;

public class day21
{
    public static void main(String[] args)
    {
        int[] nums = {1, 33, 99, 4, 8};
        int largestNum = 0;
        int secondLargestNum = 0;

        for (int x = 0; x < nums.length; x++)
        {
            if (largestNum < nums[x])
            {
                largestNum = nums[x];
            }
        }

        for (int y = 0; y < nums.length; y++)
        {
            if (nums[y] < largestNum && nums[y] > secondLargestNum)
            {
                secondLargestNum = nums[y];
            }
        }

        System.out.println(secondLargestNum);
    }
}