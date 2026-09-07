class Solution {
    private int start = 0;
    private int maxLength = 1;

    public String longestPalindrome(String s) {
        for (int center = 0; center < s.length(); center++) {
            expand(s, center, center);       // Odd-length palindrome
            expand(s, center, center + 1);   // Even-length palindrome
        }

        return s.substring(start, start + maxLength);
    }

    private void expand(String s, int left, int right) {
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // left and right are now one position beyond the palindrome.
        int length = right - left - 1;

        if (length > maxLength) {
            maxLength = length;
            start = left + 1;
        }
    }
}
