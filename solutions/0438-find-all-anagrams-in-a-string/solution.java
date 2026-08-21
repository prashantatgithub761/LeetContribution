import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Build frequency map for p and the first window of s
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (matches(pFreq, windowFreq)) {
            result.add(0);
        }

        // Slide the window through s
        for (int right = p.length(); right < s.length(); right++) {
            // Add the new character entering the window
            windowFreq[s.charAt(right) - 'a']++;

            // Remove the character leaving the window
            int left = right - p.length();
            windowFreq[s.charAt(left) - 'a']--;

            // If frequencies match, current window is an anagram
            if (matches(pFreq, windowFreq)) {
                result.add(left + 1);
            }
        }

        return result;
    }

    private boolean matches(int[] pFreq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
