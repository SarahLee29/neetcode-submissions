class Solution {
    public int uniquePaths(int m, int n) {
        return dfs(0,0,m,n);      
    }
    private int dfs(int x,int y,int m,int n) {
        if (x == (m-1) && y == (n-1)) {
            return 1;
        }
        if (x > m-1 || y > n-1) {
            return 0;
        }
        return dfs(x+1,y,m,n) + dfs(x,y+1,m,n);
    }
}
