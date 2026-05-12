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

        for (int i = 0; i < 7; i+=3) {
            for (int j = 0; j < 7; j+=3) {
                set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        if (set.contains(board[i+k][j+m])) {
                            return false;
                        }
                        if (board[i+k][j+m] != '.') {
                            set.add(board[i+k][j+m]);
                            if (board[i+k][j+m] > '9' || board[i+k][j+m] < '1') {
                                return false;
                            }
                        }  
                    
                    }
                }
            }
        }
        return true;
    }
}
