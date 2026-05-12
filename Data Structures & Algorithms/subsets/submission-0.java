class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfsSubset(0,nums,res,subset);
        return res;
    }
    private void dfsSubset(int i, int[] nums, List<List<Integer>> res, List<Integer> subset) {
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        dfsSubset(i+1,nums,res,subset);

        subset.add(nums[i]);
        dfsSubset(i+1,nums,res,subset);
        subset.remove(subset.size()-1);

    }
}
