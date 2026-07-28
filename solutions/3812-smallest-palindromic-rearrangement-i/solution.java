class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = '\0';

        // Build left half and middle
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);

            // Add freq/2 copies to left
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append(ch);
            }

            // Save the middle character (if any)
            if (freq[i] % 2 == 1) {
                middle = ch;
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);

        if (middle != '\0') {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
