class Solution {
    public String majorityFrequencyGroup(String s) {

        // Frequency of each character
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Count how many characters have each frequency
        // Max frequency can be s.length() (<=100)
        int[] freqCount = new int[101];

        for (int f : freq) {
            if (f > 0) {
                freqCount[f]++;
            }
        }

        // Find the winning frequency
        int winningFreq = 0;
        int maxGroupSize = 0;

        for (int f = 1; f <= 100; f++) {
            if (freqCount[f] > maxGroupSize ||
               (freqCount[f] == maxGroupSize && f > winningFreq)) {

                maxGroupSize = freqCount[f];
                winningFreq = f;
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] == winningFreq) {
                ans.append((char) ('a' + i));
            }
        }

        return ans.toString();
    }
}
