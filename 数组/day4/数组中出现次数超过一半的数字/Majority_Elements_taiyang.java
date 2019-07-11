class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length  == 0 || nums == null) {
            return 0;
        }
        int current = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                current = nums[i];
                count += 1;
            } else {
                if (nums[i] == current) {
                    count += 1;
                } else {
                    count -= 1;
                }
            }
        }
        return current;        
    }
}