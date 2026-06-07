class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0; // Start by assuming the first element is the largest
        
        // Pass 1: Find the actual index of the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            // Skip checking the max number against itself
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1; // Condition failed, return -1
            }
        }

        return maxIndex;
        
        
    }
}
