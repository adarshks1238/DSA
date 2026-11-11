class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookies = 0;


        while(child < g.length && cookies < s.length)
        {
            if(s[cookies] >= g[child])
            {
                child++;
            }
            cookies++;
        }
        return child;
    }
}