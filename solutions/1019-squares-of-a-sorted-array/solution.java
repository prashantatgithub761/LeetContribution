class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[idx] = nums[left] * nums[left];
                left++;
            } else {
                ans[idx] = nums[right] * nums[right];
                right--;
            }
            idx--;
        }

        return ans;
    }
}
