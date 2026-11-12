class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> p = new PriorityQueue<>(
            (a,b)->Integer.compare(map.get(a),map.get(b))
            );

        for(int n:map.keySet())
        {
            p.add(n);

            if(p.size() > k)
            {
                p.poll();
            }
        }

        int result [] = new int [k];

        for(int i=0;i<k;i++)
        {
            result[i] = p.poll();
        }

        return result;
    }
}