class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<=right)
        {
            if(target==(numbers[left]+numbers[right]))
            {
                return new int[]{left+1,right+1};
            }
            else if(target>(numbers[left]+numbers[right]))
            {
                left++;
            }
            else
            {
                right --;
            }
        }
        return new int[]{};
    }
}