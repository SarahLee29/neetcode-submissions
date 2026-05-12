class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
             map.put(nums[i],i);
        }
        
        int a = -1;
        int b = -1;
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            a = i;            
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                res[0] = Math.min(i,map.get(target - nums[i]));
                res[1] = Math.max(i,map.get(target - nums[i]));                
                return res;               
            }          
        }        

        return new int[0];
       
    }
}
