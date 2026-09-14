import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minabs =  arr[1] - arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]<minabs)
            {
                minabs = arr[i] - arr[i-1];
            }
            
        }

        ArrayList<List<Integer>> l = new ArrayList<>();


        for(int j=1 ; j<arr.length ; j++)
        {
            if(arr[j]-arr[j-1] == minabs)
            {
                ArrayList<Integer> list = new ArrayList<>();

                list.add(arr[j-1]);
                list.add(arr[j]);
                l.add(list);
            }
        }
        return l;
    }
}