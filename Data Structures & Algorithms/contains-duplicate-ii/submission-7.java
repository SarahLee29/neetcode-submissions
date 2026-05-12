class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (set.contains(nums[right])) {
                return true;
            }
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            right++;
        }
        return false;
    }
}