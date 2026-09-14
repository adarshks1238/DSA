class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<=rowIndex;i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || i==j)
                {
                    list.add(1);
                }
                else
                {
                    list.add(
                        l.get(i-1).get(j-1) +
                        l.get(i-1).get(j)
                    );
                }
            }
            l.add(list);
        }
        return l.get(rowIndex);
    }
}