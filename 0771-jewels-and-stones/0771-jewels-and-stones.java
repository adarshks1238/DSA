class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int totalcount = 0;
        int i=0;
        while(i<jewels.length())
        {
            for(int j=0;j<stones.length();j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    totalcount++;
                }
            }
            i++;
        }
        return totalcount;
    }
}