import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        boolean[] present = new boolean[101];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            present[num] = true;
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}
