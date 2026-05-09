class Solution {
    public String largestOddNumber(String num) {
        // Scan from the end of the string to the beginning
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((num.charAt(i) - '0') % 2 != 0) {
                // Return the substring from the start to this odd digit
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}

