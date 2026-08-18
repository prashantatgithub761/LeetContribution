class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];

        for (int num : nums) {
            freq[num]++;
        }

        // Only one subarray: the entire array
        if (k == n) {
            int ans = -1;
            for (int num : nums) {
                ans = Math.max(ans, num);
            }
            return ans;
        }

        // Every single element is one subarray
        if (k == 1) {
            int ans = -1;
            for (int num : nums) {
                if (freq[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        // For 1 < k < n, only endpoints can appear in exactly one window
        int ans = -1;

        if (freq[nums[0]] == 1) {
            ans = nums[0];
        }
        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}
