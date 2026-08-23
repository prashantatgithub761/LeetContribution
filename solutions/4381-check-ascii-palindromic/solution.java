class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for (char ch : s.toCharArray()) {
            for (int bit = 7; bit >= 0; bit--) {
                binary.append((ch >> bit) & 1);
            }
        }

        int i = 0;
        int j = binary.length() - 1;

        while (i < j) {
            if (binary.charAt(i) != binary.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
