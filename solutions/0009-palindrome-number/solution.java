class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //find rev
        int d = 0;
        int rev = 0;
        int dup = x;
        while(dup>0){
            d = dup%10;
            dup=dup/10;
            rev = rev*10+d;
        }
        if(rev==x){
            return true;
        }
        return false;
        
        
    }
}
