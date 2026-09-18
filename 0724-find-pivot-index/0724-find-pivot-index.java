class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int a:nums)
        {
            totalsum = totalsum+a;
        }

        int leftsum = 0;

        for(int i = 0; i<nums.length;i++)
        {
            int rightsum = totalsum - leftsum - nums[i];

            if(leftsum==rightsum)
            {
                return i;
            }

            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}