class Solution {
    public int findGCD(int[] nums) {
        // find largest and smallest
        int x = -1;
        int y = 99999;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>x){
                x = nums[i];
            }
            if(nums[i]<y){
                y=nums[i];
            }
        }   
        // now find the gcd of smallest and largest
        while(y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return x;
             
    }
}
