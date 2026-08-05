class Solution {
    public int countDigits(int num) {
        int temp = num;
        int ans = 0;
        while(num>0){
            int digit = num%10;
            num/=10;
            if(temp%digit==0){
                ans++;
            }


        }
        return ans;
    }
}
