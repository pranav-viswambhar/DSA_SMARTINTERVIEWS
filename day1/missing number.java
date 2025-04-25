public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = nums.length; // Start with 'n' because index goes from 0 to n-1

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}

