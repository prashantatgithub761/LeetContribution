class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            count += frequency.getOrDefault(prefixSum - k, 0);

            frequency.put(
                prefixSum,
                frequency.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }
}
