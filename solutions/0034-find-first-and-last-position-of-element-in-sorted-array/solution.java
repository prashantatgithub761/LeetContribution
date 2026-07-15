class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (ans == -1) {
            return new int[]{-1, -1};
        }

        int first = ans;
        int last = ans;

        while (first > 0 && nums[first - 1] == target) {
            first--;
        }

        while (last < nums.length - 1 && nums[last + 1] == target) {
            last++;
        }

        return new int[]{first, last};
    }
}
