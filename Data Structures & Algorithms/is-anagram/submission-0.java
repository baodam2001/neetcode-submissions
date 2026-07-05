// sorting solution
// package is already imported

class Solution {
    public boolean isAnagram(String s, String t) {
        // if they don't have the same length, return false
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);             // sort the current array, doesn't return anything
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}
