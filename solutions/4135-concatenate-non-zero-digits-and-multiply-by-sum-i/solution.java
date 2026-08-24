class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long place = 1;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            if (digit != 0) {
                x = digit * place + x; // keeps original digit order
                place *= 10;
                sum += digit;
            }
        }

        return x * sum;
    }
}
