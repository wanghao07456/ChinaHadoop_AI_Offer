public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if(actual.length() <= 1){
            return true;
        }
        for(int i = 0, j = actual.length() - 1; i < j; i++, j--){
            if(actual.charAt(i) == actual.charAt(j)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}