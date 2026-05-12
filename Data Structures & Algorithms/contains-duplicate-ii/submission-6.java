class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }
        int left = 0;
        int right = left + k;
        boolean res = false;
        if (k < nums.length) {
            while (right <= nums.length) {
                int[] copy = Arrays.copyOfRange(nums, left, right+1);
                Arrays.sort(copy);
                for (int i = 0; i <= k-1; i++) {
                    if (copy[i] == copy[i+1]) {
                        return true;
                    }
                }
                left++;
                right++;
            }
        }
        else {
            Arrays.sort(nums);  
            for (int i = 0; i <= nums.length-1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
            }  
        }      
        return res;
    }
}