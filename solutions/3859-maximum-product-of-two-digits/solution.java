
class Solution {
    public int maxProduct(int n) {
        int[] map = new int[10];
        while (n > 0) {
            map[n%10]++;
            n /= 10;
        }
        int res = 1;
        int cnt = 0;
        for (int i = 9; i >= 0; i--) {
            if (map[i] >= 2 && cnt == 0) {
                return i * i;
            } else if (map[i] > 0) {
                res *= i;
                cnt++;
            }
            if (cnt == 2) {
                break;
            }
        }
        return res;
    }
}
