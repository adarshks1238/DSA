class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        int merge[] = new int [n*m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                merge[i*m+j] = matrix[i][j];
            }
        }

        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

        for(int num:merge)
        {
            p.add(num);

            if(p.size() > k)
            {
                p.poll();
            }
        }
        return p.peek();
    }
}