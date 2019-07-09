class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;//边界判断
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int first = i + 1, second = nums.length-1;
            int target = -nums[i];
            twoSum(nums,first,second,target,result);
        }
        return result;
    } 
    public void twoSum(int[] nums, int first, int second, int target, List<List<Integer>> result) {
        while (first < second) {
            if (nums[first] + nums[second] == target) {
                ArrayList<Integer> triple = new ArrayList<>();
                triple.add(-target);//因为定义的就是target，所以此处不能用nums[i]，传不进来
                triple.add(nums[first]);
                triple.add(nums[second]);
                result.add(triple);
                first++;
                second--;
                //去重
                while (first < second && nums[first] == nums[first - 1]) {
                    first++;
                }
                while (first < second && nums[second] == nums[second + 1]) {
                    second--;
                }
            } else if (nums[first] + nums[second] < target) {
                first++;
            } else {
                second--;
            }
        }
    }
}