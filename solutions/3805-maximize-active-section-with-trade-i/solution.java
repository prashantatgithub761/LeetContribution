class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();

        // augment with 1 on both ends
        String t = "1" + s + "1";

        ArrayList<Integer> len = new ArrayList<>();
        ArrayList<Character> type = new ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            char c = t.charAt(i);
            int j = i;
            while (j < t.length() && t.charAt(j) == c) {
                j++;
            }
            type.add(c);
            len.add(j - i);
            i = j;
        }

        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        int ans = totalOnes;

        // Every internal one segment has zero segments on both sides.
        for (int k = 1; k + 1 < type.size(); k++) {
            if (type.get(k) == '1'
                    && type.get(k - 1) == '0'
                    && type.get(k + 1) == '0') {

                int gain = len.get(k - 1) + len.get(k + 1);
                ans = Math.max(ans, totalOnes + gain);
            }
        }

        return ans;
    }
}
