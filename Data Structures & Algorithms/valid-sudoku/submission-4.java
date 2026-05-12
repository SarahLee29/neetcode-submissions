class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set;
        for (int i = 0; i < 9; i++) {
            set = new HashSet<>();
            for (int j = 0; j < 9; j++) {    
                if (set.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.') {
                    set.add(board[i][j]);
                    if (board[i][j] > '9' || board[i][j] < '1') {
                        return false;
                    }
                }              
            }
        }

        for (int j = 0; j < 9; j++) {
            set = new HashSet<>();
            for (int i = 0; i < 9; i++) {                
                if (set.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.') {
                    set.add(board[i][j]);
                    if (board[i][j] > '9' || board[i][j] < '1') {
                        return false;
                    }
                }  
            }
        }

        for (int block = 0; block < 9; block++) {
            set = new HashSet<>();   
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) { 
                    int row = (block / 3) * 3 + i;
                    int col = (block % 3) * 3 + j; 
                    if (set.contains(board[row][col])) {
                        return false;
                    }
                    if (board[row][col] != '.') {
                        set.add(board[row][col]);
                        if (board[row][col] > '9' || board[row][col] < '1') {
                            return false;
                        }
                    } 
                }
            }                                 
        }
        return true;
    }
}
