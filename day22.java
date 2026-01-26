// Remove duplicates from an array (keep order)
import java.util.ArrayList;
import java.util.Arrays;

public class day22
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 93, 45, 85, 44, 84, 85, 32, 43, 23, 23, 1, 5));
        ArrayList<Integer> copyNums = new ArrayList<Integer>();

        for (int i = 0; i < nums.size(); i++)
        {
            boolean found = false;

            for (int y = 0; y < copyNums.size(); y++)
            {
                if (nums.get(i) == copyNums.get(y))
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                copyNums.add(nums.get(i));
            }
        }

        System.out.println(copyNums);
    }
}
