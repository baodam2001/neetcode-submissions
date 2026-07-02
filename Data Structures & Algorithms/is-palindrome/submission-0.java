class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {                                 // ensures there are still two characters left to compare
            while (l < r && !alphaNum(s.charAt(l))) {   // Move l forward until it points to an alphanumeric character
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {   // Move r backward until it points to an alphanumeric character
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;       // after l = r, move forward
        }

        return true;        // if no mismatch, return true, which means the word "s" is palindrome
    }

    // helper method to check if the character is an alphanumeric or not
    public boolean alphaNum(char c) {
        return ( c >= 'A' && c <= 'Z' ||
                 c >= 'a' && c <= 'z' ||
                 c >= '0' && c <= '9');
    }
}
