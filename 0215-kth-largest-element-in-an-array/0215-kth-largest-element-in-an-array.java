class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int a:nums)
        {
            p.add(a);

            if(p.size() > k)
            {
                p.poll();
            }
        }
        return p.peek();
    }
}