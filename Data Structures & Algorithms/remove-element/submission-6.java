class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;
        int l = 0;
        int temp;
        while (l <= r) {
            if (nums[l] == val){
                if (nums[r] != val) {
                    temp = nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                    l++;
                    r--;
                } else {
                    r--;
                }              
            } else {
                l++;
            }           
        }
        return r+1;
}
}