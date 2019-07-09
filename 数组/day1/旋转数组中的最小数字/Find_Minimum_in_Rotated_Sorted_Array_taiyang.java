class Solution {
    public int findMin(int[] nums) {
        if (nums.length  == 0 || nums == null) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = left;//排序数组的前面的0个元素搬到最后面，即排序数组本身，也是数组的一个旋转
        
        while (nums[right] <= nums[left]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            //如果下标为left, right和mid指向的三个数字相等，则只能顺序查找
            if (nums[left] == nums[right] && nums[mid] == nums[left]) {
                return minInOrder(nums, left, right);
            }
            if (nums[mid] >= nums[left]) {
                left = mid;
            }
            else if (nums[mid] <= nums[right]) {
                right = mid;
            }           
        }
        return nums[mid];
    }
    //顺序查找
    private int minInOrder(int[] nums, int left, int right) {
        int result = nums[left];
        for (int i = left; i < right - 1; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        return result;
    }
}