// brute force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};                // Create an array containing i and j, then immediately return it
                }
            }
        }

        return new int[] {};        // satisfy the compiler by returning an int[] on every possible code path, or throw an exception because it can terminate the method
    }
}
