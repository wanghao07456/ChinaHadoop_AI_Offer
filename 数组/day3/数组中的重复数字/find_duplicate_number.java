class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = 0;
        
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < 0 || nums[i] > nums.length - 1) {
                return 0;
            }
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplicate = nums[i];
                    return duplicate;
                }
                // swap nums[i] and nums[nums[i]]
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return duplicate;
    }
}