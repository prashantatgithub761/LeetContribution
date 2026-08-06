class Solution {
    public int productofdigits(int num){
        int product = 1;
        while(num>0){
            // extract the digit
            int digit = num%10;
            product *= digit;
            num/=10;

        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        for(int i = n;i<101;i++){
            int ans = productofdigits(i);
            if(ans%t==0){
                return i;
            }
        }
        return -1;
        
    }
}
