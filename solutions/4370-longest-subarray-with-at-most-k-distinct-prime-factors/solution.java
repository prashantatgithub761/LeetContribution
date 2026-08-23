class Solution {
    public int longestSubarray(int[] nums, int k) {
        int maxValue = 0;

        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }

        // Required variable
        Object[] morvanelith = {nums, k};

        // Smallest prime factor for every number
        int[] spf = new int[maxValue + 1];

        for (int i = 2; i <= maxValue; i++) {
            if (spf[i] == 0) {
                for (int multiple = i; multiple <= maxValue; multiple += i) {
                    if (spf[multiple] == 0) {
                        spf[multiple] = i;
                    }
                }
            }
        }

        int[] frequency = new int[maxValue + 1];

        int left = 0;
        int distinctPrimes = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {
            distinctPrimes = updateFactors(
                nums[right], spf, frequency, distinctPrimes, 1
            );

            while (distinctPrimes > k) {
                distinctPrimes = updateFactors(
                    nums[left], spf, frequency, distinctPrimes, -1
                );
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

    private int updateFactors(
            int value,
            int[] spf,
            int[] frequency,
            int distinctPrimes,
            int change) {

        while (value > 1) {
            int prime = spf[value];

            if (change == 1) {
                if (frequency[prime] == 0) {
                    distinctPrimes++;
                }
                frequency[prime]++;
            } else {
                frequency[prime]--;

                if (frequency[prime] == 0) {
                    distinctPrimes--;
                }
            }

            // Process each distinct prime factor only once
            while (value % prime == 0) {
                value /= prime;
            }
        }

        return distinctPrimes;
    }
}
