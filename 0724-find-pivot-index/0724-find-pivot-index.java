class Solution {
    public int pivotIndex(int[] nums) {
            for(int j = 0 ; j<nums.length;j++)
            {
                int sumleft = 0;
                if(j>0)
                {
                   for(int l = 0;l<j;l++)
                    {
                        sumleft = sumleft + nums[l];
                    } 
                }
                int sumright = 0;
                for(int l = j+1;l<nums.length;l++)
                {
                    sumright = sumright + nums[l];
                }

                if(sumleft==sumright)
                {
                    return j;
                }
            }
        return -1;
    }
}