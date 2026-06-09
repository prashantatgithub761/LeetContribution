class Solution {
    public int countPrimes(int n) {
        boolean[] composite = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!composite[i]) {
                count++;

                if ((long)i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        composite[j] = true;
                    }
                }
            }
        }

        return count;
    }
}
