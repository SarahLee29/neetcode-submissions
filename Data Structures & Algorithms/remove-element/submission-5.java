class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;
        int l = 0;
        int temp;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == val){
                nums[i] = -1;
            } 
        }
        while (l <= r) {
            if (nums[l] < 0 ){
                if (nums[r] >= 0) {
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