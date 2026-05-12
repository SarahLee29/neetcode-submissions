class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n > 0) {
            int m = 0;
            m = n>>1;
            if (n%2!=0) {
                res++;
            }
            n = m;
        }
        return res;
        
    }
}
