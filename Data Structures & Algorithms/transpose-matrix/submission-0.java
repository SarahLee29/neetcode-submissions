class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 1; i < r; i++){
            if (matrix[i].length > c) {
                c = matrix[i].length;
            }            
        }

        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j  = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}