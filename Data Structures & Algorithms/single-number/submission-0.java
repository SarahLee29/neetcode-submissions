class Solution {
    public int singleNumber(int[] nums) {
        int res;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.contains(nums[i])) {
                map.add(nums[i]);
            } else {
                map.remove(nums[i]);
            }
        }
        res = map.iterator().next();
        return res;
    }
}
