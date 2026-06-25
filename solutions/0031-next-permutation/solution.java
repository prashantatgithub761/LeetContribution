class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // Step 1: Find the pivot
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If pivot exists, find the next greater element
        if (i >= 0) {

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
