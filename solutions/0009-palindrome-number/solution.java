class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(temp>0){
            int lastDigit = temp%10;
            rev=rev*10+lastDigit;
            temp = temp/10;

        }
        return x==rev;
    }
}
