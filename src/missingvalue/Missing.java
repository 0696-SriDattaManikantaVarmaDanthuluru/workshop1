package missingvalue;

public class Missing {
    public static int missingNumber(int[] nums)
    {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        return expected - sum;
    }
}
