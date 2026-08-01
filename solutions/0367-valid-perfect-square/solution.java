class Solution {
    public boolean isPerfectSquare(int num) {
        int c = 0;
        if(num==1){
            return true;
        }
        
        long left = 0;
        long right = num;
        while(left<=right){
            long mid = left+(right-left)/2;
            long square = mid*mid;
            if(square == num){
                return true;
            }
            else if (square<num){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return false;
        
    }
}
