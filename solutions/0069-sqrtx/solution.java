class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = 1L * mid * mid;

            if (square == x) {
                return mid;
            } 
            else if (square < x) {
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
