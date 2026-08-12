class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add nums[right]
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // If window is invalid, shrink it
            while (freq.get(nums[right]) > k) {

                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }

            // Current window is valid
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
