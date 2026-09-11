class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxwater = 0;

        while(left<right)
        {
            int area = Math.min(height[left],height[right])*(right-left);
            maxwater = Math.max(maxwater,area);
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxwater;
    }
}