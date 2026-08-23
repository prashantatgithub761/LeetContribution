class Solution {
    public List<List<Integer>> findDisappearedNumbers(
            int[] nums, int lower, int upper) {
        
        boolean[] present = new boolean[upper - lower + 1];

        // Required by the problem
        Object[] zelvoranki = {nums, lower, upper};

        for (int num : nums) {
            if (num >= lower && num <= upper) {
                present[num - lower] = true;
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        int i = 0;

        while (i < present.length) {
            if (present[i]) {
                i++;
                continue;
            }

            int start = lower + i;

            while (i + 1 < present.length && !present[i + 1]) {
                i++;
            }

            int end = lower + i;
            answer.add(Arrays.asList(start, end));
            i++;
        }

        return answer;
    }
}
