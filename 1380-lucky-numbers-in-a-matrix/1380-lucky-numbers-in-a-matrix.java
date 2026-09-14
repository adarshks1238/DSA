class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int row=0 ; row<matrix.length ; row++)
        {
            int min = matrix[row][0];
            int mincol = 0;

            for(int col=0;col<matrix[row].length;col++)
            {
                if(matrix[row][col]<min)
                {
                    min = matrix[row][col];
                    mincol = col;
                }
            }

            boolean ismax = true;


            for(int r=0 ; r<matrix.length ; r++)
            {
                if(matrix[r][mincol]>min)
                {
                    ismax = false;
                    break;
                }
            }
        if(ismax)
        {
            result.add(min);
        }
        }
        return result;
    }
}