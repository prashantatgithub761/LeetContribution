class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        int sum = 0;

        // k > 0
        if (k > 0) {

            // First window: next k elements
            for (int j = 1; j <= k; j++) {
                sum += code[j % n];
            }

            ans[0] = sum;

            // Slide forward
            for (int i = 1; i < n; i++) {

                // Remove outgoing
                sum -= code[i % n];

                // Add incoming
                sum += code[(i + k) % n];

                ans[i] = sum;
            }

        } 
        
        // k < 0
        else {

            k = -k;

            // First window: previous k elements
            for (int j = 1; j <= k; j++) {
                sum += code[(n - j) % n];
            }

            ans[0] = sum;

            // Slide backward
            for (int i = 1; i < n; i++) {

                // Remove outgoing
                sum -= code[(i - k - 1 + n) % n];

                // Add incoming
                sum += code[(i - 1 + n) % n];

                ans[i] = sum;
            }
        }

        return ans;
    }
}
