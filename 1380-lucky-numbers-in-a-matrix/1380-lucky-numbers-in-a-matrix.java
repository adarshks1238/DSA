class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            int min = matrix[row][0];
            int minCol = 0;

            for (int col = 1; col < matrix[row].length; col++) {

                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    minCol = col;
                }
            }

            boolean isMax = true;

            for (int r = 0; r < matrix.length; r++) {

                if (matrix[r][minCol] > min) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                result.add(min);
            }
        }

        return result;
    }
}