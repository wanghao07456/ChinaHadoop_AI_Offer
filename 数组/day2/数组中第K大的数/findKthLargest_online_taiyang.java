class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (k <= 0 || nums.length == 0 || nums == null) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}