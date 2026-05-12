class Solution {
    

    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       int n = nums.length;
       for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],i);
            } else {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }  
                map.replace(nums[i], i);              
            }       
       }
        return false;       
    }       
        
}
