
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            if (right >= k) {
                sum = sum - nums[right - k];
            }

            if (right >= k - 1) {

                maxSum = Math.max(sum, maxSum);
            }
        }

        return (double) maxSum / k;
    }
}
