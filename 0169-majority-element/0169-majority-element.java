import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }


        Map.Entry<Integer,Integer> maxentry = null;

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(
                maxentry == null ||
                entry.getValue() > maxentry.getValue()
            )
            {
                maxentry = entry;
            }
        }
        int result = maxentry.getKey();
        return result;
    }
}