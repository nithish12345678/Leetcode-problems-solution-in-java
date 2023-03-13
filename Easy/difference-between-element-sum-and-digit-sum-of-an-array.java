class Solution {
    public int digitSum(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem;
            n = n / 10;
        }
        return ans;
    }

    public int differenceOfSum(int[] nums) {

        int elSum = 0, digSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elSum += nums[i];
            digSum += digitSum(nums[i]);

        }

        return Math.abs(elSum - digSum);

    }
}