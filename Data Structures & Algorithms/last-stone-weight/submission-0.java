class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
           maxHeap.offer(stone); 
        }
        int i = stones.length;
       
        while (i >= 2) {
            int poll1 = maxHeap.poll();  
            int poll2 = maxHeap.poll(); 
            i -= 2;          
            if (poll1 != poll2){
                int dif = Math.max(poll1, poll2) - Math.min(poll1, poll2);
                maxHeap.offer(dif);
                i+=1;
            }
        }
        return !maxHeap.isEmpty() ? maxHeap.peek() : 0;
    }
}
