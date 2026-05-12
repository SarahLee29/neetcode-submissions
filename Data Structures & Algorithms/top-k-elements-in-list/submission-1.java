public class Solution {
    public int[] topKFrequent (int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int num : arr) {
            int count = 1;
            if (map.containsKey(num)) {
                count += map.get(num);
            }
            map.put(num,count);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        
     
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int[] entry_in_heap = new int[] {entry.getKey(), entry.getValue()};
            heap.offer(entry_in_heap);
        }
           
        int[] res = new int[k];
        
        for (int i = k-1; i >= 0; i--) {
            res[i] = heap.poll()[0];
        }
        
        return res;
    }

}
