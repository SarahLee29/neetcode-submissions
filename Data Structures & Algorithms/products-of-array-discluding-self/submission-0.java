class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int countZero = 0;
        int prod = 1;
        for (int num : nums) {
            if (num == 0) {
                countZero ++;
            } else {
                prod *= num;
            }
        }

        if (countZero > 1) {
            return res;
        }
        
        for (int i = 0; i < len; i++) {
            if (countZero > 0) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            } 
        }
         return res;
        
    }
}  
