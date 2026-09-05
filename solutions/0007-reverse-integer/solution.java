class Solution {
    public int reverse(int x) {
        long temp = x;
        long ans = 0;
        
      if(x < 0){
            temp = Math.abs(x);
            
          while(temp>0){
            long digit=temp%10;
            temp/=10;
            ans = ans*10+digit;

          }
          ans = -ans;
        }
      else{
        while(x>0){
            int digit=x%10;
            x/=10;
            ans = ans*10+digit;

          }
        
      }
      if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;
    }
}
