class Solution {
    public int sumofDigit(int n){
        int sum = 0;
        
        while(n>0){
            int digit = n%10;
            n/=10;
            sum+=digit;
            
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i = 0;i<nums.length;i++){
            int sum = sumofDigit(nums[i]);

            if(sum==i){
                return i;
            }

        }
        return -1;
    }
}
