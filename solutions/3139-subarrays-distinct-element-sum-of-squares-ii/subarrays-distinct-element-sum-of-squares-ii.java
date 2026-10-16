import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final long MOD = 1_000_000_007L;

    private long[] tree;
    private long[] lazy;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        tree = new long[4 * n];
        lazy = new long[4 * n];

        Map<Integer, Integer> lastSeen = new HashMap<>();

        long current = 0;
        long answer = 0;

        for (int r = 0; r < n; r++) {
            int previous = lastSeen.getOrDefault(nums[r], -1);
            int left = previous + 1;

            // Old distinct counts ka sum, then range mein +1.
            long oldSum = queryAndIncrement(
                1, 0, n - 1, left, r
            );

            long count = r - previous;

            current = (current + 2 * oldSum + count) % MOD;
            answer = (answer + current) % MOD;

            lastSeen.put(nums[r], r);
        }

        return (int) answer;
    }

    private long queryAndIncrement(
        int node, int start, int end, int left, int right
    ) {
        if (right < start || end < left) {
            return 0;
        }

        if (left <= start && end <= right) {
            long oldSum = tree[node];

            tree[node] += end - start + 1L;
            lazy[node]++;

            return oldSum;
        }

        int mid = start + (end - start) / 2;
        push(node, start, mid, end);

        long oldSum =
            queryAndIncrement(
                node * 2, start, mid, left, right
            )
            + queryAndIncrement(
                node * 2 + 1, mid + 1, end, left, right
            );

        tree[node] = tree[node * 2] + tree[node * 2 + 1];

        return oldSum;
    }

    private void push(int node, int start, int mid, int end) {
        long pending = lazy[node];

        if (pending == 0) {
            return;
        }

        tree[node * 2] += pending * (mid - start + 1L);
        tree[node * 2 + 1] += pending * (end - mid);

        lazy[node * 2] += pending;
        lazy[node * 2 + 1] += pending;

        lazy[node] = 0;
    }
}