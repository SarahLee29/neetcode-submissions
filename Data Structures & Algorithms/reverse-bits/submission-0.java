class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i ++) {
            res = res << 1;
            int left_most = n & 1;
            res |= left_most;
            n = n >>> 1;
        }
        return res;        
    }
}
