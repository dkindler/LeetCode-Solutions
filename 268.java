// https://leetcode.com/problems/missing-number/
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int goal = 0;

        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
            goal ^= (i + 1);
        }

        return goal ^ sum;
    }
}
