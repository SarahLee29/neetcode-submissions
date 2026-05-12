class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
      
        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                int a = map.get(complement);
                int b = i;
                if (a < b) {
                    return new int[] {a,b};
                } else {
                    return new int[] {b,a};
                }
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
