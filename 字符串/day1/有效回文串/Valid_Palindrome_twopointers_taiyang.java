public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            
            while (left < s.length() && !isValid(s.charAt(left))) {
                left ++;
            }
            
            if (left == s.length()) {
                return true;
            }
            
            while (right >= 0 && !isValid(s.charAt(right))) {
                right --;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                break;
            } else {
                left ++;
                right --;
            }
        }
        return right <= left;
    }
    
    public boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}