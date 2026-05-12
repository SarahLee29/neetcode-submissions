class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num,0);
            }
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            list.add(new int[] {entry.getKey(), entry.getValue()});
        }

        list.sort((a, b)->(b[1]-a[1]));
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i)[0];
        }
        return res;     
    }
}
