class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {return 1;}
        if (nums.length == 0) {return 0;}

        Arrays.sort(nums);
        int[] gaps = new int[nums.length - 1];
        for (int i = 1; i <nums.length; i++) {
            gaps[i-1] = nums[i] - nums[i-1];
        }
        System.out.println("gaps = "+Arrays.toString(gaps));

        int counter = 1;
        int result = 0;
        for (int i = 0; i < gaps.length; i++) {
            if (gaps[i] == 1) {
                counter ++;
                result = Math.max(result,counter);
            } else if (gaps[i] == 0) {
                result = Math.max(result,counter);
                continue;
            } else {
                counter = 1;
                continue;
            }
        }

        return result;
    }
}
