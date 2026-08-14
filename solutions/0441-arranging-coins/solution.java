class Solution {
    public int arrangeCoins(int n) {
        int c = 0;
        int temp = n;


        for(int i = 1;i<=n/2+2;i++){
            temp=temp-i;
            if(temp>=0){
                c++;
            }
            else{
                return c;
            }
        }
        return 1;
        
    }
}
