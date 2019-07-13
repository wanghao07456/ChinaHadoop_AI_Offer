import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        int n = nums.length;
        String[] str = new String[n];
        StringBuilder sb = new StringBulider();
        //数组转化为字符串
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        }
        );
        for (int i = 0; i < n; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
}